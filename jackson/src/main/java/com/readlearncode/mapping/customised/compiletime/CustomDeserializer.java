package com.readlearncode.mapping.customised.compiletime;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CustomDeserializer extends StdDeserializer<CompileTimeSampler> {
    protected CustomDeserializer(Class<?> vc) {
        super(vc);
    }

    protected CustomDeserializer(JavaType valueType) {
        super(valueType);
    }

    protected CustomDeserializer(StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public CompileTimeSampler deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return null;
    }
}