package com.instabug.library.util;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import h0.i.b.a;

public class PermissionsUtils {
    public static final String TAG = "PermissionUtils";

    public static boolean isPermissionGranted(Context context, String str) {
        try {
            boolean z = a.checkSelfPermission(context, str) == 0;
            StringBuilder sb = new StringBuilder();
            sb.append("Permission ");
            sb.append(str);
            sb.append(" state is ");
            sb.append(z ? "" : "NOT ");
            sb.append("granted");
            InstabugSDKLogger.d(TAG, sb.toString());
            return z;
        } catch (Error | Exception unused) {
            return true;
        }
    }

    public static void requestPermission(Activity activity, String str, int i, Runnable runnable, Runnable runnable2) {
        if (!isPermissionGranted(activity, str)) {
            if (!ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
                runIfValid(runnable);
            }
            InstabugSDKLogger.d(TAG, "Permission " + str + " not granted, requesting it");
            ActivityCompat.requestPermissions(activity, new String[]{str}, i);
            return;
        }
        InstabugSDKLogger.d(TAG, "Permission " + str + " already granted, running after permission granted runnable");
        runIfValid(runnable2);
    }

    private static void runIfValid(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void requestPermission(Fragment fragment, String str, int i, Runnable runnable, Runnable runnable2) {
        Context context = fragment.getContext();
        if (context == null) {
            InstabugSDKLogger.w(TAG, "couldn't request permission/s {" + str + "} due to null context reference.");
        } else if (!isPermissionGranted(context, str)) {
            if (!fragment.shouldShowRequestPermissionRationale(str)) {
                runIfValid(runnable);
            }
            InstabugSDKLogger.d(TAG, "Permission " + str + " not granted, requesting it");
            fragment.requestPermissions(new String[]{str}, i);
        } else {
            InstabugSDKLogger.d(TAG, "Permission " + str + " already granted, running after permission granted runnable");
            runIfValid(runnable2);
        }
    }
}
