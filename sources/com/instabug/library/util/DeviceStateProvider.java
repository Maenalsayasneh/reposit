package com.instabug.library.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.stripe.android.model.PaymentMethod;
import g0.a.b.b.a;
import i0.j.e.a1.e;
import i0.j.e.i0;

public class DeviceStateProvider {
    private static final String NONE_SSID = "<unknown ssid>";

    private static long calculateTotalMemory(Context context) {
        return calculateTotalMemoryApi16(context);
    }

    @TargetApi(16)
    private static long calculateTotalMemoryApi16(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC, Splitter:B:18:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC, Splitter:B:25:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long calculateTotalMemoryPreApi16() {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0041, all -> 0x003f }
            java.lang.String r2 = "/proc/meminfo"
            java.lang.String r3 = "r"
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0041, all -> 0x003f }
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x003d }
            java.lang.String r2 = ":"
            java.lang.String[] r0 = r0.split(r2)     // Catch:{ IOException -> 0x003d }
            r2 = 1
            r0 = r0[r2]     // Catch:{ IOException -> 0x003d }
            java.lang.String r0 = r0.trim()     // Catch:{ IOException -> 0x003d }
            r2 = 0
            int r3 = r0.length()     // Catch:{ IOException -> 0x003d }
            int r3 = r3 + -3
            java.lang.String r0 = r0.substring(r2, r3)     // Catch:{ IOException -> 0x003d }
            java.lang.String r0 = r0.trim()     // Catch:{ IOException -> 0x003d }
            r1.close()     // Catch:{ IOException -> 0x003d }
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ IOException -> 0x003d }
            r4 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r4
            r1.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            r0.printStackTrace()
        L_0x003c:
            return r2
        L_0x003d:
            r0 = move-exception
            goto L_0x0045
        L_0x003f:
            r1 = move-exception
            goto L_0x0059
        L_0x0041:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x0045:
            r0.printStackTrace()     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0052:
            r0 = 0
            return r0
        L_0x0055:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x0059:
            if (r0 == 0) goto L_0x0063
            r0.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0063:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.util.DeviceStateProvider.calculateTotalMemoryPreApi16():long");
    }

    private static boolean externalMemoryAvailable() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e) {
            InstabugSDKLogger.e(DeviceStateProvider.class, e.getMessage(), e);
            return false;
        }
    }

    public static long getActiveSessionDuration() {
        i0 d = i0.d();
        if (d.b.getSessionStartedAt() == 0) {
            return 0;
        }
        return (System.currentTimeMillis() / 1000) - d.b.getSessionStartedAt();
    }

    public static String getAppPackageName(Context context) {
        return InstabugDeviceProperties.getPackageName(context);
    }

    public static String getAppVersion(Context context) {
        return InstabugDeviceProperties.getAppVersion(context);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static int getBatteryLevel(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                return (int) ((((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1))) * 100.0f);
            }
            InstabugSDKLogger.w("DeviceStateProvider", "Could't obtain battery level");
            return -1;
        } catch (Exception e) {
            InstabugSDKLogger.e("DeviceStateProvider", "Got error while get battery level", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b A[Catch:{ Exception -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[Catch:{ Exception -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[Catch:{ Exception -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[Catch:{ Exception -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getBatteryState(android.content.Context r7) {
        /*
            java.lang.String r0 = "DeviceStateProvider"
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ Exception -> 0x005a }
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)     // Catch:{ Exception -> 0x005a }
            r2 = 0
            android.content.Intent r7 = r7.registerReceiver(r2, r1)     // Catch:{ Exception -> 0x005a }
            if (r7 == 0) goto L_0x0054
            java.lang.String r1 = "status"
            r2 = -1
            int r1 = r7.getIntExtra(r1, r2)     // Catch:{ Exception -> 0x005a }
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == r3) goto L_0x0022
            r6 = 5
            if (r1 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r1 = r4
            goto L_0x0023
        L_0x0022:
            r1 = r5
        L_0x0023:
            java.lang.String r6 = "plugged"
            int r7 = r7.getIntExtra(r6, r2)     // Catch:{ Exception -> 0x005a }
            if (r7 != r3) goto L_0x002d
            r2 = r5
            goto L_0x002e
        L_0x002d:
            r2 = r4
        L_0x002e:
            if (r7 != r5) goto L_0x0031
            r4 = r5
        L_0x0031:
            if (r1 == 0) goto L_0x0051
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a }
            r7.<init>()     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = "Charging"
            r7.append(r1)     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x0042
            java.lang.String r1 = " through AC Charger"
            goto L_0x0049
        L_0x0042:
            if (r2 == 0) goto L_0x0047
            java.lang.String r1 = " through USB cable"
            goto L_0x0049
        L_0x0047:
            java.lang.String r1 = ""
        L_0x0049:
            r7.append(r1)     // Catch:{ Exception -> 0x005a }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x005a }
            goto L_0x0053
        L_0x0051:
            java.lang.String r7 = "Unplugged"
        L_0x0053:
            return r7
        L_0x0054:
            java.lang.String r7 = "Could't obtain battery state"
            com.instabug.library.util.InstabugSDKLogger.w(r0, r7)     // Catch:{ Exception -> 0x005a }
            goto L_0x0060
        L_0x005a:
            r7 = move-exception
            java.lang.String r1 = "Got error while get battery state"
            com.instabug.library.util.InstabugSDKLogger.e(r0, r1, r7)
        L_0x0060:
            java.lang.String r7 = "Unknown"
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.util.DeviceStateProvider.getBatteryState(android.content.Context):java.lang.String");
    }

    public static String getCarrier(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE)).getNetworkOperatorName();
        } catch (Exception e) {
            InstabugSDKLogger.e("DeviceStateProvider", "Got error while get Carrier", e);
            return "Unknown";
        }
    }

    public static String getCurrentView() {
        return e.c().c;
    }

    public static String getDevice() {
        return InstabugDeviceProperties.getDeviceType();
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static long getFreeMemory(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1048576;
    }

    public static long getFreeStorage() {
        if (externalMemoryAvailable()) {
            return Environment.getExternalStorageDirectory().getUsableSpace() / 1048576;
        }
        InstabugSDKLogger.e("DeviceStateProvider", "Got error while calculate free storage");
        return -1;
    }

    public static String getLocale(Context context) {
        if (a.L(context.getResources().getConfiguration()).a.size() > 0) {
            return a.L(context.getResources().getConfiguration()).b(0).getLanguage();
        }
        return context.getResources().getConfiguration().locale.toString();
    }

    public static String getOS() {
        StringBuilder P0 = i0.d.a.a.a.P0("OS Level ");
        P0.append(Build.VERSION.SDK_INT);
        return P0.toString();
    }

    public static String getScreenDensity(Context context) {
        int i = getDisplayMetrics(context).densityDpi;
        if (i < 160) {
            return "ldpi";
        }
        if (i < 240) {
            return "mdpi";
        }
        if (i < 320) {
            return "hdpi";
        }
        if (i < 480) {
            return "xhdpi";
        }
        return i < 640 ? "xxhdpi" : "xxxhdpi";
    }

    public static String getScreenOrientation(Context context) {
        return context.getResources().getConfiguration().orientation == 2 ? "landscape" : "portrait";
    }

    public static String getScreenSize(Context context) {
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        return String.format("%sx%s", new Object[]{Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels)});
    }

    public static String getSdkVersion() {
        return "10.4.3";
    }

    public static long getTotalMemory(Context context) {
        long calculateTotalMemory = calculateTotalMemory(context);
        if (calculateTotalMemory != 0) {
            return calculateTotalMemory / 1048576;
        }
        InstabugSDKLogger.e("DeviceStateProvider", "Got error while calculate total memory");
        return -1;
    }

    public static long getTotalStorage() {
        if (externalMemoryAvailable()) {
            return (long) ((int) (Environment.getExternalStorageDirectory().getTotalSpace() / 1048576));
        }
        InstabugSDKLogger.e("DeviceStateProvider", "Got error while calculate total storage");
        return -1;
    }

    public static long getUsedMemory(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return (calculateTotalMemory(context) - memoryInfo.availMem) / 1048576;
    }

    public static long getUsedStorage() {
        if (externalMemoryAvailable()) {
            return (Environment.getExternalStorageDirectory().getTotalSpace() - Environment.getExternalStorageDirectory().getFreeSpace()) / 1048576;
        }
        InstabugSDKLogger.e("DeviceStateProvider", "Got error while calculate used storage");
        return -1;
    }

    public static String getWifiSSID(Context context) {
        if (!getWifiState(context)) {
            return "Not Connected";
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            return connectionInfo.getSSID().equalsIgnoreCase(NONE_SSID) ? "" : connectionInfo.getSSID();
        } catch (SecurityException unused) {
            InstabugSDKLogger.e("DeviceStateProvider", "Could not read wifi SSID. To enable please add the following line in your AndroidManifest.xml <uses-permission android:name=\"android.permission.ACCESS_WIFI_STATE\"/>");
            return "Connected";
        }
    }

    public static boolean getWifiState(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1).isConnected();
        } catch (Exception e) {
            InstabugSDKLogger.e("DeviceStateProvider", "Got error while get wifi state", e);
            return false;
        }
    }

    public static boolean isDeviceRooted() {
        try {
            return i0.j.e.l0.f.a.a();
        } catch (Exception e) {
            StringBuilder P0 = i0.d.a.a.a.P0("Something went wrong while checking if device is rooted or not ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e("DeviceStateProvider", P0.toString());
            return false;
        }
    }
}
