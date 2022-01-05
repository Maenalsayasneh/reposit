package i0.e.b.g3.u;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.core.ui.WrappedBottomSheetArgs;
import com.clubhouse.android.ui.clubs.ClubArgs;
import com.clubhouse.android.ui.events.HalfEventArgs;
import com.clubhouse.android.ui.payments.SendDirectPaymentArgs;
import com.clubhouse.android.ui.profile.EditBioArgs;
import com.clubhouse.android.ui.profile.EditNameArgs;
import com.clubhouse.android.ui.profile.EditUsernameArgs;
import com.clubhouse.android.ui.profile.FollowListArgs;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.clubhouse.android.ui.profile.reports.ReportProfileArgs;
import com.clubhouse.android.ui.profile.reports.ReportProfileLegacyArgs;
import com.clubhouse.app.R;
import java.io.Serializable;

/* compiled from: HalfProfileFragmentDirections.kt */
public final class o4 {
    public static final m a = new m((m0.n.b.f) null);

    /* compiled from: HalfProfileFragmentDirections.kt */
    public static final class a implements h0.t.l {
        public final ClubArgs a;

        public a(ClubArgs clubArgs) {
            m0.n.b.i.e(clubArgs, "mavericksArg");
            this.a = clubArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ClubArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(ClubArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(m0.n.b.i.k(ClubArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_halfProfileFragment_to_clubFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && m0.n.b.i.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionHalfProfileFragmentToClubFragment(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: HalfProfileFragmentDirections.kt */
    public static final class b implements h0.t.l {
        public final EditBioArgs a;

        public b(EditBioArgs editBioArgs) {
            m0.n.b.i.e(editBioArgs, "mavericksArg");
            this.a = editBioArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(EditBioArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(EditBioArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(m0.n.b.i.k(EditBioArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_halfprofileFragment_to_editBioDialog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && m0.n.b.i.a(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionHalfprofileFragmentToEditBioDialog(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: HalfProfileFragmentDirections.kt */
    public static final class c implements h0.t.l {
        public final EditNameArgs a;

        public c(EditNameArgs editNameArgs) {
            m0.n.b.i.e(editNameArgs, "mavericksArg");
            this.a = editNameArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(EditNameArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(EditNameArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(m0.n.b.i.k(EditNameArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_halfprofileFragment_to_editNameFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && m0.n.b.i.a(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionHalfprofileFragmentToEditNameFragment(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: HalfProfileFragmentDirections.kt */
    public static final class d implements h0.t.l {
        public final WrappedBottomSheetArgs a;

        public d(WrappedBottomSheetArgs wrappedBottomSheetArgs) {
            m0.n.b.i.e(wrappedBottomSheetArgs, "mavericksArg");
            this.a = wrappedBottomSheetArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(WrappedBottomSheetArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(WrappedBottomSheetArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(m0.n.b.i.k(WrappedBottomSheetArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_halfprofileFragment_to_editPhotoFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && m0.n.b.i.a(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionHalfprofileFragmentToEditPhotoFragment(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: HalfProfileFragmentDirections.kt */
    public static final class e implements h0.t.l {
        public final EditUsernameArgs a;

        public e(EditUsernameArgs editUsernameArgs) {
            m0.n.b.i.e(editUsernameArgs, "mavericksArg");
            this.a = editUsernameArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(EditUsernameArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(EditUsernameArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(m0.n.b.i.k(EditUsernameArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_halfprofileFragment_to_editUsernameFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && m0.n.b.i.a(this.a, ((e) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionHalfprofileFragmentToEditUsernameFragment(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: HalfProfileFragmentDirections.kt */
    public static final class f implements h0.t.l {
        public final FollowListArgs a;

        public f(FollowListArgs followListArgs) {
            m0.n.b.i.e(followListArgs, "mavericksArg");
            this.a = followListArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(FollowListArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(FollowListArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(m0.n.b.i.k(FollowListArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_halfprofileFragment_to_followListFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && m0.n.b.i.a(this.a, ((f) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionHalfprofileFragmentToFollowListFragment(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: HalfProfileFragmentDirections.kt */
    public static final class g implements h0.t.l {
        public final HalfEventArgs a;

        public g(HalfEventArgs halfEventArgs) {
            m0.n.b.i.e(halfEventArgs, "mavericksArg");
            this.a = halfEventArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(HalfEventArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(HalfEventArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(m0.n.b.i.k(HalfEventArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_halfprofileFragment_to_halfEventDialog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && m0.n.b.i.a(this.a, ((g) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionHalfprofileFragmentToHalfEventDialog(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: HalfProfileFragmentDirections.kt */
    public static final class h implements h0.t.l {
        public final ProfileArgs a;
        public final String b;

        public h(ProfileArgs profileArgs, String str) {
            m0.n.b.i.e(profileArgs, "mavericksArg");
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
                throw new UnsupportedOperationException(m0.n.b.i.k(ProfileArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putString("username", this.b);
            return bundle;
        }

        public int b() {
            return R.id.action_halfprofileFragment_to_profileFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return m0.n.b.i.a(this.a, hVar.a) && m0.n.b.i.a(this.b, hVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionHalfprofileFragmentToProfileFragment(mavericksArg=");
            P0.append(this.a);
            P0.append(", username=");
            return i0.d.a.a.a.w0(P0, this.b, ')');
        }
    }

    /* compiled from: HalfProfileFragmentDirections.kt */
    public static final class i implements h0.t.l {
        public final WrappedBottomSheetArgs a;

        public i(WrappedBottomSheetArgs wrappedBottomSheetArgs) {
            m0.n.b.i.e(wrappedBottomSheetArgs, "mavericksArg");
            this.a = wrappedBottomSheetArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(WrappedBottomSheetArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(WrappedBottomSheetArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(m0.n.b.i.k(WrappedBottomSheetArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_halfprofileFragment_to_profilePhotoDialog;
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
            StringBuilder P0 = i0.d.a.a.a.P0("ActionHalfprofileFragmentToProfilePhotoDialog(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: HalfProfileFragmentDirections.kt */
    public static final class j implements h0.t.l {
        public final ReportProfileArgs a;

        public j(ReportProfileArgs reportProfileArgs) {
            m0.n.b.i.e(reportProfileArgs, "mavericksArg");
            this.a = reportProfileArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ReportProfileArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(ReportProfileArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(m0.n.b.i.k(ReportProfileArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_halfprofileFragment_to_reportProfileFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && m0.n.b.i.a(this.a, ((j) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionHalfprofileFragmentToReportProfileFragment(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: HalfProfileFragmentDirections.kt */
    public static final class k implements h0.t.l {
        public final ReportProfileLegacyArgs a;

        public k(ReportProfileLegacyArgs reportProfileLegacyArgs) {
            m0.n.b.i.e(reportProfileLegacyArgs, "mavericksArg");
            this.a = reportProfileLegacyArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ReportProfileLegacyArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(ReportProfileLegacyArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(m0.n.b.i.k(ReportProfileLegacyArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_halfprofileFragment_to_reportProfileLegacyFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && m0.n.b.i.a(this.a, ((k) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionHalfprofileFragmentToReportProfileLegacyFragment(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: HalfProfileFragmentDirections.kt */
    public static final class l implements h0.t.l {
        public final SendDirectPaymentArgs a;

        public l(SendDirectPaymentArgs sendDirectPaymentArgs) {
            m0.n.b.i.e(sendDirectPaymentArgs, "mavericksArg");
            this.a = sendDirectPaymentArgs;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(SendDirectPaymentArgs.class)) {
                bundle.putParcelable("mavericks:arg", this.a);
            } else if (Serializable.class.isAssignableFrom(SendDirectPaymentArgs.class)) {
                bundle.putSerializable("mavericks:arg", (Serializable) this.a);
            } else {
                throw new UnsupportedOperationException(m0.n.b.i.k(SendDirectPaymentArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            return bundle;
        }

        public int b() {
            return R.id.action_halfprofileFragment_to_sendDirectPaymentDialog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && m0.n.b.i.a(this.a, ((l) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionHalfprofileFragmentToSendDirectPaymentDialog(mavericksArg=");
            P0.append(this.a);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: HalfProfileFragmentDirections.kt */
    public static final class m {
        public m(m0.n.b.f fVar) {
        }

        public final h0.t.l a(ClubArgs clubArgs) {
            m0.n.b.i.e(clubArgs, "mavericksArg");
            return new a(clubArgs);
        }
    }
}
