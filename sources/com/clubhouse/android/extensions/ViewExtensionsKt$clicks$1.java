package com.clubhouse.android.extensions;

import android.view.View;
import i0.e.b.d3.g;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.a;
import m0.n.a.p;
import n0.a.f2.l;

@c(c = "com.clubhouse.android.extensions.ViewExtensionsKt$clicks$1", f = "ViewExtensions.kt", l = {199}, m = "invokeSuspend")
/* compiled from: ViewExtensions.kt */
public final class ViewExtensionsKt$clicks$1 extends SuspendLambda implements p<l<? super View>, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ View q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewExtensionsKt$clicks$1(View view, m0.l.c<? super ViewExtensionsKt$clicks$1> cVar) {
        super(2, cVar);
        this.q = view;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ViewExtensionsKt$clicks$1 viewExtensionsKt$clicks$1 = new ViewExtensionsKt$clicks$1(this.q, cVar);
        viewExtensionsKt$clicks$1.d = obj;
        return viewExtensionsKt$clicks$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ViewExtensionsKt$clicks$1 viewExtensionsKt$clicks$1 = new ViewExtensionsKt$clicks$1(this.q, (m0.l.c) obj2);
        viewExtensionsKt$clicks$1.d = (l) obj;
        return viewExtensionsKt$clicks$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            l lVar = (l) this.d;
            this.q.setOnClickListener(new g(lVar));
            final View view = this.q;
            AnonymousClass2 r1 = new a<i>() {
                public Object invoke() {
                    view.setOnClickListener((View.OnClickListener) null);
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
