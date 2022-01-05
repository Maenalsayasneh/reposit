package i0.e.b.g3.w;

import com.clubhouse.android.ui.search.Mode;
import com.instabug.library.model.session.config.SessionsConfigParameter;
import h0.u.w;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ExploreViewModel.kt */
public final class z implements j {
    public final w<i0.e.b.b3.b.e.j> a;
    public final Mode b;
    public final String c;

    public z() {
        this((w) null, (Mode) null, (String) null, 7, (f) null);
    }

    public z(w<i0.e.b.b3.b.e.j> wVar, Mode mode, String str) {
        i.e(mode, SessionsConfigParameter.SYNC_MODE);
        this.a = wVar;
        this.b = mode;
        this.c = str;
    }

    public static z copy$default(z zVar, w<i0.e.b.b3.b.e.j> wVar, Mode mode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            wVar = zVar.a;
        }
        if ((i & 2) != 0) {
            mode = zVar.b;
        }
        if ((i & 4) != 0) {
            str = zVar.c;
        }
        Objects.requireNonNull(zVar);
        i.e(mode, SessionsConfigParameter.SYNC_MODE);
        return new z(wVar, mode, str);
    }

    public final w<i0.e.b.b3.b.e.j> component1() {
        return this.a;
    }

    public final Mode component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return i.a(this.a, zVar.a) && this.b == zVar.b && i.a(this.c, zVar.c);
    }

    public int hashCode() {
        w<i0.e.b.b3.b.e.j> wVar = this.a;
        int i = 0;
        int hashCode = (this.b.hashCode() + ((wVar == null ? 0 : wVar.hashCode()) * 31)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ExploreViewState(data=");
        P0.append(this.a);
        P0.append(", mode=");
        P0.append(this.b);
        P0.append(", query=");
        return a.w0(P0, this.c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(w wVar, Mode mode, String str, int i, f fVar) {
        this((i & 1) != 0 ? null : wVar, (i & 2) != 0 ? Mode.SUGGESTED : mode, (i & 4) != 0 ? null : str);
    }
}
