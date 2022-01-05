package i0.e.c.h;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.backchannel.CreateChatArgs;
import com.clubhouse.backchannel.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;

/* compiled from: BackchannelInboxFragmentDirections.kt */
public final class i implements l {
    public final CreateChatArgs a;

    public i(CreateChatArgs createChatArgs) {
        m0.n.b.i.e(createChatArgs, "mavericksArg");
        this.a = createChatArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(CreateChatArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(CreateChatArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(m0.n.b.i.k(CreateChatArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_inboxFragment_to_createChatFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && m0.n.b.i.a(this.a, ((i) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionInboxFragmentToCreateChatFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
