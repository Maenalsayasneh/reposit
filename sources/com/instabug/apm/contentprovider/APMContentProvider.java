package com.instabug.apm.contentprovider;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import i0.j.a.e.c;
import i0.j.a.g.a;

public class APMContentProvider extends ContentProvider {
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (context != null && (context instanceof Application)) {
            Application application = (Application) context;
            a.a = application;
            c cVar = (c) a.g();
            if (cVar.l() || cVar.g()) {
                application.registerActivityLifecycleCallbacks(new i0.j.a.i.a(context, Boolean.TRUE));
            }
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
