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
public class FieldsVisibilityTest {

    @Test
    public void givenFieldVisibility_shouldSerialise() {
        /*
            {
              "defaultStringWithSetterGetter": "",
              "finalPrivateStringWithSetterGetter": "",
              "finalPublicString": "",
              "finalPublicStringWithSetterGetter": "",
              "privateStringWithSetterGetter": "",
              "protectedStringWithSetterGetter": "",
              "publicString": "",
              "publicStringWithSetterGetter": "",
              "virtualField": ""
            }
         */

        String expectedJson = "{\"defaultStringWithSetterGetter\":\"\",\"finalPrivateStringWithSetterGetter\":\"\",\"finalPublicString\":\"\",\"finalPublicStringWithSetterGetter\":\"\",\"privateStringWithSetterGetter\":\"\",\"protectedStringWithSetterGetter\":\"\",\"publicString\":\"\",\"publicStringWithSetterGetter\":\"\",\"virtualField\":\"\"}";
        String actualJson = JsonbBuilder.create().toJson(new FieldsVisibility());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}