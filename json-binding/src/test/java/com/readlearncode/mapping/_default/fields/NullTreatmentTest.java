package com.readlearncode.mapping._default.fields;

import org.junit.Test;

import javax.json.bind.JsonbBuilder;

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
        String expectedJson = "{\"stringList\":[null]}";
        String actualJson = JsonbBuilder.create().toJson(new NullTreatment());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}