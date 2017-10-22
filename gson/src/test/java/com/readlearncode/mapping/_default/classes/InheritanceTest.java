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
public class InheritanceTest {

    @Test
    public void givenInheritance_shouldSerialise() {
        /*
            {
              "child": "Child",
              "parentName": "Parent"
            }
         */
        String expectedJson = "{\"child\":\"Child\",\"parentName\":\"Parent\"}";
        String actualJson = new GsonBuilder().create().toJson(new Child());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}