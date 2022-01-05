package com.clubhouse.android.ui.profile.settings;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.ui.common.topics.TopicsFragment;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import i0.e.b.g3.u.z5.t0;
import i0.j.f.p.h;
import j0.a.a.c.c.f;

public abstract class Hilt_EditTopicsFragment extends TopicsFragment {
    public ContextWrapper b2;
    public boolean c2 = false;

    public Hilt_EditTopicsFragment(int i) {
        super(i);
    }

    private void L0() {
        if (this.b2 == null) {
            this.b2 = new ViewComponentManager$FragmentContextWrapper(super.getContext(), (Fragment) this);
        }
    }

    public void M0() {
        if (!this.c2) {
            this.c2 = true;
            ((t0) U()).D((EditTopicsFragment) this);
        }
    }

    public Context getContext() {
        if (super.getContext() == null && this.b2 == null) {
            return null;
        }
        L0();
        return this.b2;
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
        ContextWrapper contextWrapper = this.b2;
        h.D(contextWrapper == null || f.b(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        L0();
        M0();
    }
}
