package com.clubhouse.wave.data.repos;

import com.clubhouse.android.core.storage.Store;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.shared.Result;
import com.clubhouse.wave.data.models.local.SentWave;
import com.clubhouse.wave.data.models.remote.request.SendWaveRequest;
import com.clubhouse.wave.data.network.WaveDataSource$sendWave$2;
import i0.e.e.k.a.b;
import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.wave.data.repos.DefaultWaveRepo$sendWave$2", f = "DefaultWaveRepo.kt", l = {240}, m = "invokeSuspend")
/* compiled from: DefaultWaveRepo.kt */
public final class DefaultWaveRepo$sendWave$2 extends SuspendLambda implements l<m0.l.c<? super List<? extends Store.a<Integer, SentWave>>>, Object> {
    public int c;
    public final /* synthetic */ DefaultWaveRepo d;
    public final /* synthetic */ int q;
    public final /* synthetic */ SourceLocation x;
    public final /* synthetic */ SentWave y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultWaveRepo$sendWave$2(DefaultWaveRepo defaultWaveRepo, int i, SourceLocation sourceLocation, SentWave sentWave, m0.l.c<? super DefaultWaveRepo$sendWave$2> cVar) {
        super(1, cVar);
        this.d = defaultWaveRepo;
        this.q = i;
        this.x = sourceLocation;
        this.y = sentWave;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new DefaultWaveRepo$sendWave$2(this.d, this.q, this.x, this.y, cVar);
    }

    public Object invoke(Object obj) {
        return new DefaultWaveRepo$sendWave$2(this.d, this.q, this.x, this.y, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            b bVar = this.d.a;
            SendWaveRequest sendWaveRequest = new SendWaveRequest(this.q, this.x);
            this.c = 1;
            Objects.requireNonNull(bVar);
            obj = bVar.a(new WaveDataSource$sendWave$2(bVar, sendWaveRequest, (m0.l.c<? super WaveDataSource$sendWave$2>) null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        EmptySuccessResponse emptySuccessResponse = (EmptySuccessResponse) ((Result) obj).a();
        return h.L2(new Store.a.c(this.y));
    }
}
