package com.clubhouse.backchannel.container;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.clubhouse.android.core.ui.BaseExpandedBottomSheetFragment;
import com.clubhouse.backchannel.R;
import h0.b0.v;
import i0.e.c.d.a;
import i0.h.a.c.g.d;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/clubhouse/backchannel/container/BackchannelContainerFragment;", "Lcom/clubhouse/android/core/ui/BaseExpandedBottomSheetFragment;", "", "K0", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Li0/h/a/c/g/d;", "R0", "(Landroid/os/Bundle;)Li0/h/a/c/g/d;", "J", "()V", "<init>", "backchannel_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: BackchannelContainerFragment.kt */
public final class BackchannelContainerFragment extends BaseExpandedBottomSheetFragment {
    public BackchannelContainerFragment() {
        super(R.layout.fragment_backchannel_container);
    }

    public void J() {
    }

    public int K0() {
        return R.style.ClubhouseBottomSheetDialog_NoDragging_BackchannelContainer;
    }

    /* renamed from: R0 */
    public d L0(Bundle bundle) {
        d R0 = super.L0(bundle);
        i.e(this, "<this>");
        i.e(R0, "dialog");
        R0.setOnKeyListener(new a(this));
        return R0;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = this.e2;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.clearFlags(2);
        }
        v.H(this);
    }
}
