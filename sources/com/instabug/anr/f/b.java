package com.instabug.anr.f;

import com.instabug.library.internal.storage.operation.DiskOperationCallback;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: InstabugAnrUploaderService */
public class b implements DiskOperationCallback<Boolean> {
    public void onFailure(Throwable th) {
        InstabugSDKLogger.e("InstabugAnrUploaderService", th.getClass().getSimpleName(), th);
    }

    public void onSuccess(Object obj) {
        InstabugSDKLogger.d("InstabugAnrUploaderService", "result:" + ((Boolean) obj));
    }
}
