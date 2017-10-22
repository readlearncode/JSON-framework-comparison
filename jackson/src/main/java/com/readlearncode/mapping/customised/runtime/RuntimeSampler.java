package com.readlearncode.mapping.customised.runtime;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.util.Locale;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RuntimeSampler {

    public ObjectMapper allConfigurations() {
        return new ObjectMapper()
                // Property visibility
                .setDefaultPropertyInclusion(JsonInclude.Include.ALWAYS)
                .setDefaultVisibility(JsonAutoDetect.Value.construct(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC))
                .configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true)

                // Property naming and order
                .setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE)

                // Customised de/serializers
              //  .setSerializerFactory()

                // Formats, locals, encoding, binary data
                //.setDateFormat()
                .setDefaultPrettyPrinter(new DefaultPrettyPrinter())
                .setLocale(Locale.CANADA);

    }

}