package i0.e.b.g3.p.c0.e0;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.databinding.FeedClubSuggestionBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubSuggestion.kt */
public abstract class p extends BaseEpoxyModelWithHolder<a> {
    public Club j;
    public l<? super Club, i> k;
    public l<? super Club, i> l;
    public l<? super Club, i> m;
    public l<? super Club, i> n;

    /* compiled from: ClubSuggestion.kt */
    public static final class a extends d {
        public FeedClubSuggestionBinding b;

        public void a(View view) {
            m0.n.b.i.e(view, "itemView");
            FeedClubSuggestionBinding bind = FeedClubSuggestionBinding.bind(view);
            m0.n.b.i.d(bind, "bind(itemView)");
            m0.n.b.i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final FeedClubSuggestionBinding b() {
            FeedClubSuggestionBinding feedClubSuggestionBinding = this.b;
            if (feedClubSuggestionBinding != null) {
                return feedClubSuggestionBinding;
            }
            m0.n.b.i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        String str;
        m0.n.b.i.e(aVar, "holder");
        Club club = this.j;
        if (club != null) {
            String a2 = club.a();
            if (a2 != null) {
                aVar.b().g.b.setText(a2);
                ConstraintLayout constraintLayout = aVar.b().g.a;
                m0.n.b.i.d(constraintLayout, "binding.reasonContainer.root");
                k.K(constraintLayout);
            }
            AvatarView avatarView = aVar.b().b;
            m0.n.b.i.d(avatarView, "binding.avatar");
            k.t(avatarView, club);
            aVar.b().f.setText(club.getName());
            TextView textView = aVar.b().f;
            m0.n.b.i.d(textView, "binding.name");
            k.a(textView);
            String description = club.getDescription();
            if (!(description == null || description.length() == 0)) {
                aVar.b().c.setText(club.getDescription());
            } else {
                CharSequence text = L(aVar).getText(R.string.no_club_description);
                m0.n.b.i.d(text, "resources().getText(R.string.no_club_description)");
                aVar.b().c.setText(text);
                TextView textView2 = aVar.b().c;
                m0.n.b.i.d(textView2, "binding.description");
                k.z(textView2, text.toString());
            }
            Button button = aVar.b().e;
            if (club.O()) {
                str = L(aVar).getString(R.string.club_join);
            } else {
                str = L(aVar).getString(R.string.club_apply_to_join);
            }
            button.setText(str);
            aVar.b().e.setOnClickListener(new a(club, this));
            aVar.b().d.setOnClickListener(new c(this, club));
            aVar.b().a.setOnClickListener(new b(this, club));
        }
    }

    public final Resources L(a aVar) {
        return aVar.b().c.getResources();
    }
}
