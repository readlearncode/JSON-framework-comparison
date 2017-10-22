package com.readlearncode.mapping.customised.runtime;

import com.readlearncode.mapping.customised.compiletime.ClassAdapter;
import com.readlearncode.mapping.customised.compiletime.CustomDeserializer;
import com.readlearncode.mapping.customised.compiletime.CustomSerializer;

import javax.json.bind.JsonbConfig;
import javax.json.bind.config.BinaryDataStrategy;
import javax.json.bind.config.PropertyNamingStrategy;
import javax.json.bind.config.PropertyOrderStrategy;
import javax.json.bind.config.PropertyVisibilityStrategy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RuntimeSampler {

    public JsonbConfig allConfigurations() {
        return new JsonbConfig()

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
                .setProperty("name", "firstName")

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
    }


}