package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.Address;
import com.stripe.android.model.KlarnaSourceParams;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceOrderParams;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\"\n\u0002\b\u0011\u0018\u0000 N2\u00020\u0001:\u0003NOPB!\b\u0002\u0012\u0006\u00107\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0@¢\u0006\u0004\bL\u0010MJ\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00002\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u00002\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0016J#\u0010 \u001a\u00020\u00002\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b \u0010\u0013J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010\u0016J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b-\u0010.R(\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\b1\u00102R(\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b3\u00102R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010/\u001a\u0004\u0018\u00010\n8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106R\u0019\u00107\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R\u001f\u00109\u001a\u00020\u000f8F@\u0006¢\u0006\u0012\n\u0004\b9\u00100\u0012\u0004\b;\u0010<\u001a\u0004\b:\u00102R@\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001f\u0010=\u001a\u0004\b>\u0010(R\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010=R\u0018\u0010!\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u00100R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010?R\"\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0@8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DRD\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000e2\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000e8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\bE\u0010(R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010/\u001a\u0004\u0018\u00010\u00178\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010HR(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010/\u001a\u0004\u0018\u00010#8\u0006@BX\u000e¢\u0006\f\n\u0004\b$\u0010I\u001a\u0004\bJ\u0010K¨\u0006Q"}, d2 = {"Lcom/stripe/android/model/SourceParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Lcom/stripe/android/model/SourceParams$WeChatParams;", "weChatParams", "setWeChatParams", "(Lcom/stripe/android/model/SourceParams$WeChatParams;)Lcom/stripe/android/model/SourceParams;", "params", "", "typedEquals", "(Lcom/stripe/android/model/SourceParams;)Z", "", "amount", "setAmount", "(Ljava/lang/Long;)Lcom/stripe/android/model/SourceParams;", "", "", "", "apiParameterMap", "setApiParameterMap", "(Ljava/util/Map;)Lcom/stripe/android/model/SourceParams;", "currency", "setCurrency", "(Ljava/lang/String;)Lcom/stripe/android/model/SourceParams;", "Lcom/stripe/android/model/SourceParams$OwnerParams;", "owner", "setOwner", "(Lcom/stripe/android/model/SourceParams$OwnerParams;)Lcom/stripe/android/model/SourceParams;", "extraParams", "setExtraParams", "returnUrl", "setReturnUrl", "metaData", "setMetaData", "token", "setToken", "Lcom/stripe/android/model/Source$Usage;", "usage", "setUsage", "(Lcom/stripe/android/model/Source$Usage;)Lcom/stripe/android/model/SourceParams;", "toParamMap", "()Ljava/util/Map;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "<set-?>", "Ljava/lang/String;", "getReturnUrl", "()Ljava/lang/String;", "getCurrency", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "typeRaw", "getTypeRaw", "type", "getType", "getType$annotations", "()V", "Ljava/util/Map;", "getMetaData", "Lcom/stripe/android/model/SourceParams$WeChatParams;", "", "attribution", "Ljava/util/Set;", "getAttribution$payments_core_release", "()Ljava/util/Set;", "getApiParameterMap", "Lcom/stripe/android/model/SourceParams$OwnerParams;", "getOwner", "()Lcom/stripe/android/model/SourceParams$OwnerParams;", "Lcom/stripe/android/model/Source$Usage;", "getUsage", "()Lcom/stripe/android/model/Source$Usage;", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "Companion", "OwnerParams", "WeChatParams", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SourceParams.kt */
public final class SourceParams implements StripeParamsModel {
    public static final Companion Companion = new Companion((f) null);
    private static final String PARAM_AMOUNT = "amount";
    private static final String PARAM_BANK = "bank";
    private static final String PARAM_CALL_ID = "callid";
    private static final String PARAM_CARD = "card";
    private static final String PARAM_CART_ID = "cart_id";
    private static final String PARAM_CLIENT_SECRET = "client_secret";
    private static final String PARAM_COUNTRY = "country";
    private static final String PARAM_CURRENCY = "currency";
    private static final String PARAM_CVC = "cvc";
    private static final String PARAM_EXP_MONTH = "exp_month";
    private static final String PARAM_EXP_YEAR = "exp_year";
    private static final String PARAM_FLOW = "flow";
    private static final String PARAM_IBAN = "iban";
    private static final String PARAM_KLARNA = "klarna";
    private static final String PARAM_MASTERPASS = "masterpass";
    private static final String PARAM_METADATA = "metadata";
    private static final String PARAM_NUMBER = "number";
    private static final String PARAM_OWNER = "owner";
    private static final String PARAM_PREFERRED_LANGUAGE = "preferred_language";
    private static final String PARAM_REDIRECT = "redirect";
    private static final String PARAM_RETURN_URL = "return_url";
    private static final String PARAM_SOURCE_ORDER = "source_order";
    private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
    private static final String PARAM_TOKEN = "token";
    private static final String PARAM_TRANSACTION_ID = "transaction_id";
    private static final String PARAM_TYPE = "type";
    private static final String PARAM_USAGE = "usage";
    private static final String PARAM_VISA_CHECKOUT = "visa_checkout";
    private static final String PARAM_WECHAT = "wechat";
    private Long amount;
    private Map<String, ? extends Object> apiParameterMap;
    private final Set<String> attribution;
    private String currency;
    private Map<String, ? extends Object> extraParams;
    private Map<String, String> metaData;
    private OwnerParams owner;
    private String returnUrl;
    private String token;
    private final String type;
    private final String typeRaw;
    private Source.Usage usage;
    private WeChatParams weChatParams;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010$\n\u0002\b#\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bf\u0010gJ;\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJA\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ5\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JA\u0010\u0018\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ%\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010$\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b$\u0010(J\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b+\u0010,J5\u0010-\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b-\u0010\u0012J5\u0010.\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b.\u0010\u0012JC\u00100\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b0\u0010\u000bJ)\u00101\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b1\u00102JC\u00108\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u00010\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\b\b\u0001\u00107\u001a\u00020\u0004H\u0007¢\u0006\u0004\b8\u00109JS\u00108\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u00104\u001a\u0004\u0018\u00010\u00042\b\u00105\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b8\u0010:J7\u0010;\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\b\b\u0001\u00107\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b;\u0010\u0012J1\u0010=\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0004H\u0007¢\u0006\u0004\b=\u0010\u0012J\u0017\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u0004H\u0007¢\u0006\u0004\b?\u0010\u001bJ\u001f\u0010B\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u0004H\u0007¢\u0006\u0004\bB\u0010CJ%\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040E2\b\b\u0001\u0010D\u001a\u00020\u0004H\u0007¢\u0006\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bJ\u0010IR\u0016\u0010K\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bK\u0010IR\u0016\u0010L\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bL\u0010IR\u0016\u0010M\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bM\u0010IR\u0016\u0010N\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bN\u0010IR\u0016\u0010O\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bO\u0010IR\u0016\u0010P\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bP\u0010IR\u0016\u0010Q\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bQ\u0010IR\u0016\u0010R\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bR\u0010IR\u0016\u0010S\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bS\u0010IR\u0016\u0010T\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bT\u0010IR\u0016\u0010U\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bU\u0010IR\u0016\u0010V\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bV\u0010IR\u0016\u0010W\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bW\u0010IR\u0016\u0010X\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bX\u0010IR\u0016\u0010Y\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bY\u0010IR\u0016\u0010Z\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bZ\u0010IR\u0016\u0010[\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\b[\u0010IR\u0016\u0010\\\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\\\u0010IR\u0016\u0010]\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\b]\u0010IR\u0016\u0010^\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\b^\u0010IR\u0016\u0010_\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\b_\u0010IR\u0016\u0010`\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\b`\u0010IR\u0016\u0010a\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\ba\u0010IR\u0016\u0010b\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bb\u0010IR\u0016\u0010c\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bc\u0010IR\u0016\u0010d\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\bd\u0010IR\u0016\u0010e\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\be\u0010I¨\u0006h"}, d2 = {"Lcom/stripe/android/model/SourceParams$Companion;", "", "", "amount", "", "currency", "name", "email", "returnUrl", "Lcom/stripe/android/model/SourceParams;", "createP24Params", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SourceParams;", "createAlipayReusableParams", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SourceParams;", "createAlipaySingleUseParams", "weChatAppId", "statementDescriptor", "createWeChatPayParams", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SourceParams;", "Lcom/stripe/android/model/KlarnaSourceParams;", "klarnaParams", "createKlarna", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/KlarnaSourceParams;)Lcom/stripe/android/model/SourceParams;", "preferredLanguage", "createBancontactParams", "type", "createCustomParams", "(Ljava/lang/String;)Lcom/stripe/android/model/SourceParams;", "tokenId", "createSourceFromTokenParams", "", "attribution", "createSourceFromTokenParams$payments_core_release", "(Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/model/SourceParams;", "Lcom/stripe/android/model/Card;", "card", "createCardParams", "(Lcom/stripe/android/model/Card;)Lcom/stripe/android/model/SourceParams;", "Lcom/stripe/android/model/CardParams;", "cardParams", "(Lcom/stripe/android/model/CardParams;)Lcom/stripe/android/model/SourceParams;", "Lorg/json/JSONObject;", "googlePayPaymentData", "createCardParamsFromGooglePay", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceParams;", "createEPSParams", "createGiropayParams", "bank", "createIdealParams", "createMultibancoParams", "(JLjava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SourceParams;", "iban", "addressLine1", "city", "postalCode", "country", "createSepaDebitParams", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SourceParams;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SourceParams;", "createSofortParams", "cardId", "createThreeDSecureParams", "callId", "createVisaCheckoutParams", "transactionId", "cartId", "createMasterpassParams", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SourceParams;", "clientSecret", "", "createRetrieveSourceParams", "(Ljava/lang/String;)Ljava/util/Map;", "PARAM_AMOUNT", "Ljava/lang/String;", "PARAM_BANK", "PARAM_CALL_ID", "PARAM_CARD", "PARAM_CART_ID", "PARAM_CLIENT_SECRET", "PARAM_COUNTRY", "PARAM_CURRENCY", "PARAM_CVC", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_FLOW", "PARAM_IBAN", "PARAM_KLARNA", "PARAM_MASTERPASS", "PARAM_METADATA", "PARAM_NUMBER", "PARAM_OWNER", "PARAM_PREFERRED_LANGUAGE", "PARAM_REDIRECT", "PARAM_RETURN_URL", "PARAM_SOURCE_ORDER", "PARAM_STATEMENT_DESCRIPTOR", "PARAM_TOKEN", "PARAM_TRANSACTION_ID", "PARAM_TYPE", "PARAM_USAGE", "PARAM_VISA_CHECKOUT", "PARAM_WECHAT", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceParams.kt */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                KlarnaSourceParams.LineItem.Type.values();
                int[] iArr = new int[3];
                $EnumSwitchMapping$0 = iArr;
                iArr[KlarnaSourceParams.LineItem.Type.Sku.ordinal()] = 1;
                iArr[KlarnaSourceParams.LineItem.Type.Tax.ordinal()] = 2;
                iArr[KlarnaSourceParams.LineItem.Type.Shipping.ordinal()] = 3;
            }
        }

        private Companion() {
        }

        public static /* synthetic */ SourceParams createAlipayReusableParams$default(Companion companion, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return companion.createAlipayReusableParams(str, str2, str3, str4);
        }

        public static /* synthetic */ SourceParams createAlipaySingleUseParams$default(Companion companion, long j, String str, String str2, String str3, String str4, int i, Object obj) {
            return companion.createAlipaySingleUseParams(j, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, str4);
        }

        public static /* synthetic */ SourceParams createBancontactParams$default(Companion companion, long j, String str, String str2, String str3, String str4, int i, Object obj) {
            return companion.createBancontactParams(j, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public static /* synthetic */ SourceParams createEPSParams$default(Companion companion, long j, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createEPSParams(j, str, str2, str3);
        }

        public static /* synthetic */ SourceParams createGiropayParams$default(Companion companion, long j, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createGiropayParams(j, str, str2, str3);
        }

        public static /* synthetic */ SourceParams createIdealParams$default(Companion companion, long j, String str, String str2, String str3, String str4, int i, Object obj) {
            return companion.createIdealParams(j, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public static /* synthetic */ SourceParams createSofortParams$default(Companion companion, long j, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createSofortParams(j, str, str2, str3);
        }

        public static /* synthetic */ SourceParams createWeChatPayParams$default(Companion companion, long j, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createWeChatPayParams(j, str, str2, str3);
        }

        public final SourceParams createAlipayReusableParams(String str, String str2, String str3, String str4) {
            i.e(str, SourceParams.PARAM_CURRENCY);
            i.e(str4, "returnUrl");
            return new SourceParams("alipay", (Set) null, 2, (f) null).setCurrency(str).setReturnUrl(str4).setUsage(Source.Usage.Reusable).setOwner(new OwnerParams((Address) null, str3, str2, (String) null, 9, (f) null));
        }

        public final SourceParams createAlipaySingleUseParams(long j, String str, String str2, String str3, String str4) {
            i.e(str, SourceParams.PARAM_CURRENCY);
            i.e(str4, "returnUrl");
            return new SourceParams("alipay", (Set) null, 2, (f) null).setCurrency(str).setAmount(Long.valueOf(j)).setReturnUrl(str4).setOwner(new OwnerParams((Address) null, str3, str2, (String) null, 9, (f) null));
        }

        public final SourceParams createBancontactParams(long j, String str, String str2, String str3, String str4) {
            String str5 = str2;
            String str6 = str3;
            String str7 = str4;
            String str8 = str;
            i.e(str8, "name");
            i.e(str5, "returnUrl");
            Map map = null;
            SourceParams returnUrl = new SourceParams("bancontact", (Set) null, 2, (f) null).setCurrency(Source.EURO).setAmount(Long.valueOf(j)).setOwner(new OwnerParams((Address) null, (String) null, str8, (String) null, 11, (f) null)).setReturnUrl(str5);
            Map o = g.o();
            Map S2 = str6 != null ? h.S2(new Pair(SourceParams.PARAM_STATEMENT_DESCRIPTOR, str6)) : null;
            if (S2 == null) {
                S2 = g.o();
            }
            Map b0 = g.b0(o, S2);
            if (str7 != null) {
                map = h.S2(new Pair(SourceParams.PARAM_PREFERRED_LANGUAGE, str7));
            }
            if (map == null) {
                map = g.o();
            }
            Map b02 = g.b0(b0, map);
            if (!b02.isEmpty()) {
                returnUrl.setApiParameterMap(b02);
            }
            return returnUrl;
        }

        public final SourceParams createCardParams(Card card) {
            i.e(card, "card");
            return new SourceParams("card", card.getLoggingTokens$payments_core_release(), (f) null).setApiParameterMap(g.N(new Pair(SourceParams.PARAM_NUMBER, card.getNumber()), new Pair(SourceParams.PARAM_EXP_MONTH, card.getExpMonth()), new Pair(SourceParams.PARAM_EXP_YEAR, card.getExpYear()), new Pair(SourceParams.PARAM_CVC, card.getCvc()))).setOwner(new OwnerParams(new Address.Builder().setLine1(card.getAddressLine1()).setLine2(card.getAddressLine2()).setCity(card.getAddressCity()).setState(card.getAddressState()).setPostalCode(card.getAddressZip()).setCountry(card.getAddressCountry()).build(), (String) null, card.getName(), (String) null, 10, (f) null)).setMetaData(card.getMetadata());
        }

        public final SourceParams createCardParamsFromGooglePay(JSONObject jSONObject) throws JSONException {
            Set set;
            Card card;
            TokenizationMethod tokenizationMethod;
            i.e(jSONObject, "googlePayPaymentData");
            GooglePayResult fromJson = GooglePayResult.Companion.fromJson(jSONObject);
            Token token = fromJson.getToken();
            String str = null;
            String id = token != null ? token.getId() : null;
            if (id == null) {
                id = "";
            }
            if (!(token == null || (card = token.getCard()) == null || (tokenizationMethod = card.getTokenizationMethod()) == null)) {
                str = tokenizationMethod.toString();
            }
            if (str != null) {
                set = h.N3(str);
            } else {
                set = EmptySet.c;
            }
            return createSourceFromTokenParams$payments_core_release(id, set).setOwner(new OwnerParams(fromJson.getAddress(), fromJson.getEmail(), fromJson.getName(), fromJson.getPhoneNumber()));
        }

        public final SourceParams createCustomParams(String str) {
            i.e(str, "type");
            return new SourceParams(str, (Set) null, 2, (f) null);
        }

        public final SourceParams createEPSParams(long j, String str, String str2, String str3) {
            i.e(str, "name");
            i.e(str2, "returnUrl");
            Map map = null;
            SourceParams returnUrl = new SourceParams("eps", (Set) null, 2, (f) null).setCurrency(Source.EURO).setAmount(Long.valueOf(j)).setOwner(new OwnerParams((Address) null, (String) null, str, (String) null, 11, (f) null)).setReturnUrl(str2);
            if (str3 != null) {
                map = h.S2(new Pair(SourceParams.PARAM_STATEMENT_DESCRIPTOR, str3));
            }
            return returnUrl.setApiParameterMap(map);
        }

        public final SourceParams createGiropayParams(long j, String str, String str2, String str3) {
            i.e(str, "name");
            i.e(str2, "returnUrl");
            Map map = null;
            SourceParams returnUrl = new SourceParams("giropay", (Set) null, 2, (f) null).setCurrency(Source.EURO).setAmount(Long.valueOf(j)).setOwner(new OwnerParams((Address) null, (String) null, str, (String) null, 11, (f) null)).setReturnUrl(str2);
            if (str3 != null) {
                map = h.S2(new Pair(SourceParams.PARAM_STATEMENT_DESCRIPTOR, str3));
            }
            return returnUrl.setApiParameterMap(map);
        }

        public final SourceParams createIdealParams(long j, String str, String str2, String str3, String str4) {
            String str5 = str2;
            String str6 = str3;
            String str7 = str4;
            i.e(str5, "returnUrl");
            Map map = null;
            SourceParams owner = new SourceParams("ideal", (Set) null, 2, (f) null).setCurrency(Source.EURO).setAmount(Long.valueOf(j)).setReturnUrl(str5).setOwner(new OwnerParams((Address) null, (String) null, str, (String) null, 11, (f) null));
            Map o = g.o();
            Map S2 = str6 != null ? h.S2(new Pair(SourceParams.PARAM_STATEMENT_DESCRIPTOR, str6)) : null;
            if (S2 == null) {
                S2 = g.o();
            }
            Map b0 = g.b0(o, S2);
            if (str7 != null) {
                map = h.S2(new Pair(SourceParams.PARAM_BANK, str7));
            }
            if (map == null) {
                map = g.o();
            }
            Map b02 = g.b0(b0, map);
            if (!b02.isEmpty()) {
                owner.setApiParameterMap(b02);
            }
            return owner;
        }

        public final SourceParams createKlarna(String str, String str2, KlarnaSourceParams klarnaSourceParams) {
            SourceOrderParams.Item.Type type;
            String str3 = str;
            String str4 = str2;
            i.e(str3, "returnUrl");
            i.e(str4, SourceParams.PARAM_CURRENCY);
            i.e(klarnaSourceParams, "klarnaParams");
            int i = 0;
            for (KlarnaSourceParams.LineItem totalAmount : klarnaSourceParams.getLineItems()) {
                i += totalAmount.getTotalAmount();
            }
            List<KlarnaSourceParams.LineItem> lineItems = klarnaSourceParams.getLineItems();
            ArrayList arrayList = new ArrayList(h.K(lineItems, 10));
            for (KlarnaSourceParams.LineItem lineItem : lineItems) {
                int ordinal = lineItem.getItemType().ordinal();
                if (ordinal == 0) {
                    type = SourceOrderParams.Item.Type.Sku;
                } else if (ordinal == 1) {
                    type = SourceOrderParams.Item.Type.Tax;
                } else if (ordinal == 2) {
                    type = SourceOrderParams.Item.Type.Shipping;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                SourceOrderParams.Item item = r1;
                SourceOrderParams.Item item2 = new SourceOrderParams.Item(type, Integer.valueOf(lineItem.getTotalAmount()), str2, lineItem.getItemDescription(), (String) null, lineItem.getQuantity(), 16, (f) null);
                arrayList.add(item);
            }
            SourceOrderParams sourceOrderParams = new SourceOrderParams(arrayList, (SourceOrderParams.Shipping) null, 2, (f) null);
            return new SourceParams("klarna", (Set) null, 2, (f) null).setAmount(Long.valueOf((long) i)).setCurrency(str4).setReturnUrl(str3).setOwner(new OwnerParams(klarnaSourceParams.getBillingAddress(), klarnaSourceParams.getBillingEmail(), (String) null, klarnaSourceParams.getBillingPhone(), 4, (f) null)).setExtraParams(g.N(new Pair("klarna", klarnaSourceParams.toParamMap()), new Pair(SourceParams.PARAM_FLOW, Source.Flow.Redirect.getCode$payments_core_release()), new Pair(SourceParams.PARAM_SOURCE_ORDER, sourceOrderParams.toParamMap())));
        }

        public final SourceParams createMasterpassParams(String str, String str2) {
            i.e(str, "transactionId");
            i.e(str2, "cartId");
            return new SourceParams("card", (Set) null, 2, (f) null).setApiParameterMap(h.S2(new Pair(SourceParams.PARAM_MASTERPASS, g.N(new Pair(SourceParams.PARAM_TRANSACTION_ID, str), new Pair(SourceParams.PARAM_CART_ID, str2)))));
        }

        public final SourceParams createMultibancoParams(long j, String str, String str2) {
            i.e(str, "returnUrl");
            i.e(str2, "email");
            return new SourceParams("multibanco", (Set) null, 2, (f) null).setCurrency(Source.EURO).setAmount(Long.valueOf(j)).setReturnUrl(str).setOwner(new OwnerParams((Address) null, str2, (String) null, (String) null, 13, (f) null));
        }

        public final SourceParams createP24Params(long j, String str, String str2, String str3, String str4) {
            i.e(str, SourceParams.PARAM_CURRENCY);
            i.e(str3, "email");
            i.e(str4, "returnUrl");
            return new SourceParams("p24", (Set) null, 2, (f) null).setAmount(Long.valueOf(j)).setCurrency(str).setReturnUrl(str4).setOwner(new OwnerParams((Address) null, str3, str2, (String) null, 9, (f) null));
        }

        public final Map<String, String> createRetrieveSourceParams(String str) {
            i.e(str, "clientSecret");
            return h.S2(new Pair("client_secret", str));
        }

        public final SourceParams createSepaDebitParams(String str, String str2, String str3, String str4, String str5, String str6) {
            i.e(str, "name");
            i.e(str2, SourceParams.PARAM_IBAN);
            i.e(str4, "city");
            i.e(str5, "postalCode");
            i.e(str6, "country");
            return createSepaDebitParams(str, str2, (String) null, str3, str4, str5, str6);
        }

        public final SourceParams createSofortParams(long j, String str, String str2, String str3) {
            i.e(str, "returnUrl");
            i.e(str2, "country");
            Map S2 = h.S2(new Pair("country", str2));
            Map S22 = str3 != null ? h.S2(new Pair(SourceParams.PARAM_STATEMENT_DESCRIPTOR, str3)) : null;
            if (S22 == null) {
                S22 = g.o();
            }
            return new SourceParams("sofort", (Set) null, 2, (f) null).setCurrency(Source.EURO).setAmount(Long.valueOf(j)).setReturnUrl(str).setApiParameterMap(g.b0(S2, S22));
        }

        public final SourceParams createSourceFromTokenParams(String str) {
            i.e(str, "tokenId");
            return createSourceFromTokenParams$payments_core_release(str, EmptySet.c);
        }

        public final /* synthetic */ SourceParams createSourceFromTokenParams$payments_core_release(String str, Set<String> set) {
            i.e(str, "tokenId");
            i.e(set, "attribution");
            return new SourceParams("card", set, (f) null).setToken(str);
        }

        public final SourceParams createThreeDSecureParams(long j, String str, String str2, String str3) {
            i.e(str, SourceParams.PARAM_CURRENCY);
            i.e(str2, "returnUrl");
            i.e(str3, "cardId");
            return new SourceParams("three_d_secure", (Set) null, 2, (f) null).setCurrency(str).setAmount(Long.valueOf(j)).setReturnUrl(str2).setApiParameterMap(h.S2(new Pair("card", str3)));
        }

        public final SourceParams createVisaCheckoutParams(String str) {
            i.e(str, "callId");
            return new SourceParams("card", (Set) null, 2, (f) null).setApiParameterMap(h.S2(new Pair(SourceParams.PARAM_VISA_CHECKOUT, h.S2(new Pair(SourceParams.PARAM_CALL_ID, str)))));
        }

        public final SourceParams createWeChatPayParams(long j, String str, String str2, String str3) {
            i.e(str, SourceParams.PARAM_CURRENCY);
            i.e(str2, "weChatAppId");
            return new SourceParams("wechat", (Set) null, 2, (f) null).setCurrency(str).setAmount(Long.valueOf(j)).setWeChatParams(new WeChatParams(str2, str3));
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final SourceParams createSepaDebitParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            String str8 = str2;
            i.e(str, "name");
            i.e(str2, SourceParams.PARAM_IBAN);
            String str9 = str4;
            return new SourceParams("sepa_debit", (Set) null, 2, (f) null).setCurrency(Source.EURO).setOwner(new OwnerParams(new Address.Builder().setLine1(str4).setCity(str5).setPostalCode(str6).setCountry(str7).build(), str3, str, (String) null, 8, (f) null)).setApiParameterMap(h.S2(new Pair(SourceParams.PARAM_IBAN, str2)));
        }

        public final SourceParams createCardParams(CardParams cardParams) {
            i.e(cardParams, "cardParams");
            return new SourceParams("card", cardParams.getAttribution$payments_core_release(), (f) null).setApiParameterMap(g.N(new Pair(SourceParams.PARAM_NUMBER, cardParams.getNumber$payments_core_release()), new Pair(SourceParams.PARAM_EXP_MONTH, Integer.valueOf(cardParams.getExpMonth$payments_core_release())), new Pair(SourceParams.PARAM_EXP_YEAR, Integer.valueOf(cardParams.getExpYear$payments_core_release())), new Pair(SourceParams.PARAM_CVC, cardParams.getCvc$payments_core_release()))).setOwner(new OwnerParams(cardParams.getAddress(), (String) null, cardParams.getName(), (String) null, 10, (f) null)).setMetaData(cardParams.getMetadata());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\b\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B9\b\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b4\u00105J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0004\b\u0011\u0010\rJ@\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010+R$\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010\n\"\u0004\b.\u0010/R$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010(\u001a\u0004\b0\u0010\r\"\u0004\b1\u0010+R$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010(\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010+¨\u00067"}, d2 = {"Lcom/stripe/android/model/SourceParams$OwnerParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "Lcom/stripe/android/model/Address;", "component1$payments_core_release", "()Lcom/stripe/android/model/Address;", "component1", "component2$payments_core_release", "()Ljava/lang/String;", "component2", "component3$payments_core_release", "component3", "component4$payments_core_release", "component4", "address", "email", "name", "phone", "copy", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SourceParams$OwnerParams;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getEmail$payments_core_release", "setEmail$payments_core_release", "(Ljava/lang/String;)V", "Lcom/stripe/android/model/Address;", "getAddress$payments_core_release", "setAddress$payments_core_release", "(Lcom/stripe/android/model/Address;)V", "getName$payments_core_release", "setName$payments_core_release", "getPhone$payments_core_release", "setPhone$payments_core_release", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceParams.kt */
    public static final class OwnerParams implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<OwnerParams> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_ADDRESS = "address";
        @Deprecated
        private static final String PARAM_EMAIL = "email";
        @Deprecated
        private static final String PARAM_NAME = "name";
        @Deprecated
        private static final String PARAM_PHONE = "phone";
        private Address address;
        private String email;
        private String name;
        private String phone;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/SourceParams$OwnerParams$Companion;", "", "", "PARAM_ADDRESS", "Ljava/lang/String;", "PARAM_EMAIL", "PARAM_NAME", "PARAM_PHONE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<OwnerParams> {
            public final OwnerParams createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new OwnerParams(parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final OwnerParams[] newArray(int i) {
                return new OwnerParams[i];
            }
        }

        public OwnerParams() {
            this((Address) null, (String) null, (String) null, (String) null, 15, (f) null);
        }

        public OwnerParams(Address address2) {
            this(address2, (String) null, (String) null, (String) null, 14, (f) null);
        }

        public OwnerParams(Address address2, String str) {
            this(address2, str, (String) null, (String) null, 12, (f) null);
        }

        public OwnerParams(Address address2, String str, String str2) {
            this(address2, str, str2, (String) null, 8, (f) null);
        }

        public OwnerParams(Address address2, String str, String str2, String str3) {
            this.address = address2;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public static /* synthetic */ OwnerParams copy$default(OwnerParams ownerParams, Address address2, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                address2 = ownerParams.address;
            }
            if ((i & 2) != 0) {
                str = ownerParams.email;
            }
            if ((i & 4) != 0) {
                str2 = ownerParams.name;
            }
            if ((i & 8) != 0) {
                str3 = ownerParams.phone;
            }
            return ownerParams.copy(address2, str, str2, str3);
        }

        public final Address component1$payments_core_release() {
            return this.address;
        }

        public final String component2$payments_core_release() {
            return this.email;
        }

        public final String component3$payments_core_release() {
            return this.name;
        }

        public final String component4$payments_core_release() {
            return this.phone;
        }

        public final OwnerParams copy(Address address2, String str, String str2, String str3) {
            return new OwnerParams(address2, str, str2, str3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OwnerParams)) {
                return false;
            }
            OwnerParams ownerParams = (OwnerParams) obj;
            return i.a(this.address, ownerParams.address) && i.a(this.email, ownerParams.email) && i.a(this.name, ownerParams.name) && i.a(this.phone, ownerParams.phone);
        }

        public final Address getAddress$payments_core_release() {
            return this.address;
        }

        public final String getEmail$payments_core_release() {
            return this.email;
        }

        public final String getName$payments_core_release() {
            return this.name;
        }

        public final String getPhone$payments_core_release() {
            return this.phone;
        }

        public int hashCode() {
            Address address2 = this.address;
            int i = 0;
            int hashCode = (address2 != null ? address2.hashCode() : 0) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.phone;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public final void setAddress$payments_core_release(Address address2) {
            this.address = address2;
        }

        public final void setEmail$payments_core_release(String str) {
            this.email = str;
        }

        public final void setName$payments_core_release(String str) {
            this.name = str;
        }

        public final void setPhone$payments_core_release(String str) {
            this.phone = str;
        }

        public Map<String, Object> toParamMap() {
            Map o = g.o();
            Address address2 = this.address;
            Map map = null;
            Map S2 = address2 != null ? h.S2(new Pair("address", address2.toParamMap())) : null;
            if (S2 == null) {
                S2 = g.o();
            }
            Map b0 = g.b0(o, S2);
            String str = this.email;
            Map S22 = str != null ? h.S2(new Pair("email", str)) : null;
            if (S22 == null) {
                S22 = g.o();
            }
            Map b02 = g.b0(b0, S22);
            String str2 = this.name;
            Map S23 = str2 != null ? h.S2(new Pair("name", str2)) : null;
            if (S23 == null) {
                S23 = g.o();
            }
            Map b03 = g.b0(b02, S23);
            String str3 = this.phone;
            if (str3 != null) {
                map = h.S2(new Pair("phone", str3));
            }
            if (map == null) {
                map = g.o();
            }
            return g.b0(b03, map);
        }

        public String toString() {
            StringBuilder P0 = a.P0("OwnerParams(address=");
            P0.append(this.address);
            P0.append(", email=");
            P0.append(this.email);
            P0.append(", name=");
            P0.append(this.name);
            P0.append(", phone=");
            return a.y0(P0, this.phone, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            Address address2 = this.address;
            if (address2 != null) {
                parcel.writeInt(1);
                address2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OwnerParams(Address address2, String str, String str2, String str3, int i, f fVar) {
            this((i & 1) != 0 ? null : address2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u001f\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001e¨\u0006\""}, d2 = {"Lcom/stripe/android/model/SourceParams$WeChatParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "", "", "toParamMap", "()Ljava/util/Map;", "appId", "statementDescriptor", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SourceParams$WeChatParams;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceParams.kt */
    public static final class WeChatParams implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<WeChatParams> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        private static final String PARAM_APPID = "appid";
        private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
        private final String appId;
        private final String statementDescriptor;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/SourceParams$WeChatParams$Companion;", "", "", "PARAM_APPID", "Ljava/lang/String;", "PARAM_STATEMENT_DESCRIPTOR", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<WeChatParams> {
            public final WeChatParams createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new WeChatParams(parcel.readString(), parcel.readString());
            }

            public final WeChatParams[] newArray(int i) {
                return new WeChatParams[i];
            }
        }

        public WeChatParams() {
            this((String) null, (String) null, 3, (f) null);
        }

        public WeChatParams(String str, String str2) {
            this.appId = str;
            this.statementDescriptor = str2;
        }

        private final String component1() {
            return this.appId;
        }

        private final String component2() {
            return this.statementDescriptor;
        }

        public static /* synthetic */ WeChatParams copy$default(WeChatParams weChatParams, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = weChatParams.appId;
            }
            if ((i & 2) != 0) {
                str2 = weChatParams.statementDescriptor;
            }
            return weChatParams.copy(str, str2);
        }

        public final WeChatParams copy(String str, String str2) {
            return new WeChatParams(str, str2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WeChatParams)) {
                return false;
            }
            WeChatParams weChatParams = (WeChatParams) obj;
            return i.a(this.appId, weChatParams.appId) && i.a(this.statementDescriptor, weChatParams.statementDescriptor);
        }

        public int hashCode() {
            String str = this.appId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.statementDescriptor;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public Map<String, Object> toParamMap() {
            Map o = g.o();
            String str = this.appId;
            Map map = null;
            Map S2 = str != null ? h.S2(new Pair(PARAM_APPID, str)) : null;
            if (S2 == null) {
                S2 = g.o();
            }
            Map b0 = g.b0(o, S2);
            String str2 = this.statementDescriptor;
            if (str2 != null) {
                map = h.S2(new Pair(PARAM_STATEMENT_DESCRIPTOR, str2));
            }
            if (map == null) {
                map = g.o();
            }
            return g.b0(b0, map);
        }

        public String toString() {
            StringBuilder P0 = a.P0("WeChatParams(appId=");
            P0.append(this.appId);
            P0.append(", statementDescriptor=");
            return a.y0(P0, this.statementDescriptor, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.appId);
            parcel.writeString(this.statementDescriptor);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WeChatParams(String str, String str2, int i, f fVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    private SourceParams(String str, Set<String> set) {
        this.typeRaw = str;
        this.attribution = set;
        this.type = Source.Companion.asSourceType(str);
        this.extraParams = g.o();
    }

    public static final SourceParams createAlipayReusableParams(String str, String str2, String str3, String str4) {
        return Companion.createAlipayReusableParams(str, str2, str3, str4);
    }

    public static final SourceParams createAlipaySingleUseParams(long j, String str, String str2, String str3, String str4) {
        return Companion.createAlipaySingleUseParams(j, str, str2, str3, str4);
    }

    public static final SourceParams createBancontactParams(long j, String str, String str2, String str3, String str4) {
        return Companion.createBancontactParams(j, str, str2, str3, str4);
    }

    public static final SourceParams createCardParams(Card card) {
        return Companion.createCardParams(card);
    }

    public static final SourceParams createCardParams(CardParams cardParams) {
        return Companion.createCardParams(cardParams);
    }

    public static final SourceParams createCardParamsFromGooglePay(JSONObject jSONObject) throws JSONException {
        return Companion.createCardParamsFromGooglePay(jSONObject);
    }

    public static final SourceParams createCustomParams(String str) {
        return Companion.createCustomParams(str);
    }

    public static final SourceParams createEPSParams(long j, String str, String str2, String str3) {
        return Companion.createEPSParams(j, str, str2, str3);
    }

    public static final SourceParams createGiropayParams(long j, String str, String str2, String str3) {
        return Companion.createGiropayParams(j, str, str2, str3);
    }

    public static final SourceParams createIdealParams(long j, String str, String str2, String str3, String str4) {
        return Companion.createIdealParams(j, str, str2, str3, str4);
    }

    public static final SourceParams createKlarna(String str, String str2, KlarnaSourceParams klarnaSourceParams) {
        return Companion.createKlarna(str, str2, klarnaSourceParams);
    }

    public static final SourceParams createMasterpassParams(String str, String str2) {
        return Companion.createMasterpassParams(str, str2);
    }

    public static final SourceParams createMultibancoParams(long j, String str, String str2) {
        return Companion.createMultibancoParams(j, str, str2);
    }

    public static final SourceParams createP24Params(long j, String str, String str2, String str3, String str4) {
        return Companion.createP24Params(j, str, str2, str3, str4);
    }

    public static final Map<String, String> createRetrieveSourceParams(String str) {
        return Companion.createRetrieveSourceParams(str);
    }

    public static final SourceParams createSepaDebitParams(String str, String str2, String str3, String str4, String str5, String str6) {
        return Companion.createSepaDebitParams(str, str2, str3, str4, str5, str6);
    }

    public static final SourceParams createSepaDebitParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return Companion.createSepaDebitParams(str, str2, str3, str4, str5, str6, str7);
    }

    public static final SourceParams createSofortParams(long j, String str, String str2, String str3) {
        return Companion.createSofortParams(j, str, str2, str3);
    }

    public static final SourceParams createSourceFromTokenParams(String str) {
        return Companion.createSourceFromTokenParams(str);
    }

    public static final SourceParams createThreeDSecureParams(long j, String str, String str2, String str3) {
        return Companion.createThreeDSecureParams(j, str, str2, str3);
    }

    public static final SourceParams createVisaCheckoutParams(String str) {
        return Companion.createVisaCheckoutParams(str);
    }

    public static final SourceParams createWeChatPayParams(long j, String str, String str2, String str3) {
        return Companion.createWeChatPayParams(j, str, str2, str3);
    }

    public static /* synthetic */ void getType$annotations() {
    }

    /* access modifiers changed from: private */
    public final SourceParams setWeChatParams(WeChatParams weChatParams2) {
        this.weChatParams = weChatParams2;
        return this;
    }

    private final boolean typedEquals(SourceParams sourceParams) {
        return Objects.equals(this.amount, sourceParams.amount) && Objects.equals(this.apiParameterMap, sourceParams.apiParameterMap) && Objects.equals(this.currency, sourceParams.currency) && Objects.equals(this.typeRaw, sourceParams.typeRaw) && Objects.equals(this.owner, sourceParams.owner) && Objects.equals(this.metaData, sourceParams.metaData) && Objects.equals(this.returnUrl, sourceParams.returnUrl) && Objects.equals(this.extraParams, sourceParams.extraParams) && Objects.equals(this.token, sourceParams.token) && Objects.equals(this.usage, sourceParams.usage) && Objects.equals(this.type, sourceParams.type) && Objects.equals(this.weChatParams, sourceParams.weChatParams) && Objects.equals(this.attribution, sourceParams.attribution);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceParams) {
            return typedEquals((SourceParams) obj);
        }
        return false;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final Map<String, Object> getApiParameterMap() {
        return this.apiParameterMap;
    }

    public final Set<String> getAttribution$payments_core_release() {
        return this.attribution;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Map<String, String> getMetaData() {
        return this.metaData;
    }

    public final OwnerParams getOwner() {
        return this.owner;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final String getType() {
        return this.type;
    }

    public final String getTypeRaw() {
        return this.typeRaw;
    }

    public final Source.Usage getUsage() {
        return this.usage;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.amount, this.apiParameterMap, this.currency, this.typeRaw, this.owner, this.metaData, this.returnUrl, this.extraParams, this.token, this.usage, this.type, this.weChatParams});
    }

    public final SourceParams setAmount(Long l) {
        this.amount = l;
        return this;
    }

    public final SourceParams setApiParameterMap(Map<String, ? extends Object> map) {
        this.apiParameterMap = map;
        return this;
    }

    public final SourceParams setCurrency(String str) {
        i.e(str, PARAM_CURRENCY);
        this.currency = str;
        return this;
    }

    public final SourceParams setExtraParams(Map<String, ? extends Object> map) {
        i.e(map, "extraParams");
        this.extraParams = map;
        return this;
    }

    public final SourceParams setMetaData(Map<String, String> map) {
        this.metaData = map;
        return this;
    }

    public final SourceParams setOwner(OwnerParams ownerParams) {
        this.owner = ownerParams;
        return this;
    }

    public final SourceParams setReturnUrl(String str) {
        i.e(str, "returnUrl");
        this.returnUrl = str;
        return this;
    }

    public final SourceParams setToken(String str) {
        i.e(str, PARAM_TOKEN);
        this.token = str;
        return this;
    }

    public final SourceParams setUsage(Source.Usage usage2) {
        i.e(usage2, PARAM_USAGE);
        this.usage = usage2;
        return this;
    }

    public Map<String, Object> toParamMap() {
        Map S2 = h.S2(new Pair("type", this.typeRaw));
        Map<String, ? extends Object> map = this.apiParameterMap;
        Map map2 = null;
        Map S22 = map != null ? h.S2(new Pair(this.typeRaw, map)) : null;
        if (S22 == null) {
            S22 = g.o();
        }
        Map b0 = g.b0(S2, S22);
        Long l = this.amount;
        Map S23 = l != null ? h.S2(new Pair(PARAM_AMOUNT, Long.valueOf(l.longValue()))) : null;
        if (S23 == null) {
            S23 = g.o();
        }
        Map b02 = g.b0(b0, S23);
        String str = this.currency;
        Map S24 = str != null ? h.S2(new Pair(PARAM_CURRENCY, str)) : null;
        if (S24 == null) {
            S24 = g.o();
        }
        Map b03 = g.b0(b02, S24);
        OwnerParams ownerParams = this.owner;
        Map S25 = ownerParams != null ? h.S2(new Pair(PARAM_OWNER, ownerParams.toParamMap())) : null;
        if (S25 == null) {
            S25 = g.o();
        }
        Map b04 = g.b0(b03, S25);
        String str2 = this.returnUrl;
        Map S26 = str2 != null ? h.S2(new Pair(PARAM_REDIRECT, h.S2(new Pair("return_url", str2)))) : null;
        if (S26 == null) {
            S26 = g.o();
        }
        Map b05 = g.b0(b04, S26);
        Map<String, String> map3 = this.metaData;
        Map S27 = map3 != null ? h.S2(new Pair(PARAM_METADATA, map3)) : null;
        if (S27 == null) {
            S27 = g.o();
        }
        Map b06 = g.b0(b05, S27);
        String str3 = this.token;
        Map S28 = str3 != null ? h.S2(new Pair(PARAM_TOKEN, str3)) : null;
        if (S28 == null) {
            S28 = g.o();
        }
        Map b07 = g.b0(b06, S28);
        Source.Usage usage2 = this.usage;
        Map S29 = usage2 != null ? h.S2(new Pair(PARAM_USAGE, usage2.getCode$payments_core_release())) : null;
        if (S29 == null) {
            S29 = g.o();
        }
        Map<String, ? extends Object> b08 = g.b0(g.b0(b07, S29), this.extraParams);
        WeChatParams weChatParams2 = this.weChatParams;
        if (weChatParams2 != null) {
            map2 = h.S2(new Pair("wechat", weChatParams2.toParamMap()));
        }
        if (map2 == null) {
            map2 = g.o();
        }
        return g.b0(b08, map2);
    }

    public /* synthetic */ SourceParams(String str, Set set, f fVar) {
        this(str, set);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SourceParams(String str, Set set, int i, f fVar) {
        this(str, (i & 2) != 0 ? EmptySet.c : set);
    }
}
