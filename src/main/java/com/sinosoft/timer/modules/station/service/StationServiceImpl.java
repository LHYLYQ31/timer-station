/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.timer.modules.station.service;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import com.sinosoft.interfaces.station.service.StationProvider;

/**
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * 
 * @author 中科软科技 lihaiyi
 * @since 2018年8月9日
 */
@Service
@EnableAutoConfiguration //此注释自动载入应用程序所需的所有Bean
public class StationServiceImpl implements StationService {
    @Resource
    StationProvider stationProvider;
}
