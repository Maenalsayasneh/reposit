package i0.e.b.g3.j;

import android.os.Bundle;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: ActivityFragmentDirections.kt */
public final class a0 implements l {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public a0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 15;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("channelId", this.a);
        bundle.putString("chatId", this.b);
        bundle.putString("waveUserId", this.c);
        bundle.putString("waveId", this.d);
        bundle.putInt("sourceLocation", this.e);
        return bundle;
    }

    public int b() {
        return R.id.action_activityFragment_to_hallwayFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return i.a(this.a, a0Var.a) && i.a(this.b, a0Var.b) && i.a(this.c, a0Var.c) && i.a(this.d, a0Var.d) && this.e == a0Var.e;
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
        StringBuilder P0 = a.P0("ActionActivityFragmentToHallwayFragment(channelId=");
        P0.append(this.a);
        P0.append(", chatId=");
        P0.append(this.b);
        P0.append(", waveUserId=");
        P0.append(this.c);
        P0.append(", waveId=");
        P0.append(this.d);
        P0.append(", sourceLocation=");
        return a.s0(P0, this.e, ')');
    }

    public a0(String str, String str2, String str3, String str4, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }
}
