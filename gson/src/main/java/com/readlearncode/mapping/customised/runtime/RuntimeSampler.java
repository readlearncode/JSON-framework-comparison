package com.readlearncode.mapping.customised.runtime;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.readlearncode.mapping._default.basictypes.AllBasicTypes;

import java.lang.reflect.Modifier;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RuntimeSampler {

    public static void main(String... args){

        String actualJson = new GsonBuilder()
                // Property visibility
                .serializeNulls()
                .setExclusionStrategies(new ExclusionStrategy(){
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
//                .registerTypeAdapter(String.class, (type) -> type))

                // Formats, locals, encoding, binary data
                .setDateFormat("MM/dd/yyyy")
                .setPrettyPrinting()
                .setLenient() // ???

                .create().toJson(new AllBasicTypes());

        System.out.print(actualJson);
    }
}

/*

               // Property visibility
                .withNullValues(true)
                .withPropertyVisibilityStrategy(new PropertyVisibilityStrategy() {
                    @Override
                    public boolean isVisible(Field field) {
                        return false;
                    }

                    @Override
                    public boolean isVisible(Method method) {
                        return false;
                    }
                })

                // Property naming and order
                .withPropertyNamingStrategy(PropertyNamingStrategy.CASE_INSENSITIVE)
                .withPropertyOrderStrategy(PropertyOrderStrategy.REVERSE)


                // Customised de/serializers
                .withAdapters(new ClassAdapter())
                .withDeserializers(new CustomDeserializer())
                .withSerializers(new CustomSerializer())

                // Formats, locals, encoding, binary data
                .withBinaryDataStrategy(BinaryDataStrategy.BASE_64_URL)
                .withDateFormat("MM/dd/yyyy", Locale.ENGLISH)
                .withLocale(Locale.CANADA)
                .withEncoding("UTF-8")
                .withStrictIJSON(true)
                .withFormatting(true);
 */