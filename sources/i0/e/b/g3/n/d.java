package i0.e.b.g3.n;

import android.view.View;
import com.clubhouse.android.ui.creation.CreateChannelFragment;
import com.clubhouse.android.ui.creation.TopicDialogFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ CreateChannelFragment c;

    public /* synthetic */ d(CreateChannelFragment createChannelFragment) {
        this.c = createChannelFragment;
    }

    public final void onClick(View view) {
        CreateChannelFragment createChannelFragment = this.c;
        CreateChannelFragment.a aVar = CreateChannelFragment.p2;
        i.e(createChannelFragment, "this$0");
        new TopicDialogFragment().P0(createChannelFragment.getChildFragmentManager(), (String) null);
    }
}
