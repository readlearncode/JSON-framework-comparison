package com.readlearncode.mapping._default.classes;

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
public class InheritanceTest {

    @Test
    public void givenInheritance_shouldSerialise() throws JsonProcessingException {
        /*
        {
          "parentName": "Parent",
          "child": "Child"
        }
         */
        String expectedJson = "{\"parentName\":\"Parent\",\"child\":\"Child\"}";
        String actualJson = new ObjectMapper().writeValueAsString(new Child());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}