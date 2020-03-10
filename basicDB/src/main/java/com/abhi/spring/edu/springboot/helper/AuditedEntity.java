package com.abhi.spring.edu.springboot.helper;

import javax.persistence.Column;

public abstract class AuditedEntity {

    @Column(name = "CREATE_TS", updatable = false)
    private long createTs;
    @Column(name = "MODIFY_TS")
    private long modifyTs;
    @Column(name = "CREATED_BY", updatable = false)
    private String createdBy;
    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    public long getCreateTs() {
        return createTs;
    }

    public void setCreateTs(long createTs) {
        this.createTs = createTs;
    }

    public long getModifyTs() {
        return modifyTs;
    }

    public void setModifyTs(long modifyTs) {
        this.modifyTs = modifyTs;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

}

