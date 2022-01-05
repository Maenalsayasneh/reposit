package m0.r.t.a.r.h;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField */
public class g extends h {

    /* compiled from: LazyField */
    public static class b<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, g> c;

        public b(Map.Entry entry, a aVar) {
            this.c = entry;
        }

        public K getKey() {
            return this.c.getKey();
        }

        public Object getValue() {
            g value = this.c.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        public Object setValue(Object obj) {
            if (obj instanceof l) {
                g value = this.c.getValue();
                l lVar = value.b;
                value.b = (l) obj;
                value.a = true;
                return lVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* compiled from: LazyField */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {
        public Iterator<Map.Entry<K, Object>> c;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.c = it;
        }

        public boolean hasNext() {
            return this.c.hasNext();
        }

        public Object next() {
            Map.Entry next = this.c.next();
            return next.getValue() instanceof g ? new b(next, (a) null) : next;
        }

        public void remove() {
            this.c.remove();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m0.r.t.a.r.h.l a() {
        /*
            r1 = this;
            m0.r.t.a.r.h.l r0 = r1.b
            if (r0 == 0) goto L_0x0005
            goto L_0x0010
        L_0x0005:
            monitor-enter(r1)
            m0.r.t.a.r.h.l r0 = r1.b     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0010
        L_0x000c:
            r0 = 0
            r1.b = r0     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
        L_0x0010:
            m0.r.t.a.r.h.l r0 = r1.b
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.h.g.a():m0.r.t.a.r.h.l");
    }

    public boolean equals(Object obj) {
        return a().equals(obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
