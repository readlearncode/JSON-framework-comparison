package com.readlearncode.mapping.customised.runtime;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.readlearncode.mapping._default.basictypes.AllBasicTypes;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RuntimeSampler {

    public static void main(String... args){

        String actualJson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create().toJson(new AllBasicTypes());

        System.out.print(actualJson);
    }
}