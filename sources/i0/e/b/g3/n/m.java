package i0.e.b.g3.n;

import android.content.DialogInterface;
import com.clubhouse.android.ui.creation.TopicDialogFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class m implements DialogInterface.OnClickListener {
    public final /* synthetic */ TopicDialogFragment c;

    public /* synthetic */ m(TopicDialogFragment topicDialogFragment) {
        this.c = topicDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TopicDialogFragment topicDialogFragment = this.c;
        i.e(topicDialogFragment, "this$0");
        topicDialogFragment.J0(false, false);
    }
}
