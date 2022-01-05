package m0.r.t.a.r.e.a.s;

import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import m0.i;
import m0.r.t.a.r.j.g;
import m0.r.t.a.r.k.b.l;

/* compiled from: DescriptorResolverUtils */
public final class a extends g {
    public final /* synthetic */ l a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ boolean c;

    /* renamed from: m0.r.t.a.r.e.a.s.a$a  reason: collision with other inner class name */
    /* compiled from: DescriptorResolverUtils */
    public class C0256a implements m0.n.a.l<CallableMemberDescriptor, i> {
        public C0256a() {
        }

        public Object invoke(Object obj) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
            if (callableMemberDescriptor != null) {
                a.this.a.a(callableMemberDescriptor);
                return i.a;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"}));
        }
    }

    public a(l lVar, Set set, boolean z) {
        this.a = lVar;
        this.b = set;
        this.c = z;
    }

    public static /* synthetic */ void f(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void a(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor != null) {
            OverridingUtil.r(callableMemberDescriptor, new C0256a());
            this.b.add(callableMemberDescriptor);
            return;
        }
        f(0);
        throw null;
    }

    public void d(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection) {
        if (callableMemberDescriptor == null) {
            f(3);
            throw null;
        } else if (!this.c || callableMemberDescriptor.f() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            super.d(callableMemberDescriptor, collection);
        }
    }

    public void e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
    }
}
