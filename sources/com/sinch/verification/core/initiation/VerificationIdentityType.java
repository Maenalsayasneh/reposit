package com.sinch.verification.core.initiation;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import n0.c.e;

@e
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sinch/verification/core/initiation/VerificationIdentityType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "serializer", "NUMBER", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: VerificationIdentityType.kt */
public enum VerificationIdentityType {
    NUMBER("number");
    
    public static final Companion Companion = null;
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/verification/core/initiation/VerificationIdentityType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/verification/core/initiation/VerificationIdentityType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: VerificationIdentityType.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<VerificationIdentityType> serializer() {
            return VerificationIdentityType$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((f) null);
    }

    private VerificationIdentityType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
