package i0.e.b.g3.q;

import com.clubhouse.android.data.models.local.SuggestedInvite;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: InvitesViewModel.kt */
public final class m implements j {
    public final List<SuggestedInvite> a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final List<SuggestedInvite> g;
    public final List<SuggestedInvite> h;
    public final List<SuggestedInvite> i;

    public m() {
        this((List) null, false, false, false, (String) null, 31, (f) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0125 A[LOOP:6: B:69:0x0125->B:72:0x0133, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(java.util.List<com.clubhouse.android.data.models.local.SuggestedInvite> r3, boolean r4, boolean r5, boolean r6, java.lang.String r7) {
        /*
            r2 = this;
            java.lang.String r0 = "allInvites"
            m0.n.b.i.e(r3, r0)
            java.lang.String r0 = "query"
            m0.n.b.i.e(r7, r0)
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2.d = r6
            r2.e = r7
            r4 = 0
            r0 = 1
            if (r6 != 0) goto L_0x002a
            if (r5 != 0) goto L_0x002a
            int r5 = r7.length()
            if (r5 != 0) goto L_0x0025
            r5 = r0
            goto L_0x0026
        L_0x0025:
            r5 = r4
        L_0x0026:
            if (r5 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r4
        L_0x002b:
            r2.f = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0036:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x005b
            java.lang.Object r6 = r3.next()
            r7 = r6
            com.clubhouse.android.data.models.local.SuggestedInvite r7 = (com.clubhouse.android.data.models.local.SuggestedInvite) r7
            boolean r1 = r7.d
            if (r1 != 0) goto L_0x004d
            boolean r7 = r7.q
            if (r7 == 0) goto L_0x004d
            r7 = r0
            goto L_0x004e
        L_0x004d:
            r7 = r4
        L_0x004e:
            if (r7 != 0) goto L_0x0054
            if (r1 != 0) goto L_0x0054
            r7 = r0
            goto L_0x0055
        L_0x0054:
            r7 = r4
        L_0x0055:
            if (r7 == 0) goto L_0x0036
            r5.add(r6)
            goto L_0x0036
        L_0x005b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0064:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x007b
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.clubhouse.android.data.models.local.SuggestedInvite r7 = (com.clubhouse.android.data.models.local.SuggestedInvite) r7
            boolean r7 = r2.a(r7)
            if (r7 == 0) goto L_0x0064
            r3.add(r6)
            goto L_0x0064
        L_0x007b:
            r2.g = r3
            java.util.List<com.clubhouse.android.data.models.local.SuggestedInvite> r3 = r2.a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0088:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00ad
            java.lang.Object r6 = r3.next()
            r7 = r6
            com.clubhouse.android.data.models.local.SuggestedInvite r7 = (com.clubhouse.android.data.models.local.SuggestedInvite) r7
            boolean r1 = r7.d
            if (r1 != 0) goto L_0x009f
            boolean r7 = r7.q
            if (r7 == 0) goto L_0x009f
            r7 = r0
            goto L_0x00a0
        L_0x009f:
            r7 = r4
        L_0x00a0:
            if (r7 == 0) goto L_0x00a6
            if (r1 != 0) goto L_0x00a6
            r7 = r0
            goto L_0x00a7
        L_0x00a6:
            r7 = r4
        L_0x00a7:
            if (r7 == 0) goto L_0x0088
            r5.add(r6)
            goto L_0x0088
        L_0x00ad:
            r2.h = r5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r5.iterator()
        L_0x00b8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00cf
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.clubhouse.android.data.models.local.SuggestedInvite r6 = (com.clubhouse.android.data.models.local.SuggestedInvite) r6
            boolean r6 = r2.a(r6)
            if (r6 == 0) goto L_0x00b8
            r3.add(r5)
            goto L_0x00b8
        L_0x00cf:
            r2.i = r3
            java.util.List<com.clubhouse.android.data.models.local.SuggestedInvite> r3 = r2.a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00dc:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00f2
            java.lang.Object r5 = r3.next()
            r6 = r5
            com.clubhouse.android.data.models.local.SuggestedInvite r6 = (com.clubhouse.android.data.models.local.SuggestedInvite) r6
            boolean r6 = r6.d
            r6 = r6 ^ r0
            if (r6 == 0) goto L_0x00dc
            r4.add(r5)
            goto L_0x00dc
        L_0x00f2:
            java.util.List<com.clubhouse.android.data.models.local.SuggestedInvite> r3 = r2.a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00fd:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0114
            java.lang.Object r5 = r3.next()
            r6 = r5
            com.clubhouse.android.data.models.local.SuggestedInvite r6 = (com.clubhouse.android.data.models.local.SuggestedInvite) r6
            boolean r6 = r2.a(r6)
            if (r6 == 0) goto L_0x00fd
            r4.add(r5)
            goto L_0x00fd
        L_0x0114:
            java.util.List<com.clubhouse.android.data.models.local.SuggestedInvite> r3 = r2.a
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0121
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0121
            goto L_0x0135
        L_0x0121:
            java.util.Iterator r3 = r3.iterator()
        L_0x0125:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0135
            java.lang.Object r4 = r3.next()
            com.clubhouse.android.data.models.local.SuggestedInvite r4 = (com.clubhouse.android.data.models.local.SuggestedInvite) r4
            boolean r4 = r4.q
            if (r4 == 0) goto L_0x0125
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.q.m.<init>(java.util.List, boolean, boolean, boolean, java.lang.String):void");
    }

    public static m copy$default(m mVar, List<SuggestedInvite> list, boolean z, boolean z2, boolean z3, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = mVar.a;
        }
        if ((i2 & 2) != 0) {
            z = mVar.b;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            z2 = mVar.c;
        }
        boolean z5 = z2;
        if ((i2 & 8) != 0) {
            z3 = mVar.d;
        }
        boolean z6 = z3;
        if ((i2 & 16) != 0) {
            str = mVar.e;
        }
        String str2 = str;
        Objects.requireNonNull(mVar);
        i.e(list, "allInvites");
        i.e(str2, "query");
        return new m(list, z4, z5, z6, str2);
    }

    public final boolean a(SuggestedInvite suggestedInvite) {
        boolean z;
        if (this.e.length() == 0) {
            return true;
        }
        String str = this.e;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        i.d(sb2, "filterTo(StringBuilder(), predicate).toString()");
        String str2 = suggestedInvite.y;
        if (str2 == null) {
            z = false;
        } else {
            z = StringsKt__IndentKt.b(str2, this.e, true);
        }
        if (z) {
            return true;
        }
        if (!(sb2.length() > 0) || !StringsKt__IndentKt.d(suggestedInvite.c, sb2, false, 2)) {
            return false;
        }
        return true;
    }

    public final List<SuggestedInvite> component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return i.a(this.a, mVar.a) && this.b == mVar.b && this.c == mVar.c && this.d == mVar.d && i.a(this.e, mVar.e);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.c;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.d;
        if (!z4) {
            z2 = z4;
        }
        return this.e.hashCode() + ((i3 + (z2 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("InvitesViewState(allInvites=");
        P0.append(this.a);
        P0.append(", hasContactsPermission=");
        P0.append(this.b);
        P0.append(", isLoading=");
        P0.append(this.c);
        P0.append(", keyboardOpened=");
        P0.append(this.d);
        P0.append(", query=");
        return a.x0(P0, this.e, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(java.util.List r4, boolean r5, boolean r6, boolean r7, java.lang.String r8, int r9, m0.n.b.f r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.c
        L_0x0006:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto L_0x000d
            r10 = r0
            goto L_0x000e
        L_0x000d:
            r10 = r5
        L_0x000e:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            r6 = 1
        L_0x0013:
            r1 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r0 = r7
        L_0x001a:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0020
            java.lang.String r8 = ""
        L_0x0020:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.q.m.<init>(java.util.List, boolean, boolean, boolean, java.lang.String, int, m0.n.b.f):void");
    }
}
