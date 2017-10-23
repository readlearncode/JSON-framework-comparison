package com.readlearncode.mapping._default.enumtypes;

import org.junit.Test;

import javax.json.bind.JsonbBuilder;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class EnumTypesTest {

    @Test
    public void givenEnum_shouldSerialise(){
        /*
        {
          "hard": "Hard",
          "soft": "SOFT"
        }
         */
        String expectedJson = "{\"hard\":\"Hard\",\"soft\":\"SOFT\"}";
        String actualJson = JsonbBuilder.create().toJson(new UseEnum());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}