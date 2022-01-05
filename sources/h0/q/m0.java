package h0.q;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewModelProvider */
public class m0 {
    public final b a;
    public final n0 b;

    /* compiled from: ViewModelProvider */
    public static class a extends d {
        public static a b;
        public Application c;

        public a(Application application) {
            this.c = application;
        }

        public <T extends k0> T create(Class<T> cls) {
            if (!b.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                return (k0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.c});
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    /* compiled from: ViewModelProvider */
    public interface b {
        <T extends k0> T create(Class<T> cls);
    }

    /* compiled from: ViewModelProvider */
    public static abstract class c extends e implements b {
        public <T extends k0> T create(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends k0> T create(String str, Class<T> cls);
    }

    /* compiled from: ViewModelProvider */
    public static class d implements b {
        public static d a;

        public <T extends k0> T create(Class<T> cls) {
            try {
                return (k0) cls.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    /* compiled from: ViewModelProvider */
    public static class e {
        public void onRequery(k0 k0Var) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m0(h0.q.o0 r3) {
        /*
            r2 = this;
            h0.q.n0 r0 = r3.getViewModelStore()
            boolean r1 = r3 instanceof h0.q.l
            if (r1 == 0) goto L_0x000f
            h0.q.l r3 = (h0.q.l) r3
            h0.q.m0$b r3 = r3.getDefaultViewModelProviderFactory()
            goto L_0x001c
        L_0x000f:
            h0.q.m0$d r3 = h0.q.m0.d.a
            if (r3 != 0) goto L_0x001a
            h0.q.m0$d r3 = new h0.q.m0$d
            r3.<init>()
            h0.q.m0.d.a = r3
        L_0x001a:
            h0.q.m0$d r3 = h0.q.m0.d.a
        L_0x001c:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.q.m0.<init>(h0.q.o0):void");
    }

    public <T extends k0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends k0> T b(String str, Class<T> cls) {
        T t;
        T t2 = (k0) this.b.a.get(str);
        if (cls.isInstance(t2)) {
            b bVar = this.a;
            if (bVar instanceof e) {
                ((e) bVar).onRequery(t2);
            }
            return t2;
        }
        b bVar2 = this.a;
        if (bVar2 instanceof c) {
            t = ((c) bVar2).create(str, cls);
        } else {
            t = bVar2.create(cls);
        }
        k0 put = this.b.a.put(str, t);
        if (put != null) {
            put.onCleared();
        }
        return t;
    }

    public m0(n0 n0Var, b bVar) {
        this.a = bVar;
        this.b = n0Var;
    }
}
