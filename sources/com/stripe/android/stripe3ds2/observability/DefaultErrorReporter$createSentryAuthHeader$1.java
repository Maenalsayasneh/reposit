package com.stripe.android.stripe3ds2.observability;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultErrorReporter.kt */
public final class DefaultErrorReporter$createSentryAuthHeader$1 extends Lambda implements l<Pair<? extends String, ? extends String>, CharSequence> {
    public static final DefaultErrorReporter$createSentryAuthHeader$1 INSTANCE = new DefaultErrorReporter$createSentryAuthHeader$1();

    public DefaultErrorReporter$createSentryAuthHeader$1() {
        super(1);
    }

    public final CharSequence invoke(Pair<String, String> pair) {
        i.e(pair, "<name for destructuring parameter 0>");
        return ((String) pair.c) + '=' + ((String) pair.d);
    }
}
