package androidx.versionedparcelable;

import android.os.Parcelable;
import h0.d0.b;
import h0.f.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class VersionedParcel {
    public final a<String, Method> a;
    public final a<String, Method> b;
    public final a<String, Class> c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public abstract void a();

    public abstract VersionedParcel b();

    public final Class c(Class<? extends b> cls) throws ClassNotFoundException {
        Class orDefault = this.c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<VersionedParcel> cls = VersionedParcel.class;
        Method orDefault = this.a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class c2 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c2.getDeclaredMethod("write", new Class[]{cls, VersionedParcel.class});
        this.b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean f();

    public abstract byte[] g();

    public abstract CharSequence h();

    public abstract boolean i(int i);

    public abstract int j();

    public int k(int i, int i2) {
        if (!i(i2)) {
            return i;
        }
        return j();
    }

    public abstract <T extends Parcelable> T l();

    public <T extends Parcelable> T m(T t, int i) {
        if (!i(i)) {
            return t;
        }
        return l();
    }

    public abstract String n();

    public <T extends b> T o() {
        String n = n();
        if (n == null) {
            return null;
        }
        VersionedParcel b2 = b();
        try {
            return (b) d(n).invoke((Object) null, new Object[]{b2});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public abstract void p(int i);

    public abstract void q(boolean z);

    public abstract void r(byte[] bArr);

    public abstract void s(CharSequence charSequence);

    public abstract void t(int i);

    public abstract void u(Parcelable parcelable);

    public abstract void v(String str);

    public void w(b bVar) {
        if (bVar == null) {
            v((String) null);
            return;
        }
        try {
            v(c(bVar.getClass()).getName());
            VersionedParcel b2 = b();
            try {
                e(bVar.getClass()).invoke((Object) null, new Object[]{bVar, b2});
                b2.a();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }
}
