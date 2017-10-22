package com.readlearncode.mapping._default.enumtypes;

import com.google.gson.GsonBuilder;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class EnumTypesTest {

    @Test
    public void givenEnum_shouldSerialise() {
        /*
        {
          "hard": "HARD",
          "soft": "SOFT"
        }
         */
        String expectedJson = "{\"hard\":\"HARD\",\"soft\":\"SOFT\"}";
        String actualJson = new GsonBuilder().create().toJson(new UseEnum());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}