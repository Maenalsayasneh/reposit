package com.clubhouse.android.ui.clubs;

import android.view.MenuItem;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.app.R;
import h0.b.f.m0;
import i0.e.b.d3.k;
import i0.e.b.g3.l.a0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$bindMenuForAdmin$1$1 extends Lambda implements l<m0, i> {
    public final /* synthetic */ GetClubResponse c;
    public final /* synthetic */ ClubFragment d;
    public final /* synthetic */ ClubWithAdmin q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$bindMenuForAdmin$1$1(GetClubResponse getClubResponse, ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        super(1);
        this.c = getClubResponse;
        this.d = clubFragment;
        this.q = clubWithAdmin;
    }

    public Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        m0 m0Var = (m0) obj;
        m0.n.b.i.e(m0Var, "$this$popUpMenu");
        m0Var.a(R.menu.menu_club_admin);
        MenuItem findItem = m0Var.b.findItem(R.id.edit_topics);
        List<Topic> list = this.c.d2;
        boolean z = false;
        if (list == null || list.isEmpty()) {
            str = this.d.getString(R.string.add_club_topics);
        } else {
            str = this.d.getString(R.string.edit_club_topics);
        }
        findItem.setTitle(str);
        MenuItem findItem2 = m0Var.b.findItem(R.id.edit_rules);
        List<ClubRule> list2 = this.q.a2;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        }
        if (z) {
            str2 = this.d.getString(R.string.add_club_rules);
        } else {
            str2 = this.d.getString(R.string.edit_club_rules);
        }
        findItem2.setTitle(str2);
        MenuItem findItem3 = m0Var.b.findItem(R.id.membership_setting);
        if (this.q.g2) {
            str3 = this.d.getString(R.string.membership_approval_only);
        } else {
            str3 = this.d.getString(R.string.membership_open_to_all);
        }
        findItem3.setTitle(str3);
        MenuItem visible = m0Var.b.findItem(R.id.apply_to_join_setting).setVisible(!this.q.g2);
        if (this.q.h2) {
            str4 = this.d.getString(R.string.stop_letting_people_apply_to_join);
        } else {
            str4 = this.d.getString(R.string.start_letting_people_apply_to_join);
        }
        visible.setTitle(str4);
        MenuItem findItem4 = m0Var.b.findItem(R.id.host_room_setting);
        if (this.q.e2) {
            str5 = this.d.getString(R.string.limit_hosting_to_leaders_admin);
        } else {
            str5 = this.d.getString(R.string.let_all_members_host_rooms);
        }
        findItem4.setTitle(str5);
        MenuItem findItem5 = m0Var.b.findItem(R.id.member_list_setting);
        if (this.q.i2) {
            str6 = this.d.getString(R.string.show_member_list);
        } else {
            str6 = this.d.getString(R.string.hide_member_list);
        }
        findItem5.setTitle(str6);
        if (this.c.Z1) {
            MenuItem findItem6 = m0Var.b.findItem(R.id.delete_club);
            m0.n.b.i.d(findItem6, "menu.findItem(R.id.delete_club)");
            k.J(findItem6);
        }
        m0Var.e = new a0(this.d, this.q, this.c);
        return i.a;
    }
}
