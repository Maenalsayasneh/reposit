package com.clubhouse.android.ui.hallway.buddyList;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.wave.data.models.local.ReceivedWave;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.p.b0.q;
import i0.e.b.z2.f.e;
import i0.e.e.k.b.a;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: BuddyListViewModel.kt */
public final class BuddyListViewModel$acceptWave$1 extends Lambda implements l<q, i> {
    public final /* synthetic */ BuddyListViewModel c;
    public final /* synthetic */ ReceivedWave d;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.hallway.buddyList.BuddyListViewModel$acceptWave$1$1", f = "BuddyListViewModel.kt", l = {206}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.hallway.buddyList.BuddyListViewModel$acceptWave$1$1  reason: invalid class name */
    /* compiled from: BuddyListViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super ChannelInRoomWithAccess>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(receivedWave, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(receivedWave, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                BuddyListViewModel buddyListViewModel = BuddyListViewModel.this;
                int i2 = BuddyListViewModel.m;
                a r = buddyListViewModel.r();
                int intValue = receivedWave.c.getId().intValue();
                String str = receivedWave.d;
                SourceLocation sourceLocation = SourceLocation.BUDDY_LIST;
                this.c = 1;
                obj = r.p(intValue, str, sourceLocation, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListViewModel$acceptWave$1(BuddyListViewModel buddyListViewModel, ReceivedWave receivedWave) {
        super(1);
        this.c = buddyListViewModel;
        this.d = receivedWave;
    }

    public Object invoke(Object obj) {
        q qVar = (q) obj;
        m0.n.b.i.e(qVar, "state");
        if (!qVar.e) {
            final BuddyListViewModel buddyListViewModel = this.c;
            final ReceivedWave receivedWave = this.d;
            AnonymousClass1 r1 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            final BuddyListViewModel buddyListViewModel2 = this.c;
            MavericksViewModel.f(buddyListViewModel, r1, (d0) null, (m) null, new p<q, b<? extends ChannelInRoomWithAccess>, q>() {
                public Object invoke(Object obj, Object obj2) {
                    q qVar = (q) obj;
                    b bVar = (b) obj2;
                    m0.n.b.i.e(qVar, "$this$execute");
                    m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                    if (bVar instanceof f0) {
                        BuddyListViewModel buddyListViewModel = BuddyListViewModel.this;
                        e eVar = new e((Channel) ((f0) bVar).b, SourceLocation.BUDDY_LIST);
                        int i = BuddyListViewModel.m;
                        buddyListViewModel.o(eVar);
                    } else if (bVar instanceof i0.b.b.c) {
                        BuddyListViewModel buddyListViewModel2 = BuddyListViewModel.this;
                        d dVar = new d(((i0.b.b.c) bVar).b.getMessage());
                        int i2 = BuddyListViewModel.m;
                        buddyListViewModel2.o(dVar);
                    }
                    return q.copy$default(qVar, (List) null, (List) null, (List) null, (List) null, bVar instanceof f, false, false, false, false, false, 1007, (Object) null);
                }
            }, 3, (Object) null);
        }
        return i.a;
    }
}
