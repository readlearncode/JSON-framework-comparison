package com.readlearncode.mapping._default.enumtypes;

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
public class EnumTypesTest {

    @Test
    public void givenEnum_shouldSerialise() throws JsonProcessingException {
        /*
        {
          "hard": "HARD",
          "soft": "SOFT"
        }
         */
        String expectedJson = "{\"hard\":\"HARD\",\"soft\":\"SOFT\"}";
        String actualJson = new ObjectMapper().writeValueAsString(new UseEnum());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}