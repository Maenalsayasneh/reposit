package com.stripe.android.stripe3ds2.init;

import com.stripe.android.stripe3ds2.init.SecurityCheck;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\u0007R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "", "", "Lcom/stripe/android/stripe3ds2/init/Warning;", "getWarnings", "()Ljava/util/List;", "warnings", "Default", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SecurityChecker.kt */
public interface SecurityChecker {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\b\u0000\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityChecker$Default;", "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "", "Lcom/stripe/android/stripe3ds2/init/Warning;", "getWarnings", "()Ljava/util/List;", "warnings", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "securityChecks", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SecurityChecker.kt */
    public static final class Default implements SecurityChecker {
        private static final Companion Companion = new Companion((f) null);
        /* access modifiers changed from: private */
        @Deprecated
        public static final List<SecurityCheck> DEFAULT_CHECKS = g.K(new SecurityCheck.RootedCheck(), new SecurityCheck.Tampered(), new SecurityCheck.Emulator(), new SecurityCheck.DebuggerAttached(false, 1, (f) null), new SecurityCheck.UnsupportedOS());
        private final List<SecurityCheck> securityChecks;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityChecker$Default$Companion;", "", "", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "DEFAULT_CHECKS", "Ljava/util/List;", "getDEFAULT_CHECKS", "()Ljava/util/List;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SecurityChecker.kt */
        public static final class Companion {
            private Companion() {
            }

            public final List<SecurityCheck> getDEFAULT_CHECKS() {
                return Default.DEFAULT_CHECKS;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public Default() {
            this((List) null, 1, (f) null);
        }

        public Default(List<? extends SecurityCheck> list) {
            i.e(list, "securityChecks");
            this.securityChecks = list;
        }

        public List<Warning> getWarnings() {
            List<SecurityCheck> list = this.securityChecks;
            ArrayList<SecurityCheck> arrayList = new ArrayList<>();
            for (T next : list) {
                if (((SecurityCheck) next).check()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(h.K(arrayList, 10));
            for (SecurityCheck warning : arrayList) {
                arrayList2.add(warning.getWarning());
            }
            return arrayList2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Default(List<SecurityCheck> list, int i, f fVar) {
            this((i & 1) != 0 ? DEFAULT_CHECKS : list);
        }
    }

    List<Warning> getWarnings();
}
