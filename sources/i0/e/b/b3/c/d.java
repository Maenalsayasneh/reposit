package i0.e.b.b3.c;

import com.clubhouse.android.data.models.local.notification.ActionableNotificationType;
import java.util.Set;
import kotlin.collections.EmptySet;
import m0.j.g;
import n0.a.g2.a0;
import n0.a.g2.q;

/* compiled from: UserCache.kt */
public final class d {
    public static final Set<ActionableNotificationType> a = g.h0(ActionableNotificationType.INVITED_TO_CLUB, ActionableNotificationType.ON_CLUBHOUSE, ActionableNotificationType.FOLLOWED_YOU, ActionableNotificationType.CLUB_REVIEW_CHANGES);
    public final q<Set<Integer>> b;
    public final q<Set<Integer>> c;
    public final q<Boolean> d = a0.a(Boolean.FALSE);
    public final q<Integer> e = a0.a(0);
    public final q<Integer> f = a0.a(0);
    public final n0.a.g2.d<Set<Integer>> g;
    public final n0.a.g2.d<Set<Integer>> h;

    public d() {
        EmptySet emptySet = EmptySet.c;
        q<Set<Integer>> a2 = a0.a(emptySet);
        this.b = a2;
        q<Set<Integer>> a3 = a0.a(emptySet);
        this.c = a3;
        this.g = a2;
        this.h = a3;
    }
}
