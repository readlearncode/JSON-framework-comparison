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
//@JsonSerialize(using = CustomSerializer.class)
//@JsonDeserialize(using = CustomDeserializer.class)
////@JsonbTypeAdapter(ClassAdapter.class)
//@JsonPropertyOrder(value = {"firstName", "title", "author"},alphabetic = true)  // @JsonPropertyOrder(alphabetic = true)
//@JsonInclude(JsonInclude.Include.ALWAYS) // @JsonbNillable
//@JsonIgnoreProperties({"transientField"})
public class CompileTimeSampler {

    @Expose // new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    private String transientField;

    @SerializedName("firstName")
    private String name;

    // only configurable via runtime // @JsonInclude(JsonInclude.Include.ALWAYS) // @JsonProperty(nillable = true)
    private String nillable;

    // Have to create a de/serializer // @JsonFormat(pattern = "MM/dd/yyyy", locale = "Locale.ENGLISH")
    private Date date;

    //    @JsonbNumberFormat("#.00")
    // no annotation for number format // @JsonSerialize(using = PriceJsonSerializer.class)
    private float amount = 1000;

//    @JsonCreator
    public CompileTimeSampler customCreator() {
        return new CompileTimeSampler();
    }

    //    @JsonbTypeAdapter(FieldAdapter.class)
//    @JsonSerialize(using = FieldAdapter.class)
    private String adaptableField;

}