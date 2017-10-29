package com.readlearncode.mapping.customised.runtime;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RuntimeSampler {

    public static GsonBuilder gsonBuilder() {

        return new GsonBuilder()

                // Property visibility
                .serializeNulls()
                .setExclusionStrategies(new ExclusionStrategy() {
                    @Override
                    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
                        return false;
                    }

                    @Override
                    public boolean shouldSkipClass(Class<?> aClass) {
                        return false;
                    }
                })
                .excludeFieldsWithModifiers(Modifier.PROTECTED)

                // Property naming and order
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setFieldNamingStrategy((field) -> field.getName().toLowerCase())

                // Customised de/serializers

                // Formats, locals, encoding, binary data
                .setDateFormat("MM/dd/yyyy")
                .setPrettyPrinting();
    }
}
