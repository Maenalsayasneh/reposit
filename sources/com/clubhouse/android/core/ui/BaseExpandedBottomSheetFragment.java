package com.clubhouse.android.core.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.clubhouse.core.ui.R;
import i0.h.a.c.g.d;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/clubhouse/android/core/ui/BaseExpandedBottomSheetFragment;", "Lcom/clubhouse/android/core/ui/BaseBottomSheetFragment;", "", "K0", "()I", "Landroid/os/Bundle;", "savedInstanceState", "Li0/h/a/c/g/d;", "R0", "(Landroid/os/Bundle;)Li0/h/a/c/g/d;", "Lm0/i;", "onStart", "()V", "contentLayoutId", "<init>", "(I)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: BaseExpandedBottomSheetFragment.kt */
public abstract class BaseExpandedBottomSheetFragment extends BaseBottomSheetFragment {
    public BaseExpandedBottomSheetFragment(int i) {
        super(i);
    }

    public int K0() {
        return R.style.ClubhouseBottomSheetDialog_BackgroundPrimary;
    }

    /* renamed from: R0 */
    public d L0(Bundle bundle) {
        d R0 = super.L0(bundle);
        R0.e().M(Resources.getSystem().getDisplayMetrics().heightPixels);
        return R0;
    }

    public void onStart() {
        super.onStart();
        ViewParent parent = requireView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.getLayoutParams().height = -1;
        }
    }
}
