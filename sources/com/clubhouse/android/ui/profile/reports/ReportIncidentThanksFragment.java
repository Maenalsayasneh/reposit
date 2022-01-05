package com.clubhouse.android.ui.profile.reports;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.databinding.FragmentReportIncidentThanksBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b0.v;
import h0.q.f0;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.b.b.i;
import i0.e.b.g3.u.y5.e0;
import i0.e.b.g3.u.y5.l0;
import i0.e.b.g3.u.y5.n;
import i0.e.b.g3.u.y5.o;
import java.util.Deque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nR\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128F@\u0006X\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/clubhouse/android/ui/profile/reports/ReportIncidentThanksFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "P0", "Lcom/clubhouse/android/ui/profile/reports/ReportIncidentSelectCategoryContainerViewModel;", "f2", "Lm0/c;", "getContainerViewModel", "()Lcom/clubhouse/android/ui/profile/reports/ReportIncidentSelectCategoryContainerViewModel;", "containerViewModel", "Lcom/clubhouse/android/databinding/FragmentReportIncidentThanksBinding;", "d2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "O0", "()Lcom/clubhouse/android/databinding/FragmentReportIncidentThanksBinding;", "binding", "Lcom/clubhouse/android/ui/profile/reports/ReportIncidentThanksArgs;", "e2", "Lm0/o/c;", "N0", "()Lcom/clubhouse/android/ui/profile/reports/ReportIncidentThanksArgs;", "args", "<init>", "Z1", "a", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ReportIncidentThanksFragment.kt */
public final class ReportIncidentThanksFragment extends Hilt_ReportIncidentThanksFragment {
    public static final a Z1 = new a((f) null);
    public static final /* synthetic */ k<Object>[] a2 = {m.c(new PropertyReference1Impl(m.a(ReportIncidentThanksFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentReportIncidentThanksBinding;")), m.c(new PropertyReference1Impl(m.a(ReportIncidentThanksFragment.class), "args", "getArgs()Lcom/clubhouse/android/ui/profile/reports/ReportIncidentThanksArgs;")), m.c(new PropertyReference1Impl(m.a(ReportIncidentThanksFragment.class), "containerViewModel", "getContainerViewModel()Lcom/clubhouse/android/ui/profile/reports/ReportIncidentSelectCategoryContainerViewModel;"))};
    public static final String b2 = "ShowBlockUser";
    public static final String c2 = "HideChannelId";
    public final FragmentViewBindingDelegate d2 = new FragmentViewBindingDelegate(FragmentReportIncidentThanksBinding.class, this);
    public final m0.o.c e2 = new i();
    public final m0.c f2;

    /* compiled from: ReportIncidentThanksFragment.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* compiled from: ReportIncidentThanksFragment.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            ReportTarget.values();
            int[] iArr = new int[6];
            iArr[ReportTarget.CHANNEL_TOPIC.ordinal()] = 1;
            iArr[ReportTarget.CHAT_MESSAGES.ordinal()] = 2;
            iArr[ReportTarget.USER_SPOKEN.ordinal()] = 3;
            a = iArr;
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class c extends h<ReportIncidentThanksFragment, ReportIncidentSelectCategoryContainerViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public c(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public m0.c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new ReportIncidentThanksFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(l0.class), true, this.b);
        }
    }

    public ReportIncidentThanksFragment() {
        super(R.layout.fragment_report_incident_thanks);
        d a3 = m.a(ReportIncidentSelectCategoryContainerViewModel.class);
        this.f2 = new c(a3, true, new ReportIncidentThanksFragment$special$$inlined$parentFragmentViewModel$default$1(this, a3, a3), a3).a(this, a2[2]);
    }

    public void J() {
    }

    public final ReportIncidentThanksArgs N0() {
        return (ReportIncidentThanksArgs) this.e2.getValue(this, a2[1]);
    }

    public final FragmentReportIncidentThanksBinding O0() {
        return (FragmentReportIncidentThanksBinding) this.d2.getValue(this, a2[0]);
    }

    public final void P0() {
        T t;
        f0 a3;
        boolean z;
        int ordinal = N0().c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                String str = c2;
                String str2 = N0().d;
                if (str2 == null) {
                    str2 = "";
                }
                m0.n.b.i.e(this, "<this>");
                m0.n.b.i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
                Deque<h0.t.f> deque = NavHostFragment.I0(this).h;
                m0.n.b.i.d(deque, "findNavController(this).backStack");
                Iterator<T> it = deque.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((h0.t.f) t).d.q == R.id.hallwayFragment) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                h0.t.f fVar = (h0.t.f) t;
                if (!(fVar == null || (a3 = fVar.a()) == null)) {
                    a3.b(str, str2);
                }
                v.d1(this, R.id.hallwayFragment);
                return;
            } else if (ordinal != 3) {
                v.V1(this, b2, Boolean.TRUE);
                v.c1(this);
                return;
            }
        }
        ((ReportIncidentSelectCategoryContainerViewModel) this.f2.getValue()).p(e0.a);
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        m0.n.b.i.e(view, "view");
        super.onViewCreated(view, bundle);
        O0().a.setOnClickListener(new o(this));
        TextView textView = O0().b;
        m0.n.b.i.d(textView, "binding.reportCommunityGuidelines");
        p viewLifecycleOwner = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
        i0.e.b.d3.k.H(textView, q.a(viewLifecycleOwner), new n(this));
        TextView textView2 = O0().c;
        m0.n.b.i.d(textView2, "binding.reportGetHelp");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(textView2, q.a(viewLifecycleOwner2), new i0.e.b.g3.u.y5.q(this));
        TextView textView3 = O0().d;
        if (b.a[N0().c.ordinal()] == 1) {
            str = getResources().getString(R.string.the_room_title_has_been_reported);
        } else {
            str = getResources().getString(R.string.the_incident_has_been_reported);
        }
        textView3.setText(str);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new i0.e.b.g3.u.y5.p(this));
    }
}
