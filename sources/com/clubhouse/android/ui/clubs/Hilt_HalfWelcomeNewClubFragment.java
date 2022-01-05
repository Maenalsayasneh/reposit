package com.clubhouse.android.ui.clubs;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.core.ui.BaseBottomSheetFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import h0.q.m0;
import i0.e.b.g3.l.c2;
import i0.j.f.p.h;
import j0.a.a.c.c.f;
import j0.a.b.b;

public abstract class Hilt_HalfWelcomeNewClubFragment extends BaseBottomSheetFragment implements b {
    public ContextWrapper l2;
    public volatile f m2;
    public final Object n2 = new Object();
    public boolean o2 = false;

    public Hilt_HalfWelcomeNewClubFragment(int i) {
        super(i);
    }

    public final void S0() {
        if (this.l2 == null) {
            this.l2 = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
        }
    }

    public void T0() {
        if (!this.o2) {
            this.o2 = true;
            ((c2) U()).B0((HalfWelcomeNewClubFragment) this);
        }
    }

    public final Object U() {
        if (this.m2 == null) {
            synchronized (this.n2) {
                if (this.m2 == null) {
                    this.m2 = new f(this);
                }
            }
        }
        return this.m2.U();
    }

    public Context getContext() {
        if (super.getContext() == null && this.l2 == null) {
            return null;
        }
        S0();
        return this.l2;
    }

    public m0.b getDefaultViewModelProviderFactory() {
        return h.f1(this, super.getDefaultViewModelProviderFactory());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        S0();
        T0();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(new ViewComponentManager$FragmentContextWrapper(super.onGetLayoutInflater(bundle), (Fragment) this));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.l2;
        h.D(contextWrapper == null || f.b(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S0();
        T0();
    }
}
