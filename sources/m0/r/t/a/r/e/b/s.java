package m0.r.t.a.r.e.b;

import androidx.core.app.FrameMetricsAggregator;

/* compiled from: TypeMappingMode.kt */
public final class s {
    public static final s a;
    public static final s b = new s(false, false, false, false, false, (s) null, false, (s) null, (s) null, true, FrameMetricsAggregator.EVERY_DURATION);
    public static final s c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final s i;
    public final boolean j;
    public final s k;
    public final s l;
    public final boolean m;

    static {
        s sVar = new s(false, false, false, false, false, (s) null, false, (s) null, (s) null, false, 1023);
        a = sVar;
        c = new s(false, false, false, false, false, sVar, false, (s) null, (s) null, false, 988);
    }

    public s(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, s sVar, boolean z6, s sVar2, s sVar3, boolean z7, int i2) {
        z = (i2 & 1) != 0 ? true : z;
        z2 = (i2 & 2) != 0 ? true : z2;
        z3 = (i2 & 4) != 0 ? false : z3;
        z4 = (i2 & 8) != 0 ? false : z4;
        z5 = (i2 & 16) != 0 ? false : z5;
        sVar = (i2 & 32) != 0 ? null : sVar;
        z6 = (i2 & 64) != 0 ? true : z6;
        sVar2 = (i2 & 128) != 0 ? sVar : sVar2;
        sVar3 = (i2 & 256) != 0 ? sVar : sVar3;
        z7 = (i2 & 512) != 0 ? false : z7;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = sVar;
        this.j = z6;
        this.k = sVar2;
        this.l = sVar3;
        this.m = z7;
    }
}
