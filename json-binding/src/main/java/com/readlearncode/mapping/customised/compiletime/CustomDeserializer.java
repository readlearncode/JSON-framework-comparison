package com.readlearncode.mapping.customised.compiletime;

import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.stream.JsonParser;
import java.lang.reflect.Type;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CustomDeserializer implements JsonbDeserializer<CompileTimeSampler> {
    @Override
    public CompileTimeSampler deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
        return null;
    }
}