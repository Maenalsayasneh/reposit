package com.stripe.android;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()J", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CustomerSession.kt */
public final class CustomerSession$Companion$initCustomerSession$timeSupplier$1 extends Lambda implements a<Long> {
    public static final CustomerSession$Companion$initCustomerSession$timeSupplier$1 INSTANCE = new CustomerSession$Companion$initCustomerSession$timeSupplier$1();

    public CustomerSession$Companion$initCustomerSession$timeSupplier$1() {
        super(0);
    }

    public final long invoke() {
        Calendar instance = Calendar.getInstance();
        i.d(instance, "Calendar.getInstance()");
        return instance.getTimeInMillis();
    }
}
