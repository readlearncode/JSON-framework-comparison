package com.readlearncode.mapping._default.datetypes;

import org.junit.Test;

import javax.json.bind.JsonbBuilder;
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
              "date": "2017-12-25T00:00:00Z[UTC]",
              "dayOfWeek": "MONDAY",
              "localDate": "2017-12-25",
              "localDateTime": "2017-12-25T00:00:00",
              "offset": "+01:00",
              "offsetDateTime": "2017-12-25T00:00:00+01:00",
              "sixThirty": "23:00:00",
              "zoneId": "Europe/London",
              "zonedDateTime": "2017-12-25T00:00:00Z[Europe/London]"
            }
         */

        String expectedJson = "{\"date\":\"2017-12-25T00:00:00Z[UTC]\",\"dayOfWeek\":\"MONDAY\",\"localDate\":\"2017-12-25\",\"localDateTime\":\"2017-12-25T00:00:00\",\"offset\":\"+01:00\",\"offsetDateTime\":\"2017-12-25T00:00:00+01:00\",\"sixThirty\":\"23:00:00\",\"zoneId\":\"Europe/London\",\"zonedDateTime\":\"2017-12-25T00:00:00Z[Europe/London]\"}";
        String actualJson = JsonbBuilder.create().toJson(new AllDateTypes());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}