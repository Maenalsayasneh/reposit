package com.stripe.android.view;

import com.stripe.android.model.BankStatuses;
import h0.q.v;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.stripe.android.view.FpxViewModel$getFpxBankStatues$1", f = "FpxViewModel.kt", l = {25, 26}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/q/v;", "Lcom/stripe/android/model/BankStatuses;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: FpxViewModel.kt */
public final class FpxViewModel$getFpxBankStatues$1 extends SuspendLambda implements p<v<BankStatuses>, m0.l.c<? super i>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ FpxViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FpxViewModel$getFpxBankStatues$1(FpxViewModel fpxViewModel, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = fpxViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        FpxViewModel$getFpxBankStatues$1 fpxViewModel$getFpxBankStatues$1 = new FpxViewModel$getFpxBankStatues$1(this.this$0, cVar);
        fpxViewModel$getFpxBankStatues$1.L$0 = obj;
        return fpxViewModel$getFpxBankStatues$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((FpxViewModel$getFpxBankStatues$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: com.stripe.android.model.BankStatuses} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: h0.q.v} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            i0.j.f.p.h.d4(r12)
            goto L_0x0068
        L_0x0010:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0018:
            java.lang.Object r1 = r11.L$0
            h0.q.v r1 = (h0.q.v) r1
            i0.j.f.p.h.d4(r12)     // Catch:{ all -> 0x0020 }
            goto L_0x004b
        L_0x0020:
            r12 = move-exception
            goto L_0x004e
        L_0x0022:
            i0.j.f.p.h.d4(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            h0.q.v r1 = (h0.q.v) r1
            com.stripe.android.view.FpxViewModel r12 = r11.this$0     // Catch:{ all -> 0x0020 }
            com.stripe.android.networking.StripeRepository r12 = r12.stripeRepository     // Catch:{ all -> 0x0020 }
            com.stripe.android.networking.ApiRequest$Options r10 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0020 }
            com.stripe.android.view.FpxViewModel r4 = r11.this$0     // Catch:{ all -> 0x0020 }
            java.lang.String r5 = r4.publishableKey     // Catch:{ all -> 0x0020 }
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0020 }
            r11.L$0 = r1     // Catch:{ all -> 0x0020 }
            r11.label = r3     // Catch:{ all -> 0x0020 }
            java.lang.Object r12 = r12.getFpxBankStatus(r10, r11)     // Catch:{ all -> 0x0020 }
            if (r12 != r0) goto L_0x004b
            return r0
        L_0x004b:
            com.stripe.android.model.BankStatuses r12 = (com.stripe.android.model.BankStatuses) r12     // Catch:{ all -> 0x0020 }
            goto L_0x0052
        L_0x004e:
            java.lang.Object r12 = i0.j.f.p.h.l0(r12)
        L_0x0052:
            com.stripe.android.model.BankStatuses r4 = new com.stripe.android.model.BankStatuses
            r5 = 0
            r4.<init>(r5, r3, r5)
            boolean r3 = r12 instanceof kotlin.Result.Failure
            if (r3 == 0) goto L_0x005d
            r12 = r4
        L_0x005d:
            r11.L$0 = r5
            r11.label = r2
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto L_0x0068
            return r0
        L_0x0068:
            m0.i r12 = m0.i.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.FpxViewModel$getFpxBankStatues$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
