package com.instabug.library.internal.storage.operation;

import android.net.Uri;
import com.instabug.library.util.threading.PoolProvider;
import java.io.File;

public class DeleteUriDiskOperation implements DiskOperation<Boolean, Void> {
    private final Uri uri;

    public class a implements Runnable {
        public final /* synthetic */ DiskOperationCallback c;

        public a(DiskOperationCallback diskOperationCallback) {
            this.c = diskOperationCallback;
        }

        public void run() {
            try {
                boolean access$000 = DeleteUriDiskOperation.this.delete();
                DiskOperationCallback diskOperationCallback = this.c;
                if (diskOperationCallback != null) {
                    diskOperationCallback.onSuccess(Boolean.valueOf(access$000));
                }
            } catch (Throwable th) {
                DiskOperationCallback diskOperationCallback2 = this.c;
                if (diskOperationCallback2 != null) {
                    diskOperationCallback2.onFailure(th);
                }
            }
        }
    }

    public DeleteUriDiskOperation(Uri uri2) {
        this.uri = uri2;
    }

    /* access modifiers changed from: private */
    public boolean delete() {
        Uri uri2 = this.uri;
        return (uri2 == null || uri2.getPath() == null || !new File(this.uri.getPath()).delete()) ? false : true;
    }

    public synchronized Boolean execute(Void voidR) {
        return Boolean.valueOf(delete());
    }

    public void executeAsync(Void voidR, DiskOperationCallback<Boolean> diskOperationCallback) {
        PoolProvider.postIOTask(new a(diskOperationCallback));
    }
}
