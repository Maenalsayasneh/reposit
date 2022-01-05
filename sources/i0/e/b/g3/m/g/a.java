package i0.e.b.g3.m.g;

import com.clubhouse.android.data.models.local.Topic;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: TopicsViewModel.kt */
public final class a implements c {
    public final Topic a;

    public a(Topic topic) {
        i.e(topic, "topic");
        this.a = topic;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && i.a(this.a, ((a) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AddTopic(topic=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
