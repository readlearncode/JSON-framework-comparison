package com.readlearncode.mapping._default.classes;

import java.util.Objects;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Child extends Parent {

    private String child = "Child";

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Child child1 = (Child) o;
        return Objects.equals(child, child1.child);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), child);
    }

    @Override
    public String toString() {
        return "Child{" +
                "child='" + child + '\'' +
                '}';
    }
}