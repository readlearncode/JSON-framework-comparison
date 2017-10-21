package com.readlearncode.mapping._default.classes;

import org.junit.Test;

import javax.json.bind.JsonbBuilder;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class InheritanceTest {

    @Test
    public void givenInheritance_shouldSerialise(){
        String expectedJson = "{\"parentName\":\"Parent\",\"child\":\"Child\"}";
        String actualJson = JsonbBuilder.create().toJson(new Child());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}