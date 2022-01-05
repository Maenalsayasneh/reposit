package i0.e.b.z2.g;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: ChannelControlModel.kt */
public final class s0 implements b {
    public final i0.e.b.b3.a.a.c.b a;

    public s0(i0.e.b.b3.a.a.c.b bVar) {
        i.e(bVar, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        this.a = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && i.a(this.a, ((s0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ShowAlertFromMessage(message=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
