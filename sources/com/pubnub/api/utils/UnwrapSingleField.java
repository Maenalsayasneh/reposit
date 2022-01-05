package com.pubnub.api.utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import i0.d.a.a.a;
import java.lang.reflect.Type;

public class UnwrapSingleField<T> implements JsonDeserializer<T> {
    public T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.keySet().size() == 1) {
            return jsonDeserializationContext.deserialize(asJsonObject.get(((String[]) asJsonObject.keySet().toArray(new String[0]))[0]), type);
        }
        StringBuilder P0 = a.P0("Couldn't unwrap field for object containing more than 1 field. Actual number of fields: ");
        P0.append(asJsonObject.keySet().size());
        throw new IllegalStateException(P0.toString());
    }
}
