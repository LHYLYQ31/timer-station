/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.timer.modules.epaconsume.service;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import com.sinosoft.interfaces.carinfo.service.CarInfoProvider;

/**
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * 
 * @author 中科软科技 lihaiyi
 * @since 2018年8月6日
 */
@Service
@EnableAutoConfiguration //此注释自动载入应用程序所需的所有Bean
public class EAPServiceImpl implements EAPService {
    @Resource
    CarInfoProvider carInfoProvider;

    /**
     * <B>方法名称：list</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see com.sinosoft.timer.modules.epaconsume.service.EAPService#list(java.lang.Long)
     */
    public Object list(Long time) {
        return carInfoProvider.list(time);
    }

}
