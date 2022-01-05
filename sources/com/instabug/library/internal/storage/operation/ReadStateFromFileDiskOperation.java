package com.instabug.library.internal.storage.operation;

import android.net.Uri;
import com.instabug.library.util.threading.PoolProvider;
import java.io.IOException;

public class ReadStateFromFileDiskOperation implements DiskOperation<String, Void> {
    private final Uri uri;

    public class a implements Runnable {
        public final /* synthetic */ DiskOperationCallback c;

        public a(DiskOperationCallback diskOperationCallback) {
            this.c = diskOperationCallback;
        }

        public void run() {
            DiskOperationCallback diskOperationCallback = this.c;
            if (diskOperationCallback != null) {
                try {
                    diskOperationCallback.onSuccess(ReadStateFromFileDiskOperation.this.getTextFromFile());
                } catch (IOException e) {
                    this.c.onFailure(e);
                }
            }
        }
    }

    public ReadStateFromFileDiskOperation(Uri uri2) {
        this.uri = uri2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getTextFromFile() throws java.lang.OutOfMemoryError, java.io.IOException {
        /*
            r4 = this;
            android.net.Uri r0 = r4.uri
            java.lang.String r0 = r0.getPath()
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = ""
            return r0
        L_0x000b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = new java.io.File
            android.net.Uri r2 = r4.uri
            java.lang.String r2 = r2.getPath()
            r1.<init>(r2)
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r1)
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r3 = "UTF8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r1.<init>(r2, r3)
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x004b }
            r3.<init>(r1)     // Catch:{ all -> 0x004b }
        L_0x0031:
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0040
            r0.append(r1)     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = "\n"
            r0.append(r1)     // Catch:{ all -> 0x0048 }
            goto L_0x0031
        L_0x0040:
            r3.close()
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0048:
            r0 = move-exception
            r2 = r3
            goto L_0x004c
        L_0x004b:
            r0 = move-exception
        L_0x004c:
            if (r2 == 0) goto L_0x0051
            r2.close()
        L_0x0051:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.operation.ReadStateFromFileDiskOperation.getTextFromFile():java.lang.String");
    }

    public String execute(Void voidR) throws IOException, OutOfMemoryError {
        return getTextFromFile();
    }

    public void executeAsync(Void voidR, DiskOperationCallback<String> diskOperationCallback) {
        PoolProvider.postIOTask(new a(diskOperationCallback));
    }
}
