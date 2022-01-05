package com.stripe.android.networking;

import com.stripe.android.cards.Bin;
import com.stripe.android.exception.APIConnectionException;
import com.stripe.android.exception.APIException;
import com.stripe.android.exception.AuthenticationException;
import com.stripe.android.exception.CardException;
import com.stripe.android.exception.InvalidRequestException;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ListPaymentMethodsParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.RadarSession;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.StripeFile;
import com.stripe.android.model.StripeFileParams;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import com.stripe.android.networking.ApiRequest;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import m0.i;
import m0.l.c;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000eJ-\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0012J%\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b \u0010\u0012J%\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J%\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b)\u0010*JK\u00101\u001a\u0004\u0018\u00010\u001d2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b1\u00102JC\u00103\u001a\u0004\u0018\u00010\u001d2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b3\u00104JC\u00106\u001a\u0004\u0018\u00010#2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070-2\u0006\u00105\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b6\u00104J;\u00107\u001a\u0004\u0018\u00010#2\u0006\u0010,\u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070-2\u0006\u00105\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b7\u00108J?\u0010;\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010:\u001a\u0002092\u0006\u0010,\u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070-2\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b;\u0010<JK\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b>\u00102JC\u0010A\u001a\u0004\u0018\u00010=2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010@\u001a\u00020?2\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ3\u0010C\u001a\u0004\u0018\u00010=2\u0006\u0010+\u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070-2\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ5\u0010H\u001a\u0004\u0018\u00010\u00072\u0006\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ;\u0010L\u001a\u00020K2\u0006\u0010E\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u001b\u0010O\u001a\u00020N2\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ%\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010R\u001a\u00020Q2\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ%\u0010Y\u001a\u0004\u0018\u00010X2\u0006\u0010W\u001a\u00020V2\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u0004\u0018\u00010X2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J#\u0010`\u001a\u00020_2\u0006\u0010^\u001a\u00020]2\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b`\u0010aJ#\u0010d\u001a\u00020c2\u0006\u0010b\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\bd\u0010\\J\u001d\u0010f\u001a\u0004\u0018\u00010e2\u0006\u00100\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\bf\u0010P\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, d2 = {"Lcom/stripe/android/networking/StripeRepository;", "", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmPaymentIntentParams", "Lcom/stripe/android/networking/ApiRequest$Options;", "options", "", "", "expandFields", "Lcom/stripe/android/model/PaymentIntent;", "confirmPaymentIntent", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lm0/l/c;)Ljava/lang/Object;", "clientSecret", "retrievePaymentIntent", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lm0/l/c;)Ljava/lang/Object;", "paymentIntentId", "sourceId", "cancelPaymentIntentSource", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntentParams", "Lcom/stripe/android/model/SetupIntent;", "confirmSetupIntent", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lm0/l/c;)Ljava/lang/Object;", "retrieveSetupIntent", "setupIntentId", "cancelSetupIntentSource", "Lcom/stripe/android/model/SourceParams;", "sourceParams", "Lcom/stripe/android/model/Source;", "createSource", "(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "retrieveSource", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethod", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/TokenParams;", "tokenParams", "Lcom/stripe/android/model/Token;", "createToken", "(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "customerId", "publishableKey", "", "productUsageTokens", "sourceType", "requestOptions", "addCustomerSource", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "deleteCustomerSource", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "paymentMethodId", "attachPaymentMethod", "detachPaymentMethod", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/ListPaymentMethodsParams;", "listPaymentMethodsParams", "getPaymentMethods", "(Lcom/stripe/android/model/ListPaymentMethodsParams;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/Customer;", "setDefaultCustomerSource", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "setCustomerShippingInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "retrieveCustomer", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "cardId", "verificationId", "userOneTimeCode", "retrieveIssuingCardPin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "newPin", "Lm0/i;", "updateIssuingCardPin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/BankStatuses;", "getFpxBankStatus", "(Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/cards/Bin;", "bin", "Lcom/stripe/android/model/CardMetadata;", "getCardMetadata", "(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/Stripe3ds2AuthParams;", "authParams", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "start3ds2Auth", "(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "complete3ds2Auth", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeFileParams;", "fileParams", "Lcom/stripe/android/model/StripeFile;", "createFile", "(Lcom/stripe/android/model/StripeFileParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "url", "Lorg/json/JSONObject;", "retrieveObject", "Lcom/stripe/android/model/RadarSession;", "createRadarSession", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeRepository.kt */
public interface StripeRepository {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    /* compiled from: StripeRepository.kt */
    public static final class DefaultImpls {
        public static Object confirmPaymentIntent$default(StripeRepository stripeRepository, ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List list, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
            if (obj == null) {
                if ((i & 4) != 0) {
                    list = EmptyList.c;
                }
                return stripeRepository.confirmPaymentIntent(confirmPaymentIntentParams, options, list, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmPaymentIntent");
        }

        public static Object confirmSetupIntent$default(StripeRepository stripeRepository, ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List list, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
            if (obj == null) {
                if ((i & 4) != 0) {
                    list = EmptyList.c;
                }
                return stripeRepository.confirmSetupIntent(confirmSetupIntentParams, options, list, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmSetupIntent");
        }

        public static Object retrievePaymentIntent$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
            if (obj == null) {
                if ((i & 4) != 0) {
                    list = EmptyList.c;
                }
                return stripeRepository.retrievePaymentIntent(str, options, list, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrievePaymentIntent");
        }

        public static Object retrieveSetupIntent$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
            if (obj == null) {
                if ((i & 4) != 0) {
                    list = EmptyList.c;
                }
                return stripeRepository.retrieveSetupIntent(str, options, list, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveSetupIntent");
        }
    }

    Object addCustomerSource(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, c<? super Source> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    Object attachPaymentMethod(String str, String str2, Set<String> set, String str3, ApiRequest.Options options, c<? super PaymentMethod> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    Object cancelPaymentIntentSource(String str, String str2, ApiRequest.Options options, c<? super PaymentIntent> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object cancelSetupIntentSource(String str, String str2, ApiRequest.Options options, c<? super SetupIntent> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object complete3ds2Auth(String str, ApiRequest.Options options, c<? super Stripe3ds2AuthResult> cVar);

    Object confirmPaymentIntent(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List<String> list, c<? super PaymentIntent> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object confirmSetupIntent(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List<String> list, c<? super SetupIntent> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object createFile(StripeFileParams stripeFileParams, ApiRequest.Options options, c<? super StripeFile> cVar);

    Object createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, ApiRequest.Options options, c<? super PaymentMethod> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object createRadarSession(ApiRequest.Options options, c<? super RadarSession> cVar);

    Object createSource(SourceParams sourceParams, ApiRequest.Options options, c<? super Source> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object createToken(TokenParams tokenParams, ApiRequest.Options options, c<? super Token> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    Object deleteCustomerSource(String str, String str2, Set<String> set, String str3, ApiRequest.Options options, c<? super Source> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    Object detachPaymentMethod(String str, Set<String> set, String str2, ApiRequest.Options options, c<? super PaymentMethod> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    Object getCardMetadata(Bin bin, ApiRequest.Options options, c<? super CardMetadata> cVar);

    Object getFpxBankStatus(ApiRequest.Options options, c<? super BankStatuses> cVar);

    Object getPaymentMethods(ListPaymentMethodsParams listPaymentMethodsParams, String str, Set<String> set, ApiRequest.Options options, c<? super List<PaymentMethod>> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    Object retrieveCustomer(String str, Set<String> set, ApiRequest.Options options, c<? super Customer> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    Object retrieveIssuingCardPin(String str, String str2, String str3, ApiRequest.Options options, c<? super String> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException, JSONException;

    Object retrieveObject(String str, ApiRequest.Options options, c<? super JSONObject> cVar);

    Object retrievePaymentIntent(String str, ApiRequest.Options options, List<String> list, c<? super PaymentIntent> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object retrieveSetupIntent(String str, ApiRequest.Options options, List<String> list, c<? super SetupIntent> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object retrieveSource(String str, String str2, ApiRequest.Options options, c<? super Source> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object setCustomerShippingInfo(String str, String str2, Set<String> set, ShippingInformation shippingInformation, ApiRequest.Options options, c<? super Customer> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    Object setDefaultCustomerSource(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, c<? super Customer> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;

    Object start3ds2Auth(Stripe3ds2AuthParams stripe3ds2AuthParams, ApiRequest.Options options, c<? super Stripe3ds2AuthResult> cVar);

    Object updateIssuingCardPin(String str, String str2, String str3, String str4, ApiRequest.Options options, c<? super i> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException;
}
