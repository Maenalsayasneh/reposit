package com.fasterxml.jackson.databind.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;

public class JsonMapper extends ObjectMapper {
    public JsonMapper() {
        super(new JsonFactory(), (DefaultSerializerProvider) null, (DefaultDeserializationContext) null);
    }
}
