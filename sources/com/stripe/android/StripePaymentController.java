package com.stripe.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.stripe.android.PaymentController;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.exception.APIConnectionException;
import com.stripe.android.exception.APIException;
import com.stripe.android.exception.AuthenticationException;
import com.stripe.android.exception.InvalidRequestException;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import com.stripe.android.networking.AlipayRepository;
import com.stripe.android.networking.AnalyticsEvent;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowFailureMessageFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.Stripe3ds2CompletionStarter;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import com.stripe.android.stripe3ds2.views.ChallengeProgressActivity;
import com.stripe.android.view.AuthActivityStarter;
import h0.a.f.b;
import i0.j.f.p.h;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import m0.c;
import m0.j.g;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 Ç\u00012\u00020\u0001:\u0004È\u0001Ç\u0001BÝ\u0001\b\u0000\u0012\b\u0010Ä\u0001\u001a\u00030Ã\u0001\u0012\u0007\u0010\u0001\u001a\u00020\u0002\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\t\b\u0002\u0010©\u0001\u001a\u000201\u0012\t\b\u0002\u0010\u0001\u001a\u00020\u0012\n\b\u0002\u0010\u0001\u001a\u00030\u0001\u0012\n\b\u0002\u0010\u0001\u001a\u00030\u0001\u0012\n\b\u0002\u0010Á\u0001\u001a\u00030À\u0001\u0012\n\b\u0002\u0010§\u0001\u001a\u00030¦\u0001\u0012\n\b\u0002\u0010\u0001\u001a\u00030\u0001\u0012\n\b\u0002\u0010¶\u0001\u001a\u00030µ\u0001\u0012\u0013\b\u0002\u0010\u0001\u001a\f\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u0001\u0012\u0013\b\u0002\u0010¬\u0001\u001a\f\u0012\u0005\u0012\u00030«\u0001\u0018\u00010\u0001\u0012\u0013\b\u0002\u0010¡\u0001\u001a\f\u0012\u0005\u0012\u00030 \u0001\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0001\u001a\u00030\u0001\u0012\n\b\u0002\u0010¥\u0001\u001a\u00030\u0001¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J#\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\"\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J+\u0010&\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J+\u0010(\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b(\u0010'J+\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020$2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J!\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b2\u00103J!\u00104\u001a\u0002012\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b4\u00103J!\u00105\u001a\u0002012\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b5\u00103J\u001b\u00106\u001a\u00020\u00132\u0006\u00100\u001a\u00020/H@ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001b\u00109\u001a\u0002082\u0006\u00100\u001a\u00020/H@ø\u0001\u0000¢\u0006\u0004\b9\u00107J\u001b\u0010:\u001a\u00020$2\u0006\u00100\u001a\u00020/H@ø\u0001\u0000¢\u0006\u0004\b:\u00107J+\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b<\u0010=J+\u0010@\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-2\u0006\u0010?\u001a\u00020>H@ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ5\u0010D\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ3\u0010H\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020FH@ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ=\u0010K\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020J2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ3\u0010N\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020MH@ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ3\u0010Q\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020PH@ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ3\u0010T\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020SH@ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ-\u0010Y\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\b\u0010V\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\bW\u0010XJ-\u0010Y\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\b\u0010V\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ3\u0010]\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010\\\u001a\u00020[2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b]\u0010^J[\u0010i\u001a\u00020\u00042\u0006\u0010`\u001a\u00020_2\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u00020\u00022\u0006\u0010d\u001a\u00020-2\u0006\u0010f\u001a\u00020e2\u0006\u0010.\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\bg\u0010hJ3\u0010m\u001a\u00020\u00042\u0006\u0010j\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\bk\u0010lJ#\u0010n\u001a\u00020\u00042\u0006\u0010f\u001a\u00020e2\u0006\u0010C\u001a\u00020BH@ø\u0001\u0000¢\u0006\u0004\bn\u0010oJS\u0010u\u001a\u00020\u00042\u0006\u0010q\u001a\u00020p2\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u00020\u00022\u0006\u0010r\u001a\u00020-2\u0006\u0010f\u001a\u00020e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\bs\u0010tJ+\u0010v\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>2\u0006\u0010.\u001a\u00020-2\u0006\u0010f\u001a\u00020eH@ø\u0001\u0000¢\u0006\u0004\bv\u0010wJe\u0010}\u001a\u00020\u00042\u0006\u0010x\u001a\u00020)2\u0006\u0010C\u001a\u00020B2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010y\u001a\u00020\u00022\b\u0010z\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010{\u001a\u0002012\b\b\u0002\u0010|\u001a\u000201H@ø\u0001\u0000¢\u0006\u0004\b}\u0010~R\u0019\u0010\u0001\u001a\u000208\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020e0\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R#\u0010\u0001\u001a\f\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R#\u0010¡\u0001\u001a\f\u0012\u0005\u0012\u00030 \u0001\u0018\u00010\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u0001R\u001a\u0010£\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001a\u0010¥\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010\u0001R\u001a\u0010§\u0001\u001a\u00030¦\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0019\u0010©\u0001\u001a\u0002018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R#\u0010¬\u0001\u001a\f\u0012\u0005\u0012\u00030«\u0001\u0018\u00010\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u0001R\"\u0010±\u0001\u001a\u0002018B@\u0002X\u0002¢\u0006\u0010\n\u0006\b­\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u001a\u0010³\u0001\u001a\u00030²\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001a\u0010¶\u0001\u001a\u00030µ\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001a\u0010¹\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R&\u0010»\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)0\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b»\u0001\u0010\u0001R-\u0010¾\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020-\u0012\u0005\u0012\u00030½\u00010¼\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001a\u0010Á\u0001\u001a\u00030À\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006É\u0001"}, d2 = {"Lcom/stripe/android/StripePaymentController;", "Lcom/stripe/android/PaymentController;", "", "returnUrl", "Lm0/i;", "logReturnUrl", "(Ljava/lang/String;)V", "Lcom/stripe/android/view/AuthActivityStarter$Host;", "host", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "confirmStripeIntentParams", "Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions", "startConfirmAndAuth", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmPaymentIntentParams", "Lcom/stripe/android/AlipayAuthenticator;", "authenticator", "Lcom/stripe/android/PaymentIntentResult;", "confirmAndAuthenticateAlipay", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/WeChatPayNextAction;", "confirmWeChatPay", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/PaymentIntent;", "confirmPaymentIntent", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "Lcom/stripe/android/model/SetupIntent;", "confirmSetupIntent", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "clientSecret", "Lcom/stripe/android/PaymentController$StripeIntentType;", "type", "startAuth", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/PaymentController$StripeIntentType;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/Source;", "source", "startAuthenticateSource", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/Source;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "onSourceRetrieved", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "paymentBrowserAuthStarter", "startSourceAuth", "(Lcom/stripe/android/PaymentBrowserAuthStarter;Lcom/stripe/android/model/Source;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "", "requestCode", "Landroid/content/Intent;", "data", "", "shouldHandlePaymentResult", "(ILandroid/content/Intent;)Z", "shouldHandleSetupResult", "shouldHandleSourceResult", "getPaymentIntentResult", "(Landroid/content/Intent;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/SetupIntentResult;", "getSetupIntentResult", "getAuthenticateSourceResult", "paymentIntent", "authenticateAlipay", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "", "throwable", "handleError", "(Lcom/stripe/android/view/AuthActivityStarter$Host;ILjava/lang/Throwable;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "handleNextAction", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "nextActionData", "handle3ds2Auth", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;", "handle3ds1Auth", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "handleRedirectToUrlAuth", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "handleAlipayAuth", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "handleOxxoAuth", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;Lm0/l/c;)Ljava/lang/Object;", "stripeAccountId", "bypassAuth$payments_core_release", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "bypassAuth", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/Source;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "stripe3ds2Fingerprint", "begin3ds2Auth", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/Stripe3ds2Fingerprint;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "result", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "transaction", "sourceId", "timeout", "Lcom/stripe/android/PaymentRelayStarter;", "paymentRelayStarter", "on3ds2AuthSuccess$payments_core_release", "(Lcom/stripe/android/model/Stripe3ds2AuthResult;Lcom/stripe/android/stripe3ds2/transaction/Transaction;Ljava/lang/String;ILcom/stripe/android/PaymentRelayStarter;ILcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "on3ds2AuthSuccess", "fallbackRedirectUrl", "on3ds2AuthFallback$payments_core_release", "(Ljava/lang/String;Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "on3ds2AuthFallback", "startFrictionlessFlow", "(Lcom/stripe/android/PaymentRelayStarter;Lcom/stripe/android/model/StripeIntent;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "ares", "maxTimeout", "startChallengeFlow$payments_core_release", "(Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Lcom/stripe/android/stripe3ds2/transaction/Transaction;Ljava/lang/String;ILcom/stripe/android/PaymentRelayStarter;Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "startChallengeFlow", "on3ds2AuthFailure", "(Ljava/lang/Throwable;ILcom/stripe/android/PaymentRelayStarter;Lm0/l/c;)Ljava/lang/Object;", "paymentBrowserWebStarter", "authUrl", "stripeAccount", "shouldCancelSource", "shouldCancelIntentOnUserNavigation", "beginWebAuth", "(Lcom/stripe/android/PaymentBrowserAuthStarter;Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", "threeDs2Service", "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "publishableKey", "Ljava/lang/String;", "Lcom/stripe/android/PaymentAuthConfig;", "config", "Lcom/stripe/android/PaymentAuthConfig;", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "failureMessageFactory", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "Lkotlin/Function1;", "paymentRelayStarterFactory", "Lm0/n/a/l;", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "paymentIntentFlowResultProcessor", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "Lh0/a/f/b;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "paymentRelayLauncher", "Lh0/a/f/b;", "Lcom/stripe/android/StripePaymentController$ChallengeProgressActivityStarter;", "challengeProgressActivityStarter", "Lcom/stripe/android/StripePaymentController$ChallengeProgressActivityStarter;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "stripe3ds2ChallengeLauncher", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "setupIntentFlowResultProcessor", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "uiContext", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "analyticsRequestFactory", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "enableLogging", "Z", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "paymentBrowserAuthLauncher", "hasCompatibleBrowser$delegate", "Lm0/c;", "getHasCompatibleBrowser", "()Z", "hasCompatibleBrowser", "Lcom/stripe/android/Logger;", "logger", "Lcom/stripe/android/Logger;", "Lcom/stripe/android/networking/AlipayRepository;", "alipayRepository", "Lcom/stripe/android/networking/AlipayRepository;", "Lcom/stripe/android/payments/DefaultReturnUrl;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "paymentBrowserAuthStarterFactory", "Lkotlin/Function2;", "Lcom/stripe/android/payments/Stripe3ds2CompletionStarter;", "stripe3ds2CompletionStarterFactory", "Lm0/n/a/p;", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;ZLcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/PaymentAuthConfig;Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;Lcom/stripe/android/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/AnalyticsRequestFactory;Lcom/stripe/android/StripePaymentController$ChallengeProgressActivityStarter;Lcom/stripe/android/networking/AlipayRepository;Lh0/a/f/b;Lh0/a/f/b;Lh0/a/f/b;Lm0/l/e;Lm0/l/e;)V", "Companion", "ChallengeProgressActivityStarter", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController implements PaymentController {
    /* access modifiers changed from: private */
    public static final long CHALLENGE_DELAY = TimeUnit.SECONDS.toMillis(2);
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    public static final List<String> EXPAND_PAYMENT_METHOD = h.L2("payment_method");
    public static final int PAYMENT_REQUEST_CODE = 50000;
    private static final String REQUIRED_ERROR = "API request returned an invalid response.";
    public static final int SETUP_REQUEST_CODE = 50001;
    public static final int SOURCE_REQUEST_CODE = 50002;
    private final AlipayRepository alipayRepository;
    /* access modifiers changed from: private */
    public final AnalyticsRequestExecutor analyticsRequestExecutor;
    /* access modifiers changed from: private */
    public final AnalyticsRequestFactory analyticsRequestFactory;
    private final ChallengeProgressActivityStarter challengeProgressActivityStarter;
    /* access modifiers changed from: private */
    public final PaymentAuthConfig config;
    /* access modifiers changed from: private */
    public final DefaultReturnUrl defaultReturnUrl;
    /* access modifiers changed from: private */
    public final boolean enableLogging;
    private final PaymentFlowFailureMessageFactory failureMessageFactory;
    private final c hasCompatibleBrowser$delegate;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final MessageVersionRegistry messageVersionRegistry;
    /* access modifiers changed from: private */
    public final b<PaymentBrowserAuthContract.Args> paymentBrowserAuthLauncher;
    private final l<AuthActivityStarter.Host, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory;
    private final PaymentIntentFlowResultProcessor paymentIntentFlowResultProcessor;
    /* access modifiers changed from: private */
    public final b<PaymentRelayStarter.Args> paymentRelayLauncher;
    /* access modifiers changed from: private */
    public final l<AuthActivityStarter.Host, PaymentRelayStarter> paymentRelayStarterFactory;
    private final String publishableKey;
    private final SetupIntentFlowResultProcessor setupIntentFlowResultProcessor;
    /* access modifiers changed from: private */
    public final b<PaymentFlowResult.Unvalidated> stripe3ds2ChallengeLauncher;
    /* access modifiers changed from: private */
    public final p<AuthActivityStarter.Host, Integer, Stripe3ds2CompletionStarter> stripe3ds2CompletionStarterFactory;
    /* access modifiers changed from: private */
    public final StripeRepository stripeRepository;
    private final StripeThreeDs2Service threeDs2Service;
    private final e uiContext;
    /* access modifiers changed from: private */
    public final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u000fJ7\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/StripePaymentController$ChallengeProgressActivityStarter;", "", "Landroid/content/Context;", "context", "", "directoryServerName", "", "cancelable", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lm0/i;", "start", "(Landroid/content/Context;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V", "Default", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripePaymentController.kt */
    public interface ChallengeProgressActivityStarter {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/StripePaymentController$ChallengeProgressActivityStarter$Default;", "Lcom/stripe/android/StripePaymentController$ChallengeProgressActivityStarter;", "Landroid/content/Context;", "context", "", "directoryServerName", "", "cancelable", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lm0/i;", "start", "(Landroid/content/Context;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripePaymentController.kt */
        public static final class Default implements ChallengeProgressActivityStarter {
            public void start(Context context, String str, boolean z, StripeUiCustomization stripeUiCustomization, SdkTransactionId sdkTransactionId) {
                i.e(context, "context");
                i.e(str, "directoryServerName");
                i.e(stripeUiCustomization, "uiCustomization");
                i.e(sdkTransactionId, "sdkTransactionId");
                ChallengeProgressActivity.Companion.show(context, str, z, stripeUiCustomization, sdkTransactionId);
            }
        }

        void start(Context context, String str, boolean z, StripeUiCustomization stripeUiCustomization, SdkTransactionId sdkTransactionId);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0005\u0010\nJ1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00168\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00048\u0000@\u0000XT¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0000@\u0000XT¢\u0006\u0006\n\u0004\b$\u0010!R\u0016\u0010%\u001a\u00020\u00048\u0000@\u0000XT¢\u0006\u0006\n\u0004\b%\u0010!¨\u0006("}, d2 = {"Lcom/stripe/android/StripePaymentController$Companion;", "", "Lcom/stripe/android/model/StripeIntent;", "intent", "", "getRequestCode$payments_core_release", "(Lcom/stripe/android/model/StripeIntent;)I", "getRequestCode", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "params", "(Lcom/stripe/android/model/ConfirmStripeIntentParams;)I", "Landroid/content/Context;", "context", "", "publishableKey", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "", "enableLogging", "Lcom/stripe/android/PaymentController;", "create", "(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;Z)Lcom/stripe/android/PaymentController;", "", "EXPAND_PAYMENT_METHOD", "Ljava/util/List;", "getEXPAND_PAYMENT_METHOD$payments_core_release", "()Ljava/util/List;", "", "CHALLENGE_DELAY", "J", "getCHALLENGE_DELAY$payments_core_release", "()J", "PAYMENT_REQUEST_CODE", "I", "REQUIRED_ERROR", "Ljava/lang/String;", "SETUP_REQUEST_CODE", "SOURCE_REQUEST_CODE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripePaymentController.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ PaymentController create$default(Companion companion, Context context, String str, StripeRepository stripeRepository, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            return companion.create(context, str, stripeRepository, z);
        }

        public final PaymentController create(Context context, String str, StripeRepository stripeRepository) {
            return create$default(this, context, str, stripeRepository, false, 8, (Object) null);
        }

        public final PaymentController create(Context context, String str, StripeRepository stripeRepository, boolean z) {
            i.e(context, "context");
            i.e(str, "publishableKey");
            i.e(stripeRepository, "stripeRepository");
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext;
            i.d(applicationContext, "context.applicationContext");
            return new StripePaymentController(context2, str, stripeRepository, z, (MessageVersionRegistry) null, (PaymentAuthConfig) null, (StripeThreeDs2Service) null, (AnalyticsRequestExecutor) null, (AnalyticsRequestFactory) null, (ChallengeProgressActivityStarter) null, (AlipayRepository) null, (b) null, (b) null, (b) null, (e) null, (e) null, 65520, (f) null);
        }

        public final long getCHALLENGE_DELAY$payments_core_release() {
            return StripePaymentController.CHALLENGE_DELAY;
        }

        public final List<String> getEXPAND_PAYMENT_METHOD$payments_core_release() {
            return StripePaymentController.EXPAND_PAYMENT_METHOD;
        }

        public final /* synthetic */ int getRequestCode$payments_core_release(StripeIntent stripeIntent) {
            i.e(stripeIntent, "intent");
            return stripeIntent instanceof PaymentIntent ? StripePaymentController.PAYMENT_REQUEST_CODE : StripePaymentController.SETUP_REQUEST_CODE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final /* synthetic */ int getRequestCode$payments_core_release(ConfirmStripeIntentParams confirmStripeIntentParams) {
            i.e(confirmStripeIntentParams, "params");
            return confirmStripeIntentParams instanceof ConfirmPaymentIntentParams ? StripePaymentController.PAYMENT_REQUEST_CODE : StripePaymentController.SETUP_REQUEST_CODE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            PaymentController.StripeIntentType.values();
            int[] iArr = new int[2];
            $EnumSwitchMapping$0 = iArr;
            PaymentController.StripeIntentType stripeIntentType = PaymentController.StripeIntentType.PaymentIntent;
            iArr[stripeIntentType.ordinal()] = 1;
            PaymentController.StripeIntentType stripeIntentType2 = PaymentController.StripeIntentType.SetupIntent;
            iArr[stripeIntentType2.ordinal()] = 2;
            PaymentController.StripeIntentType.values();
            int[] iArr2 = new int[2];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[stripeIntentType.ordinal()] = 1;
            iArr2[stripeIntentType2.ordinal()] = 2;
        }
    }

    public StripePaymentController(Context context, String str, StripeRepository stripeRepository2, boolean z, MessageVersionRegistry messageVersionRegistry2, PaymentAuthConfig paymentAuthConfig, StripeThreeDs2Service stripeThreeDs2Service, AnalyticsRequestExecutor analyticsRequestExecutor2, AnalyticsRequestFactory analyticsRequestFactory2, ChallengeProgressActivityStarter challengeProgressActivityStarter2, AlipayRepository alipayRepository2, b<PaymentRelayStarter.Args> bVar, b<PaymentBrowserAuthContract.Args> bVar2, b<PaymentFlowResult.Unvalidated> bVar3, e eVar, e eVar2) {
        Context context2 = context;
        String str2 = str;
        StripeRepository stripeRepository3 = stripeRepository2;
        boolean z2 = z;
        MessageVersionRegistry messageVersionRegistry3 = messageVersionRegistry2;
        PaymentAuthConfig paymentAuthConfig2 = paymentAuthConfig;
        StripeThreeDs2Service stripeThreeDs2Service2 = stripeThreeDs2Service;
        AnalyticsRequestExecutor analyticsRequestExecutor3 = analyticsRequestExecutor2;
        AnalyticsRequestFactory analyticsRequestFactory3 = analyticsRequestFactory2;
        ChallengeProgressActivityStarter challengeProgressActivityStarter3 = challengeProgressActivityStarter2;
        AlipayRepository alipayRepository3 = alipayRepository2;
        e eVar3 = eVar;
        e eVar4 = eVar2;
        i.e(context2, "context");
        i.e(str2, "publishableKey");
        i.e(stripeRepository3, "stripeRepository");
        i.e(messageVersionRegistry3, "messageVersionRegistry");
        i.e(paymentAuthConfig2, "config");
        i.e(stripeThreeDs2Service2, "threeDs2Service");
        i.e(analyticsRequestExecutor3, "analyticsRequestExecutor");
        i.e(analyticsRequestFactory3, "analyticsRequestFactory");
        i.e(challengeProgressActivityStarter3, "challengeProgressActivityStarter");
        i.e(alipayRepository3, "alipayRepository");
        i.e(eVar3, "workContext");
        i.e(eVar4, "uiContext");
        this.publishableKey = str2;
        this.stripeRepository = stripeRepository3;
        this.enableLogging = z2;
        this.messageVersionRegistry = messageVersionRegistry3;
        this.config = paymentAuthConfig2;
        this.threeDs2Service = stripeThreeDs2Service2;
        this.analyticsRequestExecutor = analyticsRequestExecutor3;
        this.analyticsRequestFactory = analyticsRequestFactory3;
        this.challengeProgressActivityStarter = challengeProgressActivityStarter3;
        this.alipayRepository = alipayRepository3;
        this.paymentRelayLauncher = bVar;
        this.paymentBrowserAuthLauncher = bVar2;
        this.stripe3ds2ChallengeLauncher = bVar3;
        this.workContext = eVar3;
        this.uiContext = eVar4;
        this.failureMessageFactory = new PaymentFlowFailureMessageFactory(context2);
        Context context3 = context;
        String str3 = str;
        StripeRepository stripeRepository4 = stripeRepository2;
        boolean z3 = z;
        e eVar5 = eVar;
        this.paymentIntentFlowResultProcessor = new PaymentIntentFlowResultProcessor(context3, str3, stripeRepository4, z3, eVar5);
        this.setupIntentFlowResultProcessor = new SetupIntentFlowResultProcessor(context3, str3, stripeRepository4, z3, eVar5);
        this.logger = Logger.Companion.getInstance$payments_core_release(z2);
        this.defaultReturnUrl = DefaultReturnUrl.Companion.create(context2);
        this.paymentRelayStarterFactory = new StripePaymentController$paymentRelayStarterFactory$1(this);
        this.hasCompatibleBrowser$delegate = h.H2(new StripePaymentController$hasCompatibleBrowser$2(context2));
        this.paymentBrowserAuthStarterFactory = new StripePaymentController$paymentBrowserAuthStarterFactory$1(this);
        this.stripe3ds2CompletionStarterFactory = new StripePaymentController$stripe3ds2CompletionStarterFactory$1(this);
        stripeThreeDs2Service2.initialize(paymentAuthConfig.getStripe3ds2Config$payments_core_release().getUiCustomization$payments_core_release().getUiCustomization());
    }

    public static /* synthetic */ Object beginWebAuth$default(StripePaymentController stripePaymentController, PaymentBrowserAuthStarter paymentBrowserAuthStarter, StripeIntent stripeIntent, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, m0.l.c cVar, int i2, Object obj) {
        int i3 = i2;
        return stripePaymentController.beginWebAuth(paymentBrowserAuthStarter, stripeIntent, i, str, str2, str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? true : z2, cVar);
    }

    public static final PaymentController create(Context context, String str, StripeRepository stripeRepository2) {
        return Companion.create$default(Companion, context, str, stripeRepository2, false, 8, (Object) null);
    }

    public static final PaymentController create(Context context, String str, StripeRepository stripeRepository2, boolean z) {
        return Companion.create(context, str, stripeRepository2, z);
    }

    /* access modifiers changed from: private */
    public final boolean getHasCompatibleBrowser() {
        return ((Boolean) this.hasCompatibleBrowser$delegate.getValue()).booleanValue();
    }

    private final void logReturnUrl(String str) {
        AnalyticsEvent analyticsEvent;
        if (i.a(str, this.defaultReturnUrl.getValue())) {
            analyticsEvent = AnalyticsEvent.ConfirmReturnUrlDefault;
        } else if (str == null) {
            analyticsEvent = AnalyticsEvent.ConfirmReturnUrlNull;
        } else {
            analyticsEvent = AnalyticsEvent.ConfirmReturnUrlCustom;
        }
        this.analyticsRequestExecutor.executeAsync(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, analyticsEvent, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.stripe.android.networking.ApiRequest$Options} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object authenticateAlipay(com.stripe.android.model.PaymentIntent r8, com.stripe.android.AlipayAuthenticator r9, com.stripe.android.networking.ApiRequest.Options r10, m0.l.c<? super com.stripe.android.PaymentIntentResult> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.stripe.android.StripePaymentController$authenticateAlipay$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.stripe.android.StripePaymentController$authenticateAlipay$1 r0 = (com.stripe.android.StripePaymentController$authenticateAlipay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripePaymentController$authenticateAlipay$1 r0 = new com.stripe.android.StripePaymentController$authenticateAlipay$1
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$0
            com.stripe.android.StripePaymentController r9 = (com.stripe.android.StripePaymentController) r9
            i0.j.f.p.h.d4(r11)
            goto L_0x0086
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            java.lang.Object r8 = r0.L$2
            r10 = r8
            com.stripe.android.networking.ApiRequest$Options r10 = (com.stripe.android.networking.ApiRequest.Options) r10
            java.lang.Object r8 = r0.L$1
            com.stripe.android.model.PaymentIntent r8 = (com.stripe.android.model.PaymentIntent) r8
            java.lang.Object r9 = r0.L$0
            com.stripe.android.StripePaymentController r9 = (com.stripe.android.StripePaymentController) r9
            i0.j.f.p.h.d4(r11)
            goto L_0x005e
        L_0x0049:
            i0.j.f.p.h.d4(r11)
            com.stripe.android.networking.AlipayRepository r11 = r7.alipayRepository
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r11 = r11.authenticate(r8, r9, r10, r0)
            if (r11 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r9 = r7
        L_0x005e:
            com.stripe.android.model.AlipayAuthResult r11 = (com.stripe.android.model.AlipayAuthResult) r11
            int r11 = r11.getOutcome()
            com.stripe.android.networking.StripeRepository r2 = r9.stripeRepository
            java.lang.String r8 = r8.getClientSecret()
            if (r8 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            java.lang.String r8 = ""
        L_0x006f:
            java.util.List<java.lang.String> r4 = EXPAND_PAYMENT_METHOD
            r0.L$0 = r9
            r5 = 0
            r0.L$1 = r5
            r0.L$2 = r5
            r0.I$0 = r11
            r0.label = r3
            java.lang.Object r8 = r2.retrievePaymentIntent(r8, r10, r4, r0)
            if (r8 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r6 = r11
            r11 = r8
            r8 = r6
        L_0x0086:
            if (r11 == 0) goto L_0x0096
            com.stripe.android.model.PaymentIntent r11 = (com.stripe.android.model.PaymentIntent) r11
            com.stripe.android.PaymentIntentResult r10 = new com.stripe.android.PaymentIntentResult
            com.stripe.android.payments.PaymentFlowFailureMessageFactory r9 = r9.failureMessageFactory
            java.lang.String r9 = r9.create(r11, r8)
            r10.<init>(r11, r8, r9)
            return r10
        L_0x0096:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Required value was null."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.authenticateAlipay(com.stripe.android.model.PaymentIntent, com.stripe.android.AlipayAuthenticator, com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    public final Object begin3ds2Auth(AuthActivityStarter.Host host, StripeIntent stripeIntent, Stripe3ds2Fingerprint stripe3ds2Fingerprint, ApiRequest.Options options, m0.l.c<? super m0.i> cVar) {
        Activity activity$payments_core_release = host.getActivity$payments_core_release();
        if (activity$payments_core_release != null) {
            Transaction createTransaction = this.threeDs2Service.createTransaction(stripe3ds2Fingerprint.getDirectoryServerEncryption().getDirectoryServerId(), this.messageVersionRegistry.getCurrent(), stripeIntent.isLiveMode(), stripe3ds2Fingerprint.getDirectoryServerName(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getRootCerts(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getDirectoryServerPublicKey(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getKeyId());
            this.challengeProgressActivityStarter.start(activity$payments_core_release, stripe3ds2Fingerprint.getDirectoryServerName(), false, this.config.getStripe3ds2Config$payments_core_release().getUiCustomization$payments_core_release().getUiCustomization(), createTransaction.getSdkTransactionId());
            f1 E2 = a.E2(a.h(this.workContext), (e) null, (CoroutineStart) null, new StripePaymentController$begin3ds2Auth$2(this, createTransaction, stripe3ds2Fingerprint, options, host, stripeIntent, (m0.l.c) null), 3, (Object) null);
            if (E2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return E2;
            }
            return m0.i.a;
        } else if (activity$payments_core_release == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return activity$payments_core_release;
        } else {
            return m0.i.a;
        }
    }

    public final Object beginWebAuth(PaymentBrowserAuthStarter paymentBrowserAuthStarter, StripeIntent stripeIntent, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, m0.l.c<? super m0.i> cVar) {
        Object k4 = a.k4(this.uiContext, new StripePaymentController$beginWebAuth$2(this, paymentBrowserAuthStarter, stripeIntent, i, str, str2, str4, str3, z, z2, (m0.l.c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }

    public final Object bypassAuth(AuthActivityStarter.Host host, Source source, String str, m0.l.c<? super m0.i> cVar) {
        Object k4 = a.k4(this.uiContext, new StripePaymentController$bypassAuth$4(this, host, source, str, (m0.l.c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }

    public final Object bypassAuth$payments_core_release(AuthActivityStarter.Host host, StripeIntent stripeIntent, String str, m0.l.c<? super m0.i> cVar) {
        Object k4 = a.k4(this.uiContext, new StripePaymentController$bypassAuth$2(this, host, stripeIntent, str, (m0.l.c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: com.stripe.android.networking.ApiRequest$Options} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068 A[PHI: r9 
      PHI: (r9v2 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:19:0x0065, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object confirmAndAuthenticateAlipay(com.stripe.android.model.ConfirmPaymentIntentParams r6, com.stripe.android.AlipayAuthenticator r7, com.stripe.android.networking.ApiRequest.Options r8, m0.l.c<? super com.stripe.android.PaymentIntentResult> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.StripePaymentController$confirmAndAuthenticateAlipay$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.stripe.android.StripePaymentController$confirmAndAuthenticateAlipay$1 r0 = (com.stripe.android.StripePaymentController$confirmAndAuthenticateAlipay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripePaymentController$confirmAndAuthenticateAlipay$1 r0 = new com.stripe.android.StripePaymentController$confirmAndAuthenticateAlipay$1
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            i0.j.f.p.h.d4(r9)
            goto L_0x0068
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.Object r6 = r0.L$2
            com.stripe.android.StripePaymentController r6 = (com.stripe.android.StripePaymentController) r6
            java.lang.Object r7 = r0.L$1
            r8 = r7
            com.stripe.android.networking.ApiRequest$Options r8 = (com.stripe.android.networking.ApiRequest.Options) r8
            java.lang.Object r7 = r0.L$0
            com.stripe.android.AlipayAuthenticator r7 = (com.stripe.android.AlipayAuthenticator) r7
            i0.j.f.p.h.d4(r9)
            goto L_0x0056
        L_0x0043:
            i0.j.f.p.h.d4(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r5
            r0.label = r4
            java.lang.Object r9 = r5.confirmPaymentIntent(r6, r8, r0)
            if (r9 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r6 = r5
        L_0x0056:
            com.stripe.android.model.PaymentIntent r9 = (com.stripe.android.model.PaymentIntent) r9
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r9 = r6.authenticateAlipay(r9, r7, r8, r0)
            if (r9 != r1) goto L_0x0068
            return r1
        L_0x0068:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.confirmAndAuthenticateAlipay(com.stripe.android.model.ConfirmPaymentIntentParams, com.stripe.android.AlipayAuthenticator, com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object confirmPaymentIntent(com.stripe.android.model.ConfirmPaymentIntentParams r5, com.stripe.android.networking.ApiRequest.Options r6, m0.l.c<? super com.stripe.android.model.PaymentIntent> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.StripePaymentController$confirmPaymentIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.stripe.android.StripePaymentController$confirmPaymentIntent$1 r0 = (com.stripe.android.StripePaymentController$confirmPaymentIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripePaymentController$confirmPaymentIntent$1 r0 = new com.stripe.android.StripePaymentController$confirmPaymentIntent$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r7)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r7)
            com.stripe.android.networking.StripeRepository r7 = r4.stripeRepository
            com.stripe.android.model.ConfirmPaymentIntentParams r5 = r5.withShouldUseStripeSdk((boolean) r3)
            java.util.List<java.lang.String> r2 = EXPAND_PAYMENT_METHOD
            r0.label = r3
            java.lang.Object r7 = r7.confirmPaymentIntent(r5, r6, r2, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            if (r7 == 0) goto L_0x0046
            return r7
        L_0x0046:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "API request returned an invalid response."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.confirmPaymentIntent(com.stripe.android.model.ConfirmPaymentIntentParams, com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object confirmSetupIntent(com.stripe.android.model.ConfirmSetupIntentParams r5, com.stripe.android.networking.ApiRequest.Options r6, m0.l.c<? super com.stripe.android.model.SetupIntent> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.StripePaymentController$confirmSetupIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.stripe.android.StripePaymentController$confirmSetupIntent$1 r0 = (com.stripe.android.StripePaymentController$confirmSetupIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripePaymentController$confirmSetupIntent$1 r0 = new com.stripe.android.StripePaymentController$confirmSetupIntent$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r7)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r7)
            com.stripe.android.networking.StripeRepository r7 = r4.stripeRepository
            com.stripe.android.model.ConfirmSetupIntentParams r5 = r5.withShouldUseStripeSdk((boolean) r3)
            java.util.List<java.lang.String> r2 = EXPAND_PAYMENT_METHOD
            r0.label = r3
            java.lang.Object r7 = r7.confirmSetupIntent(r5, r6, r2, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            if (r7 == 0) goto L_0x0046
            return r7
        L_0x0046:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "API request returned an invalid response."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.confirmSetupIntent(com.stripe.android.model.ConfirmSetupIntentParams, com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object confirmWeChatPay(com.stripe.android.model.ConfirmPaymentIntentParams r5, com.stripe.android.networking.ApiRequest.Options r6, m0.l.c<? super com.stripe.android.model.WeChatPayNextAction> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.StripePaymentController$confirmWeChatPay$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.stripe.android.StripePaymentController$confirmWeChatPay$1 r0 = (com.stripe.android.StripePaymentController$confirmWeChatPay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripePaymentController$confirmWeChatPay$1 r0 = new com.stripe.android.StripePaymentController$confirmWeChatPay$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r7)
            goto L_0x003b
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r7)
            r0.label = r3
            java.lang.Object r7 = r4.confirmPaymentIntent(r5, r6, r0)
            if (r7 != r1) goto L_0x003b
            return r1
        L_0x003b:
            com.stripe.android.model.PaymentIntent r7 = (com.stripe.android.model.PaymentIntent) r7
            com.stripe.android.model.StripeIntent$NextActionData r5 = r7.getNextActionData()
            boolean r5 = r5 instanceof com.stripe.android.model.StripeIntent.NextActionData.WeChatPayRedirect
            if (r5 == 0) goto L_0x0055
            com.stripe.android.model.WeChatPayNextAction r5 = new com.stripe.android.model.WeChatPayNextAction
            com.stripe.android.model.StripeIntent$NextActionData r6 = r7.getNextActionData()
            com.stripe.android.model.StripeIntent$NextActionData$WeChatPayRedirect r6 = (com.stripe.android.model.StripeIntent.NextActionData.WeChatPayRedirect) r6
            com.stripe.android.model.WeChat r6 = r6.getWeChat()
            r5.<init>(r7, r6)
            return r5
        L_0x0055:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Unable to confirm Payment Intent with WeChatPay SDK"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.confirmWeChatPay(com.stripe.android.model.ConfirmPaymentIntentParams, com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getAuthenticateSourceResult(android.content.Intent r23, m0.l.c<? super com.stripe.android.model.Source> r24) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException, java.lang.IllegalArgumentException {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof com.stripe.android.StripePaymentController$getAuthenticateSourceResult$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.stripe.android.StripePaymentController$getAuthenticateSourceResult$1 r2 = (com.stripe.android.StripePaymentController$getAuthenticateSourceResult$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.stripe.android.StripePaymentController$getAuthenticateSourceResult$1 r2 = new com.stripe.android.StripePaymentController$getAuthenticateSourceResult$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x0033
            if (r4 != r5) goto L_0x002b
            i0.j.f.p.h.d4(r1)
            goto L_0x0082
        L_0x002b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0033:
            i0.j.f.p.h.d4(r1)
            com.stripe.android.payments.PaymentFlowResult$Unvalidated$Companion r1 = com.stripe.android.payments.PaymentFlowResult.Unvalidated.Companion
            r4 = r23
            com.stripe.android.payments.PaymentFlowResult$Unvalidated r1 = r1.fromIntent$payments_core_release(r4)
            java.lang.String r4 = r1.getSourceId$payments_core_release()
            java.lang.String r6 = ""
            if (r4 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r4 = r6
        L_0x0048:
            java.lang.String r7 = r1.getClientSecret$payments_core_release()
            if (r7 == 0) goto L_0x004f
            r6 = r7
        L_0x004f:
            com.stripe.android.networking.ApiRequest$Options r13 = new com.stripe.android.networking.ApiRequest$Options
            java.lang.String r8 = r0.publishableKey
            java.lang.String r9 = r1.getStripeAccountId$payments_core_release()
            r10 = 0
            r11 = 4
            r12 = 0
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            com.stripe.android.networking.AnalyticsRequestExecutor r1 = r0.analyticsRequestExecutor
            com.stripe.android.networking.AnalyticsRequestFactory r14 = r0.analyticsRequestFactory
            com.stripe.android.networking.AnalyticsEvent r15 = com.stripe.android.networking.AnalyticsEvent.AuthSourceResult
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 30
            r21 = 0
            com.stripe.android.networking.AnalyticsRequest r7 = com.stripe.android.networking.AnalyticsRequestFactory.createRequest$payments_core_release$default(r14, r15, r16, r17, r18, r19, r20, r21)
            r1.executeAsync(r7)
            com.stripe.android.networking.StripeRepository r1 = r0.stripeRepository
            r2.label = r5
            java.lang.Object r1 = r1.retrieveSource(r4, r6, r13, r2)
            if (r1 != r3) goto L_0x0082
            return r3
        L_0x0082:
            if (r1 == 0) goto L_0x0085
            return r1
        L_0x0085:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Required value was null."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.getAuthenticateSourceResult(android.content.Intent, m0.l.c):java.lang.Object");
    }

    public Object getPaymentIntentResult(Intent intent, m0.l.c<? super PaymentIntentResult> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException {
        return this.paymentIntentFlowResultProcessor.processResult(PaymentFlowResult.Unvalidated.Companion.fromIntent$payments_core_release(intent), cVar);
    }

    public Object getSetupIntentResult(Intent intent, m0.l.c<? super SetupIntentResult> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException {
        return this.setupIntentFlowResultProcessor.processResult(PaymentFlowResult.Unvalidated.Companion.fromIntent$payments_core_release(intent), cVar);
    }

    public final Object handle3ds1Auth(AuthActivityStarter.Host host, StripeIntent stripeIntent, ApiRequest.Options options, StripeIntent.NextActionData.SdkData.Use3DS1 use3DS1, String str, m0.l.c<? super m0.i> cVar) {
        this.analyticsRequestExecutor.executeAsync(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, AnalyticsEvent.Auth3ds1Sdk, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
        AuthActivityStarter.Host host2 = host;
        PaymentBrowserAuthStarter invoke = this.paymentBrowserAuthStarterFactory.invoke(host);
        int requestCode$payments_core_release = Companion.getRequestCode$payments_core_release(stripeIntent);
        String clientSecret = stripeIntent.getClientSecret();
        if (clientSecret == null) {
            clientSecret = "";
        }
        Object beginWebAuth$default = beginWebAuth$default(this, invoke, stripeIntent, requestCode$payments_core_release, clientSecret, use3DS1.getUrl(), options.getStripeAccount$payments_core_release(), str, true, false, cVar, 256, (Object) null);
        if (beginWebAuth$default == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return beginWebAuth$default;
        }
        return m0.i.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object handle3ds2Auth(com.stripe.android.view.AuthActivityStarter.Host r20, com.stripe.android.model.StripeIntent r21, com.stripe.android.networking.ApiRequest.Options r22, com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2 r23, m0.l.c<? super m0.i> r24) {
        /*
            r19 = this;
            r7 = r19
            r0 = r24
            boolean r1 = r0 instanceof com.stripe.android.StripePaymentController$handle3ds2Auth$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.stripe.android.StripePaymentController$handle3ds2Auth$1 r1 = (com.stripe.android.StripePaymentController$handle3ds2Auth$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001c
        L_0x0017:
            com.stripe.android.StripePaymentController$handle3ds2Auth$1 r1 = new com.stripe.android.StripePaymentController$handle3ds2Auth$1
            r1.<init>(r7, r0)
        L_0x001c:
            r8 = r1
            java.lang.Object r0 = r8.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L_0x004c
            if (r1 == r2) goto L_0x0038
            if (r1 != r10) goto L_0x0030
            i0.j.f.p.h.d4(r0)
            goto L_0x00a8
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            java.lang.Object r1 = r8.L$2
            com.stripe.android.model.StripeIntent r1 = (com.stripe.android.model.StripeIntent) r1
            java.lang.Object r2 = r8.L$1
            com.stripe.android.view.AuthActivityStarter$Host r2 = (com.stripe.android.view.AuthActivityStarter.Host) r2
            java.lang.Object r3 = r8.L$0
            com.stripe.android.StripePaymentController r3 = (com.stripe.android.StripePaymentController) r3
            i0.j.f.p.h.d4(r0)     // Catch:{ CertificateException -> 0x0048 }
            goto L_0x00a8
        L_0x0048:
            r0 = move-exception
            r12 = r1
            r11 = r2
            goto L_0x0092
        L_0x004c:
            i0.j.f.p.h.d4(r0)
            com.stripe.android.networking.AnalyticsRequestExecutor r0 = r7.analyticsRequestExecutor
            com.stripe.android.networking.AnalyticsRequestFactory r11 = r7.analyticsRequestFactory
            com.stripe.android.networking.AnalyticsEvent r12 = com.stripe.android.networking.AnalyticsEvent.Auth3ds2Fingerprint
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 30
            r18 = 0
            com.stripe.android.networking.AnalyticsRequest r1 = com.stripe.android.networking.AnalyticsRequestFactory.createRequest$payments_core_release$default(r11, r12, r13, r14, r15, r16, r17, r18)
            r0.executeAsync(r1)
            com.stripe.android.model.Stripe3ds2Fingerprint r4 = new com.stripe.android.model.Stripe3ds2Fingerprint     // Catch:{ CertificateException -> 0x008c }
            r0 = r23
            r4.<init>(r0)     // Catch:{ CertificateException -> 0x008c }
            r8.L$0 = r7     // Catch:{ CertificateException -> 0x008c }
            r11 = r20
            r8.L$1 = r11     // Catch:{ CertificateException -> 0x008a }
            r12 = r21
            r8.L$2 = r12     // Catch:{ CertificateException -> 0x0088 }
            r8.label = r2     // Catch:{ CertificateException -> 0x0088 }
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r22
            r6 = r8
            java.lang.Object r0 = r1.begin3ds2Auth(r2, r3, r4, r5, r6)     // Catch:{ CertificateException -> 0x0088 }
            if (r0 != r9) goto L_0x00a8
            return r9
        L_0x0088:
            r0 = move-exception
            goto L_0x0091
        L_0x008a:
            r0 = move-exception
            goto L_0x008f
        L_0x008c:
            r0 = move-exception
            r11 = r20
        L_0x008f:
            r12 = r21
        L_0x0091:
            r3 = r7
        L_0x0092:
            com.stripe.android.StripePaymentController$Companion r1 = Companion
            int r1 = r1.getRequestCode$payments_core_release((com.stripe.android.model.StripeIntent) r12)
            r2 = 0
            r8.L$0 = r2
            r8.L$1 = r2
            r8.L$2 = r2
            r8.label = r10
            java.lang.Object r0 = r3.handleError(r11, r1, r0, r8)
            if (r0 != r9) goto L_0x00a8
            return r9
        L_0x00a8:
            m0.i r0 = m0.i.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.handle3ds2Auth(com.stripe.android.view.AuthActivityStarter$Host, com.stripe.android.model.StripeIntent, com.stripe.android.networking.ApiRequest$Options, com.stripe.android.model.StripeIntent$NextActionData$SdkData$Use3DS2, m0.l.c):java.lang.Object");
    }

    public final Object handleAlipayAuth(AuthActivityStarter.Host host, StripeIntent stripeIntent, ApiRequest.Options options, StripeIntent.NextActionData.AlipayRedirect alipayRedirect, m0.l.c<? super m0.i> cVar) {
        this.analyticsRequestExecutor.executeAsync(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, AnalyticsEvent.AuthRedirect, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
        AuthActivityStarter.Host host2 = host;
        PaymentBrowserAuthStarter invoke = this.paymentBrowserAuthStarterFactory.invoke(host);
        int requestCode$payments_core_release = Companion.getRequestCode$payments_core_release(stripeIntent);
        String clientSecret = stripeIntent.getClientSecret();
        if (clientSecret == null) {
            clientSecret = "";
        }
        String str = clientSecret;
        String uri = alipayRedirect.getWebViewUrl().toString();
        i.d(uri, "nextActionData.webViewUrl.toString()");
        Object beginWebAuth$default = beginWebAuth$default(this, invoke, stripeIntent, requestCode$payments_core_release, str, uri, options.getStripeAccount$payments_core_release(), alipayRedirect.getReturnUrl(), false, false, cVar, 384, (Object) null);
        if (beginWebAuth$default == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return beginWebAuth$default;
        }
        return m0.i.a;
    }

    public final Object handleError(AuthActivityStarter.Host host, int i, Throwable th, m0.l.c<? super m0.i> cVar) {
        Object k4 = a.k4(this.uiContext, new StripePaymentController$handleError$2(this, host, th, i, (m0.l.c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }

    public Object handleNextAction(AuthActivityStarter.Host host, StripeIntent stripeIntent, String str, ApiRequest.Options options, m0.l.c<? super m0.i> cVar) {
        if (stripeIntent.requiresAction()) {
            StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
            if (nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS2) {
                Object handle3ds2Auth = handle3ds2Auth(host, stripeIntent, options, (StripeIntent.NextActionData.SdkData.Use3DS2) nextActionData, cVar);
                if (handle3ds2Auth == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return handle3ds2Auth;
                }
            } else if (nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS1) {
                Object handle3ds1Auth = handle3ds1Auth(host, stripeIntent, options, (StripeIntent.NextActionData.SdkData.Use3DS1) nextActionData, str, cVar);
                if (handle3ds1Auth == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return handle3ds1Auth;
                }
            } else if (nextActionData instanceof StripeIntent.NextActionData.RedirectToUrl) {
                Object handleRedirectToUrlAuth = handleRedirectToUrlAuth(host, stripeIntent, options, (StripeIntent.NextActionData.RedirectToUrl) nextActionData, cVar);
                if (handleRedirectToUrlAuth == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return handleRedirectToUrlAuth;
                }
            } else if (nextActionData instanceof StripeIntent.NextActionData.AlipayRedirect) {
                Object handleAlipayAuth = handleAlipayAuth(host, stripeIntent, options, (StripeIntent.NextActionData.AlipayRedirect) nextActionData, cVar);
                if (handleAlipayAuth == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return handleAlipayAuth;
                }
            } else if (nextActionData instanceof StripeIntent.NextActionData.DisplayOxxoDetails) {
                Object handleOxxoAuth = handleOxxoAuth(host, stripeIntent, options, (StripeIntent.NextActionData.DisplayOxxoDetails) nextActionData, cVar);
                if (handleOxxoAuth == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return handleOxxoAuth;
                }
            } else {
                Object bypassAuth$payments_core_release = bypassAuth$payments_core_release(host, stripeIntent, options.getStripeAccount$payments_core_release(), cVar);
                if (bypassAuth$payments_core_release == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return bypassAuth$payments_core_release;
                }
            }
        } else {
            Object bypassAuth$payments_core_release2 = bypassAuth$payments_core_release(host, stripeIntent, options.getStripeAccount$payments_core_release(), cVar);
            if (bypassAuth$payments_core_release2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return bypassAuth$payments_core_release2;
            }
        }
        return m0.i.a;
    }

    public final Object handleOxxoAuth(AuthActivityStarter.Host host, StripeIntent stripeIntent, ApiRequest.Options options, StripeIntent.NextActionData.DisplayOxxoDetails displayOxxoDetails, m0.l.c<? super m0.i> cVar) {
        AuthActivityStarter.Host host2 = host;
        StripeIntent stripeIntent2 = stripeIntent;
        if (displayOxxoDetails.getHostedVoucherUrl() != null) {
            PaymentBrowserAuthStarter invoke = this.paymentBrowserAuthStarterFactory.invoke(host);
            int requestCode$payments_core_release = Companion.getRequestCode$payments_core_release(stripeIntent2);
            String clientSecret = stripeIntent.getClientSecret();
            if (clientSecret == null) {
                clientSecret = "";
            }
            Object beginWebAuth$default = beginWebAuth$default(this, invoke, stripeIntent, requestCode$payments_core_release, clientSecret, displayOxxoDetails.getHostedVoucherUrl(), options.getStripeAccount$payments_core_release(), (String) null, false, false, cVar, 192, (Object) null);
            if (beginWebAuth$default == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return beginWebAuth$default;
            }
        } else {
            Object bypassAuth$payments_core_release = bypassAuth$payments_core_release(host, stripeIntent2, options.getStripeAccount$payments_core_release(), cVar);
            if (bypassAuth$payments_core_release == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return bypassAuth$payments_core_release;
            }
        }
        return m0.i.a;
    }

    public final Object handleRedirectToUrlAuth(AuthActivityStarter.Host host, StripeIntent stripeIntent, ApiRequest.Options options, StripeIntent.NextActionData.RedirectToUrl redirectToUrl, m0.l.c<? super m0.i> cVar) {
        this.analyticsRequestExecutor.executeAsync(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, AnalyticsEvent.AuthRedirect, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
        AuthActivityStarter.Host host2 = host;
        PaymentBrowserAuthStarter invoke = this.paymentBrowserAuthStarterFactory.invoke(host);
        int requestCode$payments_core_release = Companion.getRequestCode$payments_core_release(stripeIntent);
        String clientSecret = stripeIntent.getClientSecret();
        if (clientSecret == null) {
            clientSecret = "";
        }
        String str = clientSecret;
        String uri = redirectToUrl.getUrl().toString();
        i.d(uri, "nextActionData.url.toString()");
        Object beginWebAuth$default = beginWebAuth$default(this, invoke, stripeIntent, requestCode$payments_core_release, str, uri, options.getStripeAccount$payments_core_release(), redirectToUrl.getReturnUrl(), false, false, cVar, 384, (Object) null);
        if (beginWebAuth$default == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return beginWebAuth$default;
        }
        return m0.i.a;
    }

    public final Object on3ds2AuthFailure(Throwable th, int i, PaymentRelayStarter paymentRelayStarter, m0.l.c<? super m0.i> cVar) {
        Object k4 = a.k4(this.uiContext, new StripePaymentController$on3ds2AuthFailure$2(paymentRelayStarter, th, i, (m0.l.c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }

    public final Object on3ds2AuthFallback$payments_core_release(String str, AuthActivityStarter.Host host, StripeIntent stripeIntent, ApiRequest.Options options, m0.l.c<? super m0.i> cVar) {
        this.analyticsRequestExecutor.executeAsync(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, AnalyticsEvent.Auth3ds2Fallback, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
        PaymentBrowserAuthStarter invoke = this.paymentBrowserAuthStarterFactory.invoke(host);
        int requestCode$payments_core_release = Companion.getRequestCode$payments_core_release(stripeIntent);
        String clientSecret = stripeIntent.getClientSecret();
        if (clientSecret == null) {
            clientSecret = "";
        }
        Object beginWebAuth$default = beginWebAuth$default(this, invoke, stripeIntent, requestCode$payments_core_release, clientSecret, str, options.getStripeAccount$payments_core_release(), (String) null, true, false, cVar, 320, (Object) null);
        if (beginWebAuth$default == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return beginWebAuth$default;
        }
        return m0.i.a;
    }

    public final Object on3ds2AuthSuccess$payments_core_release(Stripe3ds2AuthResult stripe3ds2AuthResult, Transaction transaction, String str, int i, PaymentRelayStarter paymentRelayStarter, int i2, AuthActivityStarter.Host host, StripeIntent stripeIntent, ApiRequest.Options options, m0.l.c<? super m0.i> cVar) {
        String str2;
        PaymentRelayStarter paymentRelayStarter2 = paymentRelayStarter;
        m0.l.c<? super m0.i> cVar2 = cVar;
        Stripe3ds2AuthResult.Ares ares = stripe3ds2AuthResult.getAres();
        if (ares == null) {
            StripeIntent stripeIntent2 = stripeIntent;
            if (stripe3ds2AuthResult.getFallbackRedirectUrl() != null) {
                Object on3ds2AuthFallback$payments_core_release = on3ds2AuthFallback$payments_core_release(stripe3ds2AuthResult.getFallbackRedirectUrl(), host, stripeIntent, options, cVar);
                if (on3ds2AuthFallback$payments_core_release == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return on3ds2AuthFallback$payments_core_release;
                }
            } else {
                Stripe3ds2AuthResult.ThreeDS2Error error = stripe3ds2AuthResult.getError();
                if (error != null) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Code: ");
                    P0.append(error.getErrorCode());
                    StringBuilder P02 = i0.d.a.a.a.P0("Detail: ");
                    P02.append(error.getErrorDetail());
                    StringBuilder P03 = i0.d.a.a.a.P0("Description: ");
                    P03.append(error.getErrorDescription());
                    StringBuilder P04 = i0.d.a.a.a.P0("Component: ");
                    P04.append(error.getErrorComponent());
                    str2 = g.E(g.K(P0.toString(), P02.toString(), P03.toString(), P04.toString()), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
                } else {
                    str2 = "Invalid 3DS2 authentication response";
                }
                Object on3ds2AuthFailure = on3ds2AuthFailure(new RuntimeException(i0.d.a.a.a.n0("Error encountered during 3DS2 authentication request. ", str2)), i2, paymentRelayStarter2, cVar2);
                if (on3ds2AuthFailure == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return on3ds2AuthFailure;
                }
            }
        } else if (ares.isChallenge()) {
            Object startChallengeFlow$payments_core_release = startChallengeFlow$payments_core_release(ares, transaction, str, i, paymentRelayStarter, host, stripeIntent, options, cVar);
            if (startChallengeFlow$payments_core_release == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return startChallengeFlow$payments_core_release;
            }
        } else {
            Object startFrictionlessFlow = startFrictionlessFlow(paymentRelayStarter2, stripeIntent, cVar2);
            if (startFrictionlessFlow == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return startFrictionlessFlow;
            }
        }
        return m0.i.a;
    }

    public final Object onSourceRetrieved(AuthActivityStarter.Host host, Source source, ApiRequest.Options options, m0.l.c<? super m0.i> cVar) {
        if (source.getFlow() == Source.Flow.Redirect) {
            Object startSourceAuth = startSourceAuth(this.paymentBrowserAuthStarterFactory.invoke(host), source, options, cVar);
            if (startSourceAuth == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return startSourceAuth;
            }
        } else {
            Object bypassAuth = bypassAuth(host, source, options.getStripeAccount$payments_core_release(), cVar);
            if (bypassAuth == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return bypassAuth;
            }
        }
        return m0.i.a;
    }

    public boolean shouldHandlePaymentResult(int i, Intent intent) {
        return i == 50000 && intent != null;
    }

    public boolean shouldHandleSetupResult(int i, Intent intent) {
        return i == 50001 && intent != null;
    }

    public boolean shouldHandleSourceResult(int i, Intent intent) {
        return i == 50002 && intent != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0 A[Catch:{ all -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d1 A[Catch:{ all -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:37:0x00a5=Splitter:B:37:0x00a5, B:47:0x00cc=Splitter:B:47:0x00cc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object startAuth(com.stripe.android.view.AuthActivityStarter.Host r17, java.lang.String r18, com.stripe.android.networking.ApiRequest.Options r19, com.stripe.android.PaymentController.StripeIntentType r20, m0.l.c<? super m0.i> r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r10 = r19
            r11 = r20
            r0 = r21
            boolean r3 = r0 instanceof com.stripe.android.StripePaymentController$startAuth$1
            if (r3 == 0) goto L_0x001d
            r3 = r0
            com.stripe.android.StripePaymentController$startAuth$1 r3 = (com.stripe.android.StripePaymentController$startAuth$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001d
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x0022
        L_0x001d:
            com.stripe.android.StripePaymentController$startAuth$1 r3 = new com.stripe.android.StripePaymentController$startAuth$1
            r3.<init>(r1, r0)
        L_0x0022:
            r12 = r3
            java.lang.Object r0 = r12.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r13 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r12.label
            r14 = 4
            r15 = 3
            r4 = 2
            r9 = 1
            if (r3 == 0) goto L_0x007c
            if (r3 == r9) goto L_0x005d
            if (r3 == r4) goto L_0x0045
            if (r3 == r15) goto L_0x0040
            if (r3 != r14) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0040:
            i0.j.f.p.h.d4(r0)
            goto L_0x012f
        L_0x0045:
            java.lang.Object r2 = r12.L$3
            com.stripe.android.PaymentController$StripeIntentType r2 = (com.stripe.android.PaymentController.StripeIntentType) r2
            java.lang.Object r3 = r12.L$2
            com.stripe.android.networking.ApiRequest$Options r3 = (com.stripe.android.networking.ApiRequest.Options) r3
            java.lang.Object r4 = r12.L$1
            com.stripe.android.view.AuthActivityStarter$Host r4 = (com.stripe.android.view.AuthActivityStarter.Host) r4
            java.lang.Object r5 = r12.L$0
            com.stripe.android.StripePaymentController r5 = (com.stripe.android.StripePaymentController) r5
            i0.j.f.p.h.d4(r0)     // Catch:{ all -> 0x0075 }
            r11 = r2
            r10 = r3
            r2 = r4
            r14 = r9
            goto L_0x00a5
        L_0x005d:
            java.lang.Object r2 = r12.L$3
            com.stripe.android.PaymentController$StripeIntentType r2 = (com.stripe.android.PaymentController.StripeIntentType) r2
            java.lang.Object r3 = r12.L$2
            com.stripe.android.networking.ApiRequest$Options r3 = (com.stripe.android.networking.ApiRequest.Options) r3
            java.lang.Object r4 = r12.L$1
            com.stripe.android.view.AuthActivityStarter$Host r4 = (com.stripe.android.view.AuthActivityStarter.Host) r4
            java.lang.Object r5 = r12.L$0
            com.stripe.android.StripePaymentController r5 = (com.stripe.android.StripePaymentController) r5
            i0.j.f.p.h.d4(r0)     // Catch:{ all -> 0x0075 }
            r11 = r2
            r10 = r3
            r2 = r4
            r14 = r9
            goto L_0x00cc
        L_0x0075:
            r0 = move-exception
            r11 = r2
            r10 = r3
            r2 = r4
            r14 = r9
            goto L_0x00e4
        L_0x007c:
            i0.j.f.p.h.d4(r0)
            int r0 = r20.ordinal()     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00af
            if (r0 != r9) goto L_0x00a8
            com.stripe.android.networking.StripeRepository r3 = r1.stripeRepository     // Catch:{ all -> 0x00e1 }
            r6 = 0
            r8 = 4
            r0 = 0
            r12.L$0 = r1     // Catch:{ all -> 0x00e1 }
            r12.L$1 = r2     // Catch:{ all -> 0x00e1 }
            r12.L$2 = r10     // Catch:{ all -> 0x00e1 }
            r12.L$3 = r11     // Catch:{ all -> 0x00e1 }
            r12.label = r4     // Catch:{ all -> 0x00e1 }
            r4 = r18
            r5 = r19
            r7 = r12
            r14 = r9
            r9 = r0
            java.lang.Object r0 = com.stripe.android.networking.StripeRepository.DefaultImpls.retrieveSetupIntent$default(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00df }
            if (r0 != r13) goto L_0x00a4
            return r13
        L_0x00a4:
            r5 = r1
        L_0x00a5:
            com.stripe.android.model.StripeIntent r0 = (com.stripe.android.model.StripeIntent) r0     // Catch:{ all -> 0x00dd }
            goto L_0x00ce
        L_0x00a8:
            r14 = r9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00df }
            r0.<init>()     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00af:
            r14 = r9
            com.stripe.android.networking.StripeRepository r3 = r1.stripeRepository     // Catch:{ all -> 0x00df }
            r6 = 0
            r8 = 4
            r9 = 0
            r12.L$0 = r1     // Catch:{ all -> 0x00df }
            r12.L$1 = r2     // Catch:{ all -> 0x00df }
            r12.L$2 = r10     // Catch:{ all -> 0x00df }
            r12.L$3 = r11     // Catch:{ all -> 0x00df }
            r12.label = r14     // Catch:{ all -> 0x00df }
            r4 = r18
            r5 = r19
            r7 = r12
            java.lang.Object r0 = com.stripe.android.networking.StripeRepository.DefaultImpls.retrievePaymentIntent$default(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00df }
            if (r0 != r13) goto L_0x00cb
            return r13
        L_0x00cb:
            r5 = r1
        L_0x00cc:
            com.stripe.android.model.StripeIntent r0 = (com.stripe.android.model.StripeIntent) r0     // Catch:{ all -> 0x00dd }
        L_0x00ce:
            if (r0 == 0) goto L_0x00d1
            goto L_0x00e8
        L_0x00d1:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00dd }
            r3.<init>(r0)     // Catch:{ all -> 0x00dd }
            throw r3     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r0 = move-exception
            goto L_0x00e4
        L_0x00df:
            r0 = move-exception
            goto L_0x00e3
        L_0x00e1:
            r0 = move-exception
            r14 = r9
        L_0x00e3:
            r5 = r1
        L_0x00e4:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x00e8:
            r4 = r5
            r8 = r10
            r5 = r2
            java.lang.Throwable r2 = kotlin.Result.a(r0)
            r3 = 0
            if (r2 != 0) goto L_0x0108
            r6 = r0
            com.stripe.android.model.StripeIntent r6 = (com.stripe.android.model.StripeIntent) r6
            r7 = 0
            r12.L$0 = r3
            r12.L$1 = r3
            r12.L$2 = r3
            r12.L$3 = r3
            r12.label = r15
            r9 = r12
            java.lang.Object r0 = r4.handleNextAction(r5, r6, r7, r8, r9)
            if (r0 != r13) goto L_0x012f
            return r13
        L_0x0108:
            int r0 = r11.ordinal()
            if (r0 == 0) goto L_0x011a
            if (r0 != r14) goto L_0x0114
            r0 = 50001(0xc351, float:7.0066E-41)
            goto L_0x011d
        L_0x0114:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x011a:
            r0 = 50000(0xc350, float:7.0065E-41)
        L_0x011d:
            r12.L$0 = r3
            r12.L$1 = r3
            r12.L$2 = r3
            r12.L$3 = r3
            r3 = 4
            r12.label = r3
            java.lang.Object r0 = r4.handleError(r5, r0, r2, r12)
            if (r0 != r13) goto L_0x012f
            return r13
        L_0x012f:
            m0.i r0 = m0.i.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.startAuth(com.stripe.android.view.AuthActivityStarter$Host, java.lang.String, com.stripe.android.networking.ApiRequest$Options, com.stripe.android.PaymentController$StripeIntentType, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090 A[SYNTHETIC, Splitter:B:37:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093 A[Catch:{ all -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object startAuthenticateSource(com.stripe.android.view.AuthActivityStarter.Host r18, com.stripe.android.model.Source r19, com.stripe.android.networking.ApiRequest.Options r20, m0.l.c<? super m0.i> r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r20
            r0 = r21
            boolean r3 = r0 instanceof com.stripe.android.StripePaymentController$startAuthenticateSource$1
            if (r3 == 0) goto L_0x0019
            r3 = r0
            com.stripe.android.StripePaymentController$startAuthenticateSource$1 r3 = (com.stripe.android.StripePaymentController$startAuthenticateSource$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.stripe.android.StripePaymentController$startAuthenticateSource$1 r3 = new com.stripe.android.StripePaymentController$startAuthenticateSource$1
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x0050
            if (r5 == r8) goto L_0x003d
            if (r5 == r7) goto L_0x0038
            if (r5 != r6) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0038:
            i0.j.f.p.h.d4(r0)
            goto L_0x00d4
        L_0x003d:
            java.lang.Object r2 = r3.L$2
            com.stripe.android.networking.ApiRequest$Options r2 = (com.stripe.android.networking.ApiRequest.Options) r2
            java.lang.Object r5 = r3.L$1
            com.stripe.android.view.AuthActivityStarter$Host r5 = (com.stripe.android.view.AuthActivityStarter.Host) r5
            java.lang.Object r8 = r3.L$0
            com.stripe.android.StripePaymentController r8 = (com.stripe.android.StripePaymentController) r8
            i0.j.f.p.h.d4(r0)     // Catch:{ all -> 0x004d }
            goto L_0x008e
        L_0x004d:
            r0 = move-exception
            r10 = r5
            goto L_0x00a5
        L_0x0050:
            i0.j.f.p.h.d4(r0)
            com.stripe.android.networking.AnalyticsRequestExecutor r0 = r1.analyticsRequestExecutor
            com.stripe.android.networking.AnalyticsRequestFactory r9 = r1.analyticsRequestFactory
            com.stripe.android.networking.AnalyticsEvent r10 = com.stripe.android.networking.AnalyticsEvent.AuthSourceStart
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 30
            r16 = 0
            com.stripe.android.networking.AnalyticsRequest r5 = com.stripe.android.networking.AnalyticsRequestFactory.createRequest$payments_core_release$default(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.executeAsync(r5)
            com.stripe.android.networking.StripeRepository r0 = r1.stripeRepository     // Catch:{ all -> 0x00a1 }
            java.lang.String r5 = r19.getId()     // Catch:{ all -> 0x00a1 }
            java.lang.String r9 = ""
            if (r5 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r5 = r9
        L_0x0074:
            java.lang.String r10 = r19.getClientSecret()     // Catch:{ all -> 0x00a1 }
            if (r10 == 0) goto L_0x007b
            r9 = r10
        L_0x007b:
            r3.L$0 = r1     // Catch:{ all -> 0x00a1 }
            r10 = r18
            r3.L$1 = r10     // Catch:{ all -> 0x009f }
            r3.L$2 = r2     // Catch:{ all -> 0x009f }
            r3.label = r8     // Catch:{ all -> 0x009f }
            java.lang.Object r0 = r0.retrieveSource(r5, r9, r2, r3)     // Catch:{ all -> 0x009f }
            if (r0 != r4) goto L_0x008c
            return r4
        L_0x008c:
            r8 = r1
            r5 = r10
        L_0x008e:
            if (r0 == 0) goto L_0x0093
            com.stripe.android.model.Source r0 = (com.stripe.android.model.Source) r0     // Catch:{ all -> 0x004d }
            goto L_0x00aa
        L_0x0093:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004d }
            r9.<init>(r0)     // Catch:{ all -> 0x004d }
            throw r9     // Catch:{ all -> 0x004d }
        L_0x009f:
            r0 = move-exception
            goto L_0x00a4
        L_0x00a1:
            r0 = move-exception
            r10 = r18
        L_0x00a4:
            r8 = r1
        L_0x00a5:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
            r5 = r10
        L_0x00aa:
            java.lang.Throwable r9 = kotlin.Result.a(r0)
            r10 = 0
            if (r9 != 0) goto L_0x00c2
            com.stripe.android.model.Source r0 = (com.stripe.android.model.Source) r0
            r3.L$0 = r10
            r3.L$1 = r10
            r3.L$2 = r10
            r3.label = r7
            java.lang.Object r0 = r8.onSourceRetrieved(r5, r0, r2, r3)
            if (r0 != r4) goto L_0x00d4
            return r4
        L_0x00c2:
            r0 = 50002(0xc352, float:7.0068E-41)
            r3.L$0 = r10
            r3.L$1 = r10
            r3.L$2 = r10
            r3.label = r6
            java.lang.Object r0 = r8.handleError(r5, r0, r9, r3)
            if (r0 != r4) goto L_0x00d4
            return r4
        L_0x00d4:
            m0.i r0 = m0.i.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.startAuthenticateSource(com.stripe.android.view.AuthActivityStarter$Host, com.stripe.android.model.Source, com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    public final Object startChallengeFlow$payments_core_release(Stripe3ds2AuthResult.Ares ares, Transaction transaction, String str, int i, PaymentRelayStarter paymentRelayStarter, AuthActivityStarter.Host host, StripeIntent stripeIntent, ApiRequest.Options options, m0.l.c<? super m0.i> cVar) {
        Object k4 = a.k4(this.workContext, new StripePaymentController$startChallengeFlow$2(this, host, transaction, ares, stripeIntent, str, options, i, paymentRelayStarter, (m0.l.c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.stripe.android.networking.ApiRequest$Options} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: com.stripe.android.networking.ApiRequest$Options} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:53:0x00f4=Splitter:B:53:0x00f4, B:43:0x00ce=Splitter:B:43:0x00ce} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object startConfirmAndAuth(com.stripe.android.view.AuthActivityStarter.Host r10, com.stripe.android.model.ConfirmStripeIntentParams r11, com.stripe.android.networking.ApiRequest.Options r12, m0.l.c<? super m0.i> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.stripe.android.StripePaymentController$startConfirmAndAuth$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.stripe.android.StripePaymentController$startConfirmAndAuth$1 r0 = (com.stripe.android.StripePaymentController$startConfirmAndAuth$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripePaymentController$startConfirmAndAuth$1 r0 = new com.stripe.android.StripePaymentController$startConfirmAndAuth$1
            r0.<init>(r9, r13)
        L_0x0018:
            r6 = r0
            java.lang.Object r13 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r7 = 0
            if (r1 == 0) goto L_0x007e
            if (r1 == r5) goto L_0x005a
            if (r1 == r4) goto L_0x003c
            if (r1 == r3) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            goto L_0x0037
        L_0x002f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0037:
            i0.j.f.p.h.d4(r13)
            goto L_0x0143
        L_0x003c:
            java.lang.Object r10 = r6.L$4
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r6.L$3
            r12 = r11
            com.stripe.android.networking.ApiRequest$Options r12 = (com.stripe.android.networking.ApiRequest.Options) r12
            java.lang.Object r11 = r6.L$2
            com.stripe.android.model.ConfirmStripeIntentParams r11 = (com.stripe.android.model.ConfirmStripeIntentParams) r11
            java.lang.Object r1 = r6.L$1
            com.stripe.android.view.AuthActivityStarter$Host r1 = (com.stripe.android.view.AuthActivityStarter.Host) r1
            java.lang.Object r4 = r6.L$0
            com.stripe.android.StripePaymentController r4 = (com.stripe.android.StripePaymentController) r4
            i0.j.f.p.h.d4(r13)     // Catch:{ all -> 0x0077 }
            r8 = r13
            r13 = r10
            r10 = r1
            r1 = r8
            goto L_0x00f4
        L_0x005a:
            java.lang.Object r10 = r6.L$4
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r6.L$3
            r12 = r11
            com.stripe.android.networking.ApiRequest$Options r12 = (com.stripe.android.networking.ApiRequest.Options) r12
            java.lang.Object r11 = r6.L$2
            com.stripe.android.model.ConfirmStripeIntentParams r11 = (com.stripe.android.model.ConfirmStripeIntentParams) r11
            java.lang.Object r1 = r6.L$1
            com.stripe.android.view.AuthActivityStarter$Host r1 = (com.stripe.android.view.AuthActivityStarter.Host) r1
            java.lang.Object r4 = r6.L$0
            com.stripe.android.StripePaymentController r4 = (com.stripe.android.StripePaymentController) r4
            i0.j.f.p.h.d4(r13)     // Catch:{ all -> 0x0077 }
            r8 = r13
            r13 = r10
            r10 = r1
            r1 = r8
            goto L_0x00ce
        L_0x0077:
            r13 = move-exception
            r8 = r13
            r13 = r10
            r10 = r1
            r1 = r8
            goto L_0x0105
        L_0x007e:
            i0.j.f.p.h.d4(r13)
            java.lang.String r13 = r11.getReturnUrl()
            r9.logReturnUrl(r13)
            java.lang.String r13 = r11.getReturnUrl()
            if (r13 == 0) goto L_0x0097
            boolean r1 = kotlin.text.StringsKt__IndentKt.o(r13)
            if (r1 == 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r1 = 0
            goto L_0x0098
        L_0x0097:
            r1 = r5
        L_0x0098:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r13 = r7
        L_0x00a4:
            if (r13 == 0) goto L_0x00a7
            goto L_0x00ad
        L_0x00a7:
            com.stripe.android.payments.DefaultReturnUrl r13 = r9.defaultReturnUrl
            java.lang.String r13 = r13.getValue()
        L_0x00ad:
            boolean r1 = r11 instanceof com.stripe.android.model.ConfirmPaymentIntentParams     // Catch:{ all -> 0x0103 }
            if (r1 == 0) goto L_0x00d3
            r1 = r11
            com.stripe.android.model.ConfirmPaymentIntentParams r1 = (com.stripe.android.model.ConfirmPaymentIntentParams) r1     // Catch:{ all -> 0x0103 }
            r1.setReturnUrl(r13)     // Catch:{ all -> 0x0103 }
            r1 = r11
            com.stripe.android.model.ConfirmPaymentIntentParams r1 = (com.stripe.android.model.ConfirmPaymentIntentParams) r1     // Catch:{ all -> 0x0103 }
            r6.L$0 = r9     // Catch:{ all -> 0x0103 }
            r6.L$1 = r10     // Catch:{ all -> 0x0103 }
            r6.L$2 = r11     // Catch:{ all -> 0x0103 }
            r6.L$3 = r12     // Catch:{ all -> 0x0103 }
            r6.L$4 = r13     // Catch:{ all -> 0x0103 }
            r6.label = r5     // Catch:{ all -> 0x0103 }
            java.lang.Object r1 = r9.confirmPaymentIntent(r1, r12, r6)     // Catch:{ all -> 0x0103 }
            if (r1 != r0) goto L_0x00cd
            return r0
        L_0x00cd:
            r4 = r9
        L_0x00ce:
            com.stripe.android.model.StripeIntent r1 = (com.stripe.android.model.StripeIntent) r1     // Catch:{ all -> 0x00d1 }
            goto L_0x0109
        L_0x00d1:
            r1 = move-exception
            goto L_0x0105
        L_0x00d3:
            boolean r1 = r11 instanceof com.stripe.android.model.ConfirmSetupIntentParams     // Catch:{ all -> 0x0103 }
            if (r1 == 0) goto L_0x00f7
            r1 = r11
            com.stripe.android.model.ConfirmSetupIntentParams r1 = (com.stripe.android.model.ConfirmSetupIntentParams) r1     // Catch:{ all -> 0x0103 }
            r1.setReturnUrl(r13)     // Catch:{ all -> 0x0103 }
            r1 = r11
            com.stripe.android.model.ConfirmSetupIntentParams r1 = (com.stripe.android.model.ConfirmSetupIntentParams) r1     // Catch:{ all -> 0x0103 }
            r6.L$0 = r9     // Catch:{ all -> 0x0103 }
            r6.L$1 = r10     // Catch:{ all -> 0x0103 }
            r6.L$2 = r11     // Catch:{ all -> 0x0103 }
            r6.L$3 = r12     // Catch:{ all -> 0x0103 }
            r6.L$4 = r13     // Catch:{ all -> 0x0103 }
            r6.label = r4     // Catch:{ all -> 0x0103 }
            java.lang.Object r1 = r9.confirmSetupIntent(r1, r12, r6)     // Catch:{ all -> 0x0103 }
            if (r1 != r0) goto L_0x00f3
            return r0
        L_0x00f3:
            r4 = r9
        L_0x00f4:
            com.stripe.android.model.StripeIntent r1 = (com.stripe.android.model.StripeIntent) r1     // Catch:{ all -> 0x00d1 }
            goto L_0x0109
        L_0x00f7:
            java.lang.String r1 = "Confirmation params must be ConfirmPaymentIntentParams or ConfirmSetupIntentParams"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0103 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0103 }
            r4.<init>(r1)     // Catch:{ all -> 0x0103 }
            throw r4     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r1 = move-exception
            r4 = r9
        L_0x0105:
            java.lang.Object r1 = i0.j.f.p.h.l0(r1)
        L_0x0109:
            r5 = r12
            java.lang.Throwable r12 = kotlin.Result.a(r1)
            if (r12 != 0) goto L_0x012a
            r11 = r1
            com.stripe.android.model.StripeIntent r11 = (com.stripe.android.model.StripeIntent) r11
            r6.L$0 = r7
            r6.L$1 = r7
            r6.L$2 = r7
            r6.L$3 = r7
            r6.L$4 = r7
            r6.label = r3
            r1 = r4
            r2 = r10
            r3 = r11
            r4 = r13
            java.lang.Object r10 = r1.handleNextAction(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L_0x0143
            return r0
        L_0x012a:
            com.stripe.android.StripePaymentController$Companion r13 = Companion
            int r11 = r13.getRequestCode$payments_core_release((com.stripe.android.model.ConfirmStripeIntentParams) r11)
            r6.L$0 = r7
            r6.L$1 = r7
            r6.L$2 = r7
            r6.L$3 = r7
            r6.L$4 = r7
            r6.label = r2
            java.lang.Object r10 = r4.handleError(r10, r11, r12, r6)
            if (r10 != r0) goto L_0x0143
            return r0
        L_0x0143:
            m0.i r10 = m0.i.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.startConfirmAndAuth(com.stripe.android.view.AuthActivityStarter$Host, com.stripe.android.model.ConfirmStripeIntentParams, com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    public final Object startFrictionlessFlow(PaymentRelayStarter paymentRelayStarter, StripeIntent stripeIntent, m0.l.c<? super m0.i> cVar) {
        Object k4 = a.k4(this.uiContext, new StripePaymentController$startFrictionlessFlow$2(this, paymentRelayStarter, stripeIntent, (m0.l.c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }

    public final Object startSourceAuth(PaymentBrowserAuthStarter paymentBrowserAuthStarter, Source source, ApiRequest.Options options, m0.l.c<? super m0.i> cVar) {
        Object k4 = a.k4(this.uiContext, new StripePaymentController$startSourceAuth$2(this, paymentBrowserAuthStarter, source, options, (m0.l.c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StripePaymentController(android.content.Context r20, java.lang.String r21, com.stripe.android.networking.StripeRepository r22, boolean r23, com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry r24, com.stripe.android.PaymentAuthConfig r25, com.stripe.android.stripe3ds2.service.StripeThreeDs2Service r26, com.stripe.android.networking.AnalyticsRequestExecutor r27, com.stripe.android.networking.AnalyticsRequestFactory r28, com.stripe.android.StripePaymentController.ChallengeProgressActivityStarter r29, com.stripe.android.networking.AlipayRepository r30, h0.a.f.b r31, h0.a.f.b r32, h0.a.f.b r33, m0.l.e r34, m0.l.e r35, int r36, m0.n.b.f r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r6 = r1
            goto L_0x000b
        L_0x0009:
            r6 = r23
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0016
            com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry r1 = new com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry
            r1.<init>()
            r7 = r1
            goto L_0x0018
        L_0x0016:
            r7 = r24
        L_0x0018:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0024
            com.stripe.android.PaymentAuthConfig$Companion r1 = com.stripe.android.PaymentAuthConfig.Companion
            com.stripe.android.PaymentAuthConfig r1 = r1.get()
            r8 = r1
            goto L_0x0026
        L_0x0024:
            r8 = r25
        L_0x0026:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0033
            com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl r1 = new com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl
            r3 = r20
            r1.<init>(r3, r6)
            r9 = r1
            goto L_0x0037
        L_0x0033:
            r3 = r20
            r9 = r26
        L_0x0037:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x004a
            com.stripe.android.networking.AnalyticsRequestExecutor$Default r1 = new com.stripe.android.networking.AnalyticsRequestExecutor$Default
            com.stripe.android.Logger$Companion r4 = com.stripe.android.Logger.Companion
            com.stripe.android.Logger r4 = r4.getInstance$payments_core_release(r6)
            r5 = 2
            r1.<init>(r4, r2, r5, r2)
            r10 = r1
            goto L_0x004c
        L_0x004a:
            r10 = r27
        L_0x004c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0062
            com.stripe.android.networking.AnalyticsRequestFactory r1 = new com.stripe.android.networking.AnalyticsRequestFactory
            android.content.Context r4 = r20.getApplicationContext()
            java.lang.String r5 = "context.applicationContext"
            m0.n.b.i.d(r4, r5)
            r5 = r21
            r1.<init>((android.content.Context) r4, (java.lang.String) r5)
            r11 = r1
            goto L_0x0066
        L_0x0062:
            r5 = r21
            r11 = r28
        L_0x0066:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0071
            com.stripe.android.StripePaymentController$ChallengeProgressActivityStarter$Default r1 = new com.stripe.android.StripePaymentController$ChallengeProgressActivityStarter$Default
            r1.<init>()
            r12 = r1
            goto L_0x0073
        L_0x0071:
            r12 = r29
        L_0x0073:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x007f
            com.stripe.android.networking.DefaultAlipayRepository r1 = new com.stripe.android.networking.DefaultAlipayRepository
            r13 = r22
            r1.<init>(r13)
            goto L_0x0083
        L_0x007f:
            r13 = r22
            r1 = r30
        L_0x0083:
            r4 = r0 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0089
            r14 = r2
            goto L_0x008b
        L_0x0089:
            r14 = r31
        L_0x008b:
            r4 = r0 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x0091
            r15 = r2
            goto L_0x0093
        L_0x0091:
            r15 = r32
        L_0x0093:
            r4 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x009a
            r16 = r2
            goto L_0x009c
        L_0x009a:
            r16 = r33
        L_0x009c:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x00a5
            n0.a.d0 r2 = n0.a.m0.c
            r17 = r2
            goto L_0x00a7
        L_0x00a5:
            r17 = r34
        L_0x00a7:
            r2 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00b4
            n0.a.d0 r0 = n0.a.m0.a
            n0.a.l1 r0 = n0.a.h2.o.c
            r18 = r0
            goto L_0x00b6
        L_0x00b4:
            r18 = r35
        L_0x00b6:
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r13 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.<init>(android.content.Context, java.lang.String, com.stripe.android.networking.StripeRepository, boolean, com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry, com.stripe.android.PaymentAuthConfig, com.stripe.android.stripe3ds2.service.StripeThreeDs2Service, com.stripe.android.networking.AnalyticsRequestExecutor, com.stripe.android.networking.AnalyticsRequestFactory, com.stripe.android.StripePaymentController$ChallengeProgressActivityStarter, com.stripe.android.networking.AlipayRepository, h0.a.f.b, h0.a.f.b, h0.a.f.b, m0.l.e, m0.l.e, int, m0.n.b.f):void");
    }
}
