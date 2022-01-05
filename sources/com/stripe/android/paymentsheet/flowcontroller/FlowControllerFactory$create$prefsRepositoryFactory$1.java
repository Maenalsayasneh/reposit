package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.DefaultPrefsRepository;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "customerId", "", "isGooglePayReady", "Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;", "invoke", "(Ljava/lang/String;Z)Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: FlowControllerFactory.kt */
public final class FlowControllerFactory$create$prefsRepositoryFactory$1 extends Lambda implements p<String, Boolean, DefaultPrefsRepository> {
    public final /* synthetic */ FlowControllerFactory this$0;

    @m0.l.f.a.c(c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$create$prefsRepositoryFactory$1$1", f = "FlowControllerFactory.kt", l = {}, m = "invokeSuspend")
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$create$prefsRepositoryFactory$1$1  reason: invalid class name */
    /* compiled from: FlowControllerFactory.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements l<c<? super Boolean>, Object> {
        public int label;

        public final c<m0.i> create(c<?> cVar) {
            i.e(cVar, "completion");
            return new AnonymousClass1(z, cVar);
        }

        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((c) obj)).invokeSuspend(m0.i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                h.d4(obj);
                return Boolean.valueOf(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowControllerFactory$create$prefsRepositoryFactory$1(FlowControllerFactory flowControllerFactory) {
        super(2);
        this.this$0 = flowControllerFactory;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((String) obj, ((Boolean) obj2).booleanValue());
    }

    public final DefaultPrefsRepository invoke(String str, final boolean z) {
        i.e(str, "customerId");
        return new DefaultPrefsRepository(this.this$0.appContext, str, new AnonymousClass1((c) null), m0.c);
    }
}
