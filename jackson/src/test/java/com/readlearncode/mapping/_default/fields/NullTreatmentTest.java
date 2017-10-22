package com.readlearncode.mapping._default.fields;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public void givenNulls_shouldSerialise() throws JsonProcessingException {
        /*
            {
              "string": null,
              "stringOptional": null,
              "objectOptional": {
                "present": false
              },
              "stringList": [
                null
              ]
            }
         */
        String expectedJson = "{\"string\":null,\"stringOptional\":null,\"objectOptional\":{\"present\":false},\"stringList\":[null]}";
        String actualJson = new ObjectMapper().writeValueAsString(new NullTreatment());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}