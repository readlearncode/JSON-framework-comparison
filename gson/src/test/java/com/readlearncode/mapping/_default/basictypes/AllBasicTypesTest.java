package com.readlearncode.mapping._default.basictypes;

import com.google.gson.GsonBuilder;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

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
              "shortPrimitive": 0,
              "charPrimitive": "\u0000",
              "intPrimitive": 0,
              "longPrimitive": 0,
              "floatPrimitive": 0,
              "doublePrimitive": 0,
              "byteWrapper": 0,
              "shortWrapper": 0,
              "charWrapper": "\u0000",
              "intWrapper": 0,
              "longWrapper": 0,
              "floatWrapper": 0,
              "doubleWrapper": 0,
              "string": "Hello World"
            }
         */

        String expectedJson = "{\"bytePrimitive\":0,\"shortPrimitive\":0,\"charPrimitive\":\"\\u0000\",\"intPrimitive\":0,\"longPrimitive\":0,\"floatPrimitive\":0.0,\"doublePrimitive\":0.0,\"byteWrapper\":0,\"shortWrapper\":0,\"charWrapper\":\"\\u0000\",\"intWrapper\":0,\"longWrapper\":0,\"floatWrapper\":0.0,\"doubleWrapper\":0.0,\"string\":\"Hello World\"}";
        AllBasicTypes allBasicTypes = new AllBasicTypes();
        String actualJson = new GsonBuilder().create().toJson(allBasicTypes);
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}