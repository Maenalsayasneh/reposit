package i0.e.b.g3.r.a3;

import com.clubhouse.android.data.models.local.Topic;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import m0.n.b.i;

/* compiled from: OnboardingTopicsViewModel.kt */
public final class f implements j {
    public final boolean a;
    public final String b;
    public final List<Topic> c;
    public final Set<Integer> d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public f() {
        this(false, (String) null, (List) null, (Set) null, 0, 31, (m0.n.b.f) null);
    }

    public f(boolean z, String str, List<Topic> list, Set<Integer> set, int i) {
        i.e(set, "selected");
        this.a = z;
        this.b = str;
        this.c = list;
        this.d = set;
        this.e = i;
        this.f = set.size() >= i;
        this.g = set.isEmpty();
    }

    public static f copy$default(f fVar, boolean z, String str, List<Topic> list, Set<Integer> set, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = fVar.a;
        }
        if ((i2 & 2) != 0) {
            str = fVar.b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            list = fVar.c;
        }
        List<Topic> list2 = list;
        if ((i2 & 8) != 0) {
            set = fVar.d;
        }
        Set<Integer> set2 = set;
        if ((i2 & 16) != 0) {
            i = fVar.e;
        }
        int i3 = i;
        Objects.requireNonNull(fVar);
        i.e(set2, "selected");
        return new f(z, str2, list2, set2, i3);
    }

    public final boolean component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final List<Topic> component3() {
        return this.c;
    }

    public final Set<Integer> component4() {
        return this.d;
    }

    public final int component5() {
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
        return this.a == fVar.a && i.a(this.b, fVar.b) && i.a(this.c, fVar.c) && i.a(this.d, fVar.d) && this.e == fVar.e;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<Topic> list = this.c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return Integer.hashCode(this.e) + a.I(this.d, (hashCode + i2) * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("OnboardingTopicsState(loading=");
        P0.append(this.a);
        P0.append(", title=");
        P0.append(this.b);
        P0.append(", topics=");
        P0.append(this.c);
        P0.append(", selected=");
        P0.append(this.d);
        P0.append(", numToSelect=");
        return a.s0(P0, this.e, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(boolean r5, java.lang.String r6, java.util.List r7, java.util.Set r8, int r9, int r10, m0.n.b.f r11) {
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
            r1 = 0
            if (r5 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0010
        L_0x000f:
            r2 = r6
        L_0x0010:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r1 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            kotlin.collections.EmptySet r8 = kotlin.collections.EmptySet.c
        L_0x001c:
            r3 = r8
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r2
            r8 = r1
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.r.a3.f.<init>(boolean, java.lang.String, java.util.List, java.util.Set, int, int, m0.n.b.f):void");
    }
}
