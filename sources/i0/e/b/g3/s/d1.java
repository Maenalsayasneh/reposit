package i0.e.b.g3.s;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: PaymentsRegistrationViewModel.kt */
public final class d1 implements b {
    public final String a;

    public d1(String str) {
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && i.a(this.a, ((d1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("ShowUpdateReceivingPaymentsError(message="), this.a, ')');
    }
}
