package com.clubhouse.backchannel.data.network;

import com.clubhouse.android.user.model.User;
import i0.b.b.g0;
import i0.e.c.f.c.b;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.b.i;
import n0.a.f0;
import n0.a.f1;
import n0.a.g2.a0;
import n0.a.g2.d;
import n0.a.g2.o;
import n0.a.g2.q;

/* compiled from: ChatRecipientsDataSource.kt */
public final class ChatRecipientsDataSource {
    public final b a;
    public final i0.e.a.a b;
    public final f0 c;
    public f1 d;
    public final q<i0.b.b.b<List<i0.e.b.a3.d.a<User>>>> e;
    public final q<Set<User>> f;
    public final d<Set<User>> g;
    public String h;
    public d<? extends i0.b.b.b<? extends List<i0.e.b.a3.d.a<User>>>> i;

    /* compiled from: ChatRecipientsDataSource.kt */
    public interface a {
    }

    public ChatRecipientsDataSource(b bVar, i0.e.a.a aVar, f0 f0Var) {
        i.e(bVar, "dataSource");
        i.e(aVar, "analytics");
        i.e(f0Var, "coroutineScope");
        this.a = bVar;
        this.b = aVar;
        this.c = f0Var;
        q<i0.b.b.b<List<i0.e.b.a3.d.a<User>>>> a2 = a0.a(g0.b);
        this.e = a2;
        q<Set<User>> a3 = a0.a(EmptySet.c);
        this.f = a3;
        this.g = a3;
        this.i = new o(a2, a3, new ChatRecipientsDataSource$result$1((c<? super ChatRecipientsDataSource$result$1>) null));
    }

    public void a(String str) {
        if (!i.a(this.h, str)) {
            f1 f1Var = this.d;
            if (f1Var != null) {
                m0.r.t.a.r.m.a1.a.o0(f1Var, (CancellationException) null, 1, (Object) null);
            }
            this.d = m0.r.t.a.r.m.a1.a.E2(this.c, (e) null, (CoroutineStart) null, new ChatRecipientsDataSource$fetchResults$1(this, str, (c<? super ChatRecipientsDataSource$fetchResults$1>) null), 3, (Object) null);
        }
        this.h = str;
    }
}
