package com.instabug.library.util;

import com.instabug.library.InstabugColorTheme;
import com.instabug.library.R;

public class InstabugThemeResolver {
    public static int resolveTheme(InstabugColorTheme instabugColorTheme) {
        if (instabugColorTheme == InstabugColorTheme.InstabugColorThemeLight) {
            return R.style.InstabugSdkTheme_Light;
        }
        return R.style.InstabugSdkTheme_Dark;
    }
}
