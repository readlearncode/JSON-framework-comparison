package com.readlearncode.mapping._default.classes;

import com.google.gson.GsonBuilder;
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
    public void givenNestedClasses_shouldSerialise() {
        /*
        {
          "name": "OuterClass"
        }
         */
        String expectedJson = "{\"name\":\"OuterClass\"}";
        String actualJson = new GsonBuilder().create().toJson(new OuterClass());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}