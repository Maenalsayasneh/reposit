package com.sinch.verification.core.internal.error;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\b\u001a\u00020\u00038\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/sinch/verification/core/internal/error/VerificationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "c", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: VerificationException.kt */
public final class VerificationException extends Exception {
    public final String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerificationException(String str) {
        super(str);
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        this.c = str;
    }

    public String getMessage() {
        return this.c;
    }
}
