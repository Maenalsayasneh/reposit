package com.instabug.library.internal.video;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.widget.Toast;
import com.instabug.library.R;
import com.instabug.library.core.eventbus.AutoScreenRecordingEventBus;
import com.instabug.library.core.eventbus.InstabugStateEventBus;
import com.instabug.library.core.eventbus.ScreenRecordingEventBus;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.j.e.l0.m.e;
import i0.j.e.l0.m.g;
import i0.j.e.l0.m.k;
import i0.j.e.l0.m.l.i;

public class ScreenRecordingService extends Service implements ComponentCallbacks2 {
    public static final /* synthetic */ int c = 0;
    public boolean Y1;
    public k0.b.w.a Z1;
    public k0.b.w.a a2;
    public k0.b.w.a d;
    public k0.b.w.a q;
    public final k.a x = new a();
    public k y;

    public enum Action {
        STOP_DELETE,
        STOP_KEEP,
        STOP_TRIM_KEEP
    }

    public class a implements k.a {
        public a() {
        }
    }

    public class b implements i.d {
        public b() {
        }

        public void a(long j) {
        }

        public void b(Throwable th) {
            k kVar = ScreenRecordingService.this.y;
            if (kVar != null) {
                PoolProvider.postIOTask(new i0.j.e.l0.m.i(kVar));
            }
            ScreenRecordingService.this.stopSelf();
        }

        public void onStart() {
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
        static {
            /*
                com.instabug.library.internal.video.ScreenRecordingService.Action.values()
                r0 = 3
                int[] r1 = new int[r0]
                a = r1
                com.instabug.library.internal.video.ScreenRecordingService$Action r2 = com.instabug.library.internal.video.ScreenRecordingService.Action.STOP_DELETE     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.library.internal.video.ScreenRecordingService$Action r2 = com.instabug.library.internal.video.ScreenRecordingService.Action.STOP_KEEP     // Catch:{ NoSuchFieldError -> 0x001c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r3 = 2
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0026 }
                com.instabug.library.internal.video.ScreenRecordingService$Action r2 = com.instabug.library.internal.video.ScreenRecordingService.Action.STOP_TRIM_KEEP     // Catch:{ NoSuchFieldError -> 0x0026 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0026 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.video.ScreenRecordingService.c.<clinit>():void");
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static Intent a(Context context, int i, Intent intent, boolean z) {
        Intent intent2 = new Intent(context, ScreenRecordingService.class);
        intent2.putExtra("result-code", i);
        intent2.putExtra("is.manual.screen.recording", z);
        intent2.putExtra(MessageExtension.FIELD_DATA, intent);
        return intent2;
    }

    public final void b() {
        if (SettingsManager.getInstance().isScreenCurrentlyRecorded()) {
            SettingsManager.getInstance().setScreenCurrentlyRecorded(false);
            InternalScreenRecordHelper.getInstance().cancel();
            k kVar = this.y;
            if (kVar != null) {
                kVar.a(new b());
            }
        }
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void onCreate() {
        super.onCreate();
        k0.b.w.a aVar = this.d;
        if (aVar == null || aVar.isDisposed()) {
            this.d = SessionStateEventBus.getInstance().subscribe(new i0.j.e.l0.m.b(this));
        }
        this.q = InstabugStateEventBus.getInstance().subscribe(new i0.j.e.l0.m.c());
        if (Build.VERSION.SDK_INT >= 29) {
            i0.j.e.c1.b.h(this, R.string.ibg_screen_recording_notification_title, 8743);
        }
    }

    public void onDestroy() {
        if (SettingsManager.getInstance().isScreenCurrentlyRecorded()) {
            SettingsManager.getInstance().setScreenCurrentlyRecorded(false);
        }
        super.onDestroy();
        k0.b.w.a aVar = this.Z1;
        if (aVar != null && !aVar.isDisposed()) {
            this.Z1.dispose();
        }
        k0.b.w.a aVar2 = this.a2;
        if (aVar2 != null && !aVar2.isDisposed()) {
            this.a2.dispose();
        }
        if (!this.d.isDisposed()) {
            this.d.dispose();
        }
        k0.b.w.a aVar3 = this.q;
        if (aVar3 != null && !aVar3.isDisposed()) {
            this.q.dispose();
        }
        NotificationManager notificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(8743);
        }
    }

    @SuppressLint({"STRICT_MODE_VIOLATION"})
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            stopSelf();
        } else {
            int intExtra = intent.getIntExtra("result-code", 0);
            Intent intent2 = (Intent) intent.getParcelableExtra(MessageExtension.FIELD_DATA);
            if (intExtra == 0 || intent2 == null) {
                InstabugSDKLogger.w("ScreenRecordingService", "Can't start service. Result code: " + intExtra + ", Data: " + intent2);
                Toast.makeText(this, R.string.feature_requests_error_state_title, 0).show();
                ScreenRecordingEventBus.getInstance().post(new ScreenRecordingEvent(4, (Uri) null));
                stopSelf();
            }
            boolean booleanExtra = intent.getBooleanExtra("is.manual.screen.recording", true);
            this.Y1 = booleanExtra;
            if (booleanExtra) {
                k0.b.w.a aVar = this.Z1;
                if (aVar == null || aVar.isDisposed()) {
                    this.Z1 = ScreenRecordingEventBus.getInstance().subscribe(new e(this));
                }
            } else {
                k0.b.w.a aVar2 = this.a2;
                if (aVar2 == null || aVar2.isDisposed()) {
                    this.a2 = AutoScreenRecordingEventBus.getInstance().subscribe(new g(this));
                }
            }
            if (!SettingsManager.getInstance().isScreenCurrentlyRecorded()) {
                this.y = new k(this, this.x, intExtra, intent2);
                SettingsManager.getInstance().setScreenCurrentlyRecorded(true);
            } else {
                stopSelf();
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i == 20 && this.Y1) {
            b();
        }
    }
}
