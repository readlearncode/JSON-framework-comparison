package com.readlearncode.mapping._default.jsonprocessing;

import com.google.gson.GsonBuilder;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class JsonProcessingTypesTest {

    @Test
    public void givenJsonProcessing_shouldSerialise() {

        /*
            {
              "jsonObject": {
                "firstName": {
                  "value": "Alex"
                },
                "lastName": {
                  "value": "Theedom"
                }
              },
              "jsonValue": {
                "value": "House"
              },
              "jsonArray": [
                {
                  "value": "Cat"
                },
                {
                  "value": "Dog"
                }
              ],
              "jsonString": {
                "value": "Flat"
              },
              "jsonNumber": {
                "num": 100
              }
            }
         */
        String expectedJson = "{\"jsonObject\":{\"firstName\":{\"value\":\"Alex\"},\"lastName\":{\"value\":\"Theedom\"}},\"jsonValue\":{\"value\":\"House\"},\"jsonArray\":[{\"value\":\"Cat\"},{\"value\":\"Dog\"}],\"jsonString\":{\"value\":\"Flat\"},\"jsonNumber\":{\"num\":100}}";
        String actualJson = new GsonBuilder().create().toJson(new JsonProcessingTypes());
        assertThat(actualJson).isEqualTo(expectedJson);
    }


}