package i0.e.b.g3.p;

import android.os.Bundle;

/* compiled from: HallwayFragmentArgs.kt */
public final class i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    /* compiled from: HallwayFragmentArgs.kt */
    public static final class a {
        public static final i a(Bundle bundle) {
            m0.n.b.i.e(bundle, "bundle");
            bundle.setClassLoader(i.class.getClassLoader());
            String str = null;
            String string = bundle.containsKey("channelId") ? bundle.getString("channelId") : null;
            String string2 = bundle.containsKey("chatId") ? bundle.getString("chatId") : null;
            String string3 = bundle.containsKey("waveUserId") ? bundle.getString("waveUserId") : null;
            if (bundle.containsKey("waveId")) {
                str = bundle.getString("waveId");
            }
            return new i(string, string2, string3, str, bundle.containsKey("sourceLocation") ? bundle.getInt("sourceLocation") : 15);
        }
    }

    public i() {
        this((String) null, (String) null, (String) null, (String) null, 0, 31);
    }

    public i(String str, String str2, String str3, String str4, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public static final i fromBundle(Bundle bundle) {
        return a.a(bundle);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("channelId", this.a);
        bundle.putString("chatId", this.b);
        bundle.putString("waveUserId", this.c);
        bundle.putString("waveId", this.d);
        bundle.putInt("sourceLocation", this.e);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m0.n.b.i.a(this.a, iVar.a) && m0.n.b.i.a(this.b, iVar.b) && m0.n.b.i.a(this.c, iVar.c) && m0.n.b.i.a(this.d, iVar.d) && this.e == iVar.e;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return Integer.hashCode(this.e) + ((hashCode3 + i) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("HallwayFragmentArgs(channelId=");
        P0.append(this.a);
        P0.append(", chatId=");
        P0.append(this.b);
        P0.append(", waveUserId=");
        P0.append(this.c);
        P0.append(", waveId=");
        P0.append(this.d);
        P0.append(", sourceLocation=");
        return i0.d.a.a.a.s0(P0, this.e, ')');
    }

    public i(String str, String str2, String str3, String str4, int i, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        str3 = (i2 & 4) != 0 ? null : str3;
        str4 = (i2 & 8) != 0 ? null : str4;
        i = (i2 & 16) != 0 ? 15 : i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }
}
