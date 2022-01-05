package com.clubhouse.android.ui.creation;

import com.afollestad.assent.Permission;
import com.afollestad.assent.rationale.AlertDialogRationaleHandlerKt$createDialogRationale$2;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.shared.PermissionUtil$withAudioPermissions$1$1;
import com.clubhouse.android.shared.PermissionUtil$withAudioPermissions$1$rationaleHandler$1;
import com.clubhouse.android.ui.creation.CreateChannelFragment;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.a.a.f.b;
import i0.d.a.a.a;
import i0.e.b.g3.n.j;
import i0.e.b.g3.n.k;
import i0.e.b.g3.n.r;
import i0.e.b.g3.n.t;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: CreateChannelFragment.kt */
public final class CreateChannelFragment$showStartRoomConfirmationIfNecessary$1 extends Lambda implements l<t, i> {
    public final /* synthetic */ CreateChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateChannelFragment$showStartRoomConfirmationIfNecessary$1(CreateChannelFragment createChannelFragment) {
        super(1);
        this.c = createChannelFragment;
    }

    public Object invoke(Object obj) {
        t tVar = (t) obj;
        m0.n.b.i.e(tVar, "state");
        if (tVar.f) {
            final CreateChannelFragment createChannelFragment = this.c;
            AnonymousClass1 r1 = new l<d.a, i>() {
                public Object invoke(Object obj) {
                    d.a aVar = (d.a) obj;
                    a.j(aVar, "$this$alertDialog", R.string.start_new_room_title, R.string.start_new_room_message);
                    aVar.c(R.string.no, k.c);
                    aVar.d(R.string.yes, new j(CreateChannelFragment.this));
                    return i.a;
                }
            };
            m0.n.b.i.e(createChannelFragment, "<this>");
            m0.n.b.i.e(r1, "f");
            d.a aVar = new d.a(createChannelFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
            r1.invoke(aVar);
            aVar.g();
        } else {
            final CreateChannelFragment createChannelFragment2 = this.c;
            AnonymousClass2 r10 = new m0.n.a.a<i>() {
                public Object invoke() {
                    CreateChannelFragment createChannelFragment = CreateChannelFragment.this;
                    CreateChannelFragment.a aVar = CreateChannelFragment.p2;
                    createChannelFragment.W0().p(new r((EventInClub) null, 1));
                    return i.a;
                }
            };
            m0.n.b.i.e(createChannelFragment2, "<this>");
            m0.n.b.i.e(r10, "action");
            h0.o.a.k activity = createChannelFragment2.getActivity();
            if (activity != null) {
                PermissionUtil$withAudioPermissions$1$rationaleHandler$1 permissionUtil$withAudioPermissions$1$rationaleHandler$1 = new PermissionUtil$withAudioPermissions$1$rationaleHandler$1(createChannelFragment2);
                m0.n.b.i.f(activity, "$this$createDialogRationale");
                m0.n.b.i.f(permissionUtil$withAudioPermissions$1$rationaleHandler$1, "block");
                b bVar = new b(activity, R.string.microphone_permission_prompt_title, new AlertDialogRationaleHandlerKt$createDialogRationale$2(activity));
                permissionUtil$withAudioPermissions$1$rationaleHandler$1.invoke(bVar);
                i0.a.a.b.a(createChannelFragment2, new Permission[]{Permission.RECORD_AUDIO}, 0, bVar, new PermissionUtil$withAudioPermissions$1$1(createChannelFragment2, r10), 2);
            }
        }
        return i.a;
    }
}
