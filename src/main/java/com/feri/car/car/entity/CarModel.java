package com.feri.car.car.entity;

import java.math.BigDecimal;

public class CarModel {
    private Integer id;

    private Integer brandId;

    private String name;

    private String displayName;

    private String englishName;

    private String bodyFormName;

    private BigDecimal priceLow;

    private BigDecimal priceHigh;

    private Integer level;

    private String levelName;

    private Integer levelSecond;

    private String levelSecondName;

    private Byte saleStatus;

    private String allSpell;

    private Integer createTime;

    private Integer updateTime;

    private Integer syncTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getBodyFormName() {
        return bodyFormName;
    }

    public void setBodyFormName(String bodyFormName) {
        this.bodyFormName = bodyFormName == null ? null : bodyFormName.trim();
    }

    public BigDecimal getPriceLow() {
        return priceLow;
    }

    public void setPriceLow(BigDecimal priceLow) {
        this.priceLow = priceLow;
    }

    public BigDecimal getPriceHigh() {
        return priceHigh;
    }

    public void setPriceHigh(BigDecimal priceHigh) {
        this.priceHigh = priceHigh;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public Integer getLevelSecond() {
        return levelSecond;
    }

    public void setLevelSecond(Integer levelSecond) {
        this.levelSecond = levelSecond;
    }

    public String getLevelSecondName() {
        return levelSecondName;
    }

    public void setLevelSecondName(String levelSecondName) {
        this.levelSecondName = levelSecondName == null ? null : levelSecondName.trim();
    }

    public Byte getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Byte saleStatus) {
        this.saleStatus = saleStatus;
    }

    public String getAllSpell() {
        return allSpell;
    }

    public void setAllSpell(String allSpell) {
        this.allSpell = allSpell == null ? null : allSpell.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Integer syncTime) {
        this.syncTime = syncTime;
    }
}