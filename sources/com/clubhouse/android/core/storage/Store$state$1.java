package com.clubhouse.android.core.storage;

import com.clubhouse.android.core.storage.Store;
import i0.e.b.a3.e.a;
import i0.j.f.p.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;

@c(c = "com.clubhouse.android.core.storage.Store$state$1", f = "Store.kt", l = {}, m = "invokeSuspend")
/* compiled from: Store.kt */
public final class Store$state$1 extends SuspendLambda implements q<Map<I, ? extends Store.b<T>>, Map<I, ? extends Store.c<I, T>>, m0.l.c<? super Map<I, T>>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Store<I, T> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Store$state$1(Store<I, T> store, m0.l.c<? super Store$state$1> cVar) {
        super(3, cVar);
        this.q = store;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        Store$state$1 store$state$1 = new Store$state$1(this.q, (m0.l.c) obj3);
        store$state$1.c = (Map) obj;
        store$state$1.d = (Map) obj2;
        return store$state$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        i iVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        Map map = (Map) this.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((Map) this.c).entrySet().iterator();
        while (true) {
            i iVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Store.b bVar = (Store.b) entry.getValue();
            Store.c cVar = (Store.c) map.get(key);
            if (cVar != null) {
                Integer num = cVar.b;
                int hashCode = bVar.a.hashCode();
                if (num != null && num.intValue() == hashCode) {
                    Store.a<I, T> aVar = cVar.c;
                    if (aVar instanceof Store.a.C0198a) {
                        linkedHashMap.remove(key);
                    } else if (aVar instanceof Store.a.c) {
                        linkedHashMap.put(key, ((Store.a.c) aVar).b);
                    } else if (aVar instanceof Store.a.b) {
                        a aVar2 = (a) ((Store.a.b) aVar).d.invoke(bVar.a);
                        if (aVar2 != null) {
                            linkedHashMap.put(key, aVar2);
                            iVar2 = i.a;
                        }
                        if (iVar2 == null) {
                            a aVar3 = (a) linkedHashMap.remove(key);
                        }
                    }
                }
                iVar2 = i.a;
            }
            if (iVar2 == null) {
                linkedHashMap.put(key, bVar.a);
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key2 = entry2.getKey();
            Store.c cVar2 = (Store.c) entry2.getValue();
            if (linkedHashMap.get(key2) == null && cVar2.b == null) {
                Store.a<I, T> aVar4 = cVar2.c;
                if (aVar4 instanceof Store.a.c) {
                    linkedHashMap.put(key2, ((Store.a.c) aVar4).b);
                }
                Store.a<I, T> aVar5 = cVar2.c;
                if (aVar5 instanceof Store.a.b) {
                    a aVar6 = (a) ((Store.a.b) aVar5).d.invoke(null);
                    if (aVar6 == null) {
                        iVar = null;
                    } else {
                        linkedHashMap.put(key2, aVar6);
                        iVar = i.a;
                    }
                    if (iVar == null) {
                        a aVar7 = (a) linkedHashMap.remove(key2);
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
