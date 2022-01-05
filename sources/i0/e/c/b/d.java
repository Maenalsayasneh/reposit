package i0.e.c.b;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.chat.ChatArgs;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: BackchannelArchiveFragmentDirections.kt */
public final class d implements l {
    public final ChatArgs a;

    public d(ChatArgs chatArgs) {
        i.e(chatArgs, "mavericksArg");
        this.a = chatArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(ChatArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(ChatArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(ChatArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_archiveFragment_to_chatFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && i.a(this.a, ((d) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionArchiveFragmentToChatFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
