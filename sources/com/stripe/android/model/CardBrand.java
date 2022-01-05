package com.stripe.android.model;

import com.stripe.android.R;
import com.stripe.android.cards.CardNumber;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0010$\n\u0002\b,\b\u0001\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001GB³\u0001\b\u0002\u0012\u0006\u00105\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\b\b\u0001\u0010;\u001a\u00020\u000e\u0012\b\b\u0003\u00103\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\b\b\u0002\u0010B\u001a\u00020\u000e\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040$\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0$\u0012\u001a\b\u0002\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120$¢\u0006\u0004\bE\u0010FJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R.\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120$8\u0002@\u0003X\u0004¢\u0006\f\n\u0004\b%\u0010&\u0012\u0004\b'\u0010#R\u0019\u0010(\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u000e8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b,\u0010\u001b\u0012\u0004\b.\u0010#\u001a\u0004\b-\u0010\u001dR\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010!R(\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0$8\u0002@\u0003X\u0004¢\u0006\f\n\u0004\b1\u0010&\u0012\u0004\b2\u0010#R\u0019\u00103\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010\u001b\u001a\u0004\b4\u0010\u001dR\u0019\u00105\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010+R\u0013\u00108\u001a\u00020\u000e8F@\u0006¢\u0006\u0006\u001a\u0004\b7\u0010\u001dR(\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040$8\u0002@\u0003X\u0004¢\u0006\f\n\u0004\b9\u0010&\u0012\u0004\b:\u0010#R\u0019\u0010;\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010\u001b\u001a\u0004\b<\u0010\u001dR$\u0010=\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010#\u001a\u0004\b?\u0010@R\"\u0010B\u001a\u00020\u000e8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\bB\u0010\u001b\u0012\u0004\bD\u0010#\u001a\u0004\bC\u0010\u001dj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bO¨\u0006P"}, d2 = {"Lcom/stripe/android/model/CardBrand;", "", "", "cardNumber", "Ljava/util/regex/Pattern;", "getPatternForLength", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", "", "isValidCardNumberLength", "(Ljava/lang/String;)Z", "cvc", "isValidCvc", "cvcText", "isMaxCvc", "", "getMaxLengthForCardNumber", "(Ljava/lang/String;)I", "getMaxLengthWithSpacesForCardNumber", "", "getSpacePositionsForCardNumber", "(Ljava/lang/String;)Ljava/util/Set;", "formatNumber", "(Ljava/lang/String;)Ljava/lang/String;", "", "groupNumber", "(Ljava/lang/String;)[Ljava/lang/String;", "errorIcon", "I", "getErrorIcon", "()I", "defaultSpacePositions", "Ljava/util/Set;", "getDefaultSpacePositions", "()Ljava/util/Set;", "getDefaultSpacePositions$annotations", "()V", "", "variantSpacePositions", "Ljava/util/Map;", "getVariantSpacePositions$annotations", "displayName", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "defaultMaxLengthWithSpaces", "getDefaultMaxLengthWithSpaces", "getDefaultMaxLengthWithSpaces$annotations", "cvcLength", "getCvcLength", "variantMaxLength", "getVariantMaxLength$annotations", "cvcIcon", "getCvcIcon", "code", "getCode", "getMaxCvcLength", "maxCvcLength", "partialPatterns", "getPartialPatterns$annotations", "icon", "getIcon", "pattern", "Ljava/util/regex/Pattern;", "getPattern", "()Ljava/util/regex/Pattern;", "getPattern$annotations", "defaultMaxLength", "getDefaultMaxLength", "getDefaultMaxLength$annotations", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;)V", "Companion", "AmericanExpress", "Discover", "JCB", "DinersClub", "Visa", "MasterCard", "UnionPay", "Unknown", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardBrand.kt */
public enum CardBrand {
    AmericanExpress(r4, r5, r6, r7, r8, r9, 15, r11, h.S2(new Pair(1, Pattern.compile("^3$"))), g.h0(4, 11), (Map) null, (Set) null, 3072, (Map) null),
    Discover("discover", "Discover", R.drawable.stripe_ic_discover, 0, 0, (int) null, 0, Pattern.compile("^(60|64|65)[0-9]*$"), h.S2(new Pair(1, Pattern.compile("^6$"))), (Pattern) null, (Map) null, (Set) null, 3704, (Map) null),
    JCB("jcb", "JCB", R.drawable.stripe_ic_jcb, 0, 0, (int) null, 0, Pattern.compile("^(352[89]|35[3-8][0-9])[0-9]*$"), g.N(new Pair(1, Pattern.compile("^3$")), new Pair(2, Pattern.compile("^(35)$")), new Pair(3, Pattern.compile("^(35[2-8])$"))), (Pattern) null, (Map) null, (Set) null, 3704, (Map) null),
    DinersClub("diners", "Diners Club", R.drawable.stripe_ic_diners, 0, 0, (int) null, 16, Pattern.compile("^(36|30|38|39)[0-9]*$"), h.S2(new Pair(1, Pattern.compile("^3$"))), (Pattern) null, h.S2(new Pair(Pattern.compile("^(36)[0-9]*$"), 14)), h.S2(new Pair(Pattern.compile("^(36)[0-9]*$"), g.h0(4, 11))), 568, (Map) null),
    Visa("visa", "Visa", R.drawable.stripe_ic_visa, 0, 0, (int) null, 0, Pattern.compile("^(4)[0-9]*$"), h.S2(new Pair(1, Pattern.compile("^4$"))), (Pattern) null, (Map) null, (Set) null, 3704, (Map) null),
    MasterCard("mastercard", "Mastercard", R.drawable.stripe_ic_mastercard, 0, 0, (int) null, 0, Pattern.compile("^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), g.N(new Pair(1, Pattern.compile("^2|5|6$")), new Pair(2, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), (Pattern) null, (Map) null, (Set) null, 3704, (Map) null),
    UnionPay("unionpay", "UnionPay", R.drawable.stripe_ic_unionpay, 0, 0, (int) null, 0, Pattern.compile("^(62|81)[0-9]*$"), h.S2(new Pair(1, Pattern.compile("^6|8$"))), (Pattern) null, (Map) null, (Set) null, 3704, (Map) null),
    Unknown("unknown", "Unknown", R.drawable.stripe_ic_unknown, 0, 0, g.h0(3, 4), 0, (Set) null, g.o(), (Pattern) null, (Map) null, (Set) null, 3800, (Map) null);
    
    private static final int CVC_COMMON_LENGTH = 3;
    public static final Companion Companion = null;
    private final String code;
    private final int cvcIcon;
    private final Set<Integer> cvcLength;
    private final int defaultMaxLength;
    private final int defaultMaxLengthWithSpaces;
    private final Set<Integer> defaultSpacePositions;
    private final String displayName;
    private final int errorIcon;
    private final int icon;
    private final Map<Integer, Pattern> partialPatterns;
    private final Pattern pattern;
    private final Map<Pattern, Integer> variantMaxLength;
    private final Map<Pattern, Set<Integer>> variantSpacePositions;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\tR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/CardBrand$Companion;", "", "", "cardNumber", "", "Lcom/stripe/android/model/CardBrand;", "getMatchingCards", "(Ljava/lang/String;)Ljava/util/List;", "fromCardNumber", "(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;", "getCardBrands$payments_core_release", "getCardBrands", "code", "fromCode", "", "CVC_COMMON_LENGTH", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardBrand.kt */
    public static final class Companion {
        private Companion() {
        }

        private final List<CardBrand> getMatchingCards(String str) {
            Matcher matcher;
            CardBrand[] values = CardBrand.values();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 8; i++) {
                CardBrand cardBrand = values[i];
                Pattern access$getPatternForLength = cardBrand.getPatternForLength(str);
                boolean z = true;
                if (access$getPatternForLength == null || (matcher = access$getPatternForLength.matcher(str)) == null || !matcher.matches()) {
                    z = false;
                }
                if (z) {
                    arrayList.add(cardBrand);
                }
            }
            return arrayList;
        }

        public final CardBrand fromCardNumber(String str) {
            boolean z = false;
            if (str == null || StringsKt__IndentKt.o(str)) {
                return CardBrand.Unknown;
            }
            List<CardBrand> matchingCards = getMatchingCards(str);
            if (matchingCards.size() == 1) {
                z = true;
            }
            if (!z) {
                matchingCards = null;
            }
            if (matchingCards == null) {
                matchingCards = h.L2(CardBrand.Unknown);
            }
            return (CardBrand) g.u(matchingCards);
        }

        public final CardBrand fromCode(String str) {
            CardBrand cardBrand;
            CardBrand[] values = CardBrand.values();
            int i = 0;
            while (true) {
                if (i >= 8) {
                    cardBrand = null;
                    break;
                }
                cardBrand = values[i];
                if (StringsKt__IndentKt.f(cardBrand.getCode(), str, true)) {
                    break;
                }
                i++;
            }
            return cardBrand != null ? cardBrand : CardBrand.Unknown;
        }

        public final List<CardBrand> getCardBrands$payments_core_release(String str) {
            if (str == null || StringsKt__IndentKt.o(str)) {
                return h.L2(CardBrand.Unknown);
            }
            List<CardBrand> matchingCards = getMatchingCards(str);
            if (!(true ^ matchingCards.isEmpty())) {
                matchingCards = null;
            }
            return matchingCards != null ? matchingCards : h.L2(CardBrand.Unknown);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((f) null);
    }

    private CardBrand(String str, String str2, int i, int i2, int i3, Set<Integer> set, int i4, Pattern pattern2, Map<Integer, Pattern> map, Set<Integer> set2, Map<Pattern, Integer> map2, Map<Pattern, ? extends Set<Integer>> map3) {
        this.code = str;
        this.displayName = str2;
        this.icon = i;
        this.cvcIcon = i2;
        this.errorIcon = i3;
        this.cvcLength = set;
        this.defaultMaxLength = i4;
        this.pattern = pattern2;
        this.partialPatterns = map;
        this.defaultSpacePositions = set2;
        this.variantMaxLength = map2;
        this.variantSpacePositions = map3;
        this.defaultMaxLengthWithSpaces = set2.size() + i4;
    }

    /* access modifiers changed from: private */
    public final Pattern getPatternForLength(String str) {
        Pattern pattern2 = this.partialPatterns.get(Integer.valueOf(str.length()));
        return pattern2 != null ? pattern2 : this.pattern;
    }

    public final String formatNumber(String str) {
        i.e(str, "cardNumber");
        String[] groupNumber = groupNumber(str);
        ArrayList arrayList = new ArrayList();
        int length = groupNumber.length;
        for (int i = 0; i < length; i++) {
            String str2 = groupNumber[i];
            if (!(str2 != null)) {
                break;
            }
            arrayList.add(str2);
        }
        return g.E(arrayList, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
    }

    public final String getCode() {
        return this.code;
    }

    public final int getCvcIcon() {
        return this.cvcIcon;
    }

    public final Set<Integer> getCvcLength() {
        return this.cvcLength;
    }

    public final int getDefaultMaxLength() {
        return this.defaultMaxLength;
    }

    public final int getDefaultMaxLengthWithSpaces() {
        return this.defaultMaxLengthWithSpaces;
    }

    public final Set<Integer> getDefaultSpacePositions() {
        return this.defaultSpacePositions;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getErrorIcon() {
        return this.errorIcon;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getMaxCvcLength() {
        Integer num = (Integer) g.O(this.cvcLength);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public final int getMaxLengthForCardNumber(String str) {
        T t;
        Integer num;
        i.e(str, "cardNumber");
        String normalized = new CardNumber.Unvalidated(str).getNormalized();
        Iterator<T> it = this.variantMaxLength.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Pattern) ((Map.Entry) t).getKey()).matcher(normalized).matches()) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) t;
        if (entry == null || (num = (Integer) entry.getValue()) == null) {
            return this.defaultMaxLength;
        }
        return num.intValue();
    }

    public final int getMaxLengthWithSpacesForCardNumber(String str) {
        i.e(str, "cardNumber");
        return getSpacePositionsForCardNumber(str).size() + getMaxLengthForCardNumber(str);
    }

    public final Pattern getPattern() {
        return this.pattern;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        r4 = (java.util.Set) r1.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set<java.lang.Integer> getSpacePositionsForCardNumber(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "cardNumber"
            m0.n.b.i.e(r4, r0)
            com.stripe.android.cards.CardNumber$Unvalidated r0 = new com.stripe.android.cards.CardNumber$Unvalidated
            r0.<init>(r4)
            java.lang.String r4 = r0.getNormalized()
            java.util.Map<java.util.regex.Pattern, java.util.Set<java.lang.Integer>> r0 = r3.variantSpacePositions
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            java.util.regex.Pattern r2 = (java.util.regex.Pattern) r2
            java.util.regex.Matcher r2 = r2.matcher(r4)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L_0x0018
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L_0x0044
            java.lang.Object r4 = r1.getValue()
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            java.util.Set<java.lang.Integer> r4 = r3.defaultSpacePositions
        L_0x0046:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.CardBrand.getSpacePositionsForCardNumber(java.lang.String):java.util.Set");
    }

    public final String[] groupNumber(String str) {
        i.e(str, "cardNumber");
        String S3 = a.S3(str, getMaxLengthForCardNumber(str));
        Set<Integer> spacePositionsForCardNumber = getSpacePositionsForCardNumber(str);
        boolean z = true;
        int size = spacePositionsForCardNumber.size() + 1;
        String[] strArr = new String[size];
        int length = S3.length();
        Iterator<T> it = g.m0(g.v0(spacePositionsForCardNumber)).iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            Integer num = null;
            if (it.hasNext()) {
                T next = it.next();
                int i3 = i + 1;
                if (i >= 0) {
                    int intValue = ((Number) next).intValue() - i;
                    if (length > intValue) {
                        String substring = S3.substring(i2, intValue);
                        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        strArr[i] = substring;
                        i2 = intValue;
                    }
                    i = i3;
                } else {
                    g.r0();
                    throw null;
                }
            } else {
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        i4 = -1;
                        break;
                    }
                    if (strArr[i4] == null) {
                        break;
                    }
                    i4++;
                }
                Integer valueOf = Integer.valueOf(i4);
                if (valueOf.intValue() == -1) {
                    z = false;
                }
                if (z) {
                    num = valueOf;
                }
                if (num != null) {
                    int intValue2 = num.intValue();
                    String substring2 = S3.substring(i2);
                    i.d(substring2, "(this as java.lang.String).substring(startIndex)");
                    strArr[intValue2] = substring2;
                }
                return strArr;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = kotlin.text.StringsKt__IndentKt.X(r3).toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isMaxCvc(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0012
            java.lang.CharSequence r3 = kotlin.text.StringsKt__IndentKt.X(r3)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L_0x0012
            int r3 = r3.length()
            goto L_0x0013
        L_0x0012:
            r3 = r0
        L_0x0013:
            int r1 = r2.getMaxCvcLength()
            if (r1 != r3) goto L_0x001a
            r0 = 1
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.CardBrand.isMaxCvc(java.lang.String):boolean");
    }

    public final boolean isValidCardNumberLength(String str) {
        return (str == null || Unknown == this || str.length() != getMaxLengthForCardNumber(str)) ? false : true;
    }

    public final boolean isValidCvc(String str) {
        i.e(str, "cvc");
        return this.cvcLength.contains(Integer.valueOf(str.length()));
    }
}
