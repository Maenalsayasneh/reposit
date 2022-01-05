package com.clubhouse.wave.data.repos;

import com.clubhouse.wave.data.models.local.SentWave;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;

@c(c = "com.clubhouse.wave.data.repos.DefaultWaveRepo$sentWaves$1", f = "DefaultWaveRepo.kt", l = {}, m = "invokeSuspend")
/* compiled from: DefaultWaveRepo.kt */
public final class DefaultWaveRepo$sentWaves$1 extends SuspendLambda implements q<Map<Integer, ? extends SentWave>, Set<? extends Integer>, m0.l.c<? super List<? extends SentWave>>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    public DefaultWaveRepo$sentWaves$1(m0.l.c<? super DefaultWaveRepo$sentWaves$1> cVar) {
        super(3, cVar);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        DefaultWaveRepo$sentWaves$1 defaultWaveRepo$sentWaves$1 = new DefaultWaveRepo$sentWaves$1((m0.l.c) obj3);
        defaultWaveRepo$sentWaves$1.c = (Map) obj;
        defaultWaveRepo$sentWaves$1.d = (Set) obj2;
        return defaultWaveRepo$sentWaves$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        Set set = (Set) this.d;
        Collection values = ((Map) this.c).values();
        ArrayList arrayList = new ArrayList();
        for (Object next : values) {
            SentWave sentWave = (SentWave) next;
            if (Boolean.valueOf(!set.contains(sentWave.c.getId()) && !sentWave.q).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
