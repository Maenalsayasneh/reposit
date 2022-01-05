package q0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import m0.n.b.i;
import q0.h0.c;
import q0.w;
import q0.y;
import r0.f;
import r0.h;

/* compiled from: FormBody.kt */
public final class u extends d0 {
    public static final y b = y.a.a("application/x-www-form-urlencoded");
    public final List<String> c;
    public final List<String> d;

    /* compiled from: FormBody.kt */
    public static final class a {
        public final List<String> a = new ArrayList();
        public final List<String> b = new ArrayList();
        public final Charset c = null;

        public final a a(String str, String str2) {
            i.e(str, "name");
            i.e(str2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            List<String> list = this.a;
            w.b bVar = w.b;
            list.add(w.b.a(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.c, 91));
            this.b.add(w.b.a(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.c, 91));
            return this;
        }
    }

    static {
        y.a aVar = y.c;
    }

    public u(List<String> list, List<String> list2) {
        i.e(list, "encodedNames");
        i.e(list2, "encodedValues");
        this.c = c.x(list);
        this.d = c.x(list2);
    }

    public long a() {
        return e((h) null, true);
    }

    public y b() {
        return b;
    }

    public void d(h hVar) throws IOException {
        i.e(hVar, "sink");
        e(hVar, false);
    }

    public final long e(h hVar, boolean z) {
        f fVar;
        if (z) {
            fVar = new f();
        } else {
            i.c(hVar);
            fVar = hVar.c();
        }
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                fVar.I(38);
            }
            fVar.U(this.c.get(i));
            fVar.I(61);
            fVar.U(this.d.get(i));
        }
        if (!z) {
            return 0;
        }
        long j = fVar.d;
        fVar.skip(j);
        return j;
    }
}
