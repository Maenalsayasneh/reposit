package com.instabug.library.internal.storage.operation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class WriteStateToFileDiskOperation implements DiskOperation<Uri, Context> {
    public static final String TAG = "WriteStateToFileDiskOperation";
    /* access modifiers changed from: private */
    public final File file;
    /* access modifiers changed from: private */
    public final String stringState;

    public class a implements Runnable {
        public final /* synthetic */ DiskOperationCallback c;

        public a(DiskOperationCallback diskOperationCallback) {
            this.c = diskOperationCallback;
        }

        @SuppressLint({"RESOURCE_LEAK"})
        public final void a() throws Throwable {
            if (!WriteStateToFileDiskOperation.this.file.createNewFile()) {
                InstabugSDKLogger.d(WriteStateToFileDiskOperation.TAG, WriteStateToFileDiskOperation.this.file.getAbsolutePath() + "already exists");
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(WriteStateToFileDiskOperation.this.file, false), Charset.forName("UTF8"));
            outputStreamWriter.write(WriteStateToFileDiskOperation.this.stringState);
            outputStreamWriter.close();
        }

        public void run() {
            try {
                a();
            } catch (Throwable th) {
                InstabugSDKLogger.e(WriteStateToFileDiskOperation.TAG, th.getClass().getSimpleName(), th);
                DiskOperationCallback diskOperationCallback = this.c;
                if (diskOperationCallback != null) {
                    diskOperationCallback.onFailure(th);
                }
            }
            DiskOperationCallback diskOperationCallback2 = this.c;
            if (diskOperationCallback2 != null) {
                diskOperationCallback2.onSuccess(Uri.fromFile(WriteStateToFileDiskOperation.this.file));
            }
        }
    }

    public WriteStateToFileDiskOperation(File file2, String str) {
        this.stringState = str;
        this.file = file2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[SYNTHETIC, Splitter:B:18:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.net.Uri execute(android.content.Context r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            java.io.File r4 = r3.file     // Catch:{ all -> 0x0054 }
            boolean r4 = r4.createNewFile()     // Catch:{ all -> 0x0054 }
            if (r4 != 0) goto L_0x0025
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r4.<init>()     // Catch:{ all -> 0x0054 }
            java.io.File r0 = r3.file     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0054 }
            r4.append(r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "already exists"
            r4.append(r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "WriteStateToFileDiskOperation"
            com.instabug.library.util.InstabugSDKLogger.d(r0, r4)     // Catch:{ all -> 0x0054 }
        L_0x0025:
            r4 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x004d }
            java.io.File r1 = r3.file     // Catch:{ all -> 0x004d }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x004d }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "UTF8"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)     // Catch:{ all -> 0x004d }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x004d }
            java.lang.String r4 = r3.stringState     // Catch:{ all -> 0x0049 }
            r1.write(r4)     // Catch:{ all -> 0x0049 }
            r1.close()     // Catch:{ all -> 0x0054 }
            java.io.File r4 = r3.file     // Catch:{ all -> 0x0054 }
            android.net.Uri r4 = android.net.Uri.fromFile(r4)     // Catch:{ all -> 0x0054 }
            monitor-exit(r3)
            return r4
        L_0x0049:
            r4 = move-exception
            r0 = r4
            r4 = r1
            goto L_0x004e
        L_0x004d:
            r0 = move-exception
        L_0x004e:
            if (r4 == 0) goto L_0x0053
            r4.close()     // Catch:{ all -> 0x0054 }
        L_0x0053:
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.operation.WriteStateToFileDiskOperation.execute(android.content.Context):android.net.Uri");
    }

    public void executeAsync(Context context, DiskOperationCallback<Uri> diskOperationCallback) {
        PoolProvider.postIOTask(new a(diskOperationCallback));
    }
}
