package com.readlearncode.mapping._default.jsonprocessing;


import javax.json.*;
import java.util.Objects;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class JsonProcessingTypes {

    private JsonObject jsonObject = Json.createObjectBuilder().add("firstName", "Alex").add("lastName", "Theedom").build();
    private JsonValue jsonValue = Json.createValue("House");
    private JsonArray jsonArray = Json.createArrayBuilder().add("Cat").add("Dog").build();
    private JsonString jsonString = Json.createValue("Flat");
    private JsonNumber jsonNumber = Json.createValue(100);

    public JsonObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public JsonValue getJsonValue() {
        return jsonValue;
    }

    public void setJsonValue(JsonValue jsonValue) {
        this.jsonValue = jsonValue;
    }

    public JsonArray getJsonArray() {
        return jsonArray;
    }

    public void setJsonArray(JsonArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    public JsonString getJsonString() {
        return jsonString;
    }

    public void setJsonString(JsonString jsonString) {
        this.jsonString = jsonString;
    }

    public JsonNumber getJsonNumber() {
        return jsonNumber;
    }

    public void setJsonNumber(JsonNumber jsonNumber) {
        this.jsonNumber = jsonNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonProcessingTypes that = (JsonProcessingTypes) o;
        return Objects.equals(jsonObject, that.jsonObject) &&
                Objects.equals(jsonValue, that.jsonValue) &&
                Objects.equals(jsonArray, that.jsonArray) &&
                Objects.equals(jsonString, that.jsonString) &&
                Objects.equals(jsonNumber, that.jsonNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jsonObject, jsonValue, jsonArray, jsonString, jsonNumber);
    }

    @Override
    public String toString() {
        return "JsonProcessingTypes{" +
                "jsonObject=" + jsonObject +
                ", jsonValue=" + jsonValue +
                ", jsonArray=" + jsonArray +
                ", jsonString=" + jsonString +
                ", jsonNumber=" + jsonNumber +
                '}';
    }
}