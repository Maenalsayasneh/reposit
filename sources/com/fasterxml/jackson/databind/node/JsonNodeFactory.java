package com.fasterxml.jackson.databind.node;

import java.io.Serializable;
import java.math.BigDecimal;

public class JsonNodeFactory implements Serializable {
    public static final JsonNodeFactory c;
    public static final JsonNodeFactory d;

    static {
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        c = jsonNodeFactory;
        d = jsonNodeFactory;
    }

    public JsonNodeFactory(boolean z) {
    }

    public BooleanNode a(boolean z) {
        if (z) {
            return BooleanNode.c;
        }
        return BooleanNode.d;
    }

    public ValueNode b(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return NullNode.c;
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            return DecimalNode.c;
        }
        return new DecimalNode(bigDecimal.stripTrailingZeros());
    }

    public TextNode c(String str) {
        TextNode textNode = TextNode.c;
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return TextNode.c;
        }
        return new TextNode(str);
    }
}
