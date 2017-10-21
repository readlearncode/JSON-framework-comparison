package com.readlearncode.mapping._default.arraysandcollections;

import org.junit.Test;

import javax.json.bind.JsonbBuilder;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ArraysCollectionsTest {

    @Test
    public void givenArrayAndCollections_shouldSerialise() {

        /*
            {
              "intArray": [
                1,
                2,
                3,
                5
              ],
              "objectCollection": [
                "one",
                "two"
              ],
              "stringArray": [
                "one",
                "two"
              ],
              "stringIntegerMap": {
                "one": 1,
                "two": 2
              }
            }
         */

        String expectedJson = "{\"intArray\":[1,2,3,5],\"objectCollection\":[\"one\",\"two\"],\"stringArray\":[\"one\",\"two\"],\"stringIntegerMap\":{\"one\":1,\"two\":2}}";
        String actualJson = JsonbBuilder.create().toJson(new ArraysCollections());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}