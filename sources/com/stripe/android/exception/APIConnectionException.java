package com.stripe.android.exception;

import com.stripe.android.StripeError;
import i0.d.a.a.a;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/exception/APIConnectionException;", "Lcom/stripe/android/exception/StripeException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: APIConnectionException.kt */
public final class APIConnectionException extends StripeException {
    public static final Companion Companion = new Companion((f) null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/stripe/android/exception/APIConnectionException$Companion;", "", "Ljava/io/IOException;", "e", "", "url", "Lcom/stripe/android/exception/APIConnectionException;", "create$payments_core_release", "(Ljava/io/IOException;Ljava/lang/String;)Lcom/stripe/android/exception/APIConnectionException;", "create", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: APIConnectionException.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ APIConnectionException create$payments_core_release$default(Companion companion, IOException iOException, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.create$payments_core_release(iOException, str);
        }

        public final /* synthetic */ APIConnectionException create$payments_core_release(IOException iOException, String str) {
            i.e(iOException, "e");
            String[] strArr = new String[2];
            boolean z = false;
            strArr[0] = "Stripe";
            String str2 = '(' + str + ')';
            if (str == null || StringsKt__IndentKt.o(str)) {
                z = true;
            }
            if (z) {
                str2 = null;
            }
            strArr[1] = str2;
            StringBuilder T0 = a.T0("IOException during API request to ", g.E(g.M(strArr), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62), ": ");
            T0.append(iOException.getMessage());
            T0.append(". ");
            T0.append("Please check your internet connection and try again. ");
            T0.append("If this problem persists, you should check Stripe's ");
            return new APIConnectionException(a.y0(T0, "service status at https://twitter.com/stripestatus, ", "or let us know at support@stripe.com."), iOException);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public APIConnectionException() {
        this((String) null, (Throwable) null, 3, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ APIConnectionException(String str, Throwable th, int i, f fVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public APIConnectionException(String str, Throwable th) {
        super((StripeError) null, (String) null, 0, th, str, 7, (f) null);
    }
}
