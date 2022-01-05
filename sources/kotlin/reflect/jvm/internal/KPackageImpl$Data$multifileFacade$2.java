package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;
import m0.n.a.a;

/* compiled from: KPackageImpl.kt */
public final class KPackageImpl$Data$multifileFacade$2 extends Lambda implements a<Class<?>> {
    public final /* synthetic */ KPackageImpl.Data c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$multifileFacade$2(KPackageImpl.Data data) {
        super(0);
        this.c = data;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r6 = this;
            kotlin.reflect.jvm.internal.KPackageImpl$Data r0 = r6.c
            m0.r.t.a.r.c.v0.a.e r0 = kotlin.reflect.jvm.internal.KPackageImpl.Data.a(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0012
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r0.b
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r0.a()
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            if (r0 == 0) goto L_0x0038
            int r2 = r0.length()
            r3 = 0
            if (r2 <= 0) goto L_0x001e
            r2 = 1
            goto L_0x001f
        L_0x001e:
            r2 = r3
        L_0x001f:
            if (r2 == 0) goto L_0x0038
            kotlin.reflect.jvm.internal.KPackageImpl$Data r1 = r6.c
            kotlin.reflect.jvm.internal.KPackageImpl r1 = kotlin.reflect.jvm.internal.KPackageImpl.this
            java.lang.Class<?> r1 = r1.x
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r2 = 47
            r4 = 46
            r5 = 4
            java.lang.String r0 = kotlin.text.StringsKt__IndentKt.A(r0, r2, r4, r3, r5)
            java.lang.Class r1 = r1.loadClass(r0)
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPackageImpl$Data$multifileFacade$2.invoke():java.lang.Object");
    }
}
