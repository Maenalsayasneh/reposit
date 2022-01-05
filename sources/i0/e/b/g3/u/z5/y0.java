package i0.e.b.g3.u.z5;

import com.clubhouse.android.ui.profile.settings.NotificationSettingsArgs;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: NotificationSettingsViewModel.kt */
public final class y0 implements j {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public y0() {
        this(false, false, false, false, false, 31, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public y0(NotificationSettingsArgs notificationSettingsArgs) {
        this(notificationSettingsArgs.c, notificationSettingsArgs.d, notificationSettingsArgs.q, notificationSettingsArgs.x, false, 16, (f) null);
        i.e(notificationSettingsArgs, "args");
    }

    public static y0 copy$default(y0 y0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = y0Var.a;
        }
        if ((i & 2) != 0) {
            z2 = y0Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = y0Var.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = y0Var.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            z5 = y0Var.e;
        }
        boolean z9 = z5;
        Objects.requireNonNull(y0Var);
        return new y0(z, z6, z7, z8, z9);
    }

    public final boolean component1() {
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

    public final boolean component5() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.a == y0Var.a && this.b == y0Var.b && this.c == y0Var.c && this.d == y0Var.d && this.e == y0Var.e;
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.c;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.d;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.e;
        if (!z6) {
            z2 = z6;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("NotificationSettingsState(enableRoom=");
        P0.append(this.a);
        P0.append(", enableBackchannel=");
        P0.append(this.b);
        P0.append(", enableTrending=");
        P0.append(this.c);
        P0.append(", enableOther=");
        P0.append(this.d);
        P0.append(", enableWaves=");
        return a.C0(P0, this.e, ')');
    }

    public y0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ y0(boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, int r10, m0.n.b.f r11) {
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
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
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
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.u.z5.y0.<init>(boolean, boolean, boolean, boolean, boolean, int, m0.n.b.f):void");
    }
}
