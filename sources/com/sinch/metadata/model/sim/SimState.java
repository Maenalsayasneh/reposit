package com.sinch.metadata.model.sim;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;

@e
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/sinch/metadata/model/sim/SimState;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "serializer", "UNKNOWN", "ABSENT", "PIN_REQUIRED", "PUK_REQUIRED", "NETWORK_LOCKED", "READY", "INVALID", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: SimState.kt */
public enum SimState {
    UNKNOWN("SIM_STATE_UNKNOWN"),
    ABSENT("SIM_STATE_ABSENT"),
    PIN_REQUIRED("SIM_STATE_PIN_REQUIRED"),
    PUK_REQUIRED("SIM_STATE_PUK_REQUIRED"),
    NETWORK_LOCKED("SIM_STATE_NETWORK_LOCKED"),
    READY("SIM_STATE_READY"),
    INVALID("SIM_STATE_INVALID");
    
    public static final Companion Companion = null;
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/metadata/model/sim/SimState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/metadata/model/sim/SimState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SimState.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<SimState> serializer() {
            return SimState$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((f) null);
    }

    private SimState(String str) {
        this.value = str;
    }

    public static final SimState forKey(String str) {
        Objects.requireNonNull(Companion);
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        SimState[] values = values();
        for (int i = 0; i < 7; i++) {
            SimState simState = values[i];
            if (i.a(simState.getValue(), str)) {
                return simState;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final String getValue() {
        return this.value;
    }
}
