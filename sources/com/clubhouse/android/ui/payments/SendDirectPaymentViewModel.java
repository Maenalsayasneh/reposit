package com.clubhouse.android.ui.payments;

import android.content.Context;
import android.content.Intent;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.data.repos.PaymentsRepo;
import com.clubhouse.android.shared.FeatureFlags;
import com.clubhouse.android.shared.Flag;
import com.clubhouse.app.R;
import com.stripe.android.EphemeralKeyProvider;
import com.stripe.android.EphemeralKeyUpdateListener;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.Stripe;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.a3.b.d;
import i0.e.b.f3.e;
import i0.e.b.g3.s.b1;
import i0.e.b.g3.s.c1;
import i0.e.b.g3.s.g1;
import i0.e.b.g3.s.h0;
import i0.e.b.g3.s.i0;
import i0.e.b.g3.s.j0;
import i0.e.b.g3.s.k0;
import i0.e.b.g3.s.l0;
import i0.e.b.g3.s.m0;
import i0.e.b.g3.s.n0;
import i0.e.b.g3.s.o0;
import i0.e.b.g3.s.p0;
import i0.e.b.g3.s.y0;
import i0.j.f.p.h;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: SendDirectPaymentViewModel.kt */
public final class SendDirectPaymentViewModel extends i0.e.b.a3.b.a<b1> implements EphemeralKeyProvider {
    public static final /* synthetic */ int m = 0;
    public final Context n;
    public final i0.e.a.a o;
    public final i0.e.b.c3.i.a p;
    public final FeatureFlags q;
    public final PaymentsRepo r;
    public final Stripe s;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.payments.SendDirectPaymentViewModel$1", f = "SendDirectPaymentViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.payments.SendDirectPaymentViewModel$1  reason: invalid class name */
    /* compiled from: SendDirectPaymentViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ SendDirectPaymentViewModel d;

        /* renamed from: com.clubhouse.android.ui.payments.SendDirectPaymentViewModel$1$a */
        /* compiled from: kotlin-style lambda group */
        public static final class a extends Lambda implements l<b1, b1> {
            public static final a c = new a(0);
            public static final a d = new a(1);
            public final /* synthetic */ int q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(1);
                this.q = i;
            }

            public final Object invoke(Object obj) {
                int i = this.q;
                if (i == 0) {
                    b1 b1Var = (b1) obj;
                    i.e(b1Var, "$this$setState");
                    return b1.copy$default(b1Var, (UserProfile) null, (String) null, k0.d.a, (j0) null, (PaymentMethod) null, 27, (Object) null);
                } else if (i == 1) {
                    b1 b1Var2 = (b1) obj;
                    i.e(b1Var2, "$this$setState");
                    return b1.copy$default(b1Var2, (UserProfile) null, (String) null, k0.d.a, (j0) null, (PaymentMethod) null, 27, (Object) null);
                } else {
                    throw null;
                }
            }
        }

        {
            this.d = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, (m0.l.c) obj2);
            r02.c = (c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final c cVar = (c) this.c;
            if (cVar instanceof h0) {
                SendDirectPaymentViewModel sendDirectPaymentViewModel = this.d;
                j0 j0Var = ((h0) cVar).a;
                int i = SendDirectPaymentViewModel.m;
                Objects.requireNonNull(sendDirectPaymentViewModel);
                sendDirectPaymentViewModel.m(new SendDirectPaymentViewModel$chooseAmount$1(j0Var));
                sendDirectPaymentViewModel.n(new SendDirectPaymentViewModel$chooseAmount$2(sendDirectPaymentViewModel, j0Var));
            } else if (cVar instanceof g1) {
                SendDirectPaymentViewModel sendDirectPaymentViewModel2 = this.d;
                Objects.requireNonNull((g1) cVar);
                SendDirectPaymentViewModel.q(sendDirectPaymentViewModel2, (PaymentMethod) null, (j0) null);
            } else if (cVar instanceof y0) {
                SendDirectPaymentViewModel sendDirectPaymentViewModel3 = this.d;
                a aVar = a.c;
                int i2 = SendDirectPaymentViewModel.m;
                sendDirectPaymentViewModel3.m(aVar);
            } else if (cVar instanceof c1) {
                SendDirectPaymentViewModel sendDirectPaymentViewModel4 = this.d;
                AnonymousClass2 r1 = new l<b1, b1>() {
                    public Object invoke(Object obj) {
                        b1 b1Var = (b1) obj;
                        i.e(b1Var, "$this$setState");
                        return b1.copy$default(b1Var, (UserProfile) null, (String) null, (k0) null, (j0) null, ((c1) cVar).a, 15, (Object) null);
                    }
                };
                int i3 = SendDirectPaymentViewModel.m;
                sendDirectPaymentViewModel4.m(r1);
            } else if (cVar instanceof i0) {
                SendDirectPaymentViewModel sendDirectPaymentViewModel5 = this.d;
                int i4 = SendDirectPaymentViewModel.m;
                Objects.requireNonNull(sendDirectPaymentViewModel5);
                sendDirectPaymentViewModel5.n(new SendDirectPaymentViewModel$confirmPayment$1(sendDirectPaymentViewModel5));
            } else if (cVar instanceof p0) {
                SendDirectPaymentViewModel sendDirectPaymentViewModel6 = this.d;
                sendDirectPaymentViewModel6.o(new d(sendDirectPaymentViewModel6.n.getString(R.string.payments_error)));
                this.d.m(a.d);
            } else if (cVar instanceof n0) {
                SendDirectPaymentViewModel sendDirectPaymentViewModel7 = this.d;
                sendDirectPaymentViewModel7.o(new d(sendDirectPaymentViewModel7.n.getString(R.string.payments_error)));
                sendDirectPaymentViewModel7.n(new SendDirectPaymentViewModel$handleNextActionError$1(sendDirectPaymentViewModel7));
            } else if (cVar instanceof o0) {
                SendDirectPaymentViewModel sendDirectPaymentViewModel8 = this.d;
                l0 l0Var = l0.a;
                int i5 = SendDirectPaymentViewModel.m;
                sendDirectPaymentViewModel8.o(l0Var);
            } else if (cVar instanceof m0) {
                SendDirectPaymentViewModel sendDirectPaymentViewModel9 = this.d;
                m0 m0Var = (m0) cVar;
                int i6 = m0Var.a;
                Intent intent = m0Var.b;
                int i7 = SendDirectPaymentViewModel.m;
                Objects.requireNonNull(sendDirectPaymentViewModel9);
                if (intent != null) {
                    if (sendDirectPaymentViewModel9.s.isPaymentResult(i6, intent)) {
                        m0.r.t.a.r.m.a1.a.E2(sendDirectPaymentViewModel9.c, (m0.l.e) null, (CoroutineStart) null, new SendDirectPaymentViewModel$handleActivityResultIntent$1(sendDirectPaymentViewModel9, i6, intent, (m0.l.c<? super SendDirectPaymentViewModel$handleActivityResultIntent$1>) null), 3, (Object) null);
                    }
                    if (i6 == 6000) {
                        sendDirectPaymentViewModel9.n(new SendDirectPaymentViewModel$handleActivityResultIntent$2(PaymentMethodsActivityStarter.Result.Companion.fromIntent(intent), sendDirectPaymentViewModel9));
                    }
                }
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendDirectPaymentViewModel(b1 b1Var, Context context, i0.e.a.a aVar, i0.e.b.f3.i.a aVar2, e eVar) {
        super(b1Var);
        i0.e.a.a aVar3 = aVar;
        i0.e.b.f3.i.a aVar4 = aVar2;
        i.e(b1Var, "initialState");
        i.e(context, "appContext");
        i.e(aVar, "analytics");
        i.e(aVar2, "userComponentHandler");
        i.e(eVar, "environment");
        this.n = context;
        this.o = aVar3;
        Object L0 = h.L0(aVar2, i0.e.b.c3.i.a.class);
        i.d(L0, "get(userComponentHandler, UserComponentEntryPoint::class.java)");
        i0.e.b.c3.i.a aVar5 = (i0.e.b.c3.i.a) L0;
        this.p = aVar5;
        FeatureFlags e = ((i0.e.b.f3.h) h.L0(aVar2, i0.e.b.f3.h.class)).e();
        this.q = e;
        this.r = aVar5.i();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        ((AmplitudeAnalytics) aVar3).b("DirectPayments-SendPayment-Start", h.S2(new Pair("recipient", b1Var.a.getId())));
        if (e.a(Flag.AlwaysUseTestStripeKey)) {
            PaymentConfiguration.Companion companion = PaymentConfiguration.Companion;
            String string = context.getString(R.string.test_stripe_publish_key);
            i.d(string, "appContext.getString(R.string.test_stripe_publish_key)");
            PaymentConfiguration.Companion.init$default(companion, context, string, (String) null, 4, (Object) null);
        } else {
            PaymentConfiguration.Companion.init$default(PaymentConfiguration.Companion, context, "pk_live_51IQex8LxCmFGM3WpSe30zAuPN1AweNq0mIe54y4f6gsghB91ZKhutrHCaH3heRaG2DVcm2xxW0msTQSHh7ttJJnu00z1FyHaNB", (String) null, 4, (Object) null);
        }
        this.s = new Stripe(context, PaymentConfiguration.Companion.getInstance(context).getPublishableKey(), (String) null, false, (Set) null, 28, (f) null);
    }

    public static final void q(SendDirectPaymentViewModel sendDirectPaymentViewModel, PaymentMethod paymentMethod, j0 j0Var) {
        Objects.requireNonNull(sendDirectPaymentViewModel);
        if (paymentMethod != null) {
            sendDirectPaymentViewModel.n(new SendDirectPaymentViewModel$updatePaymentMethod$1(sendDirectPaymentViewModel));
            sendDirectPaymentViewModel.m(new SendDirectPaymentViewModel$updatePaymentMethod$2(paymentMethod));
            if (j0Var != null) {
                sendDirectPaymentViewModel.m(new SendDirectPaymentViewModel$chooseAmount$1(j0Var));
                sendDirectPaymentViewModel.n(new SendDirectPaymentViewModel$chooseAmount$2(sendDirectPaymentViewModel, j0Var));
            }
        }
    }

    public void createEphemeralKey(String str, EphemeralKeyUpdateListener ephemeralKeyUpdateListener) {
        i.e(str, "apiVersion");
        i.e(ephemeralKeyUpdateListener, "keyUpdateListener");
        m0.r.t.a.r.m.a1.a.E2(this.c, (m0.l.e) null, (CoroutineStart) null, new SendDirectPaymentViewModel$createEphemeralKey$1(this, str, ephemeralKeyUpdateListener, (m0.l.c<? super SendDirectPaymentViewModel$createEphemeralKey$1>) null), 3, (Object) null);
    }

    /* compiled from: SendDirectPaymentViewModel.kt */
    public static final class a implements v<SendDirectPaymentViewModel, b1> {
        public final /* synthetic */ i0.e.b.c3.h.c<SendDirectPaymentViewModel, b1> a = new i0.e.b.c3.h.c<>(SendDirectPaymentViewModel.class);

        public a() {
        }

        public SendDirectPaymentViewModel create(i0.b.b.j0 j0Var, b1 b1Var) {
            i.e(j0Var, "viewModelContext");
            i.e(b1Var, "state");
            return this.a.create(j0Var, b1Var);
        }

        public b1 initialState(i0.b.b.j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
