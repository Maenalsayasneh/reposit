package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import i0.h.c.f;
import i0.h.c.g;
import i0.h.c.j.d;
import i0.h.c.j.h;
import i0.h.c.j.r;
import i0.h.c.u.b;
import i0.h.c.u.e;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements h {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<d<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        d.b<i0.h.c.u.h> a = d.a(i0.h.c.u.h.class);
        a.a(new r(e.class, 2, 0));
        a.d(b.a);
        arrayList.add(a.c());
        int i = i0.h.c.o.d.a;
        d.b<HeartBeatInfo> a2 = d.a(HeartBeatInfo.class);
        a2.a(new r(Context.class, 1, 0));
        a2.a(new r(i0.h.c.o.e.class, 2, 0));
        a2.d(i0.h.c.o.b.a);
        arrayList.add(a2.c());
        arrayList.add(i0.h.a.b.c.m.b.x("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(i0.h.a.b.c.m.b.x("fire-core", "19.5.0"));
        arrayList.add(i0.h.a.b.c.m.b.x("device-name", a(Build.PRODUCT)));
        arrayList.add(i0.h.a.b.c.m.b.x("device-model", a(Build.DEVICE)));
        arrayList.add(i0.h.a.b.c.m.b.x("device-brand", a(Build.BRAND)));
        arrayList.add(i0.h.a.b.c.m.b.I("android-target-sdk", i0.h.c.d.a));
        arrayList.add(i0.h.a.b.c.m.b.I("android-min-sdk", i0.h.c.e.a));
        arrayList.add(i0.h.a.b.c.m.b.I("android-platform", f.a));
        arrayList.add(i0.h.a.b.c.m.b.I("android-installer", g.a));
        try {
            str = m0.b.c.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(i0.h.a.b.c.m.b.x("kotlin", str));
        }
        return arrayList;
    }
}
