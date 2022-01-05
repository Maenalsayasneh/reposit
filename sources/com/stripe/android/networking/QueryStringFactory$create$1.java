package com.stripe.android.networking;

import com.stripe.android.networking.QueryStringFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/networking/QueryStringFactory$Parameter;", "it", "", "invoke", "(Lcom/stripe/android/networking/QueryStringFactory$Parameter;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: QueryStringFactory.kt */
public final class QueryStringFactory$create$1 extends Lambda implements l<QueryStringFactory.Parameter, CharSequence> {
    public static final QueryStringFactory$create$1 INSTANCE = new QueryStringFactory$create$1();

    public QueryStringFactory$create$1() {
        super(1);
    }

    public final CharSequence invoke(QueryStringFactory.Parameter parameter) {
        i.e(parameter, "it");
        return parameter.toString();
    }
}
