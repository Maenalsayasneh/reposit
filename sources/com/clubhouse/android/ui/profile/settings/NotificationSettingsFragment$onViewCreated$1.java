package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.u.z5.h1;
import i0.e.b.g3.u.z5.j1;
import i0.e.b.g3.u.z5.l1;
import i0.e.b.g3.u.z5.p1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.settings.NotificationSettingsFragment$onViewCreated$1", f = "NotificationSettingsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: NotificationSettingsFragment.kt */
public final class NotificationSettingsFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ NotificationSettingsFragment d;

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
            int i = this.c;
            if (i == 0) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                String str = ((d) ((b) this.d)).a;
                if (str == null) {
                    str = ((NotificationSettingsFragment) this.q).getString(R.string.common_error_try_again);
                    m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(str);
                return i.a;
            } else if (i == 1) {
                j jVar2 = (j) obj;
                m0.n.b.i.e(jVar2, "$this$showNegativeBanner");
                String str2 = ((l1) ((b) this.d)).a;
                if (str2 == null) {
                    str2 = ((NotificationSettingsFragment) this.q).getString(R.string.common_error_try_again);
                    m0.n.b.i.d(str2, "getString(R.string.common_error_try_again)");
                }
                jVar2.c.b.setText(str2);
                return i.a;
            } else if (i == 2) {
                j jVar3 = (j) obj;
                m0.n.b.i.e(jVar3, "$this$showNegativeBanner");
                String str3 = ((h1) ((b) this.d)).a;
                if (str3 == null) {
                    str3 = ((NotificationSettingsFragment) this.q).getString(R.string.common_error_try_again);
                    m0.n.b.i.d(str3, "getString(R.string.common_error_try_again)");
                }
                jVar3.c.b.setText(str3);
                return i.a;
            } else if (i == 3) {
                j jVar4 = (j) obj;
                m0.n.b.i.e(jVar4, "$this$showNegativeBanner");
                String str4 = ((p1) ((b) this.d)).a;
                if (str4 == null) {
                    str4 = ((NotificationSettingsFragment) this.q).getString(R.string.common_error_try_again);
                    m0.n.b.i.d(str4, "getString(R.string.common_error_try_again)");
                }
                jVar4.c.b.setText(str4);
                return i.a;
            } else if (i == 4) {
                j jVar5 = (j) obj;
                m0.n.b.i.e(jVar5, "$this$showNegativeBanner");
                String str5 = ((j1) ((b) this.d)).a;
                if (str5 == null) {
                    str5 = ((NotificationSettingsFragment) this.q).getString(R.string.common_error_try_again);
                    m0.n.b.i.d(str5, "getString(R.string.common_error_try_again)");
                }
                jVar5.c.b.setText(str5);
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationSettingsFragment$onViewCreated$1(NotificationSettingsFragment notificationSettingsFragment, m0.l.c<? super NotificationSettingsFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = notificationSettingsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        NotificationSettingsFragment$onViewCreated$1 notificationSettingsFragment$onViewCreated$1 = new NotificationSettingsFragment$onViewCreated$1(this.d, cVar);
        notificationSettingsFragment$onViewCreated$1.c = obj;
        return notificationSettingsFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        NotificationSettingsFragment$onViewCreated$1 notificationSettingsFragment$onViewCreated$1 = new NotificationSettingsFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        notificationSettingsFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        notificationSettingsFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        b bVar = (b) this.c;
        if (bVar instanceof d) {
            NotificationSettingsFragment notificationSettingsFragment = this.d;
            v.f2(notificationSettingsFragment, new a(0, bVar, notificationSettingsFragment));
        } else if (bVar instanceof l1) {
            NotificationSettingsFragment notificationSettingsFragment2 = this.d;
            v.f2(notificationSettingsFragment2, new a(1, bVar, notificationSettingsFragment2));
            this.d.N0().e.setChecked(!this.d.N0().e.isChecked());
        } else if (bVar instanceof h1) {
            NotificationSettingsFragment notificationSettingsFragment3 = this.d;
            v.f2(notificationSettingsFragment3, new a(2, bVar, notificationSettingsFragment3));
            this.d.N0().c.setChecked(!this.d.N0().e.isChecked());
        } else if (bVar instanceof p1) {
            NotificationSettingsFragment notificationSettingsFragment4 = this.d;
            v.f2(notificationSettingsFragment4, new a(3, bVar, notificationSettingsFragment4));
            this.d.N0().f.setChecked(!this.d.N0().f.isChecked());
        } else if (bVar instanceof j1) {
            NotificationSettingsFragment notificationSettingsFragment5 = this.d;
            v.f2(notificationSettingsFragment5, new a(4, bVar, notificationSettingsFragment5));
            this.d.N0().d.setChecked(!this.d.N0().d.isChecked());
        }
        return i.a;
    }
}
