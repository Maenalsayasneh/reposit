package com.instabug.library.internal.video;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import com.instabug.library.Instabug;
import com.instabug.library.core.eventbus.ScreenRecordingEventBus;
import com.instabug.library.internal.InstabugMediaProjectionIntent;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import i0.j.e.m0.d.d;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.File;
import java.util.Objects;
import k0.b.e0.c;
import k0.b.l;
import k0.b.z.e.c.j;

public class InternalScreenRecordHelper implements ScreenRecordingContract, d.h {
    private static InternalScreenRecordHelper INSTANCE;
    /* access modifiers changed from: private */
    public boolean canStopRecording;
    private d fab;
    private ScreenRecordingFileHolder fileHolder;
    private boolean isCurrentlyRecording = false;
    /* access modifiers changed from: private */
    public final c<Boolean> stopSubject = new k0.b.e0.a(Boolean.FALSE);

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (InternalScreenRecordHelper.this.isRecording()) {
                InternalScreenRecordHelper.this.stopSubject.b(Boolean.TRUE);
            }
        }
    }

    public class b implements k0.b.y.d<Boolean> {
        public b() {
        }

        public void b(Object obj) throws Exception {
            boolean unused = InternalScreenRecordHelper.this.canStopRecording = ((Boolean) obj).booleanValue();
        }
    }

    private InternalScreenRecordHelper() {
    }

    public static synchronized InternalScreenRecordHelper getInstance() {
        InternalScreenRecordHelper internalScreenRecordHelper;
        synchronized (InternalScreenRecordHelper.class) {
            if (INSTANCE == null) {
                INSTANCE = new InternalScreenRecordHelper();
            }
            internalScreenRecordHelper = INSTANCE;
        }
        return internalScreenRecordHelper;
    }

    private void resetFab() {
        d dVar = this.fab;
        if (dVar != null) {
            dVar.c();
            this.fab.a();
        }
    }

    public void cancel() {
        if (isRecording()) {
            resetFab();
        }
    }

    public void clear() {
        this.isCurrentlyRecording = false;
        ScreenRecordingFileHolder screenRecordingFileHolder = this.fileHolder;
        if (screenRecordingFileHolder != null) {
            screenRecordingFileHolder.clear();
        }
    }

    public void delete() {
        ScreenRecordingFileHolder screenRecordingFileHolder = this.fileHolder;
        if (screenRecordingFileHolder != null) {
            screenRecordingFileHolder.delete();
        }
    }

    public Uri getAutoScreenRecordingFileUri() {
        ScreenRecordingFileHolder screenRecordingFileHolder = this.fileHolder;
        if (screenRecordingFileHolder == null) {
            return null;
        }
        return screenRecordingFileHolder.getAutoScreenRecordingFileUri();
    }

    public l<Boolean> getIsStoppableObservable() {
        c<Boolean> cVar = this.stopSubject;
        Objects.requireNonNull(cVar);
        l onAssembly = RxJavaPlugins.onAssembly(new j(cVar));
        b bVar = new b();
        k0.b.y.d<Object> dVar = k0.b.z.b.a.d;
        k0.b.y.a aVar = k0.b.z.b.a.c;
        return onAssembly.f(bVar, dVar, aVar, aVar);
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public void init() {
        InvocationManager.getInstance().switchOffInvocation();
        this.fileHolder = ScreenRecordingFileHolder.getInstance();
        if (this.fab == null) {
            this.fab = new d(this);
        }
        this.fab.a();
    }

    public boolean isEnabled() {
        return true;
    }

    public boolean isRecording() {
        return this.isCurrentlyRecording;
    }

    public void onRecordingError() {
        ScreenRecordingEventBus.getInstance().post(new ScreenRecordingEvent(4, (Uri) null));
    }

    public void onRecordingFinished() {
        ScreenRecordingEventBus.getInstance().post(new ScreenRecordingEvent(2, getAutoScreenRecordingFileUri()));
    }

    public void pause() {
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public void release() {
        d dVar = this.fab;
        if (dVar != null) {
            dVar.c();
        }
        InvocationManager.getInstance().switchOnInvocation();
        if (Instabug.getApplicationContext() != null) {
            i0.j.e.c1.b.r(Instabug.getApplicationContext());
        }
        this.stopSubject.b(Boolean.FALSE);
        this.isCurrentlyRecording = false;
    }

    public void setAutoScreenRecordingFile(File file) {
        ScreenRecordingFileHolder screenRecordingFileHolder = this.fileHolder;
        if (screenRecordingFileHolder != null) {
            screenRecordingFileHolder.setAutoScreenRecordingFile(file);
        }
    }

    public void start() {
        this.isCurrentlyRecording = true;
        Activity targetActivity = InstabugInternalTrackingDelegate.getInstance().getTargetActivity();
        if (targetActivity != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                targetActivity.startForegroundService(ScreenRecordingService.a(targetActivity, -1, InstabugMediaProjectionIntent.getMediaProjectionIntent(), true));
            } else {
                targetActivity.startService(ScreenRecordingService.a(targetActivity, -1, InstabugMediaProjectionIntent.getMediaProjectionIntent(), true));
            }
        }
        new Handler().postDelayed(new a(), 1000);
    }

    public void startTimerOnRecordingFAB() {
        d dVar = this.fab;
        if (dVar != null) {
            dVar.p2 = System.currentTimeMillis();
            dVar.o2.removeCallbacks(dVar.u2);
            dVar.o2.postDelayed(dVar.u2, 0);
        }
    }

    public void stop() {
        if (this.canStopRecording) {
            ScreenRecordingEventBus.getInstance().post(new ScreenRecordingEvent(1, getAutoScreenRecordingFileUri()));
            release();
        }
    }
}
