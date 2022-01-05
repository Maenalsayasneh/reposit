package com.clubhouse.android.ui.clubs;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.ui.common.PhotoCreationFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import h0.q.m0;
import i0.e.b.g3.l.p1;
import i0.j.f.p.h;
import j0.a.a.c.c.f;
import j0.a.b.b;

public abstract class Hilt_ClubFragment extends PhotoCreationFragment implements b {
    public ContextWrapper a2;
    public volatile f b2;
    public final Object c2 = new Object();
    public boolean d2 = false;

    public Hilt_ClubFragment(int i) {
        super(i);
    }

    public final void P0() {
        if (this.a2 == null) {
            this.a2 = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
        }
    }

    public void Q0() {
        if (!this.d2) {
            this.d2 = true;
            ((p1) U()).r((ClubFragment) this);
        }
    }

    public final Object U() {
        if (this.b2 == null) {
            synchronized (this.c2) {
                if (this.b2 == null) {
                    this.b2 = new f(this);
                }
            }
        }
        return this.b2.U();
    }

    public Context getContext() {
        if (super.getContext() == null && this.a2 == null) {
            return null;
        }
        P0();
        return this.a2;
    }

    public m0.b getDefaultViewModelProviderFactory() {
        return h.f1(this, super.getDefaultViewModelProviderFactory());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        P0();
        Q0();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(new ViewComponentManager$FragmentContextWrapper(super.onGetLayoutInflater(bundle), (Fragment) this));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.a2;
        h.D(contextWrapper == null || f.b(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        P0();
        Q0();
    }
}
