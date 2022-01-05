package i0.e.b.g3.n;

import android.content.DialogInterface;
import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.android.ui.creation.CreateChannelViewModel;
import com.clubhouse.android.ui.creation.TopicDialogFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class n implements DialogInterface.OnClickListener {
    public final /* synthetic */ TopicDialogFragment c;
    public final /* synthetic */ DialogEditTextBinding d;

    public /* synthetic */ n(TopicDialogFragment topicDialogFragment, DialogEditTextBinding dialogEditTextBinding) {
        this.c = topicDialogFragment;
        this.d = dialogEditTextBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TopicDialogFragment topicDialogFragment = this.c;
        DialogEditTextBinding dialogEditTextBinding = this.d;
        i.e(topicDialogFragment, "this$0");
        i.e(dialogEditTextBinding, "$binding");
        ((CreateChannelViewModel) topicDialogFragment.k2.getValue()).p(new v(dialogEditTextBinding.b.getText().toString()));
    }
}
