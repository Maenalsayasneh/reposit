package com.stripe.android.stripe3ds2.transaction;

import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "", "<init>", "()V", "Cancel", "HtmlForm", "NativeForm", "Oob", "Resend", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$NativeForm;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$HtmlForm;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Oob;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Resend;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Cancel;", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeAction.kt */
public abstract class ChallengeAction {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Cancel;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeAction.kt */
    public static final class Cancel extends ChallengeAction {
        public static final Cancel INSTANCE = new Cancel();

        private Cancel() {
            super((f) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$HtmlForm;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "", "component1$3ds2sdk_release", "()Ljava/lang/String;", "component1", "userEntry", "copy", "(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$HtmlForm;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserEntry$3ds2sdk_release", "<init>", "(Ljava/lang/String;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeAction.kt */
    public static final class HtmlForm extends ChallengeAction {
        private final String userEntry;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HtmlForm(String str) {
            super((f) null);
            i.e(str, "userEntry");
            this.userEntry = str;
        }

        public static /* synthetic */ HtmlForm copy$default(HtmlForm htmlForm, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = htmlForm.userEntry;
            }
            return htmlForm.copy(str);
        }

        public final String component1$3ds2sdk_release() {
            return this.userEntry;
        }

        public final HtmlForm copy(String str) {
            i.e(str, "userEntry");
            return new HtmlForm(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof HtmlForm) && i.a(this.userEntry, ((HtmlForm) obj).userEntry);
            }
            return true;
        }

        public final String getUserEntry$3ds2sdk_release() {
            return this.userEntry;
        }

        public int hashCode() {
            String str = this.userEntry;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.y0(a.P0("HtmlForm(userEntry="), this.userEntry, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$NativeForm;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "", "component1$3ds2sdk_release", "()Ljava/lang/String;", "component1", "userEntry", "copy", "(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$NativeForm;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserEntry$3ds2sdk_release", "<init>", "(Ljava/lang/String;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeAction.kt */
    public static final class NativeForm extends ChallengeAction {
        private final String userEntry;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NativeForm(String str) {
            super((f) null);
            i.e(str, "userEntry");
            this.userEntry = str;
        }

        public static /* synthetic */ NativeForm copy$default(NativeForm nativeForm, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nativeForm.userEntry;
            }
            return nativeForm.copy(str);
        }

        public final String component1$3ds2sdk_release() {
            return this.userEntry;
        }

        public final NativeForm copy(String str) {
            i.e(str, "userEntry");
            return new NativeForm(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof NativeForm) && i.a(this.userEntry, ((NativeForm) obj).userEntry);
            }
            return true;
        }

        public final String getUserEntry$3ds2sdk_release() {
            return this.userEntry;
        }

        public int hashCode() {
            String str = this.userEntry;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.y0(a.P0("NativeForm(userEntry="), this.userEntry, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Oob;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeAction.kt */
    public static final class Oob extends ChallengeAction {
        public static final Oob INSTANCE = new Oob();

        private Oob() {
            super((f) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Resend;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeAction.kt */
    public static final class Resend extends ChallengeAction {
        public static final Resend INSTANCE = new Resend();

        private Resend() {
            super((f) null);
        }
    }

    private ChallengeAction() {
    }

    public /* synthetic */ ChallengeAction(f fVar) {
        this();
    }
}
