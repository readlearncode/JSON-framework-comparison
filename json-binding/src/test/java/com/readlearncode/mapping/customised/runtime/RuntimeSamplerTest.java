package com.readlearncode.mapping.customised.runtime;

import com.readlearncode.mapping._default.basictypes.AllBasicTypes;
import org.junit.Test;

import javax.json.bind.JsonbBuilder;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RuntimeSamplerTest {

    @Test
    public void test_using_jsonbConfig() {
        String expectedJson = "\n" +
                "{\n" +
                "    \"string\": null,\n" +
                "    \"shortWrapper\": null,\n" +
                "    \"shortPrimitive\": null,\n" +
                "    \"longWrapper\": null,\n" +
                "    \"longPrimitive\": null,\n" +
                "    \"intWrapper\": null,\n" +
                "    \"intPrimitive\": null,\n" +
                "    \"floatWrapper\": null,\n" +
                "    \"floatPrimitive\": null,\n" +
                "    \"doubleWrapper\": null,\n" +
                "    \"doublePrimitive\": null,\n" +
                "    \"charWrapper\": null,\n" +
                "    \"charPrimitive\": null,\n" +
                "    \"byteWrapper\": null,\n" +
                "    \"bytePrimitive\": null,\n" +
                "    \"booleanWrapper\": null,\n" +
                "    \"aBoolean\": null\n" +
                "}";
        String actualJson = JsonbBuilder.create(RuntimeSampler.jsonbConfig()).toJson(new AllBasicTypes());
        assertThat(actualJson).isEqualTo(expectedJson);
    }

}