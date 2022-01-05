package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.List;
import kotlin.Metadata;
import m0.l.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/PaymentMethodsRepository;", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "customerConfig", "Lcom/stripe/android/model/PaymentMethod$Type;", "type", "", "Lcom/stripe/android/model/PaymentMethod;", "get", "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/model/PaymentMethod$Type;Lm0/l/c;)Ljava/lang/Object;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodsRepository.kt */
public interface PaymentMethodsRepository {
    Object get(PaymentSheet.CustomerConfiguration customerConfiguration, PaymentMethod.Type type, c<? super List<PaymentMethod>> cVar);
}
