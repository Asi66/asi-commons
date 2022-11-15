package com.asi.commons.code;

/**
 * @author lw
 * @date 2022-11-16 0:02
 */
public interface BusinessErrorCodeType {

    /**
     * 获取异常code
     * @return java.lang.String
     */
    String getCode();

    /**
     * 获取异常信息
     * @return java.lang.String
     */
    String getMessage();


}
