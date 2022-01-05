package i0.e.b.g3.i;

import com.clubhouse.android.ui.actionsheet.ActionSheetConfig;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ActionSheetViewModel.kt */
public final class h implements j {
    public final String a;
    public final String b;
    public final boolean c;
    public final c d;

    public h(String str, String str2, boolean z, c cVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = cVar;
    }

    public static h copy$default(h hVar, String str, String str2, boolean z, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hVar.a;
        }
        if ((i & 2) != 0) {
            str2 = hVar.b;
        }
        if ((i & 4) != 0) {
            z = hVar.c;
        }
        if ((i & 8) != 0) {
            cVar = hVar.d;
        }
        Objects.requireNonNull(hVar);
        return new h(str, str2, z, cVar);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final c component4() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i.a(this.a, hVar.a) && i.a(this.b, hVar.b) && this.c == hVar.c && i.a(this.d, hVar.d);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        c cVar = this.d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionSheetState(title=");
        P0.append(this.a);
        P0.append(", description=");
        P0.append(this.b);
        P0.append(", selectable=");
        P0.append(this.c);
        P0.append(", selectedAction=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, String str2, boolean z, c cVar, int i, f fVar) {
        this(str, str2, z, (i & 8) != 0 ? null : cVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(ActionSheetConfig actionSheetConfig) {
        this(actionSheetConfig.c, actionSheetConfig.d, actionSheetConfig.q, (c) null, 8, (f) null);
        i.e(actionSheetConfig, "config");
    }
}
