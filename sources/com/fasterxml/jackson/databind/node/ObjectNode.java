package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializationFeature;
import i0.f.a.c.e;
import i0.f.a.c.i;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class ObjectNode extends ContainerNode<ObjectNode> implements Serializable {
    public final Map<String, e> d = new LinkedHashMap();

    public ObjectNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
    }

    public void b(JsonGenerator jsonGenerator, i iVar) throws IOException {
        boolean z = iVar != null && !iVar.Y(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
        jsonGenerator.N0(this);
        for (Map.Entry next : this.d.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) next.getValue();
            if (z) {
                Objects.requireNonNull(baseJsonNode);
                if ((baseJsonNode instanceof ArrayNode) && baseJsonNode.e(iVar)) {
                }
            }
            jsonGenerator.b0((String) next.getKey());
            baseJsonNode.b(jsonGenerator, iVar);
        }
        jsonGenerator.U();
    }

    public void c(JsonGenerator jsonGenerator, i iVar, i0.f.a.c.p.e eVar) throws IOException {
        boolean z = iVar != null && !iVar.Y(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(this, JsonToken.START_OBJECT));
        for (Map.Entry next : this.d.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) next.getValue();
            if (z) {
                Objects.requireNonNull(baseJsonNode);
                if ((baseJsonNode instanceof ArrayNode) && baseJsonNode.e(iVar)) {
                }
            }
            jsonGenerator.b0((String) next.getKey());
            baseJsonNode.b(jsonGenerator, iVar);
        }
        eVar.f(jsonGenerator, e);
    }

    public boolean e(i iVar) {
        return this.d.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ObjectNode)) {
            return this.d.equals(((ObjectNode) obj).d);
        }
        return false;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public Iterator<e> k() {
        return this.d.values().iterator();
    }

    public e w(String str, e eVar) {
        if (eVar == null) {
            eVar = v();
        }
        return this.d.put(str, eVar);
    }
}
