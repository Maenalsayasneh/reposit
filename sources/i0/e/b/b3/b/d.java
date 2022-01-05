package i0.e.b.b3.b;

import android.content.ContentResolver;
import android.net.Uri;
import m0.n.b.i;
import q0.d0;
import q0.y;

/* compiled from: ContentUriRequestBody.kt */
public final class d extends d0 {
    public final ContentResolver b;
    public final Uri c;

    public d(ContentResolver contentResolver, Uri uri) {
        i.e(contentResolver, "contentResolver");
        i.e(uri, "contentUri");
        this.b = contentResolver;
        this.c = uri;
    }

    public y b() {
        String type = this.b.getType(this.c);
        if (type == null) {
            return null;
        }
        y.a aVar = y.c;
        return y.a.b(type);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        i0.j.f.p.h.H(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(r0.h r3) {
        /*
            r2 = this;
            java.lang.String r0 = "sink"
            m0.n.b.i.e(r3, r0)
            android.content.ContentResolver r0 = r2.b
            android.net.Uri r1 = r2.c
            java.io.InputStream r0 = r0.openInputStream(r1)
            if (r0 == 0) goto L_0x0022
            r0.y r0 = m0.r.t.a.r.m.a1.a.D3(r0)
            r1 = 0
            r3.V(r0)     // Catch:{ all -> 0x001b }
            i0.j.f.p.h.H(r0, r1)
            return
        L_0x001b:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001d }
        L_0x001d:
            r1 = move-exception
            i0.j.f.p.h.H(r0, r3)
            throw r1
        L_0x0022:
            java.io.IOException r3 = new java.io.IOException
            android.net.Uri r0 = r2.c
            java.lang.String r1 = "Couldn't open content URI for reading: "
            java.lang.String r0 = m0.n.b.i.k(r1, r0)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.b3.b.d.d(r0.h):void");
    }
}
