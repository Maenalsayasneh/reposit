package com.pubnub.api.models.consumer.objects_api.util;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class CustomPayloadJsonInterceptor implements JsonDeserializer<Object>, JsonSerializer<Object> {
    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return jsonElement;
    }

    public JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonParser().parse(new Gson().toJson(obj));
    }
}
