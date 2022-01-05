package defpackage;

import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.user.model.User;
import i0.b.b.b;
import i0.e.b.g3.u.d5;
import i0.e.b.g3.u.q4;
import j$.time.OffsetDateTime;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* renamed from: m  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class m extends Lambda implements l<q4, q4> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        EventInProfile eventInProfile = null;
        if (i == 0) {
            q4 q4Var = (q4) obj;
            i.e(q4Var, "$this$setState");
            EventInProfile eventInProfile2 = q4Var.t;
            if (eventInProfile2 != null) {
                eventInProfile = EventInProfile.c(eventInProfile2, (ClubWithAdmin) null, ((d5) this.d).b, 0, (String) null, (String) null, (List) null, (OffsetDateTime) null, false, (String) null, (String) null, false, 2045);
            }
            return q4.copy$default(q4Var, (User) null, (SourceLocation) null, false, false, false, false, false, false, (b) null, (b) null, (UserProfile) null, (List) null, false, (FollowNotificationType) null, false, false, false, false, (Integer) null, eventInProfile, false, false, 3670015, (Object) null);
        } else if (i == 1) {
            q4 q4Var2 = (q4) obj;
            i.e(q4Var2, "$this$setState");
            EventInProfile eventInProfile3 = q4Var2.t;
            if (eventInProfile3 != null) {
                eventInProfile = EventInProfile.c(eventInProfile3, (ClubWithAdmin) null, !((d5) this.d).b, 0, (String) null, (String) null, (List) null, (OffsetDateTime) null, false, (String) null, (String) null, false, 2045);
            }
            return q4.copy$default(q4Var2, (User) null, (SourceLocation) null, false, false, false, false, false, false, (b) null, (b) null, (UserProfile) null, (List) null, false, (FollowNotificationType) null, false, false, false, false, (Integer) null, eventInProfile, false, false, 3670015, (Object) null);
        } else {
            throw null;
        }
    }
}
