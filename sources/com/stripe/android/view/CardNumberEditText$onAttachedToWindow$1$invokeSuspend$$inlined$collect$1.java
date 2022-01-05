package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import m0.r.t.a.r.m.a1.a;
import n0.a.d0;
import n0.a.g2.e;
import n0.a.h2.o;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Ln0/a/g2/e;", "value", "Lm0/i;", "emit", "(Ljava/lang/Object;Lm0/l/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
/* compiled from: Collect.kt */
public final class CardNumberEditText$onAttachedToWindow$1$invokeSuspend$$inlined$collect$1 implements e<Boolean> {
    public final /* synthetic */ CardNumberEditText$onAttachedToWindow$1 this$0;

    public CardNumberEditText$onAttachedToWindow$1$invokeSuspend$$inlined$collect$1(CardNumberEditText$onAttachedToWindow$1 cardNumberEditText$onAttachedToWindow$1) {
        this.this$0 = cardNumberEditText$onAttachedToWindow$1;
    }

    public Object emit(Object obj, c cVar) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d0 d0Var = m0.a;
        Object k4 = a.k4(o.c, new CardNumberEditText$onAttachedToWindow$1$invokeSuspend$$inlined$collect$1$lambda$1(booleanValue, (c) null, this), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return i.a;
    }
}
