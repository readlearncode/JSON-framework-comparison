package com.readlearncode.mapping._default.javatypes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class JavaTypesTest {

    @Test
    public void givenJavaTypes_shouldSerialise() throws MalformedURLException, URISyntaxException, JsonProcessingException {

        /*
            {
              "bigInteger": 10,
              "bigDecimal": 10,
              "url": "http://www.readlearncode.com",
              "uri": "http://www.readlearncode.com",
              "stringOptional": {
                "present": true
              },
              "optionalInt": {
                "asInt": 10,
                "present": true
              },
              "optionalLong": {
                "asLong": 10,
                "present": true
              },
              "optionalDouble": {
                "asDouble": 10,
                "present": true
              },
              "atomicInteger": 10,
              "longAdder": 0
            }
         */

        String expectedJson = "{\"bigInteger\":10,\"bigDecimal\":10,\"url\":\"http://www.readlearncode.com\",\"uri\":\"http://www.readlearncode.com\",\"stringOptional\":{\"present\":true},\"optionalInt\":{\"asInt\":10,\"present\":true},\"optionalLong\":{\"asLong\":10,\"present\":true},\"optionalDouble\":{\"asDouble\":10.0,\"present\":true},\"atomicInteger\":10,\"longAdder\":0}";
        String actualJson = new ObjectMapper().writeValueAsString(new JavaTypes());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}