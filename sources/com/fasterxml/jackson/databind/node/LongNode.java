package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import i0.f.a.c.i;
import java.io.IOException;

public class LongNode extends NumericNode {
    public final long c;

    public LongNode(long j) {
        this.c = j;
    }

    public final void b(JsonGenerator jsonGenerator, i iVar) throws IOException, JsonProcessingException {
        jsonGenerator.i0(this.c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof LongNode)) {
            return false;
        }
        if (((LongNode) obj).c == this.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.c;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    public JsonToken v() {
        return JsonToken.VALUE_NUMBER_INT;
    }
}
