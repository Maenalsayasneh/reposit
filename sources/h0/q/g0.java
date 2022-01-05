package h0.q;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleController;
import h0.q.m0;
import h0.x.a;
import h0.x.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: SavedStateViewModelFactory */
public final class g0 extends m0.c {
    public static final Class<?>[] a;
    public static final Class<?>[] b;
    public final Application c;
    public final m0.b d;
    public final Bundle e;
    public final Lifecycle f;
    public final a g;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<h0.q.f0> r0 = h0.q.f0.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            a = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]
            r1[r3] = r0
            b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.q.g0.<clinit>():void");
    }

    @SuppressLint({"LambdaLast"})
    public g0(Application application, c cVar, Bundle bundle) {
        m0.b bVar;
        this.g = cVar.getSavedStateRegistry();
        this.f = cVar.getLifecycle();
        this.e = bundle;
        this.c = application;
        if (application != null) {
            if (m0.a.b == null) {
                m0.a.b = new m0.a(application);
            }
            bVar = m0.a.b;
        } else {
            if (m0.d.a == null) {
                m0.d.a = new m0.d();
            }
            bVar = m0.d.a;
        }
        this.d = bVar;
    }

    public static <T> Constructor<T> a(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<T> constructor : cls.getConstructors()) {
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    public <T extends k0> T create(String str, Class<T> cls) {
        Constructor<T> constructor;
        T t;
        boolean isAssignableFrom = b.class.isAssignableFrom(cls);
        if (!isAssignableFrom || this.c == null) {
            constructor = a(cls, b);
        } else {
            constructor = a(cls, a);
        }
        if (constructor == null) {
            return this.d.create(cls);
        }
        SavedStateHandleController d2 = SavedStateHandleController.d(this.g, this.f, str, this.e);
        if (isAssignableFrom) {
            try {
                Application application = this.c;
                if (application != null) {
                    t = (k0) constructor.newInstance(new Object[]{application, d2.q});
                    t.setTagIfAbsent(a.TAG_SAVED_STATE_HANDLE_CONTROLLER, d2);
                    return t;
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to access " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
            }
        }
        t = (k0) constructor.newInstance(new Object[]{d2.q});
        t.setTagIfAbsent(a.TAG_SAVED_STATE_HANDLE_CONTROLLER, d2);
        return t;
    }

    public void onRequery(k0 k0Var) {
        SavedStateHandleController.b(k0Var, this.g, this.f);
    }

    public <T extends k0> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return create(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
