/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.timer.modules.epaconsume.service;

/**
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * 
 * @author 中科软科技 lihaiyi
 * @since 2018年8月6日
 */
public interface EAPService {
    /**
     * 
     * <B>方法名称：list</B><BR>
     * <B>概要说明：查询eap 数据库中的在某个时间前10分钟的数据</B><BR>
     *
     * @author：lihaiyi
     * @cretetime:2018年8月6日 下午5:20:24
     * @param time
     * @return Object
     */
    Object list(Long time);

}
