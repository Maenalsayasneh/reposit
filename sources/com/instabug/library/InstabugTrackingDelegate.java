package com.instabug.library;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.view.MotionEvent;
import android.view.View;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugDeprecationLogger;

@Deprecated
public final class InstabugTrackingDelegate {
    @Deprecated
    public static void notifyActivityGotTouchEvent(MotionEvent motionEvent, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyActivityGotTouchEvent() has been deprecated, you no longer need to use it to let Instabug capture the user steps and interactions with the UI. Starting from SDK V 8.5.0, Instabug can capture those details out of the box.");
    }

    @Deprecated
    public static void notifyApplicationCreated(Application application) {
    }

    @Deprecated
    public static void notifyFragmentAttached(Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentAttached() API has been deprecated, as android.app.Fragment has been deprecated by android framework");
    }

    @Deprecated
    public static void notifyFragmentDetached(Activity activity, Fragment fragment) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentAttached() API has been deprecated, as android.app.Fragment has been deprecated by android framework");
    }

    @Deprecated
    public static void notifyFragmentPaused(Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentAttached() API has been deprecated, as android.app.Fragment has been deprecated by android framework");
    }

    @Deprecated
    public static void notifyFragmentResumed(Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentAttached() API has been deprecated, as android.app.Fragment has been deprecated by android framework");
    }

    @Deprecated
    public static void notifyFragmentStarted(Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentAttached() API has been deprecated, as android.app.Fragment has been deprecated by android framework");
    }

    @Deprecated
    public static void notifyFragmentStopped(Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentAttached() API has been deprecated, as android.app.Fragment has been deprecated by android framework");
    }

    @Deprecated
    public static void notifyFragmentViewCreated(View view, Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentAttached() API has been deprecated, as android.app.Fragment has been deprecated by android framework");
    }

    @Deprecated
    public static void notifyFragmentVisibilityChanged(boolean z, Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentAttached() API has been deprecated, as android.app.Fragment has been deprecated by android framework");
    }

    @Deprecated
    public static void notifyFragmentAttached(androidx.fragment.app.Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentAttached() API has been deprecated, you no longer need to use it to let Instabug capture the user steps and interactions with the UI. Starting from SDK V 8.5.0, Instabug can capture those details out of the box.");
    }

    @Deprecated
    public static void notifyFragmentDetached(androidx.fragment.app.Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentDetached() API has been deprecated, you no longer need to use it to let Instabug capture the user steps and interactions with the UI. Starting from SDK V 8.5.0, Instabug can capture those details out of the box.");
    }

    @Deprecated
    public static void notifyFragmentPaused(androidx.fragment.app.Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentPaused() API has been deprecated, you no longer need to use it to let Instabug capture the user steps and interactions with the UI. Starting from SDK V 8.5.0, Instabug can capture those details out of the box.");
    }

    @Deprecated
    public static void notifyFragmentResumed(androidx.fragment.app.Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentResumed() API has been deprecated, you no longer need to use it to let Instabug capture the user steps and interactions with the UI. Starting from SDK V 8.5.0, Instabug can capture those details out of the box.");
    }

    @Deprecated
    public static void notifyFragmentStarted(androidx.fragment.app.Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentStarted() API has been deprecated, you no longer need to use it to let Instabug capture the user steps and interactions with the UI. Starting from SDK V 8.5.0, Instabug can capture those details out of the box.");
    }

    @Deprecated
    public static void notifyFragmentStopped(androidx.fragment.app.Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentStopped() API has been deprecated, you no longer need to use it to let Instabug capture the user steps and interactions with the UI. Starting from SDK V 8.5.0, Instabug can capture those details out of the box.");
    }

    @Deprecated
    public static void notifyFragmentViewCreated(View view, androidx.fragment.app.Fragment fragment, Activity activity) {
        InstabugDeprecationLogger.getInstance().log("InstabugTrackingDelegate.notifyFragmentViewCreated() API has been deprecated, you no longer need to use it to let Instabug capture the user steps and interactions with the UI. Starting from SDK V 8.5.0, Instabug can capture those details out of the box.");
    }

    @Deprecated
    public static void notifyFragmentVisibilityChanged(boolean z, androidx.fragment.app.Fragment fragment, Activity activity) {
        InstabugInternalTrackingDelegate.getInstance().onFragmentVisibilityChanged(z, fragment);
    }

    public static void notifyFragmentVisibilityChanged(boolean z, androidx.fragment.app.Fragment fragment) {
        InstabugInternalTrackingDelegate.getInstance().onFragmentVisibilityChanged(z, fragment);
    }
}
