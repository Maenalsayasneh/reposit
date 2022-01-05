package com.fasterxml.jackson.databind.node;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import i0.f.a.c.i;
import java.io.IOException;
import java.math.BigInteger;

public class BigIntegerNode extends NumericNode {
    public final BigInteger c;

    static {
        BigInteger.valueOf(-2147483648L);
        BigInteger.valueOf(2147483647L);
        BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger.valueOf(RecyclerView.FOREVER_NS);
    }

    public BigIntegerNode(BigInteger bigInteger) {
        this.c = bigInteger;
    }

    public final void b(JsonGenerator jsonGenerator, i iVar) throws IOException, JsonProcessingException {
        jsonGenerator.p0(this.c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BigIntegerNode)) {
            return ((BigIntegerNode) obj).c.equals(this.c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public JsonToken v() {
        return JsonToken.VALUE_NUMBER_INT;
    }
}
