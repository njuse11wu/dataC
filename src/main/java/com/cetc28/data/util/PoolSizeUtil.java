package com.cetc28.data.util;

/**
 * @author wq
 */
public class PoolSizeUtil {
    /**
     * @param blockingCoefficient 阻塞系数
     * @return 线程数
     */
    public static int getPoolSize(Double blockingCoefficient) {
        int numberOfCores = Runtime.getRuntime().availableProcessors();
        return (int) (numberOfCores / (1 - blockingCoefficient));
    }
}
