package com.stripe.android.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import h0.a.f.d.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u0018B%\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract;", "Lh0/a/f/d/a;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Lkotlin/Function1;", "", "hasCompatibleBrowser", "Lm0/n/a/l;", "Lcom/stripe/android/payments/DefaultReturnUrl;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "<init>", "(Lcom/stripe/android/payments/DefaultReturnUrl;Lm0/n/a/l;)V", "Companion", "Args", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentBrowserAuthContract.kt */
public final class PaymentBrowserAuthContract extends a<Args, PaymentFlowResult.Unvalidated> {
    public static final Companion Companion = new Companion((f) null);
    private static final String EXTRA_ARGS = "extra_args";
    private final DefaultReturnUrl defaultReturnUrl;
    private final l<Context, Boolean> hasCompatibleBrowser;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010'\u001a\u00020\u0004\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bH\u0010IJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010#\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b+\u0010\rJ\u0010\u0010,\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b,\u0010\u0010J\u001a\u0010/\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b1\u0010\u0010J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b6\u00107R\u001b\u0010%\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\b9\u0010\rR\u0019\u0010!\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b!\u00108\u001a\u0004\b:\u0010\rR\u0019\u0010'\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010;\u001a\u0004\b<\u0010\u0015R\u0019\u0010#\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\b=\u0010\u0015R\u001b\u0010$\u001a\u0004\u0018\u00010\u00168\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010>\u001a\u0004\b?\u0010\u0018R\u0019\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u00108\u001a\u0004\b@\u0010\rR\u0019\u0010&\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010;\u001a\u0004\bA\u0010\u0015R\u0019\u0010 \u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b \u00108\u001a\u0004\bB\u0010\rR\u001b\u0010(\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010C\u001a\u0004\bD\u0010\u001dR\u001b\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u00108\u001a\u0004\bE\u0010\rR\u0019\u0010\u001f\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010F\u001a\u0004\bG\u0010\u0010¨\u0006J"}, d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Landroid/os/Parcelable;", "Lcom/stripe/android/payments/DefaultReturnUrl;", "defaultReturnUrl", "", "hasDefaultReturnUrl$payments_core_release", "(Lcom/stripe/android/payments/DefaultReturnUrl;)Z", "hasDefaultReturnUrl", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "", "component1", "()Ljava/lang/String;", "", "component2", "()I", "component3", "component4", "component5", "component6", "()Z", "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "component7", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "component8", "component9", "component10", "component11", "()Ljava/lang/Integer;", "objectId", "requestCode", "clientSecret", "url", "returnUrl", "enableLogging", "toolbarCustomization", "stripeAccountId", "shouldCancelSource", "shouldCancelIntentOnUserNavigation", "statusBarColor", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStripeAccountId", "getUrl", "Z", "getShouldCancelIntentOnUserNavigation", "getEnableLogging", "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "getToolbarCustomization", "getObjectId", "getShouldCancelSource", "getClientSecret", "Ljava/lang/Integer;", "getStatusBarColor", "getReturnUrl", "I", "getRequestCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentBrowserAuthContract.kt */
    public static final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String clientSecret;
        private final boolean enableLogging;
        private final String objectId;
        private final int requestCode;
        private final String returnUrl;
        private final boolean shouldCancelIntentOnUserNavigation;
        private final boolean shouldCancelSource;
        private final Integer statusBarColor;
        private final String stripeAccountId;
        private final StripeToolbarCustomization toolbarCustomization;
        private final String url;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Args> {
            public final Args createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                i.e(parcel2, "in");
                return new Args(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? StripeToolbarCustomization.CREATOR.createFromParcel(parcel2) : null, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(String str, int i, String str2, String str3, String str4, boolean z, StripeToolbarCustomization stripeToolbarCustomization, String str5, boolean z2, boolean z3, Integer num) {
            i.e(str, "objectId");
            i.e(str2, "clientSecret");
            i.e(str3, "url");
            this.objectId = str;
            this.requestCode = i;
            this.clientSecret = str2;
            this.url = str3;
            this.returnUrl = str4;
            this.enableLogging = z;
            this.toolbarCustomization = stripeToolbarCustomization;
            this.stripeAccountId = str5;
            this.shouldCancelSource = z2;
            this.shouldCancelIntentOnUserNavigation = z3;
            this.statusBarColor = num;
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, String str2, String str3, String str4, boolean z, StripeToolbarCustomization stripeToolbarCustomization, String str5, boolean z2, boolean z3, Integer num, int i2, Object obj) {
            Args args2 = args;
            int i3 = i2;
            return args.copy((i3 & 1) != 0 ? args2.objectId : str, (i3 & 2) != 0 ? args2.requestCode : i, (i3 & 4) != 0 ? args2.clientSecret : str2, (i3 & 8) != 0 ? args2.url : str3, (i3 & 16) != 0 ? args2.returnUrl : str4, (i3 & 32) != 0 ? args2.enableLogging : z, (i3 & 64) != 0 ? args2.toolbarCustomization : stripeToolbarCustomization, (i3 & 128) != 0 ? args2.stripeAccountId : str5, (i3 & 256) != 0 ? args2.shouldCancelSource : z2, (i3 & 512) != 0 ? args2.shouldCancelIntentOnUserNavigation : z3, (i3 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? args2.statusBarColor : num);
        }

        public final String component1() {
            return this.objectId;
        }

        public final boolean component10() {
            return this.shouldCancelIntentOnUserNavigation;
        }

        public final Integer component11() {
            return this.statusBarColor;
        }

        public final int component2() {
            return this.requestCode;
        }

        public final String component3() {
            return this.clientSecret;
        }

        public final String component4() {
            return this.url;
        }

        public final String component5() {
            return this.returnUrl;
        }

        public final boolean component6() {
            return this.enableLogging;
        }

        public final StripeToolbarCustomization component7() {
            return this.toolbarCustomization;
        }

        public final String component8() {
            return this.stripeAccountId;
        }

        public final boolean component9() {
            return this.shouldCancelSource;
        }

        public final Args copy(String str, int i, String str2, String str3, String str4, boolean z, StripeToolbarCustomization stripeToolbarCustomization, String str5, boolean z2, boolean z3, Integer num) {
            i.e(str, "objectId");
            String str6 = str2;
            i.e(str6, "clientSecret");
            String str7 = str3;
            i.e(str7, "url");
            return new Args(str, i, str6, str7, str4, z, stripeToolbarCustomization, str5, z2, z3, num);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Args)) {
                return false;
            }
            Args args = (Args) obj;
            return i.a(this.objectId, args.objectId) && this.requestCode == args.requestCode && i.a(this.clientSecret, args.clientSecret) && i.a(this.url, args.url) && i.a(this.returnUrl, args.returnUrl) && this.enableLogging == args.enableLogging && i.a(this.toolbarCustomization, args.toolbarCustomization) && i.a(this.stripeAccountId, args.stripeAccountId) && this.shouldCancelSource == args.shouldCancelSource && this.shouldCancelIntentOnUserNavigation == args.shouldCancelIntentOnUserNavigation && i.a(this.statusBarColor, args.statusBarColor);
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final String getObjectId() {
            return this.objectId;
        }

        public final int getRequestCode() {
            return this.requestCode;
        }

        public final String getReturnUrl() {
            return this.returnUrl;
        }

        public final boolean getShouldCancelIntentOnUserNavigation() {
            return this.shouldCancelIntentOnUserNavigation;
        }

        public final boolean getShouldCancelSource() {
            return this.shouldCancelSource;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public final StripeToolbarCustomization getToolbarCustomization() {
            return this.toolbarCustomization;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean hasDefaultReturnUrl$payments_core_release(DefaultReturnUrl defaultReturnUrl) {
            i.e(defaultReturnUrl, "defaultReturnUrl");
            return i.a(this.returnUrl, defaultReturnUrl.getValue());
        }

        public int hashCode() {
            String str = this.objectId;
            int i = 0;
            int M = i0.d.a.a.a.M(this.requestCode, (str != null ? str.hashCode() : 0) * 31, 31);
            String str2 = this.clientSecret;
            int hashCode = (M + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.url;
            int hashCode2 = (hashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.returnUrl;
            int hashCode3 = (hashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31;
            boolean z = this.enableLogging;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
            StripeToolbarCustomization stripeToolbarCustomization = this.toolbarCustomization;
            int hashCode4 = (i2 + (stripeToolbarCustomization != null ? stripeToolbarCustomization.hashCode() : 0)) * 31;
            String str5 = this.stripeAccountId;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            boolean z3 = this.shouldCancelSource;
            if (z3) {
                z3 = true;
            }
            int i3 = (hashCode5 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.shouldCancelIntentOnUserNavigation;
            if (!z4) {
                z2 = z4;
            }
            int i4 = (i3 + (z2 ? 1 : 0)) * 31;
            Integer num = this.statusBarColor;
            if (num != null) {
                i = num.hashCode();
            }
            return i4 + i;
        }

        public final Bundle toBundle() {
            return g0.a.b.b.a.g(new Pair("extra_args", this));
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Args(objectId=");
            P0.append(this.objectId);
            P0.append(", requestCode=");
            P0.append(this.requestCode);
            P0.append(", clientSecret=");
            P0.append(this.clientSecret);
            P0.append(", url=");
            P0.append(this.url);
            P0.append(", returnUrl=");
            P0.append(this.returnUrl);
            P0.append(", enableLogging=");
            P0.append(this.enableLogging);
            P0.append(", toolbarCustomization=");
            P0.append(this.toolbarCustomization);
            P0.append(", stripeAccountId=");
            P0.append(this.stripeAccountId);
            P0.append(", shouldCancelSource=");
            P0.append(this.shouldCancelSource);
            P0.append(", shouldCancelIntentOnUserNavigation=");
            P0.append(this.shouldCancelIntentOnUserNavigation);
            P0.append(", statusBarColor=");
            P0.append(this.statusBarColor);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.objectId);
            parcel.writeInt(this.requestCode);
            parcel.writeString(this.clientSecret);
            parcel.writeString(this.url);
            parcel.writeString(this.returnUrl);
            parcel.writeInt(this.enableLogging ? 1 : 0);
            StripeToolbarCustomization stripeToolbarCustomization = this.toolbarCustomization;
            if (stripeToolbarCustomization != null) {
                parcel.writeInt(1);
                stripeToolbarCustomization.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.stripeAccountId);
            parcel.writeInt(this.shouldCancelSource ? 1 : 0);
            parcel.writeInt(this.shouldCancelIntentOnUserNavigation ? 1 : 0);
            Integer num = this.statusBarColor;
            if (num != null) {
                i0.d.a.a.a.i(parcel, 1, num);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Args(java.lang.String r16, int r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization r22, java.lang.String r23, boolean r24, boolean r25, java.lang.Integer r26, int r27, m0.n.b.f r28) {
            /*
                r15 = this;
                r0 = r27
                r1 = r0 & 16
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r8 = r2
                goto L_0x000b
            L_0x0009:
                r8 = r20
            L_0x000b:
                r1 = r0 & 32
                r3 = 0
                if (r1 == 0) goto L_0x0012
                r9 = r3
                goto L_0x0014
            L_0x0012:
                r9 = r21
            L_0x0014:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x001a
                r10 = r2
                goto L_0x001c
            L_0x001a:
                r10 = r22
            L_0x001c:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0022
                r11 = r2
                goto L_0x0024
            L_0x0022:
                r11 = r23
            L_0x0024:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x002a
                r12 = r3
                goto L_0x002c
            L_0x002a:
                r12 = r24
            L_0x002c:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0033
                r1 = 1
                r13 = r1
                goto L_0x0035
            L_0x0033:
                r13 = r25
            L_0x0035:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x003b
                r14 = r2
                goto L_0x003d
            L_0x003b:
                r14 = r26
            L_0x003d:
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.auth.PaymentBrowserAuthContract.Args.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization, java.lang.String, boolean, boolean, java.lang.Integer, int, m0.n.b.f):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$Companion;", "", "Landroid/content/Intent;", "intent", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "parseArgs$payments_core_release", "(Landroid/content/Intent;)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "parseArgs", "", "EXTRA_ARGS", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentBrowserAuthContract.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Args parseArgs$payments_core_release(Intent intent) {
            i.e(intent, "intent");
            return (Args) intent.getParcelableExtra("extra_args");
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentBrowserAuthContract(DefaultReturnUrl defaultReturnUrl2, l lVar, int i, f fVar) {
        this(defaultReturnUrl2, (i & 2) != 0 ? AnonymousClass1.INSTANCE : lVar);
    }

    public PaymentBrowserAuthContract(DefaultReturnUrl defaultReturnUrl2, l<? super Context, Boolean> lVar) {
        i.e(defaultReturnUrl2, "defaultReturnUrl");
        i.e(lVar, "hasCompatibleBrowser");
        this.defaultReturnUrl = defaultReturnUrl2;
        this.hasCompatibleBrowser = lVar;
    }

    public Intent createIntent(Context context, Args args) {
        Class cls;
        Window window;
        Context context2 = context;
        Args args2 = args;
        i.e(context2, "context");
        i.e(args2, "input");
        boolean z = this.hasCompatibleBrowser.invoke(context2).booleanValue() && args2.hasDefaultReturnUrl$payments_core_release(this.defaultReturnUrl);
        Bundle bundle = Args.copy$default(args, (String) null, 0, (String) null, (String) null, (String) null, false, (StripeToolbarCustomization) null, (String) null, false, false, (!(context2 instanceof Activity) || (window = ((Activity) context2).getWindow()) == null) ? null : Integer.valueOf(window.getStatusBarColor()), 1023, (Object) null).toBundle();
        boolean z2 = z;
        if (z2) {
            cls = StripeBrowserLauncherActivity.class;
        } else if (!z2) {
            cls = PaymentAuthWebViewActivity.class;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Intent intent = new Intent(context2, cls);
        intent.putExtras(bundle);
        return intent;
    }

    public PaymentFlowResult.Unvalidated parseResult(int i, Intent intent) {
        if (intent != null) {
            return (PaymentFlowResult.Unvalidated) intent.getParcelableExtra("extra_args");
        }
        return null;
    }
}
