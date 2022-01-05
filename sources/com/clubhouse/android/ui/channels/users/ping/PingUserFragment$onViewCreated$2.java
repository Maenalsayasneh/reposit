package com.clubhouse.android.ui.channels.users.ping;

import com.clubhouse.android.core.ui.Banner;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.channels.users.ping.PingUserFragment$onViewCreated$2", f = "PingUserFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: PingUserFragment.kt */
public final class PingUserFragment$onViewCreated$2 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ PingUserFragment d;

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
                jVar.e(((e) ((b) this.d)).a);
                return i.a;
            } else if (i == 1) {
                j jVar2 = (j) obj;
                m0.n.b.i.e(jVar2, "$this$showBanner");
                jVar2.e(((d) ((b) this.d)).a);
                jVar2.h(Banner.Style.Negative);
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PingUserFragment$onViewCreated$2(PingUserFragment pingUserFragment, m0.l.c<? super PingUserFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.d = pingUserFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        PingUserFragment$onViewCreated$2 pingUserFragment$onViewCreated$2 = new PingUserFragment$onViewCreated$2(this.d, cVar);
        pingUserFragment$onViewCreated$2.c = obj;
        return pingUserFragment$onViewCreated$2;
    }

    public Object invoke(Object obj, Object obj2) {
        PingUserFragment$onViewCreated$2 pingUserFragment$onViewCreated$2 = new PingUserFragment$onViewCreated$2(this.d, (m0.l.c) obj2);
        pingUserFragment$onViewCreated$2.c = (b) obj;
        i iVar = i.a;
        pingUserFragment$onViewCreated$2.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        b bVar = (b) this.c;
        if (bVar instanceof e) {
            v.b2(this.d, new a(0, bVar));
        } else if (bVar instanceof d) {
            v.b2(this.d, new a(1, bVar));
        }
        return i.a;
    }
}
