package i0.e.b.g3.l.c3;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.clubhouse.android.core.ui.TriStateButton;
import com.clubhouse.android.databinding.ClubMemberBinding;
import com.clubhouse.android.ui.clubs.ClubRole;
import com.clubhouse.app.R;
import com.clubhouse.core.ui.databinding.ListUserAnatomyBinding;
import h0.b.f.m0;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubMember.kt */
public abstract class p extends i0.e.b.f3.m.b.a<a> {
    public boolean m = true;
    public boolean n;
    public ClubRole o;
    public boolean p;
    public View.OnClickListener q;
    public l<? super ClubRole, i> r;
    public m0.n.a.a<i> s;
    public final m0.a t = new c(this);

    /* compiled from: ClubMember.kt */
    public static final class a extends d {
        public ClubMemberBinding b;

        public void a(View view) {
            m0.n.b.i.e(view, "itemView");
            ClubMemberBinding bind = ClubMemberBinding.bind(view);
            m0.n.b.i.d(bind, "bind(itemView)");
            m0.n.b.i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ClubMemberBinding b() {
            ClubMemberBinding clubMemberBinding = this.b;
            if (clubMemberBinding != null) {
                return clubMemberBinding;
            }
            m0.n.b.i.m("binding");
            throw null;
        }
    }

    /* compiled from: ClubMember.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            ClubRole.values();
            int[] iArr = new int[3];
            iArr[ClubRole.ADMIN.ordinal()] = 1;
            iArr[ClubRole.LEADER.ordinal()] = 2;
            iArr[ClubRole.MEMBER.ordinal()] = 3;
            a = iArr;
        }
    }

    /* renamed from: M */
    public void k(a aVar) {
        m0.n.b.i.e(aVar, "holder");
        Context context = aVar.b().a.getContext();
        ListUserAnatomyBinding listUserAnatomyBinding = aVar.b().d;
        m0.n.b.i.d(listUserAnatomyBinding, "holder.binding.user");
        K(listUserAnatomyBinding);
        ClubRole clubRole = this.o;
        int i = clubRole == null ? -1 : b.a[clubRole.ordinal()];
        if (i == 1) {
            TextView textView = aVar.b().d.d;
            m0.n.b.i.d(textView, "binding.user.name");
            k.e(textView, 0, 0, R.drawable.ic_club_admin_badge, 0, 11);
        } else if (i == 2) {
            TextView textView2 = aVar.b().d.d;
            m0.n.b.i.d(textView2, "binding.user.name");
            k.e(textView2, 0, 0, R.drawable.ic_club_leader_badge, 0, 11);
        } else if (i == 3) {
            TextView textView3 = aVar.b().d.d;
            m0.n.b.i.d(textView3, "binding.user.name");
            k.e(textView3, 0, 0, 0, 0, 15);
        }
        if (!this.m) {
            TriStateButton triStateButton = aVar.b().b;
            m0.n.b.i.d(triStateButton, "holder.binding.followButton");
            k.p(triStateButton);
        } else {
            TriStateButton triStateButton2 = aVar.b().b;
            m0.n.b.i.d(triStateButton2, "holder.binding.followButton");
            k.K(triStateButton2);
            aVar.b().b.setChecked(this.p);
            TriStateButton triStateButton3 = aVar.b().b;
            m0.n.b.i.d(triStateButton3, "holder.binding.followButton");
            k.H(triStateButton3, aVar.a, this.q);
        }
        if (!this.n) {
            Button button = aVar.b().c;
            m0.n.b.i.d(button, "holder.binding.roleButton");
            k.p(button);
        } else {
            ClubRole clubRole2 = this.o;
            if (clubRole2 != null) {
                aVar.b().c.setText(context.getString(clubRole2.getLabel()));
            }
            Button button2 = aVar.b().c;
            m0.n.b.i.d(button2, "holder.binding.roleButton");
            k.K(button2);
            aVar.b().c.setOnClickListener(new d(this));
        }
        ListUserAnatomyBinding listUserAnatomyBinding2 = aVar.b().d;
        m0.n.b.i.d(listUserAnatomyBinding2, "holder.binding.user");
        L(listUserAnatomyBinding2, true);
    }

    public int o() {
        return R.layout.club_member;
    }
}
