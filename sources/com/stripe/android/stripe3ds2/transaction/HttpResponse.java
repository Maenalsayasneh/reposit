package com.stripe.android.stripe3ds2.transaction;

import com.instabug.library.model.NetworkLog;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "", "", "isJsonContentType", "Z", "()Z", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "contentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: HttpResponse.kt */
public final class HttpResponse {
    private final String content;
    private final boolean isJsonContentType;

    public HttpResponse(String str, String str2) {
        i.e(str, "content");
        this.content = str;
        boolean z = true;
        this.isJsonContentType = (str2 == null || !StringsKt__IndentKt.J(str2, NetworkLog.JSON, false, 2)) ? false : z;
    }

    public final String getContent() {
        return this.content;
    }

    public final boolean isJsonContentType() {
        return this.isJsonContentType;
    }
}
