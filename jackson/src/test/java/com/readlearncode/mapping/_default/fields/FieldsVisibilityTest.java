package com.readlearncode.mapping._default.fields;

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
public class FieldsVisibilityTest {

    @Test
    public void givenFieldVisibility_shouldSerialise() throws JsonProcessingException {
        /*
            {
              "publicString": "",
              "finalPublicString": "",
              "privateStringWithSetterGetter": "",
              "defaultStringWithSetterGetter": "",
              "protectedStringWithSetterGetter": "",
              "publicStringWithSetterGetter": "",
              "finalPrivateStringWithSetterGetter": "",
              "finalPublicStringWithSetterGetter": "",
              "virtualField": ""
            }
         */
        String expectedJson = "{\"publicString\":\"\",\"finalPublicString\":\"\",\"privateStringWithSetterGetter\":\"\",\"defaultStringWithSetterGetter\":\"\",\"protectedStringWithSetterGetter\":\"\",\"publicStringWithSetterGetter\":\"\",\"finalPrivateStringWithSetterGetter\":\"\",\"finalPublicStringWithSetterGetter\":\"\",\"virtualField\":\"\"}";
        String actualJson = new ObjectMapper().writeValueAsString(new FieldsVisibility());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}