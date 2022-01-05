package com.stripe.android.paymentsheet.viewmodels;

import com.stripe.android.paymentsheet.model.SavedSelection;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.e;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$fetchSavedSelection$1", f = "BaseSheetViewModel.kt", l = {153}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"TransitionTargetType", "Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BaseSheetViewModel.kt */
public final class BaseSheetViewModel$fetchSavedSelection$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int label;
    public final /* synthetic */ BaseSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel$fetchSavedSelection$1(BaseSheetViewModel baseSheetViewModel, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = baseSheetViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new BaseSheetViewModel$fetchSavedSelection$1(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((BaseSheetViewModel$fetchSavedSelection$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            e workContext = this.this$0.getWorkContext();
            BaseSheetViewModel$fetchSavedSelection$1$savedSelection$1 baseSheetViewModel$fetchSavedSelection$1$savedSelection$1 = new BaseSheetViewModel$fetchSavedSelection$1$savedSelection$1(this, (m0.l.c) null);
            this.label = 1;
            obj = a.k4(workContext, baseSheetViewModel$fetchSavedSelection$1$savedSelection$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0._savedSelection.setValue((SavedSelection) obj);
        return i.a;
    }
}
