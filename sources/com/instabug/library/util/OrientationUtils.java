package com.instabug.library.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import com.instabug.library.settings.SettingsManager;
import i0.d.a.a.a;
import java.util.HashSet;

public class OrientationUtils {
    public static final String TAG = "OrientationUtils";
    private static HashSet<String> lockedActivities = new HashSet<>();

    private OrientationUtils() {
    }

    private static Activity getActivity(Context context) {
        if (context == null) {
            return null;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static int getOrientation(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            default:
                return -1;
        }
    }

    public static void handelOrientation(Context context) {
        if (SettingsManager.getInstance().getRequestedOrientation() == -2) {
            lockScreenOrientation(context);
            return;
        }
        Activity activity = getActivity(context);
        if (activity != null) {
            activity.setRequestedOrientation(getOrientation(SettingsManager.getInstance().getRequestedOrientation()));
        }
    }

    public static boolean isInLandscape(Context context) {
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }

    public static void lockScreenOrientation(Context context) {
        Activity activity = getActivity(context);
        if (activity != null) {
            StringBuilder P0 = a.P0("Locking orientation for activity ");
            P0.append(activity.toString());
            InstabugSDKLogger.d(TAG, P0.toString());
            int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            int i = activity.getResources().getConfiguration().orientation;
            if (i != 1) {
                if (i == 2) {
                    if (rotation == 0 || rotation == 1) {
                        activity.setRequestedOrientation(0);
                    } else {
                        activity.setRequestedOrientation(8);
                    }
                }
            } else if (rotation == 1 || rotation == 2) {
                activity.setRequestedOrientation(9);
            } else {
                activity.setRequestedOrientation(1);
            }
            lockedActivities.add(activity.getClass().getName());
        }
    }

    public static void unlockOrientation(Context context) {
        Activity activity = getActivity(context);
        if (activity != null && lockedActivities.contains(activity.getClass().getName())) {
            StringBuilder P0 = a.P0("Unlocking orientation for activity ");
            P0.append(activity.toString());
            InstabugSDKLogger.d(TAG, P0.toString());
            try {
                activity.setRequestedOrientation(activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 128).screenOrientation);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                activity.setRequestedOrientation(-1);
            } catch (Exception unused) {
                activity.setRequestedOrientation(-1);
            }
        }
    }
}
