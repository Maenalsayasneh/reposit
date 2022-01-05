package i0.e.b.g3.k.v0;

import android.view.View;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.ui.channels.raisedhands.RaisedHandsQueueFragment;
import com.clubhouse.android.ui.profile.HalfProfileArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ RaisedHandsQueueFragment c;
    public final /* synthetic */ UserInChannel d;

    public /* synthetic */ b(RaisedHandsQueueFragment raisedHandsQueueFragment, UserInChannel userInChannel) {
        this.c = raisedHandsQueueFragment;
        this.d = userInChannel;
    }

    public final void onClick(View view) {
        RaisedHandsQueueFragment raisedHandsQueueFragment = this.c;
        UserInChannel userInChannel = this.d;
        i.e(raisedHandsQueueFragment, "this$0");
        i.e(userInChannel, "$user");
        SourceLocation sourceLocation = SourceLocation.CHANNEL;
        i.e(raisedHandsQueueFragment, "<this>");
        i.e(userInChannel, "user");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        v.f(raisedHandsQueueFragment, FragmentName.HALF_PROFILE, new HalfProfileArgs(userInChannel, sourceLocation, false, false, false, 16));
    }
}
