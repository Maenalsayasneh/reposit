package m0.r.t.a.r.m.x0;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v0;
import m0.r.t.a.r.m.z0.a;

/* compiled from: NewCapturedType.kt */
public final class g extends a0 implements a {
    public final boolean Y1;
    public final boolean Z1;
    public final CaptureStatus d;
    public final NewCapturedTypeConstructor q;
    public final v0 x;
    public final f y;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r8, kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r9, m0.r.t.a.r.m.v0 r10, m0.r.t.a.r.c.r0.f r11, boolean r12, boolean r13, int r14) {
        /*
            r7 = this;
            r0 = r14 & 8
            if (r0 == 0) goto L_0x000b
            m0.r.t.a.r.c.r0.f$a r11 = m0.r.t.a.r.c.r0.f.i
            java.util.Objects.requireNonNull(r11)
            m0.r.t.a.r.c.r0.f r11 = m0.r.t.a.r.c.r0.f.a.b
        L_0x000b:
            r4 = r11
            r11 = r14 & 16
            r0 = 0
            if (r11 == 0) goto L_0x0013
            r5 = r0
            goto L_0x0014
        L_0x0013:
            r5 = r12
        L_0x0014:
            r11 = r14 & 32
            if (r11 == 0) goto L_0x001a
            r6 = r0
            goto L_0x001b
        L_0x001a:
            r6 = r13
        L_0x001b:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.x0.g.<init>(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus, kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor, m0.r.t.a.r.m.v0, m0.r.t.a.r.c.r0.f, boolean, boolean, int):void");
    }

    public List<m0> H0() {
        return EmptyList.c;
    }

    public j0 I0() {
        return this.q;
    }

    public boolean J0() {
        return this.Y1;
    }

    /* renamed from: R0 */
    public g P0(boolean z) {
        return new g(this.d, this.q, this.x, this.y, z, false, 32);
    }

    /* renamed from: S0 */
    public g N0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        CaptureStatus captureStatus = this.d;
        NewCapturedTypeConstructor f = this.q.a(eVar);
        v0 v0Var = this.x;
        return new g(captureStatus, f, v0Var == null ? null : eVar.g(v0Var).L0(), this.y, this.Y1, false, 32);
    }

    /* renamed from: T0 */
    public g Q0(f fVar) {
        i.e(fVar, "newAnnotations");
        return new g(this.d, this.q, this.x, fVar, this.Y1, false, 32);
    }

    public f getAnnotations() {
        return this.y;
    }

    public MemberScope o() {
        MemberScope c = p.c("No member resolution should be done on captured type!", true);
        i.d(c, "createErrorScope(\"No member resolution should be done on captured type!\", true)");
        return c;
    }

    public g(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, v0 v0Var, f fVar, boolean z, boolean z2) {
        i.e(captureStatus, "captureStatus");
        i.e(newCapturedTypeConstructor, "constructor");
        i.e(fVar, "annotations");
        this.d = captureStatus;
        this.q = newCapturedTypeConstructor;
        this.x = v0Var;
        this.y = fVar;
        this.Y1 = z;
        this.Z1 = z2;
    }
}
