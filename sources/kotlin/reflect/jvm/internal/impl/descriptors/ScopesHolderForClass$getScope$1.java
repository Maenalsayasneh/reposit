package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.a;
import m0.r.t.a.r.m.x0.e;

/* compiled from: ScopesHolderForClass.kt */
public final class ScopesHolderForClass$getScope$1 extends Lambda implements a<T> {
    public final /* synthetic */ ScopesHolderForClass<T> c;
    public final /* synthetic */ e d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScopesHolderForClass$getScope$1(ScopesHolderForClass<T> scopesHolderForClass, e eVar) {
        super(0);
        this.c = scopesHolderForClass;
        this.d = eVar;
    }

    public Object invoke() {
        return (MemberScope) this.c.d.invoke(this.d);
    }
}
