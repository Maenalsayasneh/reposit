package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.remote.response.JoinClubResponse;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.g3.p.c0.v;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$joinClub$2 extends Lambda implements p<v, b<? extends JoinClubResponse>, v> {
    public final /* synthetic */ FeedViewModel c;
    public final /* synthetic */ Club d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$joinClub$2(FeedViewModel feedViewModel, Club club) {
        super(2);
        this.c = feedViewModel;
        this.d = club;
    }

    public Object invoke(Object obj, Object obj2) {
        String str;
        v vVar = (v) obj;
        b bVar = (b) obj2;
        i.e(vVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            FeedViewModel feedViewModel = this.c;
            if (i.a(((JoinClubResponse) ((f0) bVar).b).c, Boolean.TRUE)) {
                str = this.c.p.getString(R.string.club_apply_to_join_success, new Object[]{this.d.getName()});
            } else {
                str = this.c.p.getString(R.string.club_join_success, new Object[]{this.d.getName()});
            }
            i.d(str, "if (it.invoke().isPendingApproval == true) {\n                            resources.getString(R.string.club_apply_to_join_success, club.name)\n                        } else {\n                            resources.getString(R.string.club_join_success, club.name)\n                        }");
            feedViewModel.o(new e(str));
            FeedViewModel feedViewModel2 = this.c;
            Club club = this.d;
            Objects.requireNonNull(feedViewModel2);
            feedViewModel2.n(new FeedViewModel$hideClubSuggestion$1(feedViewModel2, club));
        }
        if (bVar instanceof c) {
            FeedViewModel feedViewModel3 = this.c;
            String message = ((c) bVar).b.getMessage();
            if (message == null) {
                if (this.d.O()) {
                    message = this.c.p.getString(R.string.club_join_error, new Object[]{this.d.getName()});
                } else {
                    message = this.c.p.getString(R.string.club_apply_to_join_error, new Object[]{this.d.getName()});
                }
                i.d(message, "if (club.isMembershipOpen) {\n                            (resources.getString(R.string.club_join_error, club.name))\n                        } else {\n                            (resources.getString(R.string.club_apply_to_join_error, club.name))\n                        }");
            }
            feedViewModel3.o(new d(message));
        }
        return vVar;
    }
}
