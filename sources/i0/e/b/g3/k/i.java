package i0.e.b.g3.k;

import android.view.View;
import com.afollestad.assent.Permission;
import com.afollestad.assent.rationale.AlertDialogRationaleHandlerKt$createDialogRationale$2;
import com.clubhouse.android.shared.PermissionUtil$withAudioPermissions$1$1;
import com.clubhouse.android.shared.PermissionUtil$withAudioPermissions$1$rationaleHandler$1;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.channels.ChannelFragment$onViewCreated$13$1;
import com.clubhouse.app.R;
import i0.a.a.f.b;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ ChannelFragment c;

    public /* synthetic */ i(ChannelFragment channelFragment) {
        this.c = channelFragment;
    }

    public final void onClick(View view) {
        ChannelFragment channelFragment = this.c;
        k<Object>[] kVarArr = ChannelFragment.Z1;
        m0.n.b.i.e(channelFragment, "this$0");
        ChannelFragment$onViewCreated$13$1 channelFragment$onViewCreated$13$1 = new ChannelFragment$onViewCreated$13$1(channelFragment);
        m0.n.b.i.e(channelFragment, "<this>");
        m0.n.b.i.e(channelFragment$onViewCreated$13$1, "action");
        h0.o.a.k activity = channelFragment.getActivity();
        if (activity != null) {
            PermissionUtil$withAudioPermissions$1$rationaleHandler$1 permissionUtil$withAudioPermissions$1$rationaleHandler$1 = new PermissionUtil$withAudioPermissions$1$rationaleHandler$1(channelFragment);
            m0.n.b.i.f(activity, "$this$createDialogRationale");
            m0.n.b.i.f(permissionUtil$withAudioPermissions$1$rationaleHandler$1, "block");
            b bVar = new b(activity, R.string.microphone_permission_prompt_title, new AlertDialogRationaleHandlerKt$createDialogRationale$2(activity));
            permissionUtil$withAudioPermissions$1$rationaleHandler$1.invoke(bVar);
            i0.a.a.b.a(channelFragment, new Permission[]{Permission.RECORD_AUDIO}, 0, bVar, new PermissionUtil$withAudioPermissions$1$1(channelFragment, channelFragment$onViewCreated$13$1), 2);
        }
    }
}
