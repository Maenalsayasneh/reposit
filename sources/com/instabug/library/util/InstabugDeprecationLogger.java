package com.instabug.library.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.instabug.library.Instabug;
import i0.d.a.a.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class InstabugDeprecationLogger {
    private static InstabugDeprecationLogger INSTANCE = null;
    private static final String PREFIX_SECTION = "#section-";
    public static String baseUrl = "https://docs.instabug.com/docs/android-sdk-8-6-migration-guide";

    @Retention(RetentionPolicy.SOURCE)
    public @interface MigrationSection {
        public static final int METHOD_SET_CHATS_STATE = 19;
        public static final int METHOD_SHOW_CHATS = 18;
    }

    private InstabugDeprecationLogger() {
    }

    public static InstabugDeprecationLogger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InstabugDeprecationLogger();
        }
        return INSTANCE;
    }

    private String getSection(int i) {
        return i != 18 ? i != 19 ? "" : "setstate" : "show";
    }

    private static void setBaseUrl(String str) {
        if (str != null && str.trim().length() > 0) {
            baseUrl = str;
        }
    }

    @SuppressLint({"ERADICATE_FIELD_NOT_NULLABLE"})
    public static void tearDown() {
        INSTANCE = null;
    }

    public String getMigrationPageUrl() {
        return baseUrl;
    }

    public void log(int i) {
        Context applicationContext;
        if (Instabug.isBuilt() && Instabug.isEnabled() && (applicationContext = Instabug.getApplicationContext()) != null) {
            if (!((applicationContext.getApplicationInfo().flags & 2) != 0)) {
                return;
            }
            if (i == 19 || i == 18) {
                StringBuilder P0 = a.P0("\n\nIn this release, we’re improving the in-app communication experience. Now, your end user will have a unified experience while sending you a report independently from its type. Whether it is a bug, improvement, or question, they’ll see the same experience.\n\nThe Chats class and its methods have been deprecated, and while they still function, they will be completely removed in a future release. For more details about this API’s replacement, check the docs here: ");
                P0.append(getMigrationPageUrl(i));
                P0.append(".\n\nIf you have any questions please reach out to us through contactus@instabug.com.");
                Log.i("INSTABUG", P0.toString());
            }
        }
    }

    public String getMigrationPageUrl(int i) {
        return baseUrl + PREFIX_SECTION + getSection(i);
    }

    public void log(String str) {
        Context applicationContext;
        if (Instabug.isBuilt() && Instabug.isEnabled() && (applicationContext = Instabug.getApplicationContext()) != null) {
            if ((applicationContext.getApplicationInfo().flags & 2) != 0) {
                Log.i("INSTABUG", str);
            }
        }
    }
}
