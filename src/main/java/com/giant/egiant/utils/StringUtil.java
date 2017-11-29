package com.giant.egiant.utils;

import java.io.Serializable;

/**
 * @author by chhai.chivon  on 11/29/17.
 */
public class StringUtil implements Serializable{

    static final String STRING_DEFAIL_VALUE = "";

    public static String  getStringDefailValue(String string){
        if(string != "" &&  !string.isEmpty()){
            return string;
        }
        return STRING_DEFAIL_VALUE;
    }

}
