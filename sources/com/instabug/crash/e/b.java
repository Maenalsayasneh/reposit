package com.instabug.crash.e;

import com.instabug.library.internal.storage.operation.DiskOperationCallback;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: InstabugCrashesUploaderService */
public class b implements DiskOperationCallback<Boolean> {
    public void onFailure(Throwable th) {
        InstabugSDKLogger.e("InstabugCrashesUploaderService", th.getClass().getSimpleName(), th);
    }

    public void onSuccess(Object obj) {
        InstabugSDKLogger.d("InstabugCrashesUploaderService", "result:" + ((Boolean) obj));
    }
}
