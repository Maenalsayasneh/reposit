package com.stripe.android.cards;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.CardUtils;
import com.stripe.android.model.CardBrand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/cards/CardNumber;", "", "<init>", "()V", "Companion", "Unvalidated", "Validated", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "Lcom/stripe/android/cards/CardNumber$Validated;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardNumber.kt */
public abstract class CardNumber {
    public static final Companion Companion = new Companion((f) null);
    public static final int DEFAULT_PAN_LENGTH = 16;
    /* access modifiers changed from: private */
    public static final Set<Integer> DEFAULT_SPACE_POSITIONS = g.h0(4, 9, 14);
    public static final int MAX_PAN_LENGTH = 19;
    public static final int MIN_PAN_LENGTH = 14;
    /* access modifiers changed from: private */
    public static final Map<Integer, Set<Integer>> SPACE_POSITIONS = g.N(new Pair(14, g.h0(4, 11)), new Pair(15, g.h0(4, 11)), new Pair(16, g.h0(4, 9, 14)), new Pair(19, g.h0(4, 9, 14, 19)));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\r\u0010\tR(\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/cards/CardNumber$Companion;", "", "", "panLength", "", "getSpacePositions$payments_core_release", "(I)Ljava/util/Set;", "getSpacePositions", "DEFAULT_PAN_LENGTH", "I", "DEFAULT_SPACE_POSITIONS", "Ljava/util/Set;", "MAX_PAN_LENGTH", "MIN_PAN_LENGTH", "", "SPACE_POSITIONS", "Ljava/util/Map;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardNumber.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Set<Integer> getSpacePositions$payments_core_release(int i) {
            Set<Integer> set = (Set) CardNumber.SPACE_POSITIONS.get(Integer.valueOf(i));
            return set != null ? set : CardNumber.DEFAULT_SPACE_POSITIONS;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\bJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0019\u0010\u001f\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0012R\u001b\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010&\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\bR\u0019\u0010(\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010+\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b+\u0010\u0012¨\u0006/"}, d2 = {"Lcom/stripe/android/cards/CardNumber$Unvalidated;", "Lcom/stripe/android/cards/CardNumber;", "", "panLength", "", "formatNumber", "(I)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "Lcom/stripe/android/cards/CardNumber$Validated;", "validate", "(I)Lcom/stripe/android/cards/CardNumber$Validated;", "getFormatted", "", "isPartialEntry$payments_core_release", "(I)Z", "isPartialEntry", "isPossibleCardBrand$payments_core_release", "()Z", "isPossibleCardBrand", "denormalized", "copy", "(Ljava/lang/String;)Lcom/stripe/android/cards/CardNumber$Unvalidated;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "isValidLuhn", "Z", "Lcom/stripe/android/cards/Bin;", "bin", "Lcom/stripe/android/cards/Bin;", "getBin", "()Lcom/stripe/android/cards/Bin;", "normalized", "getNormalized", "length", "I", "getLength", "isMaxLength", "<init>", "(Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardNumber.kt */
    public static final class Unvalidated extends CardNumber {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final Set<Character> REJECT_CHARS = g.h0('-', ' ');
        private final Bin bin;
        private final String denormalized;
        private final boolean isMaxLength;
        private final boolean isValidLuhn;
        private final int length;
        private final String normalized;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/stripe/android/cards/CardNumber$Unvalidated$Companion;", "", "", "", "REJECT_CHARS", "Ljava/util/Set;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: CardNumber.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Unvalidated(String str) {
            super((f) null);
            i.e(str, "denormalized");
            this.denormalized = str;
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!REJECT_CHARS.contains(Character.valueOf(charAt))) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            i.d(sb2, "filterNotTo(StringBuilder(), predicate).toString()");
            this.normalized = sb2;
            int length2 = sb2.length();
            this.length = length2;
            this.isMaxLength = length2 == 19 ? true : z;
            this.bin = Bin.Companion.create(sb2);
            this.isValidLuhn = CardUtils.INSTANCE.isValidLuhnNumber$payments_core_release(sb2);
        }

        private final String component1() {
            return this.denormalized;
        }

        public static /* synthetic */ Unvalidated copy$default(Unvalidated unvalidated, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unvalidated.denormalized;
            }
            return unvalidated.copy(str);
        }

        private final String formatNumber(int i) {
            Set<Integer> spacePositions$payments_core_release = CardNumber.Companion.getSpacePositions$payments_core_release(i);
            String S3 = a.S3(this.normalized, i);
            int size = spacePositions$payments_core_release.size() + 1;
            String[] strArr = new String[size];
            int length2 = S3.length();
            Iterator<T> it = g.m0(g.v0(spacePositions$payments_core_release)).iterator();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                Integer num = null;
                if (it.hasNext()) {
                    T next = it.next();
                    int i4 = i2 + 1;
                    if (i2 >= 0) {
                        int intValue = ((Number) next).intValue() - i2;
                        if (length2 > intValue) {
                            String substring = S3.substring(i3, intValue);
                            i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            strArr[i2] = substring;
                            i3 = intValue;
                        }
                        i2 = i4;
                    } else {
                        g.r0();
                        throw null;
                    }
                } else {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            i5 = -1;
                            break;
                        }
                        if (strArr[i5] == null) {
                            break;
                        }
                        i5++;
                    }
                    Integer valueOf = Integer.valueOf(i5);
                    if (valueOf.intValue() != -1) {
                        num = valueOf;
                    }
                    if (num != null) {
                        int intValue2 = num.intValue();
                        String substring2 = S3.substring(i3);
                        i.d(substring2, "(this as java.lang.String).substring(startIndex)");
                        strArr[intValue2] = substring2;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = strArr[i6];
                        if (!(str != null)) {
                            break;
                        }
                        arrayList.add(str);
                    }
                    return g.E(arrayList, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
                }
            }
        }

        public static /* synthetic */ String getFormatted$default(Unvalidated unvalidated, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 16;
            }
            return unvalidated.getFormatted(i);
        }

        public final Unvalidated copy(String str) {
            i.e(str, "denormalized");
            return new Unvalidated(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Unvalidated) && i.a(this.denormalized, ((Unvalidated) obj).denormalized);
            }
            return true;
        }

        public final Bin getBin() {
            return this.bin;
        }

        public final String getFormatted(int i) {
            return formatNumber(i);
        }

        public final int getLength() {
            return this.length;
        }

        public final String getNormalized() {
            return this.normalized;
        }

        public int hashCode() {
            String str = this.denormalized;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final boolean isMaxLength() {
            return this.isMaxLength;
        }

        public final boolean isPartialEntry$payments_core_release(int i) {
            return this.normalized.length() != i && (StringsKt__IndentKt.o(this.normalized) ^ true);
        }

        public final boolean isPossibleCardBrand$payments_core_release() {
            if (!(!StringsKt__IndentKt.o(this.normalized)) || ((CardBrand) g.u(CardBrand.Companion.getCardBrands$payments_core_release(this.normalized))) == CardBrand.Unknown) {
                return false;
            }
            return true;
        }

        public final boolean isValidLuhn() {
            return this.isValidLuhn;
        }

        public String toString() {
            return i0.d.a.a.a.y0(i0.d.a.a.a.P0("Unvalidated(denormalized="), this.denormalized, ")");
        }

        public final Validated validate(int i) {
            if (i < 14 || this.normalized.length() != i || !this.isValidLuhn) {
                return null;
            }
            return new Validated(this.normalized);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/cards/CardNumber$Validated;", "Lcom/stripe/android/cards/CardNumber;", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "value", "copy", "(Ljava/lang/String;)Lcom/stripe/android/cards/CardNumber$Validated;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue$payments_core_release", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardNumber.kt */
    public static final class Validated extends CardNumber {
        private final String value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Validated(String str) {
            super((f) null);
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            this.value = str;
        }

        public static /* synthetic */ Validated copy$default(Validated validated, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validated.value;
            }
            return validated.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.value;
        }

        public final Validated copy(String str) {
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            return new Validated(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Validated) && i.a(this.value, ((Validated) obj).value);
            }
            return true;
        }

        public final String getValue$payments_core_release() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return i0.d.a.a.a.y0(i0.d.a.a.a.P0("Validated(value="), this.value, ")");
        }
    }

    private CardNumber() {
    }

    public /* synthetic */ CardNumber(f fVar) {
        this();
    }
}
