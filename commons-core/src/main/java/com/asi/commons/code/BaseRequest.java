package com.asi.commons.code;

import java.io.Serializable;

/**
 * @author lw
 * @date 2022-11-16 0:02
 */
public class BaseRequest implements Serializable {

    private String tenantId;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
