package com.briup.apps.pul.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.briup.apps.pul.dao")
public class MybatisConfig {

}
