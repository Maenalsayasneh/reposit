package com.clubhouse.android.ui.creation;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.core.ui.BaseDialogFragment;
import h0.b0.v;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.n.t;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/clubhouse/android/ui/creation/TopicDialogFragment;", "Lcom/clubhouse/android/core/ui/BaseDialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "L0", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lm0/i;", "onActivityCreated", "(Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/creation/CreateChannelViewModel;", "k2", "Lm0/c;", "getViewModel", "()Lcom/clubhouse/android/ui/creation/CreateChannelViewModel;", "viewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: TopicDialogFragment.kt */
public final class TopicDialogFragment extends BaseDialogFragment {
    public static final /* synthetic */ k<Object>[] j2 = {m.c(new PropertyReference1Impl(m.a(TopicDialogFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/creation/CreateChannelViewModel;"))};
    public final c k2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<TopicDialogFragment, CreateChannelViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new TopicDialogFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(t.class), true, this.b);
        }
    }

    public TopicDialogFragment() {
        d a2 = m.a(CreateChannelViewModel.class);
        this.k2 = new a(a2, true, new TopicDialogFragment$special$$inlined$parentFragmentViewModel$default$1(this, a2, a2), a2).a(this, j2[0]);
    }

    public void J() {
    }

    public Dialog L0(Bundle bundle) {
        Object v2 = v.v2((CreateChannelViewModel) this.k2.getValue(), new TopicDialogFragment$onCreateDialog$1(this));
        i.d(v2, "override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {\n        return withState(viewModel) { state ->\n            val binding = DialogEditTextBinding.inflate(layoutInflater).apply {\n                text.setText(state.topic)\n            }\n            AlertDialog.Builder(requireContext(), R.style.Clubhouse_AlertDialog_Rounded)\n                .setTitle(state.dialogTitle())\n                .setMessage(state.dialogMessage())\n                .setView(binding.root)\n                .setNegativeButton(R.string.cancel) { _, _ ->\n                    dismiss()\n                }\n                .setPositiveButton(R.string.set_title) { _, _ ->\n                    viewModel.processIntent(SetTopic(binding.text.text.toString()))\n                }\n                .create()\n        }\n    }");
        return (Dialog) v2;
    }

    public void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = this.e2;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(4);
        }
    }
}
