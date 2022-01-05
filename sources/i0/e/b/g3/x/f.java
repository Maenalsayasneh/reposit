package i0.e.b.g3.x;

import com.clubhouse.android.ui.selection.Selection;
import com.clubhouse.android.ui.selection.SelectionArgs;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import java.util.Set;
import m0.n.b.i;

/* compiled from: SelectionViewModel.kt */
public final class f implements j {
    public final String a;
    public final Set<Selection> b;
    public final Selection c;
    public final String d;
    public final String e;

    public f() {
        this((String) null, (Set) null, (Selection) null, (String) null, (String) null, 31, (m0.n.b.f) null);
    }

    public f(String str, Set<? extends Selection> set, Selection selection, String str2, String str3) {
        i.e(set, "items");
        this.a = str;
        this.b = set;
        this.c = selection;
        this.d = str2;
        this.e = str3;
    }

    public static f copy$default(f fVar, String str, Set<Selection> set, Selection selection, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fVar.a;
        }
        if ((i & 2) != 0) {
            set = fVar.b;
        }
        Set<Selection> set2 = set;
        if ((i & 4) != 0) {
            selection = fVar.c;
        }
        Selection selection2 = selection;
        if ((i & 8) != 0) {
            str2 = fVar.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = fVar.e;
        }
        String str5 = str3;
        Objects.requireNonNull(fVar);
        i.e(set2, "items");
        return new f(str, set2, selection2, str4, str5);
    }

    public final String component1() {
        return this.a;
    }

    public final Set<Selection> component2() {
        return this.b;
    }

    public final Selection component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.a, fVar.a) && i.a(this.b, fVar.b) && i.a(this.c, fVar.c) && i.a(this.d, fVar.d) && i.a(this.e, fVar.e);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int I = a.I(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        Selection selection = this.c;
        int hashCode = (I + (selection == null ? 0 : selection.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("SelectionViewState(title=");
        P0.append(this.a);
        P0.append(", items=");
        P0.append(this.b);
        P0.append(", selectedItem=");
        P0.append(this.c);
        P0.append(", header=");
        P0.append(this.d);
        P0.append(", footer=");
        return a.w0(P0, this.e, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(SelectionArgs selectionArgs) {
        this(selectionArgs.c, selectionArgs.d, selectionArgs.q, selectionArgs.x, selectionArgs.y);
        i.e(selectionArgs, "args");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(java.lang.String r5, java.util.Set r6, com.clubhouse.android.ui.selection.Selection r7, java.lang.String r8, java.lang.String r9, int r10, m0.n.b.f r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            kotlin.collections.EmptySet r6 = kotlin.collections.EmptySet.c
        L_0x000e:
            r1 = r6
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.x.f.<init>(java.lang.String, java.util.Set, com.clubhouse.android.ui.selection.Selection, java.lang.String, java.lang.String, int, m0.n.b.f):void");
    }
}
