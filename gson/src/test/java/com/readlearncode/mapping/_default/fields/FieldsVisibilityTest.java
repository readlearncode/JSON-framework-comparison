package com.readlearncode.mapping._default.fields;

import com.google.gson.GsonBuilder;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
              "privateString": "",
              "defaultString": "",
              "protectedString": "",
              "publicString": "",
              "finalPrivateString": "",
              "finalPublicString": "",
              "privateStringWithSetterGetter": "",
              "defaultStringWithSetterGetter": "",
              "protectedStringWithSetterGetter": "",
              "publicStringWithSetterGetter": "",
              "finalPrivateStringWithSetterGetter": "",
              "finalPublicStringWithSetterGetter": ""
            }
         */
        String expectedJson = "{\"privateString\":\"\",\"defaultString\":\"\",\"protectedString\":\"\",\"publicString\":\"\",\"finalPrivateString\":\"\",\"finalPublicString\":\"\",\"privateStringWithSetterGetter\":\"\",\"defaultStringWithSetterGetter\":\"\",\"protectedStringWithSetterGetter\":\"\",\"publicStringWithSetterGetter\":\"\",\"finalPrivateStringWithSetterGetter\":\"\",\"finalPublicStringWithSetterGetter\":\"\"}";
        String actualJson = new GsonBuilder().create().toJson(new FieldsVisibility());
        assertThat(actualJson).isEqualTo(expectedJson);
    }
}