package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.CardUtils;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.model.parsers.CardJsonParser;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\b\b\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0001\u0001B½\u0002\b\u0000\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010E\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010F\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010P\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010Q\u001a\u00020-\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010X\u001a\u0004\u0018\u00010\u001b\u0012\u000e\b\u0002\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001b09\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010=\u0012\u0016\b\u0002\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010@¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0012\u0010&\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0012\u0010'\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0012\u0010(\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0012\u0010)\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0012\u0010*\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0012\u0010+\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0012\u0010,\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0010\u0010.\u001a\u00020-HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00101\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b3\u0010\u001dJ\u0012\u00104\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b4\u0010\u001dJ\u0012\u00105\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b5\u0010\u001dJ\u0012\u00106\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b6\u0010\u001dJ\u0012\u00107\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b7\u0010\u001dJ\u0012\u00108\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b8\u0010\u001dJ\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001b09HÀ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010>\u001a\u0004\u0018\u00010=HÆ\u0003¢\u0006\u0004\b>\u0010?J\u001e\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010@HÆ\u0003¢\u0006\u0004\bA\u0010BJÊ\u0002\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010P\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010Q\u001a\u00020-2\n\b\u0002\u0010R\u001a\u0004\u0018\u0001002\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u001b2\u000e\b\u0002\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001b092\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010=2\u0016\b\u0002\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010@HÆ\u0001¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b^\u0010\u001dJ\u0010\u0010_\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b_\u0010`J\u001a\u0010c\u001a\u00020\r2\b\u0010b\u001a\u0004\u0018\u00010aHÖ\u0003¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\be\u0010`J \u0010j\u001a\u00020i2\u0006\u0010g\u001a\u00020f2\u0006\u0010h\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\bj\u0010kR\u001b\u0010V\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\bV\u0010l\u001a\u0004\bm\u0010\u001dR\u001b\u0010T\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\bT\u0010l\u001a\u0004\bn\u0010\u001dR\u001b\u0010I\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\bI\u0010l\u001a\u0004\bo\u0010\u001dR\u001b\u0010K\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\bK\u0010l\u001a\u0004\bp\u0010\u001dR\u001e\u0010X\u001a\u0004\u0018\u00010\u001b8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\bX\u0010l\u001a\u0004\bq\u0010\u001dR\u001b\u0010G\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010l\u001a\u0004\br\u0010\u001dR\u001b\u0010O\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\bO\u0010l\u001a\u0004\bs\u0010\u001dR\u001b\u0010W\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\bW\u0010l\u001a\u0004\bt\u0010\u001dR$\u0010D\u001a\u0004\u0018\u00010\u001b8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\bD\u0010l\u0012\u0004\bv\u0010w\u001a\u0004\bu\u0010\u001dR\u001b\u0010R\u001a\u0004\u0018\u0001008\u0006@\u0006¢\u0006\f\n\u0004\bR\u0010x\u001a\u0004\by\u00102R\u001b\u0010M\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\bM\u0010l\u001a\u0004\bz\u0010\u001dR\u001b\u0010L\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\bL\u0010l\u001a\u0004\b{\u0010\u001dR\u001b\u0010S\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\bS\u0010l\u001a\u0004\b|\u0010\u001dR\u0019\u0010Q\u001a\u00020-8\u0006@\u0006¢\u0006\f\n\u0004\bQ\u0010}\u001a\u0004\b~\u0010/R\u001b\u0010J\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010l\u001a\u0004\b\u0010\u001dR\u001d\u0010E\u001a\u0004\u0018\u00010\u001f8\u0007@\u0006¢\u0006\u000e\n\u0005\bE\u0010\u0001\u001a\u0005\b\u0001\u0010!R&\u0010C\u001a\u0004\u0018\u00010\u001b8\u0006@\u0007X\u0004¢\u0006\u0014\n\u0004\bC\u0010l\u0012\u0005\b\u0001\u0010w\u001a\u0005\b\u0001\u0010\u001dR\u001c\u0010N\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\r\n\u0004\bN\u0010l\u001a\u0005\b\u0001\u0010\u001dR$\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020a0@8V@\u0016X\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010BR\u001d\u0010F\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006¢\u0006\u000e\n\u0005\bF\u0010\u0001\u001a\u0005\b\u0001\u0010!R3\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010@8\u0006@\u0007X\u0004¢\u0006\u0015\n\u0005\b[\u0010\u0001\u0012\u0005\b\u0001\u0010w\u001a\u0005\b\u0001\u0010BR\u001c\u0010U\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\r\n\u0004\bU\u0010l\u001a\u0005\b\u0001\u0010\u001dR\u001c\u0010H\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\r\n\u0004\bH\u0010l\u001a\u0005\b\u0001\u0010\u001dR\u001c\u0010P\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\r\n\u0004\bP\u0010l\u001a\u0005\b\u0001\u0010\u001dR$\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001b098\u0000@\u0000X\u0004¢\u0006\u000e\n\u0005\bY\u0010\u0001\u001a\u0005\b\u0001\u0010;R\u001d\u0010Z\u001a\u0004\u0018\u00010=8\u0006@\u0006¢\u0006\u000e\n\u0005\bZ\u0010\u0001\u001a\u0005\b\u0001\u0010?¨\u0006\u0001"}, d2 = {"Lcom/stripe/android/model/Card;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "Lcom/stripe/android/model/TokenParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "toPaymentMethodsParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "toPaymentMethodParamsCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "Lcom/stripe/android/model/Card$Builder;", "toBuilder", "()Lcom/stripe/android/model/Card$Builder;", "", "validateCard", "()Z", "validateNumber", "validateExpiryDate", "validateCVC", "validateExpMonth", "Ljava/util/Calendar;", "now", "validateExpYear$payments_core_release", "(Ljava/util/Calendar;)Z", "validateExpYear", "validateCard$payments_core_release", "validateExpiryDate$payments_core_release", "", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "Lcom/stripe/android/model/CardBrand;", "component15", "()Lcom/stripe/android/model/CardBrand;", "Lcom/stripe/android/model/CardFunding;", "component16", "()Lcom/stripe/android/model/CardFunding;", "component17", "component18", "component19", "component20", "component21", "component22", "", "component23$payments_core_release", "()Ljava/util/Set;", "component23", "Lcom/stripe/android/model/TokenizationMethod;", "component24", "()Lcom/stripe/android/model/TokenizationMethod;", "", "component25", "()Ljava/util/Map;", "number", "cvc", "expMonth", "expYear", "name", "addressLine1", "addressLine1Check", "addressLine2", "addressCity", "addressState", "addressZip", "addressZipCheck", "addressCountry", "last4", "brand", "funding", "fingerprint", "country", "currency", "customerId", "cvcCheck", "id", "loggingTokens", "tokenizationMethod", "metadata", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/TokenizationMethod;Ljava/util/Map;)Lcom/stripe/android/model/Card;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCustomerId", "getCountry", "getAddressLine1Check", "getAddressCity", "getId", "getName", "getAddressCountry", "getCvcCheck", "getCvc", "getCvc$annotations", "()V", "Lcom/stripe/android/model/CardFunding;", "getFunding", "getAddressZip", "getAddressState", "getFingerprint", "Lcom/stripe/android/model/CardBrand;", "getBrand", "getAddressLine2", "Ljava/lang/Integer;", "getExpMonth", "getNumber", "getNumber$annotations", "getAddressZipCheck", "getTypeDataParams", "typeDataParams", "getExpYear", "Ljava/util/Map;", "getMetadata", "getMetadata$annotations", "getCurrency", "getAddressLine1", "getLast4", "Ljava/util/Set;", "getLoggingTokens$payments_core_release", "Lcom/stripe/android/model/TokenizationMethod;", "getTokenizationMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/TokenizationMethod;Ljava/util/Map;)V", "Companion", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Card.kt */
public final class Card extends TokenParams implements StripeModel, StripePaymentSource {
    public static final Parcelable.Creator<Card> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private final String addressCity;
    private final String addressCountry;
    private final String addressLine1;
    private final String addressLine1Check;
    private final String addressLine2;
    private final String addressState;
    private final String addressZip;
    private final String addressZipCheck;
    private final CardBrand brand;
    private final String country;
    private final String currency;
    private final String customerId;
    private final String cvc;
    private final String cvcCheck;
    private final Integer expMonth;
    private final Integer expYear;
    private final String fingerprint;
    private final CardFunding funding;
    private final String id;
    private final String last4;
    private final Set<String> loggingTokens;
    private final Map<String, String> metadata;
    private final String name;
    private final String number;
    private final TokenizationMethod tokenizationMethod;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u00105\u001a\u0004\u0018\u000104\u0012\n\b\u0003\u0010>\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bA\u0010BJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\tJ\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b!\u0010\tJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\"\u0010\tJ\u0017\u0010#\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b#\u0010\tJ\u0017\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b$\u0010\tJ\u0017\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b&\u0010'J#\u0010)\u001a\u00020\u00002\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010(¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030+¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u00100R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u00101R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u00100R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u00100R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u00103R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u00100R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u00100R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u00100R\u001e\u00105\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u00100R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u00100R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u00100R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u00100R\u001e\u00109\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u0010;R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u00100R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010<R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u00100R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010=R\u001e\u0010>\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b?\u00108R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u00100R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b@\u0010;R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u00100R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100¨\u0006C"}, d2 = {"Lcom/stripe/android/model/Card$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/Card;", "", "number", "normalizeCardNumber", "(Ljava/lang/String;)Ljava/lang/String;", "calculateLast4", "name", "(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;", "address", "addressLine1", "addressLine1Check", "addressLine2", "city", "addressCity", "state", "addressState", "zip", "addressZip", "zipCheck", "addressZipCheck", "country", "addressCountry", "Lcom/stripe/android/model/CardBrand;", "brand", "(Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/model/Card$Builder;", "fingerprint", "Lcom/stripe/android/model/CardFunding;", "funding", "(Lcom/stripe/android/model/CardFunding;)Lcom/stripe/android/model/Card$Builder;", "currency", "customerId", "customer", "cvcCheck", "last4", "id", "Lcom/stripe/android/model/TokenizationMethod;", "tokenizationMethod", "(Lcom/stripe/android/model/TokenizationMethod;)Lcom/stripe/android/model/Card$Builder;", "", "metadata", "(Ljava/util/Map;)Lcom/stripe/android/model/Card$Builder;", "", "loggingTokens", "(Ljava/util/Set;)Lcom/stripe/android/model/Card$Builder;", "build", "()Lcom/stripe/android/model/Card;", "Ljava/lang/String;", "Lcom/stripe/android/model/TokenizationMethod;", "Lcom/stripe/android/model/CardFunding;", "Lcom/stripe/android/model/CardBrand;", "", "expMonth", "Ljava/lang/Integer;", "getExpMonth$payments_core_release", "()Ljava/lang/Integer;", "cvc", "getCvc$payments_core_release", "()Ljava/lang/String;", "Ljava/util/Set;", "Ljava/util/Map;", "expYear", "getExpYear$payments_core_release", "getNumber$payments_core_release", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Card.kt */
    public static final class Builder implements ObjectBuilder<Card> {
        private String addressCity;
        private String addressCountry;
        private String addressLine1;
        private String addressLine1Check;
        private String addressLine2;
        private String addressState;
        private String addressZip;
        private String addressZipCheck;
        private CardBrand brand;
        private String country;
        private String currency;
        private String customerId;
        private final String cvc;
        private String cvcCheck;
        private final Integer expMonth;
        private final Integer expYear;
        private String fingerprint;
        private CardFunding funding;
        private String id;
        private String last4;
        private Set<String> loggingTokens;
        private Map<String, String> metadata;
        private String name;
        private final String number;
        private TokenizationMethod tokenizationMethod;

        public Builder() {
            this((String) null, (Integer) null, (Integer) null, (String) null, 15, (f) null);
        }

        public Builder(String str, Integer num, Integer num2, String str2) {
            this.number = str;
            this.expMonth = num;
            this.expYear = num2;
            this.cvc = str2;
        }

        private final String calculateLast4(String str) {
            if (str == null || str.length() <= 4) {
                return null;
            }
            String substring = str.substring(str.length() - 4);
            i.d(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }

        private final String normalizeCardNumber(String str) {
            String obj;
            if (str == null || (obj = StringsKt__IndentKt.X(str).toString()) == null) {
                return null;
            }
            i.e("\\s+|-", "pattern");
            Pattern compile = Pattern.compile("\\s+|-");
            i.d(compile, "Pattern.compile(pattern)");
            i.e(compile, "nativePattern");
            i.e(obj, "input");
            i.e("", "replacement");
            String replaceAll = compile.matcher(obj).replaceAll("");
            i.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            return replaceAll;
        }

        public final Builder addressCity(String str) {
            this.addressCity = str;
            return this;
        }

        public final Builder addressCountry(String str) {
            this.addressCountry = str;
            return this;
        }

        public final Builder addressLine1(String str) {
            this.addressLine1 = str;
            return this;
        }

        public final Builder addressLine1Check(String str) {
            this.addressLine1Check = str;
            return this;
        }

        public final Builder addressLine2(String str) {
            this.addressLine2 = str;
            return this;
        }

        public final Builder addressState(String str) {
            this.addressState = str;
            return this;
        }

        public final Builder addressZip(String str) {
            this.addressZip = str;
            return this;
        }

        public final Builder addressZipCheck(String str) {
            this.addressZipCheck = str;
            return this;
        }

        public final Builder brand(CardBrand cardBrand) {
            this.brand = cardBrand;
            return this;
        }

        public final Builder country(String str) {
            this.country = str;
            return this;
        }

        public final Builder currency(String str) {
            this.currency = str;
            return this;
        }

        public final Builder customer(String str) {
            this.customerId = str;
            return this;
        }

        public final Builder cvcCheck(String str) {
            this.cvcCheck = str;
            return this;
        }

        public final Builder fingerprint(String str) {
            this.fingerprint = str;
            return this;
        }

        public final Builder funding(CardFunding cardFunding) {
            this.funding = cardFunding;
            return this;
        }

        public final String getCvc$payments_core_release() {
            return this.cvc;
        }

        public final Integer getExpMonth$payments_core_release() {
            return this.expMonth;
        }

        public final Integer getExpYear$payments_core_release() {
            return this.expYear;
        }

        public final String getNumber$payments_core_release() {
            return this.number;
        }

        public final Builder id(String str) {
            this.id = str;
            return this;
        }

        public final Builder last4(String str) {
            this.last4 = str;
            return this;
        }

        public final Builder loggingTokens(Set<String> set) {
            i.e(set, "loggingTokens");
            this.loggingTokens = set;
            return this;
        }

        public final Builder metadata(Map<String, String> map) {
            this.metadata = map;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder tokenizationMethod(TokenizationMethod tokenizationMethod2) {
            this.tokenizationMethod = tokenizationMethod2;
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Builder(String str, Integer num, Integer num2, String str2, int i, f fVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2);
        }

        public Card build() {
            String normalizeCardNumber = normalizeCardNumber(this.number);
            boolean z = false;
            String str = !(normalizeCardNumber == null || StringsKt__IndentKt.o(normalizeCardNumber)) ? normalizeCardNumber : null;
            String str2 = this.last4;
            if (str2 == null || StringsKt__IndentKt.o(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = calculateLast4(str);
            }
            String str3 = str2;
            Integer num = this.expMonth;
            Integer num2 = this.expYear;
            String str4 = this.cvc;
            String str5 = !(str4 == null || StringsKt__IndentKt.o(str4)) ? str4 : null;
            String str6 = this.name;
            String str7 = !(str6 == null || StringsKt__IndentKt.o(str6)) ? str6 : null;
            String str8 = this.addressLine1;
            String str9 = !(str8 == null || StringsKt__IndentKt.o(str8)) ? str8 : null;
            String str10 = this.addressLine1Check;
            String str11 = !(str10 == null || StringsKt__IndentKt.o(str10)) ? str10 : null;
            String str12 = this.addressLine2;
            String str13 = !(str12 == null || StringsKt__IndentKt.o(str12)) ? str12 : null;
            String str14 = this.addressCity;
            String str15 = !(str14 == null || StringsKt__IndentKt.o(str14)) ? str14 : null;
            String str16 = this.addressState;
            String str17 = !(str16 == null || StringsKt__IndentKt.o(str16)) ? str16 : null;
            String str18 = this.addressZip;
            String str19 = !(str18 == null || StringsKt__IndentKt.o(str18)) ? str18 : null;
            String str20 = this.addressZipCheck;
            String str21 = !(str20 == null || StringsKt__IndentKt.o(str20)) ? str20 : null;
            String str22 = this.addressCountry;
            String str23 = !(str22 == null || StringsKt__IndentKt.o(str22)) ? str22 : null;
            CardBrand cardBrand = this.brand;
            if (cardBrand == null) {
                cardBrand = CardUtils.getPossibleCardBrand(str);
            }
            CardBrand cardBrand2 = cardBrand;
            String str24 = this.fingerprint;
            String str25 = !(str24 == null || StringsKt__IndentKt.o(str24)) ? str24 : null;
            CardFunding cardFunding = this.funding;
            String str26 = this.country;
            String str27 = !(str26 == null || StringsKt__IndentKt.o(str26)) ? str26 : null;
            String str28 = this.currency;
            String str29 = !(str28 == null || StringsKt__IndentKt.o(str28)) ? str28 : null;
            String str30 = this.customerId;
            String str31 = !(str30 == null || StringsKt__IndentKt.o(str30)) ? str30 : null;
            String str32 = this.cvcCheck;
            String str33 = !(str32 == null || StringsKt__IndentKt.o(str32)) ? str32 : null;
            String str34 = this.id;
            if (str34 == null || StringsKt__IndentKt.o(str34)) {
                z = true;
            }
            String str35 = !z ? str34 : null;
            TokenizationMethod tokenizationMethod2 = this.tokenizationMethod;
            Set set = this.loggingTokens;
            if (set == null) {
                set = EmptySet.c;
            }
            return new Card(str, str5, num, num2, str7, str9, str11, str13, str15, str17, str19, str21, str23, str3, cardBrand2, cardFunding, str25, str27, str29, str31, str33, str35, set, tokenizationMethod2, (Map) null, 16777216, (f) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ?\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/Card$Companion;", "", "", "jsonString", "Lcom/stripe/android/model/Card;", "fromString", "(Ljava/lang/String;)Lcom/stripe/android/model/Card;", "Lorg/json/JSONObject;", "jsonObject", "fromJson", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Card;", "number", "", "expMonth", "expYear", "cvc", "create", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/model/Card;", "brandName", "Lcom/stripe/android/model/CardBrand;", "getCardBrand$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;", "getCardBrand", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Card.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ Card create$default(Companion companion, String str, Integer num, Integer num2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                num2 = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            return companion.create(str, num, num2, str2);
        }

        public final Card create(String str, Integer num, Integer num2, String str2) {
            return new Builder(str, num, num2, str2).build();
        }

        public final Card fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new CardJsonParser().parse(jSONObject);
            }
            return null;
        }

        public final Card fromString(String str) {
            Object obj;
            i.e(str, "jsonString");
            try {
                obj = new JSONObject(str);
            } catch (Throwable th) {
                obj = h.l0(th);
            }
            if (obj instanceof Result.Failure) {
                obj = null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null) {
                return Card.Companion.fromJson(jSONObject);
            }
            return null;
        }

        public final /* synthetic */ CardBrand getCardBrand$payments_core_release(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -993787207:
                        if (str.equals("Diners Club")) {
                            return CardBrand.DinersClub;
                        }
                        break;
                    case -298759312:
                        if (str.equals("American Express")) {
                            return CardBrand.AmericanExpress;
                        }
                        break;
                    case -231891079:
                        if (str.equals("UnionPay")) {
                            return CardBrand.UnionPay;
                        }
                        break;
                    case -46205774:
                        if (str.equals("MasterCard")) {
                            return CardBrand.MasterCard;
                        }
                        break;
                    case 73257:
                        if (str.equals("JCB")) {
                            return CardBrand.JCB;
                        }
                        break;
                    case 2666593:
                        if (str.equals("Visa")) {
                            return CardBrand.Visa;
                        }
                        break;
                    case 337828873:
                        if (str.equals("Discover")) {
                            return CardBrand.Discover;
                        }
                        break;
                }
            }
            return CardBrand.Unknown;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<Card> {
        public final Card createFromParcel(Parcel parcel) {
            String str;
            LinkedHashMap linkedHashMap;
            String str2;
            LinkedHashSet linkedHashSet;
            i.e(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            CardBrand cardBrand = (CardBrand) Enum.valueOf(CardBrand.class, parcel.readString());
            CardFunding cardFunding = parcel.readInt() != 0 ? (CardFunding) Enum.valueOf(CardFunding.class, parcel.readString()) : null;
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt);
            while (true) {
                str = readString11;
                if (readInt == 0) {
                    break;
                }
                linkedHashSet2.add(parcel.readString());
                readInt--;
                readString11 = str;
            }
            TokenizationMethod tokenizationMethod = parcel.readInt() != 0 ? (TokenizationMethod) Enum.valueOf(TokenizationMethod.class, parcel.readString()) : null;
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                while (true) {
                    linkedHashSet = linkedHashSet2;
                    if (readInt2 == 0) {
                        break;
                    }
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                    readInt2--;
                    linkedHashSet2 = linkedHashSet;
                    readString10 = readString10;
                }
                str2 = readString10;
                linkedHashMap = linkedHashMap2;
            } else {
                linkedHashSet = linkedHashSet2;
                str2 = readString10;
                linkedHashMap = null;
            }
            return new Card(readString, readString2, valueOf, valueOf2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, str2, str, readString12, cardBrand, cardFunding, readString13, readString14, readString15, readString16, readString17, readString18, linkedHashSet, tokenizationMethod, linkedHashMap);
        }

        public final Card[] newArray(int i) {
            return new Card[i];
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Card(java.lang.String r30, java.lang.String r31, java.lang.Integer r32, java.lang.Integer r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, com.stripe.android.model.CardBrand r44, com.stripe.android.model.CardFunding r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.util.Set r52, com.stripe.android.model.TokenizationMethod r53, java.util.Map r54, int r55, m0.n.b.f r56) {
        /*
            r29 = this;
            r0 = r55
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r30
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r31
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r34
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r35
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r36
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r37
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0039
            r12 = r2
            goto L_0x003b
        L_0x0039:
            r12 = r38
        L_0x003b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0041
            r13 = r2
            goto L_0x0043
        L_0x0041:
            r13 = r39
        L_0x0043:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0049
            r14 = r2
            goto L_0x004b
        L_0x0049:
            r14 = r40
        L_0x004b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0051
            r15 = r2
            goto L_0x0053
        L_0x0051:
            r15 = r41
        L_0x0053:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005a
            r16 = r2
            goto L_0x005c
        L_0x005a:
            r16 = r42
        L_0x005c:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0063
            r17 = r2
            goto L_0x0065
        L_0x0063:
            r17 = r43
        L_0x0065:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x006e
            r19 = r2
            goto L_0x0070
        L_0x006e:
            r19 = r45
        L_0x0070:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0078
            r20 = r2
            goto L_0x007a
        L_0x0078:
            r20 = r46
        L_0x007a:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0082
            r21 = r2
            goto L_0x0084
        L_0x0082:
            r21 = r47
        L_0x0084:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008c
            r22 = r2
            goto L_0x008e
        L_0x008c:
            r22 = r48
        L_0x008e:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0096
            r23 = r2
            goto L_0x0098
        L_0x0096:
            r23 = r49
        L_0x0098:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a0
            r24 = r2
            goto L_0x00a2
        L_0x00a0:
            r24 = r50
        L_0x00a2:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00ac
            kotlin.collections.EmptySet r1 = kotlin.collections.EmptySet.c
            r26 = r1
            goto L_0x00ae
        L_0x00ac:
            r26 = r52
        L_0x00ae:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b6
            r27 = r2
            goto L_0x00b8
        L_0x00b6:
            r27 = r53
        L_0x00b8:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00c0
            r28 = r2
            goto L_0x00c2
        L_0x00c0:
            r28 = r54
        L_0x00c2:
            r3 = r29
            r6 = r32
            r7 = r33
            r18 = r44
            r25 = r51
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.Card.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.stripe.android.model.CardBrand, com.stripe.android.model.CardFunding, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Set, com.stripe.android.model.TokenizationMethod, java.util.Map, int, m0.n.b.f):void");
    }

    public static /* synthetic */ Card copy$default(Card card, String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, CardBrand cardBrand, CardFunding cardFunding, String str13, String str14, String str15, String str16, String str17, String str18, Set set, TokenizationMethod tokenizationMethod2, Map map, int i, Object obj) {
        Card card2 = card;
        int i2 = i;
        return card.copy((i2 & 1) != 0 ? card2.number : str, (i2 & 2) != 0 ? card2.cvc : str2, (i2 & 4) != 0 ? card2.expMonth : num, (i2 & 8) != 0 ? card2.expYear : num2, (i2 & 16) != 0 ? card2.name : str3, (i2 & 32) != 0 ? card2.addressLine1 : str4, (i2 & 64) != 0 ? card2.addressLine1Check : str5, (i2 & 128) != 0 ? card2.addressLine2 : str6, (i2 & 256) != 0 ? card2.addressCity : str7, (i2 & 512) != 0 ? card2.addressState : str8, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? card2.addressZip : str9, (i2 & 2048) != 0 ? card2.addressZipCheck : str10, (i2 & 4096) != 0 ? card2.addressCountry : str11, (i2 & 8192) != 0 ? card2.last4 : str12, (i2 & 16384) != 0 ? card2.brand : cardBrand, (i2 & 32768) != 0 ? card2.funding : cardFunding, (i2 & 65536) != 0 ? card2.fingerprint : str13, (i2 & 131072) != 0 ? card2.country : str14, (i2 & 262144) != 0 ? card2.currency : str15, (i2 & 524288) != 0 ? card2.customerId : str16, (i2 & 1048576) != 0 ? card2.cvcCheck : str17, (i2 & 2097152) != 0 ? card.getId() : str18, (i2 & 4194304) != 0 ? card2.loggingTokens : set, (i2 & 8388608) != 0 ? card2.tokenizationMethod : tokenizationMethod2, (i2 & 16777216) != 0 ? card2.metadata : map);
    }

    public static final Card create(String str, Integer num, Integer num2, String str2) {
        return Companion.create(str, num, num2, str2);
    }

    public static final Card fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public static final Card fromString(String str) {
        return Companion.fromString(str);
    }

    public static /* synthetic */ void getCvc$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getNumber$annotations() {
    }

    public final String component1() {
        return this.number;
    }

    public final String component10() {
        return this.addressState;
    }

    public final String component11() {
        return this.addressZip;
    }

    public final String component12() {
        return this.addressZipCheck;
    }

    public final String component13() {
        return this.addressCountry;
    }

    public final String component14() {
        return this.last4;
    }

    public final CardBrand component15() {
        return this.brand;
    }

    public final CardFunding component16() {
        return this.funding;
    }

    public final String component17() {
        return this.fingerprint;
    }

    public final String component18() {
        return this.country;
    }

    public final String component19() {
        return this.currency;
    }

    public final String component2() {
        return this.cvc;
    }

    public final String component20() {
        return this.customerId;
    }

    public final String component21() {
        return this.cvcCheck;
    }

    public final String component22() {
        return getId();
    }

    public final Set<String> component23$payments_core_release() {
        return this.loggingTokens;
    }

    public final TokenizationMethod component24() {
        return this.tokenizationMethod;
    }

    public final Map<String, String> component25() {
        return this.metadata;
    }

    public final Integer component3() {
        return this.expMonth;
    }

    public final Integer component4() {
        return this.expYear;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.addressLine1;
    }

    public final String component7() {
        return this.addressLine1Check;
    }

    public final String component8() {
        return this.addressLine2;
    }

    public final String component9() {
        return this.addressCity;
    }

    public final Card copy(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, CardBrand cardBrand, CardFunding cardFunding, String str13, String str14, String str15, String str16, String str17, String str18, Set<String> set, TokenizationMethod tokenizationMethod2, Map<String, String> map) {
        String str19 = str;
        i.e(cardBrand, AccountRangeJsonParser.FIELD_BRAND);
        i.e(set, "loggingTokens");
        return new Card(str, str2, num, num2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, cardBrand, cardFunding, str13, str14, str15, str16, str17, str18, set, tokenizationMethod2, map);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return i.a(this.number, card.number) && i.a(this.cvc, card.cvc) && i.a(this.expMonth, card.expMonth) && i.a(this.expYear, card.expYear) && i.a(this.name, card.name) && i.a(this.addressLine1, card.addressLine1) && i.a(this.addressLine1Check, card.addressLine1Check) && i.a(this.addressLine2, card.addressLine2) && i.a(this.addressCity, card.addressCity) && i.a(this.addressState, card.addressState) && i.a(this.addressZip, card.addressZip) && i.a(this.addressZipCheck, card.addressZipCheck) && i.a(this.addressCountry, card.addressCountry) && i.a(this.last4, card.last4) && i.a(this.brand, card.brand) && i.a(this.funding, card.funding) && i.a(this.fingerprint, card.fingerprint) && i.a(this.country, card.country) && i.a(this.currency, card.currency) && i.a(this.customerId, card.customerId) && i.a(this.cvcCheck, card.cvcCheck) && i.a(getId(), card.getId()) && i.a(this.loggingTokens, card.loggingTokens) && i.a(this.tokenizationMethod, card.tokenizationMethod) && i.a(this.metadata, card.metadata);
    }

    public final String getAddressCity() {
        return this.addressCity;
    }

    public final String getAddressCountry() {
        return this.addressCountry;
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine1Check() {
        return this.addressLine1Check;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getAddressState() {
        return this.addressState;
    }

    public final String getAddressZip() {
        return this.addressZip;
    }

    public final String getAddressZipCheck() {
        return this.addressZipCheck;
    }

    public final CardBrand getBrand() {
        return this.brand;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getCvc() {
        return this.cvc;
    }

    public final String getCvcCheck() {
        return this.cvcCheck;
    }

    public final Integer getExpMonth() {
        return this.expMonth;
    }

    public final Integer getExpYear() {
        return this.expYear;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final CardFunding getFunding() {
        return this.funding;
    }

    public String getId() {
        return this.id;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final Set<String> getLoggingTokens$payments_core_release() {
        return this.loggingTokens;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber() {
        return this.number;
    }

    public final TokenizationMethod getTokenizationMethod() {
        return this.tokenizationMethod;
    }

    public Map<String, Object> getTypeDataParams() {
        String str = this.number;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Integer num = this.expMonth;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = this.expYear;
        return new CardParams(str2, intValue, num2 != null ? num2.intValue() : 0, this.cvc, this.name, new Address(this.addressCity, this.addressCountry, this.addressLine1, this.addressLine2, this.addressZip, this.addressState), this.currency, (Map) null, 128, (f) null).getTypeDataParams();
    }

    public int hashCode() {
        String str = this.number;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.cvc;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.expMonth;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.expYear;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.addressLine1;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.addressLine1Check;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.addressLine2;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.addressCity;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.addressState;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.addressZip;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.addressZipCheck;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.addressCountry;
        int hashCode13 = (hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.last4;
        int hashCode14 = (hashCode13 + (str12 != null ? str12.hashCode() : 0)) * 31;
        CardBrand cardBrand = this.brand;
        int hashCode15 = (hashCode14 + (cardBrand != null ? cardBrand.hashCode() : 0)) * 31;
        CardFunding cardFunding = this.funding;
        int hashCode16 = (hashCode15 + (cardFunding != null ? cardFunding.hashCode() : 0)) * 31;
        String str13 = this.fingerprint;
        int hashCode17 = (hashCode16 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.country;
        int hashCode18 = (hashCode17 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.currency;
        int hashCode19 = (hashCode18 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.customerId;
        int hashCode20 = (hashCode19 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.cvcCheck;
        int hashCode21 = (hashCode20 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String id2 = getId();
        int hashCode22 = (hashCode21 + (id2 != null ? id2.hashCode() : 0)) * 31;
        Set<String> set = this.loggingTokens;
        int hashCode23 = (hashCode22 + (set != null ? set.hashCode() : 0)) * 31;
        TokenizationMethod tokenizationMethod2 = this.tokenizationMethod;
        int hashCode24 = (hashCode23 + (tokenizationMethod2 != null ? tokenizationMethod2.hashCode() : 0)) * 31;
        Map<String, String> map = this.metadata;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode24 + i;
    }

    public final Builder toBuilder() {
        return new Builder(this.number, this.expMonth, this.expYear, this.cvc).name(this.name).addressLine1(this.addressLine1).addressLine1Check(this.addressLine1Check).addressLine2(this.addressLine2).addressCity(this.addressCity).addressState(this.addressState).addressZip(this.addressZip).addressZipCheck(this.addressZipCheck).addressCountry(this.addressCountry).brand(this.brand).fingerprint(this.fingerprint).funding(this.funding).country(this.country).currency(this.currency).customer(this.customerId).cvcCheck(this.cvcCheck).last4(this.last4).id(getId()).tokenizationMethod(this.tokenizationMethod).metadata(this.metadata).loggingTokens(this.loggingTokens);
    }

    public final PaymentMethodCreateParams.Card toPaymentMethodParamsCard() {
        return new PaymentMethodCreateParams.Card(this.number, this.expMonth, this.expYear, this.cvc, (String) null, (Set) null, 48, (f) null);
    }

    public final PaymentMethodCreateParams toPaymentMethodsParams() {
        PaymentMethodCreateParams.Companion companion = PaymentMethodCreateParams.Companion;
        PaymentMethodCreateParams.Card paymentMethodParamsCard = toPaymentMethodParamsCard();
        String str = this.name;
        String str2 = this.addressLine1;
        String str3 = this.addressLine2;
        return PaymentMethodCreateParams.Companion.create$default(companion, paymentMethodParamsCard, new PaymentMethod.BillingDetails(new Address(this.addressCity, this.addressCountry, str2, str3, this.addressZip, this.addressState), (String) null, str, (String) null, 10, (f) null), (Map) null, 4, (Object) null);
    }

    public String toString() {
        StringBuilder P0 = a.P0("Card(number=");
        P0.append(this.number);
        P0.append(", cvc=");
        P0.append(this.cvc);
        P0.append(", expMonth=");
        P0.append(this.expMonth);
        P0.append(", expYear=");
        P0.append(this.expYear);
        P0.append(", name=");
        P0.append(this.name);
        P0.append(", addressLine1=");
        P0.append(this.addressLine1);
        P0.append(", addressLine1Check=");
        P0.append(this.addressLine1Check);
        P0.append(", addressLine2=");
        P0.append(this.addressLine2);
        P0.append(", addressCity=");
        P0.append(this.addressCity);
        P0.append(", addressState=");
        P0.append(this.addressState);
        P0.append(", addressZip=");
        P0.append(this.addressZip);
        P0.append(", addressZipCheck=");
        P0.append(this.addressZipCheck);
        P0.append(", addressCountry=");
        P0.append(this.addressCountry);
        P0.append(", last4=");
        P0.append(this.last4);
        P0.append(", brand=");
        P0.append(this.brand);
        P0.append(", funding=");
        P0.append(this.funding);
        P0.append(", fingerprint=");
        P0.append(this.fingerprint);
        P0.append(", country=");
        P0.append(this.country);
        P0.append(", currency=");
        P0.append(this.currency);
        P0.append(", customerId=");
        P0.append(this.customerId);
        P0.append(", cvcCheck=");
        P0.append(this.cvcCheck);
        P0.append(", id=");
        P0.append(getId());
        P0.append(", loggingTokens=");
        P0.append(this.loggingTokens);
        P0.append(", tokenizationMethod=");
        P0.append(this.tokenizationMethod);
        P0.append(", metadata=");
        P0.append(this.metadata);
        P0.append(")");
        return P0.toString();
    }

    public final boolean validateCVC() {
        String str = this.cvc;
        if (str == null || StringsKt__IndentKt.o(str)) {
            return false;
        }
        String str2 = this.cvc;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj = StringsKt__IndentKt.X(str2).toString();
        boolean isValidCvc = this.brand.isValidCvc(this.cvc);
        if (!ModelUtils.INSTANCE.isWholePositiveNumber$payments_core_release(obj) || !isValidCvc) {
            return false;
        }
        return true;
    }

    public final boolean validateCard() {
        Calendar instance = Calendar.getInstance();
        i.d(instance, "Calendar.getInstance()");
        return validateCard$payments_core_release(instance);
    }

    public final boolean validateCard$payments_core_release(Calendar calendar) {
        i.e(calendar, "now");
        if (this.cvc == null) {
            if (validateNumber() && validateExpiryDate$payments_core_release(calendar)) {
                return true;
            }
        } else if (validateNumber() && validateExpiryDate$payments_core_release(calendar) && validateCVC()) {
            return true;
        }
        return false;
    }

    public final boolean validateExpMonth() {
        Integer num = this.expMonth;
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        return 1 <= intValue && 12 >= intValue;
    }

    public final boolean validateExpYear$payments_core_release(Calendar calendar) {
        i.e(calendar, "now");
        Integer num = this.expYear;
        if (num != null) {
            if (!ModelUtils.INSTANCE.hasYearPassed$payments_core_release(num.intValue(), calendar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean validateExpiryDate() {
        Calendar instance = Calendar.getInstance();
        i.d(instance, "Calendar.getInstance()");
        return validateExpiryDate$payments_core_release(instance);
    }

    public final boolean validateExpiryDate$payments_core_release(Calendar calendar) {
        i.e(calendar, "now");
        Integer num = this.expMonth;
        if (num == null || !validateExpMonth() || this.expYear == null || !validateExpYear$payments_core_release(calendar) || ModelUtils.INSTANCE.hasMonthPassed$payments_core_release(this.expYear.intValue(), num.intValue(), calendar)) {
            return false;
        }
        return true;
    }

    public final boolean validateNumber() {
        return CardUtils.isValidCardNumber(this.number);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map$Entry, java.lang.Object] */
    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.number);
        parcel.writeString(this.cvc);
        Integer num = this.expMonth;
        if (num != null) {
            a.i(parcel, 1, num);
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.expYear;
        if (num2 != null) {
            a.i(parcel, 1, num2);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.addressLine1);
        parcel.writeString(this.addressLine1Check);
        parcel.writeString(this.addressLine2);
        parcel.writeString(this.addressCity);
        parcel.writeString(this.addressState);
        parcel.writeString(this.addressZip);
        parcel.writeString(this.addressZipCheck);
        parcel.writeString(this.addressCountry);
        parcel.writeString(this.last4);
        parcel.writeString(this.brand.name());
        CardFunding cardFunding = this.funding;
        if (cardFunding != null) {
            parcel.writeInt(1);
            parcel.writeString(cardFunding.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.fingerprint);
        parcel.writeString(this.country);
        parcel.writeString(this.currency);
        parcel.writeString(this.customerId);
        parcel.writeString(this.cvcCheck);
        parcel.writeString(this.id);
        Set<String> set = this.loggingTokens;
        parcel.writeInt(set.size());
        for (String writeString : set) {
            parcel.writeString(writeString);
        }
        TokenizationMethod tokenizationMethod2 = this.tokenizationMethod;
        if (tokenizationMethod2 != null) {
            parcel.writeInt(1);
            parcel.writeString(tokenizationMethod2.name());
        } else {
            parcel.writeInt(0);
        }
        Map<String, String> map = this.metadata;
        if (map != null) {
            Iterator l1 = a.l1(parcel, 1, map);
            while (l1.hasNext()) {
                ? next = l1.next();
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Card(java.lang.String r5, java.lang.String r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.stripe.android.model.CardBrand r19, com.stripe.android.model.CardFunding r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.Set<java.lang.String> r27, com.stripe.android.model.TokenizationMethod r28, java.util.Map<java.lang.String, java.lang.String> r29) {
        /*
            r4 = this;
            r0 = r4
            r1 = r19
            r2 = r27
            java.lang.String r3 = "brand"
            m0.n.b.i.e(r1, r3)
            java.lang.String r3 = "loggingTokens"
            m0.n.b.i.e(r2, r3)
            com.stripe.android.model.Token$Type r3 = com.stripe.android.model.Token.Type.Card
            r4.<init>(r3, r2)
            r3 = r5
            r0.number = r3
            r3 = r6
            r0.cvc = r3
            r3 = r7
            r0.expMonth = r3
            r3 = r8
            r0.expYear = r3
            r3 = r9
            r0.name = r3
            r3 = r10
            r0.addressLine1 = r3
            r3 = r11
            r0.addressLine1Check = r3
            r3 = r12
            r0.addressLine2 = r3
            r3 = r13
            r0.addressCity = r3
            r3 = r14
            r0.addressState = r3
            r3 = r15
            r0.addressZip = r3
            r3 = r16
            r0.addressZipCheck = r3
            r3 = r17
            r0.addressCountry = r3
            r3 = r18
            r0.last4 = r3
            r0.brand = r1
            r1 = r20
            r0.funding = r1
            r1 = r21
            r0.fingerprint = r1
            r1 = r22
            r0.country = r1
            r1 = r23
            r0.currency = r1
            r1 = r24
            r0.customerId = r1
            r1 = r25
            r0.cvcCheck = r1
            r1 = r26
            r0.id = r1
            r0.loggingTokens = r2
            r1 = r28
            r0.tokenizationMethod = r1
            r1 = r29
            r0.metadata = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.Card.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.stripe.android.model.CardBrand, com.stripe.android.model.CardFunding, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Set, com.stripe.android.model.TokenizationMethod, java.util.Map):void");
    }
}
