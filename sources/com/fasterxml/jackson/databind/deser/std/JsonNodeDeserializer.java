package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import i0.f.a.c.e;
import java.io.IOException;
import java.util.Objects;

public class JsonNodeDeserializer extends BaseNodeDeserializer<e> {
    public static final JsonNodeDeserializer y = new JsonNodeDeserializer();

    public static final class ArrayDeserializer extends BaseNodeDeserializer<ArrayNode> {
        public static final ArrayDeserializer y = new ArrayDeserializer();

        public ArrayDeserializer() {
            super(ArrayNode.class, Boolean.TRUE);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            if (jsonParser.F0()) {
                return C0(jsonParser, deserializationContext, deserializationContext.q.h2);
            }
            deserializationContext.V(ArrayNode.class, jsonParser);
            throw null;
        }

        public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            ArrayNode arrayNode = (ArrayNode) obj;
            if (jsonParser.F0()) {
                F0(jsonParser, deserializationContext, arrayNode);
                return arrayNode;
            }
            deserializationContext.V(ArrayNode.class, jsonParser);
            throw null;
        }
    }

    public static final class ObjectDeserializer extends BaseNodeDeserializer<ObjectNode> {
        public static final ObjectDeserializer y = new ObjectDeserializer();

        public ObjectDeserializer() {
            super(ObjectNode.class, Boolean.TRUE);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            if (jsonParser.I0()) {
                return D0(jsonParser, deserializationContext, deserializationContext.q.h2);
            }
            if (jsonParser.y0(JsonToken.FIELD_NAME)) {
                return E0(jsonParser, deserializationContext, deserializationContext.q.h2);
            }
            if (jsonParser.y0(JsonToken.END_OBJECT)) {
                JsonNodeFactory jsonNodeFactory = deserializationContext.q.h2;
                Objects.requireNonNull(jsonNodeFactory);
                return new ObjectNode(jsonNodeFactory);
            }
            deserializationContext.V(ObjectNode.class, jsonParser);
            throw null;
        }

        public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            ObjectNode objectNode = (ObjectNode) obj;
            if (jsonParser.I0() || jsonParser.y0(JsonToken.FIELD_NAME)) {
                return (ObjectNode) G0(jsonParser, deserializationContext, objectNode);
            }
            deserializationContext.V(ObjectNode.class, jsonParser);
            throw null;
        }
    }

    public JsonNodeDeserializer() {
        super(e.class, (Boolean) null);
    }

    public Object b(DeserializationContext deserializationContext) throws JsonMappingException {
        Objects.requireNonNull(deserializationContext.q.h2);
        return NullNode.c;
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        int k = jsonParser.k();
        if (k == 1) {
            return D0(jsonParser, deserializationContext, deserializationContext.q.h2);
        }
        if (k != 3) {
            return B0(jsonParser, deserializationContext, deserializationContext.q.h2);
        }
        return C0(jsonParser, deserializationContext, deserializationContext.q.h2);
    }
}
