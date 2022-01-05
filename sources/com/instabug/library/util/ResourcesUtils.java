package com.instabug.library.util;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class ResourcesUtils {
    public static Drawable getDrawable(int i, Context context) {
        return context.getResources().getDrawable(i, context.getTheme());
    }

    public static Drawable getVectorDrawable(int i, Context context) {
        return context.getResources().getDrawable(i, context.getTheme());
    }
}
