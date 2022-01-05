package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.app.R;
import h0.b.a.d;
import h0.t.q;
import i0.e.b.g3.i.c;
import i0.e.b.g3.l.f0;
import i0.e.b.g3.l.g0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$buildHeaderModelForLeader$2$3$1 extends Lambda implements l<ActionSheetBuilder, i> {
    public final /* synthetic */ ClubWithAdmin c;
    public final /* synthetic */ ClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$buildHeaderModelForLeader$2$3$1(ClubWithAdmin clubWithAdmin, ClubFragment clubFragment) {
        super(1);
        this.c = clubWithAdmin;
        this.d = clubFragment;
    }

    public Object invoke(Object obj) {
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
        List<ClubRule> list = this.c.a2;
        if (!(list == null || list.isEmpty())) {
            final ClubFragment clubFragment = this.d;
            final ClubWithAdmin clubWithAdmin = this.c;
            actionSheetBuilder.a(new l<c, i>() {
                public Object invoke(Object obj) {
                    c cVar = (c) obj;
                    m0.n.b.i.e(cVar, "$this$action");
                    String string = ClubFragment.this.getString(R.string.view_rules);
                    m0.n.b.i.d(string, "getString(R.string.view_rules)");
                    cVar.b(string);
                    final ClubFragment clubFragment = ClubFragment.this;
                    final ClubWithAdmin clubWithAdmin = clubWithAdmin;
                    cVar.a(new a<i>() {
                        public Object invoke() {
                            ClubFragment clubFragment = ClubFragment.this;
                            ClubWithAdmin clubWithAdmin = clubWithAdmin;
                            Boolean bool = Boolean.FALSE;
                            m0.n.b.i.e(clubFragment, "<this>");
                            m0.n.b.i.e(clubWithAdmin, "club");
                            HalfClubRulesArgs halfClubRulesArgs = new HalfClubRulesArgs(clubWithAdmin, bool, "", SourceLocation.CLUB, (Map) null, 16);
                            i0.d.a.a.a.m(halfClubRulesArgs, "mavericksArg", halfClubRulesArgs, clubFragment, (q) null, 2);
                            return i.a;
                        }
                    });
                    return i.a;
                }
            });
        }
        final ClubFragment clubFragment2 = this.d;
        actionSheetBuilder.a(new l<c, i>() {
            public Object invoke(Object obj) {
                c cVar = (c) obj;
                m0.n.b.i.e(cVar, "$this$action");
                String string = ClubFragment.this.getString(R.string.leave_club);
                m0.n.b.i.d(string, "getString(R.string.leave_club)");
                cVar.b(string);
                final ClubFragment clubFragment = ClubFragment.this;
                cVar.a(new a<i>() {
                    public Object invoke() {
                        final ClubFragment clubFragment = ClubFragment.this;
                        AnonymousClass1 r1 = new l<d.a, i>() {
                            public Object invoke(Object obj) {
                                d.a aVar = (d.a) obj;
                                i0.d.a.a.a.j(aVar, "$this$alertDialog", R.string.leave_the_club, R.string.leave_club_message_member);
                                aVar.d(R.string.leave, new f0(ClubFragment.this));
                                aVar.c(R.string.never_mind, g0.c);
                                return i.a;
                            }
                        };
                        m0.n.b.i.e(clubFragment, "<this>");
                        m0.n.b.i.e(r1, "f");
                        d.a aVar = new d.a(clubFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
                        r1.invoke(aVar);
                        aVar.g();
                        return i.a;
                    }
                });
                return i.a;
            }
        });
        return i.a;
    }
}
