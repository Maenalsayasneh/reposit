package i0.e.b.g3.l.c3;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ClubMemberSearchBarBinding;
import com.clubhouse.app.R;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: ClubMemberSearchBar.kt */
public abstract class q extends BaseEpoxyModelWithHolder<a> {
    public View.OnClickListener j;

    /* compiled from: ClubMemberSearchBar.kt */
    public static final class a extends d {
        public ClubMemberSearchBarBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ClubMemberSearchBarBinding bind = ClubMemberSearchBarBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        ClubMemberSearchBarBinding clubMemberSearchBarBinding = aVar.b;
        if (clubMemberSearchBarBinding != null) {
            clubMemberSearchBarBinding.a.setOnClickListener(this.j);
        } else {
            i.m("binding");
            throw null;
        }
    }

    public int o() {
        return R.layout.club_member_search_bar;
    }
}
