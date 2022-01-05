package com.clubhouse.android.ui.channels.users.search;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.app.R;
import h0.q.p;
import h0.q.q;
import h0.u.w;
import i0.e.b.g3.k.w0.d.d;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.k;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.f1;

/* compiled from: SearchInRoomFragment.kt */
public final class SearchInRoomFragment$invalidate$1 extends Lambda implements l<d, f1> {
    public final /* synthetic */ SearchInRoomFragment c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.channels.users.search.SearchInRoomFragment$invalidate$1$1", f = "SearchInRoomFragment.kt", l = {59}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.channels.users.search.SearchInRoomFragment$invalidate$1$1  reason: invalid class name */
    /* compiled from: SearchInRoomFragment.kt */
    public final class AnonymousClass1 extends SuspendLambda implements m0.n.a.p<f0, c<? super m0.i>, Object> {
        public int c;

        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(dVar, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            return new AnonymousClass1(dVar, (c) obj2).invokeSuspend(m0.i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                PagingDataEpoxyController<UserInChannel> pagingDataEpoxyController = SearchInRoomFragment.this.t2;
                w<UserInChannel> wVar = dVar.a;
                this.c = 1;
                if (pagingDataEpoxyController.submitData(wVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m0.i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchInRoomFragment$invalidate$1(SearchInRoomFragment searchInRoomFragment) {
        super(1);
        this.c = searchInRoomFragment;
    }

    public Object invoke(Object obj) {
        final d dVar = (d) obj;
        i.e(dVar, "state");
        SearchInRoomFragment searchInRoomFragment = this.c;
        k<Object>[] kVarArr = SearchInRoomFragment.r2;
        searchInRoomFragment.S0().i.setText(this.c.getString(R.string.search_room_title));
        this.c.S0().d.setText(this.c.getString(R.string.search_room_empty));
        p viewLifecycleOwner = this.c.getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        LifecycleCoroutineScope a = q.a(viewLifecycleOwner);
        final SearchInRoomFragment searchInRoomFragment2 = this.c;
        return a.E2(a, (e) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
    }
}
