package com.readlearncode.mapping._default.datetypes;

import org.junit.Test;

import javax.json.bind.JsonbBuilder;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CalendarTypeTest {

    @Test
    public void givenCalendarType_shouldSerialise() {

        /*
            {
              "calendar1": "2017-12-25Z",
              "calendar2": "2017-12-25T00:00:00Z[Europe/London]"
            }
         */

        String expectedJson = "{\"calendar1\":\"2017-12-25Z\",\"calendar2\":\"2017-12-25T00:00:00Z[Europe/London]\"}";
        String actualJson = JsonbBuilder.create().toJson(new CalendarType());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}