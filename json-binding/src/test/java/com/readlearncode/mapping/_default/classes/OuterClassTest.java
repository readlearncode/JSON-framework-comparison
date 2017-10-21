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
public class OuterClassTest {

    @Test
    public void givenNestedClasses_shouldSerialise() {
        String expectedJson = "{\"name\":\"OuterClass\"}";
        String actualJson = JsonbBuilder.create().toJson(new OuterClass());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}