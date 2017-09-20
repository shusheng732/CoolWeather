package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by shusheng732 on 2017/9/20.
 */

public class Country extends DataSupport {

    private int id;

    private String cityName;

    private String weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
