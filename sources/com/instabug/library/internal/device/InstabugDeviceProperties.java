package com.instabug.library.internal.device;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import com.instabug.library.Instabug;
import com.instabug.library.internal.utils.stability.execution.ReturnableExecutable;
import com.instabug.library.internal.utils.stability.handler.exception.ExceptionHandler;
import com.instabug.library.util.InstabugSDKLogger;

public class InstabugDeviceProperties {
    public static final String TAG = "InstabugDeviceProperties";

    public static class a implements ReturnableExecutable<Integer> {
        public Object execute() throws Exception {
            Context applicationContext = Instabug.getApplicationContext();
            if (applicationContext != null) {
                return Integer.valueOf(applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionCode);
            }
            return -1;
        }
    }

    public static boolean checkRingerIsOn(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null || audioManager.getRingerMode() == 2) {
            return true;
        }
        return false;
    }

    public static String getAppVersion(Context context) {
        PackageInfo packageInfo = new PackageInfo();
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            InstabugSDKLogger.e(TAG, "failed to get app version", e);
        }
        return String.format("%s (%s)", new Object[]{packageInfo.versionName, Integer.valueOf(packageInfo.versionCode)});
    }

    public static String getAppVersionName(Context context) {
        PackageInfo packageInfo = new PackageInfo();
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            InstabugSDKLogger.e(TAG, "failed to get app version", e);
        }
        return packageInfo.versionName;
    }

    public static int getCurrentOSLevel() {
        return Build.VERSION.SDK_INT;
    }

    public static String getDeviceType() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static String getPackageName(Context context) {
        try {
            return context.getApplicationInfo().packageName;
        } catch (Exception e) {
            InstabugSDKLogger.e(TAG, "failed to get package name", e);
            return "Could not get information";
        }
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public static Integer getVersionCode() {
        return (Integer) new ExceptionHandler().withPenaltyLog(TAG).executeAndGet(new a(), -1);
    }

    public static boolean isFirstInstall(Context context) {
        try {
            if (context.getPackageManager().getPackageInfo(getPackageName(context), 0).firstInstallTime == context.getPackageManager().getPackageInfo(getPackageName(context), 0).lastUpdateTime) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return true;
        }
    }

    public static boolean isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }
}
