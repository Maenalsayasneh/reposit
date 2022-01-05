package com.clubhouse.backchannel.members;

import com.airbnb.mvrx.MavericksViewModel;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.c.f.d.a;
import i0.e.c.i.o;
import i0.e.c.i.p;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.d0;

/* compiled from: BackchannelMembersViewModel.kt */
public final class BackchannelMembersViewModel$addMember$1 extends Lambda implements l<p, i> {
    public final /* synthetic */ BackchannelMembersViewModel c;
    public final /* synthetic */ int d;

    @m0.l.f.a.c(c = "com.clubhouse.backchannel.members.BackchannelMembersViewModel$addMember$1$1", f = "BackchannelMembersViewModel.kt", l = {80}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.backchannel.members.BackchannelMembersViewModel$addMember$1$1  reason: invalid class name */
    /* compiled from: BackchannelMembersViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super i>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(i, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(i, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                BackchannelMembersViewModel backchannelMembersViewModel = BackchannelMembersViewModel.this;
                a aVar = backchannelMembersViewModel.p;
                String str = backchannelMembersViewModel.n.a;
                int i2 = i;
                this.c = 1;
                if (aVar.f(str, i2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelMembersViewModel$addMember$1(BackchannelMembersViewModel backchannelMembersViewModel, int i) {
        super(1);
        this.c = backchannelMembersViewModel;
        this.d = i;
    }

    public Object invoke(Object obj) {
        p pVar = (p) obj;
        m0.n.b.i.e(pVar, "state");
        if (!pVar.c) {
            final BackchannelMembersViewModel backchannelMembersViewModel = this.c;
            final int i = this.d;
            AnonymousClass1 r1 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            final BackchannelMembersViewModel backchannelMembersViewModel2 = this.c;
            MavericksViewModel.f(backchannelMembersViewModel, r1, (d0) null, (m) null, new m0.n.a.p<p, b<? extends i>, p>() {
                public Object invoke(Object obj, Object obj2) {
                    p pVar = (p) obj;
                    b bVar = (b) obj2;
                    m0.n.b.i.e(pVar, "$this$execute");
                    m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                    if (bVar instanceof f0) {
                        BackchannelMembersViewModel backchannelMembersViewModel = BackchannelMembersViewModel.this;
                        o oVar = o.a;
                        int i = BackchannelMembersViewModel.m;
                        backchannelMembersViewModel.o(oVar);
                    }
                    if (bVar instanceof i0.b.b.c) {
                        BackchannelMembersViewModel backchannelMembersViewModel2 = BackchannelMembersViewModel.this;
                        d dVar = new d(((i0.b.b.c) bVar).b.getMessage());
                        int i2 = BackchannelMembersViewModel.m;
                        backchannelMembersViewModel2.o(dVar);
                    }
                    return p.copy$default(pVar, (String) null, (b) null, bVar instanceof f, 3, (Object) null);
                }
            }, 3, (Object) null);
        }
        return i.a;
    }
}
