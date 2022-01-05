package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import i0.d.a.a.a;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import m0.l.c;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "creqData", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "execute", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lm0/l/c;)Ljava/lang/Object;", "Config", "Factory", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeRequestExecutor.kt */
public interface ChallengeRequestExecutor {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010!\u001a\u00020\r\u0012\u0006\u0010\"\u001a\u00020\u0011\u0012\u0006\u0010#\u001a\u00020\u0015\u0012\u0006\u0010$\u001a\u00020\u0015\u0012\u0006\u0010%\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020\u001d¢\u0006\u0004\b4\u00105J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0010\u001a\u00020\rHÀ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0011HÀ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0015HÀ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0015HÀ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0011HÀ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010 \u001a\u00020\u001dHÀ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJL\u0010'\u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\u00152\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020\u001dHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u001c\u0010&\u001a\u00020\u001d8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b+\u0010\u001fR\u001c\u0010\"\u001a\u00020\u00118\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b-\u0010\u0013R\u001c\u0010$\u001a\u00020\u00158\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b/\u0010\u0017R\u001c\u0010#\u001a\u00020\u00158\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b0\u0010\u0017R\u001c\u0010%\u001a\u00020\u00118\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b1\u0010\u0013R\u001c\u0010!\u001a\u00020\r8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\b3\u0010\u000f¨\u00066"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "Ljava/io/Serializable;", "config", "", "typedEquals", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;)Z", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "component1$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "component1", "", "component2$3ds2sdk_release", "()Ljava/lang/String;", "component2", "", "component3$3ds2sdk_release", "()[B", "component3", "component4$3ds2sdk_release", "component4", "component5$3ds2sdk_release", "component5", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "component6$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "component6", "messageTransformer", "sdkReferenceId", "sdkPrivateKeyEncoded", "acsPublicKeyEncoded", "acsUrl", "creqData", "copy", "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;[B[BLjava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "toString", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "getCreqData$3ds2sdk_release", "Ljava/lang/String;", "getSdkReferenceId$3ds2sdk_release", "[B", "getAcsPublicKeyEncoded$3ds2sdk_release", "getSdkPrivateKeyEncoded$3ds2sdk_release", "getAcsUrl$3ds2sdk_release", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "getMessageTransformer$3ds2sdk_release", "<init>", "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;[B[BLjava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeRequestExecutor.kt */
    public static final class Config implements Serializable {
        private final byte[] acsPublicKeyEncoded;
        private final String acsUrl;
        private final ChallengeRequestData creqData;
        private final MessageTransformer messageTransformer;
        private final byte[] sdkPrivateKeyEncoded;
        private final String sdkReferenceId;

        public Config(MessageTransformer messageTransformer2, String str, byte[] bArr, byte[] bArr2, String str2, ChallengeRequestData challengeRequestData) {
            i.e(messageTransformer2, "messageTransformer");
            i.e(str, "sdkReferenceId");
            i.e(bArr, "sdkPrivateKeyEncoded");
            i.e(bArr2, "acsPublicKeyEncoded");
            i.e(str2, "acsUrl");
            i.e(challengeRequestData, "creqData");
            this.messageTransformer = messageTransformer2;
            this.sdkReferenceId = str;
            this.sdkPrivateKeyEncoded = bArr;
            this.acsPublicKeyEncoded = bArr2;
            this.acsUrl = str2;
            this.creqData = challengeRequestData;
        }

        public static /* synthetic */ Config copy$default(Config config, MessageTransformer messageTransformer2, String str, byte[] bArr, byte[] bArr2, String str2, ChallengeRequestData challengeRequestData, int i, Object obj) {
            if ((i & 1) != 0) {
                messageTransformer2 = config.messageTransformer;
            }
            if ((i & 2) != 0) {
                str = config.sdkReferenceId;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                bArr = config.sdkPrivateKeyEncoded;
            }
            byte[] bArr3 = bArr;
            if ((i & 8) != 0) {
                bArr2 = config.acsPublicKeyEncoded;
            }
            byte[] bArr4 = bArr2;
            if ((i & 16) != 0) {
                str2 = config.acsUrl;
            }
            String str4 = str2;
            if ((i & 32) != 0) {
                challengeRequestData = config.creqData;
            }
            return config.copy(messageTransformer2, str3, bArr3, bArr4, str4, challengeRequestData);
        }

        private final boolean typedEquals(Config config) {
            return ObjectUtils.equals(this.messageTransformer, config.messageTransformer) && ObjectUtils.equals(this.sdkReferenceId, config.sdkReferenceId) && ObjectUtils.equals(this.sdkPrivateKeyEncoded, config.sdkPrivateKeyEncoded) && ObjectUtils.equals(this.acsPublicKeyEncoded, config.acsPublicKeyEncoded) && ObjectUtils.equals(this.acsUrl, config.acsUrl) && ObjectUtils.equals(this.creqData, config.creqData);
        }

        public final MessageTransformer component1$3ds2sdk_release() {
            return this.messageTransformer;
        }

        public final String component2$3ds2sdk_release() {
            return this.sdkReferenceId;
        }

        public final byte[] component3$3ds2sdk_release() {
            return this.sdkPrivateKeyEncoded;
        }

        public final byte[] component4$3ds2sdk_release() {
            return this.acsPublicKeyEncoded;
        }

        public final String component5$3ds2sdk_release() {
            return this.acsUrl;
        }

        public final ChallengeRequestData component6$3ds2sdk_release() {
            return this.creqData;
        }

        public final Config copy(MessageTransformer messageTransformer2, String str, byte[] bArr, byte[] bArr2, String str2, ChallengeRequestData challengeRequestData) {
            i.e(messageTransformer2, "messageTransformer");
            i.e(str, "sdkReferenceId");
            i.e(bArr, "sdkPrivateKeyEncoded");
            i.e(bArr2, "acsPublicKeyEncoded");
            i.e(str2, "acsUrl");
            i.e(challengeRequestData, "creqData");
            return new Config(messageTransformer2, str, bArr, bArr2, str2, challengeRequestData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Config) {
                return typedEquals((Config) obj);
            }
            return false;
        }

        public final byte[] getAcsPublicKeyEncoded$3ds2sdk_release() {
            return this.acsPublicKeyEncoded;
        }

        public final String getAcsUrl$3ds2sdk_release() {
            return this.acsUrl;
        }

        public final ChallengeRequestData getCreqData$3ds2sdk_release() {
            return this.creqData;
        }

        public final MessageTransformer getMessageTransformer$3ds2sdk_release() {
            return this.messageTransformer;
        }

        public final byte[] getSdkPrivateKeyEncoded$3ds2sdk_release() {
            return this.sdkPrivateKeyEncoded;
        }

        public final String getSdkReferenceId$3ds2sdk_release() {
            return this.sdkReferenceId;
        }

        public int hashCode() {
            return ObjectUtils.hash(this.messageTransformer, this.sdkReferenceId, this.sdkPrivateKeyEncoded, this.acsPublicKeyEncoded, this.acsUrl, this.creqData);
        }

        public String toString() {
            StringBuilder P0 = a.P0("Config(messageTransformer=");
            P0.append(this.messageTransformer);
            P0.append(", sdkReferenceId=");
            P0.append(this.sdkReferenceId);
            P0.append(", sdkPrivateKeyEncoded=");
            P0.append(Arrays.toString(this.sdkPrivateKeyEncoded));
            P0.append(", acsPublicKeyEncoded=");
            P0.append(Arrays.toString(this.acsPublicKeyEncoded));
            P0.append(", acsUrl=");
            P0.append(this.acsUrl);
            P0.append(", creqData=");
            P0.append(this.creqData);
            P0.append(")");
            return P0.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "Ljava/io/Serializable;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "config", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "create", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeRequestExecutor.kt */
    public interface Factory extends Serializable {
        ChallengeRequestExecutor create(Config config, ErrorReporter errorReporter);
    }

    Object execute(ChallengeRequestData challengeRequestData, c<? super ChallengeRequestResult> cVar);
}
