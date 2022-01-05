package com.clubhouse.wave.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.wave.data.repos.DefaultWaveRepo", f = "DefaultWaveRepo.kt", l = {192}, m = "receivedWave")
/* compiled from: DefaultWaveRepo.kt */
public final class DefaultWaveRepo$receivedWave$1 extends ContinuationImpl {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ DefaultWaveRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultWaveRepo$receivedWave$1(DefaultWaveRepo defaultWaveRepo, m0.l.c<? super DefaultWaveRepo$receivedWave$1> cVar) {
        super(cVar);
        this.q = defaultWaveRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.k(0, this);
    }
}
