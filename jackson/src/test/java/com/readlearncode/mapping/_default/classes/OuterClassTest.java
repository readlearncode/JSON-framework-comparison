package com.readlearncode.mapping._default.classes;

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
public class OuterClassTest {

    @Test
    public void givenNestedClasses_shouldSerialise() throws JsonProcessingException {
        /*
        {
          "name": "OuterClass"
        }
         */
        String expectedJson = "{\"name\":\"OuterClass\"}";
        String actualJson = new ObjectMapper().writeValueAsString(new OuterClass());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}