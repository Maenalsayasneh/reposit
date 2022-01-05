package defpackage;

import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserProfile;
import i0.b.b.b;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.d5;
import j$.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.n.b.i;

/* renamed from: l  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class l extends Lambda implements m0.n.a.l<c5, c5> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        EventInProfile eventInProfile = null;
        if (i == 0) {
            c5 c5Var = (c5) obj;
            i.e(c5Var, "$this$setState");
            EventInProfile eventInProfile2 = c5Var.t;
            if (eventInProfile2 != null) {
                eventInProfile = EventInProfile.c(eventInProfile2, (ClubWithAdmin) null, ((d5) this.d).b, 0, (String) null, (String) null, (List) null, (OffsetDateTime) null, false, (String) null, (String) null, false, 2045);
            }
            return c5.copy$default(c5Var, (Integer) null, (SourceLocation) null, (Map) null, (String) null, (BasicUser) null, (b) null, false, false, false, (b) null, (b) null, (UserProfile) null, (List) null, (FollowNotificationType) null, (Integer) null, false, false, false, false, eventInProfile, false, false, 3670015, (Object) null);
        } else if (i == 1) {
            c5 c5Var2 = (c5) obj;
            i.e(c5Var2, "$this$setState");
            EventInProfile eventInProfile3 = c5Var2.t;
            if (eventInProfile3 != null) {
                eventInProfile = EventInProfile.c(eventInProfile3, (ClubWithAdmin) null, !((d5) this.d).b, 0, (String) null, (String) null, (List) null, (OffsetDateTime) null, false, (String) null, (String) null, false, 2045);
            }
            return c5.copy$default(c5Var2, (Integer) null, (SourceLocation) null, (Map) null, (String) null, (BasicUser) null, (b) null, false, false, false, (b) null, (b) null, (UserProfile) null, (List) null, (FollowNotificationType) null, (Integer) null, false, false, false, false, eventInProfile, false, false, 3670015, (Object) null);
        } else {
            throw null;
        }
    }
}
