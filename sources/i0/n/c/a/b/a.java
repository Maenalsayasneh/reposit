package i0.n.c.a.b;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.networkv2.request.Header;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.j.g;
import m0.n.b.i;
import q0.b0;
import q0.d0;
import q0.h0.c;
import q0.v;
import q0.w;

/* compiled from: AppKeyAuthorizationMethod.kt */
public final class a implements c {
    public final String a;

    public a(String str) {
        i.e(str, "appKey");
        this.a = str;
    }

    public b0 a(b0 b0Var) {
        Map<Class<?>, Object> map;
        Map map2;
        i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        new LinkedHashMap();
        w wVar = b0Var.b;
        String str = b0Var.c;
        d0 d0Var = b0Var.e;
        if (b0Var.f.isEmpty()) {
            map = new LinkedHashMap<>();
        } else {
            map = g.B0(b0Var.f);
        }
        v.a j = b0Var.d.j();
        StringBuilder P0 = i0.d.a.a.a.P0("Application ");
        P0.append(this.a);
        String sb = P0.toString();
        i.e(Header.AUTHORIZATION, "name");
        i.e(sb, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        j.a(Header.AUTHORIZATION, sb);
        if (wVar != null) {
            v d = j.d();
            byte[] bArr = c.a;
            i.e(map, "$this$toImmutableMap");
            if (map.isEmpty()) {
                map2 = g.o();
            } else {
                map2 = Collections.unmodifiableMap(new LinkedHashMap(map));
                i.d(map2, "Collections.unmodifiableMap(LinkedHashMap(this))");
            }
            return new b0(wVar, str, d, d0Var, map2);
        }
        throw new IllegalStateException("url == null".toString());
    }
}
