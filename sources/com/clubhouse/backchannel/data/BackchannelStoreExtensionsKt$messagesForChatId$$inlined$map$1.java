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
public final class BackchannelStoreExtensionsKt$messagesForChatId$$inlined$map$1 implements d<List<? extends ChatMessage>> {
    public final /* synthetic */ d c;
    public final /* synthetic */ String d;

    public BackchannelStoreExtensionsKt$messagesForChatId$$inlined$map$1(d dVar, String str) {
        this.c = dVar;
        this.d = str;
    }

    public Object collect(final e eVar, c cVar) {
        d dVar = this.c;
        final String str = this.d;
        Object collect = dVar.collect(new e<Map<String, ? extends ChatMessage>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r8, m0.l.c r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.clubhouse.backchannel.data.BackchannelStoreExtensionsKt$messagesForChatId$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    com.clubhouse.backchannel.data.BackchannelStoreExtensionsKt$messagesForChatId$$inlined$map$1$2$1 r0 = (com.clubhouse.backchannel.data.BackchannelStoreExtensionsKt$messagesForChatId$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.d = r1
                    goto L_0x0018
                L_0x0013:
                    com.clubhouse.backchannel.data.BackchannelStoreExtensionsKt$messagesForChatId$$inlined$map$1$2$1 r0 = new com.clubhouse.backchannel.data.BackchannelStoreExtensionsKt$messagesForChatId$$inlined$map$1$2$1
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.c
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.d
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    i0.j.f.p.h.d4(r9)
                    goto L_0x0075
                L_0x0027:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x002f:
                    i0.j.f.p.h.d4(r9)
                    n0.a.g2.e r9 = r4
                    java.util.Map r8 = (java.util.Map) r8
                    java.util.Collection r8 = r8.values()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r8 = r8.iterator()
                L_0x0043:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L_0x0066
                    java.lang.Object r4 = r8.next()
                    r5 = r4
                    com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage r5 = (com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage) r5
                    java.lang.String r5 = r5.q
                    java.lang.String r6 = r2
                    boolean r5 = m0.n.b.i.a(r5, r6)
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L_0x0043
                    r2.add(r4)
                    goto L_0x0043
                L_0x0066:
                    i0.e.c.f.a r8 = i0.e.c.f.a.c
                    java.util.List r8 = m0.j.g.n0(r2, r8)
                    r0.d = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L_0x0075
                    return r1
                L_0x0075:
                    m0.i r8 = m0.i.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.backchannel.data.BackchannelStoreExtensionsKt$messagesForChatId$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, m0.l.c):java.lang.Object");
            }
        }, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
