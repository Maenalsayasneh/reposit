package i0.e.b.g3.l.a3.v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.data.models.local.club.ClubNominationUser;
import com.clubhouse.android.databinding.ClubNominationItemBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.ui.clubs.nominations.viewholder.ApprovalStatus;
import com.clubhouse.app.R;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: ClubNominationItemView.kt */
public final class a extends ConstraintLayout {
    public final ClubNominationItemBinding n2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, (AttributeSet) null, 0);
        i.e(context, "context");
        i.e(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.club_nomination_item, this, false);
        addView(inflate);
        ClubNominationItemBinding bind = ClubNominationItemBinding.bind(inflate);
        i.d(bind, "inflate(LayoutInflater.from(context), this, true)");
        this.n2 = bind;
    }

    public final void setApprovalStatus(ApprovalStatus approvalStatus) {
        i.e(approvalStatus, "approvalStatus");
        int ordinal = approvalStatus.ordinal();
        if (ordinal == 0) {
            ImageView imageView = this.n2.b;
            i.d(imageView, "binding.approveButton");
            k.K(imageView);
            ImageView imageView2 = this.n2.h;
            i.d(imageView2, "binding.rejectButton");
            k.K(imageView2);
            ImageView imageView3 = this.n2.i;
            i.d(imageView3, "binding.rejected");
            k.p(imageView3);
            TextView textView = this.n2.c;
            i.d(textView, "binding.approved");
            k.p(textView);
        } else if (ordinal == 1) {
            ImageView imageView4 = this.n2.b;
            i.d(imageView4, "binding.approveButton");
            k.p(imageView4);
            ImageView imageView5 = this.n2.h;
            i.d(imageView5, "binding.rejectButton");
            k.p(imageView5);
            ImageView imageView6 = this.n2.i;
            i.d(imageView6, "binding.rejected");
            k.p(imageView6);
            TextView textView2 = this.n2.c;
            i.d(textView2, "binding.approved");
            k.K(textView2);
        } else if (ordinal == 2) {
            ImageView imageView7 = this.n2.b;
            i.d(imageView7, "binding.approveButton");
            k.p(imageView7);
            ImageView imageView8 = this.n2.h;
            i.d(imageView8, "binding.rejectButton");
            k.p(imageView8);
            ImageView imageView9 = this.n2.i;
            i.d(imageView9, "binding.rejected");
            k.K(imageView9);
            TextView textView3 = this.n2.c;
            i.d(textView3, "binding.approved");
            k.p(textView3);
        }
    }

    public final void setApproveClickListener(View.OnClickListener onClickListener) {
        this.n2.b.setOnClickListener(onClickListener);
    }

    public final void setNominationUser(ClubNominationUser clubNominationUser) {
        String str;
        i.e(clubNominationUser, "user");
        AvatarView avatarView = this.n2.d;
        i.d(avatarView, "binding.avatar");
        k.u(avatarView, clubNominationUser);
        this.n2.e.setText(clubNominationUser.d);
        this.n2.g.setText(clubNominationUser.Y1);
        TextView textView = this.n2.f;
        String str2 = clubNominationUser.Z1;
        if (str2 == null || str2.length() == 0) {
            str = getResources().getString(R.string.club_applied);
        } else {
            str = getResources().getString(R.string.club_nominated_by, new Object[]{clubNominationUser.Z1});
        }
        textView.setText(str);
    }

    public final void setRejectClickListener(View.OnClickListener onClickListener) {
        this.n2.h.setOnClickListener(onClickListener);
    }

    public final void setUserClickListener(View.OnClickListener onClickListener) {
        this.n2.a.setOnClickListener(onClickListener);
    }
}
