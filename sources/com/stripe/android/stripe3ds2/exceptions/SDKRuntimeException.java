package com.stripe.android.stripe3ds2.exceptions;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "t", "(Ljava/lang/Throwable;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SDKRuntimeException.kt */
public final class SDKRuntimeException extends RuntimeException {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SDKRuntimeException(String str, Throwable th, int i, f fVar) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SDKRuntimeException(String str, Throwable th) {
        super(str, th);
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SDKRuntimeException(java.lang.Throwable r2) {
        /*
            r1 = this;
            java.lang.String r0 = "t"
            m0.n.b.i.e(r2, r0)
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            java.lang.String r0 = ""
        L_0x000e:
            java.lang.Throwable r2 = r2.getCause()
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException.<init>(java.lang.Throwable):void");
    }
}
