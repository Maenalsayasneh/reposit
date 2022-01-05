package com.stripe.android;

import com.stripe.android.EphemeralKeyManager;
import com.stripe.android.EphemeralOperation;
import com.stripe.android.IssuingCardPinService;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/stripe/android/IssuingCardPinService$ephemeralKeyManager$1", "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "Lcom/stripe/android/EphemeralKey;", "ephemeralKey", "Lcom/stripe/android/EphemeralOperation;", "operation", "Lm0/i;", "onKeyUpdate", "(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation;)V", "", "operationId", "", "errorCode", "errorMessage", "onKeyError", "(Ljava/lang/String;ILjava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: IssuingCardPinService.kt */
public final class IssuingCardPinService$ephemeralKeyManager$1 implements EphemeralKeyManager.KeyManagerListener {
    public final /* synthetic */ IssuingCardPinService this$0;

    public IssuingCardPinService$ephemeralKeyManager$1(IssuingCardPinService issuingCardPinService) {
        this.this$0 = issuingCardPinService;
    }

    public void onKeyError(String str, int i, String str2) {
        i.e(str, "operationId");
        i.e(str2, "errorMessage");
        IssuingCardPinService.IssuingCardPinUpdateListener issuingCardPinUpdateListener = (IssuingCardPinService.IssuingCardPinUpdateListener) this.this$0.updateListeners.remove(str);
        IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener = (IssuingCardPinService.IssuingCardPinRetrievalListener) this.this$0.retrievalListeners.remove(str);
        if (issuingCardPinRetrievalListener != null) {
            issuingCardPinRetrievalListener.onError(IssuingCardPinService.CardPinActionError.EPHEMERAL_KEY_ERROR, str2, (Throwable) null);
        } else if (issuingCardPinUpdateListener != null) {
            issuingCardPinUpdateListener.onError(IssuingCardPinService.CardPinActionError.EPHEMERAL_KEY_ERROR, str2, (Throwable) null);
        }
    }

    public void onKeyUpdate(EphemeralKey ephemeralKey, EphemeralOperation ephemeralOperation) {
        i.e(ephemeralKey, "ephemeralKey");
        i.e(ephemeralOperation, "operation");
        if (ephemeralOperation instanceof EphemeralOperation.Issuing.RetrievePin) {
            IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener = (IssuingCardPinService.IssuingCardPinRetrievalListener) this.this$0.retrievalListeners.remove(ephemeralOperation.getId$payments_core_release());
            if (issuingCardPinRetrievalListener != null) {
                this.this$0.fireRetrievePinRequest(ephemeralKey, (EphemeralOperation.Issuing.RetrievePin) ephemeralOperation, issuingCardPinRetrievalListener);
            } else {
                this.this$0.logMissingListener();
            }
        } else if (ephemeralOperation instanceof EphemeralOperation.Issuing.UpdatePin) {
            IssuingCardPinService.IssuingCardPinUpdateListener issuingCardPinUpdateListener = (IssuingCardPinService.IssuingCardPinUpdateListener) this.this$0.updateListeners.remove(ephemeralOperation.getId$payments_core_release());
            if (issuingCardPinUpdateListener != null) {
                this.this$0.fireUpdatePinRequest(ephemeralKey, (EphemeralOperation.Issuing.UpdatePin) ephemeralOperation, issuingCardPinUpdateListener);
            } else {
                this.this$0.logMissingListener();
            }
        }
    }
}
