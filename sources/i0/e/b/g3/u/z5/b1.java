package i0.e.b.g3.u.z5;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.profile.settings.NotificationSettingsArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: SettingsFragmentDirections.kt */
public final class b1 implements l {
    public final NotificationSettingsArgs a;

    public b1(NotificationSettingsArgs notificationSettingsArgs) {
        i.e(notificationSettingsArgs, "mavericksArg");
        this.a = notificationSettingsArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(NotificationSettingsArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(NotificationSettingsArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(NotificationSettingsArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_settingsFragment_to_notificationSettingsFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && i.a(this.a, ((b1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionSettingsFragmentToNotificationSettingsFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
