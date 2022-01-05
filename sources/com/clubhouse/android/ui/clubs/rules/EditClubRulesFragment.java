package com.clubhouse.android.ui.clubs.rules;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.android.databinding.ClubRuleTitleDescriptionBinding;
import com.clubhouse.android.databinding.FragmentEditClubRulesBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import i0.b.b.g;
import i0.b.b.h;
import i0.b.b.i;
import i0.e.b.g3.l.b3.j;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010(\u001a\u00020#8B@\u0002X\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/clubhouse/android/ui/clubs/rules/EditClubRulesFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/data/models/local/club/ClubRule;", "rule", "Lcom/clubhouse/android/databinding/ClubRuleTitleDescriptionBinding;", "ruleBinding", "Q0", "(Lcom/clubhouse/android/data/models/local/club/ClubRule;Lcom/clubhouse/android/databinding/ClubRuleTitleDescriptionBinding;)V", "Landroid/widget/TextView;", "clubExplanationRemainingView", "", "explanation", "R0", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Lcom/clubhouse/android/ui/clubs/rules/EditClubRulesViewModel;", "a2", "Lm0/c;", "P0", "()Lcom/clubhouse/android/ui/clubs/rules/EditClubRulesViewModel;", "viewModel", "Lcom/clubhouse/android/ui/clubs/rules/EditClubRulesArgs;", "c2", "Lm0/o/c;", "N0", "()Lcom/clubhouse/android/ui/clubs/rules/EditClubRulesArgs;", "args", "Lcom/clubhouse/android/databinding/FragmentEditClubRulesBinding;", "b2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "O0", "()Lcom/clubhouse/android/databinding/FragmentEditClubRulesBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: EditClubRulesFragment.kt */
public final class EditClubRulesFragment extends Hilt_EditClubRulesFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(EditClubRulesFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/clubs/rules/EditClubRulesViewModel;")), m.c(new PropertyReference1Impl(m.a(EditClubRulesFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentEditClubRulesBinding;")), m.c(new PropertyReference1Impl(m.a(EditClubRulesFragment.class), "args", "getArgs()Lcom/clubhouse/android/ui/clubs/rules/EditClubRulesArgs;"))};
    public final c a2;
    public final FragmentViewBindingDelegate b2 = new FragmentViewBindingDelegate(FragmentEditClubRulesBinding.class, this);
    public final m0.o.c c2 = new i();

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<EditClubRulesFragment, EditClubRulesViewModel> {
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
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new EditClubRulesFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(j.class), false, this.b);
        }
    }

    public EditClubRulesFragment() {
        super(R.layout.fragment_edit_club_rules);
        d a3 = m.a(EditClubRulesViewModel.class);
        this.a2 = new a(a3, false, new EditClubRulesFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[0]);
    }

    public void J() {
    }

    public final EditClubRulesArgs N0() {
        return (EditClubRulesArgs) this.c2.getValue(this, Z1[2]);
    }

    public final FragmentEditClubRulesBinding O0() {
        return (FragmentEditClubRulesBinding) this.b2.getValue(this, Z1[1]);
    }

    public final EditClubRulesViewModel P0() {
        return (EditClubRulesViewModel) this.a2.getValue();
    }

    public final void Q0(ClubRule clubRule, ClubRuleTitleDescriptionBinding clubRuleTitleDescriptionBinding) {
        m0.i iVar;
        if (clubRule == null) {
            iVar = null;
        } else {
            clubRuleTitleDescriptionBinding.c.setText(clubRule.c);
            clubRuleTitleDescriptionBinding.a.setText(clubRule.d);
            TextView textView = clubRuleTitleDescriptionBinding.b;
            m0.n.b.i.d(textView, "ruleBinding.remaining");
            R0(textView, clubRule.d);
            iVar = m0.i.a;
        }
        if (iVar == null) {
            TextView textView2 = clubRuleTitleDescriptionBinding.b;
            m0.n.b.i.d(textView2, "ruleBinding.remaining");
            R0(textView2, "");
        }
    }

    public final void R0(TextView textView, String str) {
        int integer = getResources().getInteger(R.integer.max_club_rule_description_length) - str.length();
        textView.setText(getResources().getQuantityString(R.plurals.characters_remaining, integer, new Object[]{Integer.valueOf(integer)}));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v48, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.clubhouse.android.data.models.local.club.ClubRule} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            m0.n.b.i.e(r7, r0)
            super.onViewCreated(r7, r8)
            com.clubhouse.android.ui.clubs.rules.EditClubRulesViewModel r7 = r6.P0()
            n0.a.g2.t<i0.e.b.a3.b.b> r7 = r7.l
            com.clubhouse.android.ui.clubs.rules.EditClubRulesFragment$onViewCreated$1 r8 = new com.clubhouse.android.ui.clubs.rules.EditClubRulesFragment$onViewCreated$1
            r0 = 0
            r8.<init>(r6, r0)
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
            r1.<init>(r7, r8)
            h0.q.p r7 = r6.getViewLifecycleOwner()
            java.lang.String r8 = "viewLifecycleOwner"
            m0.n.b.i.d(r7, r8)
            androidx.lifecycle.LifecycleCoroutineScope r7 = h0.q.q.a(r7)
            m0.r.t.a.r.m.a1.a.F2(r1, r7)
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r7 = r6.O0()
            android.widget.TextView r7 = r7.a
            i0.e.b.g3.l.b3.a r8 = new i0.e.b.g3.l.b3.a
            r8.<init>(r6)
            r7.setOnClickListener(r8)
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r7 = r6.O0()
            android.widget.TextView r7 = r7.f
            i0.e.b.g3.l.b3.b r8 = new i0.e.b.g3.l.b3.b
            r8.<init>(r6)
            r7.setOnClickListener(r8)
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r7 = r6.O0()
            android.widget.TextView r7 = r7.e
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.clubhouse.android.ui.clubs.rules.EditClubRulesArgs r2 = r6.N0()
            java.lang.String r2 = r2.c
            r3 = 0
            r1[r3] = r2
            r2 = 2131951930(0x7f13013a, float:1.9540288E38)
            java.lang.String r1 = r6.getString(r2, r1)
            r7.setText(r1)
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r7 = r6.O0()
            com.clubhouse.android.databinding.ClubRuleTitleDescriptionBinding r7 = r7.b
            android.widget.EditText r7 = r7.a
            java.lang.String r1 = "binding.clubRuleOne.description"
            m0.n.b.i.d(r7, r1)
            i0.e.b.d3.k.g(r7)
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r7 = r6.O0()
            com.clubhouse.android.databinding.ClubRuleTitleDescriptionBinding r7 = r7.d
            android.widget.EditText r7 = r7.a
            java.lang.String r2 = "binding.clubRuleTwo.description"
            m0.n.b.i.d(r7, r2)
            i0.e.b.d3.k.g(r7)
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r7 = r6.O0()
            com.clubhouse.android.databinding.ClubRuleTitleDescriptionBinding r7 = r7.c
            android.widget.EditText r7 = r7.a
            java.lang.String r4 = "binding.clubRuleThree.description"
            m0.n.b.i.d(r7, r4)
            i0.e.b.d3.k.g(r7)
            com.clubhouse.android.ui.clubs.rules.EditClubRulesArgs r7 = r6.N0()
            java.util.List<com.clubhouse.android.data.models.local.club.ClubRule> r7 = r7.d
            if (r7 != 0) goto L_0x009b
            r7 = r0
            goto L_0x00a1
        L_0x009b:
            java.lang.Object r7 = m0.j.g.z(r7, r3)
            com.clubhouse.android.data.models.local.club.ClubRule r7 = (com.clubhouse.android.data.models.local.club.ClubRule) r7
        L_0x00a1:
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r3 = r6.O0()
            com.clubhouse.android.databinding.ClubRuleTitleDescriptionBinding r3 = r3.b
            java.lang.String r5 = "binding.clubRuleOne"
            m0.n.b.i.d(r3, r5)
            r6.Q0(r7, r3)
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r7 = r6.O0()
            com.clubhouse.android.databinding.ClubRuleTitleDescriptionBinding r7 = r7.b
            android.widget.EditText r7 = r7.c
            java.lang.String r3 = "binding.clubRuleOne.title"
            m0.n.b.i.d(r7, r3)
            i0.e.b.g3.l.b3.c r3 = new i0.e.b.g3.l.b3.c
            r3.<init>(r6)
            r7.addTextChangedListener(r3)
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r7 = r6.O0()
            com.clubhouse.android.databinding.ClubRuleTitleDescriptionBinding r7 = r7.b
            android.widget.EditText r7 = r7.a
            m0.n.b.i.d(r7, r1)
            i0.e.b.g3.l.b3.d r1 = new i0.e.b.g3.l.b3.d
            r1.<init>(r6)
            r7.addTextChangedListener(r1)
            com.clubhouse.android.ui.clubs.rules.EditClubRulesArgs r7 = r6.N0()
            java.util.List<com.clubhouse.android.data.models.local.club.ClubRule> r7 = r7.d
            if (r7 != 0) goto L_0x00e1
            r7 = r0
            goto L_0x00e7
        L_0x00e1:
            java.lang.Object r7 = m0.j.g.z(r7, r8)
            com.clubhouse.android.data.models.local.club.ClubRule r7 = (com.clubhouse.android.data.models.local.club.ClubRule) r7
        L_0x00e7:
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r8 = r6.O0()
            com.clubhouse.android.databinding.ClubRuleTitleDescriptionBinding r8 = r8.d
            java.lang.String r1 = "binding.clubRuleTwo"
            m0.n.b.i.d(r8, r1)
            r6.Q0(r7, r8)
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r7 = r6.O0()
            com.clubhouse.android.databinding.ClubRuleTitleDescriptionBinding r7 = r7.d
            android.widget.EditText r7 = r7.c
            java.lang.String r8 = "binding.clubRuleTwo.title"
            m0.n.b.i.d(r7, r8)
            i0.e.b.g3.l.b3.g r8 = new i0.e.b.g3.l.b3.g
            r8.<init>(r6)
            r7.addTextChangedListener(r8)
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r7 = r6.O0()
            com.clubhouse.android.databinding.ClubRuleTitleDescriptionBinding r7 = r7.d
            android.widget.EditText r7 = r7.a
            m0.n.b.i.d(r7, r2)
            i0.e.b.g3.l.b3.h r8 = new i0.e.b.g3.l.b3.h
            r8.<init>(r6)
            r7.addTextChangedListener(r8)
            com.clubhouse.android.ui.clubs.rules.EditClubRulesArgs r7 = r6.N0()
            java.util.List<com.clubhouse.android.data.models.local.club.ClubRule> r7 = r7.d
            if (r7 != 0) goto L_0x0126
            goto L_0x012e
        L_0x0126:
            r8 = 2
            java.lang.Object r7 = m0.j.g.z(r7, r8)
            r0 = r7
            com.clubhouse.android.data.models.local.club.ClubRule r0 = (com.clubhouse.android.data.models.local.club.ClubRule) r0
        L_0x012e:
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r7 = r6.O0()
            com.clubhouse.android.databinding.ClubRuleTitleDescriptionBinding r7 = r7.c
            java.lang.String r8 = "binding.clubRuleThree"
            m0.n.b.i.d(r7, r8)
            r6.Q0(r0, r7)
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r7 = r6.O0()
            com.clubhouse.android.databinding.ClubRuleTitleDescriptionBinding r7 = r7.c
            android.widget.EditText r7 = r7.c
            java.lang.String r8 = "binding.clubRuleThree.title"
            m0.n.b.i.d(r7, r8)
            i0.e.b.g3.l.b3.e r8 = new i0.e.b.g3.l.b3.e
            r8.<init>(r6)
            r7.addTextChangedListener(r8)
            com.clubhouse.android.databinding.FragmentEditClubRulesBinding r7 = r6.O0()
            com.clubhouse.android.databinding.ClubRuleTitleDescriptionBinding r7 = r7.c
            android.widget.EditText r7 = r7.a
            m0.n.b.i.d(r7, r4)
            i0.e.b.g3.l.b3.f r8 = new i0.e.b.g3.l.b3.f
            r8.<init>(r6)
            r7.addTextChangedListener(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.clubs.rules.EditClubRulesFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
