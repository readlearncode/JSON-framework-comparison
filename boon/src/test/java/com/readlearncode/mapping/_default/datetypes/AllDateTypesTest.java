package com.readlearncode.mapping._default.datetypes;

import org.boon.json.JsonFactory;
import org.junit.Test;

import java.text.ParseException;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class AllDateTypesTest {

    @Test
    public void givenDateTypes_shouldSerialize() throws ParseException {

        /*
            {
              "date": 1514160000000,
              "dayOfWeek": "MONDAY",
              "zoneId": {
                "class": "java.time.ZoneRegion",
                "id": "Europe/London"
              }
            }
            Boon does not seem to support Java 8 dates.
         */

        String expectedJson = "{\"date\":1514160000000,\"dayOfWeek\":\"MONDAY\",\"zoneId\":{\"class\":\"java.time.ZoneRegion\",\"id\":\"Europe/London\"}}";
        String actualJson = JsonFactory.create().toJson(new AllDateTypes());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}