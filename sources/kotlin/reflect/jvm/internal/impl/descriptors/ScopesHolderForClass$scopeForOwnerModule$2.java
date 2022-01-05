package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.a;

/* compiled from: ScopesHolderForClass.kt */
public final class ScopesHolderForClass$scopeForOwnerModule$2 extends Lambda implements a<T> {
    public final /* synthetic */ ScopesHolderForClass<T> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScopesHolderForClass$scopeForOwnerModule$2(ScopesHolderForClass<T> scopesHolderForClass) {
        super(0);
        this.c = scopesHolderForClass;
    }

    public Object invoke() {
        ScopesHolderForClass<T> scopesHolderForClass = this.c;
        return (MemberScope) scopesHolderForClass.d.invoke(scopesHolderForClass.e);
    }
}
