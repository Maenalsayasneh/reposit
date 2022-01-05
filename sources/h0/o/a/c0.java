package h0.o.a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import h0.i.i.q;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentTransaction */
public abstract class c0 {
    public final s a;
    public final ClassLoader b;
    public ArrayList<a> c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList<String> p;
    public ArrayList<String> q;
    public boolean r;

    /* compiled from: FragmentTransaction */
    public static final class a {
        public int a;
        public Fragment b;
        public int c;
        public int d;
        public int e;
        public int f;
        public Lifecycle.State g;
        public Lifecycle.State h;

        public a() {
        }

        public a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.g = state;
            this.h = state;
        }

        public a(int i, Fragment fragment, Lifecycle.State state) {
            this.a = i;
            this.b = fragment;
            this.g = fragment.mMaxState;
            this.h = state;
        }
    }

    @Deprecated
    public c0() {
        this.c = new ArrayList<>();
        this.j = true;
        this.r = false;
        this.a = null;
        this.b = null;
    }

    public c0 b(int i2, Fragment fragment) {
        m(i2, fragment, (String) null, 1);
        return this;
    }

    public c0 c(Fragment fragment, String str) {
        m(0, fragment, str, 1);
        return this;
    }

    public final c0 d(Class<? extends Fragment> cls, Bundle bundle, String str) {
        c(k(cls, bundle), (String) null);
        return this;
    }

    public void e(a aVar) {
        this.c.add(aVar);
        aVar.c = this.d;
        aVar.d = this.e;
        aVar.e = this.f;
        aVar.f = this.g;
    }

    public c0 f(View view, String str) {
        int[] iArr = j0.a;
        AtomicInteger atomicInteger = q.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (this.p == null) {
                this.p = new ArrayList<>();
                this.q = new ArrayList<>();
            } else if (this.q.contains(str)) {
                throw new IllegalArgumentException(i0.d.a.a.a.o0("A shared element with the target name '", str, "' has already been added to the transaction."));
            } else if (this.p.contains(transitionName)) {
                throw new IllegalArgumentException(i0.d.a.a.a.o0("A shared element with the source name '", transitionName, "' has already been added to the transaction."));
            }
            this.p.add(transitionName);
            this.q.add(str);
            return this;
        }
        throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
    }

    public c0 g(String str) {
        if (this.j) {
            this.i = true;
            this.k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public final Fragment k(Class<? extends Fragment> cls, Bundle bundle) {
        s sVar = this.a;
        if (sVar != null) {
            ClassLoader classLoader = this.b;
            if (classLoader != null) {
                Fragment instantiate = sVar.instantiate(classLoader, cls.getName());
                if (bundle != null) {
                    instantiate.setArguments(bundle);
                }
                return instantiate;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    public c0 l(Fragment fragment) {
        e(new a(6, fragment));
        return this;
    }

    public void m(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder P0 = i0.d.a.a.a.P0("Fragment ");
            P0.append(cls.getCanonicalName());
            P0.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(P0.toString());
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 == null || str.equals(str2)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(i0.d.a.a.a.z0(sb, fragment.mTag, " now ", str));
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.mFragmentId;
                if (i4 == 0 || i4 == i2) {
                    fragment.mFragmentId = i2;
                    fragment.mContainerId = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        e(new a(i3, fragment));
    }

    public c0 n(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public c0 o(int i2, Fragment fragment, String str) {
        if (i2 != 0) {
            m(i2, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final c0 p(int i2, Class<? extends Fragment> cls, Bundle bundle) {
        o(i2, k(cls, bundle), (String) null);
        return this;
    }

    public c0 q(int i2, int i3) {
        this.d = i2;
        this.e = i3;
        this.f = 0;
        this.g = 0;
        return this;
    }

    public c0 r(int i2, int i3, int i4, int i5) {
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        return this;
    }

    public c0 s(Fragment fragment, Lifecycle.State state) {
        e(new a(10, fragment, state));
        return this;
    }

    public c0 t(Fragment fragment) {
        e(new a(8, fragment));
        return this;
    }

    public c0(s sVar, ClassLoader classLoader) {
        this.c = new ArrayList<>();
        this.j = true;
        this.r = false;
        this.a = sVar;
        this.b = classLoader;
    }
}
