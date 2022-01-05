package com.stripe.android.paymentsheet.analytics;

import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.analytics.DefaultEventReporter$fireEvent$1", f = "DefaultEventReporter.kt", l = {104}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultEventReporter.kt */
public final class DefaultEventReporter$fireEvent$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ PaymentSheetEvent $event;
    public int label;
    public final /* synthetic */ DefaultEventReporter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultEventReporter$fireEvent$1(DefaultEventReporter defaultEventReporter, PaymentSheetEvent paymentSheetEvent, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultEventReporter;
        this.$event = paymentSheetEvent;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new DefaultEventReporter$fireEvent$1(this.this$0, this.$event, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultEventReporter$fireEvent$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            DeviceIdRepository access$getDeviceIdRepository$p = this.this$0.deviceIdRepository;
            this.label = 1;
            obj = access$getDeviceIdRepository$p.get(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.analyticsRequestExecutor.executeAsync(this.this$0.analyticsRequestFactory.createRequest$payments_core_release(this.$event, this.this$0.sessionId, (DeviceId) obj));
        return i.a;
    }
}
