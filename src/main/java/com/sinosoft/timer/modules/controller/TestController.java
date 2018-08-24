/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.timer.modules.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinosoft.interfaces.carinfo.service.CarInfoProvider;

/**
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * 
 * @author 中科软科技 lihaiyi
 * @since 2018年8月7日
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    CarInfoProvider carInfoProvider;

    @RequestMapping("test")
    public String test() {
        Long time = System.currentTimeMillis();
        System.out.println("执行定时任务======****" + time + "**===============");
        Object obj = carInfoProvider.list(time);
        return obj.toString();
    }

}
