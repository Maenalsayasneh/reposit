package i0.e.b.g3.i;

import androidx.core.app.NotificationCompat;
import com.clubhouse.android.ui.actionsheet.Action$1;
import m0.i;
import m0.n.a.a;

/* compiled from: Action.kt */
public final class c {
    public Integer a;
    public Integer b;
    public Integer c;
    public String d;
    public String e;
    public boolean f;
    public a<i> g;

    public c() {
        this((Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, false, (a) null, 127);
    }

    public c(Integer num, Integer num2, Integer num3, String str, String str2, boolean z, a aVar, int i) {
        int i2 = i & 1;
        int i3 = i & 2;
        int i4 = i & 4;
        String str3 = (i & 8) != 0 ? "" : null;
        int i5 = i & 16;
        z = (i & 32) != 0 ? false : z;
        Action$1 action$1 = (i & 64) != 0 ? Action$1.c : null;
        m0.n.b.i.e(str3, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        m0.n.b.i.e(action$1, "action");
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = str3;
        this.e = null;
        this.f = z;
        this.g = action$1;
    }

    public final void a(a<i> aVar) {
        m0.n.b.i.e(aVar, "<set-?>");
        this.g = aVar;
    }

    public final void b(String str) {
        m0.n.b.i.e(str, "<set-?>");
        this.d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m0.n.b.i.a(this.a, cVar.a) && m0.n.b.i.a(this.b, cVar.b) && m0.n.b.i.a(this.c, cVar.c) && m0.n.b.i.a(this.d, cVar.d) && m0.n.b.i.a(this.e, cVar.e) && this.f == cVar.f && m0.n.b.i.a(this.g, cVar.g);
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int F = i0.d.a.a.a.F(this.d, (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31, 31);
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (F + i) * 31;
        boolean z = this.f;
        if (z) {
            z = true;
        }
        return this.g.hashCode() + ((i2 + (z ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Action(icon=");
        P0.append(this.a);
        P0.append(", textColor=");
        P0.append(this.b);
        P0.append(", iconColor=");
        P0.append(this.c);
        P0.append(", text=");
        P0.append(this.d);
        P0.append(", explanation=");
        P0.append(this.e);
        P0.append(", initiallySelected=");
        P0.append(this.f);
        P0.append(", action=");
        P0.append(this.g);
        P0.append(')');
        return P0.toString();
    }
}
