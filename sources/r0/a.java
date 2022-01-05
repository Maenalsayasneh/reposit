package r0;

import okio.ByteString;

/* compiled from: -Base64.kt */
public final class a {
    public static final byte[] a;

    static {
        ByteString.a aVar = ByteString.d;
        a = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").y;
        aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }
}
