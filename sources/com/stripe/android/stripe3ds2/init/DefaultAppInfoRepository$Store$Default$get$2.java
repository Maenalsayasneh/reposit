package com.stripe.android.stripe3ds2.init;

import android.content.SharedPreferences;
import com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$Store$Default$get$2", f = "DefaultAppInfoRepository.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lcom/stripe/android/stripe3ds2/init/AppInfo;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultAppInfoRepository.kt */
public final class DefaultAppInfoRepository$Store$Default$get$2 extends SuspendLambda implements p<f0, m0.l.c<? super AppInfo>, Object> {
    public int label;
    public final /* synthetic */ DefaultAppInfoRepository.Store.Default this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository$Store$Default$get$2(DefaultAppInfoRepository.Store.Default defaultR, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultR;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new DefaultAppInfoRepository$Store$Default$get$2(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultAppInfoRepository$Store$Default$get$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            SharedPreferences access$getSharedPrefs$p = this.this$0.getSharedPrefs();
            DefaultAppInfoRepository.Store.Default.Companion unused = DefaultAppInfoRepository.Store.Default.Companion;
            int i = access$getSharedPrefs$p.getInt("app_version", 0);
            SharedPreferences access$getSharedPrefs$p2 = this.this$0.getSharedPrefs();
            DefaultAppInfoRepository.Store.Default.Companion unused2 = DefaultAppInfoRepository.Store.Default.Companion;
            String string = access$getSharedPrefs$p2.getString("sdk_app_id", (String) null);
            if (string == null) {
                return null;
            }
            m0.n.b.i.d(string, "it");
            return new AppInfo(string, i);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
