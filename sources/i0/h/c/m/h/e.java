package i0.h.c.m.h;

import i0.h.c.m.d;
import i0.h.c.m.f;
import i0.h.c.m.g;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: JsonDataEncoderBuilder */
public final class e {
    public static final a a = new a((d) null);
    public final Map<Class<?>, d<?>> b;
    public final Map<Class<?>, f<?>> c;
    public d<Object> d = a.a;
    public boolean e = false;

    /* compiled from: JsonDataEncoderBuilder */
    public static final class a implements f<Date> {
        public static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        public a(d dVar) {
        }

        public void a(Object obj, Object obj2) throws IOException {
            ((g) obj2).c(a.format((Date) obj));
        }
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        HashMap hashMap2 = new HashMap();
        this.c = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, b.a);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, c.a);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, a);
        hashMap.remove(cls3);
    }
}
