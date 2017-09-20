package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by shusheng732 on 2017/9/20.
 */

public class Province extends DataSupport {

    private int i;

    private String provinceName;

    private int provinceCode;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
