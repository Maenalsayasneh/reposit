package com.clubhouse.android.ui.events.creation;

import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.o.w0.b0;
import i0.e.b.g3.o.w0.c0;
import i0.e.b.g3.o.w0.d0;
import i0.e.b.g3.o.w0.w;
import i0.e.b.g3.o.w0.z;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.events.creation.AddEditEventFragment$onViewCreated$1", f = "AddEditEventFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: AddEditEventFragment.kt */
public final class AddEditEventFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ AddEditEventFragment d;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements l<j, i> {
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj) {
            super(1);
            this.c = i;
            this.d = obj;
        }

        public final Object invoke(Object obj) {
            int i = this.c;
            if (i == 0) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showBanner");
                jVar.e(((AddEditEventFragment) this.d).getString(R.string.successfully_cancelled_event));
                return i.a;
            } else if (i == 1) {
                j jVar2 = (j) obj;
                m0.n.b.i.e(jVar2, "$this$showBanner");
                jVar2.e(((AddEditEventFragment) this.d).getString(R.string.submitted_if_you_dont_see));
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventFragment$onViewCreated$1(AddEditEventFragment addEditEventFragment, m0.l.c<? super AddEditEventFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = addEditEventFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        AddEditEventFragment$onViewCreated$1 addEditEventFragment$onViewCreated$1 = new AddEditEventFragment$onViewCreated$1(this.d, cVar);
        addEditEventFragment$onViewCreated$1.c = obj;
        return addEditEventFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        AddEditEventFragment$onViewCreated$1 addEditEventFragment$onViewCreated$1 = new AddEditEventFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        addEditEventFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        addEditEventFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof z) {
            v.c1(this.d);
        } else if (bVar instanceof b0) {
            AddEditEventFragment addEditEventFragment = this.d;
            k<Object>[] kVarArr = AddEditEventFragment.Z1;
            AddEditEventViewModel O0 = addEditEventFragment.O0();
            final AddEditEventFragment addEditEventFragment2 = this.d;
            v.v2(O0, new l<w, i>() {
                public Object invoke(Object obj) {
                    w wVar = (w) obj;
                    m0.n.b.i.e(wVar, "state");
                    if (wVar.p) {
                        final AddEditEventFragment addEditEventFragment = addEditEventFragment2;
                        v.c2(addEditEventFragment, new l<j, i>() {
                            public Object invoke(Object obj) {
                                j jVar = (j) obj;
                                m0.n.b.i.e(jVar, "$this$showBanner");
                                jVar.e(AddEditEventFragment.this.getString(R.string.published_your_event_is_now));
                                return i.a;
                            }
                        });
                    }
                    return i.a;
                }
            });
            v.V1(this.d, "event_create_result", ((b0) bVar).a);
            v.c1(this.d);
        } else if (bVar instanceof d) {
            final AddEditEventFragment addEditEventFragment3 = this.d;
            v.c2(addEditEventFragment3, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = addEditEventFragment3.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    jVar.h(Banner.Style.Negative);
                    return i.a;
                }
            });
        } else if (bVar instanceof c0) {
            AddEditEventFragment addEditEventFragment4 = this.d;
            v.c2(addEditEventFragment4, new a(0, addEditEventFragment4));
            v.V1(this.d, "event_deletion_result", Boolean.TRUE);
            v.c1(this.d);
        } else if (bVar instanceof d0) {
            AddEditEventFragment addEditEventFragment5 = this.d;
            v.c2(addEditEventFragment5, new a(1, addEditEventFragment5));
            v.V1(this.d, "event_update_result", ((d0) bVar).a);
            v.c1(this.d);
        }
        return i.a;
    }
}
