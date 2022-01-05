package i0.h.c.j;

import android.util.Log;
import com.google.firebase.components.InvalidRegistrarException;
import i0.h.c.q.b;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ComponentDiscovery */
public final /* synthetic */ class f implements b {
    public final String a;

    public f(String str) {
        this.a = str;
    }

    public Object get() {
        String str = this.a;
        try {
            Class<?> cls = Class.forName(str);
            if (h.class.isAssignableFrom(cls)) {
                return (h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }
}
