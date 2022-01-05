package i0.e.b.g3.n;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.creation.CreateChannelFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ CreateChannelFragment c;
    public final /* synthetic */ EventInClub d;

    public /* synthetic */ f(CreateChannelFragment createChannelFragment, EventInClub eventInClub) {
        this.c = createChannelFragment;
        this.d = eventInClub;
    }

    public final void onClick(View view) {
        CreateChannelFragment createChannelFragment = this.c;
        EventInClub eventInClub = this.d;
        CreateChannelFragment.a aVar = CreateChannelFragment.p2;
        i.e(createChannelFragment, "this$0");
        i.e(eventInClub, "$event");
        createChannelFragment.W0().p(new r(eventInClub));
    }
}
