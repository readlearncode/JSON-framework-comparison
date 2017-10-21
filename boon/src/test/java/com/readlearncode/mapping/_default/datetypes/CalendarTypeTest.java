package com.readlearncode.mapping._default.datetypes;

import org.boon.json.JsonFactory;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CalendarTypeTest {

    @Test @Ignore("Boon uses toString to construct property value")
    public void givenCalendarType_shouldSerialise()  {

        /*

         */

        String expectedJson = "{\"calendar1\":\""+new CalendarType().getCalendar1().toString()+"\"}";
        String actualJson = JsonFactory.create().toJson(new CalendarType());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}