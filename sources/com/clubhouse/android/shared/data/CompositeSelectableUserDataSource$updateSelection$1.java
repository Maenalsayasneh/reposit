package com.clubhouse.android.shared.data;

import g0.a.b.b.a;
import h0.u.w;
import i0.e.b.b3.b.e.m;
import i0.j.f.p.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.q;

@c(c = "com.clubhouse.android.shared.data.CompositeSelectableUserDataSource$updateSelection$1", f = "CompositeSelectableUserDataSource.kt", l = {107}, m = "invokeSuspend")
/* compiled from: CompositeSelectableUserDataSource.kt */
public final class CompositeSelectableUserDataSource$updateSelection$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ CompositeSelectableUserDataSource d;

    @c(c = "com.clubhouse.android.shared.data.CompositeSelectableUserDataSource$updateSelection$1$1", f = "CompositeSelectableUserDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.shared.data.CompositeSelectableUserDataSource$updateSelection$1$1  reason: invalid class name */
    /* compiled from: CompositeSelectableUserDataSource.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<i0.e.b.a3.d.a<m>, m0.l.c<? super i0.e.b.a3.d.a<m>>, Object> {
        public /* synthetic */ Object c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(compositeSelectableUserDataSource, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(compositeSelectableUserDataSource, (m0.l.c) obj2);
            r02.c = (i0.e.b.a3.d.a) obj;
            return r02.invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            i0.e.b.a3.d.a aVar = (i0.e.b.a3.d.a) this.c;
            T t = aVar.a;
            Set<m> set = compositeSelectableUserDataSource.d;
            boolean z = true;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Boolean.valueOf(((m) it.next()).g.getId().intValue() == ((m) aVar.a).g.getId().intValue()).booleanValue()) {
                        break;
                    }
                }
            }
            z = false;
            return new i0.e.b.a3.d.a(t, z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositeSelectableUserDataSource$updateSelection$1(CompositeSelectableUserDataSource compositeSelectableUserDataSource, m0.l.c<? super CompositeSelectableUserDataSource$updateSelection$1> cVar) {
        super(2, cVar);
        this.d = compositeSelectableUserDataSource;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new CompositeSelectableUserDataSource$updateSelection$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new CompositeSelectableUserDataSource$updateSelection$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            q qVar = (q) this.d.g;
            final CompositeSelectableUserDataSource compositeSelectableUserDataSource = this.d;
            w d0 = a.d0((w) qVar.getValue(), new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null));
            this.c = 1;
            if (qVar.emit(d0, this) == coroutineSingletons) {
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
