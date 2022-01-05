package com.stripe.android.stripe3ds2.transaction;

import com.nimbusds.jose.JOSEException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.text.ParseException;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.text.StringsKt__IndentKt;
import m0.l.c;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "creqData", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "response", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "process", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;Lm0/l/c;)Ljava/lang/Object;", "Default", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeResponseProcessor.kt */
public interface ChallengeResponseProcessor {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor$Default;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "cresData", "", "isValidChallengeResponse", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)Z", "isMessageVersionCorrect", "", "responseBody", "Lorg/json/JSONObject;", "getResponsePayload", "(Ljava/lang/String;)Lorg/json/JSONObject;", "", "code", "description", "detail", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "createErrorData", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;ILjava/lang/String;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "response", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "process", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;Lm0/l/c;)Ljava/lang/Object;", "payload", "processPayload", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "Ljavax/crypto/SecretKey;", "secretKey", "Ljavax/crypto/SecretKey;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "<init>", "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljavax/crypto/SecretKey;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeResponseProcessor.kt */
    public static final class Default implements ChallengeResponseProcessor {
        private final ErrorReporter errorReporter;
        private final MessageTransformer messageTransformer;
        private final SecretKey secretKey;

        public Default(MessageTransformer messageTransformer2, SecretKey secretKey2, ErrorReporter errorReporter2) {
            i.e(messageTransformer2, "messageTransformer");
            i.e(secretKey2, "secretKey");
            i.e(errorReporter2, "errorReporter");
            this.messageTransformer = messageTransformer2;
            this.secretKey = secretKey2;
            this.errorReporter = errorReporter2;
        }

        private final ErrorData createErrorData(ChallengeRequestData challengeRequestData, int i, String str, String str2) {
            String valueOf = String.valueOf(i);
            ErrorData.ErrorComponent errorComponent = ErrorData.ErrorComponent.ThreeDsSdk;
            return new ErrorData(challengeRequestData.getThreeDsServerTransId(), challengeRequestData.getAcsTransId(), (String) null, valueOf, errorComponent, str, str2, ChallengeResponseData.MESSAGE_TYPE, challengeRequestData.getMessageVersion(), challengeRequestData.getSdkTransId(), 4, (f) null);
        }

        private final JSONObject getResponsePayload(String str) throws ParseException, JOSEException, JSONException, ChallengeResponseParseException {
            return this.messageTransformer.decrypt(str, this.secretKey);
        }

        private final boolean isMessageVersionCorrect(ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData) {
            return i.a(challengeRequestData.getMessageVersion(), challengeResponseData.getMessageVersion());
        }

        private final boolean isValidChallengeResponse(ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData) {
            return i.a(challengeRequestData.getSdkTransId(), challengeResponseData.getSdkTransId()) && i.a(challengeRequestData.getThreeDsServerTransId(), challengeResponseData.getServerTransId()) && i.a(challengeRequestData.getAcsTransId(), challengeResponseData.getAcsTransId());
        }

        public Object process(ChallengeRequestData challengeRequestData, HttpResponse httpResponse, c<? super ChallengeRequestResult> cVar) {
            Object obj;
            if (httpResponse.isJsonContentType()) {
                JSONObject jSONObject = new JSONObject(httpResponse.getContent());
                ErrorData.Companion companion = ErrorData.Companion;
                if (companion.isErrorMessage$3ds2sdk_release(jSONObject)) {
                    return new ChallengeRequestResult.ProtocolError(companion.fromJson$3ds2sdk_release(jSONObject));
                }
                return new ChallengeRequestResult.RuntimeError(new IllegalArgumentException("Received a JSON response that was not an Error message."));
            }
            try {
                obj = getResponsePayload(httpResponse.getContent());
            } catch (Throwable th) {
                obj = h.l0(th);
            }
            Throwable a = Result.a(obj);
            if (a != null) {
                ErrorReporter errorReporter2 = this.errorReporter;
                StringBuilder P0 = a.P0("\n                            Failed to process challenge response.\n\n                            CReq = ");
                P0.append(challengeRequestData.sanitize$3ds2sdk_release());
                P0.append("\n                            ");
                errorReporter2.reportError(new RuntimeException(StringsKt__IndentKt.Y(P0.toString()), a));
            }
            Throwable a2 = Result.a(obj);
            if (a2 == null) {
                return processPayload(challengeRequestData, (JSONObject) obj);
            }
            ProtocolError protocolError = ProtocolError.DataDecryptionFailure;
            int code = protocolError.getCode();
            String description = protocolError.getDescription();
            String message = a2.getMessage();
            if (message == null) {
                message = "";
            }
            return new ChallengeRequestResult.ProtocolError(createErrorData(challengeRequestData, code, description, message));
        }

        public final ChallengeRequestResult processPayload(ChallengeRequestData challengeRequestData, JSONObject jSONObject) {
            Object obj;
            ChallengeRequestResult protocolError;
            i.e(challengeRequestData, "creqData");
            i.e(jSONObject, "payload");
            ErrorData.Companion companion = ErrorData.Companion;
            if (companion.isErrorMessage$3ds2sdk_release(jSONObject)) {
                return new ChallengeRequestResult.ProtocolError(companion.fromJson$3ds2sdk_release(jSONObject));
            }
            try {
                obj = ChallengeResponseData.Companion.fromJson$3ds2sdk_release(jSONObject);
            } catch (Throwable th) {
                obj = h.l0(th);
            }
            Throwable a = Result.a(obj);
            if (a == null) {
                ChallengeResponseData challengeResponseData = (ChallengeResponseData) obj;
                if (!isValidChallengeResponse(challengeRequestData, challengeResponseData)) {
                    ProtocolError protocolError2 = ProtocolError.InvalidTransactionId;
                    return new ChallengeRequestResult.ProtocolError(createErrorData(challengeRequestData, protocolError2.getCode(), protocolError2.getDescription(), "The Transaction ID received was invalid."));
                } else if (!isMessageVersionCorrect(challengeRequestData, challengeResponseData)) {
                    ProtocolError protocolError3 = ProtocolError.UnsupportedMessageVersion;
                    protocolError = new ChallengeRequestResult.ProtocolError(createErrorData(challengeRequestData, protocolError3.getCode(), protocolError3.getDescription(), challengeRequestData.getMessageVersion()));
                } else {
                    protocolError = new ChallengeRequestResult.Success(challengeRequestData, challengeResponseData);
                }
            } else if (!(a instanceof ChallengeResponseParseException)) {
                return new ChallengeRequestResult.RuntimeError(a);
            } else {
                ChallengeResponseParseException challengeResponseParseException = (ChallengeResponseParseException) a;
                protocolError = new ChallengeRequestResult.ProtocolError(createErrorData(challengeRequestData, challengeResponseParseException.getCode(), challengeResponseParseException.getDescription(), challengeResponseParseException.getDetail()));
            }
            return protocolError;
        }
    }

    Object process(ChallengeRequestData challengeRequestData, HttpResponse httpResponse, c<? super ChallengeRequestResult> cVar);
}
