package com.cetc28.data.service.forkjoin;

import com.cetc28.data.constant.Constant;
import com.cetc28.data.service.convertservice.BaseConvertService;

import java.util.List;
import java.util.concurrent.RecursiveAction;

/**
 * @author wq
 */
public class ForkConvertByIds extends RecursiveAction {
    private List<String> ids;
    private BaseConvertService convertService;

    public ForkConvertByIds(List<String> ids, BaseConvertService convertService) {
        this.ids = ids;
        this.convertService = convertService;
    }

    @Override
    public void compute() {
        if (ids.size() > Constant.SQL_MAX_SIZE) {
            int mid = ids.size() / 2;
            List<String> ids1 = ids.subList(0, mid);
            List<String> ids2 = ids.subList(mid, ids.size());
            ForkConvertByIds task1 = new ForkConvertByIds(ids1, convertService);
            ForkConvertByIds task2 = new ForkConvertByIds(ids2, convertService);
            invokeAll(task1,task2);
        } else {
            convertService.convertByIds(ids);
        }
    }
}