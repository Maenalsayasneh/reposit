package com.clubhouse.android.ui.hallway.buddyList.viewholder;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.club.ClubInStatus;
import com.clubhouse.android.databinding.BuddyListClubBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: BuddyListClub.kt */
public abstract class BuddyListClub extends BaseEpoxyModelWithHolder<a> {
    public ClubInStatus j;
    public View.OnClickListener k;
    public View.OnClickListener l;

    /* compiled from: BuddyListClub.kt */
    public static final class a extends d {
        public BuddyListClubBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            BuddyListClubBinding bind = BuddyListClubBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final BuddyListClubBinding b() {
            BuddyListClubBinding buddyListClubBinding = this.b;
            if (buddyListClubBinding != null) {
                return buddyListClubBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        String str;
        i.e(aVar, "holder");
        TextView textView = aVar.b().c;
        ClubInStatus clubInStatus = this.j;
        if (clubInStatus == null) {
            str = null;
        } else {
            str = clubInStatus.x;
        }
        textView.setText(str);
        AvatarView avatarView = aVar.b().b;
        i.d(avatarView, "holder.binding.clubAvatar");
        k.t(avatarView, this.j);
        ClubInStatus clubInStatus2 = this.j;
        if (clubInStatus2 != null) {
            int i = clubInStatus2.c;
            aVar.b().f.setText(aVar.b().a.getResources().getQuantityString(R.plurals.members_online, i, new Object[]{Integer.valueOf(i)}));
        }
        ConstraintLayout constraintLayout = aVar.b().a;
        i.d(constraintLayout, "holder.binding.root");
        k.H(constraintLayout, aVar.a, this.k);
        aVar.b().d.setOnClickListener(this.k);
        Drawable drawable = h0.i.b.a.getDrawable(aVar.b().a.getContext(), R.drawable.ic_club_house_large);
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 0.75d), (int) (((double) drawable.getIntrinsicHeight()) * 0.75d));
        }
        if (drawable != null) {
            drawable.setAlpha(127);
        }
        Drawable drawable2 = h0.i.b.a.getDrawable(aVar.b().a.getContext(), R.drawable.ic_add);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, (int) (((double) drawable2.getIntrinsicWidth()) * 0.75d), (int) (((double) drawable2.getIntrinsicHeight()) * 0.75d));
        }
        aVar.b().e.setCompoundDrawables(drawable2, (Drawable) null, drawable, (Drawable) null);
        Button button = aVar.b().e;
        i.d(button, "holder.binding.startRoom");
        k.H(button, aVar.a, this.l);
        EpoxyRecyclerView epoxyRecyclerView = aVar.b().d;
        i.d(epoxyRecyclerView, "holder.binding.memberList");
        k.E(epoxyRecyclerView, new BuddyListClub$bind$2(this));
    }

    public void L(a aVar) {
        i.e(aVar, "holder");
        super.H(aVar);
        aVar.b().d.a();
    }
}
