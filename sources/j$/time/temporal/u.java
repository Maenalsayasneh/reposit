package j$.time.temporal;

import j$.time.c;
import java.io.Serializable;

public final class u implements Serializable {
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    private u(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    private String c(p pVar, long j) {
        if (pVar != null) {
            return "Invalid value for " + pVar + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    public static u i(long j, long j2) {
        if (j <= j2) {
            return new u(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static u j(long j, long j2, long j3) {
        return k(j, j, j2, j3);
    }

    public static u k(long j, long j2, long j3, long j4) {
        if (j > j2) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j3 > j4) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (j2 <= j4) {
            return new u(j, j2, j3, j4);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    public int a(long j, p pVar) {
        if (g() && h(j)) {
            return (int) j;
        }
        throw new c(c(pVar, j));
    }

    public long b(long j, p pVar) {
        if (h(j)) {
            return j;
        }
        throw new c(c(pVar, j));
    }

    public long d() {
        return this.d;
    }

    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && this.b == uVar.b && this.c == uVar.c && this.d == uVar.d;
    }

    public boolean f() {
        return this.a == this.b && this.c == this.d;
    }

    public boolean g() {
        return this.a >= -2147483648L && this.d <= 2147483647L;
    }

    public boolean h(long j) {
        return j >= this.a && j <= this.d;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = j + (j2 << 16) + (j2 >> 48);
        long j4 = this.c;
        long j5 = j3 + (j4 << 32) + (j4 >> 32);
        long j6 = this.d;
        long j7 = j5 + (j6 << 48) + (j6 >> 16);
        return (int) (j7 ^ (j7 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.a != this.b) {
            sb.append('/');
            sb.append(this.b);
        }
        sb.append(" - ");
        sb.append(this.c);
        if (this.c != this.d) {
            sb.append('/');
            sb.append(this.d);
        }
        return sb.toString();
    }
}
