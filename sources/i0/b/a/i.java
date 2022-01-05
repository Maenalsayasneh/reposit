package i0.b.a;

import com.airbnb.epoxy.NoOpControllerHelper;
import i0.d.a.a.a;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: ControllerHelperLookup */
public class i {
    public static final Map<Class<?>, Constructor<?>> a = new LinkedHashMap();
    public static final NoOpControllerHelper b = new NoOpControllerHelper();

    public static Constructor<?> a(Class<?> cls) {
        Constructor<?> constructor;
        Map<Class<?>, Constructor<?>> map = a;
        Constructor<?> constructor2 = map.get(cls);
        if (constructor2 != null || map.containsKey(cls)) {
            return constructor2;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.")) {
            return null;
        }
        try {
            constructor = Class.forName(name + "_EpoxyHelper").getConstructor(new Class[]{cls});
        } catch (ClassNotFoundException unused) {
            constructor = a(cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(a.n0("Unable to find Epoxy Helper constructor for ", name), e);
        }
        a.put(cls, constructor);
        return constructor;
    }
}
