package i0.j.b.t.j.b;

import com.instabug.library.internal.storage.operation.DiskOperationCallback;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: VisualUserStepsListPresenter */
public class g implements DiskOperationCallback<Boolean> {
    public void onFailure(Throwable th) {
        InstabugSDKLogger.e("VisualUserStepsListPresenter", th.getClass().getSimpleName(), th);
    }

    public void onSuccess(Object obj) {
        InstabugSDKLogger.d("VisualUserStepsListPresenter", "result: " + ((Boolean) obj));
    }
}
