package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.u.z5.f1;
import i0.e.b.g3.u.z5.g1;
import i0.e.b.g3.u.z5.n1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.settings.SettingsFragment$onViewCreated$1", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: SettingsFragment.kt */
public final class SettingsFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ SettingsFragment d;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements l<j, i> {
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ Object q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj, Object obj2) {
            super(1);
            this.c = i;
            this.d = obj;
            this.q = obj2;
        }

        public final Object invoke(Object obj) {
            String str;
            int i = this.c;
            if (i == 0) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showBanner");
                String str2 = ((d) ((b) this.d)).a;
                if (str2 == null) {
                    str2 = ((SettingsFragment) this.q).getString(R.string.common_error_try_again);
                    m0.n.b.i.d(str2, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(str2);
                jVar.h(Banner.Style.Negative);
                return i.a;
            } else if (i == 1) {
                j jVar2 = (j) obj;
                m0.n.b.i.e(jVar2, "$this$showBanner");
                String str3 = ((n1) ((b) this.d)).a;
                if (str3 == null) {
                    str3 = ((SettingsFragment) this.q).getString(R.string.common_error_try_again);
                    m0.n.b.i.d(str3, "getString(R.string.common_error_try_again)");
                }
                jVar2.c.b.setText(str3);
                jVar2.h(Banner.Style.Negative);
                return i.a;
            } else if (i == 2) {
                j jVar3 = (j) obj;
                m0.n.b.i.e(jVar3, "$this$showBanner");
                String str4 = ((f1) ((b) this.d)).a;
                if (str4 == null) {
                    str4 = ((SettingsFragment) this.q).getString(R.string.common_error_try_again);
                    m0.n.b.i.d(str4, "getString(R.string.common_error_try_again)");
                }
                jVar3.c.b.setText(str4);
                jVar3.h(Banner.Style.Negative);
                return i.a;
            } else if (i == 3) {
                j jVar4 = (j) obj;
                m0.n.b.i.e(jVar4, "$this$showBanner");
                if (((g1) ((b) this.d)).a) {
                    str = ((SettingsFragment) this.q).getString(R.string.paused_notifications);
                } else {
                    str = ((SettingsFragment) this.q).getString(R.string.unpaused_notifications);
                }
                m0.n.b.i.d(str, "if (it.paused) getString(R.string.paused_notifications)\n                    else getString(R.string.unpaused_notifications)");
                jVar4.c.b.setText(str);
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsFragment$onViewCreated$1(SettingsFragment settingsFragment, m0.l.c<? super SettingsFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = settingsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        SettingsFragment$onViewCreated$1 settingsFragment$onViewCreated$1 = new SettingsFragment$onViewCreated$1(this.d, cVar);
        settingsFragment$onViewCreated$1.c = obj;
        return settingsFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        SettingsFragment$onViewCreated$1 settingsFragment$onViewCreated$1 = new SettingsFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        settingsFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        settingsFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        b bVar = (b) this.c;
        if (bVar instanceof d) {
            SettingsFragment settingsFragment = this.d;
            v.c2(settingsFragment, new a(0, bVar, settingsFragment));
        } else if (bVar instanceof n1) {
            SettingsFragment settingsFragment2 = this.d;
            v.c2(settingsFragment2, new a(1, bVar, settingsFragment2));
            this.d.N0().x.setChecked(!this.d.N0().x.isChecked());
        } else if (bVar instanceof f1) {
            SettingsFragment settingsFragment3 = this.d;
            v.c2(settingsFragment3, new a(2, bVar, settingsFragment3));
            this.d.N0().t.setChecked(!this.d.N0().t.isChecked());
        } else if (bVar instanceof g1) {
            SettingsFragment settingsFragment4 = this.d;
            v.c2(settingsFragment4, new a(3, bVar, settingsFragment4));
        }
        return i.a;
    }
}
