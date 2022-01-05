package i0.e.b.a3.b;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: BaseViewModel.kt */
public final class e implements b {
    public final String a;

    public e(String str) {
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && i.a(this.a, ((e) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("ShowSuccess(message="), this.a, ')');
    }
}
