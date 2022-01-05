package com.clubhouse.pubsub.user.wave.models;

import i0.e.d.b.b.b;
import i0.e.d.b.c.a.a;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import n0.c.e;

@e(with = a.class)
/* compiled from: WavePubSubMessage.kt */
public abstract class WavePubSubMessage implements b {
    public static final Companion Companion = new Companion((f) null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/wave/models/WavePubSubMessage$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/wave/models/WavePubSubMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: WavePubSubMessage.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<WavePubSubMessage> serializer() {
            return a.c;
        }

        public Companion(f fVar) {
        }
    }

    public WavePubSubMessage() {
    }

    public WavePubSubMessage(f fVar) {
    }
}
