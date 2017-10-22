package com.readlearncode.mapping.customised.compiletime;


import javax.json.bind.annotation.*;
import java.util.Date;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@JsonbTypeSerializer(CustomSerializer.class)
@JsonbTypeDeserializer(CustomDeserializer.class)
@JsonbTypeAdapter(ClassAdapter.class)
@JsonbPropertyOrder({"firstName", "title", "author"})
@JsonbNillable
public class CompileTimeSampler {

    @JsonbTransient
    private String transientField;

    @JsonbProperty("firstName")
    private String name;

    @JsonbProperty(nillable = true)
    private String nillable;

    @JsonbDateFormat(value = "MM/dd/yyyy", locale = "Locale.ENGLISH")
    private Date date;

    @JsonbNumberFormat("#.00")
    private float amount = 1000;

    @JsonbCreator
    public CompileTimeSampler customCreator(){
        return new CompileTimeSampler();
    }

    @JsonbTypeAdapter(FieldAdapter.class)
    private String adaptableField;


}