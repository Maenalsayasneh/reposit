package i0.e.b.z2.g;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class y0 implements b {
    public final CharSequence a;
    public final int b;

    public y0(CharSequence charSequence, int i) {
        i.e(charSequence, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        this.a = charSequence;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return i.a(this.a, y0Var.a) && this.b == y0Var.b;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ShowInviteMessage(message=");
        P0.append(this.a);
        P0.append(", fromUserId=");
        return a.s0(P0, this.b, ')');
    }
}
