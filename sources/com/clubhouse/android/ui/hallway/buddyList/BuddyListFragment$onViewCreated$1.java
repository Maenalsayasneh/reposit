package com.clubhouse.android.ui.hallway.buddyList;

import android.widget.FrameLayout;
import com.clubhouse.android.ui.channels.ChannelNavigation;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.z2.f.e;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment$onViewCreated$1", f = "BuddyListFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: BuddyListFragment.kt */
public final class BuddyListFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ BuddyListFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListFragment$onViewCreated$1(BuddyListFragment buddyListFragment, m0.l.c<? super BuddyListFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = buddyListFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        BuddyListFragment$onViewCreated$1 buddyListFragment$onViewCreated$1 = new BuddyListFragment$onViewCreated$1(this.d, cVar);
        buddyListFragment$onViewCreated$1.c = obj;
        return buddyListFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        BuddyListFragment$onViewCreated$1 buddyListFragment$onViewCreated$1 = new BuddyListFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        buddyListFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        buddyListFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof e) {
            BuddyListFragment buddyListFragment = this.d;
            k<Object>[] kVarArr = BuddyListFragment.Z1;
            FrameLayout frameLayout = buddyListFragment.N0().g;
            m0.n.b.i.d(frameLayout, "binding.roomLoading");
            i0.e.b.d3.k.p(frameLayout);
            ChannelNavigation.a(this.d, (e) bVar);
        } else if (bVar instanceof d) {
            final BuddyListFragment buddyListFragment2 = this.d;
            v.f2(buddyListFragment2, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = buddyListFragment2.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
