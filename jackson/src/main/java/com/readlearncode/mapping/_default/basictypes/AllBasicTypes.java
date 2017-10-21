package com.readlearncode.mapping._default.basictypes;

import java.util.Objects;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class AllBasicTypes {

    private byte bytePrimitive;
    private short shortPrimitive;
    private char charPrimitive;
    private int intPrimitive;
    private long longPrimitive;
    private float floatPrimitive;
    private double doublePrimitive;

    private Byte byteWrapper = 0;
    private Short shortWrapper = 0;
    private Character charWrapper = 0;
    private Integer intWrapper = 0;
    private Long longWrapper = 0L;
    private Float floatWrapper = 0F;
    private Double doubleWrapper = 0D;

    private String string = "Hello World";

    public AllBasicTypes() {
    }

    public AllBasicTypes(byte bytePrimitive, short shortPrimitive, char charPrimitive, int intPrimitive, long longPrimitive, float floatPrimitive, double doublePrimitive, Byte byteWrapper, Short shortWrapper, Character charWrapper, Integer intWrapper, Long longWrapper, Float floatWrapper, Double doubleWrapper, String string) {
        this.bytePrimitive = bytePrimitive;
        this.shortPrimitive = shortPrimitive;
        this.charPrimitive = charPrimitive;
        this.intPrimitive = intPrimitive;
        this.longPrimitive = longPrimitive;
        this.floatPrimitive = floatPrimitive;
        this.doublePrimitive = doublePrimitive;
        this.byteWrapper = byteWrapper;
        this.shortWrapper = shortWrapper;
        this.charWrapper = charWrapper;
        this.intWrapper = intWrapper;
        this.longWrapper = longWrapper;
        this.floatWrapper = floatWrapper;
        this.doubleWrapper = doubleWrapper;
        this.string = string;
    }

    public byte getBytePrimitive() {
        return bytePrimitive;
    }

    public void setBytePrimitive(byte bytePrimitive) {
        this.bytePrimitive = bytePrimitive;
    }

    public short getShortPrimitive() {
        return shortPrimitive;
    }

    public void setShortPrimitive(short shortPrimitive) {
        this.shortPrimitive = shortPrimitive;
    }

    public char getCharPrimitive() {
        return charPrimitive;
    }

    public void setCharPrimitive(char charPrimitive) {
        this.charPrimitive = charPrimitive;
    }

    public int getIntPrimitive() {
        return intPrimitive;
    }

    public void setIntPrimitive(int intPrimitive) {
        this.intPrimitive = intPrimitive;
    }

    public long getLongPrimitive() {
        return longPrimitive;
    }

    public void setLongPrimitive(long longPrimitive) {
        this.longPrimitive = longPrimitive;
    }

    public float getFloatPrimitive() {
        return floatPrimitive;
    }

    public void setFloatPrimitive(float floatPrimitive) {
        this.floatPrimitive = floatPrimitive;
    }

    public double getDoublePrimitive() {
        return doublePrimitive;
    }

    public void setDoublePrimitive(double doublePrimitive) {
        this.doublePrimitive = doublePrimitive;
    }

    public Byte getByteWrapper() {
        return byteWrapper;
    }

    public void setByteWrapper(Byte byteWrapper) {
        this.byteWrapper = byteWrapper;
    }

    public Short getShortWrapper() {
        return shortWrapper;
    }

    public void setShortWrapper(Short shortWrapper) {
        this.shortWrapper = shortWrapper;
    }

    public Character getCharWrapper() {
        return charWrapper;
    }

    public void setCharWrapper(Character charWrapper) {
        this.charWrapper = charWrapper;
    }

    public Integer getIntWrapper() {
        return intWrapper;
    }

    public void setIntWrapper(Integer intWrapper) {
        this.intWrapper = intWrapper;
    }

    public Long getLongWrapper() {
        return longWrapper;
    }

    public void setLongWrapper(Long longWrapper) {
        this.longWrapper = longWrapper;
    }

    public Float getFloatWrapper() {
        return floatWrapper;
    }

    public void setFloatWrapper(Float floatWrapper) {
        this.floatWrapper = floatWrapper;
    }

    public Double getDoubleWrapper() {
        return doubleWrapper;
    }

    public void setDoubleWrapper(Double doubleWrapper) {
        this.doubleWrapper = doubleWrapper;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllBasicTypes that = (AllBasicTypes) o;
        return bytePrimitive == that.bytePrimitive &&
                shortPrimitive == that.shortPrimitive &&
                charPrimitive == that.charPrimitive &&
                intPrimitive == that.intPrimitive &&
                longPrimitive == that.longPrimitive &&
                Float.compare(that.floatPrimitive, floatPrimitive) == 0 &&
                Double.compare(that.doublePrimitive, doublePrimitive) == 0 &&
                Objects.equals(byteWrapper, that.byteWrapper) &&
                Objects.equals(shortWrapper, that.shortWrapper) &&
                Objects.equals(charWrapper, that.charWrapper) &&
                Objects.equals(intWrapper, that.intWrapper) &&
                Objects.equals(longWrapper, that.longWrapper) &&
                Objects.equals(floatWrapper, that.floatWrapper) &&
                Objects.equals(doubleWrapper, that.doubleWrapper) &&
                Objects.equals(string, that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bytePrimitive, shortPrimitive, charPrimitive, intPrimitive, longPrimitive, floatPrimitive, doublePrimitive, byteWrapper, shortWrapper, charWrapper, intWrapper, longWrapper, floatWrapper, doubleWrapper, string);
    }

    @Override
    public String toString() {
        return "AllBasicTypes{" +
                "bytePrimitive=" + bytePrimitive +
                ", shortPrimitive=" + shortPrimitive +
                ", charPrimitive=" + charPrimitive +
                ", intPrimitive=" + intPrimitive +
                ", longPrimitive=" + longPrimitive +
                ", floatPrimitive=" + floatPrimitive +
                ", doublePrimitive=" + doublePrimitive +
                ", byteWrapper=" + byteWrapper +
                ", shortWrapper=" + shortWrapper +
                ", charWrapper=" + charWrapper +
                ", intWrapper=" + intWrapper +
                ", longWrapper=" + longWrapper +
                ", floatWrapper=" + floatWrapper +
                ", doubleWrapper=" + doubleWrapper +
                ", string='" + string + '\'' +
                '}';
    }
}