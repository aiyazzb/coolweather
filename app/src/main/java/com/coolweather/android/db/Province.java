package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String provinceMane;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceMane() {
        return provinceMane;
    }

    public void setProvinceMane(String provinceMane) {
        this.provinceMane = provinceMane;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
