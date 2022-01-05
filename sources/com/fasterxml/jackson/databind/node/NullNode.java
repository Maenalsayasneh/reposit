package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import i0.f.a.c.i;
import java.io.IOException;

public class NullNode extends ValueNode {
    public static final NullNode c = new NullNode();

    public final void b(JsonGenerator jsonGenerator, i iVar) throws IOException {
        iVar.z(jsonGenerator);
    }

    public boolean equals(Object obj) {
        return obj == this || (obj instanceof NullNode);
    }

    public int hashCode() {
        return JsonNodeType.NULL.ordinal();
    }

    public JsonToken v() {
        return JsonToken.VALUE_NULL;
    }
}
