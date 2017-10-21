package com.readlearncode.mapping._default.javatypes;

import org.boon.json.JsonFactory;
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
    public void givenJavaTypes_shouldSerialise() throws MalformedURLException, URISyntaxException {

        /*
            {
              "bigInteger": 10,
              "bigDecimal": 10,
              "url": "http://www.readlearncode.com",
              "uri": "http://www.readlearncode.com"
            }
         */
        String expectedJson = "{\"bigInteger\":10,\"bigDecimal\":10,\"url\":\"http://www.readlearncode.com\",\"uri\":\"http://www.readlearncode.com\"}";
        String actualJson = JsonFactory.create().toJson(new JavaTypes());
        assertThat(actualJson).isEqualTo(expectedJson);
    }


}