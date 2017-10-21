package com.readlearncode.mapping._default.datetypes;

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
public class CalendarTypeTest {

    @Test
    public void givenCalendarType_shouldSerialise() throws JsonProcessingException {

        /*
            {
              "calendar1": 1516838400000,
              "calendar2": 1516838400000
            }
         */

        String expectedJson = "{\"calendar1\":1516838400000,\"calendar2\":1516838400000}";
        String actualJson = new ObjectMapper().writeValueAsString(new CalendarType());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}