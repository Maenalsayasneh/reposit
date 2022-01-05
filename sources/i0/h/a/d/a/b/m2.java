package i0.h.a.d.a.b;

import android.support.annotation.Nullable;
import i0.d.a.a.a;
import java.util.Arrays;

public final class m2 {
    public final String a;
    public final long b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final byte[] f;

    public m2() {
    }

    public m2(@Nullable String str, long j, int i, boolean z, boolean z2, @Nullable byte[] bArr) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = bArr;
    }

    public final boolean a() {
        String str = this.a;
        if (str == null) {
            return false;
        }
        return str.endsWith("/");
    }

    public final boolean b() {
        return this.c == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            m2 m2Var = (m2) obj;
            String str = this.a;
            if (str != null ? str.equals(m2Var.a) : m2Var.a == null) {
                return this.b == m2Var.b && this.c == m2Var.c && this.d == m2Var.d && this.e == m2Var.e && Arrays.equals(this.f, m2Var.f);
            }
        }
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = 1237;
        int i2 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f);
    }

    public String toString() {
        String str = this.a;
        long j = this.b;
        int i = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        String arrays = Arrays.toString(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        return a.z0(sb, ", headerBytes=", arrays, "}");
    }
}
