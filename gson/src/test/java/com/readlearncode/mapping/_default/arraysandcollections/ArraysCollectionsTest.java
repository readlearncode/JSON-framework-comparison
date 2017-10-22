package com.readlearncode.mapping._default.arraysandcollections;

import com.google.gson.GsonBuilder;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ArraysCollectionsTest {

    @Test
    public void givenDefaultValues_shouldSerialise()  {

        /*
        {
          "intArray": [
            1,
            2,
            3,
            5
          ],
          "stringArray": [
            "one",
            "two"
          ],
          "objectCollection": [
            "one",
            "two"
          ],
          "stringIntegerMap": {
            "one": 1,
            "two": 2
          }
        }
         */
        String expectedJson = "{\"intArray\":[1,2,3,5],\"stringArray\":[\"one\",\"two\"],\"objectCollection\":[\"one\",\"two\"],\"stringIntegerMap\":{\"one\":1,\"two\":2}}";
        String actualJson = new GsonBuilder().create().toJson(new ArraysCollections());
        assertThat(actualJson).isEqualTo(expectedJson);

    }
}