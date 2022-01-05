package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import i0.o.a.g;
import i0.o.a.t;

public class MediaStoreRequestHandler extends g {
    public static final String[] b = {"orientation"};

    public enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        public final int androidKind;
        public final int height;
        public final int width;

        private PicassoKind(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }

    public MediaStoreRequestHandler(Context context) {
        super(context);
    }

    public boolean c(t tVar) {
        Uri uri = tVar.d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r3 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r3 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.o.a.v.a f(i0.o.a.t r17, int r18) throws java.io.IOException {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            android.content.Context r2 = r1.a
            android.content.ContentResolver r9 = r2.getContentResolver()
            android.net.Uri r4 = r0.d
            r2 = 0
            r10 = 0
            java.lang.String[] r5 = b     // Catch:{ RuntimeException -> 0x0037, all -> 0x0030 }
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r9
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x0037, all -> 0x0030 }
            if (r3 == 0) goto L_0x002d
            boolean r4 = r3.moveToFirst()     // Catch:{ RuntimeException -> 0x0038, all -> 0x002a }
            if (r4 != 0) goto L_0x0021
            goto L_0x002d
        L_0x0021:
            int r4 = r3.getInt(r2)     // Catch:{ RuntimeException -> 0x0038, all -> 0x002a }
            r3.close()
            r8 = r4
            goto L_0x003e
        L_0x002a:
            r0 = move-exception
            r10 = r3
            goto L_0x0031
        L_0x002d:
            if (r3 == 0) goto L_0x003d
            goto L_0x003a
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            if (r10 == 0) goto L_0x0036
            r10.close()
        L_0x0036:
            throw r0
        L_0x0037:
            r3 = r10
        L_0x0038:
            if (r3 == 0) goto L_0x003d
        L_0x003a:
            r3.close()
        L_0x003d:
            r8 = r2
        L_0x003e:
            android.net.Uri r3 = r0.d
            java.lang.String r3 = r9.getType(r3)
            r11 = 1
            if (r3 == 0) goto L_0x0051
            java.lang.String r4 = "video/"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x0051
            r12 = r11
            goto L_0x0052
        L_0x0051:
            r12 = r2
        L_0x0052:
            boolean r2 = r17.a()
            if (r2 == 0) goto L_0x00cd
            int r2 = r0.g
            int r3 = r0.h
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r4 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MICRO
            int r5 = r4.width
            if (r2 > r5) goto L_0x0067
            int r5 = r4.height
            if (r3 > r5) goto L_0x0067
        L_0x0066:
            goto L_0x0074
        L_0x0067:
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r4 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MINI
            int r5 = r4.width
            if (r2 > r5) goto L_0x0072
            int r2 = r4.height
            if (r3 > r2) goto L_0x0072
            goto L_0x0066
        L_0x0072:
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r4 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.FULL
        L_0x0074:
            r13 = r4
            if (r12 != 0) goto L_0x0093
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r2 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.FULL
            if (r13 != r2) goto L_0x0093
            android.content.Context r2 = r1.a
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.net.Uri r0 = r0.d
            java.io.InputStream r0 = r2.openInputStream(r0)
            r0.y r0 = m0.r.t.a.r.m.a1.a.D3(r0)
            i0.o.a.v$a r2 = new i0.o.a.v$a
            com.squareup.picasso.Picasso$LoadedFrom r3 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r2.<init>(r10, r0, r3, r8)
            return r2
        L_0x0093:
            android.net.Uri r2 = r0.d
            long r14 = android.content.ContentUris.parseId(r2)
            android.graphics.BitmapFactory$Options r7 = i0.o.a.v.d(r17)
            r7.inJustDecodeBounds = r11
            int r2 = r0.g
            int r3 = r0.h
            int r4 = r13.width
            int r5 = r13.height
            r6 = r7
            r11 = r7
            r7 = r17
            i0.o.a.v.a(r2, r3, r4, r5, r6, r7)
            if (r12 == 0) goto L_0x00bd
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r2 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.FULL
            if (r13 != r2) goto L_0x00b6
            r2 = 1
            goto L_0x00b8
        L_0x00b6:
            int r2 = r13.androidKind
        L_0x00b8:
            android.graphics.Bitmap r2 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(r9, r14, r2, r11)
            goto L_0x00c3
        L_0x00bd:
            int r2 = r13.androidKind
            android.graphics.Bitmap r2 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r9, r14, r2, r11)
        L_0x00c3:
            if (r2 == 0) goto L_0x00cd
            i0.o.a.v$a r0 = new i0.o.a.v$a
            com.squareup.picasso.Picasso$LoadedFrom r3 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r0.<init>(r2, r10, r3, r8)
            return r0
        L_0x00cd:
            android.content.Context r2 = r1.a
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.net.Uri r0 = r0.d
            java.io.InputStream r0 = r2.openInputStream(r0)
            r0.y r0 = m0.r.t.a.r.m.a1.a.D3(r0)
            i0.o.a.v$a r2 = new i0.o.a.v$a
            com.squareup.picasso.Picasso$LoadedFrom r3 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r2.<init>(r10, r0, r3, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.MediaStoreRequestHandler.f(i0.o.a.t, int):i0.o.a.v$a");
    }
}
