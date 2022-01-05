package h0.o.a;

import androidx.fragment.app.Fragment;
import h0.f.h;
import i0.d.a.a.a;
import java.lang.reflect.InvocationTargetException;

/* compiled from: FragmentFactory */
public class s {
    private static final h<ClassLoader, h<String, Class<?>>> sClassCacheMap = new h<>();

    public static boolean isFragmentClass(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(loadClass(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> loadClass(ClassLoader classLoader, String str) throws ClassNotFoundException {
        h<ClassLoader, h<String, Class<?>>> hVar = sClassCacheMap;
        h orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new h();
            hVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> loadFragmentClass(ClassLoader classLoader, String str) {
        try {
            return loadClass(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.InstantiationException(a.o0("Unable to instantiate fragment ", str, ": make sure class name exists"), e);
        } catch (ClassCastException e2) {
            throw new Fragment.InstantiationException(a.o0("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        }
    }

    public Fragment instantiate(ClassLoader classLoader, String str) {
        try {
            return (Fragment) loadFragmentClass(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new Fragment.InstantiationException(a.o0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (IllegalAccessException e2) {
            throw new Fragment.InstantiationException(a.o0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.InstantiationException(a.o0("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.InstantiationException(a.o0("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
