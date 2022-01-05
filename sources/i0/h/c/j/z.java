package i0.h.c.j;

import com.google.firebase.components.DependencyException;
import i0.h.c.n.c;
import i0.h.c.q.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RestrictedComponentContainer */
public final class z extends a {
    public final Set<Class<?>> a;
    public final Set<Class<?>> b;
    public final Set<Class<?>> c;
    public final Set<Class<?>> d;
    public final Set<Class<?>> e;
    public final e f;

    /* compiled from: RestrictedComponentContainer */
    public static class a implements c {
        public final c a;

        public a(Set<Class<?>> set, c cVar) {
            this.a = cVar;
        }
    }

    public z(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r next : dVar.b) {
            int i = next.c;
            boolean z = true;
            if (!(i == 0)) {
                if (i != 2 ? false : z) {
                    hashSet3.add(next.a);
                } else if (next.a()) {
                    hashSet5.add(next.a);
                } else {
                    hashSet2.add(next.a);
                }
            } else if (next.a()) {
                hashSet4.add(next.a);
            } else {
                hashSet.add(next.a);
            }
        }
        if (!dVar.f.isEmpty()) {
            hashSet.add(c.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.c = Collections.unmodifiableSet(hashSet4);
        this.d = Collections.unmodifiableSet(hashSet5);
        this.e = dVar.f;
        this.f = eVar;
    }

    public <T> T a(Class<T> cls) {
        if (this.a.contains(cls)) {
            T a2 = this.f.a(cls);
            if (!cls.equals(c.class)) {
                return a2;
            }
            return new a(this.e, (c) a2);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> b<T> b(Class<T> cls) {
        if (this.b.contains(cls)) {
            return this.f.b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> b<Set<T>> c(Class<T> cls) {
        if (this.d.contains(cls)) {
            return this.f.c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    public <T> Set<T> d(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.f.d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }
}
