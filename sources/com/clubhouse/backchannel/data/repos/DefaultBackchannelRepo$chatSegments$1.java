package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import i0.e.c.f.b.a.b;
import i0.e.c.f.b.a.j;
import i0.e.c.f.b.a.k;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.i;
import m0.j.g;
import m0.l.f.a.c;
import m0.n.a.q;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatSegments$1", f = "DefaultBackchannelRepo.kt", l = {}, m = "invokeSuspend")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$chatSegments$1 extends SuspendLambda implements q<List<? extends ChatMessage>, Chat, m0.l.c<? super List<b>>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ DefaultBackchannelRepo q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$chatSegments$1(DefaultBackchannelRepo defaultBackchannelRepo, m0.l.c<? super DefaultBackchannelRepo$chatSegments$1> cVar) {
        super(3, cVar);
        this.q = defaultBackchannelRepo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage>> r4, java.util.List<i0.e.c.f.b.a.b> r5, com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo r6, com.clubhouse.pubsub.user.backchannel.models.remote.Chat r7, com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage r8) {
        /*
            T r0 = r4.c
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x006d
            T r0 = r4.c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r0.next()
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage r2 = (com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage) r2
            if (r7 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            java.util.List<com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember> r3 = r7.Z1
        L_0x002b:
            if (r3 != 0) goto L_0x002f
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.c
        L_0x002f:
            i0.e.c.f.b.a.c r2 = r6.E(r2, r3)
            if (r2 == 0) goto L_0x0019
            r1.add(r2)
            goto L_0x0019
        L_0x0039:
            i0.e.c.f.b.a.i r6 = new i0.e.c.f.b.a.i
            r6.<init>(r1)
            r5.add(r6)
            T r4 = r4.c
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = m0.j.g.G(r4)
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage r4 = (com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage) r4
            java.lang.Integer r4 = r4.d2
            if (r8 != 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            java.lang.Integer r3 = r8.d2
        L_0x0052:
            if (r4 == 0) goto L_0x006d
            if (r3 == 0) goto L_0x006d
            int r6 = r3.intValue()
            int r7 = r4.intValue()
            if (r6 >= r7) goto L_0x006d
            i0.e.c.f.b.a.k r6 = new i0.e.c.f.b.a.k
            i0.e.c.f.b.a.j r7 = new i0.e.c.f.b.a.j
            r7.<init>(r3, r4)
            r6.<init>(r7)
            r5.add(r6)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chatSegments$1.f(kotlin.jvm.internal.Ref$ObjectRef, java.util.List, com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo, com.clubhouse.pubsub.user.backchannel.models.remote.Chat, com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage):void");
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        DefaultBackchannelRepo$chatSegments$1 defaultBackchannelRepo$chatSegments$1 = new DefaultBackchannelRepo$chatSegments$1(this.q, (m0.l.c) obj3);
        defaultBackchannelRepo$chatSegments$1.c = (List) obj;
        defaultBackchannelRepo$chatSegments$1.d = (Chat) obj2;
        return defaultBackchannelRepo$chatSegments$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Integer num;
        Integer num2;
        int i;
        ChatMessage chatMessage;
        Integer num3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        List list = (List) this.c;
        Chat chat = (Chat) this.d;
        ArrayList arrayList = new ArrayList();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.c = new ArrayList();
        DefaultBackchannelRepo defaultBackchannelRepo = this.q;
        Iterator it = list.iterator();
        while (true) {
            Integer num4 = null;
            if (!it.hasNext()) {
                break;
            }
            ChatMessage chatMessage2 = (ChatMessage) it.next();
            ChatMessage chatMessage3 = (ChatMessage) g.I((List) ref$ObjectRef.c);
            if (chatMessage3 != null) {
                num4 = chatMessage3.d2;
            }
            if (!(num4 == null || chatMessage2.d2 == null)) {
                int intValue = num4.intValue() - 1;
                Integer num5 = chatMessage2.d2;
                if ((num5 != null && intValue == num5.intValue()) || m0.n.b.i.a(num4, chatMessage2.d2)) {
                    ((List) ref$ObjectRef.c).add(chatMessage2);
                }
            }
            f(ref$ObjectRef, arrayList, defaultBackchannelRepo, chat, chatMessage2);
            ref$ObjectRef.c = g.U(chatMessage2);
        }
        f(ref$ObjectRef, arrayList, this.q, chat, (ChatMessage) null);
        ChatMessage chatMessage4 = (ChatMessage) g.I(list);
        if (chatMessage4 == null) {
            num = null;
        } else {
            num = chatMessage4.d2;
        }
        if (num == null || num.intValue() != 1) {
            arrayList.add(new k(new j(num, (Integer) null, 2)));
        }
        ChatMessage chatMessage5 = (ChatMessage) g.w(list);
        if (chatMessage5 == null) {
            num2 = null;
        } else {
            num2 = chatMessage5.d2;
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (chat == null || (chatMessage = chat.Y1) == null || (num3 = chatMessage.c) == null) {
                i = 0;
            } else {
                i = num3.intValue();
            }
            if (intValue2 < i) {
                arrayList.add(0, new k(new j((Integer) null, num2, 1)));
            }
        }
        return arrayList;
    }
}
