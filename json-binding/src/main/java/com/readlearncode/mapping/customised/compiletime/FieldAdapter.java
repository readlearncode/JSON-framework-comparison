package com.readlearncode.mapping.customised.compiletime;

import javax.json.bind.adapter.JsonbAdapter;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class FieldAdapter implements JsonbAdapter<String, String> {

    @Override
    public String adaptToJson(String obj) throws Exception {
        return obj.toUpperCase();
    }

    @Override
    public String adaptFromJson(String obj) throws Exception {
        return obj.toLowerCase();
    }
}