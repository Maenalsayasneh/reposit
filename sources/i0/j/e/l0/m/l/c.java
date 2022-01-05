package i0.j.e.l0.m.l;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import i0.j.e.l0.m.l.d;
import java.util.Objects;

@TargetApi(21)
/* compiled from: BaseEncoder */
public abstract class c implements d {
    public String a;
    public MediaCodec b;
    public b c;
    public MediaCodec.Callback d = new a();

    /* compiled from: BaseEncoder */
    public class a extends MediaCodec.Callback {
        public a() {
        }

        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            c cVar = c.this;
            b bVar = cVar.c;
            if (bVar != null) {
                bVar.a(cVar, codecException);
            }
        }

        public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            b bVar = c.this.c;
            if (bVar != null) {
                Objects.requireNonNull(bVar);
            }
        }

        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            c cVar = c.this;
            b bVar = cVar.c;
            if (bVar != null) {
                bVar.b(cVar, i, bufferInfo);
            }
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            c cVar = c.this;
            b bVar = cVar.c;
            if (bVar != null) {
                bVar.c(cVar, mediaFormat);
            }
        }
    }

    /* compiled from: BaseEncoder */
    public static abstract class b implements d.a {
        public abstract void b(c cVar, int i, MediaCodec.BufferInfo bufferInfo);

        public abstract void c(c cVar, MediaFormat mediaFormat);
    }

    public c(String str) {
        this.a = str;
    }

    public abstract MediaFormat a();

    public void b(MediaCodec mediaCodec) {
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public final MediaCodec c() {
        MediaCodec mediaCodec = this.b;
        Objects.requireNonNull(mediaCodec, "doesn't prepare()");
        return mediaCodec;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050 A[Catch:{ Exception -> 0x0063 }] */
    @android.annotation.SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "BaseEncoder"
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 == 0) goto L_0x0081
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r1 == r2) goto L_0x0081
            android.media.MediaCodec r1 = r6.b
            if (r1 != 0) goto L_0x0079
            android.media.MediaFormat r1 = r6.a()
            java.lang.String r2 = "mime"
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r3 = r6.a     // Catch:{ IOException -> 0x0029 }
            if (r3 == 0) goto L_0x0048
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r3)     // Catch:{ IOException -> 0x0029 }
            goto L_0x004c
        L_0x0029:
            r3 = move-exception
            java.lang.String r4 = "Create MediaCodec by name '"
            java.lang.StringBuilder r4 = i0.d.a.a.a.P0(r4)
            java.lang.String r5 = r6.a
            r4.append(r5)
            java.lang.String r5 = "' failure! "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.instabug.library.util.InstabugSDKLogger.w(r0, r3)
        L_0x0048:
            android.media.MediaCodec r2 = android.media.MediaCodec.createEncoderByType(r2)
        L_0x004c:
            i0.j.e.l0.m.l.c$b r3 = r6.c     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x0055
            android.media.MediaCodec$Callback r3 = r6.d     // Catch:{ Exception -> 0x0063 }
            r2.setCallback(r3)     // Catch:{ Exception -> 0x0063 }
        L_0x0055:
            r3 = 1
            r4 = 0
            r2.configure(r1, r4, r4, r3)     // Catch:{ Exception -> 0x0063 }
            r6.b(r2)     // Catch:{ Exception -> 0x0063 }
            r2.start()     // Catch:{ Exception -> 0x0063 }
            r6.b = r2
            return
        L_0x0063:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Configure codec failure!\n  with format"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.instabug.library.util.InstabugSDKLogger.e(r0, r1, r2)
            throw r2
        L_0x0079:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "prepared!"
            r0.<init>(r1)
            throw r0
        L_0x0081:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "should run in a HandlerThread"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.l0.m.l.c.d():void");
    }
}
