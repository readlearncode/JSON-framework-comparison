package com.readlearncode.mapping._default.classes;

import java.util.Objects;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Parent {

    private String parentName = "Parent";

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return Objects.equals(parentName, parent.parentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentName);
    }

    @Override
    public String toString() {
        return "Parent{" +
                "parentName='" + parentName + '\'' +
                '}';
    }
}