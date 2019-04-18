package com.cetc28.data.dao;

import java.util.List;

/**
 * @author wq
 */
public interface ICountDown<T> {
    List<T> getIds(Integer start,Integer end);
    Integer count();
}
