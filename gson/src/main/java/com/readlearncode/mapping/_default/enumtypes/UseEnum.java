package com.readlearncode.mapping._default.enumtypes;

import java.util.Objects;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class UseEnum {

    private EnumTypes hard = EnumTypes.HARD;
    private EnumTypes soft = EnumTypes.SOFT;

    public EnumTypes getHard() {
        return hard;
    }

    public void setHard(EnumTypes hard) {
        this.hard = hard;
    }

    public EnumTypes getSoft() {
        return soft;
    }

    public void setSoft(EnumTypes soft) {
        this.soft = soft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UseEnum useEnum = (UseEnum) o;
        return hard == useEnum.hard &&
                soft == useEnum.soft;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hard, soft);
    }

    @Override
    public String toString() {
        return "UseEnum{" +
                "hard=" + hard +
                ", soft=" + soft +
                '}';
    }
}