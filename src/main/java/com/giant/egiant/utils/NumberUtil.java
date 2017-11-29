package com.giant.egiant.utils;

import java.io.Serializable;

/**
 * @author by chhai.chivon  on 11/29/17.
 */
public class NumberUtil implements Serializable{

    static final int  INT_DEFAULT_VALUE = 0;

    public static int getIntDefaultValue(int i){
        if(i != 0){
            return  i;
        }
        return INT_DEFAULT_VALUE;
    }
}
