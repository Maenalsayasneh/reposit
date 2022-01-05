package i0.h.a.d.a.b;

import android.support.annotation.Nullable;
import i0.d.a.a.a;

public final class c0 extends a {
    public final String a;
    public final String b;

    public c0(int i, @Nullable String str, @Nullable String str2) {
        this.a = str;
        this.b = str2;
    }

    @Nullable
    public final String a() {
        return this.b;
    }

    public final int b() {
        return 0;
    }

    @Nullable
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (aVar.b() == 0 && ((str = this.a) != null ? str.equals(aVar.c()) : aVar.c() == null)) {
                String str2 = this.b;
                String a2 = aVar.a();
                if (str2 != null ? str2.equals(a2) : a2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ -721379959) * 1000003;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(0);
        sb.append(", path=");
        sb.append(str);
        return a.z0(sb, ", assetsPath=", str2, "}");
    }
}
