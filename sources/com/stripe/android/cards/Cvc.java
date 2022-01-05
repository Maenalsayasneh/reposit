package com.stripe.android.cards;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/cards/Cvc;", "", "<init>", "()V", "Companion", "Unvalidated", "Validated", "Lcom/stripe/android/cards/Cvc$Unvalidated;", "Lcom/stripe/android/cards/Cvc$Validated;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Cvc.kt */
public abstract class Cvc {
    @Deprecated
    private static final int COMMON_LENGTH = 3;
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/cards/Cvc$Companion;", "", "", "COMMON_LENGTH", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Cvc.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0006J\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001c\u0010\u0019\u001a\u00020\u00078\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/cards/Cvc$Unvalidated;", "Lcom/stripe/android/cards/Cvc;", "", "maxLength", "", "isComplete", "(I)Z", "", "component1", "()Ljava/lang/String;", "Lcom/stripe/android/cards/Cvc$Validated;", "validate", "(I)Lcom/stripe/android/cards/Cvc$Validated;", "isPartialEntry", "denormalized", "copy", "(Ljava/lang/String;)Lcom/stripe/android/cards/Cvc$Unvalidated;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "normalized", "getNormalized$payments_core_release", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Cvc.kt */
    public static final class Unvalidated extends Cvc {
        private final String denormalized;
        private final String normalized;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Unvalidated(String str) {
            super((f) null);
            i.e(str, "denormalized");
            this.denormalized = str;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            i.d(sb2, "filterTo(StringBuilder(), predicate).toString()");
            this.normalized = sb2;
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

        private final boolean isComplete(int i) {
            Companion unused = Cvc.Companion;
            return g.h0(3, Integer.valueOf(i)).contains(Integer.valueOf(this.normalized.length()));
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

        public final String getNormalized$payments_core_release() {
            return this.normalized;
        }

        public int hashCode() {
            String str = this.denormalized;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final boolean isPartialEntry(int i) {
            return (StringsKt__IndentKt.o(this.normalized) ^ true) && !isComplete(i);
        }

        public String toString() {
            return a.y0(a.P0("Unvalidated(denormalized="), this.denormalized, ")");
        }

        public final Validated validate(int i) {
            if (isComplete(i)) {
                return new Validated(this.normalized);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/cards/Cvc$Validated;", "Lcom/stripe/android/cards/Cvc;", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "value", "copy", "(Ljava/lang/String;)Lcom/stripe/android/cards/Cvc$Validated;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue$payments_core_release", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Cvc.kt */
    public static final class Validated extends Cvc {
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
            return a.y0(a.P0("Validated(value="), this.value, ")");
        }
    }

    private Cvc() {
    }

    public /* synthetic */ Cvc(f fVar) {
        this();
    }
}
