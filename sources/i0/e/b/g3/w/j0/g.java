package i0.e.b.g3.w.j0;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.core.ui.RSVPButton;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.ExploreEventBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import j$.time.OffsetDateTime;
import java.util.List;
import m0.i;
import m0.n.a.l;
import m0.n.a.p;

/* compiled from: EventInExplore.kt */
public abstract class g extends BaseEpoxyModelWithHolder<a> {
    public EventInClub j;
    public p<? super EventInClub, ? super Boolean, i> k;
    public l<? super EventInClub, i> l;

    /* compiled from: EventInExplore.kt */
    public static final class a extends d {
        public ExploreEventBinding b;

        public void a(View view) {
            m0.n.b.i.e(view, "itemView");
            ExploreEventBinding bind = ExploreEventBinding.bind(view);
            m0.n.b.i.d(bind, "bind(itemView)");
            m0.n.b.i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ExploreEventBinding b() {
            ExploreEventBinding exploreEventBinding = this.b;
            if (exploreEventBinding != null) {
                return exploreEventBinding;
            }
            m0.n.b.i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        UserInList userInList;
        m0.n.b.i.e(aVar, "holder");
        EventInClub eventInClub = this.j;
        if (eventInClub != null) {
            String str = null;
            if (eventInClub.c != null) {
                AvatarView avatarView = aVar.b().b;
                m0.n.b.i.d(avatarView, "binding.avatar");
                k.t(avatarView, eventInClub.c);
            } else {
                AvatarView avatarView2 = aVar.b().b;
                m0.n.b.i.d(avatarView2, "binding.avatar");
                List<UserInList> list = eventInClub.b2;
                if (list == null) {
                    userInList = null;
                } else {
                    userInList = (UserInList) m0.j.g.u(list);
                }
                k.u(avatarView2, userInList);
            }
            aVar.b().h.setText(eventInClub.a2);
            TextView textView = aVar.b().g;
            OffsetDateTime offsetDateTime = eventInClub.c2;
            if (offsetDateTime != null) {
                Context context = aVar.b().g.getContext();
                m0.n.b.i.d(context, "context()");
                str = v.K1(offsetDateTime, context);
            }
            textView.setText(str);
            aVar.b().d.setText(eventInClub.Z1);
            boolean a2 = m0.n.b.i.a(eventInClub.x, Boolean.TRUE);
            Button button = aVar.b().e;
            m0.n.b.i.d(button, "binding.rsvp");
            k.L(button, Boolean.valueOf(!a2));
            Button button2 = aVar.b().f;
            m0.n.b.i.d(button2, "binding.rsvped");
            k.L(button2, Boolean.valueOf(a2));
            aVar.b().c.setChecked(a2);
            Button button3 = aVar.b().e;
            m0.n.b.i.d(button3, "binding.rsvp");
            k.H(button3, aVar.a, new c(this, eventInClub, a2));
            Button button4 = aVar.b().f;
            m0.n.b.i.d(button4, "binding.rsvped");
            k.H(button4, aVar.a, new a(this, eventInClub, a2));
            RSVPButton rSVPButton = aVar.b().c;
            m0.n.b.i.d(rSVPButton, "binding.bellIcon");
            k.H(rSVPButton, aVar.a, new b(this, eventInClub, a2));
            aVar.b().a.setOnClickListener(new d(this, eventInClub));
        }
    }
}
