package com.readlearncode.mapping.customised.runtime;

import com.readlearncode.mapping._default.basictypes.AllBasicTypes;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RuntimeSamplerTest {

    @Test
    public void test_using_gsonBuilder() {
        String expectedJson = "{\n" +
                "  \"byteprimitive\": 0,\n" +
                "  \"shortprimitive\": 0,\n" +
                "  \"charprimitive\": \"\\u0000\",\n" +
                "  \"intprimitive\": 0,\n" +
                "  \"longprimitive\": 0,\n" +
                "  \"floatprimitive\": 0.0,\n" +
                "  \"doubleprimitive\": 0.0,\n" +
                "  \"aboolean\": false,\n" +
                "  \"bytewrapper\": 0,\n" +
                "  \"shortwrapper\": 0,\n" +
                "  \"charwrapper\": \"\\u0000\",\n" +
                "  \"intwrapper\": 0,\n" +
                "  \"longwrapper\": 0,\n" +
                "  \"floatwrapper\": 0.0,\n" +
                "  \"doublewrapper\": 0.0,\n" +
                "  \"booleanwrapper\": false,\n" +
                "  \"string\": \"Hello World\"\n" +
                "}";
        String actualJson = RuntimeSampler.gsonBuilder().create().toJson(new AllBasicTypes());


        String cc = RuntimeSampler.gsonBuilder().create().fromJson("", String.class);



        assertThat(actualJson).isEqualTo(expectedJson);
    }

}