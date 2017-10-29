package com.readlearncode.mapping.customised.runtime;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RuntimeSampler {

    public static ObjectMapper objectMapper() {
        return new ObjectMapper()
                // Property visibility
                .setDefaultPropertyInclusion(JsonInclude.Include.ALWAYS)
                .setDefaultVisibility(JsonAutoDetect.Value.construct(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC))
                .configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .configure(SerializationFeature.WRITE_NULL_MAP_VALUES, true)

                // Property naming and order
                .setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE)

                // Customised de/serializers

                // Formats, locals, encoding, binary data
                .setDateFormat(new SimpleDateFormat("MM/dd/yyyy"))
                .setDefaultPrettyPrinter(new DefaultPrettyPrinter())
                .setLocale(Locale.CANADA);
    }

}