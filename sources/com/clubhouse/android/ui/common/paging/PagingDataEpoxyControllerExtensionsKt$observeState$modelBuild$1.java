package com.clubhouse.android.ui.common.paging;

import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import i0.e.b.g3.m.f.a;
import i0.e.b.g3.m.f.d;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f2.l;

@c(c = "com.clubhouse.android.ui.common.paging.PagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1", f = "PagingDataEpoxyControllerExtensions.kt", l = {68}, m = "invokeSuspend")
/* compiled from: PagingDataEpoxyControllerExtensions.kt */
public final class PagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1 extends SuspendLambda implements p<l<? super d>, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ PagingDataEpoxyController<T> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1(PagingDataEpoxyController<T> pagingDataEpoxyController, m0.l.c<? super PagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1> cVar) {
        super(2, cVar);
        this.q = pagingDataEpoxyController;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        PagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1 pagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1 = new PagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1(this.q, cVar);
        pagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1.d = obj;
        return pagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1;
    }

    public Object invoke(Object obj, Object obj2) {
        PagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1 pagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1 = new PagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1(this.q, (m0.l.c) obj2);
        pagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1.d = (l) obj;
        return pagingDataEpoxyControllerExtensionsKt$observeState$modelBuild$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            l lVar = (l) this.d;
            PagingDataEpoxyController<T> pagingDataEpoxyController = this.q;
            final a aVar = new a(lVar, pagingDataEpoxyController);
            pagingDataEpoxyController.addModelBuildListener(aVar);
            final PagingDataEpoxyController<T> pagingDataEpoxyController2 = this.q;
            AnonymousClass1 r1 = new m0.n.a.a<i>() {
                public Object invoke() {
                    pagingDataEpoxyController2.removeModelBuildListener(aVar);
                    return i.a;
                }
            };
            this.c = 1;
            if (ProduceKt.a(lVar, r1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
