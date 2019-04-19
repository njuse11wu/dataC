package com.cetc28.data;

import com.cetc28.data.service.BootStrap;
import com.cetc28.data.service.TestService;
import com.cetc28.data.service.convertservice.BaseConvertService;
import com.cetc28.data.service.convertservice.PersonConvertService;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author wq
 */
@SpringBootApplication
@EnableScheduling
@EnableCaching
public class DataApplication implements CommandLineRunner, ApplicationContextAware {

    private ApplicationContext app;

    public static void main(String[] args) {
        SpringApplication.run(DataApplication.class, args);
    }

    @Scheduled(cron = "0 0 1 * * ?")
    public void start() {
        BootStrap.start();
    }


    @Override
    public void run(String... args) {
        BaseConvertService service = (PersonConvertService) app.getBean("personConvertService");
        service.convert();

//        TestService service = (TestService) app.getBean("testService");
//        service.getPersonTest();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        app = applicationContext;
    }
}
