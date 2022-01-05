package com.clubhouse.android.ui.channels.users.search;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.shared.ui.AbstractUserFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import h0.q.m0;
import i0.e.b.g3.k.w0.d.c;
import i0.j.f.p.h;
import j0.a.a.c.c.f;
import j0.a.b.b;

public abstract class Hilt_SearchInRoomFragment<T> extends AbstractUserFragment<T> implements b {
    public ContextWrapper n2;
    public volatile f o2;
    public final Object p2 = new Object();
    public boolean q2 = false;

    public final Object U() {
        if (this.o2 == null) {
            synchronized (this.p2) {
                if (this.o2 == null) {
                    this.o2 = new f(this);
                }
            }
        }
        return this.o2.U();
    }

    public final void V0() {
        if (this.n2 == null) {
            this.n2 = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
        }
    }

    public void W0() {
        if (!this.q2) {
            this.q2 = true;
            ((c) U()).y((SearchInRoomFragment) this);
        }
    }

    public Context getContext() {
        if (super.getContext() == null && this.n2 == null) {
            return null;
        }
        V0();
        return this.n2;
    }

    public m0.b getDefaultViewModelProviderFactory() {
        return h.f1(this, super.getDefaultViewModelProviderFactory());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        V0();
        W0();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(new ViewComponentManager$FragmentContextWrapper(super.onGetLayoutInflater(bundle), (Fragment) this));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.n2;
        h.D(contextWrapper == null || f.b(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        V0();
        W0();
    }
}
