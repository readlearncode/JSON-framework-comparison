package com.readlearncode.mapping.customised.compiletime;

import javax.json.bind.adapter.JsonbAdapter;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ClassAdapter implements JsonbAdapter<CompileTimeSampler, String> {
    @Override
    public String adaptToJson(CompileTimeSampler obj) throws Exception {
        return null;
    }

    @Override
    public CompileTimeSampler adaptFromJson(String obj) throws Exception {
        return null;
    }
}