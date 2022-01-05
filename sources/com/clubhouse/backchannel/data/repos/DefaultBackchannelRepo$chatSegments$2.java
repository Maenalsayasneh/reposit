package com.clubhouse.backchannel.data.repos;

import i0.e.c.f.b.a.b;
import i0.e.c.f.b.a.e;
import i0.e.c.f.b.a.j;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatSegments$2", f = "DefaultBackchannelRepo.kt", l = {}, m = "invokeSuspend")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$chatSegments$2 extends SuspendLambda implements q<List<b>, Map<j, ? extends b>, m0.l.c<? super List<? extends b>>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    public DefaultBackchannelRepo$chatSegments$2(m0.l.c<? super DefaultBackchannelRepo$chatSegments$2> cVar) {
        super(3, cVar);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        DefaultBackchannelRepo$chatSegments$2 defaultBackchannelRepo$chatSegments$2 = new DefaultBackchannelRepo$chatSegments$2((m0.l.c) obj3);
        defaultBackchannelRepo$chatSegments$2.c = (List) obj;
        defaultBackchannelRepo$chatSegments$2.d = (Map) obj2;
        return defaultBackchannelRepo$chatSegments$2.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        List<b> list = (List) this.c;
        Map map = (Map) this.d;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (b bVar2 : list) {
            if ((bVar2 instanceof e) && (bVar = (b) map.get(((e) bVar2).a())) != null) {
                bVar2 = bVar;
            }
            arrayList.add(bVar2);
        }
        return arrayList;
    }
}
