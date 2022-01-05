package i0.e.b.g3.s;

import android.content.Intent;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: SendDirectPaymentViewModel.kt */
public final class m0 implements c {
    public final int a;
    public final Intent b;

    public m0(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.a == m0Var.a && i.a(this.b, m0Var.b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Intent intent = this.b;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("HandleActivityResultIntent(requestCode=");
        P0.append(this.a);
        P0.append(", data=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
