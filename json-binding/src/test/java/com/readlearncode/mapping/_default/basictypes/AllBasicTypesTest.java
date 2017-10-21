package com.readlearncode.mapping._default.basictypes;

import org.junit.Test;

import javax.json.bind.JsonbBuilder;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class AllBasicTypesTest {

    @Test
    public void givenDefaultValues_shouldSerialise() {

        /*
            {
              "bytePrimitive": 0,
              "byteWrapper": 0,
              "charPrimitive": "\u0000",
              "charWrapper": "\u0000",
              "doublePrimitive": 0,
              "doubleWrapper": 0,
              "floatPrimitive": 0,
              "floatWrapper": 0,
              "intPrimitive": 0,
              "intWrapper": 0,
              "longPrimitive": 0,
              "longWrapper": 0,
              "shortPrimitive": 0,
              "shortWrapper": 0,
              "string": "Hello World"
            }
         */
        String expectedJson = "{\"bytePrimitive\":0,\"byteWrapper\":0,\"charPrimitive\":\"\\u0000\",\"charWrapper\":\"\\u0000\",\"doublePrimitive\":0.0,\"doubleWrapper\":0.0,\"floatPrimitive\":0.0,\"floatWrapper\":0.0,\"intPrimitive\":0,\"intWrapper\":0,\"longPrimitive\":0,\"longWrapper\":0,\"shortPrimitive\":0,\"shortWrapper\":0,\"string\":\"Hello World\"}";
        AllBasicTypes allBasicTypes = new AllBasicTypes();
        String actualJson = JsonbBuilder.create().toJson(allBasicTypes);
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}