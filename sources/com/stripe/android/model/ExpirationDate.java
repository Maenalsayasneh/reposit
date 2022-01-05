package com.stripe.android.model;

import com.stripe.android.view.DateUtils;
import i0.d.a.a.a;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/ExpirationDate;", "", "<init>", "()V", "Unvalidated", "Validated", "Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "Lcom/stripe/android/model/ExpirationDate$Validated;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ExpirationDate.kt */
public abstract class ExpirationDate {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/ExpirationDate$Validated;", "Lcom/stripe/android/model/ExpirationDate;", "", "component1", "()I", "component2", "month", "year", "copy", "(II)Lcom/stripe/android/model/ExpirationDate$Validated;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMonth", "getYear", "<init>", "(II)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ExpirationDate.kt */
    public static final class Validated extends ExpirationDate {
        private final int month;
        private final int year;

        public Validated(int i, int i2) {
            super((f) null);
            this.month = i;
            this.year = i2;
        }

        public static /* synthetic */ Validated copy$default(Validated validated, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = validated.month;
            }
            if ((i3 & 2) != 0) {
                i2 = validated.year;
            }
            return validated.copy(i, i2);
        }

        public final int component1() {
            return this.month;
        }

        public final int component2() {
            return this.year;
        }

        public final Validated copy(int i, int i2) {
            return new Validated(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Validated)) {
                return false;
            }
            Validated validated = (Validated) obj;
            return this.month == validated.month && this.year == validated.year;
        }

        public final int getMonth() {
            return this.month;
        }

        public final int getYear() {
            return this.year;
        }

        public int hashCode() {
            return Integer.hashCode(this.year) + (Integer.hashCode(this.month) * 31);
        }

        public String toString() {
            StringBuilder P0 = a.P0("Validated(month=");
            P0.append(this.month);
            P0.append(", year=");
            return a.u0(P0, this.year, ")");
        }
    }

    private ExpirationDate() {
    }

    public /* synthetic */ ExpirationDate(f fVar) {
        this();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b!\u0010#J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u00020\u00148\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001b\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001c\u001a\u00020\u00148\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b \u0010\u0007¨\u0006%"}, d2 = {"Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "Lcom/stripe/android/model/ExpirationDate;", "Lcom/stripe/android/model/ExpirationDate$Validated;", "validate", "()Lcom/stripe/android/model/ExpirationDate$Validated;", "", "getDisplayString", "()Ljava/lang/String;", "component1", "component2", "month", "year", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "isComplete", "Z", "isComplete$payments_core_release", "()Z", "isMonthValid", "isPartialEntry", "isPartialEntry$payments_core_release", "Ljava/lang/String;", "getMonth", "getYear", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "(II)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ExpirationDate.kt */
    public static final class Unvalidated extends ExpirationDate {
        public static final Companion Companion = new Companion((f) null);
        /* access modifiers changed from: private */
        public static final Unvalidated EMPTY = new Unvalidated("", "");
        private final boolean isComplete;
        private final boolean isMonthValid;
        private final boolean isPartialEntry;
        private final String month;
        private final String year;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/ExpirationDate$Unvalidated$Companion;", "", "", "input", "Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "create", "(Ljava/lang/String;)Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "EMPTY", "Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "getEMPTY", "()Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: ExpirationDate.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Unvalidated create(String str) {
                boolean z;
                i.e(str, "input");
                int i = 0;
                while (true) {
                    z = true;
                    if (i >= str.length()) {
                        break;
                    }
                    char charAt = str.charAt(i);
                    if (!Character.isDigit(charAt) && !m0.r.t.a.r.m.a1.a.B2(charAt) && charAt != '/') {
                        z = false;
                    }
                    if (!z) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    return getEMPTY();
                }
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt2 = str.charAt(i2);
                    if (Character.isDigit(charAt2)) {
                        sb.append(charAt2);
                    }
                }
                String sb2 = sb.toString();
                i.d(sb2, "filterTo(StringBuilder(), predicate).toString()");
                return new Unvalidated(m0.r.t.a.r.m.a1.a.S3(sb2, 2), m0.r.t.a.r.m.a1.a.h1(sb2, 2));
            }

            public final Unvalidated getEMPTY() {
                return Unvalidated.EMPTY;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Unvalidated(java.lang.String r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.String r0 = "month"
                m0.n.b.i.e(r4, r0)
                java.lang.String r0 = "year"
                m0.n.b.i.e(r5, r0)
                r0 = 0
                r3.<init>(r0)
                r3.month = r4
                r3.year = r5
                r5 = 12
                r0 = 0
                r1 = 1
                int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x0027 }
                if (r1 <= r4) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                if (r5 < r4) goto L_0x0021
                r4 = r1
                goto L_0x0022
            L_0x0021:
                r4 = r0
            L_0x0022:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0027 }
                goto L_0x002c
            L_0x0027:
                r4 = move-exception
                java.lang.Object r4 = i0.j.f.p.h.l0(r4)
            L_0x002c:
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                boolean r2 = r4 instanceof kotlin.Result.Failure
                if (r2 == 0) goto L_0x0033
                r4 = r5
            L_0x0033:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r3.isMonthValid = r4
                java.lang.String r4 = r3.month
                int r4 = r4.length()
                java.lang.String r5 = r3.year
                int r5 = r5.length()
                int r5 = r5 + r4
                r4 = 4
                if (r5 != r4) goto L_0x004d
                r4 = r1
                goto L_0x004e
            L_0x004d:
                r4 = r0
            L_0x004e:
                r3.isComplete = r4
                if (r4 != 0) goto L_0x0062
                java.lang.String r4 = r3.month
                int r4 = r4.length()
                java.lang.String r5 = r3.year
                int r5 = r5.length()
                int r5 = r5 + r4
                if (r5 <= 0) goto L_0x0062
                r0 = r1
            L_0x0062:
                r3.isPartialEntry = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.ExpirationDate.Unvalidated.<init>(java.lang.String, java.lang.String):void");
        }

        public static /* synthetic */ Unvalidated copy$default(Unvalidated unvalidated, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unvalidated.month;
            }
            if ((i & 2) != 0) {
                str2 = unvalidated.year;
            }
            return unvalidated.copy(str, str2);
        }

        public final String component1() {
            return this.month;
        }

        public final String component2() {
            return this.year;
        }

        public final Unvalidated copy(String str, String str2) {
            i.e(str, "month");
            i.e(str2, "year");
            return new Unvalidated(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unvalidated)) {
                return false;
            }
            Unvalidated unvalidated = (Unvalidated) obj;
            return i.a(this.month, unvalidated.month) && i.a(this.year, unvalidated.year);
        }

        public final String getDisplayString() {
            if (this.year.length() == 3) {
                return "";
            }
            return g.E(g.K(StringsKt__IndentKt.t(this.month, 2, '0'), StringsKt__IndentKt.t(m0.r.t.a.r.m.a1.a.U3(this.year, 2), 2, '0')), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
        }

        public final String getMonth() {
            return this.month;
        }

        public final String getYear() {
            return this.year;
        }

        public int hashCode() {
            String str = this.month;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.year;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final boolean isComplete$payments_core_release() {
            return this.isComplete;
        }

        public final boolean isMonthValid() {
            return this.isMonthValid;
        }

        public final boolean isPartialEntry$payments_core_release() {
            return this.isPartialEntry;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Unvalidated(month=");
            P0.append(this.month);
            P0.append(", year=");
            return a.y0(P0, this.year, ")");
        }

        public final Validated validate() {
            Object obj;
            try {
                obj = new Validated(Integer.parseInt(this.month), DateUtils.INSTANCE.convertTwoDigitYearToFour(Integer.parseInt(this.year)));
            } catch (Throwable th) {
                obj = h.l0(th);
            }
            if (obj instanceof Result.Failure) {
                obj = null;
            }
            return (Validated) obj;
        }

        public Unvalidated(int i, int i2) {
            this(String.valueOf(i), String.valueOf(i2));
        }
    }
}
