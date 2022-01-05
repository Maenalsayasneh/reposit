package i0.e.b.g3.p.c0.e0;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.FeedUserSuggestionBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.b3.b.e.m;
import i0.e.b.d3.k;
import m0.i;
import m0.n.a.l;
import m0.n.a.p;

/* compiled from: UserSuggestion.kt */
public abstract class w0 extends BaseEpoxyModelWithHolder<a> {
    public m j;
    public l<? super User, i> k;
    public p<? super m, ? super Boolean, i> l;
    public l<? super m, i> m;

    /* compiled from: UserSuggestion.kt */
    public static final class a extends d {
        public FeedUserSuggestionBinding b;

        public void a(View view) {
            m0.n.b.i.e(view, "itemView");
            FeedUserSuggestionBinding bind = FeedUserSuggestionBinding.bind(view);
            m0.n.b.i.d(bind, "bind(itemView)");
            m0.n.b.i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final FeedUserSuggestionBinding b() {
            FeedUserSuggestionBinding feedUserSuggestionBinding = this.b;
            if (feedUserSuggestionBinding != null) {
                return feedUserSuggestionBinding;
            }
            m0.n.b.i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        m0.n.b.i.e(aVar, "holder");
        m mVar = this.j;
        if (mVar != null) {
            L(aVar, mVar.i);
            String str = mVar.g.a2;
            if (str != null) {
                aVar.b().g.b.setText(str);
                ConstraintLayout constraintLayout = aVar.b().g.a;
                m0.n.b.i.d(constraintLayout, "binding.reasonContainer.root");
                k.K(constraintLayout);
            }
            AvatarView avatarView = aVar.b().b;
            m0.n.b.i.d(avatarView, "binding.avatar");
            UserInList userInList = mVar.g;
            v.S0(avatarView, userInList.Z1, userInList.y, 0.0f, 4);
            aVar.b().f.setText(mVar.g.y);
            String str2 = mVar.g.c;
            if (!(str2 == null || str2.length() == 0)) {
                aVar.b().c.setText(mVar.g.c);
            } else {
                CharSequence text = aVar.b().c.getResources().getText(R.string.no_bio);
                m0.n.b.i.d(text, "resources().getText(R.string.no_bio)");
                aVar.b().c.setText(text);
                TextView textView = aVar.b().c;
                m0.n.b.i.d(textView, "binding.bio");
                k.z(textView, text.toString());
            }
            aVar.b().e.setOnClickListener(new i(this, mVar, aVar));
            aVar.b().d.setOnClickListener(new j(this, mVar));
            aVar.b().a.setOnClickListener(new k(this, mVar));
        }
    }

    public final void L(a aVar, boolean z) {
        aVar.b().e.setChecked(z);
        aVar.b().d.setVisibility(!z ? 0 : 4);
    }
}
