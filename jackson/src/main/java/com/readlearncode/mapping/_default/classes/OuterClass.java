package com.readlearncode.mapping._default.classes;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class OuterClass {

    private String name = "OuterClass";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class InnerClass {

        private String name = "Inner Class";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}