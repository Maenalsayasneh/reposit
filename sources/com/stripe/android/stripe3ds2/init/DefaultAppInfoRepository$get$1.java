package com.stripe.android.stripe3ds2.init;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository", f = "DefaultAppInfoRepository.kt", l = {59}, m = "get")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/l/c;", "Lcom/stripe/android/stripe3ds2/init/AppInfo;", "continuation", "", "get", "(Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultAppInfoRepository.kt */
public final class DefaultAppInfoRepository$get$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultAppInfoRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository$get$1(DefaultAppInfoRepository defaultAppInfoRepository, m0.l.c cVar) {
        super(cVar);
        this.this$0 = defaultAppInfoRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.get(this);
    }
}
