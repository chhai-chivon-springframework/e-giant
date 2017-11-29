package com.giant.egiant.common;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author by chhai.chivon  on 11/29/17.
 */
public class BaseController<T> {
    private static final String MESSAGE_SUCCESS ="success";
    private static final String MESSAGE_FAILURE = "fail";
    private Map<String, Object> map;

    private Map<String, Object> mapJson(T object, HttpStatus status, String message) {
        map = new HashMap<>();
        if(object != null){
            map.put("data", object);
            map.put("status", status);
            map.put("message", message);
        }else{
            map.put("status", status);
            map.put("message", message);
        }
        return map;
    }

    public ResponseEntity<Map<String, Object>> responseJson(T object, HttpStatus httpStatus) {
        map = new HashMap<>();
        if (object != null) {
            map = mapJson(object, HttpStatus.OK, MESSAGE_SUCCESS);
        } else {
            map = mapJson(null, HttpStatus.NOT_FOUND, MESSAGE_FAILURE);
        }
        return new ResponseEntity<>(map, httpStatus);
    }

    public ResponseEntity<Map<String, Object>> responseJson(List<T> objects, HttpStatus httpStatus) {
        map = new HashMap<>();
        if (!objects.isEmpty()) {
            map = mapJson((T) objects, HttpStatus.OK, MESSAGE_SUCCESS);
        } else {
            map = mapJson(null, HttpStatus.NOT_FOUND, MESSAGE_FAILURE);
        }
        return new ResponseEntity<>(map, httpStatus);
    }
    public ResponseEntity<Map<String, Object>> responseJson(Page<T> objects, HttpStatus httpStatus) {
        map = new HashMap<>();
        List<T> list  = new ArrayList<>();
        if (objects.hasContent()) {
            for (T t : objects.getContent()){
                list.add(t);
            }
            map = mapJson((T) list, HttpStatus.OK, MESSAGE_SUCCESS);
        } else {
            map = mapJson(null, HttpStatus.NOT_FOUND, MESSAGE_FAILURE);
        }
        return new ResponseEntity<>(map, httpStatus);
    }
}
