package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import i0.e.b.g3.u.z5.e1;
import i0.e.b.g3.u.z5.g;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.settings.DeactivateFragment$onViewCreated$1", f = "DeactivateFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: DeactivateFragment.kt */
public final class DeactivateFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ DeactivateFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateFragment$onViewCreated$1(DeactivateFragment deactivateFragment, m0.l.c<? super DeactivateFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = deactivateFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        DeactivateFragment$onViewCreated$1 deactivateFragment$onViewCreated$1 = new DeactivateFragment$onViewCreated$1(this.d, cVar);
        deactivateFragment$onViewCreated$1.c = obj;
        return deactivateFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        DeactivateFragment$onViewCreated$1 deactivateFragment$onViewCreated$1 = new DeactivateFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        deactivateFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        deactivateFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof e1) {
            DeactivateFragment deactivateFragment = this.d;
            AnonymousClass1 r1 = new l<d.a, i>() {
                public Object invoke(Object obj) {
                    d.a aVar = (d.a) obj;
                    a.j(aVar, "$this$alertDialog", R.string.deactivate_error_title, R.string.deactivate_error_body_fallback);
                    String str = ((e1) bVar).a;
                    if (str != null) {
                        aVar.a.f = str;
                    }
                    aVar.d(R.string.ok, g.c);
                    return i.a;
                }
            };
            m0.n.b.i.e(deactivateFragment, "<this>");
            m0.n.b.i.e(r1, "f");
            d.a aVar = new d.a(deactivateFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
            r1.invoke(aVar);
            aVar.g();
        }
        return i.a;
    }
}
