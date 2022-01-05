package com.instabug.library.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

public class InstabugAppData {
    private ApplicationInfo applicationInfo;
    private final Context context;
    private final PackageManager pm;

    public InstabugAppData(Context context2) {
        this.context = context2;
        PackageManager packageManager = context2.getPackageManager();
        this.pm = packageManager;
        try {
            this.applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            InstabugSDKLogger.e("InstabugAppData", e.getMessage(), e);
        }
    }

    public int getAppIcon() {
        ApplicationInfo applicationInfo2 = this.applicationInfo;
        if (applicationInfo2 == null) {
            return 0;
        }
        return applicationInfo2.icon;
    }

    public String getAppName() {
        ApplicationInfo applicationInfo2 = this.applicationInfo;
        return (String) (applicationInfo2 != null ? this.pm.getApplicationLabel(applicationInfo2) : "(unknown)");
    }
}
