package i0.e.b.g3.k;

import android.view.View;
import com.afollestad.assent.Permission;
import com.afollestad.assent.rationale.AlertDialogRationaleHandlerKt$createDialogRationale$2;
import com.clubhouse.android.shared.PermissionUtil$withAudioPermissions$1$1;
import com.clubhouse.android.shared.PermissionUtil$withAudioPermissions$1$rationaleHandler$1;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.ChannelFragment$showSpeakerInvite$1$1$1;
import com.clubhouse.app.R;
import h0.o.a.k;
import i0.a.a.f.b;
import i0.e.b.a3.f.j;
import i0.e.b.z2.g.y0;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class q0 implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ y0 d;
    public final /* synthetic */ j q;

    public /* synthetic */ q0(ChannelFragment channelFragment, y0 y0Var, j jVar) {
        this.c = channelFragment;
        this.d = y0Var;
        this.q = jVar;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        y0 y0Var = this.d;
        j jVar = this.q;
        i.e(channelFragment, "this$0");
        i.e(y0Var, "$invite");
        i.e(jVar, "$this_showBanner");
        ChannelFragment$showSpeakerInvite$1$1$1 channelFragment$showSpeakerInvite$1$1$1 = new ChannelFragment$showSpeakerInvite$1$1$1(channelFragment, y0Var, jVar);
        i.e(channelFragment, "<this>");
        i.e(channelFragment$showSpeakerInvite$1$1$1, "action");
        k activity = channelFragment.getActivity();
        if (activity != null) {
            PermissionUtil$withAudioPermissions$1$rationaleHandler$1 permissionUtil$withAudioPermissions$1$rationaleHandler$1 = new PermissionUtil$withAudioPermissions$1$rationaleHandler$1(channelFragment);
            i.f(activity, "$this$createDialogRationale");
            i.f(permissionUtil$withAudioPermissions$1$rationaleHandler$1, "block");
            b bVar = new b(activity, R.string.microphone_permission_prompt_title, new AlertDialogRationaleHandlerKt$createDialogRationale$2(activity));
            permissionUtil$withAudioPermissions$1$rationaleHandler$1.invoke(bVar);
            i0.a.a.b.a(channelFragment, new Permission[]{Permission.RECORD_AUDIO}, 0, bVar, new PermissionUtil$withAudioPermissions$1$1(channelFragment, channelFragment$showSpeakerInvite$1$1$1), 2);
        }
    }
}
