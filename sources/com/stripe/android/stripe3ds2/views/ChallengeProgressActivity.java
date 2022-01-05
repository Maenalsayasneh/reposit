package com.stripe.android.stripe3ds2.views;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.stripe3ds2.databinding.StripeProgressViewLayoutBinding;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.stripe3ds2.views.HeaderZoneCustomizer;
import com.ults.listeners.SdkChallengeInterface;
import h0.b.a.e;
import h0.q.k0;
import h0.q.l0;
import h0.q.y;
import i0.d.a.a.a;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.c;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 (2\u00020\u0001:\u0004)*(+B\u0007¢\u0006\u0004\b'\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u001f\u0010\u000f\u001a\u0004\u0018\u00010\n8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u00108@@\u0000X\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u001a8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0002¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b$\u0010%¨\u0006,"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity;", "Lh0/b/a/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "onStop", "()V", "onBackPressed", "Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity$Args;", "nullableArgs$delegate", "Lm0/c;", "getNullableArgs", "()Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity$Args;", "nullableArgs", "Lcom/stripe/android/stripe3ds2/databinding/StripeProgressViewLayoutBinding;", "viewBinding$delegate", "getViewBinding$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/databinding/StripeProgressViewLayoutBinding;", "viewBinding", "Lh0/s/a/a;", "localBroadcastManager$delegate", "getLocalBroadcastManager", "()Lh0/s/a/a;", "localBroadcastManager", "Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity$ChallengeProgressViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity$ChallengeProgressViewModel;", "viewModel", "Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity$DialogBroadcastReceiver;", "dialogBroadcastReceiver", "Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity$DialogBroadcastReceiver;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter$delegate", "getErrorReporter", "()Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "<init>", "Companion", "Args", "ChallengeProgressViewModel", "DialogBroadcastReceiver", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeProgressActivity.kt */
public final class ChallengeProgressActivity extends e {
    public static final Companion Companion = new Companion((f) null);
    private static final String EXTRA_ARGS = "com.stripe.android.stripe3ds2.views.ChallengeProgressActivity.ARGS";
    private DialogBroadcastReceiver dialogBroadcastReceiver;
    private final c errorReporter$delegate = h.H2(new ChallengeProgressActivity$errorReporter$2(this));
    private final c localBroadcastManager$delegate = h.H2(new ChallengeProgressActivity$localBroadcastManager$2(this));
    private final c nullableArgs$delegate = h.H2(new ChallengeProgressActivity$nullableArgs$2(this));
    private final c viewBinding$delegate = h.H2(new ChallengeProgressActivity$viewBinding$2(this));
    private final c viewModel$delegate = new l0(m.a(ChallengeProgressViewModel.class), new ChallengeProgressActivity$$special$$inlined$viewModels$2(this), new ChallengeProgressActivity$$special$$inlined$viewModels$1(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u000f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010\u0007R\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010\nR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010\u0004R\u0019\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010\r¨\u0006-"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity$Args;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "", "component2", "()Z", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "component3", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "component4", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "directoryServerName", "cancelable", "uiCustomization", "sdkTransactionId", "copy", "(Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity$Args;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getCancelable", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "getUiCustomization", "Ljava/lang/String;", "getDirectoryServerName", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransactionId", "<init>", "(Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeProgressActivity.kt */
    public static final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean cancelable;
        private final String directoryServerName;
        private final SdkTransactionId sdkTransactionId;
        private final StripeUiCustomization uiCustomization;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Args> {
            public final Args createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Args(parcel.readString(), parcel.readInt() != 0, StripeUiCustomization.CREATOR.createFromParcel(parcel), SdkTransactionId.CREATOR.createFromParcel(parcel));
            }

            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(String str, boolean z, StripeUiCustomization stripeUiCustomization, SdkTransactionId sdkTransactionId2) {
            i.e(str, "directoryServerName");
            i.e(stripeUiCustomization, "uiCustomization");
            i.e(sdkTransactionId2, "sdkTransactionId");
            this.directoryServerName = str;
            this.cancelable = z;
            this.uiCustomization = stripeUiCustomization;
            this.sdkTransactionId = sdkTransactionId2;
        }

        public static /* synthetic */ Args copy$default(Args args, String str, boolean z, StripeUiCustomization stripeUiCustomization, SdkTransactionId sdkTransactionId2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.directoryServerName;
            }
            if ((i & 2) != 0) {
                z = args.cancelable;
            }
            if ((i & 4) != 0) {
                stripeUiCustomization = args.uiCustomization;
            }
            if ((i & 8) != 0) {
                sdkTransactionId2 = args.sdkTransactionId;
            }
            return args.copy(str, z, stripeUiCustomization, sdkTransactionId2);
        }

        public final String component1() {
            return this.directoryServerName;
        }

        public final boolean component2() {
            return this.cancelable;
        }

        public final StripeUiCustomization component3() {
            return this.uiCustomization;
        }

        public final SdkTransactionId component4() {
            return this.sdkTransactionId;
        }

        public final Args copy(String str, boolean z, StripeUiCustomization stripeUiCustomization, SdkTransactionId sdkTransactionId2) {
            i.e(str, "directoryServerName");
            i.e(stripeUiCustomization, "uiCustomization");
            i.e(sdkTransactionId2, "sdkTransactionId");
            return new Args(str, z, stripeUiCustomization, sdkTransactionId2);
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
            return i.a(this.directoryServerName, args.directoryServerName) && this.cancelable == args.cancelable && i.a(this.uiCustomization, args.uiCustomization) && i.a(this.sdkTransactionId, args.sdkTransactionId);
        }

        public final boolean getCancelable() {
            return this.cancelable;
        }

        public final String getDirectoryServerName() {
            return this.directoryServerName;
        }

        public final SdkTransactionId getSdkTransactionId() {
            return this.sdkTransactionId;
        }

        public final StripeUiCustomization getUiCustomization() {
            return this.uiCustomization;
        }

        public int hashCode() {
            String str = this.directoryServerName;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.cancelable;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            StripeUiCustomization stripeUiCustomization = this.uiCustomization;
            int hashCode2 = (i2 + (stripeUiCustomization != null ? stripeUiCustomization.hashCode() : 0)) * 31;
            SdkTransactionId sdkTransactionId2 = this.sdkTransactionId;
            if (sdkTransactionId2 != null) {
                i = sdkTransactionId2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Args(directoryServerName=");
            P0.append(this.directoryServerName);
            P0.append(", cancelable=");
            P0.append(this.cancelable);
            P0.append(", uiCustomization=");
            P0.append(this.uiCustomization);
            P0.append(", sdkTransactionId=");
            P0.append(this.sdkTransactionId);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.directoryServerName);
            parcel.writeInt(this.cancelable ? 1 : 0);
            this.uiCustomization.writeToParcel(parcel, 0);
            this.sdkTransactionId.writeToParcel(parcel, 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity$ChallengeProgressViewModel;", "Lh0/q/k0;", "Lh0/q/y;", "", "finishLiveData", "Lh0/q/y;", "getFinishLiveData", "()Lh0/q/y;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeProgressActivity.kt */
    public static final class ChallengeProgressViewModel extends k0 {
        private final y<Boolean> finishLiveData = new y<>();

        public final y<Boolean> getFinishLiveData() {
            return this.finishLiveData;
        }
    }

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity$Companion;", "", "Landroid/app/Activity;", "activity", "", "directoryServerName", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lm0/i;", "show", "(Landroid/app/Activity;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V", "Landroid/content/Context;", "context", "", "cancelable", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "(Landroid/content/Context;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V", "Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity$Args;", "args", "Landroid/content/Intent;", "createIntent$3ds2sdk_release", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity$Args;)Landroid/content/Intent;", "createIntent", "EXTRA_ARGS", "Ljava/lang/String;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeProgressActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Intent createIntent$3ds2sdk_release(Context context, Args args) {
            i.e(context, "context");
            i.e(args, "args");
            Intent putExtra = new Intent(context, ChallengeProgressActivity.class).putExtra(ChallengeProgressActivity.EXTRA_ARGS, args);
            i.d(putExtra, "Intent(context, Challeng…utExtra(EXTRA_ARGS, args)");
            return putExtra;
        }

        public final void show(Activity activity, String str, SdkTransactionId sdkTransactionId) {
            i.e(activity, "activity");
            i.e(str, "directoryServerName");
            i.e(sdkTransactionId, "sdkTransactionId");
            StripeUiCustomization createWithAppTheme = StripeUiCustomization.createWithAppTheme(activity);
            i.d(createWithAppTheme, "StripeUiCustomization.createWithAppTheme(activity)");
            show(activity, str, false, createWithAppTheme, sdkTransactionId);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final void show(Context context, String str, boolean z, StripeUiCustomization stripeUiCustomization, SdkTransactionId sdkTransactionId) {
            i.e(context, "context");
            i.e(str, "directoryServerName");
            i.e(stripeUiCustomization, "uiCustomization");
            i.e(sdkTransactionId, "sdkTransactionId");
            context.startActivity(createIntent$3ds2sdk_release(context, new Args(str, z, stripeUiCustomization, sdkTransactionId)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeProgressActivity$DialogBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lm0/i;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lh0/q/y;", "", "finishLiveData", "Lh0/q/y;", "<init>", "(Lh0/q/y;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeProgressActivity.kt */
    public static final class DialogBroadcastReceiver extends BroadcastReceiver {
        private final y<Boolean> finishLiveData;

        public DialogBroadcastReceiver(y<Boolean> yVar) {
            i.e(yVar, "finishLiveData");
            this.finishLiveData = yVar;
        }

        public void onReceive(Context context, Intent intent) {
            i.e(context, "context");
            i.e(intent, "intent");
            this.finishLiveData.setValue(Boolean.TRUE);
        }
    }

    private final ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.errorReporter$delegate.getValue();
    }

    private final h0.s.a.a getLocalBroadcastManager() {
        return (h0.s.a.a) this.localBroadcastManager$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final Args getNullableArgs() {
        return (Args) this.nullableArgs$delegate.getValue();
    }

    private final ChallengeProgressViewModel getViewModel() {
        return (ChallengeProgressViewModel) this.viewModel$delegate.getValue();
    }

    public static final void show(Activity activity, String str, SdkTransactionId sdkTransactionId) {
        Companion.show(activity, str, sdkTransactionId);
    }

    public static final void show(Context context, String str, boolean z, StripeUiCustomization stripeUiCustomization, SdkTransactionId sdkTransactionId) {
        Companion.show(context, str, z, stripeUiCustomization, sdkTransactionId);
    }

    public final StripeProgressViewLayoutBinding getViewBinding$3ds2sdk_release() {
        return (StripeProgressViewLayoutBinding) this.viewBinding$delegate.getValue();
    }

    public void onBackPressed() {
        Args nullableArgs = getNullableArgs();
        if (nullableArgs != null && nullableArgs.getCancelable()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Args nullableArgs = getNullableArgs();
        if (nullableArgs == null) {
            getErrorReporter().reportError(new IllegalArgumentException("ChallengeProgressActivity's Args was null."));
            finish();
            return;
        }
        setContentView((View) getViewBinding$3ds2sdk_release().getRoot());
        getViewModel().getFinishLiveData().observe(this, new ChallengeProgressActivity$onCreate$1(this));
        h0.b.a.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.f();
        }
        StripeUiCustomization uiCustomization = nullableArgs.getUiCustomization();
        ToolbarCustomization toolbarCustomization = uiCustomization.getToolbarCustomization();
        if (toolbarCustomization != null) {
            HeaderZoneCustomizer.Companion companion = HeaderZoneCustomizer.Companion;
            i.d(toolbarCustomization, "toolbarCustomization");
            companion.customizeStatusBar(this, toolbarCustomization);
        }
        Brand lookup$3ds2sdk_release = Brand.Companion.lookup$3ds2sdk_release(nullableArgs.getDirectoryServerName(), getErrorReporter());
        ImageView imageView = getViewBinding$3ds2sdk_release().brandLogo;
        imageView.setImageDrawable(h0.i.b.a.getDrawable(this, lookup$3ds2sdk_release.getDrawableResId$3ds2sdk_release()));
        i.d(imageView, "brandLogo");
        Integer nameResId$3ds2sdk_release = lookup$3ds2sdk_release.getNameResId$3ds2sdk_release();
        imageView.setContentDescription(nameResId$3ds2sdk_release != null ? getString(nameResId$3ds2sdk_release.intValue()) : null);
        imageView.setVisibility(0);
        CustomizeUtils customizeUtils = CustomizeUtils.INSTANCE;
        CircularProgressIndicator circularProgressIndicator = getViewBinding$3ds2sdk_release().progressBar;
        i.d(circularProgressIndicator, "viewBinding.progressBar");
        customizeUtils.applyProgressBarColor$3ds2sdk_release(circularProgressIndicator, uiCustomization);
        DialogBroadcastReceiver dialogBroadcastReceiver2 = new DialogBroadcastReceiver(getViewModel().getFinishLiveData());
        this.dialogBroadcastReceiver = dialogBroadcastReceiver2;
        getLocalBroadcastManager().b(dialogBroadcastReceiver2, new IntentFilter(SdkChallengeInterface.UL_HANDLE_CHALLENGE_ACTION));
    }

    public void onStop() {
        DialogBroadcastReceiver dialogBroadcastReceiver2 = this.dialogBroadcastReceiver;
        if (dialogBroadcastReceiver2 != null) {
            getLocalBroadcastManager().d(dialogBroadcastReceiver2);
        }
        this.dialogBroadcastReceiver = null;
        super.onStop();
    }
}
