package com.readlearncode.mapping._default.datetypes;

import com.google.gson.GsonBuilder;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CalendarTypeTest {

    @Test
    public void givenCalendarType_shouldSerialise()  {

        /*
            {
              "calendar1": {
                "year": 2017,
                "month": 11,
                "dayOfMonth": 25,
                "hourOfDay": 0,
                "minute": 0,
                "second": 0
              },
              "calendar2": {
                "year": 2017,
                "month": 11,
                "dayOfMonth": 25,
                "hourOfDay": 0,
                "minute": 0,
                "second": 0
              }
            }
         */

        String expectedJson = "{\"calendar1\":{\"year\":2017,\"month\":11,\"dayOfMonth\":25,\"hourOfDay\":0,\"minute\":0,\"second\":0},\"calendar2\":{\"year\":2017,\"month\":11,\"dayOfMonth\":25,\"hourOfDay\":0,\"minute\":0,\"second\":0}}";
        String actualJson = new GsonBuilder().create().toJson(new CalendarType());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}