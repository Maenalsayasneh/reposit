package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "Lcom/stripe/android/model/AccountRange;", "first", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Lcom/stripe/android/model/AccountRange;", "", "filter", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Ljava/util/List;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultStaticCardAccountRanges.kt */
public final class DefaultStaticCardAccountRanges implements StaticCardAccountRanges {
    /* access modifiers changed from: private */
    public static final List<AccountRange> ACCOUNTS;
    private static final List<AccountRange> AMEX_ACCOUNTS;
    public static final Companion Companion = new Companion((f) null);
    private static final List<AccountRange> DINERSCLUB14_ACCOUNT_RANGES;
    private static final List<AccountRange> DINERSCLUB16_ACCOUNT_RANGES;
    /* access modifiers changed from: private */
    public static final List<AccountRange> DISCOVER_ACCOUNTS;
    private static final List<AccountRange> JCB_ACCOUNTS;
    private static final List<AccountRange> MASTERCARD_ACCOUNTS;
    private static final List<AccountRange> UNIONPAY_ACCOUNTS;
    private static final List<AccountRange> VISA_ACCOUNTS;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/cards/DefaultStaticCardAccountRanges$Companion;", "", "", "Lcom/stripe/android/model/AccountRange;", "DISCOVER_ACCOUNTS", "Ljava/util/List;", "getDISCOVER_ACCOUNTS$payments_core_release", "()Ljava/util/List;", "ACCOUNTS", "getACCOUNTS$payments_core_release", "AMEX_ACCOUNTS", "DINERSCLUB14_ACCOUNT_RANGES", "DINERSCLUB16_ACCOUNT_RANGES", "JCB_ACCOUNTS", "MASTERCARD_ACCOUNTS", "UNIONPAY_ACCOUNTS", "VISA_ACCOUNTS", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultStaticCardAccountRanges.kt */
    public static final class Companion {
        private Companion() {
        }

        public final List<AccountRange> getACCOUNTS$payments_core_release() {
            return DefaultStaticCardAccountRanges.ACCOUNTS;
        }

        public final List<AccountRange> getDISCOVER_ACCOUNTS$payments_core_release() {
            return DefaultStaticCardAccountRanges.DISCOVER_ACCOUNTS;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    static {
        Set<BinRange> N3 = h.N3(new BinRange("4000000000000000", "4999999999999999"));
        ArrayList arrayList = new ArrayList(h.K(N3, 10));
        for (BinRange accountRange : N3) {
            arrayList.add(new AccountRange(accountRange, 16, AccountRange.BrandInfo.Visa, (String) null, 8, (f) null));
        }
        VISA_ACCOUNTS = arrayList;
        Set<BinRange> h02 = g.h0(new BinRange("2221000000000000", "2720999999999999"), new BinRange("5100000000000000", "5599999999999999"));
        ArrayList arrayList2 = new ArrayList(h.K(h02, 10));
        for (BinRange accountRange2 : h02) {
            arrayList2.add(new AccountRange(accountRange2, 16, AccountRange.BrandInfo.Mastercard, (String) null, 8, (f) null));
        }
        MASTERCARD_ACCOUNTS = arrayList2;
        Set<BinRange> h03 = g.h0(new BinRange("340000000000000", "349999999999999"), new BinRange("370000000000000", "379999999999999"));
        ArrayList arrayList3 = new ArrayList(h.K(h03, 10));
        for (BinRange accountRange3 : h03) {
            arrayList3.add(new AccountRange(accountRange3, 15, AccountRange.BrandInfo.AmericanExpress, (String) null, 8, (f) null));
        }
        AMEX_ACCOUNTS = arrayList3;
        Set<BinRange> h04 = g.h0(new BinRange("6000000000000000", "6099999999999999"), new BinRange("6400000000000000", "6499999999999999"), new BinRange("6500000000000000", "6599999999999999"));
        ArrayList arrayList4 = new ArrayList(h.K(h04, 10));
        for (BinRange accountRange4 : h04) {
            arrayList4.add(new AccountRange(accountRange4, 16, AccountRange.BrandInfo.Discover, (String) null, 8, (f) null));
        }
        DISCOVER_ACCOUNTS = arrayList4;
        Set<BinRange> N32 = h.N3(new BinRange("3528000000000000", "3589999999999999"));
        ArrayList arrayList5 = new ArrayList(h.K(N32, 10));
        for (BinRange accountRange5 : N32) {
            arrayList5.add(new AccountRange(accountRange5, 16, AccountRange.BrandInfo.JCB, (String) null, 8, (f) null));
        }
        JCB_ACCOUNTS = arrayList5;
        Set<BinRange> h05 = g.h0(new BinRange("6200000000000000", "6299999999999999"), new BinRange("8100000000000000", "8199999999999999"));
        ArrayList arrayList6 = new ArrayList(h.K(h05, 10));
        for (BinRange accountRange6 : h05) {
            arrayList6.add(new AccountRange(accountRange6, 16, AccountRange.BrandInfo.UnionPay, (String) null, 8, (f) null));
        }
        UNIONPAY_ACCOUNTS = arrayList6;
        Set<BinRange> h06 = g.h0(new BinRange("3000000000000000", "3059999999999999"), new BinRange("3095000000000000", "3095999999999999"), new BinRange("3800000000000000", "3999999999999999"));
        ArrayList arrayList7 = new ArrayList(h.K(h06, 10));
        for (BinRange accountRange7 : h06) {
            arrayList7.add(new AccountRange(accountRange7, 16, AccountRange.BrandInfo.DinersClub, (String) null, 8, (f) null));
        }
        DINERSCLUB16_ACCOUNT_RANGES = arrayList7;
        Set<BinRange> N33 = h.N3(new BinRange("36000000000000", "36999999999999"));
        ArrayList arrayList8 = new ArrayList(h.K(N33, 10));
        for (BinRange accountRange8 : N33) {
            arrayList8.add(new AccountRange(accountRange8, 14, AccountRange.BrandInfo.DinersClub, (String) null, 8, (f) null));
        }
        DINERSCLUB14_ACCOUNT_RANGES = arrayList8;
        ACCOUNTS = g.Z(g.Z(g.Z(g.Z(g.Z(g.Z(g.Z(VISA_ACCOUNTS, MASTERCARD_ACCOUNTS), AMEX_ACCOUNTS), DISCOVER_ACCOUNTS), JCB_ACCOUNTS), UNIONPAY_ACCOUNTS), DINERSCLUB16_ACCOUNT_RANGES), arrayList8);
    }

    public List<AccountRange> filter(CardNumber.Unvalidated unvalidated) {
        i.e(unvalidated, "cardNumber");
        List<AccountRange> list = ACCOUNTS;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (((AccountRange) next).getBinRange().matches$payments_core_release(unvalidated)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public AccountRange first(CardNumber.Unvalidated unvalidated) {
        i.e(unvalidated, "cardNumber");
        return (AccountRange) g.w(filter(unvalidated));
    }
}
