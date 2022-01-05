package i0.e.b.g3.w;

import com.clubhouse.android.ui.search.Mode;
import com.instabug.library.model.session.config.SessionsConfigParameter;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ExploreViewModel.kt */
public final class f0 implements c {
    public final Mode a;

    public f0(Mode mode) {
        i.e(mode, SessionsConfigParameter.SYNC_MODE);
        this.a = mode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.a == ((f0) obj).a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("SetMode(mode=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
