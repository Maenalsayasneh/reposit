package i0.j.e.m0.d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.MediaStore;
import com.instabug.library.Instabug;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.invocation.InstabugInvocationEvent;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.PermissionsUtils;
import i0.j.e.m0.a;

/* compiled from: ScreenshotGestureInvoker */
public class i implements a<Void> {
    public volatile boolean Y1;
    public ContentResolver c;
    public j d;
    public HandlerThread q;
    public Handler x;
    public boolean y = true;

    @SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED", "ERADICATE_PARAMETER_NOT_NULLABLE"})
    public i(a aVar) {
        if (Instabug.getApplicationContext() != null) {
            this.c = Instabug.getApplicationContext().getContentResolver();
            HandlerThread handlerThread = new HandlerThread("ScreenshotObserver");
            this.q = handlerThread;
            handlerThread.start();
            this.x = new Handler(this.q.getLooper());
            this.d = new j(this.x, this.c, aVar);
            SessionStateEventBus.getInstance().subscribe(new h(this));
        }
    }

    public void a() {
        ContentResolver contentResolver;
        if (this.y && !d()) {
            for (InstabugInvocationEvent instabugInvocationEvent : InvocationManager.getInstance().getCurrentInstabugInvocationEvents()) {
                if (instabugInvocationEvent == InstabugInvocationEvent.SCREENSHOT) {
                    Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
                    if (currentActivity != null) {
                        PermissionsUtils.requestPermission(currentActivity, "android.permission.READ_EXTERNAL_STORAGE", 1, (Runnable) null, (Runnable) null);
                        this.y = false;
                        return;
                    }
                    return;
                }
            }
        } else if (d() && (contentResolver = this.c) != null) {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.d);
            this.Y1 = true;
        }
    }

    public boolean b() {
        return this.Y1;
    }

    public void c() {
        ContentResolver contentResolver = this.c;
        if (contentResolver != null) {
            contentResolver.unregisterContentObserver(this.d);
            this.Y1 = false;
        }
    }

    public final boolean d() {
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        return currentActivity != null && PermissionsUtils.isPermissionGranted(currentActivity, "android.permission.READ_EXTERNAL_STORAGE");
    }
}
