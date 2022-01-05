package com.clubhouse.backchannel.data;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.e;

/* compiled from: SafeCollector.common.kt */
public final class BackchannelStoreExtensionsKt$messagesByChatId$$inlined$map$1 implements d<Map<String, ? extends List<? extends ChatMessage>>> {
    public final /* synthetic */ d c;

    public BackchannelStoreExtensionsKt$messagesByChatId$$inlined$map$1(d dVar) {
        this.c = dVar;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.c.collect(new e<Map<String, ? extends ChatMessage>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r8, m0.l.c r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.clubhouse.backchannel.data.BackchannelStoreExtensionsKt$messagesByChatId$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    com.clubhouse.backchannel.data.BackchannelStoreExtensionsKt$messagesByChatId$$inlined$map$1$2$1 r0 = (com.clubhouse.backchannel.data.BackchannelStoreExtensionsKt$messagesByChatId$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.clubhouse.backchannel.data.BackchannelStoreExtensionsKt$messagesByChatId$$inlined$map$1$2$1 r0 = new com.clubhouse.backchannel.data.BackchannelStoreExtensionsKt$messagesByChatId$$inlined$map$1$2$1
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x0030
                    if (r2 != r3) goto L_0x0028
                    i0.j.f.p.h.d4(r9)
                    goto L_0x00a2
                L_0x0028:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0030:
                    i0.j.f.p.h.d4(r9)
                    n0.a.g2.e r9 = r3
                    java.util.Map r8 = (java.util.Map) r8
                    java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                    r2.<init>()
                    java.util.Collection r8 = r8.values()
                    java.util.Iterator r8 = r8.iterator()
                L_0x0044:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L_0x0064
                    java.lang.Object r4 = r8.next()
                    com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage r4 = (com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage) r4
                    java.lang.String r5 = r4.q
                    kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.c
                    java.lang.Object r5 = r2.getOrDefault(r5, r6)
                    java.util.List r5 = (java.util.List) r5
                    java.lang.String r6 = r4.q
                    java.util.List r4 = m0.j.g.a0(r5, r4)
                    r2.put(r6, r4)
                    goto L_0x0044
                L_0x0064:
                    java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
                    int r4 = r2.size()
                    int r4 = i0.j.f.p.h.R2(r4)
                    r8.<init>(r4)
                    java.util.Set r2 = r2.entrySet()
                    java.util.Iterator r2 = r2.iterator()
                L_0x0079:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x0099
                    java.lang.Object r4 = r2.next()
                    java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                    java.lang.Object r5 = r4.getKey()
                    java.lang.Object r4 = r4.getValue()
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    i0.e.c.f.a r6 = i0.e.c.f.a.c
                    java.util.List r4 = m0.j.g.n0(r4, r6)
                    r8.put(r5, r4)
                    goto L_0x0079
                L_0x0099:
                    r0.d = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L_0x00a2
                    return r1
                L_0x00a2:
                    m0.i r8 = m0.i.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.backchannel.data.BackchannelStoreExtensionsKt$messagesByChatId$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
