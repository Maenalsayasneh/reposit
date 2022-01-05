package com.stripe.android.paymentsheet.analytics;

import android.content.SharedPreferences;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;
import n0.a.k2.b;

@c(c = "com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository$get$2", f = "DefaultDeviceIdRepository.kt", l = {51}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lcom/stripe/android/paymentsheet/analytics/DeviceId;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultDeviceIdRepository.kt */
public final class DefaultDeviceIdRepository$get$2 extends SuspendLambda implements p<f0, m0.l.c<? super DeviceId>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ DefaultDeviceIdRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultDeviceIdRepository$get$2(DefaultDeviceIdRepository defaultDeviceIdRepository, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultDeviceIdRepository;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new DefaultDeviceIdRepository$get$2(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultDeviceIdRepository$get$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        b bVar;
        DeviceId deviceId;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            b access$getMutex$p = this.this$0.mutex;
            this.L$0 = access$getMutex$p;
            this.label = 1;
            if (access$getMutex$p.a((Object) null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = access$getMutex$p;
        } else if (i == 1) {
            bVar = (b) this.L$0;
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            SharedPreferences access$getPrefs$p = this.this$0.getPrefs();
            DefaultDeviceIdRepository.Companion unused = DefaultDeviceIdRepository.Companion;
            String string = access$getPrefs$p.getString(AnalyticsRequestFactory.FIELD_DEVICE_ID, (String) null);
            if (string != null) {
                deviceId = new DeviceId(string);
            } else {
                deviceId = this.this$0.createDeviceId();
            }
            return deviceId;
        } finally {
            bVar.b((Object) null);
        }
    }
}
