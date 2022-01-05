package okhttp3.logging;

import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.networkv2.request.Header;
import i0.j.f.p.h;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import okhttp3.Protocol;
import q0.b0;
import q0.d0;
import q0.e0;
import q0.f0;
import q0.h0.h.e;
import q0.h0.h.g;
import q0.k;
import q0.v;
import q0.x;
import q0.y;
import r0.f;
import r0.m;

/* compiled from: HttpLoggingInterceptor.kt */
public final class HttpLoggingInterceptor implements x {
    public volatile Set<String> a = EmptySet.c;
    public volatile Level b = Level.NONE;
    public final a c;

    /* compiled from: HttpLoggingInterceptor.kt */
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.kt */
    public interface a {
        public static final a a = new q0.i0.a();

        void a(String str);
    }

    public HttpLoggingInterceptor() {
        a aVar = a.a;
        i.e(aVar, "logger");
        this.c = aVar;
    }

    public final boolean a(v vVar) {
        String b2 = vVar.b(Header.CONTENT_ENCODING);
        if (b2 == null || StringsKt__IndentKt.f(b2, "identity", true) || StringsKt__IndentKt.f(b2, "gzip", true)) {
            return false;
        }
        return true;
    }

    public final void b(v vVar, int i) {
        String str;
        int i2 = i * 2;
        if (this.a.contains(vVar.d[i2])) {
            str = "██";
        } else {
            str = vVar.d[i2 + 1];
        }
        a aVar = this.c;
        aVar.a(vVar.d[i2] + ": " + str);
    }

    public e0 intercept(x.a aVar) throws IOException {
        String str;
        String str2;
        String str3;
        char c2;
        String str4;
        String str5;
        Charset charset;
        Throwable th;
        Charset charset2;
        x.a aVar2 = aVar;
        i.e(aVar2, "chain");
        Level level = this.b;
        g gVar = (g) aVar2;
        b0 b0Var = gVar.f;
        if (level == Level.NONE) {
            return gVar.a(b0Var);
        }
        boolean z = level == Level.BODY;
        boolean z2 = z || level == Level.HEADERS;
        d0 d0Var = b0Var.e;
        k b2 = gVar.b();
        StringBuilder P0 = i0.d.a.a.a.P0("--> ");
        P0.append(b0Var.c);
        P0.append(' ');
        P0.append(b0Var.b);
        if (b2 != null) {
            StringBuilder P02 = i0.d.a.a.a.P0(" ");
            Protocol protocol = ((q0.h0.g.g) b2).e;
            i.c(protocol);
            P02.append(protocol);
            str = P02.toString();
        } else {
            str = "";
        }
        P0.append(str);
        String sb = P0.toString();
        if (!z2 && d0Var != null) {
            StringBuilder S0 = i0.d.a.a.a.S0(sb, " (");
            S0.append(d0Var.a());
            S0.append("-byte body)");
            sb = S0.toString();
        }
        this.c.a(sb);
        if (z2) {
            v vVar = b0Var.d;
            if (d0Var != null) {
                y b3 = d0Var.b();
                if (b3 != null && vVar.b(Header.CONTENT_TYPE) == null) {
                    this.c.a("Content-Type: " + b3);
                }
                if (d0Var.a() != -1 && vVar.b("Content-Length") == null) {
                    a aVar3 = this.c;
                    StringBuilder P03 = i0.d.a.a.a.P0("Content-Length: ");
                    P03.append(d0Var.a());
                    aVar3.a(P03.toString());
                }
            }
            int size = vVar.size();
            for (int i = 0; i < size; i++) {
                b(vVar, i);
            }
            if (!z || d0Var == null) {
                a aVar4 = this.c;
                StringBuilder P04 = i0.d.a.a.a.P0("--> END ");
                P04.append(b0Var.c);
                aVar4.a(P04.toString());
            } else if (a(b0Var.d)) {
                a aVar5 = this.c;
                StringBuilder P05 = i0.d.a.a.a.P0("--> END ");
                P05.append(b0Var.c);
                P05.append(" (encoded body omitted)");
                aVar5.a(P05.toString());
            } else {
                f fVar = new f();
                d0Var.d(fVar);
                y b4 = d0Var.b();
                if (b4 == null || (charset2 = b4.a(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    i.d(charset2, "UTF_8");
                }
                this.c.a("");
                if (m0.r.t.a.r.m.a1.a.x2(fVar)) {
                    this.c.a(fVar.P(charset2));
                    a aVar6 = this.c;
                    StringBuilder P06 = i0.d.a.a.a.P0("--> END ");
                    P06.append(b0Var.c);
                    P06.append(" (");
                    P06.append(d0Var.a());
                    P06.append("-byte body)");
                    aVar6.a(P06.toString());
                } else {
                    a aVar7 = this.c;
                    StringBuilder P07 = i0.d.a.a.a.P0("--> END ");
                    P07.append(b0Var.c);
                    P07.append(" (binary ");
                    P07.append(d0Var.a());
                    P07.append("-byte body omitted)");
                    aVar7.a(P07.toString());
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            e0 a2 = gVar.a(b0Var);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            f0 f0Var = a2.a2;
            i.c(f0Var);
            long contentLength = f0Var.contentLength();
            if (contentLength != -1) {
                str2 = contentLength + "-byte";
            } else {
                str2 = "unknown-length";
            }
            a aVar8 = this.c;
            String str6 = "-byte body)";
            StringBuilder P08 = i0.d.a.a.a.P0("<-- ");
            long j = contentLength;
            P08.append(a2.y);
            if (a2.x.length() == 0) {
                c2 = ' ';
                str3 = "-byte body omitted)";
                str4 = "";
            } else {
                String str7 = a2.x;
                StringBuilder sb2 = new StringBuilder();
                str3 = "-byte body omitted)";
                sb2.append(String.valueOf(' '));
                sb2.append(str7);
                str4 = sb2.toString();
                c2 = ' ';
            }
            P08.append(str4);
            P08.append(c2);
            P08.append(a2.d.b);
            P08.append(" (");
            P08.append(millis);
            P08.append("ms");
            if (!z2) {
                str5 = i0.d.a.a.a.o0(", ", str2, " body");
            } else {
                str5 = "";
            }
            P08.append(str5);
            P08.append(')');
            aVar8.a(P08.toString());
            if (z2) {
                v vVar2 = a2.Z1;
                int size2 = vVar2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    b(vVar2, i2);
                }
                if (!z || !e.a(a2)) {
                    this.c.a("<-- END HTTP");
                } else if (a(a2.Z1)) {
                    this.c.a("<-- END HTTP (encoded body omitted)");
                } else {
                    r0.i source = f0Var.source();
                    source.a0(RecyclerView.FOREVER_NS);
                    f c3 = source.c();
                    Long l = null;
                    if (StringsKt__IndentKt.f("gzip", vVar2.b(Header.CONTENT_ENCODING), true)) {
                        Long valueOf = Long.valueOf(c3.d);
                        m mVar = new m(c3.clone());
                        try {
                            c3 = new f();
                            c3.V(mVar);
                            h.H(mVar, (Throwable) null);
                            l = valueOf;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            h.H(mVar, th);
                            throw th3;
                        }
                    }
                    y contentType = f0Var.contentType();
                    if (contentType == null || (charset = contentType.a(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        i.d(charset, "UTF_8");
                    }
                    if (!m0.r.t.a.r.m.a1.a.x2(c3)) {
                        this.c.a("");
                        a aVar9 = this.c;
                        StringBuilder P09 = i0.d.a.a.a.P0("<-- END HTTP (binary ");
                        P09.append(c3.d);
                        P09.append(str3);
                        aVar9.a(P09.toString());
                        return a2;
                    }
                    if (j != 0) {
                        this.c.a("");
                        this.c.a(c3.clone().P(charset));
                    }
                    if (l != null) {
                        a aVar10 = this.c;
                        StringBuilder P010 = i0.d.a.a.a.P0("<-- END HTTP (");
                        P010.append(c3.d);
                        P010.append("-byte, ");
                        P010.append(l);
                        P010.append("-gzipped-byte body)");
                        aVar10.a(P010.toString());
                    } else {
                        a aVar11 = this.c;
                        StringBuilder P011 = i0.d.a.a.a.P0("<-- END HTTP (");
                        P011.append(c3.d);
                        P011.append(str6);
                        aVar11.a(P011.toString());
                    }
                }
            }
            return a2;
        } catch (Exception e) {
            Exception exc = e;
            this.c.a("<-- HTTP FAILED: " + exc);
            throw exc;
        }
    }
}
