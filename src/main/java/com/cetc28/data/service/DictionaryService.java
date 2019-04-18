package com.cetc28.data.service;

import com.cetc28.data.dao.DDictionaryRepository;
import com.cetc28.data.util.StringUtil;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wq
 */
@Service
public class DictionaryService {

    @Resource
    private DDictionaryRepository dDictionaryRepository;

    @Cacheable(value = "dictCache", key = "'getNameByTypeCodeAndCode'+#typeCode+#code")
    public String getDictionName(String typeCode, String code) {
        if (StringUtil.isBlank(code)) {
            return null;
        }
        return dDictionaryRepository.getNameByTypeCodeAndCode(typeCode, code);
    }
}
