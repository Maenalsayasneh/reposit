package q0.h0.j;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.n.b.i;
import okio.ByteString;

/* compiled from: Header.kt */
public final class a {
    public static final ByteString a;
    public static final ByteString b;
    public static final ByteString c;
    public static final ByteString d;
    public static final ByteString e;
    public static final ByteString f;
    public final int g;
    public final ByteString h;
    public final ByteString i;

    static {
        ByteString.a aVar = ByteString.d;
        a = aVar.c(":");
        b = aVar.c(":status");
        c = aVar.c(":method");
        d = aVar.c(":path");
        e = aVar.c(":scheme");
        f = aVar.c(":authority");
    }

    public a(ByteString byteString, ByteString byteString2) {
        i.e(byteString, "name");
        i.e(byteString2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.h = byteString;
        this.i = byteString2;
        this.g = byteString.e() + 32 + byteString2.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.h, aVar.h) && i.a(this.i, aVar.i);
    }

    public int hashCode() {
        ByteString byteString = this.h;
        int i2 = 0;
        int hashCode = (byteString != null ? byteString.hashCode() : 0) * 31;
        ByteString byteString2 = this.i;
        if (byteString2 != null) {
            i2 = byteString2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return this.h.v() + ": " + this.i.v();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            m0.n.b.i.e(r2, r0)
            java.lang.String r0 = "value"
            m0.n.b.i.e(r3, r0)
            okio.ByteString$a r0 = okio.ByteString.d
            okio.ByteString r2 = r0.c(r2)
            okio.ByteString r3 = r0.c(r3)
            r1.<init>((okio.ByteString) r2, (okio.ByteString) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.a.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(ByteString byteString, String str) {
        this(byteString, ByteString.d.c(str));
        i.e(byteString, "name");
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
    }
}
