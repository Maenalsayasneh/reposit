package i0.e.b.g3.o;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.clubs.ClubArgs;
import com.clubhouse.android.ui.events.HalfEventArgs;
import com.clubhouse.android.ui.events.creation.AddEditEventArgs;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.clubhouse.app.R;
import h0.t.l;
import java.io.Serializable;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: EventsFragmentDirections.kt */
public final class e0 {
    public static final e a = new e((f) null);

    /* compiled from: EventsFragmentDirections.kt */
    public static final class a implements l {
        public final AddEditEventArgs a;

        public a(AddEditEventArgs addEditEventArgs) {
            i.e(addEditEventArgs, "mavericksArg");
            this.a = addEditEventArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(AddEditEventArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(AddEditEventArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(i.k(AddEditEventArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_eventsFragment_to_addEditEventFragment;
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
            StringBuilder P0 = i0.d.a.a.a.P0("ActionEventsFragmentToAddEditEventFragment(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: EventsFragmentDirections.kt */
    public static final class b implements l {
        public final ClubArgs a;

        public b(ClubArgs clubArgs) {
            i.e(clubArgs, "mavericksArg");
            this.a = clubArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ClubArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(ClubArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(i.k(ClubArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_eventsFragment_to_clubFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && i.a(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionEventsFragmentToClubFragment(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: EventsFragmentDirections.kt */
    public static final class c implements l {
        public final HalfEventArgs a;

        public c(HalfEventArgs halfEventArgs) {
            i.e(halfEventArgs, "mavericksArg");
            this.a = halfEventArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(HalfEventArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(HalfEventArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(i.k(HalfEventArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_eventsFragment_to_halfEventDialog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && i.a(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionEventsFragmentToHalfEventDialog(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: EventsFragmentDirections.kt */
    public static final class d implements l {
        public final ProfileArgs a;
        public final String b;

        public d(ProfileArgs profileArgs, String str) {
            i.e(profileArgs, "mavericksArg");
            this.a = profileArgs;
            this.b = str;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ProfileArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(ProfileArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(i.k(ProfileArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putString("username", this.b);
            return bundle;
        }

        public int b() {
            return R.id.action_eventsFragment_to_profileFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return i.a(this.a, dVar.a) && i.a(this.b, dVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionEventsFragmentToProfileFragment(mavericksArg=");
            P0.append(this.a);
            P0.append(", username=");
            return i0.d.a.a.a.w0(P0, this.b, ')');
        }
    }

    /* compiled from: EventsFragmentDirections.kt */
    public static final class e {
        public e(f fVar) {
        }

        public final l a(HalfEventArgs halfEventArgs) {
            i.e(halfEventArgs, "mavericksArg");
            return new c(halfEventArgs);
        }
    }
}
