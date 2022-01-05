package com.pubnub.api.managers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t0.b0.a.a;
import t0.h;

public class MapperManager {
    private final h.a converterFactory;
    private final ObjectMapper jacksonObjectMapper = new ObjectMapper();
    private final Gson objectMapper;

    /* renamed from: com.pubnub.api.managers.MapperManager$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.gson.stream.JsonToken.values()
                r0 = 10
                int[] r0 = new int[r0]
                $SwitchMap$com$google$gson$stream$JsonToken = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pubnub.api.managers.MapperManager.AnonymousClass2.<clinit>():void");
        }
    }

    public static class JSONArrayAdapter implements JsonSerializer<JSONArray>, JsonDeserializer<JSONArray> {
        private JSONArrayAdapter() {
        }

        public JSONArray deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if (jsonElement == null) {
                return null;
            }
            try {
                return new JSONArray(jsonElement.toString());
            } catch (JSONException e) {
                e.printStackTrace();
                throw new JsonParseException((Throwable) e);
            }
        }

        public JsonElement serialize(JSONArray jSONArray, Type type, JsonSerializationContext jsonSerializationContext) {
            if (jSONArray == null) {
                return null;
            }
            JsonArray jsonArray = new JsonArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object opt = jSONArray.opt(i);
                jsonArray.add(jsonSerializationContext.serialize(opt, opt.getClass()));
            }
            return jsonArray;
        }
    }

    public static class JSONObjectAdapter implements JsonSerializer<JSONObject>, JsonDeserializer<JSONObject> {
        private JSONObjectAdapter() {
        }

        public JSONObject deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if (jsonElement == null) {
                return null;
            }
            try {
                return new JSONObject(jsonElement.toString());
            } catch (JSONException e) {
                e.printStackTrace();
                throw new JsonParseException((Throwable) e);
            }
        }

        public JsonElement serialize(JSONObject jSONObject, Type type, JsonSerializationContext jsonSerializationContext) {
            if (jSONObject == null) {
                return null;
            }
            JsonObject jsonObject = new JsonObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                jsonObject.add(next, jsonSerializationContext.serialize(opt, opt.getClass()));
            }
            return jsonObject;
        }
    }

    public MapperManager() {
        TypeAdapter<Boolean> booleanTypeAdapter = getBooleanTypeAdapter();
        this.objectMapper = new GsonBuilder().registerTypeAdapter(Boolean.class, booleanTypeAdapter).registerTypeAdapter(Boolean.TYPE, booleanTypeAdapter).registerTypeAdapter(JSONObject.class, new JSONObjectAdapter()).registerTypeAdapter(JSONArray.class, new JSONArrayAdapter()).create();
        Gson objectMapper2 = getObjectMapper();
        Objects.requireNonNull(objectMapper2, "gson == null");
        this.converterFactory = new a(objectMapper2);
    }

    private TypeAdapter<Boolean> getBooleanTypeAdapter() {
        return new TypeAdapter<Boolean>() {
            public Boolean read(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                int ordinal = peek.ordinal();
                if (ordinal == 5) {
                    return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
                }
                if (ordinal == 6) {
                    return Boolean.valueOf(jsonReader.nextInt() != 0);
                } else if (ordinal == 7) {
                    return Boolean.valueOf(jsonReader.nextBoolean());
                } else {
                    throw new IllegalStateException("Expected BOOLEAN or NUMBER but was " + peek);
                }
            }

            public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                if (bool == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(bool);
                }
            }
        };
    }

    public <T> T convertValue(JsonElement jsonElement, Class cls) {
        return this.objectMapper.fromJson(jsonElement, cls);
    }

    public int elementToInt(JsonElement jsonElement, String str) {
        return jsonElement.getAsJsonObject().get(str).getAsInt();
    }

    public Long elementToLong(JsonElement jsonElement) {
        return Long.valueOf(jsonElement.getAsLong());
    }

    public String elementToString(JsonElement jsonElement) {
        return jsonElement.getAsString();
    }

    public <T> T fromJson(String str, Class<T> cls) throws PubNubException {
        try {
            return this.objectMapper.fromJson(str, cls);
        } catch (JsonParseException e) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).errormsg(e.getMessage()).cause(e).build();
        }
    }

    public JsonElement getArrayElement(JsonElement jsonElement, int i) {
        return jsonElement.getAsJsonArray().get(i);
    }

    public Iterator<JsonElement> getArrayIterator(JsonElement jsonElement) {
        return jsonElement.getAsJsonArray().iterator();
    }

    public JsonArray getAsArray(JsonElement jsonElement) {
        return jsonElement.getAsJsonArray();
    }

    public boolean getAsBoolean(JsonElement jsonElement, String str) {
        return jsonElement.getAsJsonObject().get(str).getAsBoolean();
    }

    public JsonObject getAsObject(JsonElement jsonElement) {
        return jsonElement.getAsJsonObject();
    }

    public h.a getConverterFactory() {
        return this.converterFactory;
    }

    public JsonElement getField(JsonElement jsonElement, String str) {
        return jsonElement.getAsJsonObject().get(str);
    }

    public Iterator<Map.Entry<String, JsonElement>> getObjectIterator(JsonElement jsonElement) {
        return jsonElement.getAsJsonObject().entrySet().iterator();
    }

    public Gson getObjectMapper() {
        return this.objectMapper;
    }

    public boolean hasField(JsonElement jsonElement, String str) {
        return jsonElement.getAsJsonObject().has(str);
    }

    public boolean isJsonObject(JsonElement jsonElement) {
        return jsonElement.isJsonObject();
    }

    public void isValidJsonObject(Object obj) throws PubNubException {
        if (!isJsonObject(new JsonParser().parse(toJson(obj)))) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_JSON).build();
        }
    }

    public void putOnObject(JsonObject jsonObject, String str, JsonElement jsonElement) {
        jsonObject.add(str, jsonElement);
    }

    public String toJson(Object obj) throws PubNubException {
        try {
            return this.objectMapper.toJson(obj);
        } catch (JsonParseException e) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_JSON_ERROR).errormsg(e.getMessage()).cause(e).build();
        }
    }

    public String toJsonUsinJackson(Object obj) throws PubNubException {
        try {
            return this.jacksonObjectMapper.f(obj);
        } catch (JsonProcessingException e) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_JSON_ERROR).errormsg(e.getMessage()).cause(e).build();
        }
    }

    public <T> T convertValue(Object obj, Class cls) throws PubNubException {
        return fromJson(toJson(obj), cls);
    }

    public Long elementToLong(JsonElement jsonElement, String str) {
        return Long.valueOf(jsonElement.getAsJsonObject().get(str).getAsLong());
    }

    public String elementToString(JsonElement jsonElement, String str) {
        return jsonElement.getAsJsonObject().get(str).getAsString();
    }

    public Iterator<JsonElement> getArrayIterator(JsonElement jsonElement, String str) {
        return jsonElement.getAsJsonObject().get(str).getAsJsonArray().iterator();
    }

    public Iterator<Map.Entry<String, JsonElement>> getObjectIterator(JsonElement jsonElement, String str) {
        return jsonElement.getAsJsonObject().get(str).getAsJsonObject().entrySet().iterator();
    }
}
