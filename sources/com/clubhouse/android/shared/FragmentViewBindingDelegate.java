package com.clubhouse.android.shared;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import h0.e0.a;
import h0.q.p;
import h0.q.r;
import java.lang.reflect.Method;
import java.util.Objects;
import m0.n.b.i;
import m0.o.c;
import m0.r.k;

/* compiled from: FragmentViewBindingDelegate.kt */
public final class FragmentViewBindingDelegate<T extends a> implements c<Fragment, T> {
    public final Class<T> a;
    public final Fragment b;
    public T c;
    public final Method d;

    public FragmentViewBindingDelegate(Class<T> cls, Fragment fragment) {
        i.e(cls, "bindingClass");
        i.e(fragment, "fragment");
        this.a = cls;
        this.b = fragment;
        this.d = cls.getMethod("bind", new Class[]{View.class});
    }

    /* renamed from: a */
    public T getValue(Fragment fragment, k<?> kVar) {
        i.e(fragment, "thisRef");
        i.e(kVar, "property");
        T t = this.c;
        if (t != null) {
            return t;
        }
        Lifecycle lifecycle = this.b.getViewLifecycleOwner().getLifecycle();
        i.d(lifecycle, "fragment.viewLifecycleOwner.lifecycle");
        r rVar = (r) lifecycle;
        if (rVar.c.isAtLeast(Lifecycle.State.INITIALIZED)) {
            Fragment fragment2 = this.b;
            LiveData<p> viewLifecycleOwnerLiveData = fragment2.getViewLifecycleOwnerLiveData();
            i.d(viewLifecycleOwnerLiveData, "viewLifecycleOwnerLiveData");
            viewLifecycleOwnerLiveData.observe(fragment2, new FragmentViewBindingDelegate$getValue$$inlined$observeDestroy$1(this));
            T invoke = this.d.invoke((Object) null, new Object[]{fragment.requireView()});
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type T of com.clubhouse.android.shared.FragmentViewBindingDelegate");
            T t2 = (a) invoke;
            this.c = t2;
            i.c(t2);
            return t2;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Cannot access view bindings. View lifecycle is ");
        P0.append(rVar.c);
        P0.append('!');
        throw new IllegalStateException(P0.toString().toString());
    }
}
