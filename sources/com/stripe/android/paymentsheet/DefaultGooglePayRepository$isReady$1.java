package com.stripe.android.paymentsheet;

import com.google.android.gms.common.api.ApiException;
import com.stripe.android.Logger;
import i0.h.a.b.m.c;
import i0.h.a.b.m.g;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.i;
import n0.a.g2.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li0/h/a/b/m/g;", "", "kotlin.jvm.PlatformType", "task", "Lm0/i;", "onComplete", "(Li0/h/a/b/m/g;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultGooglePayRepository.kt */
public final class DefaultGooglePayRepository$isReady$1<TResult> implements c<Boolean> {
    public final /* synthetic */ q $isReadyState;
    public final /* synthetic */ DefaultGooglePayRepository this$0;

    public DefaultGooglePayRepository$isReady$1(DefaultGooglePayRepository defaultGooglePayRepository, q qVar) {
        this.this$0 = defaultGooglePayRepository;
        this.$isReadyState = qVar;
    }

    public final void onComplete(g<Boolean> gVar) {
        Object obj;
        i.e(gVar, "task");
        try {
            obj = Boolean.valueOf(i.a(gVar.k(ApiException.class), Boolean.TRUE));
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Object obj2 = Boolean.FALSE;
        if (obj instanceof Result.Failure) {
            obj = obj2;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Logger access$getLogger$p = this.this$0.logger;
        access$getLogger$p.info("Google Pay ready? " + booleanValue);
        this.$isReadyState.setValue(Boolean.valueOf(booleanValue));
    }
}
