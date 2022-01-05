package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001:\u0003>?@Bm\b\u0000\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b<\u0010=J\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0007Jz\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u0007J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020!HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\b0\u0010\u0007R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b2\u0010\u0012R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b3\u0010\u0007R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\b5\u0010\nR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b6\u0010\u0007R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010/\u001a\u0004\b7\u0010\u0007R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u00108\u001a\u0004\b9\u0010\rR\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010:R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b;\u0010\u0007¨\u0006A"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult;", "Lcom/stripe/android/model/StripeModel;", "", "component6", "()Z", "", "component1", "()Ljava/lang/String;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "component2", "()Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "", "component3", "()Ljava/lang/Long;", "component4", "component5", "Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "component7", "()Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "component8", "component9", "id", "ares", "created", "source", "state", "liveMode", "error", "fallbackRedirectUrl", "creq", "copy", "(Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Stripe3ds2AuthResult;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSource", "Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "getError", "getId", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "getAres", "getState", "getFallbackRedirectUrl", "Ljava/lang/Long;", "getCreated", "Z", "getCreq", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;Ljava/lang/String;Ljava/lang/String;)V", "Ares", "MessageExtension", "ThreeDS2Error", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Stripe3ds2AuthResult.kt */
public final class Stripe3ds2AuthResult implements StripeModel {
    public static final Parcelable.Creator<Stripe3ds2AuthResult> CREATOR = new Creator();
    private final Ares ares;
    private final Long created;
    private final String creq;
    private final ThreeDS2Error error;
    private final String fallbackRedirectUrl;
    private final String id;
    private final boolean liveMode;
    private final String source;
    private final String state;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u0000 =2\u00020\u0001:\u0001=B\u0001\b\u0000\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b;\u0010<J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\f\u0010\u0004J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\r\u0010\u0004J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u0010\u0010\u0004J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u0012\u0010\u0004J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u0014\u0010\u0004J¦\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0004J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u00104\u001a\u0004\b5\u0010\u0004R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u00106R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u00104R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104R\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u00104R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u00104R\u0013\u00107\u001a\u00020*8F@\u0006¢\u0006\u0006\u001a\u0004\b7\u00108R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u00104R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u00104R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u00104\u001a\u0004\b9\u0010\u0004R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\b:\u0010\u0004R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u00104R\u0018\u0010!\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u00104¨\u0006>"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "Lcom/stripe/android/model/StripeModel;", "", "component2", "()Ljava/lang/String;", "component5", "component6", "component7", "", "Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", "component8", "()Ljava/util/List;", "component9", "component10", "component11", "component12", "component1$payments_core_release", "component1", "component3$payments_core_release", "component3", "component4$payments_core_release", "component4", "threeDSServerTransId", "acsChallengeMandated", "acsSignedContent", "acsTransId", "acsUrl", "authenticationType", "cardholderInfo", "messageExtension", "messageType", "messageVersion", "sdkTransId", "transStatus", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAcsTransId$payments_core_release", "Ljava/util/List;", "isChallenge", "()Z", "getAcsSignedContent$payments_core_release", "getThreeDSServerTransId$payments_core_release", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Stripe3ds2AuthResult.kt */
    public static final class Ares implements StripeModel {
        public static final Parcelable.Creator<Ares> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        public static final String VALUE_CHALLENGE = "C";
        private final String acsChallengeMandated;
        private final String acsSignedContent;
        private final String acsTransId;
        private final String acsUrl;
        private final String authenticationType;
        private final String cardholderInfo;
        private final List<MessageExtension> messageExtension;
        private final String messageType;
        private final String messageVersion;
        private final String sdkTransId;
        private final String threeDSServerTransId;
        private final String transStatus;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares$Companion;", "", "", "VALUE_CHALLENGE", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: Stripe3ds2AuthResult.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Ares> {
            public final Ares createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                i.e(parcel, "in");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    while (readInt != 0) {
                        arrayList.add(MessageExtension.CREATOR.createFromParcel(parcel));
                        readInt--;
                    }
                } else {
                    arrayList = null;
                }
                return new Ares(readString, readString2, readString3, readString4, readString5, readString6, readString7, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final Ares[] newArray(int i) {
                return new Ares[i];
            }
        }

        public Ares(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<MessageExtension> list, String str8, String str9, String str10, String str11) {
            this.threeDSServerTransId = str;
            this.acsChallengeMandated = str2;
            this.acsSignedContent = str3;
            this.acsTransId = str4;
            this.acsUrl = str5;
            this.authenticationType = str6;
            this.cardholderInfo = str7;
            this.messageExtension = list;
            this.messageType = str8;
            this.messageVersion = str9;
            this.sdkTransId = str10;
            this.transStatus = str11;
        }

        private final String component10() {
            return this.messageVersion;
        }

        private final String component11() {
            return this.sdkTransId;
        }

        private final String component12() {
            return this.transStatus;
        }

        private final String component2() {
            return this.acsChallengeMandated;
        }

        private final String component5() {
            return this.acsUrl;
        }

        private final String component6() {
            return this.authenticationType;
        }

        private final String component7() {
            return this.cardholderInfo;
        }

        private final List<MessageExtension> component8() {
            return this.messageExtension;
        }

        private final String component9() {
            return this.messageType;
        }

        public static /* synthetic */ Ares copy$default(Ares ares, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, int i, Object obj) {
            Ares ares2 = ares;
            int i2 = i;
            return ares.copy((i2 & 1) != 0 ? ares2.threeDSServerTransId : str, (i2 & 2) != 0 ? ares2.acsChallengeMandated : str2, (i2 & 4) != 0 ? ares2.acsSignedContent : str3, (i2 & 8) != 0 ? ares2.acsTransId : str4, (i2 & 16) != 0 ? ares2.acsUrl : str5, (i2 & 32) != 0 ? ares2.authenticationType : str6, (i2 & 64) != 0 ? ares2.cardholderInfo : str7, (i2 & 128) != 0 ? ares2.messageExtension : list, (i2 & 256) != 0 ? ares2.messageType : str8, (i2 & 512) != 0 ? ares2.messageVersion : str9, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? ares2.sdkTransId : str10, (i2 & 2048) != 0 ? ares2.transStatus : str11);
        }

        public final String component1$payments_core_release() {
            return this.threeDSServerTransId;
        }

        public final String component3$payments_core_release() {
            return this.acsSignedContent;
        }

        public final String component4$payments_core_release() {
            return this.acsTransId;
        }

        public final Ares copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<MessageExtension> list, String str8, String str9, String str10, String str11) {
            return new Ares(str, str2, str3, str4, str5, str6, str7, list, str8, str9, str10, str11);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ares)) {
                return false;
            }
            Ares ares = (Ares) obj;
            return i.a(this.threeDSServerTransId, ares.threeDSServerTransId) && i.a(this.acsChallengeMandated, ares.acsChallengeMandated) && i.a(this.acsSignedContent, ares.acsSignedContent) && i.a(this.acsTransId, ares.acsTransId) && i.a(this.acsUrl, ares.acsUrl) && i.a(this.authenticationType, ares.authenticationType) && i.a(this.cardholderInfo, ares.cardholderInfo) && i.a(this.messageExtension, ares.messageExtension) && i.a(this.messageType, ares.messageType) && i.a(this.messageVersion, ares.messageVersion) && i.a(this.sdkTransId, ares.sdkTransId) && i.a(this.transStatus, ares.transStatus);
        }

        public final String getAcsSignedContent$payments_core_release() {
            return this.acsSignedContent;
        }

        public final String getAcsTransId$payments_core_release() {
            return this.acsTransId;
        }

        public final String getThreeDSServerTransId$payments_core_release() {
            return this.threeDSServerTransId;
        }

        public int hashCode() {
            String str = this.threeDSServerTransId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.acsChallengeMandated;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.acsSignedContent;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.acsTransId;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.acsUrl;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.authenticationType;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.cardholderInfo;
            int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            List<MessageExtension> list = this.messageExtension;
            int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
            String str8 = this.messageType;
            int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.messageVersion;
            int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
            String str10 = this.sdkTransId;
            int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
            String str11 = this.transStatus;
            if (str11 != null) {
                i = str11.hashCode();
            }
            return hashCode11 + i;
        }

        public final boolean isChallenge() {
            return i.a(VALUE_CHALLENGE, this.transStatus);
        }

        public String toString() {
            StringBuilder P0 = a.P0("Ares(threeDSServerTransId=");
            P0.append(this.threeDSServerTransId);
            P0.append(", acsChallengeMandated=");
            P0.append(this.acsChallengeMandated);
            P0.append(", acsSignedContent=");
            P0.append(this.acsSignedContent);
            P0.append(", acsTransId=");
            P0.append(this.acsTransId);
            P0.append(", acsUrl=");
            P0.append(this.acsUrl);
            P0.append(", authenticationType=");
            P0.append(this.authenticationType);
            P0.append(", cardholderInfo=");
            P0.append(this.cardholderInfo);
            P0.append(", messageExtension=");
            P0.append(this.messageExtension);
            P0.append(", messageType=");
            P0.append(this.messageType);
            P0.append(", messageVersion=");
            P0.append(this.messageVersion);
            P0.append(", sdkTransId=");
            P0.append(this.sdkTransId);
            P0.append(", transStatus=");
            return a.y0(P0, this.transStatus, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.threeDSServerTransId);
            parcel.writeString(this.acsChallengeMandated);
            parcel.writeString(this.acsSignedContent);
            parcel.writeString(this.acsTransId);
            parcel.writeString(this.acsUrl);
            parcel.writeString(this.authenticationType);
            parcel.writeString(this.cardholderInfo);
            List<MessageExtension> list = this.messageExtension;
            if (list != null) {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (MessageExtension writeToParcel : list) {
                    writeToParcel.writeToParcel(parcel, 0);
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.messageType);
            parcel.writeString(this.messageVersion);
            parcel.writeString(this.sdkTransId);
            parcel.writeString(this.transStatus);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Ares(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.List r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29, m0.n.b.f r30) {
            /*
                r16 = this;
                r0 = r29
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r6 = r2
                goto L_0x000b
            L_0x0009:
                r6 = r19
            L_0x000b:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0011
                r8 = r2
                goto L_0x0013
            L_0x0011:
                r8 = r21
            L_0x0013:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0019
                r9 = r2
                goto L_0x001b
            L_0x0019:
                r9 = r22
            L_0x001b:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0021
                r10 = r2
                goto L_0x0023
            L_0x0021:
                r10 = r23
            L_0x0023:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0029
                r11 = r2
                goto L_0x002b
            L_0x0029:
                r11 = r24
            L_0x002b:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L_0x0031
                r15 = r2
                goto L_0x0033
            L_0x0031:
                r15 = r28
            L_0x0033:
                r3 = r16
                r4 = r17
                r5 = r18
                r7 = r20
                r12 = r25
                r13 = r26
                r14 = r27
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.Stripe3ds2AuthResult.Ares.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, m0.n.b.f):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<Stripe3ds2AuthResult> {
        public final Stripe3ds2AuthResult createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new Stripe3ds2AuthResult(parcel.readString(), parcel.readInt() != 0 ? Ares.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? ThreeDS2Error.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        public final Stripe3ds2AuthResult[] newArray(int i) {
            return new Stripe3ds2AuthResult[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B;\b\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010\u0007R'\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b&\u0010\u0007¨\u0006)"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", "Lcom/stripe/android/model/StripeModel;", "", "component2", "()Z", "", "component1", "()Ljava/lang/String;", "component3", "", "component4", "()Ljava/util/Map;", "name", "criticalityIndicator", "id", "data", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;)Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Ljava/util/Map;", "getData", "Z", "getId", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Stripe3ds2AuthResult.kt */
    public static final class MessageExtension implements StripeModel {
        public static final Parcelable.Creator<MessageExtension> CREATOR = new Creator();
        private final boolean criticalityIndicator;
        private final Map<String, String> data;
        private final String id;
        private final String name;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<MessageExtension> {
            public final MessageExtension createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                i.e(parcel, "in");
                String readString = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String readString2 = parcel.readString();
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
                return new MessageExtension(readString, z, readString2, linkedHashMap);
            }

            public final MessageExtension[] newArray(int i) {
                return new MessageExtension[i];
            }
        }

        public MessageExtension(String str, boolean z, String str2, Map<String, String> map) {
            this.name = str;
            this.criticalityIndicator = z;
            this.id = str2;
            this.data = map;
        }

        private final boolean component2() {
            return this.criticalityIndicator;
        }

        public static /* synthetic */ MessageExtension copy$default(MessageExtension messageExtension, String str, boolean z, String str2, Map<String, String> map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageExtension.name;
            }
            if ((i & 2) != 0) {
                z = messageExtension.criticalityIndicator;
            }
            if ((i & 4) != 0) {
                str2 = messageExtension.id;
            }
            if ((i & 8) != 0) {
                map = messageExtension.data;
            }
            return messageExtension.copy(str, z, str2, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component3() {
            return this.id;
        }

        public final Map<String, String> component4() {
            return this.data;
        }

        public final MessageExtension copy(String str, boolean z, String str2, Map<String, String> map) {
            return new MessageExtension(str, z, str2, map);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageExtension)) {
                return false;
            }
            MessageExtension messageExtension = (MessageExtension) obj;
            return i.a(this.name, messageExtension.name) && this.criticalityIndicator == messageExtension.criticalityIndicator && i.a(this.id, messageExtension.id) && i.a(this.data, messageExtension.data);
        }

        public final Map<String, String> getData() {
            return this.data;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.criticalityIndicator;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            String str2 = this.id;
            int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Map<String, String> map = this.data;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("MessageExtension(name=");
            P0.append(this.name);
            P0.append(", criticalityIndicator=");
            P0.append(this.criticalityIndicator);
            P0.append(", id=");
            P0.append(this.id);
            P0.append(", data=");
            P0.append(this.data);
            P0.append(")");
            return P0.toString();
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map$Entry, java.lang.Object] */
        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.name);
            parcel.writeInt(this.criticalityIndicator ? 1 : 0);
            parcel.writeString(this.id);
            Map<String, String> map = this.data;
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001By\b\u0000\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b8\u00109J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u0004J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u0004J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b-\u0010\u0004R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b.\u0010\u0004R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b/\u0010\u0004R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b0\u0010\u0004R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b1\u0010\u0004R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b2\u0010\u0004R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b3\u0010\u0004R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b4\u0010\u0004R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b5\u0010\u0004R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b6\u0010\u0004R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b7\u0010\u0004¨\u0006:"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "threeDSServerTransId", "acsTransId", "dsTransId", "errorCode", "errorComponent", "errorDescription", "errorDetail", "errorMessageType", "messageType", "messageVersion", "sdkTransId", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getErrorMessageType", "getAcsTransId", "getMessageType", "getErrorCode", "getErrorComponent", "getThreeDSServerTransId", "getErrorDescription", "getDsTransId", "getSdkTransId", "getMessageVersion", "getErrorDetail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Stripe3ds2AuthResult.kt */
    public static final class ThreeDS2Error implements StripeModel {
        public static final Parcelable.Creator<ThreeDS2Error> CREATOR = new Creator();
        private final String acsTransId;
        private final String dsTransId;
        private final String errorCode;
        private final String errorComponent;
        private final String errorDescription;
        private final String errorDetail;
        private final String errorMessageType;
        private final String messageType;
        private final String messageVersion;
        private final String sdkTransId;
        private final String threeDSServerTransId;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<ThreeDS2Error> {
            public final ThreeDS2Error createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new ThreeDS2Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final ThreeDS2Error[] newArray(int i) {
                return new ThreeDS2Error[i];
            }
        }

        public ThreeDS2Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.threeDSServerTransId = str;
            this.acsTransId = str2;
            this.dsTransId = str3;
            this.errorCode = str4;
            this.errorComponent = str5;
            this.errorDescription = str6;
            this.errorDetail = str7;
            this.errorMessageType = str8;
            this.messageType = str9;
            this.messageVersion = str10;
            this.sdkTransId = str11;
        }

        public static /* synthetic */ ThreeDS2Error copy$default(ThreeDS2Error threeDS2Error, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
            ThreeDS2Error threeDS2Error2 = threeDS2Error;
            int i2 = i;
            return threeDS2Error.copy((i2 & 1) != 0 ? threeDS2Error2.threeDSServerTransId : str, (i2 & 2) != 0 ? threeDS2Error2.acsTransId : str2, (i2 & 4) != 0 ? threeDS2Error2.dsTransId : str3, (i2 & 8) != 0 ? threeDS2Error2.errorCode : str4, (i2 & 16) != 0 ? threeDS2Error2.errorComponent : str5, (i2 & 32) != 0 ? threeDS2Error2.errorDescription : str6, (i2 & 64) != 0 ? threeDS2Error2.errorDetail : str7, (i2 & 128) != 0 ? threeDS2Error2.errorMessageType : str8, (i2 & 256) != 0 ? threeDS2Error2.messageType : str9, (i2 & 512) != 0 ? threeDS2Error2.messageVersion : str10, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? threeDS2Error2.sdkTransId : str11);
        }

        public final String component1() {
            return this.threeDSServerTransId;
        }

        public final String component10() {
            return this.messageVersion;
        }

        public final String component11() {
            return this.sdkTransId;
        }

        public final String component2() {
            return this.acsTransId;
        }

        public final String component3() {
            return this.dsTransId;
        }

        public final String component4() {
            return this.errorCode;
        }

        public final String component5() {
            return this.errorComponent;
        }

        public final String component6() {
            return this.errorDescription;
        }

        public final String component7() {
            return this.errorDetail;
        }

        public final String component8() {
            return this.errorMessageType;
        }

        public final String component9() {
            return this.messageType;
        }

        public final ThreeDS2Error copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            return new ThreeDS2Error(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThreeDS2Error)) {
                return false;
            }
            ThreeDS2Error threeDS2Error = (ThreeDS2Error) obj;
            return i.a(this.threeDSServerTransId, threeDS2Error.threeDSServerTransId) && i.a(this.acsTransId, threeDS2Error.acsTransId) && i.a(this.dsTransId, threeDS2Error.dsTransId) && i.a(this.errorCode, threeDS2Error.errorCode) && i.a(this.errorComponent, threeDS2Error.errorComponent) && i.a(this.errorDescription, threeDS2Error.errorDescription) && i.a(this.errorDetail, threeDS2Error.errorDetail) && i.a(this.errorMessageType, threeDS2Error.errorMessageType) && i.a(this.messageType, threeDS2Error.messageType) && i.a(this.messageVersion, threeDS2Error.messageVersion) && i.a(this.sdkTransId, threeDS2Error.sdkTransId);
        }

        public final String getAcsTransId() {
            return this.acsTransId;
        }

        public final String getDsTransId() {
            return this.dsTransId;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorComponent() {
            return this.errorComponent;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final String getErrorDetail() {
            return this.errorDetail;
        }

        public final String getErrorMessageType() {
            return this.errorMessageType;
        }

        public final String getMessageType() {
            return this.messageType;
        }

        public final String getMessageVersion() {
            return this.messageVersion;
        }

        public final String getSdkTransId() {
            return this.sdkTransId;
        }

        public final String getThreeDSServerTransId() {
            return this.threeDSServerTransId;
        }

        public int hashCode() {
            String str = this.threeDSServerTransId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.acsTransId;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.dsTransId;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.errorCode;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.errorComponent;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.errorDescription;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.errorDetail;
            int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            String str8 = this.errorMessageType;
            int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.messageType;
            int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
            String str10 = this.messageVersion;
            int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
            String str11 = this.sdkTransId;
            if (str11 != null) {
                i = str11.hashCode();
            }
            return hashCode10 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("ThreeDS2Error(threeDSServerTransId=");
            P0.append(this.threeDSServerTransId);
            P0.append(", acsTransId=");
            P0.append(this.acsTransId);
            P0.append(", dsTransId=");
            P0.append(this.dsTransId);
            P0.append(", errorCode=");
            P0.append(this.errorCode);
            P0.append(", errorComponent=");
            P0.append(this.errorComponent);
            P0.append(", errorDescription=");
            P0.append(this.errorDescription);
            P0.append(", errorDetail=");
            P0.append(this.errorDetail);
            P0.append(", errorMessageType=");
            P0.append(this.errorMessageType);
            P0.append(", messageType=");
            P0.append(this.messageType);
            P0.append(", messageVersion=");
            P0.append(this.messageVersion);
            P0.append(", sdkTransId=");
            return a.y0(P0, this.sdkTransId, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.threeDSServerTransId);
            parcel.writeString(this.acsTransId);
            parcel.writeString(this.dsTransId);
            parcel.writeString(this.errorCode);
            parcel.writeString(this.errorComponent);
            parcel.writeString(this.errorDescription);
            parcel.writeString(this.errorDetail);
            parcel.writeString(this.errorMessageType);
            parcel.writeString(this.messageType);
            parcel.writeString(this.messageVersion);
            parcel.writeString(this.sdkTransId);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ThreeDS2Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, f fVar) {
            this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : str7, str8, str9, str10, str11);
        }
    }

    public Stripe3ds2AuthResult(String str, Ares ares2, Long l, String str2, String str3, boolean z, ThreeDS2Error threeDS2Error, String str4, String str5) {
        this.id = str;
        this.ares = ares2;
        this.created = l;
        this.source = str2;
        this.state = str3;
        this.liveMode = z;
        this.error = threeDS2Error;
        this.fallbackRedirectUrl = str4;
        this.creq = str5;
    }

    private final boolean component6() {
        return this.liveMode;
    }

    public static /* synthetic */ Stripe3ds2AuthResult copy$default(Stripe3ds2AuthResult stripe3ds2AuthResult, String str, Ares ares2, Long l, String str2, String str3, boolean z, ThreeDS2Error threeDS2Error, String str4, String str5, int i, Object obj) {
        Stripe3ds2AuthResult stripe3ds2AuthResult2 = stripe3ds2AuthResult;
        int i2 = i;
        return stripe3ds2AuthResult.copy((i2 & 1) != 0 ? stripe3ds2AuthResult2.id : str, (i2 & 2) != 0 ? stripe3ds2AuthResult2.ares : ares2, (i2 & 4) != 0 ? stripe3ds2AuthResult2.created : l, (i2 & 8) != 0 ? stripe3ds2AuthResult2.source : str2, (i2 & 16) != 0 ? stripe3ds2AuthResult2.state : str3, (i2 & 32) != 0 ? stripe3ds2AuthResult2.liveMode : z, (i2 & 64) != 0 ? stripe3ds2AuthResult2.error : threeDS2Error, (i2 & 128) != 0 ? stripe3ds2AuthResult2.fallbackRedirectUrl : str4, (i2 & 256) != 0 ? stripe3ds2AuthResult2.creq : str5);
    }

    public final String component1() {
        return this.id;
    }

    public final Ares component2() {
        return this.ares;
    }

    public final Long component3() {
        return this.created;
    }

    public final String component4() {
        return this.source;
    }

    public final String component5() {
        return this.state;
    }

    public final ThreeDS2Error component7() {
        return this.error;
    }

    public final String component8() {
        return this.fallbackRedirectUrl;
    }

    public final String component9() {
        return this.creq;
    }

    public final Stripe3ds2AuthResult copy(String str, Ares ares2, Long l, String str2, String str3, boolean z, ThreeDS2Error threeDS2Error, String str4, String str5) {
        return new Stripe3ds2AuthResult(str, ares2, l, str2, str3, z, threeDS2Error, str4, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stripe3ds2AuthResult)) {
            return false;
        }
        Stripe3ds2AuthResult stripe3ds2AuthResult = (Stripe3ds2AuthResult) obj;
        return i.a(this.id, stripe3ds2AuthResult.id) && i.a(this.ares, stripe3ds2AuthResult.ares) && i.a(this.created, stripe3ds2AuthResult.created) && i.a(this.source, stripe3ds2AuthResult.source) && i.a(this.state, stripe3ds2AuthResult.state) && this.liveMode == stripe3ds2AuthResult.liveMode && i.a(this.error, stripe3ds2AuthResult.error) && i.a(this.fallbackRedirectUrl, stripe3ds2AuthResult.fallbackRedirectUrl) && i.a(this.creq, stripe3ds2AuthResult.creq);
    }

    public final Ares getAres() {
        return this.ares;
    }

    public final Long getCreated() {
        return this.created;
    }

    public final String getCreq() {
        return this.creq;
    }

    public final ThreeDS2Error getError() {
        return this.error;
    }

    public final String getFallbackRedirectUrl() {
        return this.fallbackRedirectUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Ares ares2 = this.ares;
        int hashCode2 = (hashCode + (ares2 != null ? ares2.hashCode() : 0)) * 31;
        Long l = this.created;
        int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.source;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.state;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.liveMode;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        ThreeDS2Error threeDS2Error = this.error;
        int hashCode6 = (i2 + (threeDS2Error != null ? threeDS2Error.hashCode() : 0)) * 31;
        String str4 = this.fallbackRedirectUrl;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.creq;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Stripe3ds2AuthResult(id=");
        P0.append(this.id);
        P0.append(", ares=");
        P0.append(this.ares);
        P0.append(", created=");
        P0.append(this.created);
        P0.append(", source=");
        P0.append(this.source);
        P0.append(", state=");
        P0.append(this.state);
        P0.append(", liveMode=");
        P0.append(this.liveMode);
        P0.append(", error=");
        P0.append(this.error);
        P0.append(", fallbackRedirectUrl=");
        P0.append(this.fallbackRedirectUrl);
        P0.append(", creq=");
        return a.y0(P0, this.creq, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.id);
        Ares ares2 = this.ares;
        if (ares2 != null) {
            parcel.writeInt(1);
            ares2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Long l = this.created;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.source);
        parcel.writeString(this.state);
        parcel.writeInt(this.liveMode ? 1 : 0);
        ThreeDS2Error threeDS2Error = this.error;
        if (threeDS2Error != null) {
            parcel.writeInt(1);
            threeDS2Error.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.fallbackRedirectUrl);
        parcel.writeString(this.creq);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Stripe3ds2AuthResult(java.lang.String r14, com.stripe.android.model.Stripe3ds2AuthResult.Ares r15, java.lang.Long r16, java.lang.String r17, java.lang.String r18, boolean r19, com.stripe.android.model.Stripe3ds2AuthResult.ThreeDS2Error r20, java.lang.String r21, java.lang.String r22, int r23, m0.n.b.f r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000a
        L_0x0009:
            r5 = r15
        L_0x000a:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0010
            r8 = r2
            goto L_0x0012
        L_0x0010:
            r8 = r18
        L_0x0012:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r1 = 0
            r9 = r1
            goto L_0x001b
        L_0x0019:
            r9 = r19
        L_0x001b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r20
        L_0x0023:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r21
        L_0x002b:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0031
            r12 = r2
            goto L_0x0033
        L_0x0031:
            r12 = r22
        L_0x0033:
            r3 = r13
            r4 = r14
            r6 = r16
            r7 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.Stripe3ds2AuthResult.<init>(java.lang.String, com.stripe.android.model.Stripe3ds2AuthResult$Ares, java.lang.Long, java.lang.String, java.lang.String, boolean, com.stripe.android.model.Stripe3ds2AuthResult$ThreeDS2Error, java.lang.String, java.lang.String, int, m0.n.b.f):void");
    }
}
