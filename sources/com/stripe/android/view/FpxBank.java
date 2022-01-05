package com.stripe.android.view;

import com.stripe.android.R;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001a\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0013B-\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00038\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, d2 = {"Lcom/stripe/android/view/FpxBank;", "", "Lcom/stripe/android/view/Bank;", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "id", "getId", "displayName", "getDisplayName", "", "brandIconResId", "Ljava/lang/Integer;", "getBrandIconResId", "()Ljava/lang/Integer;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Companion", "Maybank2U", "Cimb", "PublicBank", "Rhb", "HongLeongBank", "AmBank", "AffinBank", "AllianceBankBusiness", "BankIslam", "BankMuamalat", "BankRakyat", "Bsn", "Hsbc", "Kfh", "Maybank2E", "Ocbc", "StandardChartered", "UobBank", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FpxBank.kt */
public enum FpxBank implements Bank {
    Maybank2U("MB2U0227", "maybank2u", "Maybank2U", Integer.valueOf(r9)),
    Cimb("BCBB0235", "cimb", "CIMB Clicks", Integer.valueOf(R.drawable.stripe_ic_bank_cimb)),
    PublicBank("PBB0233", "public_bank", "Public Bank", Integer.valueOf(R.drawable.stripe_ic_bank_public)),
    Rhb("RHB0218", "rhb", "RHB Bank", Integer.valueOf(R.drawable.stripe_ic_bank_rhb)),
    HongLeongBank("HLB0224", "hong_leong_bank", "Hong Leong Bank", Integer.valueOf(R.drawable.stripe_ic_bank_hong_leong)),
    AmBank("AMBB0209", "ambank", "AmBank", Integer.valueOf(R.drawable.stripe_ic_bank_ambank)),
    AffinBank("ABB0233", "affin_bank", "Affin Bank", Integer.valueOf(R.drawable.stripe_ic_bank_affin)),
    AllianceBankBusiness("ABMB0212", "alliance_bank", "Alliance Bank", Integer.valueOf(R.drawable.stripe_ic_bank_alliance)),
    BankIslam("BIMB0340", "bank_islam", "Bank Islam", Integer.valueOf(R.drawable.stripe_ic_bank_islam)),
    BankMuamalat("BMMB0341", "bank_muamalat", "Bank Muamalat", Integer.valueOf(R.drawable.stripe_ic_bank_muamalat)),
    BankRakyat("BKRM0602", "bank_rakyat", "Bank Rakyat", Integer.valueOf(R.drawable.stripe_ic_bank_raykat)),
    Bsn("BSN0601", "bsn", "BSN", Integer.valueOf(R.drawable.stripe_ic_bank_bsn)),
    Hsbc("HSBC0223", "hsbc", "HSBC Bank", Integer.valueOf(R.drawable.stripe_ic_bank_hsbc)),
    Kfh("KFH0346", "kfh", "KFH", Integer.valueOf(R.drawable.stripe_ic_bank_kfh)),
    Maybank2E("MBB0228", "maybank2e", "Maybank2E", Integer.valueOf(r9)),
    Ocbc("OCBC0229", "ocbc", "OCBC Bank", Integer.valueOf(R.drawable.stripe_ic_bank_ocbc)),
    StandardChartered("SCB0216", "standard_chartered", "Standard Chartered", Integer.valueOf(R.drawable.stripe_ic_bank_standard_chartered)),
    UobBank("UOB0226", "uob", "UOB", Integer.valueOf(R.drawable.stripe_ic_bank_uob));
    
    public static final Companion Companion = null;
    private final Integer brandIconResId;
    private final String code;
    private final String displayName;
    private final String id;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/FpxBank$Companion;", "", "", "bankCode", "Lcom/stripe/android/view/FpxBank;", "get", "(Ljava/lang/String;)Lcom/stripe/android/view/FpxBank;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FpxBank.kt */
    public static final class Companion {
        private Companion() {
        }

        public final FpxBank get(String str) {
            FpxBank[] values = FpxBank.values();
            for (int i = 0; i < 18; i++) {
                FpxBank fpxBank = values[i];
                if (i.a(fpxBank.getCode(), str)) {
                    return fpxBank;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((f) null);
    }

    private FpxBank(String str, String str2, String str3, Integer num) {
        this.id = str;
        this.code = str2;
        this.displayName = str3;
        this.brandIconResId = num;
    }

    public static final FpxBank get(String str) {
        return Companion.get(str);
    }

    public Integer getBrandIconResId() {
        return this.brandIconResId;
    }

    public String getCode() {
        return this.code;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getId() {
        return this.id;
    }
}
