package com.clubhouse.android.ui.channels.users.search;

import i0.e.b.a3.d.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.channels.users.search.SearchInRoomFragment$onViewCreated$1", f = "SearchInRoomFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: SearchInRoomFragment.kt */
public final class SearchInRoomFragment$onViewCreated$1 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ SearchInRoomFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchInRoomFragment$onViewCreated$1(SearchInRoomFragment searchInRoomFragment, m0.l.c<? super SearchInRoomFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = searchInRoomFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        SearchInRoomFragment$onViewCreated$1 searchInRoomFragment$onViewCreated$1 = new SearchInRoomFragment$onViewCreated$1(this.d, cVar);
        searchInRoomFragment$onViewCreated$1.c = obj;
        return searchInRoomFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        SearchInRoomFragment$onViewCreated$1 searchInRoomFragment$onViewCreated$1 = new SearchInRoomFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        searchInRoomFragment$onViewCreated$1.c = (String) obj;
        i iVar = i.a;
        searchInRoomFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ((SearchInRoomViewModel) this.d.s2.getValue()).p(new b((String) this.c));
        return i.a;
    }
}
