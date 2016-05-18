package com.ama.config;

import com.ama.benchmark.DozerMapping;
import com.ama.service.ManualMemberMapper;
import com.ama.service.OrikaMemberMapper;
import com.ama.service.SelmaMemberMapper;
import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by emrah.pekesen on 10.05.2016.
 */
@Configuration
public class AppConfig {

    @Bean
    public DozerBeanMapper dozerMapper(){
        return new DozerBeanMapper();
    }

    @Bean
    public ManualMemberMapper manualMemberMapper(){
        return new ManualMemberMapper();
    }

    @Bean
    public OrikaMemberMapper orikaMemberMapper(){ return new OrikaMemberMapper();}

    @Bean
    public SelmaMemberMapper selmaMemberMapper(){ return new SelmaMemberMapper();}

}
