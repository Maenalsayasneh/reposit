package com.clubhouse.android.ui.selection;

import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.x.d;
import i0.e.b.g3.x.f;
import i0.j.f.p.h;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: SelectionViewModel.kt */
public final class SelectionViewModel extends i0.e.b.a3.b.a<f> {
    public static final /* synthetic */ int m = 0;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.selection.SelectionViewModel$1", f = "SelectionViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.selection.SelectionViewModel$1  reason: invalid class name */
    /* compiled from: SelectionViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ SelectionViewModel d;

        {
            this.d = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, (m0.l.c) obj2);
            r02.c = (c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final c cVar = (c) this.c;
            if (cVar instanceof d) {
                SelectionViewModel selectionViewModel = this.d;
                AnonymousClass1 r1 = new l<f, f>() {
                    public Object invoke(Object obj) {
                        f fVar = (f) obj;
                        i.e(fVar, "$this$setState");
                        return f.copy$default(fVar, (String) null, (Set) null, ((d) cVar).a, (String) null, (String) null, 27, (Object) null);
                    }
                };
                int i = SelectionViewModel.m;
                selectionViewModel.m(r1);
            }
            return m0.i.a;
        }
    }

    static {
        new a((m0.n.b.f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionViewModel(f fVar) {
        super(fVar);
        i.e(fVar, "initialState");
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
    }

    /* compiled from: SelectionViewModel.kt */
    public static final class a implements v<SelectionViewModel, f> {
        public final /* synthetic */ i0.e.b.c3.h.c<SelectionViewModel, f> a = new i0.e.b.c3.h.c<>(SelectionViewModel.class);

        public a() {
        }

        public SelectionViewModel create(j0 j0Var, f fVar) {
            i.e(j0Var, "viewModelContext");
            i.e(fVar, "state");
            return this.a.create(j0Var, fVar);
        }

        public f initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(m0.n.b.f fVar) {
        }
    }
}
