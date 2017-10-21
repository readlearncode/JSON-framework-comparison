package com.readlearncode.mapping._default.javatypes;

import org.junit.Test;

import javax.json.bind.JsonbBuilder;

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
    public void givenJavaTypes_shouldSerialise() throws MalformedURLException, URISyntaxException {

        /*
            {
              "atomicInteger": 10,
              "bigDecimal": 10,
              "bigInteger": 10,
              "longAdder": 0,
              "optionalDouble": 10,
              "optionalInt": 10,
              "optionalLong": 10,
              "stringOptional": "Hello World",
              "uri": "http://www.readlearncode.com",
              "url": "http://www.readlearncode.com"
            }
         */

        String expectedJson = "{\"atomicInteger\":10,\"bigDecimal\":10,\"bigInteger\":10,\"longAdder\":0,\"optionalDouble\":10.0,\"optionalInt\":10,\"optionalLong\":10,\"stringOptional\":\"Hello World\",\"uri\":\"http://www.readlearncode.com\",\"url\":\"http://www.readlearncode.com\"}";
        String actualJson = JsonbBuilder.create().toJson(new JavaTypes());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}