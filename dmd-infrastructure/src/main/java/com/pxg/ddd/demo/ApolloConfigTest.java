package com.pxg.ddd.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ApolloConfigTest {

    @Value("${testChangeValue}")
    private String testContent;

    /**
     * patten:
     *     *      *      *      *      *      ?
     *     Second Minute Hour   Day    Month  Weekday
     *
     * interval t, written by add end with: /t
     */
    @Scheduled(cron = "*/15 * * * * ?")
    public void print(){
        System.out.println(testContent);
    }

}
