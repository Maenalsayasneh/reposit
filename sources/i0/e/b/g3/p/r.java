package i0.e.b.g3.p;

import com.clubhouse.android.user.model.UserSelf;
import i0.b.b.b;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: HallwayViewModel.kt */
public final class r implements j {
    public final i a;
    public final boolean b;
    public final boolean c;
    public final b<UserSelf> d;
    public final b<t> e;
    public final int f;
    public final boolean g;

    public r(i iVar, boolean z, boolean z2, b<UserSelf> bVar, b<t> bVar2, int i, boolean z3) {
        i.e(iVar, "args");
        i.e(bVar, "userState");
        i.e(bVar2, "notificationBadgeState");
        this.a = iVar;
        this.b = z;
        this.c = z2;
        this.d = bVar;
        this.e = bVar2;
        this.f = i;
        this.g = z3;
    }

    public static r copy$default(r rVar, i iVar, boolean z, boolean z2, b<UserSelf> bVar, b<t> bVar2, int i, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iVar = rVar.a;
        }
        if ((i2 & 2) != 0) {
            z = rVar.b;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            z2 = rVar.c;
        }
        boolean z5 = z2;
        if ((i2 & 8) != 0) {
            bVar = rVar.d;
        }
        b<UserSelf> bVar3 = bVar;
        if ((i2 & 16) != 0) {
            bVar2 = rVar.e;
        }
        b<t> bVar4 = bVar2;
        if ((i2 & 32) != 0) {
            i = rVar.f;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            z3 = rVar.g;
        }
        boolean z6 = z3;
        Objects.requireNonNull(rVar);
        i.e(iVar, "args");
        i.e(bVar3, "userState");
        i.e(bVar4, "notificationBadgeState");
        return new r(iVar, z4, z5, bVar3, bVar4, i3, z6);
    }

    public final i component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final b<UserSelf> component4() {
        return this.d;
    }

    public final b<t> component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return i.a(this.a, rVar.a) && this.b == rVar.b && this.c == rVar.c && i.a(this.d, rVar.d) && i.a(this.e, rVar.e) && this.f == rVar.f && this.g == rVar.g;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.c;
        if (z3) {
            z3 = true;
        }
        int hashCode2 = this.d.hashCode();
        int M = a.M(this.f, (this.e.hashCode() + ((hashCode2 + ((i + (z3 ? 1 : 0)) * 31)) * 31)) * 31, 31);
        boolean z4 = this.g;
        if (!z4) {
            z2 = z4;
        }
        return M + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("HallwayState(args=");
        P0.append(this.a);
        P0.append(", waveChannelLoading=");
        P0.append(this.b);
        P0.append(", buddyListOpen=");
        P0.append(this.c);
        P0.append(", userState=");
        P0.append(this.d);
        P0.append(", notificationBadgeState=");
        P0.append(this.e);
        P0.append(", backchannelUnreadCount=");
        P0.append(this.f);
        P0.append(", enableWaves=");
        return a.C0(P0, this.g, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ r(i0.e.b.g3.p.i r8, boolean r9, boolean r10, i0.b.b.b r11, i0.b.b.b r12, int r13, boolean r14, int r15, m0.n.b.f r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r10
        L_0x000f:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0016
            i0.b.b.g0 r3 = i0.b.b.g0.b
            goto L_0x0017
        L_0x0016:
            r3 = r11
        L_0x0017:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x001e
            i0.b.b.g0 r4 = i0.b.b.g0.b
            goto L_0x001f
        L_0x001e:
            r4 = r12
        L_0x001f:
            r5 = r15 & 32
            if (r5 == 0) goto L_0x0025
            r5 = r1
            goto L_0x0026
        L_0x0025:
            r5 = r13
        L_0x0026:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = r14
        L_0x002c:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.p.r.<init>(i0.e.b.g3.p.i, boolean, boolean, i0.b.b.b, i0.b.b.b, int, boolean, int, m0.n.b.f):void");
    }
}
