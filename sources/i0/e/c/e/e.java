package i0.e.c.e;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.chat.ChatArgs;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: BackchannelCreateChatFragmentDirections.kt */
public final class e implements l {
    public final ChatArgs a;

    public e(ChatArgs chatArgs) {
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
        return R.id.action_createChatFragment_to_chatFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && i.a(this.a, ((e) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionCreateChatFragmentToChatFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
