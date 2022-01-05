package com.instabug.library.util;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.R;
import com.instabug.library.settings.SettingsManager;
import h0.i.b.a;

public class StatusBarUtils {
    private static int darkenColor(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.8f;
        return Color.HSVToColor(fArr);
    }

    public static void darkenStatusBarColor(Activity activity, int i) {
        int i2;
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            i2 = darkenColor(i);
        } else {
            i2 = darkenColor(a.getColor(activity, R.color.instabug_toolbar_color_dark));
        }
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i2);
        activity.getWindow().getDecorView().setSystemUiVisibility(0);
    }

    public static void setStatusBar(Activity activity) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(SettingsManager.getInstance().getStatusBarColor());
        View decorView = activity.getWindow().getDecorView();
        if (SettingsManager.getInstance().getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            decorView.setSystemUiVisibility(8192);
        } else {
            decorView.setSystemUiVisibility(0);
        }
    }

    public static void setStatusBarColorForPrompt(Activity activity) {
        if (activity != null && activity.getWindow() != null) {
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().clearFlags(67108864);
            activity.getWindow().addFlags(134217728);
            activity.getWindow().clearFlags(67108864);
            activity.getWindow().setStatusBarColor(0);
        }
    }

    public static void setStatusBarForDialog(Activity activity) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(activity.getResources().getColor(17170445));
        View decorView = activity.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
    }

    public static void setTranslucent(Activity activity, boolean z) {
        if (z) {
            activity.getWindow().setFlags(67108864, 67108864);
        } else {
            activity.getWindow().clearFlags(67108864);
        }
    }
}
