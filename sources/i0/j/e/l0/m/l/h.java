package i0.j.e.l0.m.l;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import i0.j.e.l0.m.l.c;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(16)
/* compiled from: MicRecorder */
public class h implements d {
    public final b a;
    public final HandlerThread b;
    public b c;
    public AudioRecord d;
    public int e;
    public int f;
    public AtomicBoolean g = new AtomicBoolean(false);
    public c.b h;
    public a i;
    public int j;
    public LinkedHashMap<Integer, Long> k = new LinkedHashMap<>(2);

    /* compiled from: MicRecorder */
    public static class a extends Handler {
        public c.b a;

        public a(Looper looper, c.b bVar) {
            super(looper);
            this.a = bVar;
        }
    }

    /* compiled from: MicRecorder */
    public class b extends Handler {
        public LinkedList<MediaCodec.BufferInfo> a = new LinkedList<>();
        public LinkedList<Integer> b = new LinkedList<>();
        public int c;

        public b(Looper looper) {
            super(looper);
            this.c = 2048000 / h.this.e;
        }

        public final void a() {
            if (this.b.size() <= 1 && !h.this.g.get()) {
                removeMessages(1);
                sendEmptyMessageDelayed(1, 0);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:47:0x0158  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01e5  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01fc  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x020d  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0212  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x023d  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x024e  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0253  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x025d  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x026e  */
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings({"SF_SWITCH_NO_DEFAULT"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r20) {
            /*
                r19 = this;
                r1 = r19
                r0 = r20
                int r2 = r0.what
                r3 = 3
                r4 = 0
                r5 = 4
                r6 = 0
                r7 = 1
                r8 = 2
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                if (r2 == 0) goto L_0x00e2
                if (r2 == r7) goto L_0x0182
                if (r2 == r8) goto L_0x0068
                if (r2 == r3) goto L_0x0051
                if (r2 == r5) goto L_0x003b
                r0 = 5
                if (r2 == r0) goto L_0x001f
                goto L_0x02a3
            L_0x001f:
                i0.j.e.l0.m.l.h r0 = i0.j.e.l0.m.l.h.this
                android.media.AudioRecord r0 = r0.d
                if (r0 == 0) goto L_0x002c
                r0.release()
                i0.j.e.l0.m.l.h r0 = i0.j.e.l0.m.l.h.this
                r0.d = r4
            L_0x002c:
                i0.j.e.l0.m.l.h r0 = i0.j.e.l0.m.l.h.this
                i0.j.e.l0.m.l.b r0 = r0.a
                android.media.MediaCodec r2 = r0.b
                if (r2 == 0) goto L_0x02a3
                r2.release()
                r0.b = r4
                goto L_0x02a3
            L_0x003b:
                i0.j.e.l0.m.l.h r0 = i0.j.e.l0.m.l.h.this
                android.media.AudioRecord r0 = r0.d
                if (r0 == 0) goto L_0x0044
                r0.stop()
            L_0x0044:
                i0.j.e.l0.m.l.h r0 = i0.j.e.l0.m.l.h.this
                i0.j.e.l0.m.l.b r0 = r0.a
                android.media.MediaCodec r0 = r0.b
                if (r0 == 0) goto L_0x02a3
                r0.stop()
                goto L_0x02a3
            L_0x0051:
                i0.j.e.l0.m.l.h r2 = i0.j.e.l0.m.l.h.this
                i0.j.e.l0.m.l.b r2 = r2.a
                int r0 = r0.arg1
                android.media.MediaCodec r2 = r2.c()
                r2.releaseOutputBuffer(r0, r6)
                java.util.LinkedList<java.lang.Integer> r0 = r1.b
                r0.poll()
                r19.a()
                goto L_0x02a3
            L_0x0068:
                i0.j.e.l0.m.l.h r0 = i0.j.e.l0.m.l.h.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.g
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x00dd
                java.util.LinkedList<android.media.MediaCodec$BufferInfo> r0 = r1.a
                java.lang.Object r0 = r0.poll()
                android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0
                if (r0 != 0) goto L_0x0081
                android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo
                r0.<init>()
            L_0x0081:
                i0.j.e.l0.m.l.h r2 = i0.j.e.l0.m.l.h.this
                i0.j.e.l0.m.l.b r2 = r2.a
                android.media.MediaCodec r2 = r2.c()
                r3 = 1
                int r2 = r2.dequeueOutputBuffer(r0, r3)
                r3 = -2
                if (r2 != r3) goto L_0x00ae
                i0.j.e.l0.m.l.h r3 = i0.j.e.l0.m.l.h.this
                i0.j.e.l0.m.l.h$a r4 = r3.i
                if (r4 == 0) goto L_0x00ae
                i0.j.e.l0.m.l.b r3 = r3.a
                android.media.MediaCodec r5 = r3.c()
                android.media.MediaFormat r5 = r5.getOutputFormat()
                i0.j.e.l0.m.l.f r6 = new i0.j.e.l0.m.l.f
                r6.<init>(r4, r3, r5)
                android.os.Message r3 = android.os.Message.obtain(r4, r6)
                r3.sendToTarget()
            L_0x00ae:
                if (r2 >= 0) goto L_0x00bf
                r3 = 0
                r4 = 0
                r5 = 0
                r7 = 0
                r2 = r0
                r2.set(r3, r4, r5, r7)
                java.util.LinkedList<android.media.MediaCodec$BufferInfo> r2 = r1.a
                r2.offer(r0)
                goto L_0x00dd
            L_0x00bf:
                java.util.LinkedList<java.lang.Integer> r3 = r1.b
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r3.offer(r4)
                i0.j.e.l0.m.l.h r3 = i0.j.e.l0.m.l.h.this
                i0.j.e.l0.m.l.h$a r4 = r3.i
                if (r4 == 0) goto L_0x0068
                i0.j.e.l0.m.l.b r3 = r3.a
                i0.j.e.l0.m.l.g r5 = new i0.j.e.l0.m.l.g
                r5.<init>(r4, r3, r2, r0)
                android.os.Message r0 = android.os.Message.obtain(r4, r5)
                r0.sendToTarget()
                goto L_0x0068
            L_0x00dd:
                r19.a()
                goto L_0x02a3
            L_0x00e2:
                i0.j.e.l0.m.l.h r0 = i0.j.e.l0.m.l.h.this
                int r2 = r0.e
                int r0 = r0.f
                int r4 = android.media.AudioRecord.getMinBufferSize(r2, r0, r8)
                java.lang.String r15 = "MicRecorder"
                if (r4 > 0) goto L_0x010d
                java.util.Locale r4 = java.util.Locale.US
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r6] = r2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r7] = r0
                r3[r8] = r9
                java.lang.String r0 = "Bad arguments: getMinBufferSize(%d, %d, %d)"
                java.lang.String r0 = java.lang.String.format(r4, r0, r3)
                com.instabug.library.util.InstabugSDKLogger.e(r15, r0)
                r5 = r15
                goto L_0x013d
            L_0x010d:
                android.media.AudioRecord r16 = new android.media.AudioRecord
                int r4 = r4 * 2
                r11 = 1
                r14 = 2
                r10 = r16
                r12 = r2
                r13 = r0
                r5 = r15
                r15 = r4
                r10.<init>(r11, r12, r13, r14, r15)
                int r4 = r16.getState()
                if (r4 != 0) goto L_0x0140
                java.util.Locale r4 = java.util.Locale.US
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r6] = r2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r7] = r0
                r3[r8] = r9
                java.lang.String r0 = "Bad arguments to new AudioRecord %d, %d, %d"
                java.lang.String r0 = java.lang.String.format(r4, r0, r3)
                com.instabug.library.util.InstabugSDKLogger.e(r5, r0)
            L_0x013d:
                r16 = 0
                goto L_0x0154
            L_0x0140:
                java.lang.String r0 = " size in frame "
                java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
                int r2 = r16.getBufferSizeInFrames()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.instabug.library.util.InstabugSDKLogger.d(r5, r0)
            L_0x0154:
                r0 = r16
                if (r0 != 0) goto L_0x0176
                java.lang.String r0 = "create audio record failure"
                com.instabug.library.util.InstabugSDKLogger.e(r5, r0)
                i0.j.e.l0.m.l.h r0 = i0.j.e.l0.m.l.h.this
                i0.j.e.l0.m.l.h$a r2 = r0.i
                if (r2 == 0) goto L_0x02a3
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                r3.<init>()
                i0.j.e.l0.m.l.e r4 = new i0.j.e.l0.m.l.e
                r4.<init>(r2, r0, r3)
                android.os.Message r0 = android.os.Message.obtain(r2, r4)
                r0.sendToTarget()
                goto L_0x02a3
            L_0x0176:
                r0.startRecording()
                i0.j.e.l0.m.l.h r2 = i0.j.e.l0.m.l.h.this
                r2.d = r0
                i0.j.e.l0.m.l.b r0 = r2.a     // Catch:{ Exception -> 0x0290 }
                r0.d()     // Catch:{ Exception -> 0x0290 }
            L_0x0182:
                i0.j.e.l0.m.l.h r0 = i0.j.e.l0.m.l.h.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.g
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x02a3
                i0.j.e.l0.m.l.h r0 = i0.j.e.l0.m.l.h.this
                i0.j.e.l0.m.l.b r0 = r0.a
                android.media.MediaCodec r0 = r0.c()
                r2 = 0
                int r10 = r0.dequeueInputBuffer(r2)
                if (r10 < 0) goto L_0x0289
                i0.j.e.l0.m.l.h r0 = i0.j.e.l0.m.l.h.this
                java.util.Objects.requireNonNull(r0)
                if (r10 < 0) goto L_0x027a
                java.util.concurrent.atomic.AtomicBoolean r2 = r0.g
                boolean r2 = r2.get()
                if (r2 == 0) goto L_0x01ad
                goto L_0x027a
            L_0x01ad:
                android.media.AudioRecord r2 = r0.d
                java.lang.String r3 = "maybe release"
                java.util.Objects.requireNonNull(r2, r3)
                int r2 = r2.getRecordingState()
                if (r2 != r7) goto L_0x01bc
                r2 = r7
                goto L_0x01bd
            L_0x01bc:
                r2 = r6
            L_0x01bd:
                i0.j.e.l0.m.l.b r3 = r0.a
                android.media.MediaCodec r3 = r3.c()
                java.nio.ByteBuffer r3 = r3.getInputBuffer(r10)
                r11 = 0
                if (r3 == 0) goto L_0x01de
                r3.position()
                int r4 = r3.limit()
                if (r2 != 0) goto L_0x01de
                android.media.AudioRecord r5 = r0.d
                int r3 = r5.read(r3, r4)
                if (r3 >= 0) goto L_0x01dc
                goto L_0x01de
            L_0x01dc:
                r12 = r3
                goto L_0x01df
            L_0x01de:
                r12 = r6
            L_0x01df:
                int r3 = r12 << 3
                java.util.LinkedHashMap<java.lang.Integer, java.lang.Long> r4 = r0.k
                if (r4 != 0) goto L_0x01ec
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>(r8)
                r0.k = r4
            L_0x01ec:
                r4 = 4
                int r3 = r3 >> r4
                java.util.LinkedHashMap<java.lang.Integer, java.lang.Long> r4 = r0.k
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                java.lang.Object r4 = r4.get(r5)
                r5 = -1
                if (r4 == 0) goto L_0x020d
                java.util.LinkedHashMap<java.lang.Integer, java.lang.Long> r4 = r0.k
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r4 = r4.get(r9)
                java.lang.Long r4 = (java.lang.Long) r4
                long r13 = r4.longValue()
                goto L_0x020e
            L_0x020d:
                r13 = r5
            L_0x020e:
                int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
                if (r4 != 0) goto L_0x0227
                r4 = 1000000(0xf4240, float:1.401298E-39)
                int r4 = r4 * r3
                int r9 = r0.j
                int r4 = r4 / r9
                long r13 = (long) r4
                java.util.LinkedHashMap<java.lang.Integer, java.lang.Long> r4 = r0.k
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Long r9 = java.lang.Long.valueOf(r13)
                r4.put(r3, r9)
            L_0x0227:
                long r3 = android.os.SystemClock.elapsedRealtime()
                r15 = 1000000(0xf4240, double:4.940656E-318)
                long r3 = r3 / r15
                long r3 = r3 - r13
                java.util.LinkedHashMap<java.lang.Integer, java.lang.Long> r9 = r0.k
                r15 = -1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
                java.lang.Object r8 = r9.get(r8)
                if (r8 == 0) goto L_0x024e
                java.util.LinkedHashMap<java.lang.Integer, java.lang.Long> r8 = r0.k
                java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
                java.lang.Object r8 = r8.get(r9)
                java.lang.Long r8 = (java.lang.Long) r8
                long r8 = r8.longValue()
                goto L_0x024f
            L_0x024e:
                r8 = r5
            L_0x024f:
                int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r5 != 0) goto L_0x0254
                r8 = r3
            L_0x0254:
                long r5 = r3 - r8
                long r17 = r13 << r7
                int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
                if (r5 < 0) goto L_0x025d
                goto L_0x025e
            L_0x025d:
                r3 = r8
            L_0x025e:
                java.util.LinkedHashMap<java.lang.Integer, java.lang.Long> r5 = r0.k
                java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
                long r13 = r13 + r3
                java.lang.Long r8 = java.lang.Long.valueOf(r13)
                r5.put(r6, r8)
                if (r2 == 0) goto L_0x026f
                r7 = 4
            L_0x026f:
                r15 = r7
                i0.j.e.l0.m.l.b r0 = r0.a
                android.media.MediaCodec r9 = r0.c()
                r13 = r3
                r9.queueInputBuffer(r10, r11, r12, r13, r15)
            L_0x027a:
                i0.j.e.l0.m.l.h r0 = i0.j.e.l0.m.l.h.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.g
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x02a3
                r0 = 2
                r1.sendEmptyMessage(r0)
                goto L_0x02a3
            L_0x0289:
                int r0 = r1.c
                long r2 = (long) r0
                r1.sendEmptyMessageDelayed(r7, r2)
                goto L_0x02a3
            L_0x0290:
                r0 = move-exception
                i0.j.e.l0.m.l.h r2 = i0.j.e.l0.m.l.h.this
                i0.j.e.l0.m.l.h$a r3 = r2.i
                if (r3 == 0) goto L_0x02a3
                i0.j.e.l0.m.l.e r4 = new i0.j.e.l0.m.l.e
                r4.<init>(r3, r2, r0)
                android.os.Message r0 = android.os.Message.obtain(r3, r4)
                r0.sendToTarget()
            L_0x02a3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.e.l0.m.l.h.b.handleMessage(android.os.Message):void");
        }
    }

    public h(a aVar) {
        this.a = new b(aVar);
        this.e = 44100;
        this.j = 88200;
        this.f = 12;
        this.b = new HandlerThread("MicRecorder");
    }

    public void a() throws IOException {
        Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper, "Should prepare in HandlerThread");
        this.i = new a(myLooper, this.h);
        this.b.start();
        b bVar = new b(this.b.getLooper());
        this.c = bVar;
        bVar.sendEmptyMessage(0);
    }
}
