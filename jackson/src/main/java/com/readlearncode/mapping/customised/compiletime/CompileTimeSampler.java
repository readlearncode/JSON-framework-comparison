package com.readlearncode.mapping.customised.compiletime;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@JsonSerialize(using = CustomSerializer.class)
@JsonDeserialize(using = CustomDeserializer.class)
//@JsonbTypeAdapter(ClassAdapter.class)
@JsonPropertyOrder(value = {"firstName", "title", "author"},alphabetic = true)  // @JsonPropertyOrder(alphabetic = true)
@JsonInclude(JsonInclude.Include.ALWAYS) // @JsonbNillable
@JsonIgnoreProperties({"transientField"})
public class CompileTimeSampler {

    @JsonIgnore
    private String transientField;

    @JsonProperty("firstName")
    private String name;

    @JsonInclude(JsonInclude.Include.ALWAYS) // @JsonProperty(nillable = true)
    private String nillable;

    @JsonFormat(pattern = "MM/dd/yyyy", locale = "Locale.ENGLISH")
    private Date date;

    //    @JsonbNumberFormat("#.00")
    @JsonSerialize(using = PriceJsonSerializer.class)
    private float amount = 1000;

    @JsonCreator
    public CompileTimeSampler customCreator() {
        return new CompileTimeSampler();
    }

    //    @JsonbTypeAdapter(FieldAdapter.class)
    @JsonSerialize(using = FieldAdapter.class)
    private String adaptableField;

}