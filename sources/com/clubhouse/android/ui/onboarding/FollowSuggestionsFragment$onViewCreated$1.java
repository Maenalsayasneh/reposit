package com.clubhouse.android.ui.onboarding;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import i0.e.b.g3.r.g1;
import i0.e.b.g3.r.u;
import i0.e.b.g3.r.v;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.FollowSuggestionsFragment$onViewCreated$1", f = "FollowSuggestionsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: FollowSuggestionsFragment.kt */
public final class FollowSuggestionsFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ FollowSuggestionsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsFragment$onViewCreated$1(FollowSuggestionsFragment followSuggestionsFragment, m0.l.c<? super FollowSuggestionsFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = followSuggestionsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FollowSuggestionsFragment$onViewCreated$1 followSuggestionsFragment$onViewCreated$1 = new FollowSuggestionsFragment$onViewCreated$1(this.d, cVar);
        followSuggestionsFragment$onViewCreated$1.c = obj;
        return followSuggestionsFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        FollowSuggestionsFragment$onViewCreated$1 followSuggestionsFragment$onViewCreated$1 = new FollowSuggestionsFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        followSuggestionsFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        followSuggestionsFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        if (((b) this.c) instanceof g1) {
            final FollowSuggestionsFragment followSuggestionsFragment = this.d;
            AnonymousClass1 r02 = new l<d.a, i>() {
                public Object invoke(Object obj) {
                    d.a aVar = (d.a) obj;
                    a.j(aVar, "$this$alertDialog", R.string.are_you_sure, R.string.clubhouse_will_be_quiet);
                    aVar.d(R.string.yes, new u(followSuggestionsFragment));
                    aVar.c(R.string.never_mind, v.c);
                    return i.a;
                }
            };
            m0.n.b.i.e(followSuggestionsFragment, "<this>");
            m0.n.b.i.e(r02, "f");
            d.a aVar = new d.a(followSuggestionsFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
            r02.invoke(aVar);
            aVar.g();
        }
        return i.a;
    }
}
