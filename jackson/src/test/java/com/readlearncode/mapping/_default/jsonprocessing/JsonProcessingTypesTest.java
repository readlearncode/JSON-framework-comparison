package com.readlearncode.mapping._default.jsonprocessing;

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
public class JsonProcessingTypesTest {

    @Test
    public void givenJsonProcessing_shouldSerialise() throws JsonProcessingException {
        /*
            {
              "jsonObject": {
                "firstName": {
                  "chars": "Alex",
                  "string": "Alex",
                  "valueType": "STRING"
                },
                "lastName": {
                  "chars": "Theedom",
                  "string": "Theedom",
                  "valueType": "STRING"
                }
              },
              "jsonValue": {
                "chars": "House",
                "string": "House",
                "valueType": "STRING"
              },
              "jsonArray": [
                {
                  "chars": "Cat",
                  "string": "Cat",
                  "valueType": "STRING"
                },
                {
                  "chars": "Dog",
                  "string": "Dog",
                  "valueType": "STRING"
                }
              ],
              "jsonString": {
                "chars": "Flat",
                "string": "Flat",
                "valueType": "STRING"
              },
              "jsonNumber": {
                "integral": true,
                "valueType": "NUMBER"
              }
            }
         */
        String expectedJson = "{\"jsonObject\":{\"firstName\":{\"chars\":\"Alex\",\"string\":\"Alex\",\"valueType\":\"STRING\"},\"lastName\":{\"chars\":\"Theedom\",\"string\":\"Theedom\",\"valueType\":\"STRING\"}},\"jsonValue\":{\"chars\":\"House\",\"string\":\"House\",\"valueType\":\"STRING\"},\"jsonArray\":[{\"chars\":\"Cat\",\"string\":\"Cat\",\"valueType\":\"STRING\"},{\"chars\":\"Dog\",\"string\":\"Dog\",\"valueType\":\"STRING\"}],\"jsonString\":{\"chars\":\"Flat\",\"string\":\"Flat\",\"valueType\":\"STRING\"},\"jsonNumber\":{\"integral\":true,\"valueType\":\"NUMBER\"}}";
        String actualJson = new ObjectMapper().writeValueAsString(new JsonProcessingTypes());
        assertThat(actualJson).isEqualTo(expectedJson);
    }


}