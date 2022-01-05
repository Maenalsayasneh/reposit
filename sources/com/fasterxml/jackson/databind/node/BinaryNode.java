package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import i0.f.a.c.i;
import java.io.IOException;
import java.util.Arrays;

public class BinaryNode extends ValueNode {
    public static final BinaryNode c = new BinaryNode(new byte[0]);
    public final byte[] d;

    public BinaryNode(byte[] bArr) {
        this.d = bArr;
    }

    public final void b(JsonGenerator jsonGenerator, i iVar) throws IOException, JsonProcessingException {
        Base64Variant base64Variant = iVar.q.d.e2;
        byte[] bArr = this.d;
        jsonGenerator.M(base64Variant, bArr, 0, bArr.length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BinaryNode)) {
            return Arrays.equals(((BinaryNode) obj).d, this.d);
        }
        return false;
    }

    public int hashCode() {
        byte[] bArr = this.d;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    public JsonToken v() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }
}
