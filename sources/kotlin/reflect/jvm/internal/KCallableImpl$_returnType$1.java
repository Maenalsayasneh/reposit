package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.m.v;

/* compiled from: KCallableImpl.kt */
public final class KCallableImpl$_returnType$1 extends Lambda implements a<KTypeImpl> {
    public final /* synthetic */ KCallableImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KCallableImpl$_returnType$1(KCallableImpl kCallableImpl) {
        super(0);
        this.c = kCallableImpl;
    }

    public Object invoke() {
        v returnType = this.c.p().getReturnType();
        i.c(returnType);
        i.d(returnType, "descriptor.returnType!!");
        return new KTypeImpl(returnType, new a<Type>() {
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.reflect.Type} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r4 = this;
                    kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1 r0 = kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1.this
                    kotlin.reflect.jvm.internal.KCallableImpl r0 = r0.c
                    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = r0.p()
                    boolean r2 = r1 instanceof m0.r.t.a.r.c.r
                    r3 = 0
                    if (r2 != 0) goto L_0x000e
                    r1 = r3
                L_0x000e:
                    m0.r.t.a.r.c.r r1 = (m0.r.t.a.r.c.r) r1
                    if (r1 == 0) goto L_0x005f
                    boolean r1 = r1.isSuspend()
                    r2 = 1
                    if (r1 != r2) goto L_0x005f
                    m0.r.t.a.q.c r0 = r0.m()
                    java.util.List r0 = r0.b()
                    java.lang.Object r0 = m0.j.g.I(r0)
                    boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
                    if (r1 != 0) goto L_0x002a
                    r0 = r3
                L_0x002a:
                    java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
                    if (r0 == 0) goto L_0x0033
                    java.lang.reflect.Type r1 = r0.getRawType()
                    goto L_0x0034
                L_0x0033:
                    r1 = r3
                L_0x0034:
                    java.lang.Class<m0.l.c> r2 = m0.l.c.class
                    boolean r1 = m0.n.b.i.a(r1, r2)
                    if (r1 == 0) goto L_0x005f
                    java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
                    java.lang.String r1 = "continuationType.actualTypeArguments"
                    m0.n.b.i.d(r0, r1)
                    java.lang.Object r0 = i0.j.f.p.h.S3(r0)
                    boolean r1 = r0 instanceof java.lang.reflect.WildcardType
                    if (r1 != 0) goto L_0x004e
                    r0 = r3
                L_0x004e:
                    java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
                    if (r0 == 0) goto L_0x005f
                    java.lang.reflect.Type[] r0 = r0.getLowerBounds()
                    if (r0 == 0) goto L_0x005f
                    java.lang.Object r0 = i0.j.f.p.h.H0(r0)
                    r3 = r0
                    java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
                L_0x005f:
                    if (r3 == 0) goto L_0x0062
                    goto L_0x006e
                L_0x0062:
                    kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1 r0 = kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1.this
                    kotlin.reflect.jvm.internal.KCallableImpl r0 = r0.c
                    m0.r.t.a.q.c r0 = r0.m()
                    java.lang.reflect.Type r3 = r0.getReturnType()
                L_0x006e:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1.AnonymousClass1.invoke():java.lang.Object");
            }
        });
    }
}
