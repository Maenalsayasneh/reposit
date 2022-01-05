package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.d0;
import n0.a.f0;
import n0.a.h2.o;
import n0.a.l1;
import n0.a.m0;

@c(c = "com.stripe.android.stripe3ds2.transaction.TransactionTimer$Default$start$2", f = "TransactionTimer.kt", l = {40, 42}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: TransactionTimer.kt */
public final class TransactionTimer$Default$start$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int label;
    public final /* synthetic */ TransactionTimer.Default this$0;

    @c(c = "com.stripe.android.stripe3ds2.transaction.TransactionTimer$Default$start$2$1", f = "TransactionTimer.kt", l = {}, m = "invokeSuspend")
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* renamed from: com.stripe.android.stripe3ds2.transaction.TransactionTimer$Default$start$2$1  reason: invalid class name */
    /* compiled from: TransactionTimer.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
        public int label;
        public final /* synthetic */ TransactionTimer$Default$start$2 this$0;

        {
            this.this$0 = r1;
        }

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            m0.n.b.i.e(cVar, "completion");
            return new AnonymousClass1(this.this$0, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                h.d4(obj);
                this.this$0.this$0.onTimeout$3ds2sdk_release();
                return i.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionTimer$Default$start$2(TransactionTimer.Default defaultR, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultR;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new TransactionTimer$Default$start$2(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((TransactionTimer$Default$start$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            long access$getTimeoutMillis$p = this.this$0.timeoutMillis;
            this.label = 1;
            if (a.d1(access$getTimeoutMillis$p, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else if (i == 2) {
            h.d4(obj);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d0 d0Var = m0.a;
        l1 l1Var = o.c;
        AnonymousClass1 r1 = new AnonymousClass1(this, (m0.l.c) null);
        this.label = 2;
        if (a.k4(l1Var, r1, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return i.a;
    }
}
