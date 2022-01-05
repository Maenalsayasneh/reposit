package com.stripe.android.model;

import com.stripe.android.model.BankAccountTokenParams;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParamsFixtures;", "", "Lcom/stripe/android/model/BankAccountTokenParams;", "DEFAULT", "Lcom/stripe/android/model/BankAccountTokenParams;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BankAccountTokenParamsFixtures.kt */
public final class BankAccountTokenParamsFixtures {
    public static final BankAccountTokenParams DEFAULT = new BankAccountTokenParams("US", Source.USD, "000123456789", BankAccountTokenParams.Type.Individual, "Jenny Rosen", "110000000");
    public static final BankAccountTokenParamsFixtures INSTANCE = new BankAccountTokenParamsFixtures();

    private BankAccountTokenParamsFixtures() {
    }
}
