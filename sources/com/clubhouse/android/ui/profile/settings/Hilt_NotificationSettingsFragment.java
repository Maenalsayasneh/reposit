package com.clubhouse.android.ui.profile.settings;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.core.ui.BaseFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import h0.q.m0;
import i0.e.b.g3.u.z5.x0;
import i0.j.f.p.h;
import j0.a.a.c.c.f;
import j0.a.b.b;

public abstract class Hilt_NotificationSettingsFragment extends BaseFragment implements b {
    public boolean Y1 = false;
    public ContextWrapper q;
    public volatile f x;
    public final Object y = new Object();

    public Hilt_NotificationSettingsFragment(int i) {
        super(i);
    }

    public final void L0() {
        if (this.q == null) {
            this.q = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
        }
    }

    public void M0() {
        if (!this.Y1) {
            this.Y1 = true;
            ((x0) U()).z0((NotificationSettingsFragment) this);
        }
    }

    public final Object U() {
        if (this.x == null) {
            synchronized (this.y) {
                if (this.x == null) {
                    this.x = new f(this);
                }
            }
        }
        return this.x.U();
    }

    public Context getContext() {
        if (super.getContext() == null && this.q == null) {
            return null;
        }
        L0();
        return this.q;
    }

    public m0.b getDefaultViewModelProviderFactory() {
        return h.f1(this, super.getDefaultViewModelProviderFactory());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        L0();
        M0();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(new ViewComponentManager$FragmentContextWrapper(super.onGetLayoutInflater(bundle), (Fragment) this));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.q;
        h.D(contextWrapper == null || f.b(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        L0();
        M0();
    }
}
