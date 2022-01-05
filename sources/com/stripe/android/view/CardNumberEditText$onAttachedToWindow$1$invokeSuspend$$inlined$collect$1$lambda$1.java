package com.stripe.android.view;

import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1$1$1", f = "CardNumberEditText.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/stripe/android/view/CardNumberEditText$onAttachedToWindow$1$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CardNumberEditText.kt */
public final class CardNumberEditText$onAttachedToWindow$1$invokeSuspend$$inlined$collect$1$lambda$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ boolean $it;
    public int label;
    public final /* synthetic */ CardNumberEditText$onAttachedToWindow$1$invokeSuspend$$inlined$collect$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardNumberEditText$onAttachedToWindow$1$invokeSuspend$$inlined$collect$1$lambda$1(boolean z, m0.l.c cVar, CardNumberEditText$onAttachedToWindow$1$invokeSuspend$$inlined$collect$1 cardNumberEditText$onAttachedToWindow$1$invokeSuspend$$inlined$collect$1) {
        super(2, cVar);
        this.$it = z;
        this.this$0 = cardNumberEditText$onAttachedToWindow$1$invokeSuspend$$inlined$collect$1;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new CardNumberEditText$onAttachedToWindow$1$invokeSuspend$$inlined$collect$1$lambda$1(this.$it, cVar, this.this$0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((CardNumberEditText$onAttachedToWindow$1$invokeSuspend$$inlined$collect$1$lambda$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            this.this$0.this$0.this$0.isLoadingCallback$payments_core_release().invoke(Boolean.valueOf(this.$it));
            return i.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
