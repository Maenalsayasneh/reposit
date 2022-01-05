package t0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.networkv2.request.Header;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import m0.n.b.i;
import q0.b0;
import q0.d0;
import q0.u;
import q0.v;
import q0.w;
import q0.y;
import q0.z;
import r0.h;

/* compiled from: RequestBuilder */
public final class t {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern b = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String c;
    public final w d;
    public String e;
    public w.a f;
    public final b0.a g = new b0.a();
    public final v.a h;
    public y i;
    public final boolean j;
    public z.a k;
    public u.a l;
    public d0 m;

    /* compiled from: RequestBuilder */
    public static class a extends d0 {
        public final d0 b;
        public final y c;

        public a(d0 d0Var, y yVar) {
            this.b = d0Var;
            this.c = yVar;
        }

        public long a() throws IOException {
            return this.b.a();
        }

        public y b() {
            return this.c;
        }

        public void d(h hVar) throws IOException {
            this.b.d(hVar);
        }
    }

    public t(String str, w wVar, String str2, v vVar, y yVar, boolean z, boolean z2, boolean z3) {
        this.c = str;
        this.d = wVar;
        this.e = str2;
        this.i = yVar;
        this.j = z;
        if (vVar != null) {
            this.h = vVar.j();
        } else {
            this.h = new v.a();
        }
        if (z2) {
            this.l = new u.a();
        } else if (z3) {
            z.a aVar = new z.a((String) null, 1);
            this.k = aVar;
            aVar.d(z.c);
        }
    }

    public void a(String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        if (z) {
            u.a aVar = this.l;
            Objects.requireNonNull(aVar);
            i.e(str3, "name");
            i.e(str4, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            List<String> list = aVar.a;
            w.b bVar = w.b;
            list.add(w.b.a(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.c, 83));
            aVar.b.add(w.b.a(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.c, 83));
            return;
        }
        this.l.a(str3, str4);
    }

    public void b(String str, String str2) {
        if (Header.CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.i = y.b(str2);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException(i0.d.a.a.a.n0("Malformed content type: ", str2), e2);
            }
        } else {
            this.h.a(str, str2);
        }
    }

    public void c(String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        String str5 = this.e;
        String str6 = null;
        if (str5 != null) {
            w.a g2 = this.d.g(str5);
            this.f = g2;
            if (g2 != null) {
                this.e = null;
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0("Malformed URL. Base: ");
                P0.append(this.d);
                P0.append(", Relative: ");
                P0.append(this.e);
                throw new IllegalArgumentException(P0.toString());
            }
        }
        if (z) {
            w.a aVar = this.f;
            Objects.requireNonNull(aVar);
            i.e(str3, "encodedName");
            if (aVar.h == null) {
                aVar.h = new ArrayList();
            }
            List<String> list = aVar.h;
            i.c(list);
            w.b bVar = w.b;
            list.add(w.b.a(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211));
            List<String> list2 = aVar.h;
            i.c(list2);
            if (str4 != null) {
                str6 = w.b.a(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211);
            }
            list2.add(str6);
            return;
        }
        this.f.a(str3, str4);
    }
}
