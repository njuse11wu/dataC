package com.cetc28.data.service.convertservice;

import com.cetc28.data.annotations.ConvertService;
import com.cetc28.data.constant.Constant;
import com.cetc28.data.dao.*;
import com.cetc28.data.pojo.*;
import com.cetc28.data.service.DictionaryService;
import com.cetc28.data.util.MakeListToMap;
import com.cetc28.data.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.domain.Specification;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author wq
 */
@Slf4j
@ConvertService
public class PersonConvertService extends BaseConvertService {

    @Resource
    private PersonBasicRepository personBasicRepository;
    @Resource
    private PersonDutyRepository personDutyRepository;
    @Resource
    private PersonExportRepository personExportRepository;
    @Resource
    private PersonHonorRepository personHonorRepository;
    @Resource
    private PersonGslMapRepository personGslMapRepository;
    @Resource
    private OrgBasicRepository orgBasicRepository;
    @Resource
    private DictionaryService dictionaryService;
    @Value("${convertService.initialization}")
    private Boolean initialization;

    private Map<String, String> convertDuty(List<TPersonDuty> duties) {
        Map<String, String> res = new HashMap<>(16);
        if (duties == null || duties.size() == 0) {
            return res;
        }
        StringBuilder gslZw = new StringBuilder();
        StringBuilder rdZw = new StringBuilder();
        StringBuilder zfZw = new StringBuilder();
        StringBuilder zxZw = new StringBuilder();
        StringBuilder shZw = new StringBuilder();
        StringBuilder companyZw = new StringBuilder();
        StringBuilder otherZw = new StringBuilder();
        for (TPersonDuty duty : duties) {
            String sszwlb = duty.getSszwlb();
            if (StringUtil.isBlank(sszwlb)) {
                continue;
            }
            String sfzz = StringUtil.equals("0", duty.getSfzz()) ? "是" : "否";
            String zzid = duty.getZzjgbm();
            String zzmc = duty.getZzjgmc();
            String qhbm = duty.getXzqhbm();
            String qhmc = duty.getXzqhmc();
            String zwmc = duty.getZwmc();
            String zwbm = duty.getZwbm();
            Long jb = duty.getJb();
            if (!StringUtil.isBlank(zzid) && StringUtil.isBlank(zzmc)) {
                zzmc = orgBasicRepository.getMcByZzid(zzid);
            }
            switch (sszwlb) {
                case Constant.GSL_DUTY:
                    gslZw.append(zzmc).append("第").append(null != duty.getJb() ? duty.getJb() : "0").append("界");
                    if (!StringUtil.isBlank(zwbm) && StringUtil.isBlank(zwmc)) {
                        zwmc = dictionaryService.getDictionName("GSLZW", duty.getZwbm());
                    }
                    gslZw.append(zwmc).append(";");
                    gslZw.append("是否在职：").append(sfzz).append(";");
                    break;
                case Constant.RD_DUTY:
                    rdZw.append(qhmc).append("第").append(null != jb ? jb : "0").append("界");
                    if (!StringUtil.isBlank(zwbm) && StringUtil.isBlank(zwmc)) {
                        zwmc = dictionaryService.getDictionName("RDZW", zwbm);
                    }
                    rdZw.append(zwmc);
                    rdZw.append((null != qhmc ? qhmc : "无"));
                    rdZw.append("是否在职：").append(sfzz).append(";");
                    break;
                case Constant.ZF_DUTY:
                    zfZw.append(qhmc).append("第").append(null != jb ? jb : "0").append("界");
                    if (!StringUtil.isBlank(zwbm) && StringUtil.isBlank(zwmc)) {
                        zwmc = dictionaryService.getDictionName("ZFZW", zwbm);
                    }
                    zfZw.append(zwmc);
                    zfZw.append((null != qhmc ? qhmc : "无"));
                    zfZw.append("是否在职：").append(sfzz).append(";");
                    break;
                case Constant.ZX_DUTY:
                    zxZw.append(qhmc).append("第").append(null != jb ? jb : "0").append("界");
                    if (!StringUtil.isBlank(zwbm) && StringUtil.isBlank(zwmc)) {
                        zwmc = dictionaryService.getDictionName("ZXZW", zwbm);
                    }
                    zxZw.append(zwmc);
                    zxZw.append((null != qhmc ? qhmc : "无"));
                    zxZw.append("是否在职：").append(sfzz).append(";");
                    break;
                case Constant.GSLSSSH_DUTY:
                    shZw.append(zzmc).append("第").append(null != duty.getJb() ? duty.getJb() : "0").append("界");
                    if (!StringUtil.isBlank(zwbm) && StringUtil.isBlank(zwmc)) {
                        zwmc = dictionaryService.getDictionName("SHZWLX", duty.getZwbm());
                    }
                    shZw.append(zwmc).append(";");
                    shZw.append("是否在职：").append(sfzz).append(";");
                    break;
                case Constant.QY_DUTY:
                    companyZw.append("企业名称：").append(qhmc);
                    if (null != qhbm) {
                        companyZw.append(",部门：").append(qhbm);
                    }
                    if (null != zwmc) {
                        companyZw.append(",职务名称：").append(zwmc).append(";");
                    }
                    break;
                case Constant.QT_DUTY:
                    otherZw.append("企业名称：").append(qhmc);
                    if (null != qhbm) {
                        otherZw.append(",部门：").append(qhbm);
                    }
                    if (null != zwmc) {
                        otherZw.append(",职务名称：").append(zwmc).append(";");
                    }
                    break;
                default:
                    break;
            }
        }
        res.put("gslZw", gslZw.toString());
        res.put("rdZw", rdZw.toString());
        res.put("zfZw", zfZw.toString());
        res.put("zxZw", zxZw.toString());
        res.put("shZw", shZw.toString());
        res.put("companyZw", companyZw.toString());
        res.put("otherZw", otherZw.toString());
        return res;
    }

    @Override
    public void convertByIds(List<String> ryids) {
        //根据id查询所有需要导出的信息并组合成对象导入新表
        //根据人员id的集合查询duties ；根据人员id的集合查询gslMap ；根据人员id的集合查询honors
        Specification<TPersonDuty> dutySp = (Specification<TPersonDuty>) (root, query, criteriaBuilder) -> {
            query.where(root.get("ryid").in(ryids));
            return query.getRestriction();
        };
        Specification<TPersonHonour> honorSp = (Specification<TPersonHonour>) (root, query, criteriaBuilder) -> {
            query.where(root.get("ryid").in(ryids));
            return query.getRestriction();
        };
        Specification<TPersonGslMap> gslMapSp = (Specification<TPersonGslMap>) (root, query, criteriaBuilder) -> {
            query.where(root.get("ryid").in(ryids));
            return query.getRestriction();
        };
        List<TPersonBasicInfo> personBasicInfos = new ArrayList<>(personBasicRepository.findAllById(ryids));
        List<TPersonDuty> duties = new ArrayList<>(personDutyRepository.findAll(dutySp));
        List<TPersonHonour> honours = new ArrayList<>(personHonorRepository.findAll(honorSp));
        List<TPersonGslMap> gslMaps = new ArrayList<>(personGslMapRepository.findAll(gslMapSp));

        Map<String, List<TPersonDuty>> idDuties = MakeListToMap.convertToMap("ryid", duties);
        Map<String, List<TPersonBasicInfo>> basicInfos = MakeListToMap.convertToMap("ryid", personBasicInfos);
        Map<String, List<TPersonHonour>> idHonors = MakeListToMap.convertToMap("ryid", honours);
        Map<String, List<TPersonGslMap>> idgslMaps = MakeListToMap.convertToMap("ryid", gslMaps);
        ArrayList<TPersonExport> personExports = new ArrayList<>();
        for (String ryid : ryids) {
            TPersonExport export = new TPersonExport();
            List<TPersonDuty> pDuties = idDuties.get(ryid);
            TPersonBasicInfo pBasicInfo = basicInfos.get(ryid).get(0);
            List<TPersonHonour> pHonors = idHonors.get(ryid);
            List<TPersonGslMap> pGslMaps = idgslMaps.get(ryid);
            StringBuilder zzmc = new StringBuilder();
            for (TPersonGslMap gslMap : pGslMaps) {
                if (StringUtil.isBlank(gslMap.getZzmc())) {
                    zzmc.append(orgBasicRepository.getMcByZzid(gslMap.getZzid()));
                } else {
                    zzmc.append(gslMap.getZzmc());
                }
                zzmc.append("、");
            }
            Map<String, String> res = convertDuty(pDuties);
            zzmc.deleteCharAt(zzmc.length() - 1);
            export.setRyid(ryid).setXm(pBasicInfo.getXm()).setZzmc(zzmc.toString()).setRyfl(dictionaryService.getDictionName(Constant.RYFLTYPECODE, pBasicInfo.getRyfl()))
                    .setXb(dictionaryService.getDictionName(Constant.SexTypeCode, pBasicInfo.getXb()))
                    .setCsrq(pBasicInfo.getCsrq() == null ? null : pBasicInfo.getCsrq().toString()).setMz(dictionaryService.getDictionName(Constant.MZ, pBasicInfo.getMz()))
                    .setZjlx(dictionaryService.getDictionName(Constant.ZJLX, pBasicInfo.getZjlx())).setZjhm(pBasicInfo.getZjhm())
                    .setCsd(pBasicInfo.getCsd()).setCym(pBasicInfo.getCym()).setZzmm(dictionaryService.getDictionName(Constant.ZZMMTYPECODE, pBasicInfo.getZzmm()))
                    .setXl(dictionaryService.getDictionName(Constant.XLTYPECODE, pBasicInfo.getXl())).setLxdh(pBasicInfo.getLxdh()).setTxdz(pBasicInfo.getTxdz())
                    .setZj(pBasicInfo.getZj()).setYb(pBasicInfo.getYb()).setYx(pBasicInfo.getYx()).setQq(pBasicInfo.getQq())
                    .setWx(pBasicInfo.getWx()).setGslzwl(res.get("gslZw")).setRdzwl(res.get("rdZw")).setZfzwl(res.get("gslZw"))
                    .setZxzwl(res.get("gslZw")).setQtzwl(res.get("qtZw")).setQyzwl(res.get("companyZw")).setGrzyry(convertHonor());
            personExports.add(export);
        }
        personExportRepository.saveAll(personExports);
    }

    private String convertHonor(){
        return "";
    }
    @Override
    public List<String> getIds() {
        if (initialization) {
            return personBasicRepository.findAllId();
        }
        return personBasicRepository.findUpdateRyid(new Date());
    }
}
