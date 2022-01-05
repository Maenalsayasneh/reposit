package com.clubhouse.android.ui.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clubhouse.android.databinding.FragmentProfileBinding;
import com.clubhouse.app.R;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$fullProfileBinding$2 extends Lambda implements a<FragmentProfileBinding> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$fullProfileBinding$2(HalfProfileFragment halfProfileFragment) {
        super(0);
        this.c = halfProfileFragment;
    }

    public Object invoke() {
        View inflate = LayoutInflater.from(this.c.requireContext()).inflate(R.layout.fragment_profile, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FragmentProfileBinding bind = FragmentProfileBinding.bind(inflate);
        i.d(bind, "bind(\n            LayoutInflater.from(requireContext()).inflate(\n                R.layout.fragment_profile, null\n            ).apply {\n                layoutParams = ViewGroup.LayoutParams(\n                    ViewGroup.LayoutParams\n                        .MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT\n                )\n            }\n        )");
        return bind;
    }
}
