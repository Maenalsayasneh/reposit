package com.instabug.anr.f;

import android.content.ContentValues;
import com.instabug.anr.network.InstabugAnrUploaderService;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: InstabugAnrUploaderService */
public class a implements Request.Callbacks<String, Throwable> {
    public final /* synthetic */ com.instabug.anr.e.a a;
    public final /* synthetic */ InstabugAnrUploaderService b;

    public a(InstabugAnrUploaderService instabugAnrUploaderService, com.instabug.anr.e.a aVar) {
        this.b = instabugAnrUploaderService;
        this.a = aVar;
    }

    public void onFailed(Object obj) {
        Throwable th = (Throwable) obj;
        InstabugSDKLogger.d("InstabugAnrUploaderService", "Something went wrong while uploading ANR");
    }

    public void onSucceeded(Object obj) {
        String str = (String) obj;
        if (str == null) {
            InstabugSDKLogger.d("InstabugAnrUploaderService", "temporaryServerToken was null, aborting...");
            return;
        }
        InstabugSDKLogger.d("InstabugAnrUploaderService", "ANR uploaded successfully, setting ANR TemporaryServerToken to: " + str);
        com.instabug.anr.e.a aVar = this.a;
        aVar.f = str;
        aVar.e = 2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("temporary_server_token", str);
        contentValues.put(InstabugDbContract.AnrEntry.COLUMN_ANR_UPLOAD_STATE, 2);
        com.instabug.anr.d.a.a(this.a.a, contentValues);
        InstabugAnrUploaderService instabugAnrUploaderService = this.b;
        com.instabug.anr.e.a aVar2 = this.a;
        int i = InstabugAnrUploaderService.c;
        instabugAnrUploaderService.b(aVar2);
    }
}
