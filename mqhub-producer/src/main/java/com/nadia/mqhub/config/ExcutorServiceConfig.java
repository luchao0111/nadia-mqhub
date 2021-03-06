package com.nadia.mqhub.config;

import com.nadia.mqhub.common.utils.ThreadFactoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author xiang.shi
 * @date 2020/4/3 2:35 下午
 */
@Configuration
public class ExcutorServiceConfig {

    @Bean("workQueueExecutor")
    public ExecutorService getWorkQueueExecutor() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                5,
                5,
                300, TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(2000),
                new ThreadFactoryImpl("workQueueExecutor"),
                new ThreadPoolExecutor.AbortPolicy()
        );
        return executor;
    }

}
