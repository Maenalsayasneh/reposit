package i0.e.b.g3.n;

import android.view.View;
import com.clubhouse.android.ui.creation.CreateChannelFragment;
import com.clubhouse.app.R;
import h0.b0.c;
import h0.b0.g;
import h0.b0.n;
import h0.b0.p;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ CreateChannelFragment c;

    public /* synthetic */ e(CreateChannelFragment createChannelFragment) {
        this.c = createChannelFragment;
    }

    public final void onClick(View view) {
        CreateChannelFragment createChannelFragment = this.c;
        CreateChannelFragment.a aVar = CreateChannelFragment.p2;
        i.e(createChannelFragment, "this$0");
        Objects.requireNonNull(CreateChannelFragment.p2);
        p pVar = new p();
        pVar.P(0);
        pVar.M(new c(2));
        pVar.O(250);
        h0.b0.i iVar = new h0.b0.i(48);
        iVar.c(R.id.create_channel_event_root);
        iVar.Y1 = 500;
        pVar.M(iVar);
        h0.b0.i iVar2 = new h0.b0.i(80);
        iVar2.c(R.id.create_channel_root);
        iVar2.Y1 = 500;
        pVar.M(iVar2);
        pVar.M(new c(1));
        pVar.O(250);
        n.c((g) createChannelFragment.v2.getValue(), pVar);
    }
}
