package com.instabug.crash.e;

import android.content.ContentValues;
import com.instabug.crash.c.a;
import com.instabug.crash.network.InstabugCrashesUploaderService;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: InstabugCrashesUploaderService */
public class a implements Request.Callbacks<String, Throwable> {
    public final /* synthetic */ com.instabug.crash.c.a a;
    public final /* synthetic */ InstabugCrashesUploaderService b;

    public a(InstabugCrashesUploaderService instabugCrashesUploaderService, com.instabug.crash.c.a aVar) {
        this.b = instabugCrashesUploaderService;
        this.a = aVar;
    }

    public void onFailed(Object obj) {
        Throwable th = (Throwable) obj;
        InstabugSDKLogger.d("InstabugCrashesUploaderService", "Something went wrong while uploading crash");
    }

    public void onSucceeded(Object obj) {
        String str = (String) obj;
        if (str == null) {
            InstabugSDKLogger.d("InstabugCrashesUploaderService", "temporaryServerToken was null, aborting...");
            return;
        }
        InstabugSDKLogger.d("InstabugCrashesUploaderService", "crash uploaded successfully, setting crash TemporaryServerToken equal " + str);
        com.instabug.crash.c.a aVar = this.a;
        aVar.d = str;
        a.C0101a aVar2 = a.C0101a.LOGS_READY_TO_BE_UPLOADED;
        aVar.Y1 = aVar2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("temporary_server_token", str);
        contentValues.put(InstabugDbContract.CrashEntry.COLUMN_CRASH_STATE, aVar2.name());
        i0.j.c.l.a.D(this.a.c, contentValues);
        InstabugCrashesUploaderService instabugCrashesUploaderService = this.b;
        com.instabug.crash.c.a aVar3 = this.a;
        int i = InstabugCrashesUploaderService.c;
        instabugCrashesUploaderService.c(aVar3);
        InstabugCrashesUploaderService.b(this.b);
    }
}
