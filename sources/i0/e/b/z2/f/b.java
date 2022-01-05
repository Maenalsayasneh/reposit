package i0.e.b.z2.f;

import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: AudioChannelData.kt */
public final class b {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final Boolean f;
    public final Boolean g;

    public b(int i, String str, String str2, boolean z, boolean z2, Boolean bool, Boolean bool2) {
        i.e(str2, "channelName");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = bool;
        this.g = bool2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && i.a(this.b, bVar.b) && i.a(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && i.a(this.f, bVar.f) && i.a(this.g, bVar.g);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int i = 0;
        int F = a.F(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (F + (z ? 1 : 0)) * 31;
        boolean z3 = this.e;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        Boolean bool = this.f;
        int hashCode2 = (i3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.g;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("AudioChannelData(userId=");
        P0.append(this.a);
        P0.append(", token=");
        P0.append(this.b);
        P0.append(", channelName=");
        P0.append(this.c);
        P0.append(", isSpeaker=");
        P0.append(this.d);
        P0.append(", isMuted=");
        P0.append(this.e);
        P0.append(", debugLogging=");
        P0.append(this.f);
        P0.append(", audioSpatialization=");
        P0.append(this.g);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, String str, String str2, boolean z, boolean z2, Boolean bool, Boolean bool2, int i2) {
        this(i, (i2 & 2) != 0 ? null : str, str2, z, z2, (Boolean) null, (Boolean) null);
        int i3 = i2 & 32;
        int i4 = i2 & 64;
    }
}
