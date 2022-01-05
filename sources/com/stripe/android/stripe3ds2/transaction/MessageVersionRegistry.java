package com.stripe.android.stripe3ds2.transaction;

import i0.j.f.p.h;
import java.util.Set;
import kotlin.Metadata;
import m0.j.g;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\t\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "", "", "messageVersion", "", "isSupported", "(Ljava/lang/String;)Z", "getCurrent", "()Ljava/lang/String;", "current", "<init>", "()V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: MessageVersionRegistry.kt */
public final class MessageVersionRegistry {
    @Deprecated
    private static final String CURRENT = "2.1.0";
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final Set<String> SUPPORTED = h.N3(CURRENT);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry$Companion;", "", "", "CURRENT", "Ljava/lang/String;", "", "SUPPORTED", "Ljava/util/Set;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: MessageVersionRegistry.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public final String getCurrent() {
        return CURRENT;
    }

    public final boolean isSupported(String str) {
        return g.f(SUPPORTED, str);
    }
}
