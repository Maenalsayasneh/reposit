package com.clubhouse.android.data.models.remote.request;

import com.clubhouse.android.data.models.remote.request.OnboardingState;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.j.c;
import n0.c.j.d;
import n0.c.k.e0;
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: GetSuggestedFollowsAllRequest.kt */
public final class GetSuggestedFollowsAllRequest {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final OnboardingState b;
    public final int c;
    public final int d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/GetSuggestedFollowsAllRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/GetSuggestedFollowsAllRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GetSuggestedFollowsAllRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GetSuggestedFollowsAllRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: GetSuggestedFollowsAllRequest.kt */
    public static final class a implements v<GetSuggestedFollowsAllRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.GetSuggestedFollowsAllRequest", aVar, 4);
            pluginGeneratedSerialDescriptor.i("in_onboarding", false);
            pluginGeneratedSerialDescriptor.i("onboarding_state", false);
            pluginGeneratedSerialDescriptor.i("page_size", false);
            pluginGeneratedSerialDescriptor.i("page", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{h.b, m0.r.t.a.r.m.a1.a.R1(OnboardingState.a.a), e0Var, e0Var};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            int i2;
            boolean z;
            int i3;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            Object obj = null;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                boolean s = c.s(serialDescriptor, 0);
                obj = c.v(serialDescriptor, 1, OnboardingState.a.a, null);
                int k = c.k(serialDescriptor, 2);
                i = c.k(serialDescriptor, 3);
                i2 = k;
                i3 = 15;
                z = s;
            } else {
                boolean z2 = false;
                i = 0;
                int i4 = 0;
                int i5 = 0;
                boolean z3 = true;
                while (z3) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z3 = false;
                    } else if (x == 0) {
                        z2 = c.s(serialDescriptor, 0);
                        i5 |= 1;
                    } else if (x == 1) {
                        obj = c.v(serialDescriptor, 1, OnboardingState.a.a, obj);
                        i5 |= 2;
                    } else if (x == 2) {
                        i4 = c.k(serialDescriptor, 2);
                        i5 |= 4;
                    } else if (x == 3) {
                        i = c.k(serialDescriptor, 3);
                        i5 |= 8;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                z = z2;
                i2 = i4;
                i3 = i5;
            }
            c.b(serialDescriptor);
            return new GetSuggestedFollowsAllRequest(i3, z, (OnboardingState) obj, i2, i);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            GetSuggestedFollowsAllRequest getSuggestedFollowsAllRequest = (GetSuggestedFollowsAllRequest) obj;
            i.e(encoder, "encoder");
            i.e(getSuggestedFollowsAllRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(getSuggestedFollowsAllRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.r(serialDescriptor, 0, getSuggestedFollowsAllRequest.a);
            c.l(serialDescriptor, 1, OnboardingState.a.a, getSuggestedFollowsAllRequest.b);
            c.q(serialDescriptor, 2, getSuggestedFollowsAllRequest.c);
            c.q(serialDescriptor, 3, getSuggestedFollowsAllRequest.d);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public GetSuggestedFollowsAllRequest(int i, boolean z, OnboardingState onboardingState, int i2, int i3) {
        if (15 == (i & 15)) {
            this.a = z;
            this.b = onboardingState;
            this.c = i2;
            this.d = i3;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 15, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSuggestedFollowsAllRequest)) {
            return false;
        }
        GetSuggestedFollowsAllRequest getSuggestedFollowsAllRequest = (GetSuggestedFollowsAllRequest) obj;
        return this.a == getSuggestedFollowsAllRequest.a && i.a(this.b, getSuggestedFollowsAllRequest.b) && this.c == getSuggestedFollowsAllRequest.c && this.d == getSuggestedFollowsAllRequest.d;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        OnboardingState onboardingState = this.b;
        return Integer.hashCode(this.d) + i0.d.a.a.a.M(this.c, (i + (onboardingState == null ? 0 : onboardingState.hashCode())) * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GetSuggestedFollowsAllRequest(inOnboarding=");
        P0.append(this.a);
        P0.append(", onboardingState=");
        P0.append(this.b);
        P0.append(", pageSize=");
        P0.append(this.c);
        P0.append(", page=");
        return i0.d.a.a.a.s0(P0, this.d, ')');
    }

    public GetSuggestedFollowsAllRequest(boolean z, OnboardingState onboardingState, int i, int i2) {
        this.a = z;
        this.b = onboardingState;
        this.c = i;
        this.d = i2;
    }
}
