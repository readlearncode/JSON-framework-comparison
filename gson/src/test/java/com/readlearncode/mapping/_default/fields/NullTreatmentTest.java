package com.readlearncode.mapping._default.fields;

import com.google.gson.GsonBuilder;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class NullTreatmentTest {

    @Test
    public void givenNulls_shouldSerialise() {
        /*
            {
              "objectOptional": {},
              "stringList": [
                null
              ]
            }
         */
        String expectedJson = "{\"objectOptional\":{},\"stringList\":[null]}";
        String actualJson = new GsonBuilder().create().toJson(new NullTreatment());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}