package com.ruoyi.system.domain;

import java.time.LocalDateTime;

public class StockCollect {
    private Long id;
    private String tsCode;

    private LocalDateTime createDate; // 新增字段

    private String isDeleted; // 新增字段

    private String isPct10One; // 新增字段

    private String flag;

    private int sortOrder;

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getIsPct10One() {
        return isDeleted;
    }

    public void setIsPct10One(String isPct10One) {
        this.isPct10One = isPct10One;
    }

    // Getters and Setters
    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTsCode() {
        return tsCode;
    }

    public void setTsCode(String tsCode) {
        this.tsCode = tsCode;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}