package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/MessageTransformerFactory;", "", "", "isLiveMode", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "create", "(Z)Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "<init>", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: MessageTransformerFactory.kt */
public final class MessageTransformerFactory {
    private final ErrorReporter errorReporter;

    public MessageTransformerFactory(ErrorReporter errorReporter2) {
        i.e(errorReporter2, "errorReporter");
        this.errorReporter = errorReporter2;
    }

    public final MessageTransformer create(boolean z) {
        return MessageTransformerImpl.Companion.create(z, this.errorReporter);
    }
}
