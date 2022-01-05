package i0.h.a.d.a.b;

import android.content.Intent;
import android.os.Bundle;
import i0.h.a.b.c.m.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final /* synthetic */ class u0 implements e1 {
    public final f1 a;
    public final Bundle b;

    public u0(f1 f1Var, Bundle bundle) {
        this.a = f1Var;
        this.b = bundle;
    }

    public final Object a() {
        d1 d1Var;
        f1 f1Var = this.a;
        Bundle bundle = this.b;
        Objects.requireNonNull(f1Var);
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, c1> map = f1Var.f;
        Integer valueOf = Integer.valueOf(i);
        boolean z = false;
        if (map.containsKey(valueOf)) {
            c1 b2 = f1Var.b(i);
            int i2 = bundle.getInt(b.F("status", b2.c.a));
            if (p1.f(b2.c.c, i2)) {
                f1.a.b(3, "Found stale update for session %s with status %d.", new Object[]{valueOf, Integer.valueOf(b2.c.c)});
                b1 b1Var = b2.c;
                String str = b1Var.a;
                int i3 = b1Var.c;
                if (i3 == 4) {
                    f1Var.c.a().l(i, str);
                } else if (i3 == 5) {
                    f1Var.c.a().j(i);
                } else if (i3 == 6) {
                    f1Var.c.a().i(Arrays.asList(new String[]{str}));
                }
            } else {
                b2.c.c = i2;
                if (p1.d(i2)) {
                    f1Var.a(new z0(f1Var, i));
                    f1Var.d.a(b2.c.a);
                } else {
                    for (d1 next : b2.c.e) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b.G("chunk_intents", b2.c.a, next.a));
                        if (parcelableArrayList != null) {
                            for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                                if (!(parcelableArrayList.get(i4) == null || ((Intent) parcelableArrayList.get(i4)).getData() == null)) {
                                    next.d.get(i4).a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String c = f1.c(bundle);
            long j = bundle.getLong(b.F("pack_version", c));
            int i5 = bundle.getInt(b.F("status", c));
            long j2 = bundle.getLong(b.F("total_bytes_to_download", c));
            List<String> stringArrayList = bundle.getStringArrayList(b.F("slice_ids", c));
            ArrayList arrayList = new ArrayList();
            if (stringArrayList == null) {
                stringArrayList = Collections.emptyList();
            }
            for (String str2 : stringArrayList) {
                List<Intent> parcelableArrayList2 = bundle.getParcelableArrayList(b.G("chunk_intents", c, str2));
                ArrayList arrayList2 = new ArrayList();
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = Collections.emptyList();
                }
                for (Intent intent : parcelableArrayList2) {
                    if (intent != null) {
                        z = true;
                    }
                    arrayList2.add(new a1(z));
                    z = false;
                }
                String string = bundle.getString(b.G("uncompressed_hash_sha256", c, str2));
                long j3 = bundle.getLong(b.G("uncompressed_size", c, str2));
                int i6 = bundle.getInt(b.G("patch_format", c, str2), 0);
                if (i6 != 0) {
                    d1Var = new d1(str2, string, j3, arrayList2, 0, i6);
                    z = false;
                } else {
                    z = false;
                    d1Var = new d1(str2, string, j3, arrayList2, bundle.getInt(b.G("compression_format", c, str2), 0), 0);
                }
                arrayList.add(d1Var);
            }
            f1Var.f.put(Integer.valueOf(i), new c1(i, bundle.getInt("app_version_code"), new b1(c, j, i5, j2, arrayList)));
        }
        return Boolean.TRUE;
    }
}
