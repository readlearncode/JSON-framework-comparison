package com.readlearncode.mapping._default.datetypes;

import com.google.gson.GsonBuilder;
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
              "date": "Dec 25, 2017 12:00:00 AM",
              "localDate": {
                "year": 2017,
                "month": 12,
                "day": 25
              },
              "localDateTime": {
                "date": {
                  "year": 2017,
                  "month": 12,
                  "day": 25
                },
                "time": {
                  "hour": 0,
                  "minute": 0,
                  "second": 0,
                  "nano": 0
                }
              },
              "dayOfWeek": "MONDAY",
              "sixThirty": {
                "hour": 23,
                "minute": 0,
                "second": 0,
                "nano": 0
              },
              "zoneId": {
                "id": "Europe/London"
              },
              "zonedDateTime": {
                "dateTime": {
                  "date": {
                    "year": 2017,
                    "month": 12,
                    "day": 25
                  },
                  "time": {
                    "hour": 0,
                    "minute": 0,
                    "second": 0,
                    "nano": 0
                  }
                },
                "offset": {
                  "totalSeconds": 0
                },
                "zone": {
                  "id": "Europe/London"
                }
              },
              "offset": {
                "totalSeconds": 3600
              },
              "offsetDateTime": {
                "dateTime": {
                  "date": {
                    "year": 2017,
                    "month": 12,
                    "day": 25
                  },
                  "time": {
                    "hour": 0,
                    "minute": 0,
                    "second": 0,
                    "nano": 0
                  }
                },
                "offset": {
                  "totalSeconds": 3600
                }
              }
            }
         */

        String expectedJson = "{\"date\":\"Dec 25, 2017 12:00:00 AM\",\"localDate\":{\"year\":2017,\"month\":12,\"day\":25},\"localDateTime\":{\"date\":{\"year\":2017,\"month\":12,\"day\":25},\"time\":{\"hour\":0,\"minute\":0,\"second\":0,\"nano\":0}},\"dayOfWeek\":\"MONDAY\",\"sixThirty\":{\"hour\":23,\"minute\":0,\"second\":0,\"nano\":0},\"zoneId\":{\"id\":\"Europe/London\"},\"zonedDateTime\":{\"dateTime\":{\"date\":{\"year\":2017,\"month\":12,\"day\":25},\"time\":{\"hour\":0,\"minute\":0,\"second\":0,\"nano\":0}},\"offset\":{\"totalSeconds\":0},\"zone\":{\"id\":\"Europe/London\"}},\"offset\":{\"totalSeconds\":3600},\"offsetDateTime\":{\"dateTime\":{\"date\":{\"year\":2017,\"month\":12,\"day\":25},\"time\":{\"hour\":0,\"minute\":0,\"second\":0,\"nano\":0}},\"offset\":{\"totalSeconds\":3600}}}";
        String actualJson = new GsonBuilder().create().toJson(new AllDateTypes());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}