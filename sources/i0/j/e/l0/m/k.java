package i0.j.e.l0.m;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.instabug.library.Feature;
import com.instabug.library.internal.storage.AttachmentManager;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.internal.video.ScreenRecordingService;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.c1.b;
import i0.j.e.l0.m.l.i;
import i0.j.e.l0.m.l.j;
import java.io.File;
import java.util.Objects;

@TargetApi(21)
/* compiled from: ScreenRecordingSession */
public final class k {
    public final Context a;
    public final a b;
    public final File c;
    public Feature.State d = SettingsManager.getInstance().getAutoScreenRecordingAudioCapturingState();
    public String e;
    public boolean f;
    public boolean g = InternalScreenRecordHelper.getInstance().isRecording();
    public MediaProjection h;
    public i i;

    /* compiled from: ScreenRecordingSession */
    public interface a {
    }

    public k(Context context, a aVar, int i2, Intent intent) {
        this.a = context;
        this.b = aVar;
        if (this.g) {
            this.c = AttachmentsUtility.getVideoRecordingFramesDirectory(context);
            this.e = AttachmentsUtility.getVideoFile(context).getAbsolutePath();
        } else {
            this.c = AttachmentManager.getAutoScreenRecordingVideosDirectory(context);
            this.e = AttachmentManager.getAutoScreenRecordingFile(context).getAbsolutePath();
        }
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
        if (mediaProjectionManager != null) {
            this.h = mediaProjectionManager.getMediaProjection(i2, intent);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        int[] iArr = {displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.densityDpi};
        j jVar = new j(iArr[0], iArr[1], iArr[2]);
        i0.j.e.l0.m.l.a aVar2 = null;
        if (this.g || this.d == Feature.State.ENABLED) {
            this.i = new i(jVar, b.o() ? new i0.j.e.l0.m.l.a() : aVar2, this.h, this.e);
        } else {
            this.i = new i(jVar, (i0.j.e.l0.m.l.a) null, this.h, this.e);
        }
        if (this.c.exists() || this.c.mkdirs()) {
            i iVar = this.i;
            if (iVar != null) {
                synchronized (iVar) {
                    if (iVar.r == null) {
                        HandlerThread handlerThread = new HandlerThread("ScreenRecorder");
                        iVar.r = handlerThread;
                        handlerThread.start();
                        i.e eVar = new i.e(iVar.r.getLooper());
                        iVar.s = eVar;
                        eVar.sendEmptyMessage(0);
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            synchronized (this) {
                this.f = true;
            }
            Objects.requireNonNull((ScreenRecordingService.a) aVar);
            if (this.g) {
                InternalScreenRecordHelper.getInstance().startTimerOnRecordingFAB();
            }
            if (this.d == Feature.State.DISABLED) {
                b.p(context);
            } else {
                b.r(context);
            }
            InstabugSDKLogger.i("ScreenRecordingSession", "Screen recording started");
            return;
        }
        InstabugSDKLogger.d("ScreenRecordingSession", "Unable to create output directory. Cannot record screen.");
    }

    public synchronized void a(i.d dVar) {
        if (this.f) {
            c(dVar);
        } else {
            if (ScreenRecordingService.this.Y1) {
                InternalScreenRecordHelper.getInstance().onRecordingError();
            }
            ScreenRecordingService.this.stopSelf();
        }
    }

    public synchronized void b() {
        File file = new File(this.e);
        InstabugSDKLogger.d("ScreenRecordingSession", "Recorded video file size: " + (file.length() / 1024) + " KB");
        if (this.g) {
            InternalScreenRecordHelper.getInstance().setAutoScreenRecordingFile(file);
            InternalScreenRecordHelper.getInstance().onRecordingFinished();
        } else {
            InternalAutoScreenRecorderHelper.getInstance().setAutoScreenRecordingFile(file);
        }
        ScreenRecordingService.this.stopSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0031, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0038, code lost:
        if (r2.getMessage() != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        com.instabug.library.util.InstabugSDKLogger.e("ScreenRecordingSession", r2.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0043, code lost:
        r2 = r1.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0045, code lost:
        if (r2 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0047, code lost:
        r2.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r2 = r1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        java.util.Objects.requireNonNull((com.instabug.library.internal.video.ScreenRecordingService.a) r1.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0059, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(i0.j.e.l0.m.l.i.d r2) {
        /*
            r1 = this;
            boolean r0 = r1.f
            if (r0 != 0) goto L_0x000c
            java.lang.String r2 = "ScreenRecordingSession"
            java.lang.String r0 = "Recorder is not running"
            com.instabug.library.util.InstabugSDKLogger.e(r2, r0)
            return
        L_0x000c:
            r0 = 0
            monitor-enter(r1)
            r1.f = r0     // Catch:{ all -> 0x005a }
            monitor-exit(r1)
            android.media.projection.MediaProjection r0 = r1.h     // Catch:{ RuntimeException -> 0x0033 }
            if (r0 == 0) goto L_0x0018
            r0.stop()     // Catch:{ RuntimeException -> 0x0033 }
        L_0x0018:
            i0.j.e.l0.m.l.i r0 = r1.i     // Catch:{ RuntimeException -> 0x0033 }
            if (r0 == 0) goto L_0x0024
            monitor-enter(r0)     // Catch:{ RuntimeException -> 0x0033 }
            r0.t = r2     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ RuntimeException -> 0x0033 }
            goto L_0x0024
        L_0x0021:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ RuntimeException -> 0x0033 }
            throw r2     // Catch:{ RuntimeException -> 0x0033 }
        L_0x0024:
            i0.j.e.l0.m.l.i r2 = r1.i     // Catch:{ RuntimeException -> 0x0033 }
            if (r2 == 0) goto L_0x002b
            r2.a()     // Catch:{ RuntimeException -> 0x0033 }
        L_0x002b:
            r2 = 0
            r1.i = r2     // Catch:{ RuntimeException -> 0x0033 }
            i0.j.e.l0.m.k$a r2 = r1.b     // Catch:{ RuntimeException -> 0x0051 }
            goto L_0x004c
        L_0x0031:
            r2 = move-exception
            goto L_0x0052
        L_0x0033:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "ScreenRecordingSession"
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0031 }
            com.instabug.library.util.InstabugSDKLogger.e(r0, r2)     // Catch:{ all -> 0x0031 }
        L_0x0043:
            i0.j.e.l0.m.l.i r2 = r1.i     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x004a
            r2.a()     // Catch:{ all -> 0x0031 }
        L_0x004a:
            i0.j.e.l0.m.k$a r2 = r1.b     // Catch:{ RuntimeException -> 0x0051 }
        L_0x004c:
            com.instabug.library.internal.video.ScreenRecordingService$a r2 = (com.instabug.library.internal.video.ScreenRecordingService.a) r2     // Catch:{ RuntimeException -> 0x0051 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ RuntimeException -> 0x0051 }
        L_0x0051:
            return
        L_0x0052:
            i0.j.e.l0.m.k$a r0 = r1.b     // Catch:{ RuntimeException -> 0x0059 }
            com.instabug.library.internal.video.ScreenRecordingService$a r0 = (com.instabug.library.internal.video.ScreenRecordingService.a) r0     // Catch:{ RuntimeException -> 0x0059 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ RuntimeException -> 0x0059 }
        L_0x0059:
            throw r2
        L_0x005a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.l0.m.k.c(i0.j.e.l0.m.l.i$d):void");
    }
}
