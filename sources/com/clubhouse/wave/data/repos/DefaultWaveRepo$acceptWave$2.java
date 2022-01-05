package com.clubhouse.wave.data.repos;

import com.clubhouse.android.core.storage.Store;
import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.shared.Result;
import com.clubhouse.wave.data.models.local.ReceivedWave;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.wave.data.repos.DefaultWaveRepo$acceptWave$2", f = "DefaultWaveRepo.kt", l = {}, m = "invokeSuspend")
/* compiled from: DefaultWaveRepo.kt */
public final class DefaultWaveRepo$acceptWave$2 extends SuspendLambda implements l<m0.l.c<? super List<? extends Store.a<Integer, ReceivedWave>>>, Object> {
    public final /* synthetic */ Result<ChannelInRoomWithAccess> c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultWaveRepo$acceptWave$2(Result<ChannelInRoomWithAccess> result, int i, m0.l.c<? super DefaultWaveRepo$acceptWave$2> cVar) {
        super(1, cVar);
        this.c = result;
        this.d = i;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new DefaultWaveRepo$acceptWave$2(this.c, this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new DefaultWaveRepo$acceptWave$2(this.c, this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ChannelInRoomWithAccess a = this.c.a();
        return h.L2(new Store.a.C0198a(new Integer(this.d)));
    }
}
