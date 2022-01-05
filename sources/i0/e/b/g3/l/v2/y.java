package i0.e.b.g3.l.v2;

import com.clubhouse.android.data.models.local.Topic;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import java.util.List;
import m0.n.b.i;

/* compiled from: CreateClubViewModel.kt */
public final class y implements c {
    public final List<Topic> a;

    public y(List<Topic> list) {
        i.e(list, "topics");
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && i.a(this.a, ((y) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.A0(a.P0("UpdateTopics(topics="), this.a, ')');
    }
}
