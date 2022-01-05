package i0.e.b.g3.u;

import android.view.View;
import com.afollestad.assent.Permission;
import com.afollestad.assent.rationale.AlertDialogRationaleHandlerKt$createDialogRationale$2;
import com.clubhouse.android.shared.PermissionUtil$withAudioPermissions$1$1;
import com.clubhouse.android.shared.PermissionUtil$withAudioPermissions$1$rationaleHandler$1;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import com.clubhouse.android.ui.profile.HalfProfileUtil$setUpViews$33$1;
import com.clubhouse.app.R;
import h0.o.a.k;
import i0.a.a.f.b;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class u0 implements View.OnClickListener {
    public final /* synthetic */ HalfProfileFragment c;

    public /* synthetic */ u0(HalfProfileFragment halfProfileFragment) {
        this.c = halfProfileFragment;
    }

    public final void onClick(View view) {
        HalfProfileFragment halfProfileFragment = this.c;
        i.e(halfProfileFragment, "$this_setUpViews");
        HalfProfileUtil$setUpViews$33$1 halfProfileUtil$setUpViews$33$1 = new HalfProfileUtil$setUpViews$33$1(halfProfileFragment);
        i.e(halfProfileFragment, "<this>");
        i.e(halfProfileUtil$setUpViews$33$1, "action");
        k activity = halfProfileFragment.getActivity();
        if (activity != null) {
            PermissionUtil$withAudioPermissions$1$rationaleHandler$1 permissionUtil$withAudioPermissions$1$rationaleHandler$1 = new PermissionUtil$withAudioPermissions$1$rationaleHandler$1(halfProfileFragment);
            i.f(activity, "$this$createDialogRationale");
            i.f(permissionUtil$withAudioPermissions$1$rationaleHandler$1, "block");
            b bVar = new b(activity, R.string.microphone_permission_prompt_title, new AlertDialogRationaleHandlerKt$createDialogRationale$2(activity));
            permissionUtil$withAudioPermissions$1$rationaleHandler$1.invoke(bVar);
            i0.a.a.b.a(halfProfileFragment, new Permission[]{Permission.RECORD_AUDIO}, 0, bVar, new PermissionUtil$withAudioPermissions$1$1(halfProfileFragment, halfProfileUtil$setUpViews$33$1), 2);
        }
    }
}
