package com.readlearncode.mapping._default.jsonprocessing;

import org.junit.Test;

import javax.json.bind.JsonbBuilder;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class JsonProcessingTypesTest {

    @Test
    public void givenJsonProcessing_shouldSerialise(){

        /*
            {
              "jsonArray": [
                "Cat",
                "Dog"
              ],
              "jsonNumber": 100,
              "jsonObject": {
                "firstName": "Alex",
                "lastName": "Theedom"
              },
              "jsonString": "Flat",
              "jsonValue": "House"
            }
         */

        String expectedJson = "{\"jsonArray\":[\"Cat\",\"Dog\"],\"jsonNumber\":100,\"jsonObject\":{\"firstName\":\"Alex\",\"lastName\":\"Theedom\"},\"jsonString\":\"Flat\",\"jsonValue\":\"House\"}";
        String actualJson = JsonbBuilder.create().toJson(new JsonProcessingTypes());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}