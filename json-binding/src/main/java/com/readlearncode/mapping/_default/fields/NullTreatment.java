package com.readlearncode.mapping._default.fields;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class NullTreatment {

    private String string = null;
    private Optional<String> stringOptional = null;
    private Optional<Object> objectOptional = Optional.empty();
    private List<String> stringList = new ArrayList<String>(){{add(null);}};

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Optional<String> getStringOptional() {
        return stringOptional;
    }

    public void setStringOptional(Optional<String> stringOptional) {
        this.stringOptional = stringOptional;
    }

    public Optional<Object> getObjectOptional() {
        return objectOptional;
    }

    public void setObjectOptional(Optional<Object> objectOptional) {
        this.objectOptional = objectOptional;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NullTreatment that = (NullTreatment) o;
        return Objects.equals(string, that.string) &&
                Objects.equals(stringOptional, that.stringOptional) &&
                Objects.equals(objectOptional, that.objectOptional) &&
                Objects.equals(stringList, that.stringList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string, stringOptional, objectOptional, stringList);
    }

    @Override
    public String toString() {
        return "NullTreatment{" +
                "string='" + string + '\'' +
                ", stringOptional=" + stringOptional +
                ", objectOptional=" + objectOptional +
                ", stringList=" + stringList +
                '}';
    }
}