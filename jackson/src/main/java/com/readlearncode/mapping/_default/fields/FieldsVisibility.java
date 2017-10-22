package com.readlearncode.mapping._default.fields;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class FieldsVisibility {

    private String privateString = "";
    String defaultString = "";
    protected String protectedString = "";
    public String publicString = "";

    final private String finalPrivateString = "";
    final public String finalPublicString = "";

    static public String STATIC_PUBLIC_STRING = "";

    // With getter and setters

    private String privateStringWithSetterGetter = "";
    String defaultStringWithSetterGetter = "";
    protected String protectedStringWithSetterGetter = "";
    public String publicStringWithSetterGetter = "";

    final private String finalPrivateStringWithSetterGetter = "";
    final public String finalPublicStringWithSetterGetter = "";

    static public String STATIC_PUBLIC_STRING_WITH_SETTER_GETTER = "";


    public String getVirtualField() {
        return "";
    }

    public String getPrivateStringWithSetterGetter() {
        return privateStringWithSetterGetter;
    }

    public void setPrivateStringWithSetterGetter(String privateStringWithSetterGetter) {
        this.privateStringWithSetterGetter = privateStringWithSetterGetter;
    }

    public String getDefaultStringWithSetterGetter() {
        return defaultStringWithSetterGetter;
    }

    public void setDefaultStringWithSetterGetter(String defaultStringWithSetterGetter) {
        this.defaultStringWithSetterGetter = defaultStringWithSetterGetter;
    }

    public String getProtectedStringWithSetterGetter() {
        return protectedStringWithSetterGetter;
    }

    public void setProtectedStringWithSetterGetter(String protectedStringWithSetterGetter) {
        this.protectedStringWithSetterGetter = protectedStringWithSetterGetter;
    }

    public String getPublicStringWithSetterGetter() {
        return publicStringWithSetterGetter;
    }

    public void setPublicStringWithSetterGetter(String publicStringWithSetterGetter) {
        this.publicStringWithSetterGetter = publicStringWithSetterGetter;
    }

    public String getFinalPrivateStringWithSetterGetter() {
        return finalPrivateStringWithSetterGetter;
    }

    public String getFinalPublicStringWithSetterGetter() {
        return finalPublicStringWithSetterGetter;
    }

    public static String getStaticPublicStringWithSetterGetter() {
        return STATIC_PUBLIC_STRING_WITH_SETTER_GETTER;
    }

    public static void setStaticPublicStringWithSetterGetter(String staticPublicStringWithSetterGetter) {
        STATIC_PUBLIC_STRING_WITH_SETTER_GETTER = staticPublicStringWithSetterGetter;
    }
}