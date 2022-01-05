package com.clubhouse.android.ui.common;

import com.theartofdev.edmodo.cropper.CropImage$ActivityResult;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.common.PhotoCreationFragment$onActivityResult$1", f = "PhotoCreationFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: PhotoCreationFragment.kt */
public final class PhotoCreationFragment$onActivityResult$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ PhotoCreationFragment c;
    public final /* synthetic */ CropImage$ActivityResult d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhotoCreationFragment$onActivityResult$1(PhotoCreationFragment photoCreationFragment, CropImage$ActivityResult cropImage$ActivityResult, m0.l.c<? super PhotoCreationFragment$onActivityResult$1> cVar) {
        super(2, cVar);
        this.c = photoCreationFragment;
        this.d = cropImage$ActivityResult;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new PhotoCreationFragment$onActivityResult$1(this.c, this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        PhotoCreationFragment$onActivityResult$1 photoCreationFragment$onActivityResult$1 = new PhotoCreationFragment$onActivityResult$1(this.c, this.d, (m0.l.c) obj2);
        i iVar = i.a;
        photoCreationFragment$onActivityResult$1.invokeSuspend(iVar);
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        java.lang.System.gc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0098, code lost:
        if (r2 != null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010a, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010b, code lost:
        if (r2 != null) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0095 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            i0.j.f.p.h.d4(r15)
            com.clubhouse.android.ui.common.PhotoCreationFragment r15 = r14.c
            android.content.Context r15 = r15.requireContext()
            java.lang.String r0 = "requireContext()"
            m0.n.b.i.d(r15, r0)
            com.theartofdev.edmodo.cropper.CropImage$ActivityResult r0 = r14.d
            android.net.Uri r0 = r0.d
            java.lang.String r1 = "context"
            m0.n.b.i.e(r15, r1)
            r2 = 0
            if (r0 != 0) goto L_0x001f
            r0 = r2
            goto L_0x00e3
        L_0x001f:
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "uri.toString()"
            m0.n.b.i.d(r3, r4)
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r5 = 1
            r4.inJustDecodeBounds = r5
            java.lang.String r6 = "file://"
            r7 = 0
            r8 = 2
            boolean r9 = kotlin.text.StringsKt__IndentKt.J(r3, r6, r7, r8)
            java.lang.String r10 = "(this as java.lang.String).substring(startIndex)"
            r11 = 7
            if (r9 == 0) goto L_0x0048
            java.lang.String r9 = r3.substring(r11)
            m0.n.b.i.d(r9, r10)
            android.graphics.BitmapFactory.decodeFile(r9, r4)
            goto L_0x0054
        L_0x0048:
            android.content.ContentResolver r9 = r15.getContentResolver()
            java.io.InputStream r9 = r9.openInputStream(r0)
            android.graphics.BitmapFactory.decodeStream(r9, r2, r4)
            r2 = r9
        L_0x0054:
            r9 = r5
        L_0x0055:
            int r12 = r4.outWidth
            int r12 = r12 / r9
            int r13 = r4.outHeight
            int r13 = r13 / r9
            int r13 = r13 * r12
            r12 = 640000(0x9c400, float:8.96831E-40)
            if (r13 <= r12) goto L_0x0064
            int r9 = r9 * 2
            goto L_0x0055
        L_0x0064:
            if (r9 != r5) goto L_0x0068
            goto L_0x00e3
        L_0x0068:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r4.inSampleSize = r9
            boolean r5 = kotlin.text.StringsKt__IndentKt.J(r3, r6, r7, r8)     // Catch:{ all -> 0x0095 }
            if (r5 == 0) goto L_0x0081
            java.lang.String r3 = r3.substring(r11)     // Catch:{ all -> 0x0095 }
            m0.n.b.i.d(r3, r10)     // Catch:{ all -> 0x0095 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3, r4)     // Catch:{ all -> 0x0095 }
            goto L_0x008e
        L_0x0081:
            android.content.ContentResolver r3 = r15.getContentResolver()     // Catch:{ all -> 0x0095 }
            java.io.InputStream r2 = r3.openInputStream(r0)     // Catch:{ all -> 0x0095 }
            r3 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2, r3, r4)     // Catch:{ all -> 0x0095 }
        L_0x008e:
            if (r2 != 0) goto L_0x0091
            goto L_0x009f
        L_0x0091:
            r2.close()     // Catch:{ all -> 0x009f }
            goto L_0x009f
        L_0x0095:
            java.lang.System.gc()     // Catch:{ all -> 0x010a }
            if (r2 != 0) goto L_0x009b
            goto L_0x009e
        L_0x009b:
            r2.close()     // Catch:{ all -> 0x009e }
        L_0x009e:
            r3 = 0
        L_0x009f:
            if (r3 != 0) goto L_0x00a2
            goto L_0x00e3
        L_0x00a2:
            m0.n.b.i.e(r15, r1)
            java.io.File r15 = r15.getExternalCacheDir()
            if (r15 != 0) goto L_0x00ad
            r15 = 0
            goto L_0x00dc
        L_0x00ad:
            java.io.File r1 = new java.io.File
            java.lang.String r15 = r15.getPath()
            java.lang.String r2 = "JPEG_"
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            long r4 = java.lang.System.currentTimeMillis()
            r2.append(r4)
            r4 = 95
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r15, r2)
            java.io.FileOutputStream r15 = new java.io.FileOutputStream
            r15.<init>(r1)
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
            r4 = 100
            r3.compress(r2, r4, r15)
            android.net.Uri r15 = android.net.Uri.fromFile(r1)
        L_0x00dc:
            if (r15 != 0) goto L_0x00df
            r15 = 0
        L_0x00df:
            if (r15 != 0) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r0 = r15
        L_0x00e3:
            if (r0 != 0) goto L_0x00e9
            com.theartofdev.edmodo.cropper.CropImage$ActivityResult r15 = r14.d
            android.net.Uri r0 = r15.d
        L_0x00e9:
            com.clubhouse.android.ui.common.PhotoCreationFragment r15 = r14.c
            h0.q.p r15 = r15.getViewLifecycleOwner()
            java.lang.String r1 = "viewLifecycleOwner"
            m0.n.b.i.d(r15, r1)
            androidx.lifecycle.LifecycleCoroutineScope r2 = h0.q.q.a(r15)
            r3 = 0
            r4 = 0
            com.clubhouse.android.ui.common.PhotoCreationFragment$onActivityResult$1$1 r5 = new com.clubhouse.android.ui.common.PhotoCreationFragment$onActivityResult$1$1
            com.clubhouse.android.ui.common.PhotoCreationFragment r15 = r14.c
            r1 = 0
            r5.<init>(r15, r0, r1)
            r6 = 3
            r7 = 0
            m0.r.t.a.r.m.a1.a.E2(r2, r3, r4, r5, r6, r7)
            m0.i r15 = m0.i.a
            return r15
        L_0x010a:
            r15 = move-exception
            if (r2 != 0) goto L_0x010e
            goto L_0x0111
        L_0x010e:
            r2.close()     // Catch:{ all -> 0x0111 }
        L_0x0111:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.common.PhotoCreationFragment$onActivityResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
