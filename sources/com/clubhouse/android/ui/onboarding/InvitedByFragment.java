package com.clubhouse.android.ui.onboarding;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.databinding.FragmentInvitedByBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.r.k1;
import i0.e.b.g3.r.l1;
import i0.e.b.g3.r.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/clubhouse/android/ui/onboarding/InvitedByFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/databinding/FragmentInvitedByBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "getBinding", "()Lcom/clubhouse/android/databinding/FragmentInvitedByBinding;", "binding", "Li0/e/b/g3/r/l1;", "b2", "Lm0/c;", "getViewModel", "()Li0/e/b/g3/r/l1;", "viewModel", "<init>", "BundleInfo", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: InvitedByFragment.kt */
public final class InvitedByFragment extends Hilt_InvitedByFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(InvitedByFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentInvitedByBinding;")), m.c(new PropertyReference1Impl(m.a(InvitedByFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/onboarding/InvitedByViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentInvitedByBinding.class, this);
    public final c b2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<InvitedByFragment, l1> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public a(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new InvitedByFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(k1.class), false, this.b);
        }
    }

    public InvitedByFragment() {
        super(R.layout.fragment_invited_by);
        d a3 = m.a(l1.class);
        this.b2 = new a(a3, false, new InvitedByFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
    }

    public static final void N0(InvitedByFragment invitedByFragment, FragmentInvitedByBinding fragmentInvitedByBinding, String str, String str2) {
        Objects.requireNonNull(invitedByFragment);
        TextView textView = fragmentInvitedByBinding.b;
        Resources resources = invitedByFragment.getResources();
        i.d(resources, "resources");
        Object[] objArr = {str};
        ArrayList i1 = i0.d.a.a.a.i1(resources, "<this>", objArr, "rawArgs", 1);
        for (int i = 0; i < 1; i++) {
            Object obj = objArr[i];
            if (obj instanceof String) {
                String str3 = (String) obj;
                obj = i0.d.a.a.a.p0(str3, "<this>", str3, 63);
            }
            i1.add(obj);
        }
        String string = resources.getString(R.string.invited_by_club_name);
        i.d(string, "getString(id)");
        Object[] array = i1.toArray(new Object[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Object[] copyOf = Arrays.copyOf(array, array.length);
        String format = String.format(string, Arrays.copyOf(copyOf, copyOf.length));
        i.d(format, "java.lang.String.format(format, *args)");
        Spanned fromHtml = Html.fromHtml(format, 63);
        i.d(fromHtml, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
        textView.setText(fromHtml);
        fragmentInvitedByBinding.a.setText(AvatarView.c.a(str));
        fragmentInvitedByBinding.a.setSquareness(0.88f);
        AvatarView avatarView = fragmentInvitedByBinding.a;
        i.d(avatarView, "inviterImage");
        v.Q0(avatarView, str2);
    }

    public static final FragmentInvitedByBinding O0(InvitedByFragment invitedByFragment) {
        return (FragmentInvitedByBinding) invitedByFragment.a2.getValue(invitedByFragment, Z1[0]);
    }

    public void J() {
        v.v2((l1) this.b2.getValue(), new InvitedByFragment$invalidate$1(this));
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        ((FragmentInvitedByBinding) this.a2.getValue(this, Z1[0])).c.setOnClickListener(new w(this));
    }

    /* compiled from: InvitedByFragment.kt */
    public static final class BundleInfo implements Parcelable {
        public static final Parcelable.Creator<BundleInfo> CREATOR = new a();
        public final String c;
        public final String d;
        public final String q;
        public final String x;

        /* compiled from: InvitedByFragment.kt */
        public static final class a implements Parcelable.Creator<BundleInfo> {
            public Object createFromParcel(Parcel parcel) {
                i.e(parcel, "parcel");
                return new BundleInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new BundleInfo[i];
            }
        }

        public BundleInfo(String str, String str2, String str3, String str4) {
            this.c = str;
            this.d = str2;
            this.q = str3;
            this.x = str4;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundleInfo)) {
                return false;
            }
            BundleInfo bundleInfo = (BundleInfo) obj;
            return i.a(this.c, bundleInfo.c) && i.a(this.d, bundleInfo.d) && i.a(this.q, bundleInfo.q) && i.a(this.x, bundleInfo.x);
        }

        public int hashCode() {
            String str = this.c;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.q;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.x;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("BundleInfo(inviterName=");
            P0.append(this.c);
            P0.append(", inviterPhotoUrl=");
            P0.append(this.d);
            P0.append(", clubName=");
            P0.append(this.q);
            P0.append(", clubPhotoUrl=");
            return i0.d.a.a.a.w0(P0, this.x, ')');
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "out");
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.q);
            parcel.writeString(this.x);
        }

        public BundleInfo() {
            this((String) null, (String) null, (String) null, (String) null);
        }
    }
}
