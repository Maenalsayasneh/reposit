package h0.i.i.h0;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* compiled from: InputConnectionCompat */
public class c extends InputConnectionWrapper {
    public final /* synthetic */ d a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, boolean z, d dVar) {
        super(inputConnection, z);
        this.a = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performPrivateCommand(java.lang.String r14, android.os.Bundle r15) {
        /*
            r13 = this;
            h0.i.i.h0.d r0 = r13.a
            r1 = 0
            r2 = 1
            if (r15 != 0) goto L_0x0008
            goto L_0x00e9
        L_0x0008:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r3 = android.text.TextUtils.equals(r3, r14)
            if (r3 == 0) goto L_0x0012
            r3 = r1
            goto L_0x001b
        L_0x0012:
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r3 = android.text.TextUtils.equals(r3, r14)
            if (r3 == 0) goto L_0x00e9
            r3 = r2
        L_0x001b:
            r4 = 0
            if (r3 == 0) goto L_0x0021
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x0023
        L_0x0021:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x0023:
            android.os.Parcelable r5 = r15.getParcelable(r5)     // Catch:{ all -> 0x00e1 }
            android.os.ResultReceiver r5 = (android.os.ResultReceiver) r5     // Catch:{ all -> 0x00e1 }
            if (r3 == 0) goto L_0x002e
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x0030
        L_0x002e:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x0030:
            android.os.Parcelable r6 = r15.getParcelable(r6)     // Catch:{ all -> 0x00df }
            android.net.Uri r6 = (android.net.Uri) r6     // Catch:{ all -> 0x00df }
            if (r3 == 0) goto L_0x003b
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x003d
        L_0x003b:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x003d:
            android.os.Parcelable r7 = r15.getParcelable(r7)     // Catch:{ all -> 0x00df }
            android.content.ClipDescription r7 = (android.content.ClipDescription) r7     // Catch:{ all -> 0x00df }
            if (r3 == 0) goto L_0x0048
            java.lang.String r8 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x004a
        L_0x0048:
            java.lang.String r8 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x004a:
            android.os.Parcelable r8 = r15.getParcelable(r8)     // Catch:{ all -> 0x00df }
            android.net.Uri r8 = (android.net.Uri) r8     // Catch:{ all -> 0x00df }
            if (r3 == 0) goto L_0x0055
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x0057
        L_0x0055:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x0057:
            int r9 = r15.getInt(r9)     // Catch:{ all -> 0x00df }
            if (r3 == 0) goto L_0x0060
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x0062
        L_0x0060:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x0062:
            android.os.Parcelable r3 = r15.getParcelable(r3)     // Catch:{ all -> 0x00df }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x00df }
            if (r6 == 0) goto L_0x00d9
            if (r7 == 0) goto L_0x00d9
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00df }
            r11 = 25
            if (r10 < r11) goto L_0x0078
            h0.i.i.h0.e$a r12 = new h0.i.i.h0.e$a     // Catch:{ all -> 0x00df }
            r12.<init>(r6, r7, r8)     // Catch:{ all -> 0x00df }
            goto L_0x007d
        L_0x0078:
            h0.i.i.h0.e$b r12 = new h0.i.i.h0.e$b     // Catch:{ all -> 0x00df }
            r12.<init>(r6, r7, r8)     // Catch:{ all -> 0x00df }
        L_0x007d:
            h0.b.f.r r0 = (h0.b.f.r) r0     // Catch:{ all -> 0x00df }
            if (r10 < r11) goto L_0x00ab
            r6 = r9 & 1
            if (r6 == 0) goto L_0x00ab
            r12.b()     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r6 = r12.d()     // Catch:{ all -> 0x00df }
            android.view.inputmethod.InputContentInfo r6 = (android.view.inputmethod.InputContentInfo) r6     // Catch:{ all -> 0x00df }
            if (r3 != 0) goto L_0x0096
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x00df }
            r3.<init>()     // Catch:{ all -> 0x00df }
            goto L_0x009c
        L_0x0096:
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x00df }
            r7.<init>(r3)     // Catch:{ all -> 0x00df }
            r3 = r7
        L_0x009c:
            java.lang.String r7 = "androidx.core.view.extra.INPUT_CONTENT_INFO"
            r3.putParcelable(r7, r6)     // Catch:{ all -> 0x00df }
            goto L_0x00ab
        L_0x00a2:
            r0 = move-exception
            java.lang.String r3 = "ReceiveContent"
            java.lang.String r6 = "Can't insert content from IME; requestPermission() failed"
            android.util.Log.w(r3, r6, r0)     // Catch:{ all -> 0x00df }
            goto L_0x00d9
        L_0x00ab:
            android.content.ClipData r6 = new android.content.ClipData     // Catch:{ all -> 0x00df }
            android.content.ClipDescription r7 = r12.getDescription()     // Catch:{ all -> 0x00df }
            android.content.ClipData$Item r8 = new android.content.ClipData$Item     // Catch:{ all -> 0x00df }
            android.net.Uri r9 = r12.a()     // Catch:{ all -> 0x00df }
            r8.<init>(r9)     // Catch:{ all -> 0x00df }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x00df }
            h0.i.i.c$a r7 = new h0.i.i.c$a     // Catch:{ all -> 0x00df }
            r8 = 2
            r7.<init>(r6, r8)     // Catch:{ all -> 0x00df }
            android.net.Uri r6 = r12.c()     // Catch:{ all -> 0x00df }
            r7.d = r6     // Catch:{ all -> 0x00df }
            r7.e = r3     // Catch:{ all -> 0x00df }
            h0.i.i.c r3 = new h0.i.i.c     // Catch:{ all -> 0x00df }
            r3.<init>(r7)     // Catch:{ all -> 0x00df }
            android.view.View r0 = r0.a     // Catch:{ all -> 0x00df }
            h0.i.i.c r0 = h0.i.i.q.l(r0, r3)     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x00d9
            r1 = r2
        L_0x00d9:
            if (r5 == 0) goto L_0x00e9
            r5.send(r1, r4)
            goto L_0x00e9
        L_0x00df:
            r14 = move-exception
            goto L_0x00e3
        L_0x00e1:
            r14 = move-exception
            r5 = r4
        L_0x00e3:
            if (r5 == 0) goto L_0x00e8
            r5.send(r1, r4)
        L_0x00e8:
            throw r14
        L_0x00e9:
            if (r1 == 0) goto L_0x00ec
            return r2
        L_0x00ec:
            boolean r14 = super.performPrivateCommand(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.i.h0.c.performPrivateCommand(java.lang.String, android.os.Bundle):boolean");
    }
}
