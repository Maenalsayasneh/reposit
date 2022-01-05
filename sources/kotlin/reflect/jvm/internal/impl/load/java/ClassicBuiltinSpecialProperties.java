package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.e.a.c;
import m0.r.t.a.r.g.d;

/* compiled from: ClassicBuiltinSpecialProperties.kt */
public final class ClassicBuiltinSpecialProperties {
    public static final ClassicBuiltinSpecialProperties a = new ClassicBuiltinSpecialProperties();

    public final String a(CallableMemberDescriptor callableMemberDescriptor) {
        i.e(callableMemberDescriptor, "<this>");
        f.A(callableMemberDescriptor);
        CallableMemberDescriptor c = DescriptorUtilsKt.c(DescriptorUtilsKt.m(callableMemberDescriptor), false, new ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1(this), 1);
        if (c == null) {
            return null;
        }
        c cVar = c.a;
        d dVar = c.b.get(DescriptorUtilsKt.h(c));
        if (dVar == null) {
            return null;
        }
        return dVar.b();
    }

    public final boolean b(CallableMemberDescriptor callableMemberDescriptor) {
        i.e(callableMemberDescriptor, "callableMemberDescriptor");
        c cVar = c.a;
        if (!c.e.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (g.f(c.d, DescriptorUtilsKt.d(callableMemberDescriptor)) && callableMemberDescriptor.h().isEmpty()) {
            return true;
        }
        if (!f.A(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends CallableMemberDescriptor> e = callableMemberDescriptor.e();
        i.d(e, "overriddenDescriptors");
        if (e.isEmpty()) {
            return false;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : e) {
            i.d(callableMemberDescriptor2, "it");
            if (b(callableMemberDescriptor2)) {
                return true;
            }
        }
        return false;
    }
}
