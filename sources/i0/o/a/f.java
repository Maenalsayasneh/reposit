package i0.o.a;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;

/* compiled from: ContactsPhotoRequestHandler */
public class f extends v {
    public static final UriMatcher a;
    public final Context b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public f(Context context) {
        this.b = context;
    }

    public boolean c(t tVar) {
        Uri uri = tVar.d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && a.match(tVar.d) != -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.o.a.v.a f(i0.o.a.t r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            android.content.Context r6 = r4.b
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r5 = r5.d
            android.content.UriMatcher r0 = a
            int r0 = r0.match(r5)
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0038
            r3 = 2
            if (r0 == r3) goto L_0x0033
            r3 = 3
            if (r0 == r3) goto L_0x0040
            r1 = 4
            if (r0 != r1) goto L_0x001c
            goto L_0x0033
        L_0x001c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid uri: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L_0x0033:
            java.io.InputStream r5 = r6.openInputStream(r5)
            goto L_0x0044
        L_0x0038:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r6, r5)
            if (r5 != 0) goto L_0x0040
            r5 = r2
            goto L_0x0044
        L_0x0040:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r6, r5, r1)
        L_0x0044:
            if (r5 != 0) goto L_0x0047
            return r2
        L_0x0047:
            i0.o.a.v$a r6 = new i0.o.a.v$a
            r0.y r5 = m0.r.t.a.r.m.a1.a.D3(r5)
            com.squareup.picasso.Picasso$LoadedFrom r0 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.o.a.f.f(i0.o.a.t, int):i0.o.a.v$a");
    }
}
