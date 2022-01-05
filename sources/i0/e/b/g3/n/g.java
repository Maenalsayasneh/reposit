package i0.e.b.g3.n;

import android.view.View;
import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.ui.creation.CreateChannelFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ CreateChannelFragment c;
    public final /* synthetic */ AudienceType d;

    public /* synthetic */ g(CreateChannelFragment createChannelFragment, AudienceType audienceType) {
        this.c = createChannelFragment;
        this.d = audienceType;
    }

    public final void onClick(View view) {
        CreateChannelFragment createChannelFragment = this.c;
        AudienceType audienceType = this.d;
        i.e(createChannelFragment, "this$0");
        i.e(audienceType, "$audienceType");
        CreateChannelFragment.a aVar = CreateChannelFragment.p2;
        createChannelFragment.W0().p(new u(audienceType));
    }
}
