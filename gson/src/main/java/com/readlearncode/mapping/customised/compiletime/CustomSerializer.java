package com.readlearncode.mapping.customised.compiletime;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CustomSerializer extends StdSerializer<CompileTimeSampler> {

    protected CustomSerializer(Class<CompileTimeSampler> t) {
        super(t);
    }

    protected CustomSerializer(JavaType type) {
        super(type);
    }

    protected CustomSerializer(Class<?> t, boolean dummy) {
        super(t, dummy);
    }

    protected CustomSerializer(StdSerializer<?> src) {
        super(src);
    }

    @Override
    public void serialize(CompileTimeSampler value, JsonGenerator gen, SerializerProvider provider) throws IOException {

    }
}