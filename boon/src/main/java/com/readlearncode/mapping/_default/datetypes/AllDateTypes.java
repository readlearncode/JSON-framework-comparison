package com.readlearncode.mapping._default.datetypes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Objects;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class AllDateTypes {

    private Date date = new SimpleDateFormat("dd/MM/yyyy").parse("25/12/2017");
    private LocalDate localDate = LocalDate.parse("2017-12-25");
    private LocalDateTime localDateTime = LocalDate.parse("2017-12-25").atStartOfDay();
    private DayOfWeek dayOfWeek = LocalDate.parse("2017-12-25").getDayOfWeek();
    private LocalTime sixThirty = LocalTime.parse("23:00");
    private ZoneId zoneId = ZoneId.of("Europe/London");
    private ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
    private ZoneOffset offset = ZoneOffset.of("+01:00");
    private OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);

    public AllDateTypes() throws ParseException {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getSixThirty() {
        return sixThirty;
    }

    public void setSixThirty(LocalTime sixThirty) {
        this.sixThirty = sixThirty;
    }

    public ZoneId getZoneId() {
        return zoneId;
    }

    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }

    public ZoneOffset getOffset() {
        return offset;
    }

    public void setOffset(ZoneOffset offset) {
        this.offset = offset;
    }

    public OffsetDateTime getOffsetDateTime() {
        return offsetDateTime;
    }

    public void setOffsetDateTime(OffsetDateTime offsetDateTime) {
        this.offsetDateTime = offsetDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllDateTypes that = (AllDateTypes) o;
        return Objects.equals(date, that.date) &&
                Objects.equals(localDate, that.localDate) &&
                Objects.equals(localDateTime, that.localDateTime) &&
                dayOfWeek == that.dayOfWeek &&
                Objects.equals(sixThirty, that.sixThirty) &&
                Objects.equals(zoneId, that.zoneId) &&
                Objects.equals(zonedDateTime, that.zonedDateTime) &&
                Objects.equals(offset, that.offset) &&
                Objects.equals(offsetDateTime, that.offsetDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, localDate, localDateTime, dayOfWeek, sixThirty, zoneId, zonedDateTime, offset, offsetDateTime);
    }

    @Override
    public String toString() {
        return "AllDateTypes{" +
                "date=" + date +
                ", localDate=" + localDate +
                ", localDateTime=" + localDateTime +
                ", dayOfWeek=" + dayOfWeek +
                ", sixThirty=" + sixThirty +
                ", zoneId=" + zoneId +
                ", zonedDateTime=" + zonedDateTime +
                ", offset=" + offset +
                ", offsetDateTime=" + offsetDateTime +
                '}';
    }
}