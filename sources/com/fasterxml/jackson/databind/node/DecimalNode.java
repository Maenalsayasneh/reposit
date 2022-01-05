package com.fasterxml.jackson.databind.node;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import i0.f.a.c.i;
import java.io.IOException;
import java.math.BigDecimal;

public class DecimalNode extends NumericNode {
    public static final DecimalNode c = new DecimalNode(BigDecimal.ZERO);
    public final BigDecimal d;

    static {
        BigDecimal.valueOf(-2147483648L);
        BigDecimal.valueOf(2147483647L);
        BigDecimal.valueOf(Long.MIN_VALUE);
        BigDecimal.valueOf(RecyclerView.FOREVER_NS);
    }

    public DecimalNode(BigDecimal bigDecimal) {
        this.d = bigDecimal;
    }

    public final void b(JsonGenerator jsonGenerator, i iVar) throws IOException, JsonProcessingException {
        jsonGenerator.n0(this.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof DecimalNode)) {
            return false;
        }
        if (((DecimalNode) obj).d.compareTo(this.d) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Double.valueOf(this.d.doubleValue()).hashCode();
    }

    public JsonToken v() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }
}
