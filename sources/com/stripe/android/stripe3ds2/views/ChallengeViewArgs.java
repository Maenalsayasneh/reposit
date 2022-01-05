package com.stripe.android.stripe3ds2.views;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import g0.a.b.b.a;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000 G2\u00020\u0001:\u0001GB?\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\u0006\u0010 \u001a\u00020\u0017¢\u0006\u0004\bE\u0010FJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b,\u0010\u0019J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b1\u00102R\u0019\u0010\u001e\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u00103\u001a\u0004\b4\u0010\u0013R\u0019\u0010\u001d\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b6\u0010\u0010R\u0019\u0010\u001b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b8\u0010\nR\u0019\u0010 \u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b \u00109\u001a\u0004\b:\u0010\u0019R\u0019\u0010\u001a\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010;\u001a\u0004\b<\u0010\u0007R\u0019\u0010\u001f\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010=\u001a\u0004\b>\u0010\u0016R\u0019\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010?\u001a\u0004\b@\u0010\rR\u0016\u0010D\u001a\u00020A8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006H"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "Landroid/os/Parcelable;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "component1", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "component2", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "component3", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "component4", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "component5", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;", "component6", "()Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;", "", "component7", "()I", "cresData", "creqData", "uiCustomization", "creqExecutorConfig", "creqExecutorFactory", "errorExecutorFactory", "timeoutMins", "copy", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;I)Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "getCreqExecutorFactory", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "getCreqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "getCreqData", "I", "getTimeoutMins", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "getCresData", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;", "getErrorExecutorFactory", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "getUiCustomization", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransactionId$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "<init>", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;I)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeViewArgs.kt */
public final class ChallengeViewArgs implements Parcelable {
    public static final Parcelable.Creator<ChallengeViewArgs> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    public static final String EXTRA_CREQ_DATA = "extra_creq_data";
    public static final String EXTRA_CREQ_EXECUTOR_CONFIG = "extra_creq_executor_config";
    public static final String EXTRA_CREQ_EXECUTOR_FACTORY = "extra_creq_executor_factory";
    public static final String EXTRA_CRES_DATA = "extra_cres_data";
    public static final String EXTRA_ERROR_EXECUTOR_FACTORY = "extra_error_executor_factory";
    public static final String EXTRA_TIMEOUT = "extra_timeout";
    public static final String EXTRA_UI_CUSTOMIZATION = "extra_ui_customization";
    private static final int MIN_TIMEOUT = 5;
    private final ChallengeRequestData creqData;
    private final ChallengeRequestExecutor.Config creqExecutorConfig;
    private final ChallengeRequestExecutor.Factory creqExecutorFactory;
    private final ChallengeResponseData cresData;
    private final ErrorRequestExecutor.Factory errorExecutorFactory;
    private final int timeoutMins;
    private final StripeUiCustomization uiCustomization;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0016\u0010\u000f\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs$Companion;", "", "Landroid/os/Bundle;", "extras", "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "create", "(Landroid/os/Bundle;)Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "", "EXTRA_CREQ_DATA", "Ljava/lang/String;", "EXTRA_CREQ_EXECUTOR_CONFIG", "EXTRA_CREQ_EXECUTOR_FACTORY", "EXTRA_CRES_DATA", "EXTRA_ERROR_EXECUTOR_FACTORY", "EXTRA_TIMEOUT", "EXTRA_UI_CUSTOMIZATION", "", "MIN_TIMEOUT", "I", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeViewArgs.kt */
    public static final class Companion {
        private Companion() {
        }

        public final ChallengeViewArgs create(Bundle bundle) {
            if (bundle != null) {
                ChallengeResponseData challengeResponseData = (ChallengeResponseData) bundle.getParcelable(ChallengeViewArgs.EXTRA_CRES_DATA);
                if (challengeResponseData != null) {
                    i.d(challengeResponseData, "extras.getParcelable<Cha…esponseData is required\")");
                    Serializable serializable = bundle.getSerializable(ChallengeViewArgs.EXTRA_CREQ_DATA);
                    Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transactions.ChallengeRequestData");
                    ChallengeRequestData challengeRequestData = (ChallengeRequestData) serializable;
                    StripeUiCustomization stripeUiCustomization = (StripeUiCustomization) bundle.getParcelable(ChallengeViewArgs.EXTRA_UI_CUSTOMIZATION);
                    if (stripeUiCustomization != null) {
                        i.d(stripeUiCustomization, "extras.getParcelable<Str…stomization is required\")");
                        Serializable serializable2 = bundle.getSerializable(ChallengeViewArgs.EXTRA_CREQ_EXECUTOR_CONFIG);
                        Objects.requireNonNull(serializable2, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor.Config");
                        Serializable serializable3 = bundle.getSerializable(ChallengeViewArgs.EXTRA_CREQ_EXECUTOR_FACTORY);
                        Objects.requireNonNull(serializable3, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor.Factory");
                        Serializable serializable4 = bundle.getSerializable(ChallengeViewArgs.EXTRA_ERROR_EXECUTOR_FACTORY);
                        Objects.requireNonNull(serializable4, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor.Factory");
                        return new ChallengeViewArgs(challengeResponseData, challengeRequestData, stripeUiCustomization, (ChallengeRequestExecutor.Config) serializable2, (ChallengeRequestExecutor.Factory) serializable3, (ErrorRequestExecutor.Factory) serializable4, bundle.getInt(ChallengeViewArgs.EXTRA_TIMEOUT, 5));
                    }
                    throw new InvalidInputException("UiCustomization is required", (Throwable) null, 2, (f) null);
                }
                throw new InvalidInputException("ChallengeResponseData is required", (Throwable) null, 2, (f) null);
            }
            throw new InvalidInputException("Intent extras required", (Throwable) null, 2, (f) null);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<ChallengeViewArgs> {
        public final ChallengeViewArgs createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new ChallengeViewArgs(ChallengeResponseData.CREATOR.createFromParcel(parcel), ChallengeRequestData.CREATOR.createFromParcel(parcel), StripeUiCustomization.CREATOR.createFromParcel(parcel), (ChallengeRequestExecutor.Config) parcel.readSerializable(), (ChallengeRequestExecutor.Factory) parcel.readSerializable(), (ErrorRequestExecutor.Factory) parcel.readSerializable(), parcel.readInt());
        }

        public final ChallengeViewArgs[] newArray(int i) {
            return new ChallengeViewArgs[i];
        }
    }

    public ChallengeViewArgs(ChallengeResponseData challengeResponseData, ChallengeRequestData challengeRequestData, StripeUiCustomization stripeUiCustomization, ChallengeRequestExecutor.Config config, ChallengeRequestExecutor.Factory factory, ErrorRequestExecutor.Factory factory2, int i) {
        i.e(challengeResponseData, "cresData");
        i.e(challengeRequestData, "creqData");
        i.e(stripeUiCustomization, "uiCustomization");
        i.e(config, "creqExecutorConfig");
        i.e(factory, "creqExecutorFactory");
        i.e(factory2, "errorExecutorFactory");
        this.cresData = challengeResponseData;
        this.creqData = challengeRequestData;
        this.uiCustomization = stripeUiCustomization;
        this.creqExecutorConfig = config;
        this.creqExecutorFactory = factory;
        this.errorExecutorFactory = factory2;
        this.timeoutMins = i;
    }

    public static /* synthetic */ ChallengeViewArgs copy$default(ChallengeViewArgs challengeViewArgs, ChallengeResponseData challengeResponseData, ChallengeRequestData challengeRequestData, StripeUiCustomization stripeUiCustomization, ChallengeRequestExecutor.Config config, ChallengeRequestExecutor.Factory factory, ErrorRequestExecutor.Factory factory2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            challengeResponseData = challengeViewArgs.cresData;
        }
        if ((i2 & 2) != 0) {
            challengeRequestData = challengeViewArgs.creqData;
        }
        ChallengeRequestData challengeRequestData2 = challengeRequestData;
        if ((i2 & 4) != 0) {
            stripeUiCustomization = challengeViewArgs.uiCustomization;
        }
        StripeUiCustomization stripeUiCustomization2 = stripeUiCustomization;
        if ((i2 & 8) != 0) {
            config = challengeViewArgs.creqExecutorConfig;
        }
        ChallengeRequestExecutor.Config config2 = config;
        if ((i2 & 16) != 0) {
            factory = challengeViewArgs.creqExecutorFactory;
        }
        ChallengeRequestExecutor.Factory factory3 = factory;
        if ((i2 & 32) != 0) {
            factory2 = challengeViewArgs.errorExecutorFactory;
        }
        ErrorRequestExecutor.Factory factory4 = factory2;
        if ((i2 & 64) != 0) {
            i = challengeViewArgs.timeoutMins;
        }
        return challengeViewArgs.copy(challengeResponseData, challengeRequestData2, stripeUiCustomization2, config2, factory3, factory4, i);
    }

    public final ChallengeResponseData component1() {
        return this.cresData;
    }

    public final ChallengeRequestData component2() {
        return this.creqData;
    }

    public final StripeUiCustomization component3() {
        return this.uiCustomization;
    }

    public final ChallengeRequestExecutor.Config component4() {
        return this.creqExecutorConfig;
    }

    public final ChallengeRequestExecutor.Factory component5() {
        return this.creqExecutorFactory;
    }

    public final ErrorRequestExecutor.Factory component6() {
        return this.errorExecutorFactory;
    }

    public final int component7() {
        return this.timeoutMins;
    }

    public final ChallengeViewArgs copy(ChallengeResponseData challengeResponseData, ChallengeRequestData challengeRequestData, StripeUiCustomization stripeUiCustomization, ChallengeRequestExecutor.Config config, ChallengeRequestExecutor.Factory factory, ErrorRequestExecutor.Factory factory2, int i) {
        i.e(challengeResponseData, "cresData");
        i.e(challengeRequestData, "creqData");
        i.e(stripeUiCustomization, "uiCustomization");
        i.e(config, "creqExecutorConfig");
        i.e(factory, "creqExecutorFactory");
        i.e(factory2, "errorExecutorFactory");
        return new ChallengeViewArgs(challengeResponseData, challengeRequestData, stripeUiCustomization, config, factory, factory2, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeViewArgs)) {
            return false;
        }
        ChallengeViewArgs challengeViewArgs = (ChallengeViewArgs) obj;
        return i.a(this.cresData, challengeViewArgs.cresData) && i.a(this.creqData, challengeViewArgs.creqData) && i.a(this.uiCustomization, challengeViewArgs.uiCustomization) && i.a(this.creqExecutorConfig, challengeViewArgs.creqExecutorConfig) && i.a(this.creqExecutorFactory, challengeViewArgs.creqExecutorFactory) && i.a(this.errorExecutorFactory, challengeViewArgs.errorExecutorFactory) && this.timeoutMins == challengeViewArgs.timeoutMins;
    }

    public final ChallengeRequestData getCreqData() {
        return this.creqData;
    }

    public final ChallengeRequestExecutor.Config getCreqExecutorConfig() {
        return this.creqExecutorConfig;
    }

    public final ChallengeRequestExecutor.Factory getCreqExecutorFactory() {
        return this.creqExecutorFactory;
    }

    public final ChallengeResponseData getCresData() {
        return this.cresData;
    }

    public final ErrorRequestExecutor.Factory getErrorExecutorFactory() {
        return this.errorExecutorFactory;
    }

    public final SdkTransactionId getSdkTransactionId$3ds2sdk_release() {
        return this.creqData.getSdkTransId();
    }

    public final int getTimeoutMins() {
        return this.timeoutMins;
    }

    public final StripeUiCustomization getUiCustomization() {
        return this.uiCustomization;
    }

    public int hashCode() {
        ChallengeResponseData challengeResponseData = this.cresData;
        int i = 0;
        int hashCode = (challengeResponseData != null ? challengeResponseData.hashCode() : 0) * 31;
        ChallengeRequestData challengeRequestData = this.creqData;
        int hashCode2 = (hashCode + (challengeRequestData != null ? challengeRequestData.hashCode() : 0)) * 31;
        StripeUiCustomization stripeUiCustomization = this.uiCustomization;
        int hashCode3 = (hashCode2 + (stripeUiCustomization != null ? stripeUiCustomization.hashCode() : 0)) * 31;
        ChallengeRequestExecutor.Config config = this.creqExecutorConfig;
        int hashCode4 = (hashCode3 + (config != null ? config.hashCode() : 0)) * 31;
        ChallengeRequestExecutor.Factory factory = this.creqExecutorFactory;
        int hashCode5 = (hashCode4 + (factory != null ? factory.hashCode() : 0)) * 31;
        ErrorRequestExecutor.Factory factory2 = this.errorExecutorFactory;
        if (factory2 != null) {
            i = factory2.hashCode();
        }
        return Integer.hashCode(this.timeoutMins) + ((hashCode5 + i) * 31);
    }

    public final Bundle toBundle() {
        return a.g(new Pair(EXTRA_CREQ_DATA, this.creqData), new Pair(EXTRA_CRES_DATA, this.cresData), new Pair(EXTRA_UI_CUSTOMIZATION, this.uiCustomization), new Pair(EXTRA_CREQ_EXECUTOR_CONFIG, this.creqExecutorConfig), new Pair(EXTRA_CREQ_EXECUTOR_FACTORY, this.creqExecutorFactory), new Pair(EXTRA_ERROR_EXECUTOR_FACTORY, this.errorExecutorFactory), new Pair(EXTRA_TIMEOUT, Integer.valueOf(this.timeoutMins)));
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChallengeViewArgs(cresData=");
        P0.append(this.cresData);
        P0.append(", creqData=");
        P0.append(this.creqData);
        P0.append(", uiCustomization=");
        P0.append(this.uiCustomization);
        P0.append(", creqExecutorConfig=");
        P0.append(this.creqExecutorConfig);
        P0.append(", creqExecutorFactory=");
        P0.append(this.creqExecutorFactory);
        P0.append(", errorExecutorFactory=");
        P0.append(this.errorExecutorFactory);
        P0.append(", timeoutMins=");
        return i0.d.a.a.a.u0(P0, this.timeoutMins, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        this.cresData.writeToParcel(parcel, 0);
        this.creqData.writeToParcel(parcel, 0);
        this.uiCustomization.writeToParcel(parcel, 0);
        parcel.writeSerializable(this.creqExecutorConfig);
        parcel.writeSerializable(this.creqExecutorFactory);
        parcel.writeSerializable(this.errorExecutorFactory);
        parcel.writeInt(this.timeoutMins);
    }
}
