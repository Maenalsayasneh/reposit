package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import i0.f.a.c.i;
import java.io.IOException;

public class TextNode extends ValueNode {
    public static final TextNode c = new TextNode("");
    public final String d;

    public TextNode(String str) {
        this.d = str;
    }

    public final void b(JsonGenerator jsonGenerator, i iVar) throws IOException {
        String str = this.d;
        if (str == null) {
            jsonGenerator.c0();
        } else {
            jsonGenerator.Q0(str);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof TextNode)) {
            return ((TextNode) obj).d.equals(this.d);
        }
        return false;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public JsonToken v() {
        return JsonToken.VALUE_STRING;
    }
}
