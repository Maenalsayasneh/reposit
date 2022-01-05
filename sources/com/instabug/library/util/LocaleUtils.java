package com.instabug.library.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.instabug.library.Instabug;
import i0.j.e.d1.e;
import java.util.Locale;

public class LocaleUtils {
    public static String getCurrentLocaleResolved(Context context) {
        return new e(context).a(Instabug.getLocale(context));
    }

    public static String getLocaleStringResource(Locale locale, int i, Context context) {
        String localizedStringResNewAPI = getLocalizedStringResNewAPI(context, i, locale);
        return localizedStringResNewAPI == null ? getLocalizedStringResOldAPI(context, i, locale) : localizedStringResNewAPI;
    }

    @TargetApi(17)
    private static String getLocalizedStringResNewAPI(Context context, int i, Locale locale) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        if (createConfigurationContext == null) {
            return null;
        }
        return createConfigurationContext.getText(i).toString();
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    private static String getLocalizedStringResOldAPI(Context context, int i, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        Locale locale2 = configuration.locale;
        configuration.locale = locale;
        resources.updateConfiguration(configuration, (DisplayMetrics) null);
        String string = resources.getString(i);
        configuration.locale = locale2;
        resources.updateConfiguration(configuration, (DisplayMetrics) null);
        return string;
    }

    public static boolean isRTL(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale) == 1;
    }

    public static boolean isSupportedBySdk(Context context, Locale locale) {
        if (context == null || locale == null) {
            return false;
        }
        return new e(context).c(locale.getLanguage());
    }

    public static String resolveLocale(Context context, Locale locale) {
        return new e(context).a(locale);
    }

    public static void setLocale(Activity activity, Locale locale) {
        Configuration configuration = activity.getApplicationContext().getResources().getConfiguration();
        if (locale != null) {
            configuration.setLocales(new LocaleList(new Locale[]{locale}));
            updateResources(activity, locale);
        }
        activity.getResources().updateConfiguration(configuration, activity.getResources().getDisplayMetrics());
    }

    @TargetApi(24)
    private static Context updateResources(Context context, Locale locale) {
        Locale.setDefault(locale);
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        configuration.setLayoutDirection(locale);
        return context.createConfigurationContext(configuration);
    }
}
