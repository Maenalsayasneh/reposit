package i0.j.e.l0.m.l;

import android.annotation.TargetApi;
import android.hardware.display.VirtualDisplay;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.instabug.library.util.InstabugSDKLogger;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import i0.j.e.l0.m.l.c;
import i0.j.e.l0.m.l.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(21)
/* compiled from: ScreenRecorder */
public class i {
    public int a;
    public int b;
    public int c;
    public String d;
    public MediaProjection e;
    public k f;
    public h g;
    public MediaFormat h = null;
    public MediaFormat i = null;
    public int j = -1;
    public int k = -1;
    public MediaMuxer l;
    public boolean m = false;
    public AtomicBoolean n = new AtomicBoolean(false);
    public AtomicBoolean o = new AtomicBoolean(false);
    public VirtualDisplay p;
    public MediaProjection.Callback q = new a();
    public HandlerThread r;
    public e s;
    public d t;
    public LinkedList<Integer> u = new LinkedList<>();
    public LinkedList<Integer> v = new LinkedList<>();
    public LinkedList<MediaCodec.BufferInfo> w = new LinkedList<>();
    public LinkedList<MediaCodec.BufferInfo> x = new LinkedList<>();
    public long y;
    public long z;

    /* compiled from: ScreenRecorder */
    public class a extends MediaProjection.Callback {
        public a() {
        }

        public void onStop() {
            i.this.a();
        }
    }

    /* compiled from: ScreenRecorder */
    public class b extends c.b {
        public b() {
        }

        public void a(d dVar, Exception exc) {
            InstabugSDKLogger.e("ScreenRecorder", "VideoEncoder ran into an error! ", exc);
            e eVar = i.this.s;
            if (eVar != null) {
                Message.obtain(eVar, 2, exc).sendToTarget();
            }
        }

        public void b(c cVar, int i, MediaCodec.BufferInfo bufferInfo) {
            try {
                i.this.f(i, bufferInfo);
            } catch (Exception e) {
                InstabugSDKLogger.e("ScreenRecorder", "Muxer encountered an error! ", e);
                e eVar = i.this.s;
                if (eVar != null) {
                    Message.obtain(eVar, 2, e).sendToTarget();
                }
            }
        }

        public void c(c cVar, MediaFormat mediaFormat) {
            i iVar = i.this;
            synchronized (iVar) {
                if (iVar.j >= 0 || iVar.m) {
                    throw new IllegalStateException("output format already changed!");
                }
                iVar.h = mediaFormat;
            }
            i.j(i.this);
        }
    }

    /* compiled from: ScreenRecorder */
    public class c extends c.b {
        public c() {
        }

        public void a(d dVar, Exception exc) {
            InstabugSDKLogger.e("ScreenRecorder", "MicRecorder ran into an error! ", exc);
            e eVar = i.this.s;
            if (eVar != null) {
                Message.obtain(eVar, 2, exc).sendToTarget();
            }
        }

        public void b(c cVar, int i, MediaCodec.BufferInfo bufferInfo) {
            try {
                i.this.b(i, bufferInfo);
            } catch (Exception e) {
                InstabugSDKLogger.e("ScreenRecorder", "Muxer encountered an error! ", e);
                Message.obtain(i.this.s, 2, e).sendToTarget();
            }
        }

        public void c(c cVar, MediaFormat mediaFormat) {
            i iVar = i.this;
            synchronized (iVar) {
                if (iVar.k >= 0 || iVar.m) {
                    throw new IllegalStateException("output format already changed!");
                }
                iVar.i = mediaFormat;
            }
            i.j(i.this);
        }
    }

    /* compiled from: ScreenRecorder */
    public interface d {
        void a(long j);

        void b(Throwable th);

        void onStart();
    }

    /* compiled from: ScreenRecorder */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @SuppressFBWarnings({"SF_SWITCH_NO_DEFAULT", "SF_SWITCH_FALLTHROUGH"})
        public void handleMessage(Message message) {
            MediaCodec mediaCodec;
            int i = message.what;
            if (i == 0) {
                try {
                    i.d(i.this);
                    d dVar = i.this.t;
                    if (dVar != null) {
                        dVar.onStart();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    message.obj = e;
                }
            } else if (!(i == 1 || i == 2)) {
                return;
            }
            i iVar = i.this;
            synchronized (iVar) {
                iVar.o.set(false);
                iVar.w.clear();
                iVar.v.clear();
                iVar.x.clear();
                iVar.u.clear();
                try {
                    k kVar = iVar.f;
                    if (!(kVar == null || (mediaCodec = kVar.b) == null)) {
                        mediaCodec.stop();
                    }
                } catch (IllegalStateException unused) {
                }
                try {
                    h hVar = iVar.g;
                    if (hVar != null) {
                        h.a aVar = hVar.i;
                        if (aVar != null) {
                            aVar.removeCallbacksAndMessages((Object) null);
                        }
                        hVar.g.set(true);
                        h.b bVar = hVar.c;
                        if (bVar != null) {
                            bVar.sendEmptyMessage(4);
                        }
                    }
                } catch (IllegalStateException unused2) {
                }
            }
            if (message.arg1 != 1) {
                i iVar2 = i.this;
                synchronized (iVar2) {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    ByteBuffer allocate = ByteBuffer.allocate(0);
                    bufferInfo.set(0, 0, 0, 4);
                    int i2 = iVar2.j;
                    if (i2 != -1) {
                        iVar2.c(i2, bufferInfo, allocate);
                    }
                    int i3 = iVar2.k;
                    if (i3 != -1) {
                        iVar2.c(i3, bufferInfo, allocate);
                    }
                    iVar2.j = -1;
                    iVar2.k = -1;
                }
            }
            d dVar2 = i.this.t;
            if (dVar2 != null) {
                dVar2.b((Throwable) message.obj);
            }
            i iVar3 = i.this;
            iVar3.t = null;
            iVar3.i();
        }
    }

    public i(j jVar, a aVar, MediaProjection mediaProjection, String str) {
        h hVar = null;
        this.a = jVar.a;
        this.b = jVar.b;
        this.c = jVar.c / 4;
        this.e = mediaProjection;
        this.d = str;
        this.f = new k(jVar);
        this.g = aVar != null ? new h(aVar) : hVar;
    }

    public static void d(i iVar) {
        synchronized (iVar) {
            if (iVar.o.get() || iVar.n.get()) {
                throw new IllegalStateException();
            } else if (iVar.e != null) {
                iVar.o.set(true);
                e eVar = iVar.s;
                if (eVar != null) {
                    iVar.e.registerCallback(iVar.q, eVar);
                }
                try {
                    iVar.l = new MediaMuxer(iVar.d, 0);
                    iVar.h();
                    iVar.g();
                    int i2 = iVar.a;
                    int i3 = iVar.b;
                    int i4 = iVar.c;
                    Surface surface = iVar.f.f;
                    Objects.requireNonNull(surface, "doesn't prepare()");
                    iVar.p = iVar.e.createVirtualDisplay(iVar + "-display", i2, i3, i4, 1, surface, (VirtualDisplay.Callback) null, (Handler) null);
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                throw new IllegalStateException("maybe release");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void j(i0.j.e.l0.m.l.i r2) {
        /*
            monitor-enter(r2)
            boolean r0 = r2.m     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0081
            android.media.MediaFormat r0 = r2.h     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0081
            i0.j.e.l0.m.l.h r1 = r2.g     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x0013
            android.media.MediaFormat r1 = r2.i     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x0013
            goto L_0x0081
        L_0x0013:
            android.media.MediaMuxer r1 = r2.l     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x0037
            int r0 = r1.addTrack(r0)     // Catch:{ all -> 0x0083 }
            r2.j = r0     // Catch:{ all -> 0x0083 }
            android.media.MediaFormat r0 = r2.i     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x002f
            i0.j.e.l0.m.l.h r1 = r2.g     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x0027
            r0 = -1
            goto L_0x002d
        L_0x0027:
            android.media.MediaMuxer r1 = r2.l     // Catch:{ all -> 0x0083 }
            int r0 = r1.addTrack(r0)     // Catch:{ all -> 0x0083 }
        L_0x002d:
            r2.k = r0     // Catch:{ all -> 0x0083 }
        L_0x002f:
            android.media.MediaMuxer r0 = r2.l     // Catch:{ all -> 0x0083 }
            r0.start()     // Catch:{ all -> 0x0083 }
            r0 = 1
            r2.m = r0     // Catch:{ all -> 0x0083 }
        L_0x0037:
            java.util.LinkedList<java.lang.Integer> r0 = r2.u     // Catch:{ all -> 0x0083 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0049
            java.util.LinkedList<java.lang.Integer> r0 = r2.v     // Catch:{ all -> 0x0083 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0049
            monitor-exit(r2)
            goto L_0x0082
        L_0x0049:
            java.util.LinkedList<android.media.MediaCodec$BufferInfo> r0 = r2.x     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0083 }
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0063
            java.util.LinkedList<java.lang.Integer> r1 = r2.u     // Catch:{ all -> 0x0083 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0083 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0083 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0083 }
            r2.f(r1, r0)     // Catch:{ all -> 0x0083 }
            goto L_0x0049
        L_0x0063:
            i0.j.e.l0.m.l.h r0 = r2.g     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0081
        L_0x0067:
            java.util.LinkedList<android.media.MediaCodec$BufferInfo> r0 = r2.w     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0083 }
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0081
            java.util.LinkedList<java.lang.Integer> r1 = r2.v     // Catch:{ all -> 0x0083 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0083 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0083 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0083 }
            r2.b(r1, r0)     // Catch:{ all -> 0x0083 }
            goto L_0x0067
        L_0x0081:
            monitor-exit(r2)
        L_0x0082:
            return
        L_0x0083:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.l0.m.l.i.j(i0.j.e.l0.m.l.i):void");
    }

    public final synchronized void a() {
        this.n.set(true);
        if (!this.o.get()) {
            i();
        } else {
            e(false);
        }
    }

    public final void b(int i2, MediaCodec.BufferInfo bufferInfo) {
        if (!this.o.get()) {
            InstabugSDKLogger.w("ScreenRecorder", "muxAudio: Already stopped!");
        } else if (!this.m || this.k == -1) {
            this.v.add(Integer.valueOf(i2));
            this.w.add(bufferInfo);
        } else {
            h hVar = this.g;
            if (hVar != null) {
                c(this.k, bufferInfo, hVar.a.c().getOutputBuffer(i2));
                h.b bVar = this.g.c;
                if (bVar != null) {
                    Message.obtain(bVar, 3, i2, 0).sendToTarget();
                }
            }
            if ((bufferInfo.flags & 4) != 0) {
                this.k = -1;
                e(true);
            }
        }
    }

    public final void c(int i2, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        d dVar;
        int i3 = bufferInfo.flags;
        boolean z2 = false;
        if ((i3 & 2) != 0) {
            bufferInfo.size = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = true;
        }
        if (bufferInfo.size != 0 || z2) {
            if (bufferInfo.presentationTimeUs != 0) {
                if (i2 == this.j) {
                    synchronized (this) {
                        long j2 = this.y;
                        if (j2 == 0) {
                            this.y = bufferInfo.presentationTimeUs;
                            bufferInfo.presentationTimeUs = 0;
                        } else {
                            bufferInfo.presentationTimeUs -= j2;
                        }
                    }
                } else if (i2 == this.k) {
                    synchronized (this) {
                        long j3 = this.z;
                        if (j3 == 0) {
                            this.z = bufferInfo.presentationTimeUs;
                            bufferInfo.presentationTimeUs = 0;
                        } else {
                            bufferInfo.presentationTimeUs -= j3;
                        }
                    }
                }
            }
            if (!z2 && (dVar = this.t) != null) {
                dVar.a(bufferInfo.presentationTimeUs);
            }
        } else {
            byteBuffer = null;
        }
        if (byteBuffer != null) {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            MediaMuxer mediaMuxer = this.l;
            if (mediaMuxer != null) {
                mediaMuxer.writeSampleData(i2, byteBuffer, bufferInfo);
            }
        }
    }

    public final synchronized void e(boolean z2) {
        e eVar = this.s;
        if (eVar != null) {
            this.s.sendMessageAtFrontOfQueue(Message.obtain(eVar, 1, z2 ? 1 : 0, 0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f(int r4, android.media.MediaCodec.BufferInfo r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.o     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0012
            java.lang.String r4 = "ScreenRecorder"
            java.lang.String r5 = "muxVideo: Already stopped!"
            com.instabug.library.util.InstabugSDKLogger.w(r4, r5)     // Catch:{ all -> 0x0055 }
            monitor-exit(r3)
            return
        L_0x0012:
            boolean r0 = r3.m     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0045
            int r0 = r3.j     // Catch:{ all -> 0x0055 }
            r1 = -1
            if (r0 != r1) goto L_0x001c
            goto L_0x0045
        L_0x001c:
            i0.j.e.l0.m.l.k r0 = r3.f     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0037
            android.media.MediaCodec r0 = r0.c()     // Catch:{ all -> 0x0055 }
            java.nio.ByteBuffer r0 = r0.getOutputBuffer(r4)     // Catch:{ all -> 0x0055 }
            int r2 = r3.j     // Catch:{ all -> 0x0055 }
            r3.c(r2, r5, r0)     // Catch:{ all -> 0x0055 }
            i0.j.e.l0.m.l.k r0 = r3.f     // Catch:{ all -> 0x0055 }
            android.media.MediaCodec r0 = r0.c()     // Catch:{ all -> 0x0055 }
            r2 = 0
            r0.releaseOutputBuffer(r4, r2)     // Catch:{ all -> 0x0055 }
        L_0x0037:
            int r4 = r5.flags     // Catch:{ all -> 0x0055 }
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0043
            r3.j = r1     // Catch:{ all -> 0x0055 }
            r4 = 1
            r3.e(r4)     // Catch:{ all -> 0x0055 }
        L_0x0043:
            monitor-exit(r3)
            return
        L_0x0045:
            java.util.LinkedList<java.lang.Integer> r0 = r3.u     // Catch:{ all -> 0x0055 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0055 }
            r0.add(r4)     // Catch:{ all -> 0x0055 }
            java.util.LinkedList<android.media.MediaCodec$BufferInfo> r4 = r3.x     // Catch:{ all -> 0x0055 }
            r4.add(r5)     // Catch:{ all -> 0x0055 }
            monitor-exit(r3)
            return
        L_0x0055:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.l0.m.l.i.f(int, android.media.MediaCodec$BufferInfo):void");
    }

    public synchronized void finalize() throws Throwable {
        if (this.e != null) {
            InstabugSDKLogger.e("ScreenRecorder", "release() not called!");
            i();
        }
        super.finalize();
    }

    public final synchronized void g() throws IOException {
        h hVar = this.g;
        if (hVar != null) {
            hVar.h = new c();
            hVar.a();
        }
    }

    public final synchronized void h() throws IOException {
        b bVar = new b();
        k kVar = this.f;
        if (kVar != null) {
            if (kVar.b == null) {
                kVar.c = bVar;
                kVar.d();
            } else {
                throw new IllegalStateException("mEncoder is not null");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:31|32|33|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0069 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void i() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.media.projection.MediaProjection r0 = r4.e     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x000a
            android.media.projection.MediaProjection$Callback r1 = r4.q     // Catch:{ all -> 0x006f }
            r0.unregisterCallback(r1)     // Catch:{ all -> 0x006f }
        L_0x000a:
            android.hardware.display.VirtualDisplay r0 = r4.p     // Catch:{ all -> 0x006f }
            r1 = 0
            if (r0 == 0) goto L_0x0014
            r0.release()     // Catch:{ all -> 0x006f }
            r4.p = r1     // Catch:{ all -> 0x006f }
        L_0x0014:
            r4.i = r1     // Catch:{ all -> 0x006f }
            r4.h = r1     // Catch:{ all -> 0x006f }
            r0 = -1
            r4.k = r0     // Catch:{ all -> 0x006f }
            r4.j = r0     // Catch:{ all -> 0x006f }
            r0 = 0
            r4.m = r0     // Catch:{ all -> 0x006f }
            android.os.HandlerThread r0 = r4.r     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0029
            r0.quitSafely()     // Catch:{ all -> 0x006f }
            r4.r = r1     // Catch:{ all -> 0x006f }
        L_0x0029:
            i0.j.e.l0.m.l.k r0 = r4.f     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0041
            android.view.Surface r2 = r0.f     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x0036
            r2.release()     // Catch:{ all -> 0x006f }
            r0.f = r1     // Catch:{ all -> 0x006f }
        L_0x0036:
            android.media.MediaCodec r2 = r0.b     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x003f
            r2.release()     // Catch:{ all -> 0x006f }
            r0.b = r1     // Catch:{ all -> 0x006f }
        L_0x003f:
            r4.f = r1     // Catch:{ all -> 0x006f }
        L_0x0041:
            i0.j.e.l0.m.l.h r0 = r4.g     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0054
            i0.j.e.l0.m.l.h$b r2 = r0.c     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x004d
            r3 = 5
            r2.sendEmptyMessage(r3)     // Catch:{ all -> 0x006f }
        L_0x004d:
            android.os.HandlerThread r0 = r0.b     // Catch:{ all -> 0x006f }
            r0.quit()     // Catch:{ all -> 0x006f }
            r4.g = r1     // Catch:{ all -> 0x006f }
        L_0x0054:
            android.media.projection.MediaProjection r0 = r4.e     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x005d
            r0.stop()     // Catch:{ all -> 0x006f }
            r4.e = r1     // Catch:{ all -> 0x006f }
        L_0x005d:
            android.media.MediaMuxer r0 = r4.l     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x006b
            r0.stop()     // Catch:{ Exception -> 0x0069 }
            android.media.MediaMuxer r0 = r4.l     // Catch:{ Exception -> 0x0069 }
            r0.release()     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            r4.l = r1     // Catch:{ all -> 0x006f }
        L_0x006b:
            r4.s = r1     // Catch:{ all -> 0x006f }
            monitor-exit(r4)
            return
        L_0x006f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.l0.m.l.i.i():void");
    }
}
