package com.stripe.android.networking;

import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b>\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?¨\u0006@"}, d2 = {"Lcom/stripe/android/networking/AnalyticsEvent;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "getCode$payments_core_release", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "TokenCreate", "PaymentMethodCreate", "CustomerRetrieve", "CustomerRetrievePaymentMethods", "CustomerAttachPaymentMethod", "CustomerDetachPaymentMethod", "CustomerDeleteSource", "CustomerSetShippingInfo", "CustomerAddSource", "CustomerSetDefaultSource", "IssuingRetrievePin", "IssuingUpdatePin", "SourceCreate", "SourceRetrieve", "PaymentIntentConfirm", "PaymentIntentRetrieve", "PaymentIntentCancelSource", "SetupIntentConfirm", "SetupIntentRetrieve", "SetupIntentCancelSource", "FileCreate", "Auth3ds1Sdk", "Auth3ds1ChallengeStart", "Auth3ds1ChallengeError", "Auth3ds1ChallengeComplete", "AuthWithWebView", "AuthWithCustomTabs", "AuthWithDefaultBrowser", "ConfirmReturnUrlNull", "ConfirmReturnUrlDefault", "ConfirmReturnUrlCustom", "FpxBankStatusesRetrieve", "StripeUrlRetrieve", "Auth3ds2Fingerprint", "Auth3ds2Start", "Auth3ds2Frictionless", "Auth3ds2ChallengePresented", "Auth3ds2ChallengeCanceled", "Auth3ds2ChallengeCompleted", "Auth3ds2ChallengeErrored", "Auth3ds2ChallengeTimedOut", "Auth3ds2Fallback", "AuthRedirect", "AuthError", "AuthSourceStart", "AuthSourceRedirect", "AuthSourceResult", "RadarSessionCreate", "CardMetadataPublishableKeyAvailable", "CardMetadataPublishableKeyUnavailable", "CardMetadataLoadedTooSlow", "CardMetadataLoadFailure", "CardMetadataMissingRange", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AnalyticsEvent.kt */
public enum AnalyticsEvent {
    TokenCreate("token_creation"),
    PaymentMethodCreate("payment_method_creation"),
    CustomerRetrieve("retrieve_customer"),
    CustomerRetrievePaymentMethods("retrieve_payment_methods"),
    CustomerAttachPaymentMethod("attach_payment_method"),
    CustomerDetachPaymentMethod("detach_payment_method"),
    CustomerDeleteSource("delete_source"),
    CustomerSetShippingInfo("set_shipping_info"),
    CustomerAddSource("add_source"),
    CustomerSetDefaultSource("default_source"),
    IssuingRetrievePin("issuing_retrieve_pin"),
    IssuingUpdatePin("issuing_update_pin"),
    SourceCreate("source_creation"),
    SourceRetrieve("retrieve_source"),
    PaymentIntentConfirm("payment_intent_confirmation"),
    PaymentIntentRetrieve("payment_intent_retrieval"),
    PaymentIntentCancelSource("payment_intent_cancel_source"),
    SetupIntentConfirm("setup_intent_confirmation"),
    SetupIntentRetrieve("setup_intent_retrieval"),
    SetupIntentCancelSource("setup_intent_cancel_source"),
    FileCreate("create_file"),
    Auth3ds1Sdk("3ds1_sdk"),
    Auth3ds1ChallengeStart("3ds1_challenge_start"),
    Auth3ds1ChallengeError("3ds1_challenge_error"),
    Auth3ds1ChallengeComplete("3ds1_challenge_complete"),
    AuthWithWebView("auth_with_webview"),
    AuthWithCustomTabs("auth_with_customtabs"),
    AuthWithDefaultBrowser("auth_with_defaultbrowser"),
    ConfirmReturnUrlNull("confirm_returnurl_null"),
    ConfirmReturnUrlDefault("confirm_returnurl_default"),
    ConfirmReturnUrlCustom("confirm_returnurl_custom"),
    FpxBankStatusesRetrieve("retrieve_fpx_bank_statuses"),
    StripeUrlRetrieve("retrieve_stripe_url"),
    Auth3ds2Fingerprint("3ds2_fingerprint"),
    Auth3ds2Start("3ds2_authenticate"),
    Auth3ds2Frictionless("3ds2_frictionless_flow"),
    Auth3ds2ChallengePresented("3ds2_challenge_flow_presented"),
    Auth3ds2ChallengeCanceled("3ds2_challenge_flow_canceled"),
    Auth3ds2ChallengeCompleted("3ds2_challenge_flow_completed"),
    Auth3ds2ChallengeErrored("3ds2_challenge_flow_errored"),
    Auth3ds2ChallengeTimedOut("3ds2_challenge_flow_timed_out"),
    Auth3ds2Fallback("3ds2_fallback"),
    AuthRedirect("url_redirect_next_action"),
    AuthError("auth_error"),
    AuthSourceStart("auth_source_start"),
    AuthSourceRedirect("auth_source_redirect"),
    AuthSourceResult("auth_source_result"),
    RadarSessionCreate("radar_session_create"),
    CardMetadataPublishableKeyAvailable("card_metadata_pk_available"),
    CardMetadataPublishableKeyUnavailable("card_metadata_pk_unavailable"),
    CardMetadataLoadedTooSlow("card_metadata_loaded_too_slow"),
    CardMetadataLoadFailure("card_metadata_load_failure"),
    CardMetadataMissingRange("card_metadata_missing_range");
    
    private static final Companion Companion = null;
    @Deprecated
    private static final String PREFIX = "stripe_android";
    private final String code;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/AnalyticsEvent$Companion;", "", "", "PREFIX", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AnalyticsEvent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((f) null);
    }

    private AnalyticsEvent(String str) {
        this.code = str;
    }

    public final String getCode$payments_core_release() {
        return this.code;
    }

    public String toString() {
        StringBuilder P0 = a.P0("stripe_android.");
        P0.append(this.code);
        return P0.toString();
    }
}
