package com.clubhouse.wave.data.repos;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.wave.data.repos.DefaultWaveRepo", f = "DefaultWaveRepo.kt", l = {203}, m = "acceptWave")
/* compiled from: DefaultWaveRepo.kt */
public final class DefaultWaveRepo$acceptWave$1 extends ContinuationImpl {
    public Object c;
    public int d;
    public /* synthetic */ Object q;
    public final /* synthetic */ DefaultWaveRepo x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultWaveRepo$acceptWave$1(DefaultWaveRepo defaultWaveRepo, m0.l.c<? super DefaultWaveRepo$acceptWave$1> cVar) {
        super(cVar);
        this.x = defaultWaveRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.p(0, (String) null, (SourceLocation) null, this);
    }
}
