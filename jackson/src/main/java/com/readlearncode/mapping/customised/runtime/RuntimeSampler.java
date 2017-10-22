package com.readlearncode.mapping.customised.runtime;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.readlearncode.mapping._default.javatypes.JavaTypes;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RuntimeSampler {

    public static void main(String... args) throws JsonProcessingException, MalformedURLException, URISyntaxException {
        ObjectMapper objectMapper = new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE);
        String actualJson = objectMapper.writeValueAsString(new JavaTypes());
        System.out.print(actualJson);
    }

}