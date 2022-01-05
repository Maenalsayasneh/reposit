package i0.e.b.g3.k;

import android.view.View;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.profile.HalfProfileArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class w implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ UserInChannel d;

    public /* synthetic */ w(ChannelFragment channelFragment, UserInChannel userInChannel) {
        this.c = channelFragment;
        this.d = userInChannel;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        UserInChannel userInChannel = this.d;
        i.e(channelFragment, "this$0");
        i.e(userInChannel, "$self");
        SourceLocation sourceLocation = SourceLocation.CHANNEL;
        i.e(channelFragment, "<this>");
        i.e(userInChannel, "user");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        v.f(channelFragment, FragmentName.HALF_PROFILE, new HalfProfileArgs(userInChannel, sourceLocation, false, false, false, 16));
    }
}
