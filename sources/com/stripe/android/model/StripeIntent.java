package com.stripe.android.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.d.a.a.a;
import java.util.List;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0004,-./J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0004R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\fR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0 8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/model/StripeModel;", "", "requiresAction", "()Z", "requiresConfirmation", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "getNextActionType", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "nextActionType", "", "getId", "()Ljava/lang/String;", "id", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "nextActionData", "isConfirmed", "isLiveMode", "getClientSecret", "clientSecret", "getLastErrorMessage", "lastErrorMessage", "getPaymentMethodId", "paymentMethodId", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "getDescription", "description", "", "getPaymentMethodTypes", "()Ljava/util/List;", "paymentMethodTypes", "Lcom/stripe/android/model/StripeIntent$Status;", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", "status", "", "getCreated", "()J", "created", "NextActionData", "NextActionType", "Status", "Usage", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeIntent.kt */
public interface StripeIntent extends StripeModel {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/model/StripeModel;", "<init>", "()V", "AlipayRedirect", "BlikAuthorize", "DisplayOxxoDetails", "RedirectToUrl", "SdkData", "WeChatPayRedirect", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeIntent.kt */
    public static abstract class NextActionData implements StripeModel {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u0000 )2\u00020\u0001:\u0001)B-\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'B%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010(J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J<\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\u0004R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\"\u0010\u0004R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010\bR\u001b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b%\u0010\u0004¨\u0006*"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "", "component1", "()Ljava/lang/String;", "component2", "Landroid/net/Uri;", "component3", "()Landroid/net/Uri;", "component4", "data", "authCompleteUrl", "webViewUrl", "returnUrl", "copy", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAuthCompleteUrl", "getData", "Landroid/net/Uri;", "getWebViewUrl", "getReturnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeIntent.kt */
        public static final class AlipayRedirect extends NextActionData {
            public static final Parcelable.Creator<AlipayRedirect> CREATOR = new Creator();
            private static final Companion Companion = new Companion((f) null);
            private final String authCompleteUrl;
            private final String data;
            private final String returnUrl;
            private final Uri webViewUrl;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect$Companion;", "", "", "data", "extractReturnUrl", "(Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: StripeIntent.kt */
            public static final class Companion {
                private Companion() {
                }

                /* access modifiers changed from: private */
                /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
                    if (r1 != false) goto L_0x0033;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.String extractReturnUrl(java.lang.String r4) {
                    /*
                        r3 = this;
                        r0 = 0
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x002e }
                        r1.<init>()     // Catch:{ all -> 0x002e }
                        java.lang.String r2 = "alipay://url?"
                        r1.append(r2)     // Catch:{ all -> 0x002e }
                        r1.append(r4)     // Catch:{ all -> 0x002e }
                        java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x002e }
                        android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x002e }
                        java.lang.String r1 = "return_url"
                        java.lang.String r4 = r4.getQueryParameter(r1)     // Catch:{ all -> 0x002e }
                        if (r4 == 0) goto L_0x002c
                        com.stripe.android.utils.StripeUrlUtils r1 = com.stripe.android.utils.StripeUrlUtils.INSTANCE     // Catch:{ all -> 0x002e }
                        java.lang.String r2 = "it"
                        m0.n.b.i.d(r4, r2)     // Catch:{ all -> 0x002e }
                        boolean r1 = r1.isStripeUrl$payments_core_release(r4)     // Catch:{ all -> 0x002e }
                        if (r1 == 0) goto L_0x002c
                        goto L_0x0033
                    L_0x002c:
                        r4 = r0
                        goto L_0x0033
                    L_0x002e:
                        r4 = move-exception
                        java.lang.Object r4 = i0.j.f.p.h.l0(r4)
                    L_0x0033:
                        boolean r1 = r4 instanceof kotlin.Result.Failure
                        if (r1 == 0) goto L_0x0038
                        goto L_0x0039
                    L_0x0038:
                        r0 = r4
                    L_0x0039:
                        java.lang.String r0 = (java.lang.String) r0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect.Companion.extractReturnUrl(java.lang.String):java.lang.String");
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<AlipayRedirect> {
                public final AlipayRedirect createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new AlipayRedirect(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(AlipayRedirect.class.getClassLoader()), parcel.readString());
                }

                public final AlipayRedirect[] newArray(int i) {
                    return new AlipayRedirect[i];
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AlipayRedirect(String str, String str2, Uri uri, String str3, int i, f fVar) {
                this(str, str2, uri, (i & 8) != 0 ? null : str3);
            }

            public static /* synthetic */ AlipayRedirect copy$default(AlipayRedirect alipayRedirect, String str, String str2, Uri uri, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = alipayRedirect.data;
                }
                if ((i & 2) != 0) {
                    str2 = alipayRedirect.authCompleteUrl;
                }
                if ((i & 4) != 0) {
                    uri = alipayRedirect.webViewUrl;
                }
                if ((i & 8) != 0) {
                    str3 = alipayRedirect.returnUrl;
                }
                return alipayRedirect.copy(str, str2, uri, str3);
            }

            public final String component1() {
                return this.data;
            }

            public final String component2() {
                return this.authCompleteUrl;
            }

            public final Uri component3() {
                return this.webViewUrl;
            }

            public final String component4() {
                return this.returnUrl;
            }

            public final AlipayRedirect copy(String str, String str2, Uri uri, String str3) {
                i.e(str, MessageExtension.FIELD_DATA);
                i.e(uri, "webViewUrl");
                return new AlipayRedirect(str, str2, uri, str3);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AlipayRedirect)) {
                    return false;
                }
                AlipayRedirect alipayRedirect = (AlipayRedirect) obj;
                return i.a(this.data, alipayRedirect.data) && i.a(this.authCompleteUrl, alipayRedirect.authCompleteUrl) && i.a(this.webViewUrl, alipayRedirect.webViewUrl) && i.a(this.returnUrl, alipayRedirect.returnUrl);
            }

            public final String getAuthCompleteUrl() {
                return this.authCompleteUrl;
            }

            public final String getData() {
                return this.data;
            }

            public final String getReturnUrl() {
                return this.returnUrl;
            }

            public final Uri getWebViewUrl() {
                return this.webViewUrl;
            }

            public int hashCode() {
                String str = this.data;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.authCompleteUrl;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                Uri uri = this.webViewUrl;
                int hashCode3 = (hashCode2 + (uri != null ? uri.hashCode() : 0)) * 31;
                String str3 = this.returnUrl;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("AlipayRedirect(data=");
                P0.append(this.data);
                P0.append(", authCompleteUrl=");
                P0.append(this.authCompleteUrl);
                P0.append(", webViewUrl=");
                P0.append(this.webViewUrl);
                P0.append(", returnUrl=");
                return a.y0(P0, this.returnUrl, ")");
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeString(this.data);
                parcel.writeString(this.authCompleteUrl);
                parcel.writeParcelable(this.webViewUrl, i);
                parcel.writeString(this.returnUrl);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AlipayRedirect(String str, String str2, Uri uri, String str3) {
                super((f) null);
                i.e(str, MessageExtension.FIELD_DATA);
                i.e(uri, "webViewUrl");
                this.data = str;
                this.authCompleteUrl = str2;
                this.webViewUrl = uri;
                this.returnUrl = str3;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AlipayRedirect(String str, String str2, String str3, int i, f fVar) {
                this(str, str2, (i & 4) != 0 ? null : str3);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public AlipayRedirect(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                /*
                    r2 = this;
                    java.lang.String r0 = "data"
                    m0.n.b.i.e(r3, r0)
                    java.lang.String r0 = "webViewUrl"
                    m0.n.b.i.e(r4, r0)
                    com.stripe.android.model.StripeIntent$NextActionData$AlipayRedirect$Companion r0 = Companion
                    java.lang.String r0 = r0.extractReturnUrl(r3)
                    android.net.Uri r4 = android.net.Uri.parse(r4)
                    java.lang.String r1 = "Uri.parse(webViewUrl)"
                    m0.n.b.i.d(r4, r1)
                    r2.<init>(r3, r0, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect.<init>(java.lang.String, java.lang.String, java.lang.String):void");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0004J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeIntent.kt */
        public static final class BlikAuthorize extends NextActionData {
            public static final Parcelable.Creator<BlikAuthorize> CREATOR = new Creator();
            public static final BlikAuthorize INSTANCE = new BlikAuthorize();

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<BlikAuthorize> {
                public final BlikAuthorize createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    if (parcel.readInt() != 0) {
                        return BlikAuthorize.INSTANCE;
                    }
                    return null;
                }

                public final BlikAuthorize[] newArray(int i) {
                    return new BlikAuthorize[i];
                }
            }

            private BlikAuthorize() {
                super((f) null);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj;
            }

            public int hashCode() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeInt(1);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0004J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001e\u0010\u0007R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0004¨\u0006#"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "component3", "expiresAfter", "number", "hostedVoucherUrl", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getNumber", "getHostedVoucherUrl", "I", "getExpiresAfter", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeIntent.kt */
        public static final class DisplayOxxoDetails extends NextActionData {
            public static final Parcelable.Creator<DisplayOxxoDetails> CREATOR = new Creator();
            private final int expiresAfter;
            private final String hostedVoucherUrl;
            private final String number;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<DisplayOxxoDetails> {
                public final DisplayOxxoDetails createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new DisplayOxxoDetails(parcel.readInt(), parcel.readString(), parcel.readString());
                }

                public final DisplayOxxoDetails[] newArray(int i) {
                    return new DisplayOxxoDetails[i];
                }
            }

            public DisplayOxxoDetails() {
                this(0, (String) null, (String) null, 7, (f) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ DisplayOxxoDetails(int i, String str, String str2, int i2, f fVar) {
                this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
            }

            public static /* synthetic */ DisplayOxxoDetails copy$default(DisplayOxxoDetails displayOxxoDetails, int i, String str, String str2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = displayOxxoDetails.expiresAfter;
                }
                if ((i2 & 2) != 0) {
                    str = displayOxxoDetails.number;
                }
                if ((i2 & 4) != 0) {
                    str2 = displayOxxoDetails.hostedVoucherUrl;
                }
                return displayOxxoDetails.copy(i, str, str2);
            }

            public final int component1() {
                return this.expiresAfter;
            }

            public final String component2() {
                return this.number;
            }

            public final String component3() {
                return this.hostedVoucherUrl;
            }

            public final DisplayOxxoDetails copy(int i, String str, String str2) {
                return new DisplayOxxoDetails(i, str, str2);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DisplayOxxoDetails)) {
                    return false;
                }
                DisplayOxxoDetails displayOxxoDetails = (DisplayOxxoDetails) obj;
                return this.expiresAfter == displayOxxoDetails.expiresAfter && i.a(this.number, displayOxxoDetails.number) && i.a(this.hostedVoucherUrl, displayOxxoDetails.hostedVoucherUrl);
            }

            public final int getExpiresAfter() {
                return this.expiresAfter;
            }

            public final String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public final String getNumber() {
                return this.number;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.expiresAfter) * 31;
                String str = this.number;
                int i = 0;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.hostedVoucherUrl;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("DisplayOxxoDetails(expiresAfter=");
                P0.append(this.expiresAfter);
                P0.append(", number=");
                P0.append(this.number);
                P0.append(", hostedVoucherUrl=");
                return a.y0(P0, this.hostedVoucherUrl, ")");
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeInt(this.expiresAfter);
                parcel.writeString(this.number);
                parcel.writeString(this.hostedVoucherUrl);
            }

            public DisplayOxxoDetails(int i, String str, String str2) {
                super((f) null);
                this.expiresAfter = i;
                this.number = str;
                this.hostedVoucherUrl = str2;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b \u0010!J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004¨\u0006\""}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Landroid/net/Uri;", "component1", "()Landroid/net/Uri;", "", "component2", "()Ljava/lang/String;", "url", "returnUrl", "copy", "(Landroid/net/Uri;Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getReturnUrl", "Landroid/net/Uri;", "getUrl", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeIntent.kt */
        public static final class RedirectToUrl extends NextActionData {
            public static final Parcelable.Creator<RedirectToUrl> CREATOR = new Creator();
            private final String returnUrl;
            private final Uri url;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<RedirectToUrl> {
                public final RedirectToUrl createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new RedirectToUrl((Uri) parcel.readParcelable(RedirectToUrl.class.getClassLoader()), parcel.readString());
                }

                public final RedirectToUrl[] newArray(int i) {
                    return new RedirectToUrl[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public RedirectToUrl(Uri uri, String str) {
                super((f) null);
                i.e(uri, "url");
                this.url = uri;
                this.returnUrl = str;
            }

            public static /* synthetic */ RedirectToUrl copy$default(RedirectToUrl redirectToUrl, Uri uri, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = redirectToUrl.url;
                }
                if ((i & 2) != 0) {
                    str = redirectToUrl.returnUrl;
                }
                return redirectToUrl.copy(uri, str);
            }

            public final Uri component1() {
                return this.url;
            }

            public final String component2() {
                return this.returnUrl;
            }

            public final RedirectToUrl copy(Uri uri, String str) {
                i.e(uri, "url");
                return new RedirectToUrl(uri, str);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RedirectToUrl)) {
                    return false;
                }
                RedirectToUrl redirectToUrl = (RedirectToUrl) obj;
                return i.a(this.url, redirectToUrl.url) && i.a(this.returnUrl, redirectToUrl.returnUrl);
            }

            public final String getReturnUrl() {
                return this.returnUrl;
            }

            public final Uri getUrl() {
                return this.url;
            }

            public int hashCode() {
                Uri uri = this.url;
                int i = 0;
                int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
                String str = this.returnUrl;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("RedirectToUrl(url=");
                P0.append(this.url);
                P0.append(", returnUrl=");
                return a.y0(P0, this.returnUrl, ")");
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeParcelable(this.url, i);
                parcel.writeString(this.returnUrl);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "<init>", "()V", "Use3DS1", "Use3DS2", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeIntent.kt */
        public static abstract class SdkData extends NextActionData {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "", "component1", "()Ljava/lang/String;", "url", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUrl", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: StripeIntent.kt */
            public static final class Use3DS1 extends SdkData {
                public static final Parcelable.Creator<Use3DS1> CREATOR = new Creator();
                private final String url;

                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
                public static class Creator implements Parcelable.Creator<Use3DS1> {
                    public final Use3DS1 createFromParcel(Parcel parcel) {
                        i.e(parcel, "in");
                        return new Use3DS1(parcel.readString());
                    }

                    public final Use3DS1[] newArray(int i) {
                        return new Use3DS1[i];
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public Use3DS1(String str) {
                    super((f) null);
                    i.e(str, "url");
                    this.url = str;
                }

                public static /* synthetic */ Use3DS1 copy$default(Use3DS1 use3DS1, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = use3DS1.url;
                    }
                    return use3DS1.copy(str);
                }

                public final String component1() {
                    return this.url;
                }

                public final Use3DS1 copy(String str) {
                    i.e(str, "url");
                    return new Use3DS1(str);
                }

                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this != obj) {
                        return (obj instanceof Use3DS1) && i.a(this.url, ((Use3DS1) obj).url);
                    }
                    return true;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    String str = this.url;
                    if (str != null) {
                        return str.hashCode();
                    }
                    return 0;
                }

                public String toString() {
                    return a.y0(a.P0("Use3DS1(url="), this.url, ")");
                }

                public void writeToParcel(Parcel parcel, int i) {
                    i.e(parcel, "parcel");
                    parcel.writeString(this.url);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001:\u0001(B'\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\u0004R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\"\u0010\u0004R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b#\u0010\u0004R\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010\t¨\u0006)"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "component4", "()Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "source", "serverName", "transactionId", "serverEncryption", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;)Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getServerName", "getSource", "getTransactionId", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "getServerEncryption", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;)V", "DirectoryServerEncryption", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: StripeIntent.kt */
            public static final class Use3DS2 extends SdkData {
                public static final Parcelable.Creator<Use3DS2> CREATOR = new Creator();
                private final DirectoryServerEncryption serverEncryption;
                private final String serverName;
                private final String source;
                private final String transactionId;

                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
                public static class Creator implements Parcelable.Creator<Use3DS2> {
                    public final Use3DS2 createFromParcel(Parcel parcel) {
                        i.e(parcel, "in");
                        return new Use3DS2(parcel.readString(), parcel.readString(), parcel.readString(), DirectoryServerEncryption.CREATOR.createFromParcel(parcel));
                    }

                    public final Use3DS2[] newArray(int i) {
                        return new Use3DS2[i];
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J@\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\bR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010\u0004R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b$\u0010\u0004R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b%\u0010\u0004¨\u0006("}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()Ljava/util/List;", "component4", "directoryServerId", "dsCertificateData", "rootCertsData", "keyId", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getRootCertsData", "Ljava/lang/String;", "getDsCertificateData", "getKeyId", "getDirectoryServerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
                /* compiled from: StripeIntent.kt */
                public static final class DirectoryServerEncryption implements Parcelable {
                    public static final Parcelable.Creator<DirectoryServerEncryption> CREATOR = new Creator();
                    private final String directoryServerId;
                    private final String dsCertificateData;
                    private final String keyId;
                    private final List<String> rootCertsData;

                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
                    public static class Creator implements Parcelable.Creator<DirectoryServerEncryption> {
                        public final DirectoryServerEncryption createFromParcel(Parcel parcel) {
                            i.e(parcel, "in");
                            return new DirectoryServerEncryption(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                        }

                        public final DirectoryServerEncryption[] newArray(int i) {
                            return new DirectoryServerEncryption[i];
                        }
                    }

                    public DirectoryServerEncryption(String str, String str2, List<String> list, String str3) {
                        i.e(str, "directoryServerId");
                        i.e(str2, "dsCertificateData");
                        i.e(list, "rootCertsData");
                        this.directoryServerId = str;
                        this.dsCertificateData = str2;
                        this.rootCertsData = list;
                        this.keyId = str3;
                    }

                    public static /* synthetic */ DirectoryServerEncryption copy$default(DirectoryServerEncryption directoryServerEncryption, String str, String str2, List<String> list, String str3, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = directoryServerEncryption.directoryServerId;
                        }
                        if ((i & 2) != 0) {
                            str2 = directoryServerEncryption.dsCertificateData;
                        }
                        if ((i & 4) != 0) {
                            list = directoryServerEncryption.rootCertsData;
                        }
                        if ((i & 8) != 0) {
                            str3 = directoryServerEncryption.keyId;
                        }
                        return directoryServerEncryption.copy(str, str2, list, str3);
                    }

                    public final String component1() {
                        return this.directoryServerId;
                    }

                    public final String component2() {
                        return this.dsCertificateData;
                    }

                    public final List<String> component3() {
                        return this.rootCertsData;
                    }

                    public final String component4() {
                        return this.keyId;
                    }

                    public final DirectoryServerEncryption copy(String str, String str2, List<String> list, String str3) {
                        i.e(str, "directoryServerId");
                        i.e(str2, "dsCertificateData");
                        i.e(list, "rootCertsData");
                        return new DirectoryServerEncryption(str, str2, list, str3);
                    }

                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof DirectoryServerEncryption)) {
                            return false;
                        }
                        DirectoryServerEncryption directoryServerEncryption = (DirectoryServerEncryption) obj;
                        return i.a(this.directoryServerId, directoryServerEncryption.directoryServerId) && i.a(this.dsCertificateData, directoryServerEncryption.dsCertificateData) && i.a(this.rootCertsData, directoryServerEncryption.rootCertsData) && i.a(this.keyId, directoryServerEncryption.keyId);
                    }

                    public final String getDirectoryServerId() {
                        return this.directoryServerId;
                    }

                    public final String getDsCertificateData() {
                        return this.dsCertificateData;
                    }

                    public final String getKeyId() {
                        return this.keyId;
                    }

                    public final List<String> getRootCertsData() {
                        return this.rootCertsData;
                    }

                    public int hashCode() {
                        String str = this.directoryServerId;
                        int i = 0;
                        int hashCode = (str != null ? str.hashCode() : 0) * 31;
                        String str2 = this.dsCertificateData;
                        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                        List<String> list = this.rootCertsData;
                        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
                        String str3 = this.keyId;
                        if (str3 != null) {
                            i = str3.hashCode();
                        }
                        return hashCode3 + i;
                    }

                    public String toString() {
                        StringBuilder P0 = a.P0("DirectoryServerEncryption(directoryServerId=");
                        P0.append(this.directoryServerId);
                        P0.append(", dsCertificateData=");
                        P0.append(this.dsCertificateData);
                        P0.append(", rootCertsData=");
                        P0.append(this.rootCertsData);
                        P0.append(", keyId=");
                        return a.y0(P0, this.keyId, ")");
                    }

                    public void writeToParcel(Parcel parcel, int i) {
                        i.e(parcel, "parcel");
                        parcel.writeString(this.directoryServerId);
                        parcel.writeString(this.dsCertificateData);
                        parcel.writeStringList(this.rootCertsData);
                        parcel.writeString(this.keyId);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public Use3DS2(String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption) {
                    super((f) null);
                    i.e(str, Stripe3ds2AuthParams.FIELD_SOURCE);
                    i.e(str2, "serverName");
                    i.e(str3, "transactionId");
                    i.e(directoryServerEncryption, "serverEncryption");
                    this.source = str;
                    this.serverName = str2;
                    this.transactionId = str3;
                    this.serverEncryption = directoryServerEncryption;
                }

                public static /* synthetic */ Use3DS2 copy$default(Use3DS2 use3DS2, String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = use3DS2.source;
                    }
                    if ((i & 2) != 0) {
                        str2 = use3DS2.serverName;
                    }
                    if ((i & 4) != 0) {
                        str3 = use3DS2.transactionId;
                    }
                    if ((i & 8) != 0) {
                        directoryServerEncryption = use3DS2.serverEncryption;
                    }
                    return use3DS2.copy(str, str2, str3, directoryServerEncryption);
                }

                public final String component1() {
                    return this.source;
                }

                public final String component2() {
                    return this.serverName;
                }

                public final String component3() {
                    return this.transactionId;
                }

                public final DirectoryServerEncryption component4() {
                    return this.serverEncryption;
                }

                public final Use3DS2 copy(String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption) {
                    i.e(str, Stripe3ds2AuthParams.FIELD_SOURCE);
                    i.e(str2, "serverName");
                    i.e(str3, "transactionId");
                    i.e(directoryServerEncryption, "serverEncryption");
                    return new Use3DS2(str, str2, str3, directoryServerEncryption);
                }

                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Use3DS2)) {
                        return false;
                    }
                    Use3DS2 use3DS2 = (Use3DS2) obj;
                    return i.a(this.source, use3DS2.source) && i.a(this.serverName, use3DS2.serverName) && i.a(this.transactionId, use3DS2.transactionId) && i.a(this.serverEncryption, use3DS2.serverEncryption);
                }

                public final DirectoryServerEncryption getServerEncryption() {
                    return this.serverEncryption;
                }

                public final String getServerName() {
                    return this.serverName;
                }

                public final String getSource() {
                    return this.source;
                }

                public final String getTransactionId() {
                    return this.transactionId;
                }

                public int hashCode() {
                    String str = this.source;
                    int i = 0;
                    int hashCode = (str != null ? str.hashCode() : 0) * 31;
                    String str2 = this.serverName;
                    int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                    String str3 = this.transactionId;
                    int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                    DirectoryServerEncryption directoryServerEncryption = this.serverEncryption;
                    if (directoryServerEncryption != null) {
                        i = directoryServerEncryption.hashCode();
                    }
                    return hashCode3 + i;
                }

                public String toString() {
                    StringBuilder P0 = a.P0("Use3DS2(source=");
                    P0.append(this.source);
                    P0.append(", serverName=");
                    P0.append(this.serverName);
                    P0.append(", transactionId=");
                    P0.append(this.transactionId);
                    P0.append(", serverEncryption=");
                    P0.append(this.serverEncryption);
                    P0.append(")");
                    return P0.toString();
                }

                public void writeToParcel(Parcel parcel, int i) {
                    i.e(parcel, "parcel");
                    parcel.writeString(this.source);
                    parcel.writeString(this.serverName);
                    parcel.writeString(this.transactionId);
                    this.serverEncryption.writeToParcel(parcel, 0);
                }
            }

            private SdkData() {
                super((f) null);
            }

            public /* synthetic */ SdkData(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/model/WeChat;", "component1", "()Lcom/stripe/android/model/WeChat;", "weChat", "copy", "(Lcom/stripe/android/model/WeChat;)Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/WeChat;", "getWeChat", "<init>", "(Lcom/stripe/android/model/WeChat;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeIntent.kt */
        public static final class WeChatPayRedirect extends NextActionData {
            public static final Parcelable.Creator<WeChatPayRedirect> CREATOR = new Creator();
            private final WeChat weChat;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<WeChatPayRedirect> {
                public final WeChatPayRedirect createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new WeChatPayRedirect(WeChat.CREATOR.createFromParcel(parcel));
                }

                public final WeChatPayRedirect[] newArray(int i) {
                    return new WeChatPayRedirect[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public WeChatPayRedirect(WeChat weChat2) {
                super((f) null);
                i.e(weChat2, "weChat");
                this.weChat = weChat2;
            }

            public static /* synthetic */ WeChatPayRedirect copy$default(WeChatPayRedirect weChatPayRedirect, WeChat weChat2, int i, Object obj) {
                if ((i & 1) != 0) {
                    weChat2 = weChatPayRedirect.weChat;
                }
                return weChatPayRedirect.copy(weChat2);
            }

            public final WeChat component1() {
                return this.weChat;
            }

            public final WeChatPayRedirect copy(WeChat weChat2) {
                i.e(weChat2, "weChat");
                return new WeChatPayRedirect(weChat2);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof WeChatPayRedirect) && i.a(this.weChat, ((WeChatPayRedirect) obj).weChat);
                }
                return true;
            }

            public final WeChat getWeChat() {
                return this.weChat;
            }

            public int hashCode() {
                WeChat weChat2 = this.weChat;
                if (weChat2 != null) {
                    return weChat2.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder P0 = a.P0("WeChatPayRedirect(weChat=");
                P0.append(this.weChat);
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                this.weChat.writeToParcel(parcel, 0);
            }
        }

        private NextActionData() {
        }

        public /* synthetic */ NextActionData(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionType;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "getCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "RedirectToUrl", "UseStripeSdk", "DisplayOxxoDetails", "AlipayRedirect", "BlikAuthorize", "WeChatPayRedirect", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeIntent.kt */
    public enum NextActionType {
        RedirectToUrl("redirect_to_url"),
        UseStripeSdk("use_stripe_sdk"),
        DisplayOxxoDetails("oxxo_display_details"),
        AlipayRedirect("alipay_handle_redirect"),
        BlikAuthorize("blik_authorize"),
        WeChatPayRedirect("wechat_pay_redirect_to_android_app");
        
        public static final Companion Companion = null;
        private final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;", "", "", "code", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "fromCode$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$NextActionType;", "fromCode", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeIntent.kt */
        public static final class Companion {
            private Companion() {
            }

            public final NextActionType fromCode$payments_core_release(String str) {
                NextActionType[] values = NextActionType.values();
                for (int i = 0; i < 6; i++) {
                    NextActionType nextActionType = values[i];
                    if (i.a(nextActionType.getCode(), str)) {
                        return nextActionType;
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

        private NextActionType(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }

        public String toString() {
            return this.code;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Status;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "getCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Canceled", "Processing", "RequiresAction", "RequiresConfirmation", "RequiresPaymentMethod", "Succeeded", "RequiresCapture", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeIntent.kt */
    public enum Status {
        Canceled("canceled"),
        Processing("processing"),
        RequiresAction("requires_action"),
        RequiresConfirmation("requires_confirmation"),
        RequiresPaymentMethod("requires_payment_method"),
        Succeeded("succeeded"),
        RequiresCapture("requires_capture");
        
        public static final Companion Companion = null;
        private final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Status$Companion;", "", "", "code", "Lcom/stripe/android/model/StripeIntent$Status;", "fromCode$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$Status;", "fromCode", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeIntent.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Status fromCode$payments_core_release(String str) {
                Status[] values = Status.values();
                for (int i = 0; i < 7; i++) {
                    Status status = values[i];
                    if (i.a(status.getCode(), str)) {
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

        public final String getCode() {
            return this.code;
        }

        public String toString() {
            return this.code;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Usage;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "getCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "OnSession", "OffSession", "OneTime", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeIntent.kt */
    public enum Usage {
        OnSession("on_session"),
        OffSession("off_session"),
        OneTime("one_time");
        
        public static final Companion Companion = null;
        private final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Usage$Companion;", "", "", "code", "Lcom/stripe/android/model/StripeIntent$Usage;", "fromCode$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$Usage;", "fromCode", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeIntent.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Usage fromCode$payments_core_release(String str) {
                Usage[] values = Usage.values();
                for (int i = 0; i < 3; i++) {
                    Usage usage = values[i];
                    if (i.a(usage.getCode(), str)) {
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

        public final String getCode() {
            return this.code;
        }

        public String toString() {
            return this.code;
        }
    }

    String getClientSecret();

    long getCreated();

    String getDescription();

    String getId();

    String getLastErrorMessage();

    NextActionData getNextActionData();

    NextActionType getNextActionType();

    PaymentMethod getPaymentMethod();

    String getPaymentMethodId();

    List<String> getPaymentMethodTypes();

    Status getStatus();

    boolean isConfirmed();

    boolean isLiveMode();

    boolean requiresAction();

    boolean requiresConfirmation();
}
