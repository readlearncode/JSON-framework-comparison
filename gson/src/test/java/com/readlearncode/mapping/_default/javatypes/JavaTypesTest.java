package com.readlearncode.mapping._default.javatypes;

import com.google.gson.GsonBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
              "bigInteger": 10,
              "bigDecimal": 10,
              "url": "http://www.readlearncode.com",
              "uri": "http://www.readlearncode.com",
              "stringOptional": {
                "value": "Hello World"
              },
              "optionalInt": {
                "isPresent": true,
                "value": 10
              },
              "optionalLong": {
                "isPresent": true,
                "value": 10
              },
              "optionalDouble": {
                "isPresent": true,
                "value": 10
              },
              "atomicInteger": 10,
              "longAdder": {}
            }
         */

        String expectedJson = "{\"bigInteger\":10,\"bigDecimal\":10,\"url\":\"http://www.readlearncode.com\",\"uri\":\"http://www.readlearncode.com\",\"stringOptional\":{\"value\":\"Hello World\"},\"optionalInt\":{\"isPresent\":true,\"value\":10},\"optionalLong\":{\"isPresent\":true,\"value\":10},\"optionalDouble\":{\"isPresent\":true,\"value\":10.0},\"atomicInteger\":10,\"longAdder\":{}}";
        JavaTypes javaTypes = new JavaTypes();
        String actualJson = new GsonBuilder().create().toJson(javaTypes);
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}