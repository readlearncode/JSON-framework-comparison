package com.readlearncode.mapping._default.datetypes;

import java.util.Calendar;
import java.util.Objects;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CalendarType {

    Calendar calendar1;

    {
        calendar1 = Calendar.getInstance();
        calendar1.clear();
        calendar1.set(2017, 12, 25);
    }

    Calendar calendar2 = new Calendar.Builder().setDate(2017, 12, 25).build();

    public Calendar getCalendar2() {
        return calendar2;
    }

    public void setCalendar2(Calendar calendar2) {
        this.calendar2 = calendar2;
    }

    public Calendar getCalendar1() {
        return calendar1;
    }

    public void setCalendar1(Calendar calendar1) {
        this.calendar1 = calendar1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalendarType that = (CalendarType) o;
        return Objects.equals(calendar1, that.calendar1) &&
                Objects.equals(calendar2, that.calendar2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calendar1, calendar2);
    }

    @Override
    public String toString() {
        return "CalendarType{" +
                "calendar1=" + calendar1 +
                ", calendar2=" + calendar2 +
                '}';
    }
}