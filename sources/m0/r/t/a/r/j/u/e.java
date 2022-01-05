package m0.r.t.a.r.j.u;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import m0.n.a.l;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.j.g;

/* compiled from: GivenFunctionsMemberScope.kt */
public final class e extends g {
    public final /* synthetic */ ArrayList<i> a;
    public final /* synthetic */ GivenFunctionsMemberScope b;

    public e(ArrayList<i> arrayList, GivenFunctionsMemberScope givenFunctionsMemberScope) {
        this.a = arrayList;
        this.b = givenFunctionsMemberScope;
    }

    public void a(CallableMemberDescriptor callableMemberDescriptor) {
        m0.n.b.i.e(callableMemberDescriptor, "fakeOverride");
        OverridingUtil.r(callableMemberDescriptor, (l<CallableMemberDescriptor, m0.i>) null);
        this.a.add(callableMemberDescriptor);
    }

    public void e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        m0.n.b.i.e(callableMemberDescriptor, "fromSuper");
        m0.n.b.i.e(callableMemberDescriptor2, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.b.c + ": " + callableMemberDescriptor + " vs " + callableMemberDescriptor2).toString());
    }
}
