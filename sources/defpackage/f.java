package defpackage;

import com.clubhouse.android.shared.preferences.Key;
import com.clubhouse.android.ui.hallway.HallwayFragment;
import com.clubhouse.android.ui.hallway.HallwayFragment$invalidate$1$1$2$1$1$1;
import com.clubhouse.android.ui.hallway.HallwayFragment$invalidate$1$1$2$1$2$1;
import com.clubhouse.android.ui.hallway.HallwayFragment$invalidate$1$1$2$1$3$1;
import com.clubhouse.android.ui.hallway.HallwayFragment$invalidate$1$1$2$1$4$1;
import com.clubhouse.android.ui.hallway.HallwayFragment$invalidate$1$1$2$1$5$1;
import com.clubhouse.app.R;
import i0.e.b.g3.i.c;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* renamed from: f  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class f extends Lambda implements l<c, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i = this.c;
        if (i == 0) {
            c cVar = (c) obj;
            m0.n.b.i.e(cVar, "$this$action");
            boolean a = ((HallwayFragment) this.d).O0().a(Key.FORCE_USER_SUGGESTIONS, false);
            if (a) {
                str = ((HallwayFragment) this.d).getString(R.string.stop_forcing_user_suggestions);
                m0.n.b.i.d(str, "{\n                                    getString(R.string.stop_forcing_user_suggestions)\n                                }");
            } else {
                str = ((HallwayFragment) this.d).getString(R.string.force_user_suggestions);
                m0.n.b.i.d(str, "{\n                                    getString(R.string.force_user_suggestions)\n                                }");
            }
            cVar.b(str);
            cVar.a(new HallwayFragment$invalidate$1$1$2$1$1$1((HallwayFragment) this.d, a));
            return i.a;
        } else if (i == 1) {
            c cVar2 = (c) obj;
            m0.n.b.i.e(cVar2, "$this$action");
            boolean a2 = ((HallwayFragment) this.d).O0().a(Key.FORCE_CLUB_SUGGESTIONS, false);
            if (a2) {
                str2 = ((HallwayFragment) this.d).getString(R.string.stop_forcing_club_suggestions);
                m0.n.b.i.d(str2, "{\n                                    getString(R.string.stop_forcing_club_suggestions)\n                                }");
            } else {
                str2 = ((HallwayFragment) this.d).getString(R.string.force_club_suggestions);
                m0.n.b.i.d(str2, "{\n                                    getString(R.string.force_club_suggestions)\n                                }");
            }
            cVar2.b(str2);
            cVar2.a(new HallwayFragment$invalidate$1$1$2$1$2$1((HallwayFragment) this.d, a2));
            return i.a;
        } else if (i == 2) {
            c cVar3 = (c) obj;
            m0.n.b.i.e(cVar3, "$this$action");
            boolean a3 = ((HallwayFragment) this.d).O0().a(Key.FORCE_EVENT_SUGGESTIONS, false);
            if (a3) {
                str3 = ((HallwayFragment) this.d).getString(R.string.stop_forcing_event_suggestions);
                m0.n.b.i.d(str3, "{\n                                    getString(R.string.stop_forcing_event_suggestions)\n                                }");
            } else {
                str3 = ((HallwayFragment) this.d).getString(R.string.force_event_suggestions);
                m0.n.b.i.d(str3, "{\n                                    getString(R.string.force_event_suggestions)\n                                }");
            }
            cVar3.b(str3);
            cVar3.a(new HallwayFragment$invalidate$1$1$2$1$3$1((HallwayFragment) this.d, a3));
            return i.a;
        } else if (i == 3) {
            c cVar4 = (c) obj;
            m0.n.b.i.e(cVar4, "$this$action");
            boolean a4 = ((HallwayFragment) this.d).O0().a(Key.FORCE_TOPIC_SUGGESTIONS, false);
            if (a4) {
                str4 = ((HallwayFragment) this.d).getString(R.string.stop_forcing_topic_suggestions);
                m0.n.b.i.d(str4, "{\n                                    getString(R.string.stop_forcing_topic_suggestions)\n                                }");
            } else {
                str4 = ((HallwayFragment) this.d).getString(R.string.force_topic_suggestions);
                m0.n.b.i.d(str4, "{\n                                    getString(R.string.force_topic_suggestions)\n                                }");
            }
            cVar4.b(str4);
            cVar4.a(new HallwayFragment$invalidate$1$1$2$1$4$1((HallwayFragment) this.d, a4));
            return i.a;
        } else if (i == 4) {
            c cVar5 = (c) obj;
            m0.n.b.i.e(cVar5, "$this$action");
            boolean a5 = ((HallwayFragment) this.d).O0().a(Key.FORCE_LANGUAGE_PICKER, false);
            if (a5) {
                str5 = ((HallwayFragment) this.d).getString(R.string.stop_forcing_language_picker);
                m0.n.b.i.d(str5, "{\n                                    getString(R.string.stop_forcing_language_picker)\n                                }");
            } else {
                str5 = ((HallwayFragment) this.d).getString(R.string.force_language_picker);
                m0.n.b.i.d(str5, "{\n                                    getString(R.string.force_language_picker)\n                                }");
            }
            cVar5.b(str5);
            cVar5.a(new HallwayFragment$invalidate$1$1$2$1$5$1((HallwayFragment) this.d, a5));
            return i.a;
        } else {
            throw null;
        }
    }
}
