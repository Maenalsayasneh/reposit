package i0.e.b.g3.o;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.events.HalfEventArgs;
import i0.b.b.b;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: HalfEventViewModel.kt */
public final class l0 implements j {
    public final b<ChannelInRoomWithAccess> a;
    public final HalfEventArgs b;
    public final EventInClub c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public l0(b<ChannelInRoomWithAccess> bVar, HalfEventArgs halfEventArgs, EventInClub eventInClub, boolean z, boolean z2, boolean z3) {
        ClubWithAdmin clubWithAdmin;
        i.e(bVar, "createChannelRequest");
        i.e(halfEventArgs, "args");
        this.a = bVar;
        this.b = halfEventArgs;
        this.c = eventInClub;
        this.d = z;
        this.e = z2;
        this.f = z3;
        boolean z4 = false;
        if (!(eventInClub == null || (clubWithAdmin = eventInClub.c) == null)) {
            z4 = clubWithAdmin.c;
        }
        this.g = z4;
    }

    public static l0 copy$default(l0 l0Var, b<ChannelInRoomWithAccess> bVar, HalfEventArgs halfEventArgs, EventInClub eventInClub, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = l0Var.a;
        }
        if ((i & 2) != 0) {
            halfEventArgs = l0Var.b;
        }
        HalfEventArgs halfEventArgs2 = halfEventArgs;
        if ((i & 4) != 0) {
            eventInClub = l0Var.c;
        }
        EventInClub eventInClub2 = eventInClub;
        if ((i & 8) != 0) {
            z = l0Var.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = l0Var.e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = l0Var.f;
        }
        boolean z6 = z3;
        Objects.requireNonNull(l0Var);
        i.e(bVar, "createChannelRequest");
        i.e(halfEventArgs2, "args");
        return new l0(bVar, halfEventArgs2, eventInClub2, z4, z5, z6);
    }

    public final b<ChannelInRoomWithAccess> component1() {
        return this.a;
    }

    public final HalfEventArgs component2() {
        return this.b;
    }

    public final EventInClub component3() {
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return i.a(this.a, l0Var.a) && i.a(this.b, l0Var.b) && i.a(this.c, l0Var.c) && this.d == l0Var.d && this.e == l0Var.e && this.f == l0Var.f;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        EventInClub eventInClub = this.c;
        int hashCode2 = (hashCode + (eventInClub == null ? 0 : eventInClub.hashCode())) * 31;
        boolean z = this.d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.e;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("HalfEventViewState(createChannelRequest=");
        P0.append(this.a);
        P0.append(", args=");
        P0.append(this.b);
        P0.append(", event=");
        P0.append(this.c);
        P0.append(", isAttended=");
        P0.append(this.d);
        P0.append(", showJoinRoomButton=");
        P0.append(this.e);
        P0.append(", showCreateRoomButton=");
        return a.C0(P0, this.f, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l0(i0.b.b.b r8, com.clubhouse.android.ui.events.HalfEventArgs r9, com.clubhouse.android.data.models.local.EventInClub r10, boolean r11, boolean r12, boolean r13, int r14, m0.n.b.f r15) {
        /*
            r7 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L_0x0006
            i0.b.b.g0 r8 = i0.b.b.g0.b
        L_0x0006:
            r1 = r8
            r8 = r14 & 8
            r15 = 0
            if (r8 == 0) goto L_0x001a
            if (r10 != 0) goto L_0x0010
        L_0x000e:
            r11 = r15
            goto L_0x001a
        L_0x0010:
            java.lang.Boolean r8 = r10.x
            if (r8 != 0) goto L_0x0015
            goto L_0x000e
        L_0x0015:
            boolean r8 = r8.booleanValue()
            r11 = r8
        L_0x001a:
            r4 = r11
            r8 = r14 & 16
            if (r8 == 0) goto L_0x0021
            r5 = r15
            goto L_0x0022
        L_0x0021:
            r5 = r12
        L_0x0022:
            r8 = r14 & 32
            if (r8 == 0) goto L_0x0028
            r6 = r15
            goto L_0x0029
        L_0x0028:
            r6 = r13
        L_0x0029:
            r0 = r7
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.o.l0.<init>(i0.b.b.b, com.clubhouse.android.ui.events.HalfEventArgs, com.clubhouse.android.data.models.local.EventInClub, boolean, boolean, boolean, int, m0.n.b.f):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l0(HalfEventArgs halfEventArgs) {
        this((b) null, halfEventArgs, halfEventArgs.y, false, false, false, 57, (f) null);
        i.e(halfEventArgs, "args");
    }
}
