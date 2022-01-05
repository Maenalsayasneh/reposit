package okhttp3.internal;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import m0.n.b.i;
import q0.b0;
import q0.d;
import q0.e0;
import q0.m;
import q0.n;
import q0.v;
import q0.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0015\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\n¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"", "currentTimeMillis", "Lq0/w;", "url", "", "setCookie", "Lq0/n;", "parseCookie", "(JLq0/w;Ljava/lang/String;)Lq0/n;", "cookie", "", "forObsoleteRfc2965", "cookieToString", "(Lq0/n;Z)Ljava/lang/String;", "Lq0/v$a;", "builder", "line", "addHeaderLenient", "(Lq0/v$a;Ljava/lang/String;)Lq0/v$a;", "name", "value", "(Lq0/v$a;Ljava/lang/String;Ljava/lang/String;)Lq0/v$a;", "Lq0/d;", "cache", "Lq0/b0;", "request", "Lq0/e0;", "cacheGet", "(Lq0/d;Lq0/b0;)Lq0/e0;", "Lq0/m;", "connectionSpec", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "Lm0/i;", "applyConnectionSpec", "(Lq0/m;Ljavax/net/ssl/SSLSocket;Z)V", "okhttp"}, k = 2, mv = {1, 4, 0})
/* compiled from: internal.kt */
public final class Internal {
    public static final v.a addHeaderLenient(v.a aVar, String str) {
        i.e(aVar, "builder");
        i.e(str, "line");
        aVar.b(str);
        return aVar;
    }

    public static final void applyConnectionSpec(m mVar, SSLSocket sSLSocket, boolean z) {
        i.e(mVar, "connectionSpec");
        i.e(sSLSocket, "sslSocket");
        mVar.a(sSLSocket, z);
    }

    public static final e0 cacheGet(d dVar, b0 b0Var) {
        i.e(dVar, "cache");
        i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        return dVar.a(b0Var);
    }

    public static final String cookieToString(n nVar, boolean z) {
        i.e(nVar, "cookie");
        return nVar.e(z);
    }

    public static final n parseCookie(long j, w wVar, String str) {
        i.e(wVar, "url");
        i.e(str, "setCookie");
        n nVar = n.e;
        return n.b(j, wVar, str);
    }

    public static final v.a addHeaderLenient(v.a aVar, String str, String str2) {
        i.e(aVar, "builder");
        i.e(str, "name");
        i.e(str2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        aVar.c(str, str2);
        return aVar;
    }
}
