package com.asi.commons.exception;

import com.asi.commons.code.BusinessErrorCode;

import java.util.Objects;

/**
 * @author lw
 * @date 2022-11-16 0:02
 */
@Data
public class BusinessException {
    private String code;

    public BusinessException() {
        this.code = BusinessErrorCode.ERROR.getCode();
    }

    public BusinessException(String code) {
        this.code = code;
    }

    public BusinessException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public BusinessException(Throwable cause) {
        super(cause);
        this.code = BusinessErrorCode.ERROR.getCode();
    }

    public BusinessException(String code, Throwable cause) {
        super(cause);
        this.code = code;
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = BusinessErrorCode.ERROR.getCode();
    }

    public BusinessException(String code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    public BusinessException(BusinessErrorCode error) {
        super(error.getMessage());
        this.code = error.getCode();
    }

    public BusinessException(BusinessErrorCodeType errorCodeType) {
        super(errorCodeType.getMessage());
        this.code = errorCodeType.getCode();
    }

    public static BusinessException convertResp(Response response, BusinessErrorCode defaultCode) {
        if (Objects.isNull(response)) {
            return new BusinessException(defaultCode);
        }
        return new BusinessException(response.getCode(), response.getMessage());
    }
}
