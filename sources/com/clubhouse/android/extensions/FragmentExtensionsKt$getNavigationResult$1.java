package com.clubhouse.android.extensions;

import androidx.lifecycle.Lifecycle;
import g0.a.b.b.a;
import h0.q.f0;
import h0.q.r;
import h0.t.f;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.extensions.FragmentExtensionsKt$getNavigationResult$1", f = "FragmentExtensions.kt", l = {77}, m = "invokeSuspend")
/* compiled from: FragmentExtensions.kt */
public final class FragmentExtensionsKt$getNavigationResult$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ f d;
    public final /* synthetic */ String q;
    public final /* synthetic */ l<T, i> x;

    @c(c = "com.clubhouse.android.extensions.FragmentExtensionsKt$getNavigationResult$1$1", f = "FragmentExtensions.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.extensions.FragmentExtensionsKt$getNavigationResult$1$1  reason: invalid class name */
    /* compiled from: FragmentExtensions.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            return new AnonymousClass1(fVar, str, lVar, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            AnonymousClass1 r4 = new AnonymousClass1(fVar, str, lVar, (m0.l.c) obj2);
            i iVar = i.a;
            r4.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            h0.q.f0 a = fVar.a();
            if (a.b.containsKey(str)) {
                Object a2 = fVar.a().a(str);
                if (a2 != null) {
                    lVar.invoke(a2);
                }
                h0.q.f0 a3 = fVar.a();
                String str = str;
                a3.b.remove(str);
                f0.b remove = a3.d.remove(str);
            }
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentExtensionsKt$getNavigationResult$1(f fVar, String str, l<? super T, i> lVar, m0.l.c<? super FragmentExtensionsKt$getNavigationResult$1> cVar) {
        super(2, cVar);
        this.d = fVar;
        this.q = str;
        this.x = lVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new FragmentExtensionsKt$getNavigationResult$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        n0.a.f0 f0Var = (n0.a.f0) obj;
        return new FragmentExtensionsKt$getNavigationResult$1(this.d, this.q, this.x, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            final f fVar = this.d;
            if (fVar != null) {
                final String str = this.q;
                final l<T, i> lVar = this.x;
                AnonymousClass1 r1 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
                this.c = 1;
                r rVar = fVar.x;
                m0.n.b.i.d(rVar, "lifecycle");
                if (a.F0(rVar, Lifecycle.State.RESUMED, r1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
