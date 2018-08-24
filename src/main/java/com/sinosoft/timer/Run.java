/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * <B>系统名称：epa-provider</B><BR>
 * <B>模块名称：程序的主入口</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * 
 * @author 中科软科技 lihaiyi
 * @since 2018年7月10日
 */
@SpringBootApplication
@ImportResource(value = { "classpath:dubbo/consumer.xml" })
public class Run {
    private final static Logger logger = LoggerFactory.getLogger(Run.class);

    public static void main(String[] args) {
        logger.info("logms:{}", " welcome timer-task System");
        SpringApplication.run(Run.class, args);

    }

}
