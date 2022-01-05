package i0.e.b.b3.b.e;

import com.clubhouse.android.data.models.local.EventInClub;
import java.util.Map;
import m0.n.b.f;

/* compiled from: PagingItem.kt */
public abstract class a extends j {
    public final EventInClub b;
    public final Map<String, Object> c;

    public a(EventInClub eventInClub, Map map, f fVar) {
        super(map, (f) null);
        this.b = eventInClub;
        this.c = map;
    }

    public EventInClub a() {
        return this.b;
    }

    public abstract a b(EventInClub eventInClub);
}
