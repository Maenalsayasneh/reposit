package i0.j.e.q0;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.internal.storage.operation.DiskOperationCallback;
import java.io.IOException;

/* compiled from: WriteLogDiskOperator */
public class k implements Action {
    public final /* synthetic */ Context a;
    public final /* synthetic */ DiskOperationCallback b;
    public final /* synthetic */ l c;

    public k(l lVar, Context context, DiskOperationCallback diskOperationCallback) {
        this.c = lVar;
        this.a = context;
        this.b = diskOperationCallback;
    }

    public void run() throws Exception {
        try {
            l lVar = this.c;
            lVar.a(lVar.b, this.a);
        } catch (IOException e) {
            Log.w("g", "execute: ", e);
            DiskOperationCallback diskOperationCallback = this.b;
            if (diskOperationCallback != null) {
                diskOperationCallback.onFailure(e);
            }
        }
        DiskOperationCallback diskOperationCallback2 = this.b;
        if (diskOperationCallback2 != null) {
            diskOperationCallback2.onSuccess(Uri.fromFile(this.c.a));
        }
    }
}
