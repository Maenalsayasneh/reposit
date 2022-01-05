package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.parsers.SourceJsonParser;
import i0.d.a.a.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\b\b\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0014\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001B£\u0002\b\u0000\u0012\b\u00108\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u001b\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010'\u0012\u0018\b\u0002\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010\u001b\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010,\u0012\u0006\u0010G\u001a\u00020\t\u0012\u0006\u0010H\u001a\u00020\t\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\t¢\u0006\u0006\b\u0001\u0010\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000bJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\b(\u0010)J \u0010+\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0012\u0010-\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b/\u0010\u000bJ\u0010\u00100\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b0\u0010\u000bJ\u0012\u00102\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00105\u001a\u0004\u0018\u000104HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b7\u0010\u000bJ®\u0002\u0010N\u001a\u00020\u00002\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u001b2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010'2\u0018\b\u0002\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010\u001b2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010G\u001a\u00020\t2\b\b\u0002\u0010H\u001a\u00020\t2\n\b\u0002\u0010I\u001a\u0004\u0018\u0001012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010L\u001a\u0004\u0018\u0001042\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bP\u0010\u000bJ\u0010\u0010R\u001a\u00020QHÖ\u0001¢\u0006\u0004\bR\u0010SJ\u001a\u0010U\u001a\u00020\u00182\b\u0010T\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020QHÖ\u0001¢\u0006\u0004\bW\u0010SJ \u0010\\\u001a\u00020[2\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020QHÖ\u0001¢\u0006\u0004\b\\\u0010]R\u001b\u0010D\u001a\u0004\u0018\u00010'8\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010^\u001a\u0004\b_\u0010)R\u001b\u0010M\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\bM\u0010`\u001a\u0004\ba\u0010\u000bR\u0018\u0010J\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010bR\u001b\u0010>\u001a\u0004\u0018\u00010\u00158\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010c\u001a\u0004\bd\u0010\u0017R\u001b\u0010C\u001a\u0004\u0018\u00010$8\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010e\u001a\u0004\bf\u0010&R\u0013\u0010h\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\bg\u0010\bR\u001b\u00109\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010i\u001a\u0004\bj\u0010\u000eR\u0013\u0010l\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R0\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u001b8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b@\u0010m\u0012\u0004\bo\u0010p\u001a\u0004\bn\u0010\u001dR\u001b\u0010<\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010i\u001a\u0004\bq\u0010\u000eR\u001b\u0010F\u001a\u0004\u0018\u00010,8\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010r\u001a\u0004\bs\u0010.R\u0018\u0010K\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010tR\u001b\u0010:\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010`\u001a\u0004\bu\u0010\u000bR\u001b\u0010B\u001a\u0004\u0018\u00010!8\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010v\u001a\u0004\bw\u0010#R\u001b\u0010L\u001a\u0004\u0018\u0001048\u0006@\u0006¢\u0006\f\n\u0004\bL\u0010x\u001a\u0004\by\u00106R\u001b\u0010;\u001a\u0004\u0018\u00010\u00108\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010z\u001a\u0004\b{\u0010\u0012R\u0019\u0010G\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010`\u001a\u0004\b|\u0010\u000bR\u001b\u0010I\u001a\u0004\u0018\u0001018\u0006@\u0006¢\u0006\f\n\u0004\bI\u0010}\u001a\u0004\b~\u00103R)\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010m\u001a\u0004\b\u0010\u001dR\u001a\u0010H\u001a\u00020\t8\u0006@\u0006¢\u0006\r\n\u0004\bH\u0010`\u001a\u0005\b\u0001\u0010\u000bR\u001d\u0010A\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006¢\u0006\u000e\n\u0005\bA\u0010\u0001\u001a\u0005\b\u0001\u0010 R\u001c\u0010=\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\r\n\u0004\b=\u0010`\u001a\u0005\b\u0001\u0010\u000bR\u001c\u0010?\u001a\u0004\u0018\u00010\u00188\u0006@\u0006¢\u0006\r\n\u0005\b?\u0010\u0001\u001a\u0004\b?\u0010\u001aR\u001f\u00108\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0004¢\u0006\r\n\u0004\b8\u0010`\u001a\u0005\b\u0001\u0010\u000b¨\u0006\u0001"}, d2 = {"Lcom/stripe/android/model/Source;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "Lcom/stripe/android/model/WeChat;", "component19", "()Lcom/stripe/android/model/WeChat;", "Lcom/stripe/android/model/Source$Klarna;", "component20", "()Lcom/stripe/android/model/Source$Klarna;", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/lang/Long;", "component3", "Lcom/stripe/android/model/Source$CodeVerification;", "component4", "()Lcom/stripe/android/model/Source$CodeVerification;", "component5", "component6", "Lcom/stripe/android/model/Source$Flow;", "component7", "()Lcom/stripe/android/model/Source$Flow;", "", "component8", "()Ljava/lang/Boolean;", "", "component9", "()Ljava/util/Map;", "Lcom/stripe/android/model/Source$Owner;", "component10", "()Lcom/stripe/android/model/Source$Owner;", "Lcom/stripe/android/model/Source$Receiver;", "component11", "()Lcom/stripe/android/model/Source$Receiver;", "Lcom/stripe/android/model/Source$Redirect;", "component12", "()Lcom/stripe/android/model/Source$Redirect;", "Lcom/stripe/android/model/Source$Status;", "component13", "()Lcom/stripe/android/model/Source$Status;", "", "component14", "Lcom/stripe/android/model/SourceTypeModel;", "component15", "()Lcom/stripe/android/model/SourceTypeModel;", "component16", "component17", "Lcom/stripe/android/model/Source$Usage;", "component18", "()Lcom/stripe/android/model/Source$Usage;", "Lcom/stripe/android/model/SourceOrder;", "component21", "()Lcom/stripe/android/model/SourceOrder;", "component22", "id", "amount", "clientSecret", "codeVerification", "created", "currency", "flow", "isLiveMode", "metaData", "owner", "receiver", "redirect", "status", "sourceTypeData", "sourceTypeModel", "type", "typeRaw", "usage", "_weChat", "_klarna", "sourceOrder", "statementDescriptor", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Ljava/util/Map;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)Lcom/stripe/android/model/Source;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/Source$Status;", "getStatus", "Ljava/lang/String;", "getStatementDescriptor", "Lcom/stripe/android/model/WeChat;", "Lcom/stripe/android/model/Source$Flow;", "getFlow", "Lcom/stripe/android/model/Source$Redirect;", "getRedirect", "getKlarna", "klarna", "Ljava/lang/Long;", "getAmount", "getWeChat", "weChat", "Ljava/util/Map;", "getMetaData", "getMetaData$annotations", "()V", "getCreated", "Lcom/stripe/android/model/SourceTypeModel;", "getSourceTypeModel", "Lcom/stripe/android/model/Source$Klarna;", "getClientSecret", "Lcom/stripe/android/model/Source$Receiver;", "getReceiver", "Lcom/stripe/android/model/SourceOrder;", "getSourceOrder", "Lcom/stripe/android/model/Source$CodeVerification;", "getCodeVerification", "getType", "Lcom/stripe/android/model/Source$Usage;", "getUsage", "getSourceTypeData", "getTypeRaw", "Lcom/stripe/android/model/Source$Owner;", "getOwner", "getCurrency", "Ljava/lang/Boolean;", "getId", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Ljava/util/Map;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)V", "Companion", "CodeVerification", "Flow", "Klarna", "Owner", "Receiver", "Redirect", "SourceType", "Status", "Usage", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Source.kt */
public final class Source implements StripeModel, StripePaymentSource {
    public static final Parcelable.Creator<Source> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    public static final String EURO = "eur";
    public static final String USD = "usd";
    private final Klarna _klarna;
    private final WeChat _weChat;
    private final Long amount;
    private final String clientSecret;
    private final CodeVerification codeVerification;
    private final Long created;
    private final String currency;
    private final Flow flow;
    private final String id;
    private final Boolean isLiveMode;
    private final Map<String, String> metaData;
    private final Owner owner;
    private final Receiver receiver;
    private final Redirect redirect;
    private final SourceOrder sourceOrder;
    private final Map<String, Object> sourceTypeData;
    private final SourceTypeModel sourceTypeModel;
    private final String statementDescriptor;
    private final Status status;
    private final String type;
    private final String typeRaw;
    private final Usage usage;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\u0001\"B\u001b\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b \u0010!J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0004J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004¨\u0006#"}, d2 = {"Lcom/stripe/android/model/Source$CodeVerification;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()I", "Lcom/stripe/android/model/Source$CodeVerification$Status;", "component2", "()Lcom/stripe/android/model/Source$CodeVerification$Status;", "attemptsRemaining", "status", "copy", "(ILcom/stripe/android/model/Source$CodeVerification$Status;)Lcom/stripe/android/model/Source$CodeVerification;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/Source$CodeVerification$Status;", "getStatus", "I", "getAttemptsRemaining", "<init>", "(ILcom/stripe/android/model/Source$CodeVerification$Status;)V", "Status", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Source.kt */
    public static final class CodeVerification implements StripeModel {
        public static final Parcelable.Creator<CodeVerification> CREATOR = new Creator();
        private final int attemptsRemaining;
        private final Status status;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<CodeVerification> {
            public final CodeVerification createFromParcel(Parcel parcel) {
                Status status;
                i.e(parcel, "in");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    status = (Status) Enum.valueOf(Status.class, parcel.readString());
                } else {
                    status = null;
                }
                return new CodeVerification(readInt, status);
            }

            public final CodeVerification[] newArray(int i) {
                return new CodeVerification[i];
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/Source$CodeVerification$Status;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Pending", "Succeeded", "Failed", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: Source.kt */
        public enum Status {
            Pending("pending"),
            Succeeded("succeeded"),
            Failed("failed");
            
            public static final Companion Companion = null;
            /* access modifiers changed from: private */
            public final String code;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/Source$CodeVerification$Status$Companion;", "", "", "code", "Lcom/stripe/android/model/Source$CodeVerification$Status;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/model/Source$CodeVerification$Status;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: Source.kt */
            public static final class Companion {
                private Companion() {
                }

                public final Status fromCode(String str) {
                    Status[] values = Status.values();
                    for (int i = 0; i < 3; i++) {
                        Status status = values[i];
                        if (i.a(status.code, str)) {
                            return status;
                        }
                    }
                    return null;
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }
            }

            /* access modifiers changed from: public */
            static {
                Companion = new Companion((f) null);
            }

            private Status(String str) {
                this.code = str;
            }

            public String toString() {
                return this.code;
            }
        }

        public CodeVerification(int i, Status status2) {
            this.attemptsRemaining = i;
            this.status = status2;
        }

        public static /* synthetic */ CodeVerification copy$default(CodeVerification codeVerification, int i, Status status2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = codeVerification.attemptsRemaining;
            }
            if ((i2 & 2) != 0) {
                status2 = codeVerification.status;
            }
            return codeVerification.copy(i, status2);
        }

        public final int component1() {
            return this.attemptsRemaining;
        }

        public final Status component2() {
            return this.status;
        }

        public final CodeVerification copy(int i, Status status2) {
            return new CodeVerification(i, status2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CodeVerification)) {
                return false;
            }
            CodeVerification codeVerification = (CodeVerification) obj;
            return this.attemptsRemaining == codeVerification.attemptsRemaining && i.a(this.status, codeVerification.status);
        }

        public final int getAttemptsRemaining() {
            return this.attemptsRemaining;
        }

        public final Status getStatus() {
            return this.status;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.attemptsRemaining) * 31;
            Status status2 = this.status;
            return hashCode + (status2 != null ? status2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder P0 = a.P0("CodeVerification(attemptsRemaining=");
            P0.append(this.attemptsRemaining);
            P0.append(", status=");
            P0.append(this.status);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeInt(this.attemptsRemaining);
            Status status2 = this.status;
            if (status2 != null) {
                parcel.writeInt(1);
                parcel.writeString(status2.name());
                return;
            }
            parcel.writeInt(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/Source$Companion;", "", "Lorg/json/JSONObject;", "jsonObject", "Lcom/stripe/android/model/Source;", "fromJson", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;", "", "sourceType", "asSourceType", "(Ljava/lang/String;)Ljava/lang/String;", "EURO", "Ljava/lang/String;", "USD", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Source.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String asSourceType(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1920743119:
                        if (str.equals("bancontact")) {
                            return "bancontact";
                        }
                        break;
                    case -1414960566:
                        if (str.equals("alipay")) {
                            return "alipay";
                        }
                        break;
                    case -896955097:
                        if (str.equals("sofort")) {
                            return "sofort";
                        }
                        break;
                    case -825238221:
                        if (str.equals("three_d_secure")) {
                            return "three_d_secure";
                        }
                        break;
                    case -791770330:
                        if (str.equals("wechat")) {
                            return "wechat";
                        }
                        break;
                    case -284840886:
                        boolean equals = str.equals("unknown");
                        break;
                    case 100648:
                        if (str.equals("eps")) {
                            return "eps";
                        }
                        break;
                    case 109234:
                        if (str.equals("p24")) {
                            return "p24";
                        }
                        break;
                    case 3046160:
                        if (str.equals("card")) {
                            return "card";
                        }
                        break;
                    case 38358441:
                        if (str.equals("giropay")) {
                            return "giropay";
                        }
                        break;
                    case 100048981:
                        if (str.equals("ideal")) {
                            return "ideal";
                        }
                        break;
                    case 1251821346:
                        if (str.equals("multibanco")) {
                            return "multibanco";
                        }
                        break;
                    case 1636477296:
                        if (str.equals("sepa_debit")) {
                            return "sepa_debit";
                        }
                        break;
                }
            }
            return "unknown";
        }

        public final Source fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new SourceJsonParser().parse(jSONObject);
            }
            return null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<Source> {
        public final Source createFromParcel(Parcel parcel) {
            Boolean bool;
            LinkedHashMap linkedHashMap;
            Receiver receiver;
            LinkedHashMap linkedHashMap2;
            Redirect redirect;
            Parcel parcel2 = parcel;
            i.e(parcel2, "in");
            String readString = parcel.readString();
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            String readString2 = parcel.readString();
            CodeVerification createFromParcel = parcel.readInt() != 0 ? CodeVerification.CREATOR.createFromParcel(parcel2) : null;
            Long valueOf2 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            String readString3 = parcel.readString();
            Flow flow = parcel.readInt() != 0 ? (Flow) Enum.valueOf(Flow.class, parcel.readString()) : null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                while (readInt != 0) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    readInt--;
                }
            } else {
                linkedHashMap = null;
            }
            Owner createFromParcel2 = parcel.readInt() != 0 ? Owner.CREATOR.createFromParcel(parcel2) : null;
            Receiver createFromParcel3 = parcel.readInt() != 0 ? Receiver.CREATOR.createFromParcel(parcel2) : null;
            Redirect createFromParcel4 = parcel.readInt() != 0 ? Redirect.CREATOR.createFromParcel(parcel2) : null;
            Status status = parcel.readInt() != 0 ? (Status) Enum.valueOf(Status.class, parcel.readString()) : null;
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt2);
                while (readInt2 != 0) {
                    linkedHashMap3.put(parcel.readString(), parcel2.readValue(Object.class.getClassLoader()));
                    readInt2--;
                    createFromParcel4 = createFromParcel4;
                    createFromParcel3 = createFromParcel3;
                }
                receiver = createFromParcel3;
                redirect = createFromParcel4;
                linkedHashMap2 = linkedHashMap3;
            } else {
                receiver = createFromParcel3;
                redirect = createFromParcel4;
                linkedHashMap2 = null;
            }
            return new Source(readString, valueOf, readString2, createFromParcel, valueOf2, readString3, flow, bool, linkedHashMap, createFromParcel2, receiver, redirect, status, linkedHashMap2, (SourceTypeModel) parcel2.readParcelable(Source.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Usage) Enum.valueOf(Usage.class, parcel.readString()) : null, parcel.readInt() != 0 ? WeChat.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? Klarna.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? SourceOrder.CREATOR.createFromParcel(parcel2) : null, parcel.readString());
        }

        public final Source[] newArray(int i) {
            return new Source[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/Source$Flow;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "getCode$payments_core_release", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Redirect", "Receiver", "CodeVerification", "None", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Source.kt */
    public enum Flow {
        Redirect("redirect"),
        Receiver("receiver"),
        CodeVerification("code_verification"),
        None("none");
        
        public static final Companion Companion = null;
        private final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/Source$Flow$Companion;", "", "", "code", "Lcom/stripe/android/model/Source$Flow;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/model/Source$Flow;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: Source.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Flow fromCode(String str) {
                Flow[] values = Flow.values();
                for (int i = 0; i < 4; i++) {
                    Flow flow = values[i];
                    if (i.a(flow.getCode$payments_core_release(), str)) {
                        return flow;
                    }
                }
                return null;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((f) null);
        }

        private Flow(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }

        public String toString() {
            return this.code;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\bP\u0010QJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u0004J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u0004J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0004J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0004J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0004J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0004J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016Jð\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0004J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020-HÖ\u0001¢\u0006\u0004\b5\u0010/J \u0010:\u001a\u0002092\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020-HÖ\u0001¢\u0006\u0004\b:\u0010;R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010<\u001a\u0004\b=\u0010\u0004R\u001b\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010<\u001a\u0004\b>\u0010\u0004R\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010?\u001a\u0004\b@\u0010\u0016R\u001b\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010<\u001a\u0004\bA\u0010\u0004R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010<\u001a\u0004\bB\u0010\u0004R\u001b\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010<\u001a\u0004\bC\u0010\u0004R\u001b\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010<\u001a\u0004\bD\u0010\u0004R\u001b\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010<\u001a\u0004\bE\u0010\u0004R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010<\u001a\u0004\bF\u0010\u0004R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010<\u001a\u0004\bG\u0010\u0004R\u001b\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010<\u001a\u0004\bH\u0010\u0004R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010<\u001a\u0004\bI\u0010\u0004R\u001b\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010<\u001a\u0004\bJ\u0010\u0004R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010<\u001a\u0004\bK\u0010\u0004R\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\bL\u0010\u0004R\u001b\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\bM\u0010\u0004R\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010?\u001a\u0004\bN\u0010\u0016R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010<\u001a\u0004\bO\u0010\u0004¨\u0006R"}, d2 = {"Lcom/stripe/android/model/Source$Klarna;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "", "component17", "()Ljava/util/Set;", "component18", "firstName", "lastName", "purchaseCountry", "clientToken", "payNowAssetUrlsDescriptive", "payNowAssetUrlsStandard", "payNowName", "payNowRedirectUrl", "payLaterAssetUrlsDescriptive", "payLaterAssetUrlsStandard", "payLaterName", "payLaterRedirectUrl", "payOverTimeAssetUrlsDescriptive", "payOverTimeAssetUrlsStandard", "payOverTimeName", "payOverTimeRedirectUrl", "paymentMethodCategories", "customPaymentMethods", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)Lcom/stripe/android/model/Source$Klarna;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFirstName", "getPayLaterAssetUrlsDescriptive", "Ljava/util/Set;", "getPaymentMethodCategories", "getPayLaterAssetUrlsStandard", "getPurchaseCountry", "getPayLaterName", "getPayOverTimeName", "getPayOverTimeRedirectUrl", "getPayNowName", "getPayNowAssetUrlsStandard", "getPayOverTimeAssetUrlsStandard", "getPayNowAssetUrlsDescriptive", "getPayOverTimeAssetUrlsDescriptive", "getClientToken", "getPayNowRedirectUrl", "getPayLaterRedirectUrl", "getCustomPaymentMethods", "getLastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Source.kt */
    public static final class Klarna implements StripeModel {
        public static final Parcelable.Creator<Klarna> CREATOR = new Creator();
        private final String clientToken;
        private final Set<String> customPaymentMethods;
        private final String firstName;
        private final String lastName;
        private final String payLaterAssetUrlsDescriptive;
        private final String payLaterAssetUrlsStandard;
        private final String payLaterName;
        private final String payLaterRedirectUrl;
        private final String payNowAssetUrlsDescriptive;
        private final String payNowAssetUrlsStandard;
        private final String payNowName;
        private final String payNowRedirectUrl;
        private final String payOverTimeAssetUrlsDescriptive;
        private final String payOverTimeAssetUrlsStandard;
        private final String payOverTimeName;
        private final String payOverTimeRedirectUrl;
        private final Set<String> paymentMethodCategories;
        private final String purchaseCountry;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Klarna> {
            public final Klarna createFromParcel(Parcel parcel) {
                String str;
                i.e(parcel, "in");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
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
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                int readInt = parcel.readInt();
                String str2 = readString14;
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                while (true) {
                    str = readString13;
                    if (readInt == 0) {
                        break;
                    }
                    linkedHashSet.add(parcel.readString());
                    readInt--;
                    readString13 = str;
                }
                int readInt2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
                while (true) {
                    LinkedHashSet linkedHashSet3 = linkedHashSet;
                    if (readInt2 != 0) {
                        linkedHashSet2.add(parcel.readString());
                        readInt2--;
                        linkedHashSet = linkedHashSet3;
                    } else {
                        return new Klarna(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, str, str2, readString15, readString16, linkedHashSet3, linkedHashSet2);
                    }
                }
            }

            public final Klarna[] newArray(int i) {
                return new Klarna[i];
            }
        }

        public Klarna(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set<String> set, Set<String> set2) {
            Set<String> set3 = set;
            Set<String> set4 = set2;
            i.e(set3, "paymentMethodCategories");
            i.e(set4, "customPaymentMethods");
            this.firstName = str;
            this.lastName = str2;
            this.purchaseCountry = str3;
            this.clientToken = str4;
            this.payNowAssetUrlsDescriptive = str5;
            this.payNowAssetUrlsStandard = str6;
            this.payNowName = str7;
            this.payNowRedirectUrl = str8;
            this.payLaterAssetUrlsDescriptive = str9;
            this.payLaterAssetUrlsStandard = str10;
            this.payLaterName = str11;
            this.payLaterRedirectUrl = str12;
            this.payOverTimeAssetUrlsDescriptive = str13;
            this.payOverTimeAssetUrlsStandard = str14;
            this.payOverTimeName = str15;
            this.payOverTimeRedirectUrl = str16;
            this.paymentMethodCategories = set3;
            this.customPaymentMethods = set4;
        }

        public static /* synthetic */ Klarna copy$default(Klarna klarna, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set set, Set set2, int i, Object obj) {
            Klarna klarna2 = klarna;
            int i2 = i;
            return klarna.copy((i2 & 1) != 0 ? klarna2.firstName : str, (i2 & 2) != 0 ? klarna2.lastName : str2, (i2 & 4) != 0 ? klarna2.purchaseCountry : str3, (i2 & 8) != 0 ? klarna2.clientToken : str4, (i2 & 16) != 0 ? klarna2.payNowAssetUrlsDescriptive : str5, (i2 & 32) != 0 ? klarna2.payNowAssetUrlsStandard : str6, (i2 & 64) != 0 ? klarna2.payNowName : str7, (i2 & 128) != 0 ? klarna2.payNowRedirectUrl : str8, (i2 & 256) != 0 ? klarna2.payLaterAssetUrlsDescriptive : str9, (i2 & 512) != 0 ? klarna2.payLaterAssetUrlsStandard : str10, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? klarna2.payLaterName : str11, (i2 & 2048) != 0 ? klarna2.payLaterRedirectUrl : str12, (i2 & 4096) != 0 ? klarna2.payOverTimeAssetUrlsDescriptive : str13, (i2 & 8192) != 0 ? klarna2.payOverTimeAssetUrlsStandard : str14, (i2 & 16384) != 0 ? klarna2.payOverTimeName : str15, (i2 & 32768) != 0 ? klarna2.payOverTimeRedirectUrl : str16, (i2 & 65536) != 0 ? klarna2.paymentMethodCategories : set, (i2 & 131072) != 0 ? klarna2.customPaymentMethods : set2);
        }

        public final String component1() {
            return this.firstName;
        }

        public final String component10() {
            return this.payLaterAssetUrlsStandard;
        }

        public final String component11() {
            return this.payLaterName;
        }

        public final String component12() {
            return this.payLaterRedirectUrl;
        }

        public final String component13() {
            return this.payOverTimeAssetUrlsDescriptive;
        }

        public final String component14() {
            return this.payOverTimeAssetUrlsStandard;
        }

        public final String component15() {
            return this.payOverTimeName;
        }

        public final String component16() {
            return this.payOverTimeRedirectUrl;
        }

        public final Set<String> component17() {
            return this.paymentMethodCategories;
        }

        public final Set<String> component18() {
            return this.customPaymentMethods;
        }

        public final String component2() {
            return this.lastName;
        }

        public final String component3() {
            return this.purchaseCountry;
        }

        public final String component4() {
            return this.clientToken;
        }

        public final String component5() {
            return this.payNowAssetUrlsDescriptive;
        }

        public final String component6() {
            return this.payNowAssetUrlsStandard;
        }

        public final String component7() {
            return this.payNowName;
        }

        public final String component8() {
            return this.payNowRedirectUrl;
        }

        public final String component9() {
            return this.payLaterAssetUrlsDescriptive;
        }

        public final Klarna copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set<String> set, Set<String> set2) {
            String str17 = str;
            i.e(set, "paymentMethodCategories");
            i.e(set2, "customPaymentMethods");
            return new Klarna(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, set, set2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Klarna)) {
                return false;
            }
            Klarna klarna = (Klarna) obj;
            return i.a(this.firstName, klarna.firstName) && i.a(this.lastName, klarna.lastName) && i.a(this.purchaseCountry, klarna.purchaseCountry) && i.a(this.clientToken, klarna.clientToken) && i.a(this.payNowAssetUrlsDescriptive, klarna.payNowAssetUrlsDescriptive) && i.a(this.payNowAssetUrlsStandard, klarna.payNowAssetUrlsStandard) && i.a(this.payNowName, klarna.payNowName) && i.a(this.payNowRedirectUrl, klarna.payNowRedirectUrl) && i.a(this.payLaterAssetUrlsDescriptive, klarna.payLaterAssetUrlsDescriptive) && i.a(this.payLaterAssetUrlsStandard, klarna.payLaterAssetUrlsStandard) && i.a(this.payLaterName, klarna.payLaterName) && i.a(this.payLaterRedirectUrl, klarna.payLaterRedirectUrl) && i.a(this.payOverTimeAssetUrlsDescriptive, klarna.payOverTimeAssetUrlsDescriptive) && i.a(this.payOverTimeAssetUrlsStandard, klarna.payOverTimeAssetUrlsStandard) && i.a(this.payOverTimeName, klarna.payOverTimeName) && i.a(this.payOverTimeRedirectUrl, klarna.payOverTimeRedirectUrl) && i.a(this.paymentMethodCategories, klarna.paymentMethodCategories) && i.a(this.customPaymentMethods, klarna.customPaymentMethods);
        }

        public final String getClientToken() {
            return this.clientToken;
        }

        public final Set<String> getCustomPaymentMethods() {
            return this.customPaymentMethods;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getPayLaterAssetUrlsDescriptive() {
            return this.payLaterAssetUrlsDescriptive;
        }

        public final String getPayLaterAssetUrlsStandard() {
            return this.payLaterAssetUrlsStandard;
        }

        public final String getPayLaterName() {
            return this.payLaterName;
        }

        public final String getPayLaterRedirectUrl() {
            return this.payLaterRedirectUrl;
        }

        public final String getPayNowAssetUrlsDescriptive() {
            return this.payNowAssetUrlsDescriptive;
        }

        public final String getPayNowAssetUrlsStandard() {
            return this.payNowAssetUrlsStandard;
        }

        public final String getPayNowName() {
            return this.payNowName;
        }

        public final String getPayNowRedirectUrl() {
            return this.payNowRedirectUrl;
        }

        public final String getPayOverTimeAssetUrlsDescriptive() {
            return this.payOverTimeAssetUrlsDescriptive;
        }

        public final String getPayOverTimeAssetUrlsStandard() {
            return this.payOverTimeAssetUrlsStandard;
        }

        public final String getPayOverTimeName() {
            return this.payOverTimeName;
        }

        public final String getPayOverTimeRedirectUrl() {
            return this.payOverTimeRedirectUrl;
        }

        public final Set<String> getPaymentMethodCategories() {
            return this.paymentMethodCategories;
        }

        public final String getPurchaseCountry() {
            return this.purchaseCountry;
        }

        public int hashCode() {
            String str = this.firstName;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.lastName;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.purchaseCountry;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.clientToken;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.payNowAssetUrlsDescriptive;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.payNowAssetUrlsStandard;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.payNowName;
            int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            String str8 = this.payNowRedirectUrl;
            int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.payLaterAssetUrlsDescriptive;
            int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
            String str10 = this.payLaterAssetUrlsStandard;
            int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
            String str11 = this.payLaterName;
            int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
            String str12 = this.payLaterRedirectUrl;
            int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
            String str13 = this.payOverTimeAssetUrlsDescriptive;
            int hashCode13 = (hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
            String str14 = this.payOverTimeAssetUrlsStandard;
            int hashCode14 = (hashCode13 + (str14 != null ? str14.hashCode() : 0)) * 31;
            String str15 = this.payOverTimeName;
            int hashCode15 = (hashCode14 + (str15 != null ? str15.hashCode() : 0)) * 31;
            String str16 = this.payOverTimeRedirectUrl;
            int hashCode16 = (hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31;
            Set<String> set = this.paymentMethodCategories;
            int hashCode17 = (hashCode16 + (set != null ? set.hashCode() : 0)) * 31;
            Set<String> set2 = this.customPaymentMethods;
            if (set2 != null) {
                i = set2.hashCode();
            }
            return hashCode17 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Klarna(firstName=");
            P0.append(this.firstName);
            P0.append(", lastName=");
            P0.append(this.lastName);
            P0.append(", purchaseCountry=");
            P0.append(this.purchaseCountry);
            P0.append(", clientToken=");
            P0.append(this.clientToken);
            P0.append(", payNowAssetUrlsDescriptive=");
            P0.append(this.payNowAssetUrlsDescriptive);
            P0.append(", payNowAssetUrlsStandard=");
            P0.append(this.payNowAssetUrlsStandard);
            P0.append(", payNowName=");
            P0.append(this.payNowName);
            P0.append(", payNowRedirectUrl=");
            P0.append(this.payNowRedirectUrl);
            P0.append(", payLaterAssetUrlsDescriptive=");
            P0.append(this.payLaterAssetUrlsDescriptive);
            P0.append(", payLaterAssetUrlsStandard=");
            P0.append(this.payLaterAssetUrlsStandard);
            P0.append(", payLaterName=");
            P0.append(this.payLaterName);
            P0.append(", payLaterRedirectUrl=");
            P0.append(this.payLaterRedirectUrl);
            P0.append(", payOverTimeAssetUrlsDescriptive=");
            P0.append(this.payOverTimeAssetUrlsDescriptive);
            P0.append(", payOverTimeAssetUrlsStandard=");
            P0.append(this.payOverTimeAssetUrlsStandard);
            P0.append(", payOverTimeName=");
            P0.append(this.payOverTimeName);
            P0.append(", payOverTimeRedirectUrl=");
            P0.append(this.payOverTimeRedirectUrl);
            P0.append(", paymentMethodCategories=");
            P0.append(this.paymentMethodCategories);
            P0.append(", customPaymentMethods=");
            P0.append(this.customPaymentMethods);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.firstName);
            parcel.writeString(this.lastName);
            parcel.writeString(this.purchaseCountry);
            parcel.writeString(this.clientToken);
            parcel.writeString(this.payNowAssetUrlsDescriptive);
            parcel.writeString(this.payNowAssetUrlsStandard);
            parcel.writeString(this.payNowName);
            parcel.writeString(this.payNowRedirectUrl);
            parcel.writeString(this.payLaterAssetUrlsDescriptive);
            parcel.writeString(this.payLaterAssetUrlsStandard);
            parcel.writeString(this.payLaterName);
            parcel.writeString(this.payLaterRedirectUrl);
            parcel.writeString(this.payOverTimeAssetUrlsDescriptive);
            parcel.writeString(this.payOverTimeAssetUrlsStandard);
            parcel.writeString(this.payOverTimeName);
            parcel.writeString(this.payOverTimeRedirectUrl);
            Set<String> set = this.paymentMethodCategories;
            parcel.writeInt(set.size());
            for (String writeString : set) {
                parcel.writeString(writeString);
            }
            Set<String> set2 = this.customPaymentMethods;
            parcel.writeInt(set2.size());
            for (String writeString2 : set2) {
                parcel.writeString(writeString2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001BY\b\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b2\u00103J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u0007Jp\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b)\u0010\u0007R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b*\u0010\u0007R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b+\u0010\u0007R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010\u0004R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b.\u0010\u0007R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b/\u0010\u0007R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b0\u0010\u0007R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b1\u0010\u0004¨\u00064"}, d2 = {"Lcom/stripe/android/model/Source$Owner;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/Address;", "component1", "()Lcom/stripe/android/model/Address;", "", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "address", "email", "name", "phone", "verifiedAddress", "verifiedEmail", "verifiedName", "verifiedPhone", "copy", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Source$Owner;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPhone", "getVerifiedEmail", "getVerifiedPhone", "Lcom/stripe/android/model/Address;", "getAddress", "getEmail", "getVerifiedName", "getName", "getVerifiedAddress", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Source.kt */
    public static final class Owner implements StripeModel {
        public static final Parcelable.Creator<Owner> CREATOR = new Creator();
        private final Address address;
        private final String email;
        private final String name;
        private final String phone;
        private final Address verifiedAddress;
        private final String verifiedEmail;
        private final String verifiedName;
        private final String verifiedPhone;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Owner> {
            public final Owner createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Owner(parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final Owner[] newArray(int i) {
                return new Owner[i];
            }
        }

        public Owner(Address address2, String str, String str2, String str3, Address address3, String str4, String str5, String str6) {
            this.address = address2;
            this.email = str;
            this.name = str2;
            this.phone = str3;
            this.verifiedAddress = address3;
            this.verifiedEmail = str4;
            this.verifiedName = str5;
            this.verifiedPhone = str6;
        }

        public static /* synthetic */ Owner copy$default(Owner owner, Address address2, String str, String str2, String str3, Address address3, String str4, String str5, String str6, int i, Object obj) {
            Owner owner2 = owner;
            int i2 = i;
            return owner.copy((i2 & 1) != 0 ? owner2.address : address2, (i2 & 2) != 0 ? owner2.email : str, (i2 & 4) != 0 ? owner2.name : str2, (i2 & 8) != 0 ? owner2.phone : str3, (i2 & 16) != 0 ? owner2.verifiedAddress : address3, (i2 & 32) != 0 ? owner2.verifiedEmail : str4, (i2 & 64) != 0 ? owner2.verifiedName : str5, (i2 & 128) != 0 ? owner2.verifiedPhone : str6);
        }

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final Address component5() {
            return this.verifiedAddress;
        }

        public final String component6() {
            return this.verifiedEmail;
        }

        public final String component7() {
            return this.verifiedName;
        }

        public final String component8() {
            return this.verifiedPhone;
        }

        public final Owner copy(Address address2, String str, String str2, String str3, Address address3, String str4, String str5, String str6) {
            return new Owner(address2, str, str2, str3, address3, str4, str5, str6);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Owner)) {
                return false;
            }
            Owner owner = (Owner) obj;
            return i.a(this.address, owner.address) && i.a(this.email, owner.email) && i.a(this.name, owner.name) && i.a(this.phone, owner.phone) && i.a(this.verifiedAddress, owner.verifiedAddress) && i.a(this.verifiedEmail, owner.verifiedEmail) && i.a(this.verifiedName, owner.verifiedName) && i.a(this.verifiedPhone, owner.verifiedPhone);
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final Address getVerifiedAddress() {
            return this.verifiedAddress;
        }

        public final String getVerifiedEmail() {
            return this.verifiedEmail;
        }

        public final String getVerifiedName() {
            return this.verifiedName;
        }

        public final String getVerifiedPhone() {
            return this.verifiedPhone;
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
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Address address3 = this.verifiedAddress;
            int hashCode5 = (hashCode4 + (address3 != null ? address3.hashCode() : 0)) * 31;
            String str4 = this.verifiedEmail;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.verifiedName;
            int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.verifiedPhone;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return hashCode7 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Owner(address=");
            P0.append(this.address);
            P0.append(", email=");
            P0.append(this.email);
            P0.append(", name=");
            P0.append(this.name);
            P0.append(", phone=");
            P0.append(this.phone);
            P0.append(", verifiedAddress=");
            P0.append(this.verifiedAddress);
            P0.append(", verifiedEmail=");
            P0.append(this.verifiedEmail);
            P0.append(", verifiedName=");
            P0.append(this.verifiedName);
            P0.append(", verifiedPhone=");
            return a.y0(P0, this.verifiedPhone, ")");
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
            Address address3 = this.verifiedAddress;
            if (address3 != null) {
                parcel.writeInt(1);
                address3.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.verifiedEmail);
            parcel.writeString(this.verifiedName);
            parcel.writeString(this.verifiedPhone);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B+\b\u0000\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J:\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u0004R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010\u0007R\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b$\u0010\u0007R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b%\u0010\u0007¨\u0006("}, d2 = {"Lcom/stripe/android/model/Source$Receiver;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "", "component2", "()J", "component3", "component4", "address", "amountCharged", "amountReceived", "amountReturned", "copy", "(Ljava/lang/String;JJJ)Lcom/stripe/android/model/Source$Receiver;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAddress", "J", "getAmountCharged", "getAmountReturned", "getAmountReceived", "<init>", "(Ljava/lang/String;JJJ)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Source.kt */
    public static final class Receiver implements StripeModel {
        public static final Parcelable.Creator<Receiver> CREATOR = new Creator();
        private final String address;
        private final long amountCharged;
        private final long amountReceived;
        private final long amountReturned;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Receiver> {
            public final Receiver createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Receiver(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            }

            public final Receiver[] newArray(int i) {
                return new Receiver[i];
            }
        }

        public Receiver(String str, long j, long j2, long j3) {
            this.address = str;
            this.amountCharged = j;
            this.amountReceived = j2;
            this.amountReturned = j3;
        }

        public static /* synthetic */ Receiver copy$default(Receiver receiver, String str, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = receiver.address;
            }
            if ((i & 2) != 0) {
                j = receiver.amountCharged;
            }
            long j4 = j;
            if ((i & 4) != 0) {
                j2 = receiver.amountReceived;
            }
            long j5 = j2;
            if ((i & 8) != 0) {
                j3 = receiver.amountReturned;
            }
            return receiver.copy(str, j4, j5, j3);
        }

        public final String component1() {
            return this.address;
        }

        public final long component2() {
            return this.amountCharged;
        }

        public final long component3() {
            return this.amountReceived;
        }

        public final long component4() {
            return this.amountReturned;
        }

        public final Receiver copy(String str, long j, long j2, long j3) {
            return new Receiver(str, j, j2, j3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Receiver)) {
                return false;
            }
            Receiver receiver = (Receiver) obj;
            return i.a(this.address, receiver.address) && this.amountCharged == receiver.amountCharged && this.amountReceived == receiver.amountReceived && this.amountReturned == receiver.amountReturned;
        }

        public final String getAddress() {
            return this.address;
        }

        public final long getAmountCharged() {
            return this.amountCharged;
        }

        public final long getAmountReceived() {
            return this.amountReceived;
        }

        public final long getAmountReturned() {
            return this.amountReturned;
        }

        public int hashCode() {
            String str = this.address;
            int hashCode = str != null ? str.hashCode() : 0;
            int hashCode2 = Long.hashCode(this.amountCharged);
            return Long.hashCode(this.amountReturned) + ((Long.hashCode(this.amountReceived) + ((hashCode2 + (hashCode * 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder P0 = a.P0("Receiver(address=");
            P0.append(this.address);
            P0.append(", amountCharged=");
            P0.append(this.amountCharged);
            P0.append(", amountReceived=");
            P0.append(this.amountReceived);
            P0.append(", amountReturned=");
            P0.append(this.amountReturned);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.address);
            parcel.writeLong(this.amountCharged);
            parcel.writeLong(this.amountReceived);
            parcel.writeLong(this.amountReturned);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\u0001%B%\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010\u0007R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\u0004R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\"\u0010\u0004¨\u0006&"}, d2 = {"Lcom/stripe/android/model/Source$Redirect;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "Lcom/stripe/android/model/Source$Redirect$Status;", "component2", "()Lcom/stripe/android/model/Source$Redirect$Status;", "component3", "returnUrl", "status", "url", "copy", "(Ljava/lang/String;Lcom/stripe/android/model/Source$Redirect$Status;Ljava/lang/String;)Lcom/stripe/android/model/Source$Redirect;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/Source$Redirect$Status;", "getStatus", "Ljava/lang/String;", "getUrl", "getReturnUrl", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/Source$Redirect$Status;Ljava/lang/String;)V", "Status", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Source.kt */
    public static final class Redirect implements StripeModel {
        public static final Parcelable.Creator<Redirect> CREATOR = new Creator();
        private final String returnUrl;
        private final Status status;
        private final String url;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Redirect> {
            public final Redirect createFromParcel(Parcel parcel) {
                Status status;
                i.e(parcel, "in");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    status = (Status) Enum.valueOf(Status.class, parcel.readString());
                } else {
                    status = null;
                }
                return new Redirect(readString, status, parcel.readString());
            }

            public final Redirect[] newArray(int i) {
                return new Redirect[i];
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/Source$Redirect$Status;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Pending", "Succeeded", "NotRequired", "Failed", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: Source.kt */
        public enum Status {
            Pending("pending"),
            Succeeded("succeeded"),
            NotRequired("not_required"),
            Failed("failed");
            
            public static final Companion Companion = null;
            /* access modifiers changed from: private */
            public final String code;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/Source$Redirect$Status$Companion;", "", "", "code", "Lcom/stripe/android/model/Source$Redirect$Status;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/model/Source$Redirect$Status;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: Source.kt */
            public static final class Companion {
                private Companion() {
                }

                public final Status fromCode(String str) {
                    Status[] values = Status.values();
                    for (int i = 0; i < 4; i++) {
                        Status status = values[i];
                        if (i.a(status.code, str)) {
                            return status;
                        }
                    }
                    return null;
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }
            }

            /* access modifiers changed from: public */
            static {
                Companion = new Companion((f) null);
            }

            private Status(String str) {
                this.code = str;
            }

            public String toString() {
                return this.code;
            }
        }

        public Redirect(String str, Status status2, String str2) {
            this.returnUrl = str;
            this.status = status2;
            this.url = str2;
        }

        public static /* synthetic */ Redirect copy$default(Redirect redirect, String str, Status status2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = redirect.returnUrl;
            }
            if ((i & 2) != 0) {
                status2 = redirect.status;
            }
            if ((i & 4) != 0) {
                str2 = redirect.url;
            }
            return redirect.copy(str, status2, str2);
        }

        public final String component1() {
            return this.returnUrl;
        }

        public final Status component2() {
            return this.status;
        }

        public final String component3() {
            return this.url;
        }

        public final Redirect copy(String str, Status status2, String str2) {
            return new Redirect(str, status2, str2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) obj;
            return i.a(this.returnUrl, redirect.returnUrl) && i.a(this.status, redirect.status) && i.a(this.url, redirect.url);
        }

        public final String getReturnUrl() {
            return this.returnUrl;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.returnUrl;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Status status2 = this.status;
            int hashCode2 = (hashCode + (status2 != null ? status2.hashCode() : 0)) * 31;
            String str2 = this.url;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Redirect(returnUrl=");
            P0.append(this.returnUrl);
            P0.append(", status=");
            P0.append(this.status);
            P0.append(", url=");
            return a.y0(P0, this.url, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.returnUrl);
            Status status2 = this.status;
            if (status2 != null) {
                parcel.writeInt(1);
                parcel.writeString(status2.name());
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.url);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/Source$SourceType;", "", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: Source.kt */
    public @interface SourceType {
        public static final String ALIPAY = "alipay";
        public static final String BANCONTACT = "bancontact";
        public static final String CARD = "card";
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String EPS = "eps";
        public static final String GIROPAY = "giropay";
        public static final String IDEAL = "ideal";
        public static final String KLARNA = "klarna";
        public static final String MULTIBANCO = "multibanco";
        public static final String P24 = "p24";
        public static final String SEPA_DEBIT = "sepa_debit";
        public static final String SOFORT = "sofort";
        public static final String THREE_D_SECURE = "three_d_secure";
        public static final String UNKNOWN = "unknown";
        public static final String WECHAT = "wechat";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/Source$SourceType$Companion;", "", "", "GIROPAY", "Ljava/lang/String;", "SEPA_DEBIT", "EPS", "KLARNA", "THREE_D_SECURE", "BANCONTACT", "SOFORT", "WECHAT", "IDEAL", "P24", "ALIPAY", "MULTIBANCO", "CARD", "UNKNOWN", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: Source.kt */
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String ALIPAY = "alipay";
            public static final String BANCONTACT = "bancontact";
            public static final String CARD = "card";
            public static final String EPS = "eps";
            public static final String GIROPAY = "giropay";
            public static final String IDEAL = "ideal";
            public static final String KLARNA = "klarna";
            public static final String MULTIBANCO = "multibanco";
            public static final String P24 = "p24";
            public static final String SEPA_DEBIT = "sepa_debit";
            public static final String SOFORT = "sofort";
            public static final String THREE_D_SECURE = "three_d_secure";
            public static final String UNKNOWN = "unknown";
            public static final String WECHAT = "wechat";

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/Source$Status;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Canceled", "Chargeable", "Consumed", "Failed", "Pending", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Source.kt */
    public enum Status {
        Canceled("canceled"),
        Chargeable("chargeable"),
        Consumed("consumed"),
        Failed("failed"),
        Pending("pending");
        
        public static final Companion Companion = null;
        /* access modifiers changed from: private */
        public final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/Source$Status$Companion;", "", "", "code", "Lcom/stripe/android/model/Source$Status;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/model/Source$Status;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: Source.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Status fromCode(String str) {
                Status[] values = Status.values();
                for (int i = 0; i < 5; i++) {
                    Status status = values[i];
                    if (i.a(status.code, str)) {
                        return status;
                    }
                }
                return null;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((f) null);
        }

        private Status(String str) {
            this.code = str;
        }

        public String toString() {
            return this.code;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/Source$Usage;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "getCode$payments_core_release", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Reusable", "SingleUse", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Source.kt */
    public enum Usage {
        Reusable("reusable"),
        SingleUse("single_use");
        
        public static final Companion Companion = null;
        private final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/Source$Usage$Companion;", "", "", "code", "Lcom/stripe/android/model/Source$Usage;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/model/Source$Usage;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: Source.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Usage fromCode(String str) {
                Usage[] values = Usage.values();
                for (int i = 0; i < 2; i++) {
                    Usage usage = values[i];
                    if (i.a(usage.getCode$payments_core_release(), str)) {
                        return usage;
                    }
                }
                return null;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((f) null);
        }

        private Usage(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }

        public String toString() {
            return this.code;
        }
    }

    public Source(String str, Long l, String str2, CodeVerification codeVerification2, Long l2, String str3, Flow flow2, Boolean bool, Map<String, String> map, Owner owner2, Receiver receiver2, Redirect redirect2, Status status2, Map<String, ? extends Object> map2, SourceTypeModel sourceTypeModel2, String str4, String str5, Usage usage2, WeChat weChat, Klarna klarna, SourceOrder sourceOrder2, String str6) {
        String str7 = str4;
        String str8 = str5;
        i.e(str7, "type");
        i.e(str8, "typeRaw");
        this.id = str;
        this.amount = l;
        this.clientSecret = str2;
        this.codeVerification = codeVerification2;
        this.created = l2;
        this.currency = str3;
        this.flow = flow2;
        this.isLiveMode = bool;
        this.metaData = map;
        this.owner = owner2;
        this.receiver = receiver2;
        this.redirect = redirect2;
        this.status = status2;
        this.sourceTypeData = map2;
        this.sourceTypeModel = sourceTypeModel2;
        this.type = str7;
        this.typeRaw = str8;
        this.usage = usage2;
        this._weChat = weChat;
        this._klarna = klarna;
        this.sourceOrder = sourceOrder2;
        this.statementDescriptor = str6;
    }

    public static final String asSourceType(String str) {
        return Companion.asSourceType(str);
    }

    private final WeChat component19() {
        return this._weChat;
    }

    private final Klarna component20() {
        return this._klarna;
    }

    public static /* synthetic */ Source copy$default(Source source, String str, Long l, String str2, CodeVerification codeVerification2, Long l2, String str3, Flow flow2, Boolean bool, Map map, Owner owner2, Receiver receiver2, Redirect redirect2, Status status2, Map map2, SourceTypeModel sourceTypeModel2, String str4, String str5, Usage usage2, WeChat weChat, Klarna klarna, SourceOrder sourceOrder2, String str6, int i, Object obj) {
        Source source2 = source;
        int i2 = i;
        return source.copy((i2 & 1) != 0 ? source.getId() : str, (i2 & 2) != 0 ? source2.amount : l, (i2 & 4) != 0 ? source2.clientSecret : str2, (i2 & 8) != 0 ? source2.codeVerification : codeVerification2, (i2 & 16) != 0 ? source2.created : l2, (i2 & 32) != 0 ? source2.currency : str3, (i2 & 64) != 0 ? source2.flow : flow2, (i2 & 128) != 0 ? source2.isLiveMode : bool, (i2 & 256) != 0 ? source2.metaData : map, (i2 & 512) != 0 ? source2.owner : owner2, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? source2.receiver : receiver2, (i2 & 2048) != 0 ? source2.redirect : redirect2, (i2 & 4096) != 0 ? source2.status : status2, (i2 & 8192) != 0 ? source2.sourceTypeData : map2, (i2 & 16384) != 0 ? source2.sourceTypeModel : sourceTypeModel2, (i2 & 32768) != 0 ? source2.type : str4, (i2 & 65536) != 0 ? source2.typeRaw : str5, (i2 & 131072) != 0 ? source2.usage : usage2, (i2 & 262144) != 0 ? source2._weChat : weChat, (i2 & 524288) != 0 ? source2._klarna : klarna, (i2 & 1048576) != 0 ? source2.sourceOrder : sourceOrder2, (i2 & 2097152) != 0 ? source2.statementDescriptor : str6);
    }

    public static final Source fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public static /* synthetic */ void getMetaData$annotations() {
    }

    public final String component1() {
        return getId();
    }

    public final Owner component10() {
        return this.owner;
    }

    public final Receiver component11() {
        return this.receiver;
    }

    public final Redirect component12() {
        return this.redirect;
    }

    public final Status component13() {
        return this.status;
    }

    public final Map<String, Object> component14() {
        return this.sourceTypeData;
    }

    public final SourceTypeModel component15() {
        return this.sourceTypeModel;
    }

    public final String component16() {
        return this.type;
    }

    public final String component17() {
        return this.typeRaw;
    }

    public final Usage component18() {
        return this.usage;
    }

    public final Long component2() {
        return this.amount;
    }

    public final SourceOrder component21() {
        return this.sourceOrder;
    }

    public final String component22() {
        return this.statementDescriptor;
    }

    public final String component3() {
        return this.clientSecret;
    }

    public final CodeVerification component4() {
        return this.codeVerification;
    }

    public final Long component5() {
        return this.created;
    }

    public final String component6() {
        return this.currency;
    }

    public final Flow component7() {
        return this.flow;
    }

    public final Boolean component8() {
        return this.isLiveMode;
    }

    public final Map<String, String> component9() {
        return this.metaData;
    }

    public final Source copy(String str, Long l, String str2, CodeVerification codeVerification2, Long l2, String str3, Flow flow2, Boolean bool, Map<String, String> map, Owner owner2, Receiver receiver2, Redirect redirect2, Status status2, Map<String, ? extends Object> map2, SourceTypeModel sourceTypeModel2, String str4, String str5, Usage usage2, WeChat weChat, Klarna klarna, SourceOrder sourceOrder2, String str6) {
        String str7 = str;
        i.e(str4, "type");
        i.e(str5, "typeRaw");
        return new Source(str, l, str2, codeVerification2, l2, str3, flow2, bool, map, owner2, receiver2, redirect2, status2, map2, sourceTypeModel2, str4, str5, usage2, weChat, klarna, sourceOrder2, str6);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Source)) {
            return false;
        }
        Source source = (Source) obj;
        return i.a(getId(), source.getId()) && i.a(this.amount, source.amount) && i.a(this.clientSecret, source.clientSecret) && i.a(this.codeVerification, source.codeVerification) && i.a(this.created, source.created) && i.a(this.currency, source.currency) && i.a(this.flow, source.flow) && i.a(this.isLiveMode, source.isLiveMode) && i.a(this.metaData, source.metaData) && i.a(this.owner, source.owner) && i.a(this.receiver, source.receiver) && i.a(this.redirect, source.redirect) && i.a(this.status, source.status) && i.a(this.sourceTypeData, source.sourceTypeData) && i.a(this.sourceTypeModel, source.sourceTypeModel) && i.a(this.type, source.type) && i.a(this.typeRaw, source.typeRaw) && i.a(this.usage, source.usage) && i.a(this._weChat, source._weChat) && i.a(this._klarna, source._klarna) && i.a(this.sourceOrder, source.sourceOrder) && i.a(this.statementDescriptor, source.statementDescriptor);
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final CodeVerification getCodeVerification() {
        return this.codeVerification;
    }

    public final Long getCreated() {
        return this.created;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Flow getFlow() {
        return this.flow;
    }

    public String getId() {
        return this.id;
    }

    public final Klarna getKlarna() {
        if (i.a("klarna", this.type)) {
            Klarna klarna = this._klarna;
            if (klarna != null) {
                return klarna;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalStateException("Source type must be 'klarna'".toString());
    }

    public final Map<String, String> getMetaData() {
        return this.metaData;
    }

    public final Owner getOwner() {
        return this.owner;
    }

    public final Receiver getReceiver() {
        return this.receiver;
    }

    public final Redirect getRedirect() {
        return this.redirect;
    }

    public final SourceOrder getSourceOrder() {
        return this.sourceOrder;
    }

    public final Map<String, Object> getSourceTypeData() {
        return this.sourceTypeData;
    }

    public final SourceTypeModel getSourceTypeModel() {
        return this.sourceTypeModel;
    }

    public final String getStatementDescriptor() {
        return this.statementDescriptor;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final String getTypeRaw() {
        return this.typeRaw;
    }

    public final Usage getUsage() {
        return this.usage;
    }

    public final WeChat getWeChat() {
        if (i.a("wechat", this.type)) {
            WeChat weChat = this._weChat;
            if (weChat != null) {
                return weChat;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalStateException("Source type must be 'wechat'".toString());
    }

    public int hashCode() {
        String id2 = getId();
        int i = 0;
        int hashCode = (id2 != null ? id2.hashCode() : 0) * 31;
        Long l = this.amount;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.clientSecret;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        CodeVerification codeVerification2 = this.codeVerification;
        int hashCode4 = (hashCode3 + (codeVerification2 != null ? codeVerification2.hashCode() : 0)) * 31;
        Long l2 = this.created;
        int hashCode5 = (hashCode4 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str2 = this.currency;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Flow flow2 = this.flow;
        int hashCode7 = (hashCode6 + (flow2 != null ? flow2.hashCode() : 0)) * 31;
        Boolean bool = this.isLiveMode;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        Map<String, String> map = this.metaData;
        int hashCode9 = (hashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Owner owner2 = this.owner;
        int hashCode10 = (hashCode9 + (owner2 != null ? owner2.hashCode() : 0)) * 31;
        Receiver receiver2 = this.receiver;
        int hashCode11 = (hashCode10 + (receiver2 != null ? receiver2.hashCode() : 0)) * 31;
        Redirect redirect2 = this.redirect;
        int hashCode12 = (hashCode11 + (redirect2 != null ? redirect2.hashCode() : 0)) * 31;
        Status status2 = this.status;
        int hashCode13 = (hashCode12 + (status2 != null ? status2.hashCode() : 0)) * 31;
        Map<String, Object> map2 = this.sourceTypeData;
        int hashCode14 = (hashCode13 + (map2 != null ? map2.hashCode() : 0)) * 31;
        SourceTypeModel sourceTypeModel2 = this.sourceTypeModel;
        int hashCode15 = (hashCode14 + (sourceTypeModel2 != null ? sourceTypeModel2.hashCode() : 0)) * 31;
        String str3 = this.type;
        int hashCode16 = (hashCode15 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.typeRaw;
        int hashCode17 = (hashCode16 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Usage usage2 = this.usage;
        int hashCode18 = (hashCode17 + (usage2 != null ? usage2.hashCode() : 0)) * 31;
        WeChat weChat = this._weChat;
        int hashCode19 = (hashCode18 + (weChat != null ? weChat.hashCode() : 0)) * 31;
        Klarna klarna = this._klarna;
        int hashCode20 = (hashCode19 + (klarna != null ? klarna.hashCode() : 0)) * 31;
        SourceOrder sourceOrder2 = this.sourceOrder;
        int hashCode21 = (hashCode20 + (sourceOrder2 != null ? sourceOrder2.hashCode() : 0)) * 31;
        String str5 = this.statementDescriptor;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode21 + i;
    }

    public final Boolean isLiveMode() {
        return this.isLiveMode;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Source(id=");
        P0.append(getId());
        P0.append(", amount=");
        P0.append(this.amount);
        P0.append(", clientSecret=");
        P0.append(this.clientSecret);
        P0.append(", codeVerification=");
        P0.append(this.codeVerification);
        P0.append(", created=");
        P0.append(this.created);
        P0.append(", currency=");
        P0.append(this.currency);
        P0.append(", flow=");
        P0.append(this.flow);
        P0.append(", isLiveMode=");
        P0.append(this.isLiveMode);
        P0.append(", metaData=");
        P0.append(this.metaData);
        P0.append(", owner=");
        P0.append(this.owner);
        P0.append(", receiver=");
        P0.append(this.receiver);
        P0.append(", redirect=");
        P0.append(this.redirect);
        P0.append(", status=");
        P0.append(this.status);
        P0.append(", sourceTypeData=");
        P0.append(this.sourceTypeData);
        P0.append(", sourceTypeModel=");
        P0.append(this.sourceTypeModel);
        P0.append(", type=");
        P0.append(this.type);
        P0.append(", typeRaw=");
        P0.append(this.typeRaw);
        P0.append(", usage=");
        P0.append(this.usage);
        P0.append(", _weChat=");
        P0.append(this._weChat);
        P0.append(", _klarna=");
        P0.append(this._klarna);
        P0.append(", sourceOrder=");
        P0.append(this.sourceOrder);
        P0.append(", statementDescriptor=");
        return a.y0(P0, this.statementDescriptor, ")");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.Map$Entry, java.lang.Object] */
    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.id);
        Long l = this.amount;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.clientSecret);
        CodeVerification codeVerification2 = this.codeVerification;
        if (codeVerification2 != null) {
            parcel.writeInt(1);
            codeVerification2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Long l2 = this.created;
        if (l2 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.currency);
        Flow flow2 = this.flow;
        if (flow2 != null) {
            parcel.writeInt(1);
            parcel.writeString(flow2.name());
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.isLiveMode;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Map<String, String> map = this.metaData;
        if (map != null) {
            Iterator l1 = a.l1(parcel, 1, map);
            while (l1.hasNext()) {
                ? next = l1.next();
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
        } else {
            parcel.writeInt(0);
        }
        Owner owner2 = this.owner;
        if (owner2 != null) {
            parcel.writeInt(1);
            owner2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Receiver receiver2 = this.receiver;
        if (receiver2 != null) {
            parcel.writeInt(1);
            receiver2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Redirect redirect2 = this.redirect;
        if (redirect2 != null) {
            parcel.writeInt(1);
            redirect2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Status status2 = this.status;
        if (status2 != null) {
            parcel.writeInt(1);
            parcel.writeString(status2.name());
        } else {
            parcel.writeInt(0);
        }
        Map<String, Object> map2 = this.sourceTypeData;
        if (map2 != null) {
            Iterator l12 = a.l1(parcel, 1, map2);
            while (l12.hasNext()) {
                ? next2 = l12.next();
                parcel.writeString((String) next2.getKey());
                parcel.writeValue(next2.getValue());
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.sourceTypeModel, i);
        parcel.writeString(this.type);
        parcel.writeString(this.typeRaw);
        Usage usage2 = this.usage;
        if (usage2 != null) {
            parcel.writeInt(1);
            parcel.writeString(usage2.name());
        } else {
            parcel.writeInt(0);
        }
        WeChat weChat = this._weChat;
        if (weChat != null) {
            parcel.writeInt(1);
            weChat.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Klarna klarna = this._klarna;
        if (klarna != null) {
            parcel.writeInt(1);
            klarna.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        SourceOrder sourceOrder2 = this.sourceOrder;
        if (sourceOrder2 != null) {
            parcel.writeInt(1);
            sourceOrder2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.statementDescriptor);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Source(java.lang.String r27, java.lang.Long r28, java.lang.String r29, com.stripe.android.model.Source.CodeVerification r30, java.lang.Long r31, java.lang.String r32, com.stripe.android.model.Source.Flow r33, java.lang.Boolean r34, java.util.Map r35, com.stripe.android.model.Source.Owner r36, com.stripe.android.model.Source.Receiver r37, com.stripe.android.model.Source.Redirect r38, com.stripe.android.model.Source.Status r39, java.util.Map r40, com.stripe.android.model.SourceTypeModel r41, java.lang.String r42, java.lang.String r43, com.stripe.android.model.Source.Usage r44, com.stripe.android.model.WeChat r45, com.stripe.android.model.Source.Klarna r46, com.stripe.android.model.SourceOrder r47, java.lang.String r48, int r49, m0.n.b.f r50) {
        /*
            r26 = this;
            r0 = r49
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r28
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r29
        L_0x0013:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0019
            r7 = r2
            goto L_0x001b
        L_0x0019:
            r7 = r30
        L_0x001b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0021
            r8 = r2
            goto L_0x0023
        L_0x0021:
            r8 = r31
        L_0x0023:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0029
            r9 = r2
            goto L_0x002b
        L_0x0029:
            r9 = r32
        L_0x002b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0031
            r10 = r2
            goto L_0x0033
        L_0x0031:
            r10 = r33
        L_0x0033:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            r11 = r2
            goto L_0x003b
        L_0x0039:
            r11 = r34
        L_0x003b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0041
            r12 = r2
            goto L_0x0043
        L_0x0041:
            r12 = r35
        L_0x0043:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r36
        L_0x004b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0051
            r14 = r2
            goto L_0x0053
        L_0x0051:
            r14 = r37
        L_0x0053:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0059
            r15 = r2
            goto L_0x005b
        L_0x0059:
            r15 = r38
        L_0x005b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0062
            r16 = r2
            goto L_0x0064
        L_0x0062:
            r16 = r39
        L_0x0064:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006b
            r17 = r2
            goto L_0x006d
        L_0x006b:
            r17 = r40
        L_0x006d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0074
            r18 = r2
            goto L_0x0076
        L_0x0074:
            r18 = r41
        L_0x0076:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x007e
            r21 = r2
            goto L_0x0080
        L_0x007e:
            r21 = r44
        L_0x0080:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0088
            r22 = r2
            goto L_0x008a
        L_0x0088:
            r22 = r45
        L_0x008a:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0092
            r23 = r2
            goto L_0x0094
        L_0x0092:
            r23 = r46
        L_0x0094:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009c
            r24 = r2
            goto L_0x009e
        L_0x009c:
            r24 = r47
        L_0x009e:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a6
            r25 = r2
            goto L_0x00a8
        L_0x00a6:
            r25 = r48
        L_0x00a8:
            r3 = r26
            r4 = r27
            r19 = r42
            r20 = r43
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.Source.<init>(java.lang.String, java.lang.Long, java.lang.String, com.stripe.android.model.Source$CodeVerification, java.lang.Long, java.lang.String, com.stripe.android.model.Source$Flow, java.lang.Boolean, java.util.Map, com.stripe.android.model.Source$Owner, com.stripe.android.model.Source$Receiver, com.stripe.android.model.Source$Redirect, com.stripe.android.model.Source$Status, java.util.Map, com.stripe.android.model.SourceTypeModel, java.lang.String, java.lang.String, com.stripe.android.model.Source$Usage, com.stripe.android.model.WeChat, com.stripe.android.model.Source$Klarna, com.stripe.android.model.SourceOrder, java.lang.String, int, m0.n.b.f):void");
    }
}
