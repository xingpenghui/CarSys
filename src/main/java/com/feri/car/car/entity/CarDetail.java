package com.feri.car.car.entity;

import java.util.Date;

public class CarDetail {
    private Integer id;

    private Integer cid;

    private Float cc;

    private String gear;

    private String oil;

    private Float speed;

    private Date ctime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Float getCc() {
        return cc;
    }

    public void setCc(Float cc) {
        this.cc = cc;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear == null ? null : gear.trim();
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil == null ? null : oil.trim();
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}