package i0.e.b.g3.l.v2;

import android.net.Uri;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.remote.response.GetCreateClubResponse;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CreateClubViewModel.kt */
public final class q implements j {
    public final b<GetCreateClubResponse> a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Uri h;
    public final int i;
    public final List<Topic> j;
    public final boolean k;

    public q() {
        this((b) null, (String) null, (String) null, false, false, false, false, (Uri) null, 0, (List) null, 1023, (f) null);
    }

    public q(b<GetCreateClubResponse> bVar, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Uri uri, int i2, List<Topic> list) {
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        i.e(str, "name");
        i.e(str2, InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION);
        i.e(list, "topics");
        this.a = bVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = uri;
        this.i = i2;
        this.j = list;
        this.k = str.length() > i2;
    }

    public static q copy$default(q qVar, b bVar, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Uri uri, int i2, List list, int i3, Object obj) {
        q qVar2 = qVar;
        int i4 = i3;
        b bVar2 = (i4 & 1) != 0 ? qVar2.a : bVar;
        String str3 = (i4 & 2) != 0 ? qVar2.b : str;
        String str4 = (i4 & 4) != 0 ? qVar2.c : str2;
        boolean z5 = (i4 & 8) != 0 ? qVar2.d : z;
        boolean z6 = (i4 & 16) != 0 ? qVar2.e : z2;
        boolean z7 = (i4 & 32) != 0 ? qVar2.f : z3;
        boolean z8 = (i4 & 64) != 0 ? qVar2.g : z4;
        Uri uri2 = (i4 & 128) != 0 ? qVar2.h : uri;
        int i5 = (i4 & 256) != 0 ? qVar2.i : i2;
        List list2 = (i4 & 512) != 0 ? qVar2.j : list;
        Objects.requireNonNull(qVar);
        i.e(bVar2, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        i.e(str3, "name");
        i.e(str4, InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION);
        i.e(list2, "topics");
        return new q(bVar2, str3, str4, z5, z6, z7, z8, uri2, i5, list2);
    }

    public final b<GetCreateClubResponse> component1() {
        return this.a;
    }

    public final List<Topic> component10() {
        return this.j;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    public final Uri component8() {
        return this.h;
    }

    public final int component9() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return i.a(this.a, qVar.a) && i.a(this.b, qVar.b) && i.a(this.c, qVar.c) && this.d == qVar.d && this.e == qVar.e && this.f == qVar.f && this.g == qVar.g && i.a(this.h, qVar.h) && this.i == qVar.i && i.a(this.j, qVar.j);
    }

    public int hashCode() {
        int F = a.F(this.c, a.F(this.b, this.a.hashCode() * 31, 31), 31);
        boolean z = this.d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (F + (z ? 1 : 0)) * 31;
        boolean z3 = this.e;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.g;
        if (!z5) {
            z2 = z5;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        Uri uri = this.h;
        return this.j.hashCode() + a.M(this.i, (i5 + (uri == null ? 0 : uri.hashCode())) * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("CreateClubViewState(request=");
        P0.append(this.a);
        P0.append(", name=");
        P0.append(this.b);
        P0.append(", description=");
        P0.append(this.c);
        P0.append(", isAskToJoinAllowed=");
        P0.append(this.d);
        P0.append(", isMembershipOpen=");
        P0.append(this.e);
        P0.append(", isMemberlistPrivate=");
        P0.append(this.f);
        P0.append(", isCommunity=");
        P0.append(this.g);
        P0.append(", photoUri=");
        P0.append(this.h);
        P0.append(", minimumClubLength=");
        P0.append(this.i);
        P0.append(", topics=");
        return a.A0(P0, this.j, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(i0.b.b.b r11, java.lang.String r12, java.lang.String r13, boolean r14, boolean r15, boolean r16, boolean r17, android.net.Uri r18, int r19, java.util.List r20, int r21, m0.n.b.f r22) {
        /*
            r10 = this;
            r0 = r21
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            i0.b.b.g0 r1 = i0.b.b.g0.b
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r2 = r0 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0012
            r2 = r3
            goto L_0x0013
        L_0x0012:
            r2 = r12
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r3 = r13
        L_0x0019:
            r4 = r0 & 8
            r5 = 1
            if (r4 == 0) goto L_0x0020
            r4 = r5
            goto L_0x0021
        L_0x0020:
            r4 = r14
        L_0x0021:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x0028
        L_0x0027:
            r6 = r15
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = 0
            goto L_0x0030
        L_0x002e:
            r7 = r16
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r5 = r17
        L_0x0037:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x003d
            r8 = 0
            goto L_0x003f
        L_0x003d:
            r8 = r18
        L_0x003f:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0045
            r9 = 2
            goto L_0x0047
        L_0x0045:
            r9 = r19
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004e
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.c
            goto L_0x0050
        L_0x004e:
            r0 = r20
        L_0x0050:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r5
            r19 = r8
            r20 = r9
            r21 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.l.v2.q.<init>(i0.b.b.b, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, android.net.Uri, int, java.util.List, int, m0.n.b.f):void");
    }
}
