package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import m0.n.a.a;
import m0.r.t.a.r.c.d;

/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$descriptor$2 extends Lambda implements a<d> {
    public final /* synthetic */ KClassImpl.Data c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$descriptor$2(KClassImpl.Data data) {
        super(0);
        this.c = data;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        r1 = r1.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r4 = this;
            kotlin.reflect.jvm.internal.KClassImpl$Data r0 = r4.c
            kotlin.reflect.jvm.internal.KClassImpl r0 = kotlin.reflect.jvm.internal.KClassImpl.this
            int r1 = kotlin.reflect.jvm.internal.KClassImpl.q
            m0.r.t.a.r.g.a r0 = r0.z()
            kotlin.reflect.jvm.internal.KClassImpl$Data r1 = r4.c
            kotlin.reflect.jvm.internal.KClassImpl r1 = kotlin.reflect.jvm.internal.KClassImpl.this
            m0.r.t.a.k<kotlin.reflect.jvm.internal.KClassImpl<T>$Data> r1 = r1.x
            java.lang.Object r1 = r1.invoke()
            kotlin.reflect.jvm.internal.KClassImpl$Data r1 = (kotlin.reflect.jvm.internal.KClassImpl.Data) r1
            m0.r.t.a.j r1 = r1.b
            m0.r.k[] r2 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data.a
            r3 = 0
            r2 = r2[r3]
            java.lang.Object r1 = r1.invoke()
            m0.r.t.a.r.c.v0.a.i r1 = (m0.r.t.a.r.c.v0.a.i) r1
            boolean r2 = r0.c
            if (r2 == 0) goto L_0x002e
            m0.r.t.a.r.k.b.g r1 = r1.a
            m0.r.t.a.r.c.d r0 = r1.b(r0)
            goto L_0x0036
        L_0x002e:
            m0.r.t.a.r.k.b.g r1 = r1.a
            m0.r.t.a.r.c.u r1 = r1.b
            m0.r.t.a.r.c.d r0 = i0.j.f.p.h.D0(r1, r0)
        L_0x0036:
            if (r0 == 0) goto L_0x0039
            return r0
        L_0x0039:
            kotlin.reflect.jvm.internal.KClassImpl$Data r0 = r4.c
            kotlin.reflect.jvm.internal.KClassImpl r0 = kotlin.reflect.jvm.internal.KClassImpl.this
            java.lang.Class<T> r1 = r0.y
            m0.r.t.a.r.c.v0.a.e r1 = m0.r.t.a.r.c.v0.a.e.d(r1)
            if (r1 == 0) goto L_0x004c
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r1.b
            if (r1 == 0) goto L_0x004c
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = r1.a
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            if (r1 == 0) goto L_0x00ba
            int r2 = r1.ordinal()
            if (r2 == 0) goto L_0x0098
            r1 = 1
            if (r2 == r1) goto L_0x00ba
            r1 = 2
            if (r2 == r1) goto L_0x0081
            r1 = 3
            if (r2 == r1) goto L_0x006a
            r1 = 4
            if (r2 == r1) goto L_0x0081
            r1 = 5
            if (r2 == r1) goto L_0x0081
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x006a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection "
            java.lang.String r3 = "library has no idea what declarations does it have. Please use Java reflection to inspect this class: "
            java.lang.StringBuilder r2 = i0.d.a.a.a.S0(r2, r3)
            java.lang.Class<T> r0 = r0.y
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0081:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Packages and file facades are not yet supported in Kotlin reflection. "
            java.lang.String r3 = "Meanwhile please use Java reflection to inspect this class: "
            java.lang.StringBuilder r2 = i0.d.a.a.a.S0(r2, r3)
            java.lang.Class<T> r0 = r0.y
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0098:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r2 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.String r3 = "Unknown class: "
            java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r3)
            java.lang.Class<T> r0 = r0.y
            r3.append(r0)
            java.lang.String r0 = " (kind = "
            r3.append(r0)
            r3.append(r1)
            r0 = 41
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00ba:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r1 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.String r2 = "Unresolved class: "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.Class<T> r0 = r0.y
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KClassImpl$Data$descriptor$2.invoke():java.lang.Object");
    }
}