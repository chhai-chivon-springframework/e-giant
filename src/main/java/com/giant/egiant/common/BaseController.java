package com.giant.egiant.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by chhai.chivon  on 11/29/17.
 */
public class BaseController<T> {
    public static final String MESSAGE_SUCCESS = "SUCCESS";
    public static final String MESSAGE_FAILURE = "FAIL";
    private Map<String, Object> map = new HashMap<>();

    private Map<String,Object> response(HttpStatus status, String message) {
        map = new HashMap<>();
        map.put("STATUS", status);
        map.put("MESSAGE", message);
        return map;
    }

    private Map<String, Object> mapJson(T object, HttpStatus status, String message) {
        map = new HashMap<>();
        if (object != null) {
            map.put("DATA", object);
            response(status, message);
        } else {
            response(status, message);
        }
        return map;
    }

    public ResponseEntity<Map<String, Object>> responseJson(T object, HttpStatus httpStatus) {
        map = new HashMap<>();
        if (object != null) {
            map = mapJson(object, HttpStatus.OK, MESSAGE_SUCCESS);
        } else {
            map = mapJson((T) null, HttpStatus.NOT_FOUND, MESSAGE_FAILURE);
        }
        return new ResponseEntity<>(map, httpStatus);
    }

    public ResponseEntity<Map<String, Object>> responseJson(Response<T> object, HttpStatus httpStatus) {
        map = new HashMap<>();
        if(object != null){
            if (object.getData().hasContent()) {
                map = mapJson((T) object.getData(), HttpStatus.OK, MESSAGE_SUCCESS);
            } else {
                map = mapJson((T) null, HttpStatus.NOT_FOUND, MESSAGE_FAILURE);
            }
        }
        return new ResponseEntity<>(map, httpStatus);
    }

}
