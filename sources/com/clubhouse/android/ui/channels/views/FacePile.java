package com.clubhouse.android.ui.channels.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.clubhouse.android.databinding.FacepileBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import h0.b0.v;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/clubhouse/android/ui/channels/views/FacePile;", "Landroid/widget/LinearLayout;", "Lcom/clubhouse/android/shared/ui/AvatarView;", "Lcom/clubhouse/android/user/model/User;", "user", "Lm0/i;", "a", "(Lcom/clubhouse/android/shared/ui/AvatarView;Lcom/clubhouse/android/user/model/User;)V", "Lcom/clubhouse/android/databinding/FacepileBinding;", "c", "Lcom/clubhouse/android/databinding/FacepileBinding;", "binding", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: FacePile.kt */
public final class FacePile extends LinearLayout {
    public final FacepileBinding c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacePile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.e(context, "context");
        i.e(context, "context");
        LinearLayout.inflate(context, R.layout.facepile, this);
        FacepileBinding bind = FacepileBinding.bind(this);
        i.d(bind, "bind(this)");
        this.c = bind;
    }

    public final void a(AvatarView avatarView, User user) {
        if (user != null) {
            avatarView.setVisibility(0);
            avatarView.setText(AvatarView.c.a(user.getName()));
            v.Q0(avatarView, user.b());
            return;
        }
        avatarView.setVisibility(8);
    }
}
