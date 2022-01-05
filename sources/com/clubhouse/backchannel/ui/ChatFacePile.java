package com.clubhouse.backchannel.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.User;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.databinding.ChatFacepileBinding;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import h0.b0.v;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u0005*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/clubhouse/backchannel/ui/ChatFacePile;", "Landroid/widget/FrameLayout;", "", "Lcom/clubhouse/pubsub/user/backchannel/models/remote/ChatMember;", "users", "Lm0/i;", "setAvatars", "(Ljava/util/List;)V", "Lcom/clubhouse/android/shared/ui/AvatarView;", "Lcom/clubhouse/android/user/model/User;", "user", "a", "(Lcom/clubhouse/android/shared/ui/AvatarView;Lcom/clubhouse/android/user/model/User;)V", "", "d", "I", "firstAvatarSize", "Lcom/clubhouse/backchannel/databinding/ChatFacepileBinding;", "c", "Lcom/clubhouse/backchannel/databinding/ChatFacepileBinding;", "binding", "backchannel_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: ChatFacePile.kt */
public final class ChatFacePile extends FrameLayout {
    public final ChatFacepileBinding c;
    public final int d = getResources().getDimensionPixelSize(R.dimen.inbox_facepile_face_1_size);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatFacePile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.e(context, "context");
        i.e(context, "context");
        FrameLayout.inflate(context, R.layout.chat_facepile, this);
        ChatFacepileBinding bind = ChatFacepileBinding.bind(this);
        i.d(bind, "bind(this)");
        this.c = bind;
    }

    public final void a(AvatarView avatarView, User user) {
        String str;
        int i = 0;
        if (!(user != null)) {
            i = 8;
        }
        avatarView.setVisibility(i);
        String str2 = null;
        if (user == null) {
            str = null;
        } else {
            str = ((ChatMember) user).Z1;
        }
        if (user != null) {
            str2 = ((ChatMember) user).Y1;
        }
        v.S0(avatarView, str, str2, 0.0f, 4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setAvatars(java.util.List<com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember> r7) {
        /*
            r6 = this;
            com.clubhouse.backchannel.databinding.ChatFacepileBinding r0 = r6.c
            com.clubhouse.android.shared.ui.AvatarView r0 = r0.b
            r1 = 0
            r2 = 1
            if (r7 != 0) goto L_0x000a
        L_0x0008:
            r3 = r1
            goto L_0x0011
        L_0x000a:
            int r3 = r7.size()
            if (r3 != r2) goto L_0x0008
            r3 = r2
        L_0x0011:
            if (r3 == 0) goto L_0x001a
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            goto L_0x0021
        L_0x001a:
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            int r4 = r6.d
            r3.<init>(r4, r4)
        L_0x0021:
            r0.setLayoutParams(r3)
            r0 = 0
            if (r7 != 0) goto L_0x0029
            r3 = r0
            goto L_0x002f
        L_0x0029:
            java.lang.Object r3 = m0.j.g.z(r7, r1)
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember r3 = (com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember) r3
        L_0x002f:
            com.clubhouse.backchannel.databinding.ChatFacepileBinding r4 = r6.c
            com.clubhouse.android.shared.ui.AvatarView r4 = r4.b
            java.lang.String r5 = "binding.face1"
            m0.n.b.i.d(r4, r5)
            r6.a(r4, r3)
            if (r7 != 0) goto L_0x003e
            goto L_0x0045
        L_0x003e:
            int r4 = r7.size()
            if (r4 != r2) goto L_0x0045
            r1 = r2
        L_0x0045:
            java.lang.String r4 = "binding.face1EndBadge"
            if (r1 == 0) goto L_0x005a
            com.clubhouse.backchannel.databinding.ChatFacepileBinding r1 = r6.c
            android.widget.ImageView r1 = r1.c
            m0.n.b.i.d(r1, r4)
            if (r3 != 0) goto L_0x0054
            r3 = r0
            goto L_0x0056
        L_0x0054:
            java.lang.Integer r3 = r3.c2
        L_0x0056:
            i0.e.b.d3.k.b(r1, r3)
            goto L_0x0064
        L_0x005a:
            com.clubhouse.backchannel.databinding.ChatFacepileBinding r1 = r6.c
            android.widget.ImageView r1 = r1.c
            m0.n.b.i.d(r1, r4)
            i0.e.b.d3.k.p(r1)
        L_0x0064:
            if (r7 != 0) goto L_0x0068
            r1 = r0
            goto L_0x006e
        L_0x0068:
            java.lang.Object r1 = m0.j.g.z(r7, r2)
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember r1 = (com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember) r1
        L_0x006e:
            com.clubhouse.backchannel.databinding.ChatFacepileBinding r2 = r6.c
            com.clubhouse.android.shared.ui.AvatarView r2 = r2.d
            java.lang.String r3 = "binding.face2"
            m0.n.b.i.d(r2, r3)
            r6.a(r2, r1)
            if (r7 != 0) goto L_0x007e
            r1 = r0
            goto L_0x0085
        L_0x007e:
            r1 = 2
            java.lang.Object r1 = m0.j.g.z(r7, r1)
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember r1 = (com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember) r1
        L_0x0085:
            com.clubhouse.backchannel.databinding.ChatFacepileBinding r2 = r6.c
            com.clubhouse.android.shared.ui.AvatarView r2 = r2.e
            java.lang.String r3 = "binding.face3"
            m0.n.b.i.d(r2, r3)
            r6.a(r2, r1)
            if (r7 != 0) goto L_0x0094
            goto L_0x009c
        L_0x0094:
            r0 = 3
            java.lang.Object r7 = m0.j.g.z(r7, r0)
            r0 = r7
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember r0 = (com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember) r0
        L_0x009c:
            com.clubhouse.backchannel.databinding.ChatFacepileBinding r7 = r6.c
            com.clubhouse.android.shared.ui.AvatarView r7 = r7.f
            java.lang.String r1 = "binding.face4"
            m0.n.b.i.d(r7, r1)
            r6.a(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.backchannel.ui.ChatFacePile.setAvatars(java.util.List):void");
    }
}
