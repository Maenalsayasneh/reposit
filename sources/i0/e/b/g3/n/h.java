package i0.e.b.g3.n;

import android.view.View;
import com.clubhouse.android.ui.creation.CreateChannelFragment;
import i0.e.b.z2.f.d;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ CreateChannelFragment c;
    public final /* synthetic */ d d;

    public /* synthetic */ h(CreateChannelFragment createChannelFragment, d dVar) {
        this.c = createChannelFragment;
        this.d = dVar;
    }

    public final void onClick(View view) {
        CreateChannelFragment createChannelFragment = this.c;
        d dVar = this.d;
        i.e(createChannelFragment, "this$0");
        i.e(dVar, "$clubAudience");
        CreateChannelFragment.a aVar = CreateChannelFragment.p2;
        createChannelFragment.W0().p(new u(dVar));
    }
}
