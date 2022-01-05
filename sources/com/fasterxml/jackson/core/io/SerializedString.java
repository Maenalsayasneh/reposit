package com.fasterxml.jackson.core.io;

import i0.f.a.b.f;
import i0.f.a.b.i.c;
import java.io.Serializable;

public class SerializedString implements f, Serializable {
    public static final c c = c.b;
    public final String d;
    public char[] q;

    public SerializedString(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    public final char[] a() {
        char[] cArr = this.q;
        if (cArr != null) {
            return cArr;
        }
        char[] a = c.a(this.d);
        this.q = a;
        return a;
    }

    public int b(char[] cArr, int i) {
        String str = this.d;
        int length = str.length();
        if (i + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i);
        return length;
    }

    public int c(char[] cArr, int i) {
        char[] cArr2 = this.q;
        if (cArr2 == null) {
            cArr2 = c.a(this.d);
            this.q = cArr2;
        }
        int length = cArr2.length;
        if (i + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArr2, 0, cArr, i, length);
        return length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != SerializedString.class) {
            return false;
        }
        return this.d.equals(((SerializedString) obj).d);
    }

    public final String getValue() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d;
    }
}
