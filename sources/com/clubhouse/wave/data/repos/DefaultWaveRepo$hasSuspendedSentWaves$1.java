package com.clubhouse.wave.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.wave.data.repos.DefaultWaveRepo", f = "DefaultWaveRepo.kt", l = {195}, m = "hasSuspendedSentWaves")
/* compiled from: DefaultWaveRepo.kt */
public final class DefaultWaveRepo$hasSuspendedSentWaves$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ DefaultWaveRepo d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultWaveRepo$hasSuspendedSentWaves$1(DefaultWaveRepo defaultWaveRepo, m0.l.c<? super DefaultWaveRepo$hasSuspendedSentWaves$1> cVar) {
        super(cVar);
        this.d = defaultWaveRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return this.d.d(this);
    }
}
