package i0.e.b.g3.k;

import android.os.Bundle;
import android.view.View;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.clubs.ClubArgs;
import com.clubhouse.app.R;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.e.b.z2.g.l;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ l d;

    public /* synthetic */ o(ChannelFragment channelFragment, l lVar) {
        this.c = channelFragment;
        this.d = lVar;
    }

    public final void onClick(View view) {
        Club club;
        ChannelFragment channelFragment = this.c;
        l lVar = this.d;
        i.e(channelFragment, "this$0");
        i.e(lVar, "$state");
        Channel channel = lVar.u;
        if (channel == null) {
            club = null;
        } else {
            club = channel.i();
        }
        i.c(club);
        SourceLocation sourceLocation = SourceLocation.CHANNEL;
        i.e(channelFragment, "<this>");
        i.e(club, "club");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        h0.t.i iVar = new h0.t.i(channelFragment.requireContext());
        iVar.e(R.navigation.main_graph);
        iVar.d(R.id.clubFragment);
        ClubArgs clubArgs = new ClubArgs(Integer.valueOf(club.getId()), (String) null, (String) null, false, false, sourceLocation, (Map) null, 94);
        i.e(clubArgs, "arg");
        Bundle bundle = new Bundle();
        bundle.putParcelable("mavericks:arg", clubArgs);
        iVar.e = bundle;
        iVar.b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        iVar.a().send();
    }
}
