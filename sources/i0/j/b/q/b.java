package i0.j.b.q;

import com.instabug.library.internal.storage.operation.DiskOperationCallback;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: BugUploaderHelper */
public class b implements DiskOperationCallback<Boolean> {
    public void onFailure(Throwable th) {
        InstabugSDKLogger.e("BugUploaderHelper", th.getClass().getSimpleName(), th);
    }

    public void onSuccess(Object obj) {
        InstabugSDKLogger.i("BugUploaderHelper", "result: " + ((Boolean) obj));
    }
}
