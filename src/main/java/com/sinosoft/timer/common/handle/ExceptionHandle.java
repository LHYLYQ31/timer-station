/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.timer.common.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinosoft.timer.common.result.Result;
import com.sinosoft.timer.common.utils.ResultUtil;

/**
 * <B>系统名称：ums</B><BR>
 * <B>模块名称：统一日志处理</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * 
 * @author 中科软科技 lihaiyi
 * @since 2018年7月10日
 */
@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    /**
     * 
     * <B>方法名称：handle</B><BR>
     * <B>概要说明：统一处理异常</B><BR>
     *
     * @author：lihaiyi
     * @cretetime:2018年7月10日 上午10:23:23
     * @param e
     * @return Result
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        logger.error("【系统异常】 {}", e);
        return ResultUtil.error(-1, "未知错误");
    }

}
