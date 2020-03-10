package com.abhi.spring.edu.springboot.helper;

import java.io.Serializable;

public class CompositeKey implements Serializable {

    private String uuid;
    private String tenantId;

    public CompositeKey() {
    }

    public CompositeKey(String uuid) {
        this.uuid = uuid;
    }

    public CompositeKey(String uuid, String tenantId) {
        this.uuid = uuid;
        this.tenantId = tenantId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}

