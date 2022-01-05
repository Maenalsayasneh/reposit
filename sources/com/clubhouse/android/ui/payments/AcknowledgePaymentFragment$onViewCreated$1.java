package com.clubhouse.android.ui.payments;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.payments.AcknowledgePaymentFragment$onViewCreated$1", f = "AcknowledgePaymentFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: AcknowledgePaymentFragment.kt */
public final class AcknowledgePaymentFragment$onViewCreated$1 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ AcknowledgePaymentFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AcknowledgePaymentFragment$onViewCreated$1(AcknowledgePaymentFragment acknowledgePaymentFragment, m0.l.c<? super AcknowledgePaymentFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = acknowledgePaymentFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        AcknowledgePaymentFragment$onViewCreated$1 acknowledgePaymentFragment$onViewCreated$1 = new AcknowledgePaymentFragment$onViewCreated$1(this.d, cVar);
        acknowledgePaymentFragment$onViewCreated$1.c = obj;
        return acknowledgePaymentFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        AcknowledgePaymentFragment$onViewCreated$1 acknowledgePaymentFragment$onViewCreated$1 = new AcknowledgePaymentFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        acknowledgePaymentFragment$onViewCreated$1.c = (String) obj;
        i iVar = i.a;
        acknowledgePaymentFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        AcknowledgePaymentFragment acknowledgePaymentFragment = this.d;
        k<Object>[] kVarArr = AcknowledgePaymentFragment.p2;
        acknowledgePaymentFragment.U0().d.setEnabled(!StringsKt__IndentKt.o((String) this.c));
        return i.a;
    }
}
