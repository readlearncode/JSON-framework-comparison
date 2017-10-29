package com.readlearncode.mapping.customised.compiletime;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CompileTimeSampler {

    @Expose
    private String transientField;

    @SerializedName("firstName")
    private String name;

    // only configurable via runtime
    private String nillable;

    // Have to create a de/serializer
    private Date date;

    // no annotation for number format
    private float amount = 1000;

    public CompileTimeSampler customCreator() {
        return new CompileTimeSampler();
    }

    private String adaptableField;

}