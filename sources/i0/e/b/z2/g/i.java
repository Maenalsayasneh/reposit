package i0.e.b.z2.g;

import com.clubhouse.android.channels.model.AudienceType;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: ChannelViewModel.kt */
public final class i implements c {
    public final AudienceType a;

    public i(AudienceType audienceType) {
        m0.n.b.i.e(audienceType, "audienceType");
        this.a = audienceType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.a == ((i) obj).a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ChangeRoomAccess(audienceType=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
