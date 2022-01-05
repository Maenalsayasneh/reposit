package i0.e.b.g3.p.c0;

import com.clubhouse.android.data.models.local.Topic;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: FeedViewModel.kt */
public final class x implements c {
    public final Topic a;

    public x(Topic topic) {
        i.e(topic, "topic");
        this.a = topic;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && i.a(this.a, ((x) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("OnTopicAdded(topic=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
