package com.clubhouse.wave;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.z2.f.e;
import i0.e.e.j;
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

/* compiled from: WaveCoordinatorViewModel.kt */
public final class WaveCoordinatorViewModel$acceptWave$1 extends Lambda implements l<j, i> {
    public final /* synthetic */ WaveCoordinatorViewModel c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String q;

    @m0.l.f.a.c(c = "com.clubhouse.wave.WaveCoordinatorViewModel$acceptWave$1$1", f = "WaveCoordinatorViewModel.kt", l = {118}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.wave.WaveCoordinatorViewModel$acceptWave$1$1  reason: invalid class name */
    /* compiled from: WaveCoordinatorViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super ChannelInRoomWithAccess>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(i, str, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(i, str, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                WaveCoordinatorViewModel waveCoordinatorViewModel = WaveCoordinatorViewModel.this;
                int i2 = WaveCoordinatorViewModel.m;
                a q2 = waveCoordinatorViewModel.q();
                int i3 = i;
                String str = str;
                SourceLocation sourceLocation = SourceLocation.IN_APP_TOAST;
                this.c = 1;
                obj = q2.p(i3, str, sourceLocation, this);
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
    public WaveCoordinatorViewModel$acceptWave$1(WaveCoordinatorViewModel waveCoordinatorViewModel, int i, String str) {
        super(1);
        this.c = waveCoordinatorViewModel;
        this.d = i;
        this.q = str;
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        m0.n.b.i.e(jVar, "state");
        if (!jVar.c) {
            final WaveCoordinatorViewModel waveCoordinatorViewModel = this.c;
            final int i = this.d;
            final String str = this.q;
            AnonymousClass1 r1 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            final WaveCoordinatorViewModel waveCoordinatorViewModel2 = this.c;
            MavericksViewModel.f(waveCoordinatorViewModel, r1, (d0) null, (m) null, new p<j, b<? extends ChannelInRoomWithAccess>, j>() {
                public Object invoke(Object obj, Object obj2) {
                    j jVar = (j) obj;
                    b bVar = (b) obj2;
                    m0.n.b.i.e(jVar, "$this$execute");
                    m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                    if (bVar instanceof f0) {
                        WaveCoordinatorViewModel waveCoordinatorViewModel = WaveCoordinatorViewModel.this;
                        e eVar = new e((Channel) ((f0) bVar).b, SourceLocation.IN_APP_TOAST);
                        int i = WaveCoordinatorViewModel.m;
                        waveCoordinatorViewModel.o(eVar);
                    } else if (bVar instanceof i0.b.b.c) {
                        WaveCoordinatorViewModel waveCoordinatorViewModel2 = WaveCoordinatorViewModel.this;
                        d dVar = new d(((i0.b.b.c) bVar).b.getMessage());
                        int i2 = WaveCoordinatorViewModel.m;
                        waveCoordinatorViewModel2.o(dVar);
                    }
                    return j.copy$default(jVar, false, false, bVar instanceof f, 3, (Object) null);
                }
            }, 3, (Object) null);
        }
        return i.a;
    }
}
