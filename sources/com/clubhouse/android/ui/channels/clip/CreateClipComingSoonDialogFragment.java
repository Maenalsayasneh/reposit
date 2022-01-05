package com.clubhouse.android.ui.channels.clip;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.core.ui.BaseDialogFragment;
import h0.b0.v;
import i0.b.b.g;
import i0.b.b.h;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\tJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/clubhouse/android/ui/channels/clip/CreateClipComingSoonDialogFragment;", "Lcom/clubhouse/android/core/ui/BaseDialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "L0", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lm0/i;", "J", "()V", "Lcom/clubhouse/android/channels/mvi/ChannelViewModel;", "k2", "Lm0/c;", "getViewModel", "()Lcom/clubhouse/android/channels/mvi/ChannelViewModel;", "viewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: CreateClipComingSoonDialogFragment.kt */
public final class CreateClipComingSoonDialogFragment extends BaseDialogFragment {
    public static final /* synthetic */ k<Object>[] j2 = {m.c(new PropertyReference1Impl(m.a(CreateClipComingSoonDialogFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/channels/mvi/ChannelViewModel;"))};
    public final c k2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<CreateClipComingSoonDialogFragment, ChannelViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public a(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new CreateClipComingSoonDialogFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(i0.e.b.z2.g.l.class), true, this.b);
        }
    }

    public CreateClipComingSoonDialogFragment() {
        d a2 = m.a(ChannelViewModel.class);
        this.k2 = new a(a2, true, new CreateClipComingSoonDialogFragment$special$$inlined$parentFragmentViewModel$default$1(this, a2, a2), a2).a(this, j2[0]);
    }

    public void J() {
    }

    public Dialog L0(Bundle bundle) {
        Object v2 = v.v2((ChannelViewModel) this.k2.getValue(), new CreateClipComingSoonDialogFragment$onCreateDialog$1(this));
        i.d(v2, "override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {\n        return withState(viewModel) { state ->\n            val binding = DialogCreateClipComingSoonBinding.inflate(layoutInflater)\n\n            binding.primaryButton.setText(\n                if (state.isDisableClipsEnabled) {\n                    R.string.create_clip_coming_soon_disable_clips\n                } else {\n                    R.string.create_clip_coming_soon_got_it\n                }\n            )\n            binding.primaryButton.setOnClickListener {\n                if (state.isDisableClipsEnabled) {\n                    showDisableConfirmation()\n                } else {\n                    dismissAllowingStateLoss()\n                }\n            }\n\n            binding.learnMoreLink.apply {\n                paintFlags = paintFlags or Paint.UNDERLINE_TEXT_FLAG\n                setOnClickListener {\n                    openBrowserUrl(\n                        getString(R.string.clubhouse_clips_faq)\n                    )\n                }\n            }\n\n            AlertDialog.Builder(requireContext(), R.style.Clubhouse_AlertDialog_Rounded)\n                .setView(binding.root)\n                .setCancelable(true)\n                .create()\n        }\n    }");
        return (Dialog) v2;
    }
}
