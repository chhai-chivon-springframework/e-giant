package com.giant.egiant.utils;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by chhai.chivon  on 11/29/17.
 */
public class DateUtil implements Serializable {

    private static final Date  DATE_TODAY =  new Date();

    public static final Date getDateToday(){
        return DATE_TODAY;
    }


    public static final Date getWeek(Date date){
        return date;
    }

    public static final Date getMonth(Date  date){

        return date;
    }

    public static final Date getYear(Date date){
        return date;
    }
}
