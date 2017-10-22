package com.readlearncode.mapping._default.datetypes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class AllDateTypesTest {

    @Test
    public void givenDate_shouldSerialize() throws ParseException, JsonProcessingException {
        String expectedJson = "1514160000000";
        String actualJson = new ObjectMapper().writeValueAsString(new SimpleDateFormat("dd/MM/yyyy").parse("25/12/2017"));
        assertThat(actualJson).isEqualTo(expectedJson);
    }

    @Test
    public void givenLocalDate_shouldSerialize() throws ParseException, JsonProcessingException {

        /*
            {
              "year": 2017,
              "month": "DECEMBER",
              "chronology": {
                "id": "ISO",
                "calendarType": "iso8601"
              },
              "dayOfMonth": 25,
              "dayOfWeek": "MONDAY",
              "dayOfYear": 359,
              "leapYear": false,
              "monthValue": 12,
              "era": "CE"
            }
         */

        String expectedJson = "{\"year\":2017,\"month\":\"DECEMBER\",\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"},\"dayOfMonth\":25,\"dayOfWeek\":\"MONDAY\",\"dayOfYear\":359,\"leapYear\":false,\"monthValue\":12,\"era\":\"CE\"}";
        String actualJson = new ObjectMapper().writeValueAsString(new AllDateTypes().getLocalDate());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

    @Test
    public void givenLocalDateTime_shouldSerialize() throws ParseException, JsonProcessingException {
        /*
            {
              "dayOfMonth": 25,
              "dayOfWeek": "MONDAY",
              "dayOfYear": 359,
              "month": "DECEMBER",
              "monthValue": 12,
              "year": 2017,
              "hour": 0,
              "minute": 0,
              "nano": 0,
              "second": 0,
              "chronology": {
                "id": "ISO",
                "calendarType": "iso8601"
              }
            }
         */
        String expectedJson = "{\"hour\":0,\"minute\":0,\"nano\":0,\"second\":0,\"dayOfMonth\":25,\"dayOfWeek\":\"MONDAY\",\"dayOfYear\":359,\"month\":\"DECEMBER\",\"monthValue\":12,\"year\":2017,\"chronology\":{\"id\":\"ISO\",\"calendarType\":\"iso8601\"}}";
        String actualJson = new ObjectMapper().writeValueAsString(new AllDateTypes().getLocalDateTime());
        assertThat(actualJson).isEqualTo(expectedJson);
    }


    @Test
    public void givenLocalTime_shouldSerialize() throws ParseException, JsonProcessingException {
        /*
            {
              "hour": 23,
              "minute": 0,
              "second": 0,
              "nano": 0
            }
         */
        String expectedJson = "{\"hour\":23,\"minute\":0,\"second\":0,\"nano\":0}";
        String actualJson = new ObjectMapper().writeValueAsString(new AllDateTypes().getLocalTime());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}