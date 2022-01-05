package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import i0.f.a.c.i;
import java.io.IOException;

public class IntNode extends NumericNode {
    public static final IntNode[] c = new IntNode[12];
    public final int d;

    static {
        for (int i = 0; i < 12; i++) {
            c[i] = new IntNode(i - 1);
        }
    }

    public IntNode(int i) {
        this.d = i;
    }

    public final void b(JsonGenerator jsonGenerator, i iVar) throws IOException, JsonProcessingException {
        jsonGenerator.g0(this.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof IntNode)) {
            return false;
        }
        if (((IntNode) obj).d == this.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.d;
    }

    public JsonToken v() {
        return JsonToken.VALUE_NUMBER_INT;
    }
}
