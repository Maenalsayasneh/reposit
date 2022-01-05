package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.FollowSuggestionsFragment$onCreate$2", f = "FollowSuggestionsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: FollowSuggestionsFragment.kt */
public final class FollowSuggestionsFragment$onCreate$2 extends SuspendLambda implements p<Throwable, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ FollowSuggestionsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsFragment$onCreate$2(FollowSuggestionsFragment followSuggestionsFragment, m0.l.c<? super FollowSuggestionsFragment$onCreate$2> cVar) {
        super(2, cVar);
        this.d = followSuggestionsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FollowSuggestionsFragment$onCreate$2 followSuggestionsFragment$onCreate$2 = new FollowSuggestionsFragment$onCreate$2(this.d, cVar);
        followSuggestionsFragment$onCreate$2.c = obj;
        return followSuggestionsFragment$onCreate$2;
    }

    public Object invoke(Object obj, Object obj2) {
        final FollowSuggestionsFragment followSuggestionsFragment = this.d;
        FollowSuggestionsFragment$onCreate$2 followSuggestionsFragment$onCreate$2 = new FollowSuggestionsFragment$onCreate$2(followSuggestionsFragment, (m0.l.c) obj2);
        followSuggestionsFragment$onCreate$2.c = (Throwable) obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        final Throwable th = (Throwable) followSuggestionsFragment$onCreate$2.c;
        v.c2(followSuggestionsFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showBanner");
                String message = r3.getMessage();
                if (message == null) {
                    message = r0.getString(R.string.common_error_try_again);
                    m0.n.b.i.d(message, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(message);
                jVar.h(Banner.Style.Negative);
                return i.a;
            }
        });
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final Throwable th = (Throwable) this.c;
        final FollowSuggestionsFragment followSuggestionsFragment = this.d;
        v.c2(followSuggestionsFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showBanner");
                String message = th.getMessage();
                if (message == null) {
                    message = followSuggestionsFragment.getString(R.string.common_error_try_again);
                    m0.n.b.i.d(message, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(message);
                jVar.h(Banner.Style.Negative);
                return i.a;
            }
        });
        return i.a;
    }
}
