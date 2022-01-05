package com.clubhouse.android.channels.rtc;

import io.agora.rtc.RtcEngine;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.channels.rtc.RtcWrapper$withEngine$2", f = "RtcWrapper.kt", l = {71}, m = "invokeSuspend")
/* compiled from: RtcWrapper.kt */
public final class RtcWrapper$withEngine$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public Object c;
    public Object d;
    public int q;
    public final /* synthetic */ RtcWrapper x;
    public final /* synthetic */ l<RtcEngine, i> y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcWrapper$withEngine$2(RtcWrapper rtcWrapper, l<? super RtcEngine, i> lVar, m0.l.c<? super RtcWrapper$withEngine$2> cVar) {
        super(2, cVar);
        this.x = rtcWrapper;
        this.y = lVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new RtcWrapper$withEngine$2(this.x, this.y, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new RtcWrapper$withEngine$2(this.x, this.y, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.q
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 != r3) goto L_0x0016
            java.lang.Object r0 = r8.d
            com.clubhouse.android.channels.rtc.RtcWrapper r0 = (com.clubhouse.android.channels.rtc.RtcWrapper) r0
            java.lang.Object r1 = r8.c
            io.agora.rtc.RtcEngine r1 = (io.agora.rtc.RtcEngine) r1
            i0.j.f.p.h.d4(r9)     // Catch:{ Exception -> 0x008c }
            goto L_0x0089
        L_0x0016:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001e:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.channels.rtc.RtcWrapper r9 = r8.x
            io.agora.rtc.RtcEngine r1 = r9.k
            if (r1 != 0) goto L_0x0096
            android.content.Context r1 = r9.d     // Catch:{ Exception -> 0x008c }
            i0.e.b.f3.e r4 = r9.e     // Catch:{ Exception -> 0x008c }
            java.util.Objects.requireNonNull(r4)     // Catch:{ Exception -> 0x008c }
            java.lang.String r4 = "938de3e8055e42b281bb8c6f69c21f78"
            com.clubhouse.android.channels.rtc.RtcWrapper r5 = r8.x     // Catch:{ Exception -> 0x008c }
            com.clubhouse.android.channels.rtc.RtcWrapper$a r5 = r5.i     // Catch:{ Exception -> 0x008c }
            io.agora.rtc.RtcEngine r1 = io.agora.rtc.RtcEngine.create(r1, r4, r5)     // Catch:{ Exception -> 0x008c }
            com.clubhouse.android.channels.rtc.RtcWrapper r4 = r8.x     // Catch:{ Exception -> 0x008c }
            r1.setChannelProfile(r3)     // Catch:{ Exception -> 0x008c }
            java.lang.String r5 = "{\"che.audio.force.bluetooth.a2dp\":0}"
            r1.setParameters(r5)     // Catch:{ Exception -> 0x008c }
            r5 = 3
            r1.setAudioProfile(r5, r2)     // Catch:{ Exception -> 0x008c }
            android.content.Context r5 = r4.d     // Catch:{ Exception -> 0x008c }
            java.lang.String r6 = "<this>"
            m0.n.b.i.e(r5, r6)     // Catch:{ Exception -> 0x008c }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x008c }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ Exception -> 0x008c }
            java.lang.String r7 = "clubhouse.log"
            r6.<init>(r5, r7)     // Catch:{ Exception -> 0x008c }
            java.lang.String r5 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x008c }
            r1.setLogFile(r5)     // Catch:{ Exception -> 0x008c }
            r5 = 200(0xc8, float:2.8E-43)
            r6 = 2
            r1.enableAudioVolumeIndication(r5, r6, r3)     // Catch:{ Exception -> 0x008c }
            io.agora.rtc.IAudioEffectManager r5 = r1.getAudioEffectManager()     // Catch:{ Exception -> 0x008c }
            java.lang.String r6 = "audioEffectManager"
            m0.n.b.i.d(r5, r6)     // Catch:{ Exception -> 0x008c }
            r8.c = r1     // Catch:{ Exception -> 0x008c }
            r8.d = r9     // Catch:{ Exception -> 0x008c }
            r8.q = r3     // Catch:{ Exception -> 0x008c }
            n0.a.d0 r3 = n0.a.m0.c     // Catch:{ Exception -> 0x008c }
            com.clubhouse.android.channels.rtc.RtcWrapper$prepareAssets$2 r6 = new com.clubhouse.android.channels.rtc.RtcWrapper$prepareAssets$2     // Catch:{ Exception -> 0x008c }
            r7 = 0
            r6.<init>(r4, r5, r7)     // Catch:{ Exception -> 0x008c }
            java.lang.Object r3 = m0.r.t.a.r.m.a1.a.k4(r3, r6, r8)     // Catch:{ Exception -> 0x008c }
            if (r3 != r0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            m0.i r3 = m0.i.a     // Catch:{ Exception -> 0x008c }
        L_0x0085:
            if (r3 != r0) goto L_0x0088
            return r0
        L_0x0088:
            r0 = r9
        L_0x0089:
            r0.k = r1     // Catch:{ Exception -> 0x008c }
            goto L_0x0096
        L_0x008c:
            r9 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]
            v0.a.a$b r1 = v0.a.a.d
            java.lang.String r2 = "Failed to initialize RtcEngine"
            r1.e(r9, r2, r0)
        L_0x0096:
            com.clubhouse.android.channels.rtc.RtcWrapper r9 = r8.x
            io.agora.rtc.RtcEngine r9 = r9.k
            if (r9 != 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            m0.n.a.l<io.agora.rtc.RtcEngine, m0.i> r0 = r8.y
            r0.invoke(r9)
        L_0x00a2:
            m0.i r9 = m0.i.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.channels.rtc.RtcWrapper$withEngine$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
