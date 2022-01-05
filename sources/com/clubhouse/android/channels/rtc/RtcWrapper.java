package com.clubhouse.android.channels.rtc;

import android.content.Context;
import android.media.AudioManager;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.shared.auth.UserManager;
import i0.e.b.f3.e;
import i0.e.b.z2.i.b;
import i0.j.f.p.h;
import io.agora.rtc.IRtcEngineEventHandler;
import io.agora.rtc.RtcEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import n0.a.c;
import n0.a.g2.a0;
import n0.a.g2.p;
import n0.a.g2.q;
import n0.a.g2.u;
import n0.a.w0;
import n0.a.x0;

/* compiled from: RtcWrapper.kt */
public final class RtcWrapper {
    public static final RtcWrapper a = null;
    public static final int b = (48000 / 100);
    public static boolean c = true;
    public final Context d;
    public final e e;
    public final UserManager f;
    public final i0.e.a.a g;
    public final w0 h = new x0(Executors.newScheduledThreadPool(1, new c(1, "RtcWrapper", new AtomicInteger())));
    public final a i = new a(this);
    public final AudioManager j;
    public RtcEngine k;
    public boolean l;
    public boolean m;
    public String n;
    public final p<List<b>> o;
    public final p<i0.e.b.z2.i.a> p;
    public final q<Boolean> q;

    /* compiled from: RtcWrapper.kt */
    public final class a extends IRtcEngineEventHandler {
        public final /* synthetic */ RtcWrapper a;

        public a(RtcWrapper rtcWrapper) {
            i.e(rtcWrapper, "this$0");
            this.a = rtcWrapper;
        }

        public void onActiveSpeaker(int i) {
            RtcWrapper rtcWrapper = this.a;
            if (rtcWrapper.m) {
                rtcWrapper.setSpeakingUid(i);
            }
        }

        public void onAudioRouteChanged(int i) {
            v0.a.a.d.d("RTC audio route changed: %s", i >= 0 ? (String) g.K("AUDIO_ROUTE_HEADSET", "AUDIO_ROUTE_EARPIECE", "AUDIO_ROUTE_HEADSETNOMIC", "AUDIO_ROUTE_SPEAKERPHONE", "AUDIO_ROUTE_LOUDSPEAKER", "AUDIO_ROUTE_HEADSETBLUETOOTH").get(i) : "AUDIO_ROUTE_DEFAULT");
            RtcWrapper rtcWrapper = this.a;
            if (rtcWrapper.m) {
                rtcWrapper.enableAudioSpatialization(true);
            }
        }

        public void onAudioVolumeIndication(IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            Integer b = this.a.f.b();
            int intValue = b == null ? 0 : b.intValue();
            p<List<b>> pVar = this.a.o;
            ArrayList arrayList = new ArrayList();
            for (IRtcEngineEventHandler.AudioVolumeInfo audioVolumeInfo : audioVolumeInfoArr) {
                if (audioVolumeInfo.volume > 10) {
                    arrayList.add(audioVolumeInfo);
                }
            }
            ArrayList arrayList2 = new ArrayList(h.K(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                IRtcEngineEventHandler.AudioVolumeInfo audioVolumeInfo2 = (IRtcEngineEventHandler.AudioVolumeInfo) it.next();
                int i2 = audioVolumeInfo2.uid;
                if (i2 == 0) {
                    i2 = intValue;
                }
                arrayList2.add(new b(i2, audioVolumeInfo2.volume));
            }
            pVar.d(arrayList2);
        }

        public void onError(int i) {
            v0.a.a.d.w("RTC error %s", String.valueOf(i));
            ((AmplitudeAnalytics) this.a.g).b("AgoraRTC-Join-Error", h.S2(new Pair("Reason", Integer.valueOf(i))));
        }

        public void onNetworkQuality(int i, int i2, int i3) {
            if (i == 0) {
                boolean z = 3 <= i3 && i3 <= 6;
                boolean z2 = 3 <= i2 && i2 <= 6;
                if (z || z2) {
                    RtcWrapper rtcWrapper = this.a;
                    if (!rtcWrapper.l) {
                        ((AmplitudeAnalytics) rtcWrapper.g).b("AgoraRTC-NetworkQuality-IsBad", g.N(new Pair("rxQuality", Integer.valueOf(i3)), new Pair("txQuality", Integer.valueOf(i2))));
                        this.a.l = true;
                    }
                    this.a.q.d(Boolean.FALSE);
                    return;
                }
                this.a.q.d(Boolean.TRUE);
            }
        }

        public void onRemoteAudioStateChanged(int i, int i2, int i3, int i4) {
            if (i3 == 5) {
                this.a.p.d(new i0.e.b.z2.i.a(i, true));
            } else if (i3 == 6) {
                this.a.p.d(new i0.e.b.z2.i.a(i, false));
            } else if (i3 == 7) {
                RtcWrapper rtcWrapper = this.a;
                if (rtcWrapper.m) {
                    rtcWrapper.removeUid(i);
                }
                this.a.p.d(new i0.e.b.z2.i.a(i, false));
            }
        }

        public void onUserJoined(int i, int i2) {
            RtcWrapper rtcWrapper = this.a;
            if (rtcWrapper.m) {
                rtcWrapper.addUid(i);
            }
        }
    }

    static {
        try {
            System.loadLibrary("apm-plugin-rtc-processing");
        } catch (Exception e2) {
            v0.a.a.d.e(e2, "Failed to load processing library", new Object[0]);
        }
    }

    public RtcWrapper(Context context, e eVar, UserManager userManager, i0.e.a.a aVar) {
        i.e(context, "appContext");
        i.e(eVar, "environment");
        i.e(userManager, "userManager");
        i.e(aVar, "analytics");
        this.d = context;
        this.e = eVar;
        this.f = userManager;
        this.g = aVar;
        this.j = (AudioManager) context.getSystemService("audio");
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.o = u.b(0, 100, bufferOverflow, 1);
        this.p = u.b(0, 100, bufferOverflow, 1);
        this.q = a0.a(Boolean.TRUE);
    }

    public static final void a(RtcWrapper rtcWrapper, RtcEngine rtcEngine, boolean z) {
        Objects.requireNonNull(rtcWrapper);
        rtcEngine.muteLocalAudioStream(z);
        p<i0.e.b.z2.i.a> pVar = rtcWrapper.p;
        Integer b2 = rtcWrapper.f.b();
        pVar.d(new i0.e.b.z2.i.a(b2 == null ? 0 : b2.intValue(), z));
    }

    public final native void addUid(int i2);

    public final Object b(i0.e.b.z2.f.b bVar, m0.l.c<? super m0.i> cVar) {
        Object e2 = e(new RtcWrapper$changeRole$2(bVar, this), cVar);
        if (e2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e2;
        }
        return m0.i.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(m0.l.c<? super m0.i> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.clubhouse.android.channels.rtc.RtcWrapper$leaveChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.clubhouse.android.channels.rtc.RtcWrapper$leaveChannel$1 r0 = (com.clubhouse.android.channels.rtc.RtcWrapper$leaveChannel$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.channels.rtc.RtcWrapper$leaveChannel$1 r0 = new com.clubhouse.android.channels.rtc.RtcWrapper$leaveChannel$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.c
            com.clubhouse.android.channels.rtc.RtcWrapper r0 = (com.clubhouse.android.channels.rtc.RtcWrapper) r0
            i0.j.f.p.h.d4(r5)
            goto L_0x0044
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r5)
            com.clubhouse.android.channels.rtc.RtcWrapper$leaveChannel$2 r5 = com.clubhouse.android.channels.rtc.RtcWrapper$leaveChannel$2.c
            r0.c = r4
            r0.x = r3
            java.lang.Object r5 = r4.e(r5, r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r0 = r4
        L_0x0044:
            r5 = 0
            r0.l = r5
            boolean r1 = r0.m
            if (r1 == 0) goto L_0x0050
            r0.shutdownProcessing()
            r0.m = r5
        L_0x0050:
            m0.i r5 = m0.i.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.channels.rtc.RtcWrapper.c(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(m0.l.c<? super m0.i> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.clubhouse.android.channels.rtc.RtcWrapper$refreshAudioRouting$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.clubhouse.android.channels.rtc.RtcWrapper$refreshAudioRouting$1 r0 = (com.clubhouse.android.channels.rtc.RtcWrapper$refreshAudioRouting$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.channels.rtc.RtcWrapper$refreshAudioRouting$1 r0 = new com.clubhouse.android.channels.rtc.RtcWrapper$refreshAudioRouting$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            i0.j.f.p.h.d4(r6)
            goto L_0x00a7
        L_0x0028:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0030:
            i0.j.f.p.h.d4(r6)
            android.media.AudioManager r6 = r5.j
            if (r6 != 0) goto L_0x0038
            goto L_0x00a7
        L_0x0038:
            boolean r6 = r6.isBluetoothA2dpOn()
            r2 = 0
            if (r6 == 0) goto L_0x004d
            java.lang.Object[] r6 = new java.lang.Object[r2]
            v0.a.a$b r0 = v0.a.a.d
            java.lang.String r1 = "RTC AUDIO_ROUTE_HEADSETBLUETOOTH_A2DP"
            r0.d(r1, r6)
            java.lang.String r6 = "BluetoothA2DPOutput"
            r5.n = r6
            goto L_0x00a7
        L_0x004d:
            android.media.AudioManager r6 = r5.j
            boolean r6 = r6.isBluetoothScoOn()
            if (r6 == 0) goto L_0x0063
            java.lang.Object[] r6 = new java.lang.Object[r2]
            v0.a.a$b r0 = v0.a.a.d
            java.lang.String r1 = "RTC AUDIO_ROUTE_HEADSETBLUETOOTH_HFP"
            r0.d(r1, r6)
            java.lang.String r6 = "BluetoothHFP"
            r5.n = r6
            goto L_0x00a7
        L_0x0063:
            android.media.AudioManager r6 = r5.j
            boolean r6 = r6.isWiredHeadsetOn()
            if (r6 == 0) goto L_0x0079
            java.lang.Object[] r6 = new java.lang.Object[r2]
            v0.a.a$b r0 = v0.a.a.d
            java.lang.String r1 = "RTC AUDIO_ROUTE_HEADSET"
            r0.d(r1, r6)
            java.lang.String r6 = "Headphones"
            r5.n = r6
            goto L_0x00a7
        L_0x0079:
            android.media.AudioManager r6 = r5.j
            boolean r6 = r6.isSpeakerphoneOn()
            if (r6 == 0) goto L_0x008f
            java.lang.Object[] r6 = new java.lang.Object[r2]
            v0.a.a$b r0 = v0.a.a.d
            java.lang.String r1 = "RTC AUDIO_ROUTE_SPEAKERPHONE"
            r0.d(r1, r6)
            java.lang.String r6 = "Speaker"
            r5.n = r6
            goto L_0x00a7
        L_0x008f:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            v0.a.a$b r2 = v0.a.a.d
            java.lang.String r4 = "RTC AUDIO_ROUTE_EARPIECE"
            r2.d(r4, r6)
            java.lang.String r6 = "Earpiece"
            r5.n = r6
            com.clubhouse.android.channels.rtc.RtcWrapper$refreshAudioRouting$2$1 r6 = com.clubhouse.android.channels.rtc.RtcWrapper$refreshAudioRouting$2$1.c
            r0.q = r3
            java.lang.Object r6 = r5.e(r6, r0)
            if (r6 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            m0.i r6 = m0.i.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.channels.rtc.RtcWrapper.d(m0.l.c):java.lang.Object");
    }

    public final Object e(l<? super RtcEngine, m0.i> lVar, m0.l.c<? super m0.i> cVar) {
        Object k4 = m0.r.t.a.r.m.a1.a.k4(this.h, new RtcWrapper$withEngine$2(this, lVar, (m0.l.c<? super RtcWrapper$withEngine$2>) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }

    public final native void enableAudioSpatialization(boolean z);

    public final native void initProcessing(long j2);

    public final native void removeUid(int i2);

    public final native void setSpeakingUid(int i2);

    public final native void shutdownProcessing();
}
