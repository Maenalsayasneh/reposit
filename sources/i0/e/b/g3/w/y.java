package i0.e.b.g3.w;

import com.clubhouse.android.ui.search.Mode;
import com.instabug.library.model.session.config.SessionsConfigParameter;
import h0.u.w;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ExploreV2ViewModel.kt */
public final class y implements j {
    public final w<i0.e.b.b3.b.e.j> a;
    public final w<i0.e.b.b3.b.e.j> b;
    public final Mode c;
    public final String d;

    public y() {
        this((w) null, (w) null, (Mode) null, (String) null, 15, (f) null);
    }

    public y(w<i0.e.b.b3.b.e.j> wVar, w<i0.e.b.b3.b.e.j> wVar2, Mode mode, String str) {
        i.e(mode, SessionsConfigParameter.SYNC_MODE);
        i.e(str, "query");
        this.a = wVar;
        this.b = wVar2;
        this.c = mode;
        this.d = str;
    }

    public static y copy$default(y yVar, w<i0.e.b.b3.b.e.j> wVar, w<i0.e.b.b3.b.e.j> wVar2, Mode mode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            wVar = yVar.a;
        }
        if ((i & 2) != 0) {
            wVar2 = yVar.b;
        }
        if ((i & 4) != 0) {
            mode = yVar.c;
        }
        if ((i & 8) != 0) {
            str = yVar.d;
        }
        Objects.requireNonNull(yVar);
        i.e(mode, SessionsConfigParameter.SYNC_MODE);
        i.e(str, "query");
        return new y(wVar, wVar2, mode, str);
    }

    public final w<i0.e.b.b3.b.e.j> component1() {
        return this.a;
    }

    public final w<i0.e.b.b3.b.e.j> component2() {
        return this.b;
    }

    public final Mode component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return i.a(this.a, yVar.a) && i.a(this.b, yVar.b) && this.c == yVar.c && i.a(this.d, yVar.d);
    }

    public int hashCode() {
        w<i0.e.b.b3.b.e.j> wVar = this.a;
        int i = 0;
        int hashCode = (wVar == null ? 0 : wVar.hashCode()) * 31;
        w<i0.e.b.b3.b.e.j> wVar2 = this.b;
        if (wVar2 != null) {
            i = wVar2.hashCode();
        }
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + i) * 31)) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ExploreV2ViewState(data=");
        P0.append(this.a);
        P0.append(", recentSearches=");
        P0.append(this.b);
        P0.append(", mode=");
        P0.append(this.c);
        P0.append(", query=");
        return a.x0(P0, this.d, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(w wVar, w wVar2, Mode mode, String str, int i, f fVar) {
        this((i & 1) != 0 ? null : wVar, (i & 2) != 0 ? null : wVar2, (i & 4) != 0 ? Mode.TOP : mode, (i & 8) != 0 ? "" : str);
    }
}
