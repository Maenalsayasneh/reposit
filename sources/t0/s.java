package t0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Platform */
public class s {
    public static final s a;
    public final boolean b;
    public final Constructor<MethodHandles.Lookup> c;

    /* compiled from: Platform */
    public static final class a extends s {

        /* renamed from: t0.s$a$a  reason: collision with other inner class name */
        /* compiled from: Platform */
        public static final class C0308a implements Executor {
            public final Handler c = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.c.post(runnable);
            }
        }

        public a() {
            super(true);
        }

        public Executor a() {
            return new C0308a();
        }

        public Object b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return s.super.b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        s sVar;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            sVar = new a();
        } else {
            sVar = new s(true);
        }
        a = sVar;
    }

    public s(boolean z) {
        this.b = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.c = constructor;
    }

    public Executor a() {
        return null;
    }

    @IgnoreJRERequirement
    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.c;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
