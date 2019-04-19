package com.cetc28.data.dao;

import java.util.List;

/**
 * @author wq
 */
public interface ICountDown {
    List<String> getIds(Integer start,Integer end);
    int getIdCount();
}
