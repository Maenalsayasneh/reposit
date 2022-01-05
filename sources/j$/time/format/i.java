package j$.time.format;

import j$.com.android.tools.r8.a;
import java.util.concurrent.ConcurrentHashMap;

public final class i {
    public static final i a = new i('0', '+', '-', '.');
    private final char b;
    private final char c;
    private final char d;
    private final char e;

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private i(char c2, char c3, char c4, char c5) {
        this.b = c2;
        this.c = c3;
        this.d = c4;
        this.e = c5;
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        char c2 = this.b;
        if (c2 == '0') {
            return str;
        }
        int i = c2 - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }

    /* access modifiers changed from: package-private */
    public int b(char c2) {
        int i = c2 - this.b;
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    public char c() {
        return this.e;
    }

    public char d() {
        return this.d;
    }

    public char e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.b == iVar.b && this.c == iVar.c && this.d == iVar.d && this.e == iVar.e;
    }

    public char f() {
        return this.b;
    }

    public int hashCode() {
        return this.b + this.c + this.d + this.e;
    }

    public String toString() {
        StringBuilder b2 = a.b("DecimalStyle[");
        b2.append(this.b);
        b2.append(this.c);
        b2.append(this.d);
        b2.append(this.e);
        b2.append("]");
        return b2.toString();
    }
}
