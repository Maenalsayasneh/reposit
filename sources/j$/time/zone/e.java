package j$.time.zone;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class e {
    private static final CopyOnWriteArrayList a;
    private static final ConcurrentMap b = new ConcurrentHashMap(512, 0.75f, 2);

    class a implements PrivilegedAction<Object> {
        final /* synthetic */ List a;

        a(List list) {
            this.a = list;
        }

        public Object run() {
            Class<e> cls = e.class;
            String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
            if (property != null) {
                try {
                    e cast = cls.cast(Class.forName(property, true, cls.getClassLoader()).newInstance());
                    e.e(cast);
                    this.a.add(cast);
                    return null;
                } catch (Exception e) {
                    throw new Error(e);
                }
            } else {
                e.e(new b());
                return null;
            }
        }
    }

    private static final class b extends e {
        private final Set c;

        b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (String add : TimeZone.getAvailableIDs()) {
                linkedHashSet.add(add);
            }
            this.c = Collections.unmodifiableSet(linkedHashSet);
        }

        /* access modifiers changed from: protected */
        public c c(String str, boolean z) {
            if (this.c.contains(str)) {
                return new c(TimeZone.getTimeZone(str));
            }
            throw new d("Not a built-in time zone: " + str);
        }

        /* access modifiers changed from: protected */
        public Set d() {
            return this.c;
        }
    }

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        a = copyOnWriteArrayList;
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new a(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    protected e() {
    }

    public static Set a() {
        return new HashSet(b.keySet());
    }

    public static c b(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentMap concurrentMap = b;
        e eVar = (e) concurrentMap.get(str);
        if (eVar != null) {
            return eVar.c(str, z);
        }
        if (concurrentMap.isEmpty()) {
            throw new d("No time-zone data files registered");
        }
        throw new d("Unknown time-zone ID: " + str);
    }

    public static void e(e eVar) {
        Objects.requireNonNull(eVar, "provider");
        for (String str : eVar.d()) {
            Objects.requireNonNull(str, "zoneId");
            if (((e) b.putIfAbsent(str, eVar)) != null) {
                throw new d("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + eVar);
            }
        }
        a.add(eVar);
    }

    /* access modifiers changed from: protected */
    public abstract c c(String str, boolean z);

    /* access modifiers changed from: protected */
    public abstract Set d();
}
