package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.c.i;

/* compiled from: GivenFunctionsMemberScope.kt */
public final class GivenFunctionsMemberScope$allDescriptors$2 extends Lambda implements a<List<? extends i>> {
    public final /* synthetic */ GivenFunctionsMemberScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GivenFunctionsMemberScope$allDescriptors$2(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        super(0);
        this.c = givenFunctionsMemberScope;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r12 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope r0 = r12.c
            java.util.List r0 = r0.h()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope r1 = r12.c
            java.util.Objects.requireNonNull(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 3
            r2.<init>(r3)
            m0.r.t.a.r.c.d r4 = r1.c
            m0.r.t.a.r.m.j0 r4 = r4.i()
            java.util.Collection r4 = r4.b()
            java.lang.String r5 = "containingClass.typeConstructor.supertypes"
            m0.n.b.i.d(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0029:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0042
            java.lang.Object r6 = r4.next()
            m0.r.t.a.r.m.v r6 = (m0.r.t.a.r.m.v) r6
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r6 = r6.o()
            r7 = 0
            java.util.Collection r6 = i0.j.f.p.h.Y0(r6, r7, r7, r3, r7)
            m0.j.g.b(r5, r6)
            goto L_0x0029
        L_0x0042:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r5.iterator()
        L_0x004b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x005d
            java.lang.Object r5 = r4.next()
            boolean r6 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r6 == 0) goto L_0x004b
            r3.add(r5)
            goto L_0x004b
        L_0x005d:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0066:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x008b
            java.lang.Object r5 = r3.next()
            r6 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r6
            m0.r.t.a.r.g.d r6 = r6.getName()
            java.lang.Object r7 = r4.get(r6)
            if (r7 != 0) goto L_0x0085
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r4.put(r6, r7)
        L_0x0085:
            java.util.List r7 = (java.util.List) r7
            r7.add(r5)
            goto L_0x0066
        L_0x008b:
            java.util.Set r3 = r4.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0093:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0137
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            m0.r.t.a.r.g.d r5 = (m0.r.t.a.r.g.d) r5
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00b4:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00db
            java.lang.Object r7 = r4.next()
            r8 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r8 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r8
            boolean r8 = r8 instanceof m0.r.t.a.r.c.r
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r9 = r6.get(r8)
            if (r9 != 0) goto L_0x00d5
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r6.put(r8, r9)
        L_0x00d5:
            java.util.List r9 = (java.util.List) r9
            r9.add(r7)
            goto L_0x00b4
        L_0x00db:
            java.util.Set r4 = r6.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x00e3:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0093
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.Object r6 = r6.getValue()
            r8 = r6
            java.util.List r8 = (java.util.List) r8
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r6 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.b
            if (r7 == 0) goto L_0x0128
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r9 = r0.iterator()
        L_0x010d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x012a
            java.lang.Object r10 = r9.next()
            r11 = r10
            m0.r.t.a.r.c.r r11 = (m0.r.t.a.r.c.r) r11
            m0.r.t.a.r.g.d r11 = r11.getName()
            boolean r11 = m0.n.b.i.a(r11, r5)
            if (r11 == 0) goto L_0x010d
            r7.add(r10)
            goto L_0x010d
        L_0x0128:
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.c
        L_0x012a:
            r9 = r7
            m0.r.t.a.r.c.d r10 = r1.c
            m0.r.t.a.r.j.u.e r11 = new m0.r.t.a.r.j.u.e
            r11.<init>(r2, r1)
            r7 = r5
            r6.h(r7, r8, r9, r10, r11)
            goto L_0x00e3
        L_0x0137:
            java.util.List r1 = m0.r.t.a.r.m.a1.a.G0(r2)
            java.util.List r0 = m0.j.g.Z(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$allDescriptors$2.invoke():java.lang.Object");
    }
}
