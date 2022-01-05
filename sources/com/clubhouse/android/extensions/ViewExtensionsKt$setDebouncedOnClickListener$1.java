package com.clubhouse.android.extensions;

import android.view.View;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.t;
import n0.a.g2.x;

@c(c = "com.clubhouse.android.extensions.ViewExtensionsKt$setDebouncedOnClickListener$1", f = "ViewExtensions.kt", l = {209}, m = "invokeSuspend")
/* compiled from: ViewExtensions.kt */
public final class ViewExtensionsKt$setDebouncedOnClickListener$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ f0 q;
    public final /* synthetic */ View.OnClickListener x;

    @c(c = "com.clubhouse.android.extensions.ViewExtensionsKt$setDebouncedOnClickListener$1$1", f = "ViewExtensions.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.extensions.ViewExtensionsKt$setDebouncedOnClickListener$1$1  reason: invalid class name */
    /* compiled from: ViewExtensions.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<View, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(onClickListener, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            View.OnClickListener onClickListener = onClickListener;
            AnonymousClass1 r02 = new AnonymousClass1(onClickListener, (m0.l.c) obj2);
            r02.c = (View) obj;
            i iVar = i.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(iVar);
            View view = (View) r02.c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            View view = (View) this.c;
            View.OnClickListener onClickListener = onClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewExtensionsKt$setDebouncedOnClickListener$1(View view, f0 f0Var, View.OnClickListener onClickListener, m0.l.c<? super ViewExtensionsKt$setDebouncedOnClickListener$1> cVar) {
        super(2, cVar);
        this.d = view;
        this.q = f0Var;
        this.x = onClickListener;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ViewExtensionsKt$setDebouncedOnClickListener$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ViewExtensionsKt$setDebouncedOnClickListener$1(this.d, this.q, this.x, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            View view = this.d;
            m0.n.b.i.e(view, "<this>");
            d k02 = a.k0(new ViewExtensionsKt$clicks$1(view, (m0.l.c<? super ViewExtensionsKt$clicks$1>) null));
            f0 f0Var = this.q;
            Objects.requireNonNull(x.a);
            t y3 = a.y3(k02, f0Var, x.a.b, 0, 4, (Object) null);
            d K2 = a.K2(a.T3(y3, 1), a.X0(a.i1(y3, 1), 400));
            final View.OnClickListener onClickListener = this.x;
            AnonymousClass1 r1 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
            this.c = 1;
            if (a.E0(K2, r1, this) == coroutineSingletons) {
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
