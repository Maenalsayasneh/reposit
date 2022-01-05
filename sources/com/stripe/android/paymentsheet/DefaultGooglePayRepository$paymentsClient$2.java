package com.stripe.android.paymentsheet;

import android.content.Context;
import i0.h.a.b.n.c;
import i0.h.a.b.n.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li0/h/a/b/n/c;", "kotlin.jvm.PlatformType", "invoke", "()Li0/h/a/b/n/c;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultGooglePayRepository.kt */
public final class DefaultGooglePayRepository$paymentsClient$2 extends Lambda implements a<c> {
    public final /* synthetic */ DefaultGooglePayRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultGooglePayRepository$paymentsClient$2(DefaultGooglePayRepository defaultGooglePayRepository) {
        super(0);
        this.this$0 = defaultGooglePayRepository;
    }

    public final c invoke() {
        d.a.C0137a aVar = new d.a.C0137a();
        int ordinal = this.this$0.environment.ordinal();
        int i = 1;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 3;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        aVar.a(i);
        d.a aVar2 = new d.a(aVar);
        Context access$getContext$p = this.this$0.context;
        i0.h.a.b.c.g.a<d.a> aVar3 = d.a;
        return new c(access$getContext$p, aVar2);
    }
}
