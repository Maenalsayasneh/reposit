package com.clubhouse.android.shared.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.e.b.f3.k.a;
import i0.j.f.p.h;
import kotlin.text.StringsKt__IndentKt;
import m0.c;
import m0.n.b.i;

/* compiled from: DeviceSharedPreferences.kt */
public final class DeviceSharedPreferences extends a {
    public final String b;
    public final String c;
    public final String d;
    public final c e;
    public final String f;
    public final String g;
    public String h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceSharedPreferences(SharedPreferences sharedPreferences, Context context) {
        super(sharedPreferences);
        String str;
        InputMethodSubtype lastInputMethodSubtype;
        String str2;
        InputMethodSubtype currentInputMethodSubtype;
        i.e(sharedPreferences, "sharedPreferences");
        i.e(context, "context");
        String locale = context.getResources().getConfiguration().locale.toString();
        i.d(locale, "context.resources.configuration.locale.toString()");
        this.b = locale;
        i.e(context, "<this>");
        h0.i.e.c c2 = h0.i.e.c.c(context.getResources().getConfiguration().getLocales());
        i.d(c2, "{\n            LocaleListCompat.wrap(resources.configuration.locales)\n        }");
        String a = c2.a.a();
        i.d(a, "context.locales().toLanguageTags()");
        this.c = a;
        i.e(context, "<this>");
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        String str3 = "";
        if (inputMethodManager == null || (currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype()) == null) {
            str = str3;
        } else {
            String languageTag = currentInputMethodSubtype.getLanguageTag();
            i.d(languageTag, "languageTag");
            if (!StringsKt__IndentKt.o(languageTag)) {
                str = currentInputMethodSubtype.getLanguageTag();
            } else {
                str = currentInputMethodSubtype.getLocale();
            }
            i.d(str, "if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N && languageTag.isNotBlank()) {\n            languageTag\n        } else {\n            locale\n        }");
        }
        if (!(inputMethodManager == null || (lastInputMethodSubtype = inputMethodManager.getLastInputMethodSubtype()) == null)) {
            String languageTag2 = lastInputMethodSubtype.getLanguageTag();
            i.d(languageTag2, "languageTag");
            if (!StringsKt__IndentKt.o(languageTag2)) {
                str2 = lastInputMethodSubtype.getLanguageTag();
            } else {
                str2 = lastInputMethodSubtype.getLocale();
            }
            str3 = str2;
            i.d(str3, "if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N && languageTag.isNotBlank()) {\n            languageTag\n        } else {\n            locale\n        }");
        }
        if ((!StringsKt__IndentKt.o(str)) && (!StringsKt__IndentKt.o(str3))) {
            str = str + ',' + str3;
        }
        this.d = str;
        this.e = h.H2(new DeviceSharedPreferences$deviceId$2(this));
        String str4 = Build.MANUFACTURER;
        i.d(str4, "MANUFACTURER");
        this.f = str4;
        String str5 = Build.MODEL;
        i.d(str5, "MODEL");
        this.g = str5;
    }

    public final int k() {
        Key key = Key.VERSION_CODE;
        i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        try {
            return this.a.getInt(e(key), -1);
        } catch (Exception e2) {
            v0.a.a.d.e(e2, key + " was not an Int", new Object[0]);
            return -1;
        }
    }
}
