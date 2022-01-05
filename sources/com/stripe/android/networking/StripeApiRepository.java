package com.stripe.android.networking;

import android.content.Context;
import com.instabug.library.network.RequestResponse;
import com.stripe.android.AppInfo;
import com.stripe.android.FraudDetectionDataRepository;
import com.stripe.android.Logger;
import com.stripe.android.StripeApiBeta;
import com.stripe.android.StripeError;
import com.stripe.android.exception.APIConnectionException;
import com.stripe.android.exception.APIException;
import com.stripe.android.exception.AuthenticationException;
import com.stripe.android.exception.CardException;
import com.stripe.android.exception.InvalidRequestException;
import com.stripe.android.exception.PermissionException;
import com.stripe.android.exception.RateLimitException;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.Customer;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.StripeErrorJsonParser;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import com.stripe.android.model.parsers.CustomerJsonParser;
import com.stripe.android.model.parsers.PaymentIntentJsonParser;
import com.stripe.android.model.parsers.PaymentMethodJsonParser;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import com.stripe.android.model.parsers.SourceJsonParser;
import com.stripe.android.model.parsers.Stripe3ds2AuthResultJsonParser;
import com.stripe.android.model.parsers.TokenJsonParser;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.ApiRequest;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.security.Security;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.j.g;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ú\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 ¾\u00012\u00020\u0001:\u0004¾\u0001¿\u0001B§\u0001\b\u0001\u0012\b\u0010·\u0001\u001a\u00030¶\u0001\u0012\u0006\u0010A\u001a\u00020\u0013\u0012\f\b\u0002\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001\u0012\n\b\u0002\u0010¡\u0001\u001a\u00030 \u0001\u0012\n\b\u0002\u0010®\u0001\u001a\u00030­\u0001\u0012\n\b\u0002\u0010\u0001\u001a\u00030\u0001\u0012\n\b\u0002\u0010±\u0001\u001a\u00030°\u0001\u0012\n\b\u0002\u0010§\u0001\u001a\u00030¦\u0001\u0012\n\b\u0002\u0010¤\u0001\u001a\u00030£\u0001\u0012\n\b\u0002\u0010´\u0001\u001a\u00030³\u0001\u0012\u0010\b\u0002\u0010¹\u0001\u001a\t\u0012\u0005\u0012\u00030¸\u00010B\u0012\t\b\u0002\u0010º\u0001\u001a\u00020\u0013\u0012\t\b\u0002\u0010»\u0001\u001a\u00020\u0013¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H@ø\u0001\u0000¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u0004\u0018\u00010\u001f2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J3\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J3\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H@ø\u0001\u0000¢\u0006\u0004\b-\u0010#J-\u0010/\u001a\u0004\u0018\u00010*2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\b/\u0010'J%\u00103\u001a\u0004\u0018\u0001022\u0006\u00101\u001a\u0002002\u0006\u0010\u001e\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\b3\u00104J-\u00105\u001a\u0004\u0018\u0001022\u0006\u0010%\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\b5\u0010'J%\u00109\u001a\u0004\u0018\u0001082\u0006\u00107\u001a\u0002062\u0006\u0010\u001e\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\b9\u0010:J%\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u001e\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\b>\u0010?JK\u0010F\u001a\u0004\u0018\u0001022\u0006\u0010@\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u00132\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00130B2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bF\u0010GJC\u0010H\u001a\u0004\u0018\u0001022\u0006\u0010@\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u00132\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00130B2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bH\u0010IJC\u0010K\u001a\u0004\u0018\u0001082\u0006\u0010@\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u00132\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00130B2\u0006\u0010J\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bK\u0010IJ;\u0010L\u001a\u0004\u0018\u0001082\u0006\u0010A\u001a\u00020\u00132\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00130B2\u0006\u0010J\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ?\u0010P\u001a\b\u0012\u0004\u0012\u0002080\u00152\u0006\u0010O\u001a\u00020N2\u0006\u0010A\u001a\u00020\u00132\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00130B2\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bP\u0010QJK\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010@\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u00132\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00130B2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bS\u0010GJC\u0010V\u001a\u0004\u0018\u00010R2\u0006\u0010@\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u00132\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00130B2\u0006\u0010U\u001a\u00020T2\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ3\u0010X\u001a\u0004\u0018\u00010R2\u0006\u0010@\u001a\u00020\u00132\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00130B2\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ5\u0010]\u001a\u0004\u0018\u00010\u00132\u0006\u0010Z\u001a\u00020\u00132\u0006\u0010[\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\b]\u0010^J;\u0010`\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u00132\u0006\u0010_\u001a\u00020\u00132\u0006\u0010[\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\b`\u0010aJ\u001b\u0010c\u001a\u00020b2\u0006\u0010\u001e\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ%\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010f\u001a\u00020e2\u0006\u0010\u001e\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bh\u0010iJ%\u0010m\u001a\u0004\u0018\u00010l2\u0006\u0010k\u001a\u00020j2\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bm\u0010nJ%\u0010o\u001a\u0004\u0018\u00010l2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bo\u0010pJ#\u0010t\u001a\u00020s2\u0006\u0010r\u001a\u00020q2\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bt\u0010uJ#\u0010x\u001a\u00020w2\u0006\u0010v\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bx\u0010pJ\u001d\u0010z\u001a\u0004\u0018\u00010y2\u0006\u0010E\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0004\bz\u0010dJ\u0017\u0010}\u001a\u00020\u00132\u0006\u0010J\u001a\u00020\u0013H\u0001¢\u0006\u0004\b{\u0010|JL\u0010\u0001\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010*\u00020~2\b\u0010\u0001\u001a\u00030\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u0001H@ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J0\u0010\u0001\u001a\u00020\u00022\b\u0010\u0001\u001a\u00030\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u0001H@ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J9\u0010\u0001\u001a\u00020\u00022\b\u0010\u0001\u001a\u00030\u00012\u0017\u0010\u0001\u001a\u0012\u0012\u0007\u0012\u0005\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00040\u0001H@ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0011\u001a\u00020\u00042\b\u0010\u0001\u001a\u00030\u0001H\u0001¢\u0006\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018B@\u0002X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010¡\u0001\u001a\u00030 \u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010¤\u0001\u001a\u00030£\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001a\u0010§\u0001\u001a\u00030¦\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0017\u0010A\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0007\n\u0005\bA\u0010©\u0001R\u001c\u0010«\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010®\u0001\u001a\u00030­\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001a\u0010±\u0001\u001a\u00030°\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001a\u0010´\u0001\u001a\u00030³\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006À\u0001"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository;", "Lcom/stripe/android/networking/StripeRepository;", "Lcom/stripe/android/networking/StripeResponse;", "response", "Lm0/i;", "handleApiError", "(Lcom/stripe/android/networking/StripeResponse;)V", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "disableDnsCache", "()Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "dnsCacheData", "resetDnsCache", "(Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;)V", "fireFraudDetectionDataRequest", "()V", "Lcom/stripe/android/networking/AnalyticsEvent;", "event", "fireAnalyticsRequest", "(Lcom/stripe/android/networking/AnalyticsEvent;)V", "", "clientSecret", "", "expandFields", "", "", "createClientSecretParam", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmPaymentIntentParams", "Lcom/stripe/android/networking/ApiRequest$Options;", "options", "Lcom/stripe/android/model/PaymentIntent;", "confirmPaymentIntent", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lm0/l/c;)Ljava/lang/Object;", "retrievePaymentIntent", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lm0/l/c;)Ljava/lang/Object;", "paymentIntentId", "sourceId", "cancelPaymentIntentSource", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntentParams", "Lcom/stripe/android/model/SetupIntent;", "confirmSetupIntent", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lm0/l/c;)Ljava/lang/Object;", "retrieveSetupIntent", "setupIntentId", "cancelSetupIntentSource", "Lcom/stripe/android/model/SourceParams;", "sourceParams", "Lcom/stripe/android/model/Source;", "createSource", "(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "retrieveSource", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethod", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/TokenParams;", "tokenParams", "Lcom/stripe/android/model/Token;", "createToken", "(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "customerId", "publishableKey", "", "productUsageTokens", "sourceType", "requestOptions", "addCustomerSource", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "deleteCustomerSource", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "paymentMethodId", "attachPaymentMethod", "detachPaymentMethod", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/ListPaymentMethodsParams;", "listPaymentMethodsParams", "getPaymentMethods", "(Lcom/stripe/android/model/ListPaymentMethodsParams;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/Customer;", "setDefaultCustomerSource", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "setCustomerShippingInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "retrieveCustomer", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "cardId", "verificationId", "userOneTimeCode", "retrieveIssuingCardPin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "newPin", "updateIssuingCardPin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/BankStatuses;", "getFpxBankStatus", "(Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/cards/Bin;", "bin", "Lcom/stripe/android/model/CardMetadata;", "getCardMetadata", "(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/Stripe3ds2AuthParams;", "authParams", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "start3ds2Auth", "(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "complete3ds2Auth", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeFileParams;", "fileParams", "Lcom/stripe/android/model/StripeFile;", "createFile", "(Lcom/stripe/android/model/StripeFileParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "url", "Lorg/json/JSONObject;", "retrieveObject", "Lcom/stripe/android/model/RadarSession;", "createRadarSession", "getDetachPaymentMethodUrl$payments_core_release", "(Ljava/lang/String;)Ljava/lang/String;", "getDetachPaymentMethodUrl", "Lcom/stripe/android/model/StripeModel;", "ModelType", "Lcom/stripe/android/networking/ApiRequest;", "apiRequest", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "jsonParser", "Lkotlin/Function0;", "onResponse", "fetchStripeModel", "(Lcom/stripe/android/networking/ApiRequest;Lcom/stripe/android/model/parsers/ModelJsonParser;Lm0/n/a/a;Lm0/l/c;)Ljava/lang/Object;", "makeApiRequest$payments_core_release", "(Lcom/stripe/android/networking/ApiRequest;Lm0/n/a/a;Lm0/l/c;)Ljava/lang/Object;", "makeApiRequest", "Lcom/stripe/android/networking/FileUploadRequest;", "fileUploadRequest", "Lkotlin/Function1;", "Lcom/stripe/android/networking/RequestId;", "makeFileUploadRequest$payments_core_release", "(Lcom/stripe/android/networking/FileUploadRequest;Lm0/n/a/l;Lm0/l/c;)Ljava/lang/Object;", "makeFileUploadRequest", "Lcom/stripe/android/networking/AnalyticsRequest;", "params", "fireAnalyticsRequest$payments_core_release", "(Lcom/stripe/android/networking/AnalyticsRequest;)V", "Lcom/stripe/android/networking/ApiRequest$Factory;", "apiRequestFactory", "Lcom/stripe/android/networking/ApiRequest$Factory;", "Lcom/stripe/android/networking/ApiRequestExecutor;", "stripeApiRequestExecutor", "Lcom/stripe/android/networking/ApiRequestExecutor;", "Lcom/stripe/android/networking/FraudDetectionData;", "getFraudDetectionData", "()Lcom/stripe/android/networking/FraudDetectionData;", "fraudDetectionData", "Lcom/stripe/android/Logger;", "logger", "Lcom/stripe/android/Logger;", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "analyticsRequestFactory", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "Lcom/stripe/android/FraudDetectionDataRepository;", "fraudDetectionDataRepository", "Lcom/stripe/android/FraudDetectionDataRepository;", "Ljava/lang/String;", "Lcom/stripe/android/AppInfo;", "appInfo", "Lcom/stripe/android/AppInfo;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;", "fraudDetectionDataParamsUtils", "Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;", "Landroid/content/Context;", "context", "Lcom/stripe/android/StripeApiBeta;", "betas", "apiVersion", "sdkVersion", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/AppInfo;Lcom/stripe/android/Logger;Lm0/l/e;Lcom/stripe/android/networking/ApiRequestExecutor;Lcom/stripe/android/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/networking/AnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "DnsCacheData", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeApiRepository.kt */
public final class StripeApiRepository implements StripeRepository {
    public static final Companion Companion = new Companion((f) null);
    private static final String DNS_CACHE_TTL_PROPERTY_NAME = "networkaddress.cache.ttl";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    /* access modifiers changed from: private */
    public final AnalyticsRequestFactory analyticsRequestFactory;
    private final ApiRequest.Factory apiRequestFactory;
    private final AppInfo appInfo;
    private final FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils;
    private final FraudDetectionDataRepository fraudDetectionDataRepository;
    private final Logger logger;
    private final String publishableKey;
    private final ApiRequestExecutor stripeApiRequestExecutor;
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b1\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b>\u0010?J+\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\rJ/\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0018\u0010\rJ\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001b\u0010\rJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001d\u0010\rJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001f\u0010\rJ\u0017\u0010#\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\"\u0010\rJ\u001f\u0010'\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0001¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0001¢\u0006\u0004\b)\u0010\rJ\u0017\u0010,\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0001¢\u0006\u0004\b+\u0010\rJ\u0017\u0010.\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0001¢\u0006\u0004\b-\u0010\rJ\u0017\u00101\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0002H\u0001¢\u0006\u0004\b0\u0010\rJ\u0017\u00104\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0002H\u0001¢\u0006\u0004\b3\u0010\rR\u0016\u00107\u001a\u00020\u00028@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00028@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0016\u0010;\u001a\u00020\u00028@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0016\u0010<\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository$Companion;", "", "", "verificationId", "userOneTimeCode", "", "createVerificationParam", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "path", "", "args", "getApiUrl", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "getEdgeUrl", "", "expandFields", "createExpandParam", "(Ljava/util/List;)Ljava/util/Map;", "paymentIntentId", "getRetrievePaymentIntentUrl$payments_core_release", "getRetrievePaymentIntentUrl", "getConfirmPaymentIntentUrl$payments_core_release", "getConfirmPaymentIntentUrl", "getCancelPaymentIntentSourceUrl$payments_core_release", "getCancelPaymentIntentSourceUrl", "setupIntentId", "getRetrieveSetupIntentUrl$payments_core_release", "getRetrieveSetupIntentUrl", "getConfirmSetupIntentUrl$payments_core_release", "getConfirmSetupIntentUrl", "getCancelSetupIntentSourceUrl$payments_core_release", "getCancelSetupIntentSourceUrl", "customerId", "getAddCustomerSourceUrl$payments_core_release", "getAddCustomerSourceUrl", "sourceId", "getDeleteCustomerSourceUrl$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getDeleteCustomerSourceUrl", "paymentMethodId", "getAttachPaymentMethodUrl$payments_core_release", "getAttachPaymentMethodUrl", "getRetrieveCustomerUrl$payments_core_release", "getRetrieveCustomerUrl", "getRetrieveSourceApiUrl$payments_core_release", "getRetrieveSourceApiUrl", "tokenId", "getRetrieveTokenApiUrl$payments_core_release", "getRetrieveTokenApiUrl", "cardId", "getIssuingCardPinUrl$payments_core_release", "getIssuingCardPinUrl", "getSourcesUrl$payments_core_release", "()Ljava/lang/String;", "sourcesUrl", "getTokensUrl$payments_core_release", "tokensUrl", "getPaymentMethodsUrl$payments_core_release", "paymentMethodsUrl", "DNS_CACHE_TTL_PROPERTY_NAME", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeApiRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final Map<String, List<String>> createExpandParam(List<String> list) {
            Map<String, List<String>> map = null;
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                map = h.S2(new Pair("expand", list));
            }
            return map != null ? map : g.o();
        }

        /* access modifiers changed from: private */
        public final Map<String, String> createVerificationParam(String str, String str2) {
            return g.N(new Pair("id", str), new Pair("one_time_code", str2));
        }

        /* access modifiers changed from: private */
        public final String getApiUrl(String str, Object... objArr) {
            Locale locale = Locale.ENGLISH;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
            i.d(format, "java.lang.String.format(locale, format, *args)");
            return getApiUrl(format);
        }

        /* access modifiers changed from: private */
        public final String getEdgeUrl(String str) {
            return a.n0("https://api.stripe.com/edge-internal/", str);
        }

        public final /* synthetic */ String getAddCustomerSourceUrl$payments_core_release(String str) {
            i.e(str, "customerId");
            return getApiUrl("customers/%s/sources", str);
        }

        public final /* synthetic */ String getAttachPaymentMethodUrl$payments_core_release(String str) {
            i.e(str, "paymentMethodId");
            return getApiUrl("payment_methods/%s/attach", str);
        }

        public final /* synthetic */ String getCancelPaymentIntentSourceUrl$payments_core_release(String str) {
            i.e(str, "paymentIntentId");
            return getApiUrl("payment_intents/%s/source_cancel", str);
        }

        public final /* synthetic */ String getCancelSetupIntentSourceUrl$payments_core_release(String str) {
            i.e(str, "setupIntentId");
            return getApiUrl("setup_intents/%s/source_cancel", str);
        }

        public final /* synthetic */ String getConfirmPaymentIntentUrl$payments_core_release(String str) {
            i.e(str, "paymentIntentId");
            return getApiUrl("payment_intents/%s/confirm", str);
        }

        public final /* synthetic */ String getConfirmSetupIntentUrl$payments_core_release(String str) {
            i.e(str, "setupIntentId");
            return getApiUrl("setup_intents/%s/confirm", str);
        }

        public final /* synthetic */ String getDeleteCustomerSourceUrl$payments_core_release(String str, String str2) {
            i.e(str, "customerId");
            i.e(str2, "sourceId");
            return getApiUrl("customers/%s/sources/%s", str, str2);
        }

        public final /* synthetic */ String getIssuingCardPinUrl$payments_core_release(String str) {
            i.e(str, "cardId");
            return getApiUrl("issuing/cards/%s/pin", str);
        }

        public final /* synthetic */ String getPaymentMethodsUrl$payments_core_release() {
            return StripeApiRepository.Companion.getApiUrl("payment_methods");
        }

        public final /* synthetic */ String getRetrieveCustomerUrl$payments_core_release(String str) {
            i.e(str, "customerId");
            return getApiUrl("customers/%s", str);
        }

        public final /* synthetic */ String getRetrievePaymentIntentUrl$payments_core_release(String str) {
            i.e(str, "paymentIntentId");
            return getApiUrl("payment_intents/%s", str);
        }

        public final /* synthetic */ String getRetrieveSetupIntentUrl$payments_core_release(String str) {
            i.e(str, "setupIntentId");
            return getApiUrl("setup_intents/%s", str);
        }

        public final /* synthetic */ String getRetrieveSourceApiUrl$payments_core_release(String str) {
            i.e(str, "sourceId");
            return getApiUrl("sources/%s", str);
        }

        public final /* synthetic */ String getRetrieveTokenApiUrl$payments_core_release(String str) {
            i.e(str, "tokenId");
            return getApiUrl("tokens/%s", str);
        }

        public final /* synthetic */ String getSourcesUrl$payments_core_release() {
            return StripeApiRepository.Companion.getApiUrl("sources");
        }

        public final /* synthetic */ String getTokensUrl$payments_core_release() {
            return StripeApiRepository.Companion.getApiUrl("tokens");
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final String getApiUrl(String str) {
            return a.n0("https://api.stripe.com/v1/", str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "", "<init>", "()V", "Failure", "Success", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeApiRepository.kt */
    public static abstract class DnsCacheData {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeApiRepository.kt */
        public static final class Failure extends DnsCacheData {
            public static final Failure INSTANCE = new Failure();

            private Failure() {
                super((f) null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "", "component1", "()Ljava/lang/String;", "originalDnsCacheTtl", "copy", "(Ljava/lang/String;)Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOriginalDnsCacheTtl", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeApiRepository.kt */
        public static final class Success extends DnsCacheData {
            private final String originalDnsCacheTtl;

            public Success(String str) {
                super((f) null);
                this.originalDnsCacheTtl = str;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.originalDnsCacheTtl;
                }
                return success.copy(str);
            }

            public final String component1() {
                return this.originalDnsCacheTtl;
            }

            public final Success copy(String str) {
                return new Success(str);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof Success) && i.a(this.originalDnsCacheTtl, ((Success) obj).originalDnsCacheTtl);
                }
                return true;
            }

            public final String getOriginalDnsCacheTtl() {
                return this.originalDnsCacheTtl;
            }

            public int hashCode() {
                String str = this.originalDnsCacheTtl;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                return a.y0(a.P0("Success(originalDnsCacheTtl="), this.originalDnsCacheTtl, ")");
            }
        }

        private DnsCacheData() {
        }

        public /* synthetic */ DnsCacheData(f fVar) {
            this();
        }
    }

    public StripeApiRepository(Context context, String str) {
        this(context, str, (AppInfo) null, (Logger) null, (e) null, (ApiRequestExecutor) null, (AnalyticsRequestExecutor) null, (FraudDetectionDataRepository) null, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 8188, (f) null);
    }

    public StripeApiRepository(Context context, String str, AppInfo appInfo2) {
        this(context, str, appInfo2, (Logger) null, (e) null, (ApiRequestExecutor) null, (AnalyticsRequestExecutor) null, (FraudDetectionDataRepository) null, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 8184, (f) null);
    }

    public StripeApiRepository(Context context, String str, AppInfo appInfo2, Logger logger2) {
        this(context, str, appInfo2, logger2, (e) null, (ApiRequestExecutor) null, (AnalyticsRequestExecutor) null, (FraudDetectionDataRepository) null, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 8176, (f) null);
    }

    public StripeApiRepository(Context context, String str, AppInfo appInfo2, Logger logger2, e eVar) {
        this(context, str, appInfo2, logger2, eVar, (ApiRequestExecutor) null, (AnalyticsRequestExecutor) null, (FraudDetectionDataRepository) null, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 8160, (f) null);
    }

    public StripeApiRepository(Context context, String str, AppInfo appInfo2, Logger logger2, e eVar, ApiRequestExecutor apiRequestExecutor) {
        this(context, str, appInfo2, logger2, eVar, apiRequestExecutor, (AnalyticsRequestExecutor) null, (FraudDetectionDataRepository) null, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 8128, (f) null);
    }

    public StripeApiRepository(Context context, String str, AppInfo appInfo2, Logger logger2, e eVar, ApiRequestExecutor apiRequestExecutor, AnalyticsRequestExecutor analyticsRequestExecutor2) {
        this(context, str, appInfo2, logger2, eVar, apiRequestExecutor, analyticsRequestExecutor2, (FraudDetectionDataRepository) null, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 8064, (f) null);
    }

    public StripeApiRepository(Context context, String str, AppInfo appInfo2, Logger logger2, e eVar, ApiRequestExecutor apiRequestExecutor, AnalyticsRequestExecutor analyticsRequestExecutor2, FraudDetectionDataRepository fraudDetectionDataRepository2) {
        this(context, str, appInfo2, logger2, eVar, apiRequestExecutor, analyticsRequestExecutor2, fraudDetectionDataRepository2, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 7936, (f) null);
    }

    public StripeApiRepository(Context context, String str, AppInfo appInfo2, Logger logger2, e eVar, ApiRequestExecutor apiRequestExecutor, AnalyticsRequestExecutor analyticsRequestExecutor2, FraudDetectionDataRepository fraudDetectionDataRepository2, AnalyticsRequestFactory analyticsRequestFactory2) {
        this(context, str, appInfo2, logger2, eVar, apiRequestExecutor, analyticsRequestExecutor2, fraudDetectionDataRepository2, analyticsRequestFactory2, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 7680, (f) null);
    }

    public StripeApiRepository(Context context, String str, AppInfo appInfo2, Logger logger2, e eVar, ApiRequestExecutor apiRequestExecutor, AnalyticsRequestExecutor analyticsRequestExecutor2, FraudDetectionDataRepository fraudDetectionDataRepository2, AnalyticsRequestFactory analyticsRequestFactory2, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils2) {
        this(context, str, appInfo2, logger2, eVar, apiRequestExecutor, analyticsRequestExecutor2, fraudDetectionDataRepository2, analyticsRequestFactory2, fraudDetectionDataParamsUtils2, (Set) null, (String) null, (String) null, 7168, (f) null);
    }

    public StripeApiRepository(Context context, String str, AppInfo appInfo2, Logger logger2, e eVar, ApiRequestExecutor apiRequestExecutor, AnalyticsRequestExecutor analyticsRequestExecutor2, FraudDetectionDataRepository fraudDetectionDataRepository2, AnalyticsRequestFactory analyticsRequestFactory2, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils2, Set<? extends StripeApiBeta> set) {
        this(context, str, appInfo2, logger2, eVar, apiRequestExecutor, analyticsRequestExecutor2, fraudDetectionDataRepository2, analyticsRequestFactory2, fraudDetectionDataParamsUtils2, set, (String) null, (String) null, 6144, (f) null);
    }

    public StripeApiRepository(Context context, String str, AppInfo appInfo2, Logger logger2, e eVar, ApiRequestExecutor apiRequestExecutor, AnalyticsRequestExecutor analyticsRequestExecutor2, FraudDetectionDataRepository fraudDetectionDataRepository2, AnalyticsRequestFactory analyticsRequestFactory2, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils2, Set<? extends StripeApiBeta> set, String str2) {
        this(context, str, appInfo2, logger2, eVar, apiRequestExecutor, analyticsRequestExecutor2, fraudDetectionDataRepository2, analyticsRequestFactory2, fraudDetectionDataParamsUtils2, set, str2, (String) null, 4096, (f) null);
    }

    public StripeApiRepository(Context context, String str, AppInfo appInfo2, Logger logger2, e eVar, ApiRequestExecutor apiRequestExecutor, AnalyticsRequestExecutor analyticsRequestExecutor2, FraudDetectionDataRepository fraudDetectionDataRepository2, AnalyticsRequestFactory analyticsRequestFactory2, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils2, Set<? extends StripeApiBeta> set, String str2, String str3) {
        i.e(context, "context");
        i.e(str, "publishableKey");
        i.e(logger2, "logger");
        i.e(eVar, "workContext");
        i.e(apiRequestExecutor, "stripeApiRequestExecutor");
        i.e(analyticsRequestExecutor2, "analyticsRequestExecutor");
        i.e(fraudDetectionDataRepository2, "fraudDetectionDataRepository");
        i.e(analyticsRequestFactory2, "analyticsRequestFactory");
        i.e(fraudDetectionDataParamsUtils2, "fraudDetectionDataParamsUtils");
        i.e(set, "betas");
        i.e(str2, "apiVersion");
        i.e(str3, "sdkVersion");
        this.publishableKey = str;
        this.appInfo = appInfo2;
        this.logger = logger2;
        this.workContext = eVar;
        this.stripeApiRequestExecutor = apiRequestExecutor;
        this.analyticsRequestExecutor = analyticsRequestExecutor2;
        this.fraudDetectionDataRepository = fraudDetectionDataRepository2;
        this.analyticsRequestFactory = analyticsRequestFactory2;
        this.fraudDetectionDataParamsUtils = fraudDetectionDataParamsUtils2;
        this.apiRequestFactory = new ApiRequest.Factory(appInfo2, str2, str3);
        fireFraudDetectionDataRequest();
    }

    private final Map<String, Object> createClientSecretParam(String str, List<String> list) {
        return g.b0(h.S2(new Pair("client_secret", str)), Companion.createExpandParam(list));
    }

    private final DnsCacheData disableDnsCache() {
        Object obj;
        try {
            String property = Security.getProperty(DNS_CACHE_TTL_PROPERTY_NAME);
            Security.setProperty(DNS_CACHE_TTL_PROPERTY_NAME, "0");
            obj = new DnsCacheData.Success(property);
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Object obj2 = DnsCacheData.Failure.INSTANCE;
        if (obj instanceof Result.Failure) {
            obj = obj2;
        }
        return (DnsCacheData) obj;
    }

    /* access modifiers changed from: private */
    public final void fireAnalyticsRequest(AnalyticsEvent analyticsEvent) {
        fireAnalyticsRequest$payments_core_release(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, analyticsEvent, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
    }

    private final void fireFraudDetectionDataRequest() {
        this.fraudDetectionDataRepository.refresh();
    }

    private final FraudDetectionData getFraudDetectionData() {
        return this.fraudDetectionDataRepository.getCached();
    }

    private final void handleApiError(StripeResponse stripeResponse) throws InvalidRequestException, AuthenticationException, CardException, APIException {
        RequestId requestId$payments_core_release = stripeResponse.getRequestId$payments_core_release();
        String value = requestId$payments_core_release != null ? requestId$payments_core_release.getValue() : null;
        int code$payments_core_release = stripeResponse.getCode$payments_core_release();
        StripeError parse = new StripeErrorJsonParser().parse(stripeResponse.getResponseJson$payments_core_release());
        if (code$payments_core_release != 429) {
            switch (code$payments_core_release) {
                case RequestResponse.HttpStatusCode._4xx.BAD_REQUEST:
                case 404:
                    throw new InvalidRequestException(parse, value, code$payments_core_release, (String) null, (Throwable) null, 24, (f) null);
                case 401:
                    throw new AuthenticationException(parse, value);
                case 402:
                    throw new CardException(parse, value);
                case 403:
                    throw new PermissionException(parse, value);
                default:
                    throw new APIException(parse, value, code$payments_core_release, (String) null, (Throwable) null, 24, (f) null);
            }
        } else {
            throw new RateLimitException(parse, value, (String) null, (Throwable) null, 12, (f) null);
        }
    }

    private final void resetDnsCache(DnsCacheData dnsCacheData) {
        if (dnsCacheData instanceof DnsCacheData.Success) {
            String originalDnsCacheTtl = ((DnsCacheData.Success) dnsCacheData).getOriginalDnsCacheTtl();
            if (originalDnsCacheTtl == null) {
                originalDnsCacheTtl = "-1";
            }
            Security.setProperty(DNS_CACHE_TTL_PROPERTY_NAME, originalDnsCacheTtl);
        }
    }

    public Object addCustomerSource(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, c<? super Source> cVar) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        return fetchStripeModel(this.apiRequestFactory.createPost(Companion.getAddCustomerSourceUrl$payments_core_release(str), options, h.S2(new Pair(Stripe3ds2AuthParams.FIELD_SOURCE, str3))), new SourceJsonParser(), new StripeApiRepository$addCustomerSource$2(this, set, str4), cVar);
    }

    public Object attachPaymentMethod(String str, String str2, Set<String> set, String str3, ApiRequest.Options options, c<? super PaymentMethod> cVar) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        fireFraudDetectionDataRequest();
        return fetchStripeModel(this.apiRequestFactory.createPost(Companion.getAttachPaymentMethodUrl$payments_core_release(str3), options, h.S2(new Pair("customer", str))), new PaymentMethodJsonParser(), new StripeApiRepository$attachPaymentMethod$2(this, set), cVar);
    }

    public Object cancelPaymentIntentSource(String str, String str2, ApiRequest.Options options, c<? super PaymentIntent> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        fireFraudDetectionDataRequest();
        return fetchStripeModel(this.apiRequestFactory.createPost(Companion.getCancelPaymentIntentSourceUrl$payments_core_release(str), options, h.S2(new Pair(Stripe3ds2AuthParams.FIELD_SOURCE, str2))), new PaymentIntentJsonParser(), new StripeApiRepository$cancelPaymentIntentSource$2(this), cVar);
    }

    public Object cancelSetupIntentSource(String str, String str2, ApiRequest.Options options, c<? super SetupIntent> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        return fetchStripeModel(this.apiRequestFactory.createPost(Companion.getCancelSetupIntentSourceUrl$payments_core_release(str), options, h.S2(new Pair(Stripe3ds2AuthParams.FIELD_SOURCE, str2))), new SetupIntentJsonParser(), new StripeApiRepository$cancelSetupIntentSource$2(this), cVar);
    }

    public Object complete3ds2Auth(String str, ApiRequest.Options options, c<? super Stripe3ds2AuthResult> cVar) {
        return fetchStripeModel(this.apiRequestFactory.createPost(Companion.getApiUrl("3ds2/challenge_complete"), options, h.S2(new Pair(Stripe3ds2AuthParams.FIELD_SOURCE, str))), new Stripe3ds2AuthResultJsonParser(), StripeApiRepository$complete3ds2Auth$2.INSTANCE, cVar);
    }

    public Object confirmPaymentIntent(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List<String> list, c<? super PaymentIntent> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils2 = this.fraudDetectionDataParamsUtils;
        Map<String, Object> paramMap = confirmPaymentIntentParams.toParamMap();
        Companion companion = Companion;
        Map<String, ?> addFraudDetectionData$payments_core_release = fraudDetectionDataParamsUtils2.addFraudDetectionData$payments_core_release(g.b0(paramMap, companion.createExpandParam(list)), getFraudDetectionData());
        String confirmPaymentIntentUrl$payments_core_release = companion.getConfirmPaymentIntentUrl$payments_core_release(new PaymentIntent.ClientSecret(confirmPaymentIntentParams.getClientSecret()).getPaymentIntentId$payments_core_release());
        fireFraudDetectionDataRequest();
        return fetchStripeModel(this.apiRequestFactory.createPost(confirmPaymentIntentUrl$payments_core_release, options, addFraudDetectionData$payments_core_release), new PaymentIntentJsonParser(), new StripeApiRepository$confirmPaymentIntent$2(this, confirmPaymentIntentParams), cVar);
    }

    public Object confirmSetupIntent(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List<String> list, c<? super SetupIntent> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        String setupIntentId$payments_core_release = new SetupIntent.ClientSecret(confirmSetupIntentParams.getClientSecret()).getSetupIntentId$payments_core_release();
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion = Companion;
        return fetchStripeModel(factory.createPost(companion.getConfirmSetupIntentUrl$payments_core_release(setupIntentId$payments_core_release), options, this.fraudDetectionDataParamsUtils.addFraudDetectionData$payments_core_release(g.b0(confirmSetupIntentParams.toParamMap(), companion.createExpandParam(list)), getFraudDetectionData())), new SetupIntentJsonParser(), new StripeApiRepository$confirmSetupIntent$2(this, confirmSetupIntentParams), cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object createFile(com.stripe.android.model.StripeFileParams r13, com.stripe.android.networking.ApiRequest.Options r14, m0.l.c<? super com.stripe.android.model.StripeFile> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.StripeApiRepository$createFile$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.stripe.android.networking.StripeApiRepository$createFile$1 r0 = (com.stripe.android.networking.StripeApiRepository$createFile$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.networking.StripeApiRepository$createFile$1 r0 = new com.stripe.android.networking.StripeApiRepository$createFile$1
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r15)
            goto L_0x004f
        L_0x0027:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x002f:
            i0.j.f.p.h.d4(r15)
            com.stripe.android.networking.FileUploadRequest r15 = new com.stripe.android.networking.FileUploadRequest
            com.stripe.android.AppInfo r7 = r12.appInfo
            r8 = 0
            r9 = 0
            r10 = 24
            r11 = 0
            r4 = r15
            r5 = r13
            r6 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            com.stripe.android.networking.StripeApiRepository$createFile$response$1 r13 = new com.stripe.android.networking.StripeApiRepository$createFile$response$1
            r13.<init>(r12)
            r0.label = r3
            java.lang.Object r15 = r12.makeFileUploadRequest$payments_core_release(r15, r13, r0)
            if (r15 != r1) goto L_0x004f
            return r1
        L_0x004f:
            com.stripe.android.networking.StripeResponse r15 = (com.stripe.android.networking.StripeResponse) r15
            com.stripe.android.model.parsers.StripeFileJsonParser r13 = new com.stripe.android.model.parsers.StripeFileJsonParser
            r13.<init>()
            org.json.JSONObject r14 = r15.getResponseJson$payments_core_release()
            com.stripe.android.model.StripeFile r13 = r13.parse((org.json.JSONObject) r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.createFile(com.stripe.android.model.StripeFileParams, com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    public Object createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, ApiRequest.Options options, c<? super PaymentMethod> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String paymentMethodsUrl$payments_core_release = Companion.getPaymentMethodsUrl$payments_core_release();
        Map<String, Object> paramMap = paymentMethodCreateParams.toParamMap();
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        Map<String, String> params = fraudDetectionData != null ? fraudDetectionData.getParams() : null;
        if (params == null) {
            params = g.o();
        }
        return fetchStripeModel(factory.createPost(paymentMethodsUrl$payments_core_release, options, g.b0(paramMap, params)), new PaymentMethodJsonParser(), new StripeApiRepository$createPaymentMethod$2(this, paymentMethodCreateParams), cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e A[SYNTHETIC, Splitter:B:26:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061 A[Catch:{ all -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object createRadarSession(com.stripe.android.networking.ApiRequest.Options r8, m0.l.c<? super com.stripe.android.model.RadarSession> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.stripe.android.networking.StripeApiRepository$createRadarSession$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.stripe.android.networking.StripeApiRepository$createRadarSession$1 r0 = (com.stripe.android.networking.StripeApiRepository$createRadarSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.networking.StripeApiRepository$createRadarSession$1 r0 = new com.stripe.android.networking.StripeApiRepository$createRadarSession$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            i0.j.f.p.h.d4(r9)
            goto L_0x00c1
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            java.lang.Object r8 = r0.L$1
            com.stripe.android.networking.ApiRequest$Options r8 = (com.stripe.android.networking.ApiRequest.Options) r8
            java.lang.Object r2 = r0.L$0
            com.stripe.android.networking.StripeApiRepository r2 = (com.stripe.android.networking.StripeApiRepository) r2
            i0.j.f.p.h.d4(r9)     // Catch:{ all -> 0x003f }
            goto L_0x005c
        L_0x003f:
            r9 = move-exception
            goto L_0x007b
        L_0x0041:
            i0.j.f.p.h.d4(r9)
            com.stripe.android.Stripe$Companion r9 = com.stripe.android.Stripe.Companion     // Catch:{ all -> 0x0079 }
            boolean r9 = r9.getAdvancedFraudSignalsEnabled()     // Catch:{ all -> 0x0079 }
            if (r9 == 0) goto L_0x006d
            com.stripe.android.FraudDetectionDataRepository r9 = r7.fraudDetectionDataRepository     // Catch:{ all -> 0x0079 }
            r0.L$0 = r7     // Catch:{ all -> 0x0079 }
            r0.L$1 = r8     // Catch:{ all -> 0x0079 }
            r0.label = r4     // Catch:{ all -> 0x0079 }
            java.lang.Object r9 = r9.getLatest(r0)     // Catch:{ all -> 0x0079 }
            if (r9 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r2 = r7
        L_0x005c:
            if (r9 == 0) goto L_0x0061
            com.stripe.android.networking.FraudDetectionData r9 = (com.stripe.android.networking.FraudDetectionData) r9     // Catch:{ all -> 0x003f }
            goto L_0x007f
        L_0x0061:
            java.lang.String r9 = "Could not obtain fraud data required to create a Radar Session."
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x003f }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x003f }
            r5.<init>(r9)     // Catch:{ all -> 0x003f }
            throw r5     // Catch:{ all -> 0x003f }
        L_0x006d:
            java.lang.String r9 = "Stripe.advancedFraudSignalsEnabled must be set to 'true' to create a Radar Session."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0079 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0079 }
            r2.<init>(r9)     // Catch:{ all -> 0x0079 }
            throw r2     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r9 = move-exception
            r2 = r7
        L_0x007b:
            java.lang.Object r9 = i0.j.f.p.h.l0(r9)
        L_0x007f:
            boolean r5 = r9 instanceof kotlin.Result.Failure
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x00c3
            com.stripe.android.networking.FraudDetectionData r9 = (com.stripe.android.networking.FraudDetectionData) r9
            java.util.Map r9 = r9.getParams()
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r5 = "payment_user_agent"
            java.lang.String r6 = "stripe-android/16.10.0"
            r4.<init>(r5, r6)
            java.util.Map r4 = i0.j.f.p.h.S2(r4)
            java.util.Map r9 = m0.j.g.b0(r9, r4)
            com.stripe.android.networking.ApiRequest$Factory r4 = r2.apiRequestFactory
            com.stripe.android.networking.StripeApiRepository$Companion r5 = Companion
            java.lang.String r6 = "radar/session"
            java.lang.String r5 = r5.getApiUrl(r6)
            com.stripe.android.networking.ApiRequest r9 = r4.createPost(r5, r8, r9)
            com.stripe.android.model.parsers.RadarSessionJsonParser r4 = new com.stripe.android.model.parsers.RadarSessionJsonParser
            r4.<init>()
            com.stripe.android.networking.StripeApiRepository$createRadarSession$$inlined$map$lambda$1 r5 = new com.stripe.android.networking.StripeApiRepository$createRadarSession$$inlined$map$lambda$1
            r5.<init>(r2, r0, r8)
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r2.fetchStripeModel(r9, r4, r5, r0)
            if (r9 != r1) goto L_0x00c1
            return r1
        L_0x00c1:
            com.stripe.android.model.RadarSession r9 = (com.stripe.android.model.RadarSession) r9
        L_0x00c3:
            java.lang.Throwable r8 = kotlin.Result.a(r9)
            if (r8 != 0) goto L_0x00ca
            return r9
        L_0x00ca:
            com.stripe.android.exception.StripeException$Companion r9 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r8 = r9.create(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.createRadarSession(com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    public Object createSource(SourceParams sourceParams, ApiRequest.Options options, c<? super Source> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String sourcesUrl$payments_core_release = Companion.getSourcesUrl$payments_core_release();
        Map<String, Object> paramMap = sourceParams.toParamMap();
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        Map<String, String> params = fraudDetectionData != null ? fraudDetectionData.getParams() : null;
        if (params == null) {
            params = g.o();
        }
        return fetchStripeModel(factory.createPost(sourcesUrl$payments_core_release, options, g.b0(paramMap, params)), new SourceJsonParser(), new StripeApiRepository$createSource$2(this, sourceParams), cVar);
    }

    public Object createToken(TokenParams tokenParams, ApiRequest.Options options, c<? super Token> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String tokensUrl$payments_core_release = Companion.getTokensUrl$payments_core_release();
        Map<String, Object> paramMap = tokenParams.toParamMap();
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        Map<String, String> params = fraudDetectionData != null ? fraudDetectionData.getParams() : null;
        if (params == null) {
            params = g.o();
        }
        return fetchStripeModel(factory.createPost(tokensUrl$payments_core_release, options, g.b0(paramMap, params)), new TokenJsonParser(), new StripeApiRepository$createToken$2(this, tokenParams), cVar);
    }

    public Object deleteCustomerSource(String str, String str2, Set<String> set, String str3, ApiRequest.Options options, c<? super Source> cVar) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        return fetchStripeModel(this.apiRequestFactory.createDelete(Companion.getDeleteCustomerSourceUrl$payments_core_release(str, str3), options), new SourceJsonParser(), new StripeApiRepository$deleteCustomerSource$2(this, set), cVar);
    }

    public Object detachPaymentMethod(String str, Set<String> set, String str2, ApiRequest.Options options, c<? super PaymentMethod> cVar) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        return fetchStripeModel(ApiRequest.Factory.createPost$default(this.apiRequestFactory, getDetachPaymentMethodUrl$payments_core_release(str2), options, (Map) null, 4, (Object) null), new PaymentMethodJsonParser(), new StripeApiRepository$detachPaymentMethod$2(this, set), cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.stripe.android.model.parsers.ModelJsonParser<? extends ModelType>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <ModelType extends com.stripe.android.model.StripeModel> java.lang.Object fetchStripeModel(com.stripe.android.networking.ApiRequest r5, com.stripe.android.model.parsers.ModelJsonParser<? extends ModelType> r6, m0.n.a.a<m0.i> r7, m0.l.c<? super ModelType> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.stripe.android.networking.StripeApiRepository$fetchStripeModel$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.networking.StripeApiRepository$fetchStripeModel$1 r0 = (com.stripe.android.networking.StripeApiRepository$fetchStripeModel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.networking.StripeApiRepository$fetchStripeModel$1 r0 = new com.stripe.android.networking.StripeApiRepository$fetchStripeModel$1
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r5 = r0.L$0
            r6 = r5
            com.stripe.android.model.parsers.ModelJsonParser r6 = (com.stripe.android.model.parsers.ModelJsonParser) r6
            i0.j.f.p.h.d4(r8)
            goto L_0x0042
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            i0.j.f.p.h.d4(r8)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r4.makeApiRequest$payments_core_release(r5, r7, r0)
            if (r8 != r1) goto L_0x0042
            return r1
        L_0x0042:
            com.stripe.android.networking.StripeResponse r8 = (com.stripe.android.networking.StripeResponse) r8
            org.json.JSONObject r5 = r8.getResponseJson$payments_core_release()
            com.stripe.android.model.StripeModel r5 = r6.parse(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.fetchStripeModel(com.stripe.android.networking.ApiRequest, com.stripe.android.model.parsers.ModelJsonParser, m0.n.a.a, m0.l.c):java.lang.Object");
    }

    public final void fireAnalyticsRequest$payments_core_release(AnalyticsRequest analyticsRequest) {
        i.e(analyticsRequest, "params");
        this.analyticsRequestExecutor.executeAsync(analyticsRequest);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getCardMetadata(com.stripe.android.cards.Bin r11, com.stripe.android.networking.ApiRequest.Options r12, m0.l.c<? super com.stripe.android.model.CardMetadata> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.stripe.android.networking.StripeApiRepository$getCardMetadata$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.stripe.android.networking.StripeApiRepository$getCardMetadata$1 r0 = (com.stripe.android.networking.StripeApiRepository$getCardMetadata$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.networking.StripeApiRepository$getCardMetadata$1 r0 = new com.stripe.android.networking.StripeApiRepository$getCardMetadata$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r11 = r0.L$0
            com.stripe.android.networking.StripeApiRepository r11 = (com.stripe.android.networking.StripeApiRepository) r11
            i0.j.f.p.h.d4(r13)     // Catch:{ all -> 0x002b }
            goto L_0x0085
        L_0x002b:
            r12 = move-exception
            goto L_0x0090
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0035:
            i0.j.f.p.h.d4(r13)
            com.stripe.android.networking.ApiRequest$Factory r13 = r10.apiRequestFactory     // Catch:{ all -> 0x008e }
            com.stripe.android.networking.StripeApiRepository$Companion r2 = Companion     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "card-metadata"
            java.lang.String r2 = r2.getEdgeUrl(r4)     // Catch:{ all -> 0x008e }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 5
            r9 = 0
            r4 = r12
            com.stripe.android.networking.ApiRequest$Options r4 = com.stripe.android.networking.ApiRequest.Options.copy$default(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x008e }
            r5 = 2
            kotlin.Pair[] r5 = new kotlin.Pair[r5]     // Catch:{ all -> 0x008e }
            r6 = 0
            java.lang.String r7 = "key"
            java.lang.String r12 = r12.getApiKey()     // Catch:{ all -> 0x008e }
            kotlin.Pair r8 = new kotlin.Pair     // Catch:{ all -> 0x008c }
            r8.<init>(r7, r12)     // Catch:{ all -> 0x008c }
            r5[r6] = r8     // Catch:{ all -> 0x008e }
            java.lang.String r12 = "bin_prefix"
            java.lang.String r6 = r11.getValue$payments_core_release()     // Catch:{ all -> 0x008e }
            kotlin.Pair r7 = new kotlin.Pair     // Catch:{ all -> 0x008a }
            r7.<init>(r12, r6)     // Catch:{ all -> 0x008a }
            r5[r3] = r7     // Catch:{ all -> 0x008e }
            java.util.Map r12 = m0.j.g.N(r5)     // Catch:{ all -> 0x008e }
            com.stripe.android.networking.ApiRequest r12 = r13.createGet(r2, r4, r12)     // Catch:{ all -> 0x008e }
            com.stripe.android.model.parsers.CardMetadataJsonParser r13 = new com.stripe.android.model.parsers.CardMetadataJsonParser     // Catch:{ all -> 0x008e }
            r13.<init>(r11)     // Catch:{ all -> 0x008e }
            com.stripe.android.networking.StripeApiRepository$getCardMetadata$2$1 r11 = com.stripe.android.networking.StripeApiRepository$getCardMetadata$2$1.INSTANCE     // Catch:{ all -> 0x008e }
            r0.L$0 = r10     // Catch:{ all -> 0x008e }
            r0.label = r3     // Catch:{ all -> 0x008e }
            java.lang.Object r13 = r10.fetchStripeModel(r12, r13, r11, r0)     // Catch:{ all -> 0x008e }
            if (r13 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r11 = r10
        L_0x0085:
            com.stripe.android.model.CardMetadata r13 = (com.stripe.android.model.CardMetadata) r13     // Catch:{ all -> 0x002b }
            goto L_0x0094
        L_0x0088:
            r12 = r11
            goto L_0x008f
        L_0x008a:
            r11 = move-exception
            goto L_0x0088
        L_0x008c:
            r11 = move-exception
            goto L_0x0088
        L_0x008e:
            r12 = move-exception
        L_0x008f:
            r11 = r10
        L_0x0090:
            java.lang.Object r13 = i0.j.f.p.h.l0(r12)
        L_0x0094:
            java.lang.Throwable r12 = kotlin.Result.a(r13)
            if (r12 == 0) goto L_0x009f
            com.stripe.android.networking.AnalyticsEvent r12 = com.stripe.android.networking.AnalyticsEvent.CardMetadataLoadFailure
            r11.fireAnalyticsRequest(r12)
        L_0x009f:
            boolean r11 = r13 instanceof kotlin.Result.Failure
            if (r11 == 0) goto L_0x00a4
            r13 = 0
        L_0x00a4:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.getCardMetadata(com.stripe.android.cards.Bin, com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    public final String getDetachPaymentMethodUrl$payments_core_release(String str) {
        i.e(str, "paymentMethodId");
        return Companion.getApiUrl("payment_methods/%s/detach", str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getFpxBankStatus(com.stripe.android.networking.ApiRequest.Options r11, m0.l.c<? super com.stripe.android.model.BankStatuses> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$1 r0 = (com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$1 r0 = new com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r12)     // Catch:{ all -> 0x0027 }
            goto L_0x006c
        L_0x0027:
            r11 = move-exception
            goto L_0x007d
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0031:
            i0.j.f.p.h.d4(r12)
            com.stripe.android.networking.ApiRequest$Factory r12 = r10.apiRequestFactory     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.StripeApiRepository$Companion r2 = Companion     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = "fpx/bank_statuses"
            java.lang.String r2 = r2.getApiUrl(r4)     // Catch:{ all -> 0x0027 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 5
            r9 = 0
            r4 = r11
            com.stripe.android.networking.ApiRequest$Options r11 = com.stripe.android.networking.ApiRequest.Options.copy$default(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = "account_holder_type"
            java.lang.String r5 = "individual"
            kotlin.Pair r6 = new kotlin.Pair     // Catch:{ all -> 0x0027 }
            r6.<init>(r4, r5)     // Catch:{ all -> 0x0027 }
            java.util.Map r4 = i0.j.f.p.h.S2(r6)     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest r11 = r12.createGet(r2, r11, r4)     // Catch:{ all -> 0x0027 }
            com.stripe.android.model.parsers.FpxBankStatusesJsonParser r12 = new com.stripe.android.model.parsers.FpxBankStatusesJsonParser     // Catch:{ all -> 0x0027 }
            r12.<init>()     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$2$fpxBankStatuses$1 r2 = new com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$2$fpxBankStatuses$1     // Catch:{ all -> 0x0027 }
            r2.<init>(r10)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r12 = r10.fetchStripeModel(r11, r12, r2, r0)     // Catch:{ all -> 0x0027 }
            if (r12 != r1) goto L_0x006c
            return r1
        L_0x006c:
            com.stripe.android.model.BankStatuses r12 = (com.stripe.android.model.BankStatuses) r12     // Catch:{ all -> 0x0027 }
            if (r12 == 0) goto L_0x0071
            goto L_0x0081
        L_0x0071:
            java.lang.String r11 = "Required value was null."
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0027 }
            r12.<init>(r11)     // Catch:{ all -> 0x0027 }
            throw r12     // Catch:{ all -> 0x0027 }
        L_0x007d:
            java.lang.Object r12 = i0.j.f.p.h.l0(r11)
        L_0x0081:
            com.stripe.android.model.BankStatuses r11 = new com.stripe.android.model.BankStatuses
            r0 = 0
            r11.<init>(r0, r3, r0)
            boolean r0 = r12 instanceof kotlin.Result.Failure
            if (r0 == 0) goto L_0x008c
            r12 = r11
        L_0x008c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.getFpxBankStatus(com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getPaymentMethods(com.stripe.android.model.ListPaymentMethodsParams r4, java.lang.String r5, java.util.Set<java.lang.String> r6, com.stripe.android.networking.ApiRequest.Options r7, m0.l.c<? super java.util.List<com.stripe.android.model.PaymentMethod>> r8) throws com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException, com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.CardException {
        /*
            r3 = this;
            boolean r5 = r8 instanceof com.stripe.android.networking.StripeApiRepository$getPaymentMethods$1
            if (r5 == 0) goto L_0x0013
            r5 = r8
            com.stripe.android.networking.StripeApiRepository$getPaymentMethods$1 r5 = (com.stripe.android.networking.StripeApiRepository$getPaymentMethods$1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r5.label = r0
            goto L_0x0018
        L_0x0013:
            com.stripe.android.networking.StripeApiRepository$getPaymentMethods$1 r5 = new com.stripe.android.networking.StripeApiRepository$getPaymentMethods$1
            r5.<init>(r3, r8)
        L_0x0018:
            java.lang.Object r8 = r5.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 != r2) goto L_0x0027
            i0.j.f.p.h.d4(r8)
            goto L_0x0055
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.networking.ApiRequest$Factory r8 = r3.apiRequestFactory
            com.stripe.android.networking.StripeApiRepository$Companion r1 = Companion
            java.lang.String r1 = r1.getPaymentMethodsUrl$payments_core_release()
            java.util.Map r4 = r4.toParamMap()
            com.stripe.android.networking.ApiRequest r4 = r8.createGet(r1, r7, r4)
            com.stripe.android.model.parsers.PaymentMethodsListJsonParser r7 = new com.stripe.android.model.parsers.PaymentMethodsListJsonParser
            r7.<init>()
            com.stripe.android.networking.StripeApiRepository$getPaymentMethods$paymentMethodsList$1 r8 = new com.stripe.android.networking.StripeApiRepository$getPaymentMethods$paymentMethodsList$1
            r8.<init>(r3, r6)
            r5.label = r2
            java.lang.Object r8 = r3.fetchStripeModel(r4, r7, r8, r5)
            if (r8 != r0) goto L_0x0055
            return r0
        L_0x0055:
            com.stripe.android.model.PaymentMethodsList r8 = (com.stripe.android.model.PaymentMethodsList) r8
            if (r8 == 0) goto L_0x005e
            java.util.List r4 = r8.getPaymentMethods()
            goto L_0x005f
        L_0x005e:
            r4 = 0
        L_0x005f:
            if (r4 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.c
        L_0x0064:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.getPaymentMethods(com.stripe.android.model.ListPaymentMethodsParams, java.lang.String, java.util.Set, com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object makeApiRequest$payments_core_release(com.stripe.android.networking.ApiRequest r6, m0.n.a.a<m0.i> r7, m0.l.c<? super com.stripe.android.networking.StripeResponse> r8) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.networking.StripeApiRepository$makeApiRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.networking.StripeApiRepository$makeApiRequest$1 r0 = (com.stripe.android.networking.StripeApiRepository$makeApiRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.networking.StripeApiRepository$makeApiRequest$1 r0 = new com.stripe.android.networking.StripeApiRepository$makeApiRequest$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 != r3) goto L_0x0043
            java.lang.Object r6 = r0.L$3
            com.stripe.android.networking.StripeApiRepository$DnsCacheData r6 = (com.stripe.android.networking.StripeApiRepository.DnsCacheData) r6
            java.lang.Object r7 = r0.L$2
            m0.n.a.a r7 = (m0.n.a.a) r7
            java.lang.Object r1 = r0.L$1
            com.stripe.android.networking.ApiRequest r1 = (com.stripe.android.networking.ApiRequest) r1
            java.lang.Object r0 = r0.L$0
            com.stripe.android.networking.StripeApiRepository r0 = (com.stripe.android.networking.StripeApiRepository) r0
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x003c }
            r4 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L_0x0066
        L_0x003c:
            r8 = move-exception
            r4 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L_0x006d
        L_0x0043:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x004b:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.networking.StripeApiRepository$DnsCacheData r8 = r5.disableDnsCache()
            com.stripe.android.networking.ApiRequestExecutor r2 = r5.stripeApiRequestExecutor     // Catch:{ all -> 0x006b }
            r0.L$0 = r5     // Catch:{ all -> 0x006b }
            r0.L$1 = r6     // Catch:{ all -> 0x006b }
            r0.L$2 = r7     // Catch:{ all -> 0x006b }
            r0.L$3 = r8     // Catch:{ all -> 0x006b }
            r0.label = r3     // Catch:{ all -> 0x006b }
            java.lang.Object r0 = r2.execute((com.stripe.android.networking.ApiRequest) r6, (m0.l.c<? super com.stripe.android.networking.StripeResponse>) r0)     // Catch:{ all -> 0x006b }
            if (r0 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r1 = r5
        L_0x0066:
            com.stripe.android.networking.StripeResponse r0 = (com.stripe.android.networking.StripeResponse) r0     // Catch:{ all -> 0x0069 }
            goto L_0x0071
        L_0x0069:
            r0 = move-exception
            goto L_0x006d
        L_0x006b:
            r0 = move-exception
            r1 = r5
        L_0x006d:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x0071:
            r7.invoke()
            java.lang.Throwable r7 = kotlin.Result.a(r0)
            if (r7 != 0) goto L_0x0089
            com.stripe.android.networking.StripeResponse r0 = (com.stripe.android.networking.StripeResponse) r0
            boolean r6 = r0.isError$payments_core_release()
            if (r6 == 0) goto L_0x0085
            r1.handleApiError(r0)
        L_0x0085:
            r1.resetDnsCache(r8)
            return r0
        L_0x0089:
            boolean r8 = r7 instanceof java.io.IOException
            if (r8 == 0) goto L_0x0099
            com.stripe.android.exception.APIConnectionException$Companion r8 = com.stripe.android.exception.APIConnectionException.Companion
            java.io.IOException r7 = (java.io.IOException) r7
            java.lang.String r6 = r6.getBaseUrl()
            com.stripe.android.exception.APIConnectionException r7 = r8.create$payments_core_release(r7, r6)
        L_0x0099:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.makeApiRequest$payments_core_release(com.stripe.android.networking.ApiRequest, m0.n.a.a, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object makeFileUploadRequest$payments_core_release(com.stripe.android.networking.FileUploadRequest r6, m0.n.a.l<? super com.stripe.android.networking.RequestId, m0.i> r7, m0.l.c<? super com.stripe.android.networking.StripeResponse> r8) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.CardException, com.stripe.android.exception.APIException {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.networking.StripeApiRepository$makeFileUploadRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.networking.StripeApiRepository$makeFileUploadRequest$1 r0 = (com.stripe.android.networking.StripeApiRepository$makeFileUploadRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.networking.StripeApiRepository$makeFileUploadRequest$1 r0 = new com.stripe.android.networking.StripeApiRepository$makeFileUploadRequest$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 != r3) goto L_0x0043
            java.lang.Object r6 = r0.L$3
            com.stripe.android.networking.StripeApiRepository$DnsCacheData r6 = (com.stripe.android.networking.StripeApiRepository.DnsCacheData) r6
            java.lang.Object r7 = r0.L$2
            m0.n.a.l r7 = (m0.n.a.l) r7
            java.lang.Object r1 = r0.L$1
            com.stripe.android.networking.FileUploadRequest r1 = (com.stripe.android.networking.FileUploadRequest) r1
            java.lang.Object r0 = r0.L$0
            com.stripe.android.networking.StripeApiRepository r0 = (com.stripe.android.networking.StripeApiRepository) r0
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x003c }
            r4 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L_0x0066
        L_0x003c:
            r8 = move-exception
            r4 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L_0x006d
        L_0x0043:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x004b:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.networking.StripeApiRepository$DnsCacheData r8 = r5.disableDnsCache()
            com.stripe.android.networking.ApiRequestExecutor r2 = r5.stripeApiRequestExecutor     // Catch:{ all -> 0x006b }
            r0.L$0 = r5     // Catch:{ all -> 0x006b }
            r0.L$1 = r6     // Catch:{ all -> 0x006b }
            r0.L$2 = r7     // Catch:{ all -> 0x006b }
            r0.L$3 = r8     // Catch:{ all -> 0x006b }
            r0.label = r3     // Catch:{ all -> 0x006b }
            java.lang.Object r0 = r2.execute((com.stripe.android.networking.FileUploadRequest) r6, (m0.l.c<? super com.stripe.android.networking.StripeResponse>) r0)     // Catch:{ all -> 0x006b }
            if (r0 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r1 = r5
        L_0x0066:
            com.stripe.android.networking.StripeResponse r0 = (com.stripe.android.networking.StripeResponse) r0     // Catch:{ all -> 0x0069 }
            goto L_0x0071
        L_0x0069:
            r0 = move-exception
            goto L_0x006d
        L_0x006b:
            r0 = move-exception
            r1 = r5
        L_0x006d:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x0071:
            boolean r2 = r0 instanceof kotlin.Result.Failure
            r3 = 0
            if (r2 == 0) goto L_0x0078
            r2 = r3
            goto L_0x0079
        L_0x0078:
            r2 = r0
        L_0x0079:
            com.stripe.android.networking.StripeResponse r2 = (com.stripe.android.networking.StripeResponse) r2
            if (r2 == 0) goto L_0x0081
            com.stripe.android.networking.RequestId r3 = r2.getRequestId$payments_core_release()
        L_0x0081:
            r7.invoke(r3)
            java.lang.Throwable r7 = kotlin.Result.a(r0)
            if (r7 != 0) goto L_0x0099
            com.stripe.android.networking.StripeResponse r0 = (com.stripe.android.networking.StripeResponse) r0
            boolean r6 = r0.isError$payments_core_release()
            if (r6 == 0) goto L_0x0095
            r1.handleApiError(r0)
        L_0x0095:
            r1.resetDnsCache(r8)
            return r0
        L_0x0099:
            boolean r8 = r7 instanceof java.io.IOException
            if (r8 == 0) goto L_0x00a9
            com.stripe.android.exception.APIConnectionException$Companion r8 = com.stripe.android.exception.APIConnectionException.Companion
            java.io.IOException r7 = (java.io.IOException) r7
            java.lang.String r6 = r6.getBaseUrl()
            com.stripe.android.exception.APIConnectionException r7 = r8.create$payments_core_release(r7, r6)
        L_0x00a9:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.makeFileUploadRequest$payments_core_release(com.stripe.android.networking.FileUploadRequest, m0.n.a.l, m0.l.c):java.lang.Object");
    }

    public Object retrieveCustomer(String str, Set<String> set, ApiRequest.Options options, c<? super Customer> cVar) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        return fetchStripeModel(ApiRequest.Factory.createGet$default(this.apiRequestFactory, Companion.getRetrieveCustomerUrl$payments_core_release(str), options, (Map) null, 4, (Object) null), new CustomerJsonParser(), new StripeApiRepository$retrieveCustomer$2(this, set), cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object retrieveIssuingCardPin(java.lang.String r5, java.lang.String r6, java.lang.String r7, com.stripe.android.networking.ApiRequest.Options r8, m0.l.c<? super java.lang.String> r9) throws com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException, com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.CardException, org.json.JSONException {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$1 r0 = (com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$1 r0 = new com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$1
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r9)
            goto L_0x0060
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r9)
            com.stripe.android.networking.ApiRequest$Factory r9 = r4.apiRequestFactory
            com.stripe.android.networking.StripeApiRepository$Companion r2 = Companion
            java.lang.String r5 = r2.getIssuingCardPinUrl$payments_core_release(r5)
            java.util.Map r6 = r2.createVerificationParam(r6, r7)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r2 = "verification"
            r7.<init>(r2, r6)
            java.util.Map r6 = i0.j.f.p.h.S2(r7)
            com.stripe.android.networking.ApiRequest r5 = r9.createGet(r5, r8, r6)
            com.stripe.android.model.parsers.IssuingCardPinJsonParser r6 = new com.stripe.android.model.parsers.IssuingCardPinJsonParser
            r6.<init>()
            com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$issuingCardPin$1 r7 = new com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$issuingCardPin$1
            r7.<init>(r4)
            r0.label = r3
            java.lang.Object r9 = r4.fetchStripeModel(r5, r6, r7, r0)
            if (r9 != r1) goto L_0x0060
            return r1
        L_0x0060:
            com.stripe.android.model.IssuingCardPin r9 = (com.stripe.android.model.IssuingCardPin) r9
            if (r9 == 0) goto L_0x0069
            java.lang.String r5 = r9.getPin()
            goto L_0x006a
        L_0x0069:
            r5 = 0
        L_0x006a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.retrieveIssuingCardPin(java.lang.String, java.lang.String, java.lang.String, com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object retrieveObject(java.lang.String r11, com.stripe.android.networking.ApiRequest.Options r12, m0.l.c<? super org.json.JSONObject> r13) throws java.lang.IllegalArgumentException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException, com.stripe.android.exception.CardException, com.stripe.android.exception.AuthenticationException {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.stripe.android.networking.StripeApiRepository$retrieveObject$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.stripe.android.networking.StripeApiRepository$retrieveObject$1 r0 = (com.stripe.android.networking.StripeApiRepository$retrieveObject$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.networking.StripeApiRepository$retrieveObject$1 r0 = new com.stripe.android.networking.StripeApiRepository$retrieveObject$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r13)
            goto L_0x0053
        L_0x0027:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002f:
            i0.j.f.p.h.d4(r13)
            com.stripe.android.utils.StripeUrlUtils r13 = com.stripe.android.utils.StripeUrlUtils.INSTANCE
            boolean r13 = r13.isStripeUrl$payments_core_release(r11)
            if (r13 == 0) goto L_0x005a
            com.stripe.android.networking.ApiRequest$Factory r4 = r10.apiRequestFactory
            r7 = 0
            r8 = 4
            r9 = 0
            r5 = r11
            r6 = r12
            com.stripe.android.networking.ApiRequest r11 = com.stripe.android.networking.ApiRequest.Factory.createGet$default(r4, r5, r6, r7, r8, r9)
            com.stripe.android.networking.StripeApiRepository$retrieveObject$response$1 r12 = new com.stripe.android.networking.StripeApiRepository$retrieveObject$response$1
            r12.<init>(r10)
            r0.label = r3
            java.lang.Object r13 = r10.makeApiRequest$payments_core_release(r11, r12, r0)
            if (r13 != r1) goto L_0x0053
            return r1
        L_0x0053:
            com.stripe.android.networking.StripeResponse r13 = (com.stripe.android.networking.StripeResponse) r13
            org.json.JSONObject r11 = r13.getResponseJson$payments_core_release()
            return r11
        L_0x005a:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Unrecognized domain: "
            java.lang.String r11 = i0.d.a.a.a.n0(r13, r11)
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.retrieveObject(java.lang.String, com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }

    public Object retrievePaymentIntent(String str, ApiRequest.Options options, List<String> list, c<? super PaymentIntent> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        String paymentIntentId$payments_core_release = new PaymentIntent.ClientSecret(str).getPaymentIntentId$payments_core_release();
        fireFraudDetectionDataRequest();
        return fetchStripeModel(this.apiRequestFactory.createGet(Companion.getRetrievePaymentIntentUrl$payments_core_release(paymentIntentId$payments_core_release), options, createClientSecretParam(str, list)), new PaymentIntentJsonParser(), new StripeApiRepository$retrievePaymentIntent$2(this), cVar);
    }

    public Object retrieveSetupIntent(String str, ApiRequest.Options options, List<String> list, c<? super SetupIntent> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        String setupIntentId$payments_core_release = new SetupIntent.ClientSecret(str).getSetupIntentId$payments_core_release();
        fireFraudDetectionDataRequest();
        return fetchStripeModel(this.apiRequestFactory.createGet(Companion.getRetrieveSetupIntentUrl$payments_core_release(setupIntentId$payments_core_release), options, createClientSecretParam(str, list)), new SetupIntentJsonParser(), new StripeApiRepository$retrieveSetupIntent$2(this), cVar);
    }

    public Object retrieveSource(String str, String str2, ApiRequest.Options options, c<? super Source> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        return fetchStripeModel(this.apiRequestFactory.createGet(Companion.getRetrieveSourceApiUrl$payments_core_release(str), options, SourceParams.Companion.createRetrieveSourceParams(str2)), new SourceJsonParser(), new StripeApiRepository$retrieveSource$2(this), cVar);
    }

    public Object setCustomerShippingInfo(String str, String str2, Set<String> set, ShippingInformation shippingInformation, ApiRequest.Options options, c<? super Customer> cVar) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        return fetchStripeModel(this.apiRequestFactory.createPost(Companion.getRetrieveCustomerUrl$payments_core_release(str), options, h.S2(new Pair("shipping", shippingInformation.toParamMap()))), new CustomerJsonParser(), new StripeApiRepository$setCustomerShippingInfo$2(this, set), cVar);
    }

    public Object setDefaultCustomerSource(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, c<? super Customer> cVar) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        return fetchStripeModel(this.apiRequestFactory.createPost(Companion.getRetrieveCustomerUrl$payments_core_release(str), options, h.S2(new Pair("default_source", str3))), new CustomerJsonParser(), new StripeApiRepository$setDefaultCustomerSource$2(this, set, str4), cVar);
    }

    public Object start3ds2Auth(Stripe3ds2AuthParams stripe3ds2AuthParams, ApiRequest.Options options, c<? super Stripe3ds2AuthResult> cVar) {
        return fetchStripeModel(this.apiRequestFactory.createPost(Companion.getApiUrl("3ds2/authenticate"), options, stripe3ds2AuthParams.toParamMap()), new Stripe3ds2AuthResultJsonParser(), new StripeApiRepository$start3ds2Auth$2(this), cVar);
    }

    public Object updateIssuingCardPin(String str, String str2, String str3, String str4, ApiRequest.Options options, c<? super m0.i> cVar) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException, CardException {
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion = Companion;
        Object makeApiRequest$payments_core_release = makeApiRequest$payments_core_release(factory.createPost(companion.getIssuingCardPinUrl$payments_core_release(str), options, g.N(new Pair("verification", companion.createVerificationParam(str3, str4)), new Pair("pin", str2))), new StripeApiRepository$updateIssuingCardPin$2(this), cVar);
        if (makeApiRequest$payments_core_release == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return makeApiRequest$payments_core_release;
        }
        return m0.i.a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StripeApiRepository(android.content.Context r17, java.lang.String r18, com.stripe.android.AppInfo r19, com.stripe.android.Logger r20, m0.l.e r21, com.stripe.android.networking.ApiRequestExecutor r22, com.stripe.android.networking.AnalyticsRequestExecutor r23, com.stripe.android.FraudDetectionDataRepository r24, com.stripe.android.networking.AnalyticsRequestFactory r25, com.stripe.android.networking.FraudDetectionDataParamsUtils r26, java.util.Set r27, java.lang.String r28, java.lang.String r29, int r30, m0.n.b.f r31) {
        /*
            r16 = this;
            r1 = r17
            r0 = r30
            r2 = r0 & 4
            if (r2 == 0) goto L_0x000b
            r2 = 0
            r3 = r2
            goto L_0x000d
        L_0x000b:
            r3 = r19
        L_0x000d:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x0019
            com.stripe.android.Logger$Companion r2 = com.stripe.android.Logger.Companion
            com.stripe.android.Logger r2 = r2.noop$payments_core_release()
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r20
        L_0x001b:
            r2 = r0 & 16
            if (r2 == 0) goto L_0x0023
            n0.a.d0 r2 = n0.a.m0.c
            r12 = r2
            goto L_0x0025
        L_0x0023:
            r12 = r21
        L_0x0025:
            r2 = r0 & 32
            if (r2 == 0) goto L_0x0037
            com.stripe.android.networking.DefaultApiRequestExecutor r2 = new com.stripe.android.networking.DefaultApiRequestExecutor
            r6 = 0
            r7 = 0
            r9 = 6
            r10 = 0
            r4 = r2
            r5 = r12
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r6 = r2
            goto L_0x0039
        L_0x0037:
            r6 = r22
        L_0x0039:
            r2 = r0 & 64
            if (r2 == 0) goto L_0x0044
            com.stripe.android.networking.AnalyticsRequestExecutor$Default r2 = new com.stripe.android.networking.AnalyticsRequestExecutor$Default
            r2.<init>(r11, r12)
            r7 = r2
            goto L_0x0046
        L_0x0044:
            r7 = r23
        L_0x0046:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0051
            com.stripe.android.DefaultFraudDetectionDataRepository r2 = new com.stripe.android.DefaultFraudDetectionDataRepository
            r2.<init>(r1, r12)
            r8 = r2
            goto L_0x0053
        L_0x0051:
            r8 = r24
        L_0x0053:
            r2 = r0 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0060
            com.stripe.android.networking.AnalyticsRequestFactory r2 = new com.stripe.android.networking.AnalyticsRequestFactory
            r4 = r18
            r2.<init>((android.content.Context) r1, (java.lang.String) r4)
            r9 = r2
            goto L_0x0064
        L_0x0060:
            r4 = r18
            r9 = r25
        L_0x0064:
            r2 = r0 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x006f
            com.stripe.android.networking.FraudDetectionDataParamsUtils r2 = new com.stripe.android.networking.FraudDetectionDataParamsUtils
            r2.<init>()
            r10 = r2
            goto L_0x0071
        L_0x006f:
            r10 = r26
        L_0x0071:
            r2 = r0 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0079
            kotlin.collections.EmptySet r2 = kotlin.collections.EmptySet.c
            r13 = r2
            goto L_0x007b
        L_0x0079:
            r13 = r27
        L_0x007b:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x008a
            com.stripe.android.ApiVersion r2 = new com.stripe.android.ApiVersion
            r2.<init>(r13)
            java.lang.String r2 = r2.getCode()
            r14 = r2
            goto L_0x008c
        L_0x008a:
            r14 = r28
        L_0x008c:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = "AndroidBindings/16.10.0"
            r15 = r0
            goto L_0x0096
        L_0x0094:
            r15 = r29
        L_0x0096:
            r0 = r16
            r1 = r17
            r2 = r18
            r4 = r11
            r5 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.<init>(android.content.Context, java.lang.String, com.stripe.android.AppInfo, com.stripe.android.Logger, m0.l.e, com.stripe.android.networking.ApiRequestExecutor, com.stripe.android.networking.AnalyticsRequestExecutor, com.stripe.android.FraudDetectionDataRepository, com.stripe.android.networking.AnalyticsRequestFactory, com.stripe.android.networking.FraudDetectionDataParamsUtils, java.util.Set, java.lang.String, java.lang.String, int, m0.n.b.f):void");
    }
}
