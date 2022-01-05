package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import i0.f.a.c.i;
import java.io.IOException;

public class BooleanNode extends ValueNode {
    public static final BooleanNode c = new BooleanNode(true);
    public static final BooleanNode d = new BooleanNode(false);
    public final boolean q;

    public BooleanNode(boolean z) {
        this.q = z;
    }

    public final void b(JsonGenerator jsonGenerator, i iVar) throws IOException {
        jsonGenerator.O(this.q);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof BooleanNode)) {
            return false;
        }
        if (this.q == ((BooleanNode) obj).q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.q ? 3 : 1;
    }

    public JsonToken v() {
        return this.q ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE;
    }
}
