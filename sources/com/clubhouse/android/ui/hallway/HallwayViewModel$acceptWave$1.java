package com.clubhouse.android.ui.hallway;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.p.r;
import i0.e.b.z2.f.e;
import i0.e.e.k.b.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: HallwayViewModel.kt */
public final class HallwayViewModel$acceptWave$1 extends Lambda implements l<r, i> {
    public final /* synthetic */ HallwayViewModel c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String q;
    public final /* synthetic */ SourceLocation x;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.hallway.HallwayViewModel$acceptWave$1$1", f = "HallwayViewModel.kt", l = {157}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.hallway.HallwayViewModel$acceptWave$1$1  reason: invalid class name */
    /* compiled from: HallwayViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super ChannelInRoomWithAccess>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(i, str, sourceLocation, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(i, str, sourceLocation, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                int i2 = i;
                String str = str;
                SourceLocation sourceLocation = sourceLocation;
                this.c = 1;
                obj = ((a) HallwayViewModel.this.t.getValue()).p(i2, str, sourceLocation, this);
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
    public HallwayViewModel$acceptWave$1(HallwayViewModel hallwayViewModel, int i, String str, SourceLocation sourceLocation) {
        super(1);
        this.c = hallwayViewModel;
        this.d = i;
        this.q = str;
        this.x = sourceLocation;
    }

    public Object invoke(Object obj) {
        r rVar = (r) obj;
        m0.n.b.i.e(rVar, "state");
        if (!rVar.b) {
            HallwayViewModel hallwayViewModel = this.c;
            final int i = this.d;
            final String str = this.q;
            final SourceLocation sourceLocation = this.x;
            final HallwayViewModel hallwayViewModel2 = hallwayViewModel;
            AnonymousClass1 r02 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            final HallwayViewModel hallwayViewModel3 = this.c;
            final SourceLocation sourceLocation2 = this.x;
            MavericksViewModel.f(hallwayViewModel, r02, (d0) null, (m) null, new p<r, b<? extends ChannelInRoomWithAccess>, r>() {
                public Object invoke(Object obj, Object obj2) {
                    r rVar = (r) obj;
                    b bVar = (b) obj2;
                    m0.n.b.i.e(rVar, "$this$execute");
                    m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                    if (bVar instanceof f0) {
                        HallwayViewModel hallwayViewModel = HallwayViewModel.this;
                        e eVar = new e((Channel) ((f0) bVar).b, sourceLocation2);
                        int i = HallwayViewModel.m;
                        hallwayViewModel.o(eVar);
                    } else if (bVar instanceof i0.b.b.c) {
                        HallwayViewModel hallwayViewModel2 = HallwayViewModel.this;
                        d dVar = new d(((i0.b.b.c) bVar).b.getMessage());
                        int i2 = HallwayViewModel.m;
                        hallwayViewModel2.o(dVar);
                    }
                    return r.copy$default(rVar, (i0.e.b.g3.p.i) null, bVar instanceof f, false, (b) null, (b) null, 0, false, 125, (Object) null);
                }
            }, 3, (Object) null);
        }
        return i.a;
    }
}
