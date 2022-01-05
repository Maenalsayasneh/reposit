package q0.h0.l.i;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import m0.j.g;
import m0.n.b.i;
import q0.a0;
import q0.h0.f.d;

/* compiled from: AndroidLog.kt */
public final class c {
    public static final CopyOnWriteArraySet<Logger> a = new CopyOnWriteArraySet<>();
    public static final Map<String, String> b;
    public static final c c = null;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package packageR = a0.class.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = a0.class.getName();
        i.d(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = q0.h0.j.c.class.getName();
        i.d(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = d.class.getName();
        i.d(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = g.y0(linkedHashMap);
    }
}
