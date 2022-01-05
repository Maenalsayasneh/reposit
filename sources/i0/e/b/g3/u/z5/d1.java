package i0.e.b.g3.u.z5;

import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.notification.NotificationFrequency;
import com.clubhouse.android.data.models.local.notification.NotificationPause;
import com.clubhouse.android.user.model.UserSelf;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: SettingsViewModel.kt */
public final class d1 implements j {
    public final UserSelf a;
    public final boolean b;
    public final NotificationFrequency c;
    public final NotificationPause d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public d1() {
        this((UserSelf) null, false, (NotificationFrequency) null, (NotificationPause) null, false, false, false, false, false, false, false, false, false, 8191, (f) null);
    }

    public d1(UserSelf userSelf, boolean z, NotificationFrequency notificationFrequency, NotificationPause notificationPause, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        i.e(notificationFrequency, "notificationFrequency");
        i.e(notificationPause, "notificationPause");
        this.a = userSelf;
        this.b = z;
        this.c = notificationFrequency;
        this.d = notificationPause;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = z9;
        this.m = z10;
    }

    public static d1 copy$default(d1 d1Var, UserSelf userSelf, boolean z, NotificationFrequency notificationFrequency, NotificationPause notificationPause, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2, Object obj) {
        d1 d1Var2 = d1Var;
        int i3 = i2;
        UserSelf userSelf2 = (i3 & 1) != 0 ? d1Var2.a : userSelf;
        boolean z11 = (i3 & 2) != 0 ? d1Var2.b : z;
        NotificationFrequency notificationFrequency2 = (i3 & 4) != 0 ? d1Var2.c : notificationFrequency;
        NotificationPause notificationPause2 = (i3 & 8) != 0 ? d1Var2.d : notificationPause;
        boolean z12 = (i3 & 16) != 0 ? d1Var2.e : z2;
        boolean z13 = (i3 & 32) != 0 ? d1Var2.f : z3;
        boolean z14 = (i3 & 64) != 0 ? d1Var2.g : z4;
        boolean z15 = (i3 & 128) != 0 ? d1Var2.h : z5;
        boolean z16 = (i3 & 256) != 0 ? d1Var2.i : z6;
        boolean z17 = (i3 & 512) != 0 ? d1Var2.j : z7;
        boolean z18 = (i3 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? d1Var2.k : z8;
        boolean z19 = (i3 & 2048) != 0 ? d1Var2.l : z9;
        boolean z20 = (i3 & 4096) != 0 ? d1Var2.m : z10;
        Objects.requireNonNull(d1Var);
        i.e(notificationFrequency2, "notificationFrequency");
        i.e(notificationPause2, "notificationPause");
        return new d1(userSelf2, z11, notificationFrequency2, notificationPause2, z12, z13, z14, z15, z16, z17, z18, z19, z20);
    }

    public final UserSelf component1() {
        return this.a;
    }

    public final boolean component10() {
        return this.j;
    }

    public final boolean component11() {
        return this.k;
    }

    public final boolean component12() {
        return this.l;
    }

    public final boolean component13() {
        return this.m;
    }

    public final boolean component2() {
        return this.b;
    }

    public final NotificationFrequency component3() {
        return this.c;
    }

    public final NotificationPause component4() {
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

    public final boolean component8() {
        return this.h;
    }

    public final boolean component9() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return i.a(this.a, d1Var.a) && this.b == d1Var.b && this.c == d1Var.c && this.d == d1Var.d && this.e == d1Var.e && this.f == d1Var.f && this.g == d1Var.g && this.h == d1Var.h && this.i == d1Var.i && this.j == d1Var.j && this.k == d1Var.k && this.l == d1Var.l && this.m == d1Var.m;
    }

    public int hashCode() {
        UserSelf userSelf = this.a;
        int hashCode = (userSelf == null ? 0 : userSelf.hashCode()) * 31;
        boolean z = this.b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (z ? 1 : 0)) * 31)) * 31)) * 31;
        boolean z3 = this.e;
        if (z3) {
            z3 = true;
        }
        int i2 = (hashCode2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.g;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.h;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.i;
        if (z7) {
            z7 = true;
        }
        int i6 = (i5 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.j;
        if (z8) {
            z8 = true;
        }
        int i7 = (i6 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.k;
        if (z9) {
            z9 = true;
        }
        int i8 = (i7 + (z9 ? 1 : 0)) * 31;
        boolean z10 = this.l;
        if (z10) {
            z10 = true;
        }
        int i9 = (i8 + (z10 ? 1 : 0)) * 31;
        boolean z11 = this.m;
        if (!z11) {
            z2 = z11;
        }
        return i9 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("SettingsState(userSelf=");
        P0.append(this.a);
        P0.append(", notificationsLoaded=");
        P0.append(this.b);
        P0.append(", notificationFrequency=");
        P0.append(this.c);
        P0.append(", notificationPause=");
        P0.append(this.d);
        P0.append(", enableRoom=");
        P0.append(this.e);
        P0.append(", enableBackchannel=");
        P0.append(this.f);
        P0.append(", enableTrending=");
        P0.append(this.g);
        P0.append(", enableOther=");
        P0.append(this.h);
        P0.append(", enableSendFewer=");
        P0.append(this.i);
        P0.append(", enableSpatialAudio=");
        P0.append(this.j);
        P0.append(", showDebugSettings=");
        P0.append(this.k);
        P0.append(", showPayments=");
        P0.append(this.l);
        P0.append(", showSpatialAudio=");
        return a.C0(P0, this.m, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ d1(com.clubhouse.android.user.model.UserSelf r15, boolean r16, com.clubhouse.android.data.models.local.notification.NotificationFrequency r17, com.clubhouse.android.data.models.local.notification.NotificationPause r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, int r28, m0.n.b.f r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x0009
        L_0x0008:
            r1 = r15
        L_0x0009:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0010
            r2 = r3
            goto L_0x0012
        L_0x0010:
            r2 = r16
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            com.clubhouse.android.data.models.local.notification.NotificationFrequency r4 = com.clubhouse.android.data.models.local.notification.NotificationFrequency.NULL
            goto L_0x001b
        L_0x0019:
            r4 = r17
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            com.clubhouse.android.data.models.local.notification.NotificationPause r5 = com.clubhouse.android.data.models.local.notification.NotificationPause.NULL
            goto L_0x0024
        L_0x0022:
            r5 = r18
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r3
            goto L_0x002c
        L_0x002a:
            r6 = r19
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0032
            r7 = r3
            goto L_0x0034
        L_0x0032:
            r7 = r20
        L_0x0034:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003a
            r8 = r3
            goto L_0x003c
        L_0x003a:
            r8 = r21
        L_0x003c:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0042
            r9 = r3
            goto L_0x0044
        L_0x0042:
            r9 = r22
        L_0x0044:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004a
            r10 = r3
            goto L_0x004c
        L_0x004a:
            r10 = r23
        L_0x004c:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0052
            r11 = r3
            goto L_0x0054
        L_0x0052:
            r11 = r24
        L_0x0054:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005a
            r12 = r3
            goto L_0x005c
        L_0x005a:
            r12 = r25
        L_0x005c:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0062
            r13 = r3
            goto L_0x0064
        L_0x0062:
            r13 = r26
        L_0x0064:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r3 = r27
        L_0x006b:
            r15 = r14
            r16 = r1
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.u.z5.d1.<init>(com.clubhouse.android.user.model.UserSelf, boolean, com.clubhouse.android.data.models.local.notification.NotificationFrequency, com.clubhouse.android.data.models.local.notification.NotificationPause, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, m0.n.b.f):void");
    }
}
