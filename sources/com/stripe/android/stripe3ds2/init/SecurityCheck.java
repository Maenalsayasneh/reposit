package com.stripe.android.stripe3ds2.init;

import android.os.Debug;
import android.os.Environment;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl;
import i0.d.a.a.a;
import java.io.File;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import m0.j.g;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0006\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "", "", "check", "()Z", "Lcom/stripe/android/stripe3ds2/init/Warning;", "warning", "Lcom/stripe/android/stripe3ds2/init/Warning;", "getWarning", "()Lcom/stripe/android/stripe3ds2/init/Warning;", "<init>", "(Lcom/stripe/android/stripe3ds2/init/Warning;)V", "DebuggerAttached", "Emulator", "RootedCheck", "Tampered", "UnsupportedOS", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS;", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SecurityCheck.kt */
public abstract class SecurityCheck {
    private final Warning warning;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "", "check", "()Z", "isDebuggerConnected", "Z", "<init>", "(Z)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SecurityCheck.kt */
    public static final class DebuggerAttached extends SecurityCheck {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final Warning WARNING = new Warning("SW04", "A debugger is attached to the App.", Warning.Severity.MEDIUM);
        private final boolean isDebuggerConnected;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached$Companion;", "", "Lcom/stripe/android/stripe3ds2/init/Warning;", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SecurityCheck.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public DebuggerAttached() {
            this(false, 1, (f) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DebuggerAttached(boolean z, int i, f fVar) {
            this((i & 1) != 0 ? Debug.isDebuggerConnected() : z);
        }

        public boolean check() {
            return this.isDebuggerConnected;
        }

        public final boolean isDebuggerConnected() {
            return this.isDebuggerConnected;
        }

        public DebuggerAttached(boolean z) {
            super(WARNING, (f) null);
            this.isDebuggerConnected = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "", "check", "()Z", "isEmulator", "<init>", "()V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SecurityCheck.kt */
    public static final class Emulator extends SecurityCheck {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final Warning WARNING = new Warning("SW02", "An emulator is being used to run the App.", Warning.Severity.HIGH);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator$Companion;", "", "Lcom/stripe/android/stripe3ds2/init/Warning;", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SecurityCheck.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public Emulator() {
            super(WARNING, (f) null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
            if (kotlin.text.StringsKt__IndentKt.J(r0, "generic", false, 2) == false) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final boolean isEmulator() {
            /*
                r6 = this;
                java.lang.String r0 = android.os.Build.FINGERPRINT
                java.lang.String r1 = "Build.FINGERPRINT"
                m0.n.b.i.d(r0, r1)
                java.lang.String r2 = "generic"
                r3 = 0
                r4 = 2
                boolean r5 = kotlin.text.StringsKt__IndentKt.J(r0, r2, r3, r4)
                if (r5 != 0) goto L_0x0072
                m0.n.b.i.d(r0, r1)
                java.lang.String r1 = "unknown"
                boolean r0 = kotlin.text.StringsKt__IndentKt.J(r0, r1, r3, r4)
                if (r0 != 0) goto L_0x0072
                java.lang.String r0 = android.os.Build.MODEL
                java.lang.String r1 = "Build.MODEL"
                m0.n.b.i.d(r0, r1)
                java.lang.String r5 = "Emulator"
                boolean r5 = kotlin.text.StringsKt__IndentKt.d(r0, r5, r3, r4)
                if (r5 != 0) goto L_0x0072
                m0.n.b.i.d(r0, r1)
                java.lang.String r5 = "Android SDK built for x86"
                boolean r5 = kotlin.text.StringsKt__IndentKt.d(r0, r5, r3, r4)
                if (r5 != 0) goto L_0x0072
                m0.n.b.i.d(r0, r1)
                java.lang.String r1 = "google_sdk"
                boolean r0 = kotlin.text.StringsKt__IndentKt.d(r0, r1, r3, r4)
                if (r0 != 0) goto L_0x0072
                java.lang.String r0 = android.os.Build.MANUFACTURER
                java.lang.String r5 = "Build.MANUFACTURER"
                m0.n.b.i.d(r0, r5)
                java.lang.String r5 = "Genymotion"
                boolean r0 = kotlin.text.StringsKt__IndentKt.d(r0, r5, r3, r4)
                if (r0 != 0) goto L_0x0072
                java.lang.String r0 = android.os.Build.BRAND
                java.lang.String r5 = "Build.BRAND"
                m0.n.b.i.d(r0, r5)
                boolean r0 = kotlin.text.StringsKt__IndentKt.J(r0, r2, r3, r4)
                if (r0 == 0) goto L_0x006a
                java.lang.String r0 = android.os.Build.DEVICE
                java.lang.String r5 = "Build.DEVICE"
                m0.n.b.i.d(r0, r5)
                boolean r0 = kotlin.text.StringsKt__IndentKt.J(r0, r2, r3, r4)
                if (r0 != 0) goto L_0x0072
            L_0x006a:
                java.lang.String r0 = android.os.Build.PRODUCT
                boolean r0 = m0.n.b.i.a(r1, r0)
                if (r0 == 0) goto L_0x0073
            L_0x0072:
                r3 = 1
            L_0x0073:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.init.SecurityCheck.Emulator.isEmulator():boolean");
        }

        public boolean check() {
            return isEmulator();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "", "findSuBinary", "()Z", "findSuperuserApk", "check", "<init>", "()V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SecurityCheck.kt */
    public static final class RootedCheck extends SecurityCheck {
        @Deprecated
        private static final List<String> BINARY_PATHS = g.K("/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/");
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final Warning WARNING = new Warning("SW01", "The device is jailbroken.", Warning.Severity.HIGH);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck$Companion;", "", "", "", "BINARY_PATHS", "Ljava/util/List;", "Lcom/stripe/android/stripe3ds2/init/Warning;", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SecurityCheck.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public RootedCheck() {
            super(WARNING, (f) null);
        }

        private final boolean findSuBinary() {
            List<String> list = BINARY_PATHS;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (String n02 : list) {
                if (new File(a.n0(n02, "su")).exists()) {
                    return true;
                }
            }
            return false;
        }

        private final boolean findSuperuserApk() {
            return new File(Environment.getRootDirectory().toString() + "/Superuser").isDirectory();
        }

        public boolean check() {
            return findSuBinary() || findSuperuserApk();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "", "hasValidFields", "()Z", "hasValidMethods", "check", "<init>", "()V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SecurityCheck.kt */
    public static final class Tampered extends SecurityCheck {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final Warning WARNING = new Warning("SW02", "The integrity of the SDK has been tampered.", Warning.Severity.HIGH);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered$Companion;", "", "Lcom/stripe/android/stripe3ds2/init/Warning;", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SecurityCheck.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public Tampered() {
            super(WARNING, (f) null);
        }

        private final boolean hasValidFields() {
            return StripeThreeDs2ServiceImpl.class.getDeclaredFields().length == 12;
        }

        private final boolean hasValidMethods() {
            return StripeThreeDs2ServiceImpl.class.getDeclaredMethods().length == 13;
        }

        public boolean check() {
            return !hasValidFields() || !hasValidMethods();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "", "check", "()Z", "<init>", "()V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SecurityCheck.kt */
    public static final class UnsupportedOS extends SecurityCheck {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final Warning WARNING = new Warning("SW05", "The OS or the OS version is not supported.", Warning.Severity.HIGH);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS$Companion;", "", "Lcom/stripe/android/stripe3ds2/init/Warning;", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SecurityCheck.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public UnsupportedOS() {
            super(WARNING, (f) null);
        }

        public boolean check() {
            return false;
        }
    }

    private SecurityCheck(Warning warning2) {
        this.warning = warning2;
    }

    public abstract boolean check();

    public final Warning getWarning() {
        return this.warning;
    }

    public /* synthetic */ SecurityCheck(Warning warning2, f fVar) {
        this(warning2);
    }
}
