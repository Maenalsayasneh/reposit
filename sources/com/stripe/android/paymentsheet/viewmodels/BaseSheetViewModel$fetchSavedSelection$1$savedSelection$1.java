package com.stripe.android.paymentsheet.viewmodels;

import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.model.SavedSelection;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$fetchSavedSelection$1$savedSelection$1", f = "BaseSheetViewModel.kt", l = {154}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"TransitionTargetType", "Ln0/a/f0;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BaseSheetViewModel.kt */
public final class BaseSheetViewModel$fetchSavedSelection$1$savedSelection$1 extends SuspendLambda implements p<f0, m0.l.c<? super SavedSelection>, Object> {
    public int label;
    public final /* synthetic */ BaseSheetViewModel$fetchSavedSelection$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel$fetchSavedSelection$1$savedSelection$1(BaseSheetViewModel$fetchSavedSelection$1 baseSheetViewModel$fetchSavedSelection$1, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = baseSheetViewModel$fetchSavedSelection$1;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new BaseSheetViewModel$fetchSavedSelection$1$savedSelection$1(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((BaseSheetViewModel$fetchSavedSelection$1$savedSelection$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            PrefsRepository prefsRepository = this.this$0.this$0.getPrefsRepository();
            this.label = 1;
            obj = prefsRepository.getSavedSelection(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
