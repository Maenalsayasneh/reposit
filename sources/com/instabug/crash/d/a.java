package com.instabug.crash.d;

/* compiled from: CrashSettings */
public class a {
    public static a a;

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
            aVar = a;
        }
        return aVar;
    }
}
