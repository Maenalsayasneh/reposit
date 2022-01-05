package s0.c;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.NOPLogger;
import org.slf4j.impl.StaticLoggerBinder;
import s0.c.e.a;
import s0.c.e.b;
import s0.c.e.d;

/* compiled from: LoggerFactory */
public final class c {
    public static volatile int a;
    public static final s0.c.e.c b = new s0.c.e.c();
    public static final a c = new a();
    public static boolean d;
    public static final String[] e = {"1.6", "1.7"};
    public static String f = "org/slf4j/impl/StaticLoggerBinder.class";

    static {
        boolean z;
        String str = null;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
        }
        if (str == null) {
            z = false;
        } else {
            z = str.equalsIgnoreCase("true");
        }
        d = z;
    }

    public static final void a() {
        Set<URL> set;
        try {
            if (!g()) {
                set = b();
                j(set);
            } else {
                set = null;
            }
            StaticLoggerBinder.getSingleton();
            a = 3;
            i(set);
            c();
            h();
            s0.c.e.c cVar = b;
            cVar.b.clear();
            cVar.c.clear();
        } catch (NoClassDefFoundError e2) {
            String message = e2.getMessage();
            boolean z = false;
            if (message != null && (message.contains("org/slf4j/impl/StaticLoggerBinder") || message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                z = true;
            }
            if (z) {
                a = 4;
                d.a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                d.a("Defaulting to no-operation (NOP) logger implementation");
                d.a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                return;
            }
            a = 2;
            d.b("Failed to instantiate SLF4J LoggerFactory", e2);
            throw e2;
        } catch (NoSuchMethodError e3) {
            String message2 = e3.getMessage();
            if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                a = 2;
                d.a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                d.a("Your binding is version 1.5.5 or earlier.");
                d.a("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        } catch (Exception e4) {
            a = 2;
            d.b("Failed to instantiate SLF4J LoggerFactory", e4);
            throw new IllegalStateException("Unexpected initialization failure", e4);
        }
    }

    public static Set<URL> b() {
        Enumeration<URL> enumeration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = c.class.getClassLoader();
            if (classLoader == null) {
                enumeration = ClassLoader.getSystemResources(f);
            } else {
                enumeration = classLoader.getResources(f);
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
        } catch (IOException e2) {
            d.b("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    public static void c() {
        s0.c.e.c cVar = b;
        synchronized (cVar) {
            cVar.a = true;
            Objects.requireNonNull(cVar);
            Iterator it = new ArrayList(cVar.b.values()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                bVar.d = f(bVar.c);
            }
        }
    }

    public static a d() {
        if (a == 0) {
            synchronized (c.class) {
                if (a == 0) {
                    a = 1;
                    a();
                    if (a == 3) {
                        k();
                    }
                }
            }
        }
        int i = a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        } else {
            if (i == 4) {
                return c;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    public static b e(Class<?> cls) {
        int i;
        b a2 = d().a(cls.getName());
        if (d) {
            d.b bVar = d.a;
            Class cls2 = null;
            if (bVar == null) {
                if (d.b) {
                    bVar = null;
                } else {
                    try {
                        bVar = new d.b((d.a) null);
                    } catch (SecurityException unused) {
                        bVar = null;
                    }
                    d.a = bVar;
                    d.b = true;
                }
            }
            if (bVar != null) {
                Class[] classContext = bVar.getClassContext();
                String name = d.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && (!cls2.isAssignableFrom(cls))) {
                d.a(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", new Object[]{a2.getName(), cls2.getName()}));
                d.a("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return a2;
    }

    public static b f(String str) {
        return d().a(str);
    }

    public static boolean g() {
        String str;
        try {
            str = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        return str.toLowerCase().contains("android");
    }

    public static void h() {
        LinkedBlockingQueue<s0.c.d.c> linkedBlockingQueue = b.c;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s0.c.d.c cVar = (s0.c.d.c) it.next();
                if (cVar != null) {
                    b bVar = cVar.a;
                    String str = bVar.c;
                    if (bVar.d == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    } else if (!(bVar.d instanceof NOPLogger)) {
                        if (!bVar.e()) {
                            d.a(str);
                        } else if (bVar.e()) {
                            try {
                                bVar.x.invoke(bVar.d, new Object[]{cVar});
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (cVar.a.e()) {
                        d.a("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        d.a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        d.a("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(cVar.a.d instanceof NOPLogger)) {
                        d.a("The following set of substitute loggers may have been accessed");
                        d.a("during the initialization phase. Logging calls during this");
                        d.a("phase were not honored. However, subsequent logging calls to these");
                        d.a("loggers will work as normally expected.");
                        d.a("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    public static void i(Set<URL> set) {
        if (set != null) {
            boolean z = true;
            if (set.size() <= 1) {
                z = false;
            }
            if (z) {
                StringBuilder P0 = i0.d.a.a.a.P0("Actual binding is of type [");
                P0.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                P0.append("]");
                d.a(P0.toString());
            }
        }
    }

    public static void j(Set<URL> set) {
        boolean z = true;
        if (set.size() <= 1) {
            z = false;
        }
        if (z) {
            d.a("Class path contains multiple SLF4J bindings.");
            for (URL url : set) {
                d.a("Found binding in [" + url + "]");
            }
            d.a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void k() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String startsWith : e) {
                if (str.startsWith(startsWith)) {
                    z = true;
                }
            }
            if (!z) {
                d.a("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(e).toString());
                d.a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            d.b("Unexpected problem occured during version sanity check", th);
        }
    }
}
