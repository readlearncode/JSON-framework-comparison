package com.readlearncode.mapping.customised.runtime;

import com.readlearncode.mapping._default.basictypes.AllBasicTypes;
import org.junit.Test;
import java.io.IOException;
import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RuntimeSamplerTest {

    @Test
    public void test_using_customised_objectMapper() throws IOException {
        String expectedJson = "{\"aBoolean\":false,\"booleanWrapper\":false,\"bytePrimitive\":0,\"byteWrapper\":0,\"charPrimitive\":\"\\u0000\",\"charWrapper\":\"\\u0000\",\"doublePrimitive\":0.0,\"doubleWrapper\":0.0,\"floatPrimitive\":0.0,\"floatWrapper\":0.0,\"intPrimitive\":0,\"intWrapper\":0,\"longPrimitive\":0,\"longWrapper\":0,\"shortPrimitive\":0,\"shortWrapper\":0,\"string\":\"Hello World\"}";
        String actualJson = RuntimeSampler.objectMapper().writeValueAsString(new AllBasicTypes());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}