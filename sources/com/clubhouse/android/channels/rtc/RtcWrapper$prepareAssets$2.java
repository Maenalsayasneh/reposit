package com.clubhouse.android.channels.rtc;

import io.agora.rtc.IAudioEffectManager;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.channels.rtc.RtcWrapper$prepareAssets$2", f = "RtcWrapper.kt", l = {}, m = "invokeSuspend")
/* compiled from: RtcWrapper.kt */
public final class RtcWrapper$prepareAssets$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ RtcWrapper c;
    public final /* synthetic */ IAudioEffectManager d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcWrapper$prepareAssets$2(RtcWrapper rtcWrapper, IAudioEffectManager iAudioEffectManager, m0.l.c<? super RtcWrapper$prepareAssets$2> cVar) {
        super(2, cVar);
        this.c = rtcWrapper;
        this.d = iAudioEffectManager;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new RtcWrapper$prepareAssets$2(this.c, this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        RtcWrapper$prepareAssets$2 rtcWrapper$prepareAssets$2 = new RtcWrapper$prepareAssets$2(this.c, this.d, (m0.l.c) obj2);
        i iVar = i.a;
        rtcWrapper$prepareAssets$2.invokeSuspend(iVar);
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        i0.j.f.p.h.H(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        i0.j.f.p.h.H(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            i0.j.f.p.h.d4(r12)
            com.clubhouse.android.channels.rtc.Sound[] r12 = com.clubhouse.android.channels.rtc.Sound.values()
            com.clubhouse.android.channels.rtc.RtcWrapper r0 = r11.c
            io.agora.rtc.IAudioEffectManager r1 = r11.d
            r2 = 3
            r3 = 0
            r4 = r3
        L_0x0010:
            if (r4 >= r2) goto L_0x007b
            r5 = r12[r4]
            android.content.Context r6 = r0.d
            int r7 = r5.getRes()
            java.lang.String r8 = r5.getFileName()
            java.lang.String r9 = "context"
            m0.n.b.i.e(r6, r9)
            java.lang.String r9 = "assetName"
            m0.n.b.i.e(r8, r9)
            java.io.File r9 = new java.io.File
            java.io.File r10 = r6.getCacheDir()
            r9.<init>(r10, r8)
            boolean r8 = r9.exists()
            if (r8 == 0) goto L_0x0038
            goto L_0x006d
        L_0x0038:
            r9.createNewFile()     // Catch:{ all -> 0x0067 }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x0067 }
            java.io.InputStream r6 = r6.openRawResource(r7)     // Catch:{ all -> 0x0067 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x0060 }
            r7.<init>(r9)     // Catch:{ all -> 0x0060 }
            java.lang.String r8 = "src"
            m0.n.b.i.d(r6, r8)     // Catch:{ all -> 0x0059 }
            r8 = 2
            i0.j.f.p.h.Y(r6, r7, r3, r8)     // Catch:{ all -> 0x0059 }
            r8 = 0
            i0.j.f.p.h.H(r7, r8)     // Catch:{ all -> 0x0060 }
            i0.j.f.p.h.H(r6, r8)     // Catch:{ all -> 0x0067 }
            goto L_0x006d
        L_0x0059:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x005b }
        L_0x005b:
            r10 = move-exception
            i0.j.f.p.h.H(r7, r8)     // Catch:{ all -> 0x0060 }
            throw r10     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r8 = move-exception
            i0.j.f.p.h.H(r6, r7)     // Catch:{ all -> 0x0067 }
            throw r8     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r6 = move-exception
            v0.a.a$b r7 = v0.a.a.d
            r7.e(r6)
        L_0x006d:
            int r5 = r5.getRes()
            java.lang.String r6 = r9.getAbsolutePath()
            r1.preloadEffect(r5, r6)
            int r4 = r4 + 1
            goto L_0x0010
        L_0x007b:
            m0.i r12 = m0.i.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.channels.rtc.RtcWrapper$prepareAssets$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
