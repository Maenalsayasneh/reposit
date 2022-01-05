package com.stripe.android.stripe3ds2.transactions;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0013R\u0019\u0010\u0004\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "code", "I", "getCode", "()I", "", "description", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "detail", "getDetail", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;", "protocolError", "(Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;Ljava/lang/String;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeResponseParseException.kt */
public final class ChallengeResponseParseException extends Exception {
    public static final Companion Companion = new Companion((f) null);
    private final int code;
    private final String description;
    private final String detail;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException$Companion;", "", "", "fieldName", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;", "createRequiredDataElementMissing", "(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;", "createInvalidDataElementFormat", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeResponseParseException.kt */
    public static final class Companion {
        private Companion() {
        }

        public final ChallengeResponseParseException createInvalidDataElementFormat(String str) {
            i.e(str, "fieldName");
            return new ChallengeResponseParseException(ProtocolError.InvalidDataElementFormat.getCode(), "Data element not in the required format or value is invalid as defined in Table A.1", str);
        }

        public final ChallengeResponseParseException createRequiredDataElementMissing(String str) {
            i.e(str, "fieldName");
            return new ChallengeResponseParseException(ProtocolError.RequiredDataElementMissing.getCode(), "A message element required as defined in Table A.1 is missing from the message.", str);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeResponseParseException(int i, String str, String str2) {
        super(i + " - " + str + " (" + str2 + ')');
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION);
        i.e(str2, "detail");
        this.code = i;
        this.description = str;
        this.detail = str2;
    }

    public static final ChallengeResponseParseException createInvalidDataElementFormat(String str) {
        return Companion.createInvalidDataElementFormat(str);
    }

    public static final ChallengeResponseParseException createRequiredDataElementMissing(String str) {
        return Companion.createRequiredDataElementMissing(str);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDetail() {
        return this.detail;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChallengeResponseParseException(ProtocolError protocolError, String str) {
        this(protocolError.getCode(), protocolError.getDescription(), str);
        i.e(protocolError, "protocolError");
        i.e(str, "detail");
    }
}
