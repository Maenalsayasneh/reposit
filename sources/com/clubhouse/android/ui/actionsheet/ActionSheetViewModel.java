package com.clubhouse.android.ui.actionsheet;

import i0.e.b.a3.b.a;
import i0.e.b.a3.b.c;
import i0.e.b.g3.i.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ActionSheetViewModel.kt */
public final class ActionSheetViewModel extends a<h> {

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.actionsheet.ActionSheetViewModel$1", f = "ActionSheetViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.actionsheet.ActionSheetViewModel$1  reason: invalid class name */
    /* compiled from: ActionSheetViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ ActionSheetViewModel d;

        {
            this.d = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            final ActionSheetViewModel actionSheetViewModel = this.d;
            AnonymousClass1 r02 = new AnonymousClass1(actionSheetViewModel, (m0.l.c) obj2);
            r02.c = (c) obj;
            m0.i iVar = m0.i.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i0.j.f.p.h.d4(iVar);
            final c cVar = (c) r02.c;
            actionSheetViewModel.n(new l<h, m0.i>() {
                public Object invoke(Object obj) {
                    h hVar = (h) obj;
                    i.e(hVar, "state");
                    if (hVar.c) {
                        final c cVar = r3;
                        if (cVar instanceof i0.e.b.g3.i.i) {
                            r0.m(new l<h, h>() {
                                public Object invoke(Object obj) {
                                    h hVar = (h) obj;
                                    i.e(hVar, "$this$setState");
                                    return h.copy$default(hVar, (String) null, (String) null, false, ((i0.e.b.g3.i.i) c.this).a, 7, (Object) null);
                                }
                            });
                        }
                    }
                    return m0.i.a;
                }
            });
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i0.j.f.p.h.d4(obj);
            final c cVar = (c) this.c;
            final ActionSheetViewModel actionSheetViewModel = this.d;
            actionSheetViewModel.n(new l<h, m0.i>() {
                public Object invoke(Object obj) {
                    h hVar = (h) obj;
                    i.e(hVar, "state");
                    if (hVar.c) {
                        final c cVar = cVar;
                        if (cVar instanceof i0.e.b.g3.i.i) {
                            actionSheetViewModel.m(new l<h, h>() {
                                public Object invoke(Object obj) {
                                    h hVar = (h) obj;
                                    i.e(hVar, "$this$setState");
                                    return h.copy$default(hVar, (String) null, (String) null, false, ((i0.e.b.g3.i.i) c.this).a, 7, (Object) null);
                                }
                            });
                        }
                    }
                    return m0.i.a;
                }
            });
            return m0.i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionSheetViewModel(h hVar) {
        super(hVar);
        i.e(hVar, "initialState");
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
    }
}
