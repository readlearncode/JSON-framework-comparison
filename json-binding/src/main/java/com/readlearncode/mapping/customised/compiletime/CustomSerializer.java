package com.readlearncode.mapping.customised.compiletime;

import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CustomSerializer implements JsonbSerializer<CompileTimeSampler> {
    @Override
    public void serialize(CompileTimeSampler obj, JsonGenerator generator, SerializationContext ctx) {

    }
}