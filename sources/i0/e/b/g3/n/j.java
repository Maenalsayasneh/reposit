package i0.e.b.g3.n;

import android.content.DialogInterface;
import com.afollestad.assent.Permission;
import com.afollestad.assent.rationale.AlertDialogRationaleHandlerKt$createDialogRationale$2;
import com.clubhouse.android.shared.PermissionUtil$withAudioPermissions$1$1;
import com.clubhouse.android.shared.PermissionUtil$withAudioPermissions$1$rationaleHandler$1;
import com.clubhouse.android.ui.creation.CreateChannelFragment;
import com.clubhouse.android.ui.creation.CreateChannelFragment$showStartRoomConfirmationIfNecessary$1$1$2$1;
import com.clubhouse.app.R;
import h0.o.a.k;
import i0.a.a.f.b;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {
    public final /* synthetic */ CreateChannelFragment c;

    public /* synthetic */ j(CreateChannelFragment createChannelFragment) {
        this.c = createChannelFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CreateChannelFragment createChannelFragment = this.c;
        i.e(createChannelFragment, "this$0");
        dialogInterface.cancel();
        CreateChannelFragment$showStartRoomConfirmationIfNecessary$1$1$2$1 createChannelFragment$showStartRoomConfirmationIfNecessary$1$1$2$1 = new CreateChannelFragment$showStartRoomConfirmationIfNecessary$1$1$2$1(createChannelFragment);
        i.e(createChannelFragment, "<this>");
        i.e(createChannelFragment$showStartRoomConfirmationIfNecessary$1$1$2$1, "action");
        k activity = createChannelFragment.getActivity();
        if (activity != null) {
            PermissionUtil$withAudioPermissions$1$rationaleHandler$1 permissionUtil$withAudioPermissions$1$rationaleHandler$1 = new PermissionUtil$withAudioPermissions$1$rationaleHandler$1(createChannelFragment);
            i.f(activity, "$this$createDialogRationale");
            i.f(permissionUtil$withAudioPermissions$1$rationaleHandler$1, "block");
            b bVar = new b(activity, R.string.microphone_permission_prompt_title, new AlertDialogRationaleHandlerKt$createDialogRationale$2(activity));
            permissionUtil$withAudioPermissions$1$rationaleHandler$1.invoke(bVar);
            i0.a.a.b.a(createChannelFragment, new Permission[]{Permission.RECORD_AUDIO}, 0, bVar, new PermissionUtil$withAudioPermissions$1$1(createChannelFragment, createChannelFragment$showStartRoomConfirmationIfNecessary$1$1$2$1), 2);
        }
    }
}
