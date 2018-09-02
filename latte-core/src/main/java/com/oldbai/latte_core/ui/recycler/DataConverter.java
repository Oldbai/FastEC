package com.oldbai.latte_core.ui.recycler;

import java.util.ArrayList;

public abstract class DataConverter {

    protected final ArrayList<MultipleItemEntity> ENTITIES = new ArrayList<>();
    private String mJsonData = null;

    public abstract ArrayList<MultipleItemEntity> convert();

    public DataConverter setJsonData(String json) {
        mJsonData = json;
        return this;
    }

    protected String getJsonData(){
        if (mJsonData==null||mJsonData.isEmpty()){
            throw new NullPointerException("DATA IS NULL!");
        }
        return mJsonData;
    }

}
