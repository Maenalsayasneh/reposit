package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import kotlin.jvm.internal.FunctionReference;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.f;

/* compiled from: ReflectJavaClass.kt */
public final /* synthetic */ class ReflectJavaClass$constructors$1 extends FunctionReference implements l<Member, Boolean> {
    public static final ReflectJavaClass$constructors$1 c = new ReflectJavaClass$constructors$1();

    public ReflectJavaClass$constructors$1() {
        super(1);
    }

    public final String getName() {
        return "isSynthetic";
    }

    public final f getOwner() {
        return m.a(Member.class);
    }

    public final String getSignature() {
        return "isSynthetic()Z";
    }

    public Object invoke(Object obj) {
        Member member = (Member) obj;
        i.e(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }
}
