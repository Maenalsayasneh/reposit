package i0.e.b.g3.p.c0.e0;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.core.ui.RSVPButton;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.FeedEventSuggestionBinding;
import com.clubhouse.android.ui.hallway.feed.viewholder.EventSuggestion$bindEventSuggestion$1$3;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import j$.time.OffsetDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.n.a.l;
import m0.n.a.p;

/* compiled from: EventSuggestion.kt */
public abstract class t extends BaseEpoxyModelWithHolder<a> {
    public EventInClub j;
    public Integer k;
    public p<? super EventInClub, ? super Boolean, i> l;
    public l<? super EventInClub, i> m;
    public l<? super EventInClub, i> n;

    /* compiled from: EventSuggestion.kt */
    public static final class a extends d {
        public FeedEventSuggestionBinding b;

        public void a(View view) {
            m0.n.b.i.e(view, "itemView");
            FeedEventSuggestionBinding bind = FeedEventSuggestionBinding.bind(view);
            m0.n.b.i.d(bind, "bind(itemView)");
            m0.n.b.i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final FeedEventSuggestionBinding b() {
            FeedEventSuggestionBinding feedEventSuggestionBinding = this.b;
            if (feedEventSuggestionBinding != null) {
                return feedEventSuggestionBinding;
            }
            m0.n.b.i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        m0.n.b.i.e(aVar, "holder");
        EventInClub eventInClub = this.j;
        if (eventInClub != null) {
            String str3 = eventInClub.i2;
            if (str3 != null) {
                aVar.b().e.b.setText(str3);
                ConstraintLayout constraintLayout = aVar.b().e.a;
                m0.n.b.i.d(constraintLayout, "binding.reasonContainer.root");
                k.K(constraintLayout);
            }
            TextView textView = aVar.b().h;
            OffsetDateTime offsetDateTime = eventInClub.c2;
            String str4 = null;
            if (offsetDateTime == null) {
                str = null;
            } else {
                Context context = aVar.b().h.getContext();
                m0.n.b.i.d(context, "context()");
                str = v.K1(offsetDateTime, context);
            }
            textView.setText(str);
            aVar.b().i.setText(eventInClub.a2);
            ClubWithAdmin clubWithAdmin = eventInClub.c;
            if (clubWithAdmin == null) {
                str2 = null;
            } else {
                str2 = clubWithAdmin.y;
            }
            TextView textView2 = aVar.b().f;
            if (str2 != null) {
                str4 = StringsKt__IndentKt.X(str2).toString();
            }
            textView2.setText(str4);
            boolean z3 = false;
            aVar.b().g.setVisibility(str2 == null || str2.length() == 0 ? 4 : 0);
            aVar.b().f.setVisibility(str2 == null || str2.length() == 0 ? 4 : 0);
            aVar.b().a.setOnClickListener(new e(this, eventInClub));
            EpoxyRecyclerView epoxyRecyclerView = aVar.b().d;
            m0.n.b.i.d(epoxyRecyclerView, "binding.hosts");
            k.E(epoxyRecyclerView, new EventSuggestion$bindEventSuggestion$1$3(eventInClub));
            Context context2 = aVar.b().a.getContext();
            m0.n.b.i.d(context2, "binding.root.context");
            m0.n.b.i.e(context2, "<this>");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = context2.getSystemService("window");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            aVar.b().a.getLayoutParams().width = (displayMetrics.widthPixels * 3) / 4;
            List<UserInList> list = eventInClub.b2;
            if (list != null && !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int intValue = ((UserInList) it.next()).getId().intValue();
                    Integer num = this.k;
                    if (num != null && intValue == num.intValue()) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                TextView textView3 = aVar.b().c;
                m0.n.b.i.d(textView3, "binding.edit");
                k.K(textView3);
                RSVPButton rSVPButton = aVar.b().b;
                m0.n.b.i.d(rSVPButton, "binding.bellIcon");
                k.p(rSVPButton);
                TextView textView4 = aVar.b().c;
                m0.n.b.i.d(textView4, "binding.edit");
                k.H(textView4, aVar.a, new d(this, eventInClub));
                return;
            }
            TextView textView5 = aVar.b().c;
            m0.n.b.i.d(textView5, "binding.edit");
            k.p(textView5);
            RSVPButton rSVPButton2 = aVar.b().b;
            m0.n.b.i.d(rSVPButton2, "binding.bellIcon");
            k.L(rSVPButton2, Boolean.valueOf(true ^ eventInClub.g2));
            RSVPButton rSVPButton3 = aVar.b().b;
            Boolean bool = eventInClub.x;
            if (bool != null) {
                z3 = bool.booleanValue();
            }
            rSVPButton3.setChecked(z3);
            RSVPButton rSVPButton4 = aVar.b().b;
            m0.n.b.i.d(rSVPButton4, "binding.bellIcon");
            k.H(rSVPButton4, aVar.a, new f(this, eventInClub, aVar));
        }
    }
}
