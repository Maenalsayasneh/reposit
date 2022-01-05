package com.clubhouse.android.data.models.remote.request;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.e.b.b3.a.b.c.h;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.j.d;
import n0.c.k.e0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: OnboardingRequest.kt */
public final class OnboardingState {
    public static final Companion Companion = new Companion((f) null);
    public final List<SourceLocation> a;
    public final List<Integer> b;
    public final List<Integer> c;
    public final List<Integer> d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/OnboardingState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/OnboardingState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: OnboardingRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<OnboardingState> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: OnboardingRequest.kt */
    public static final class a implements v<OnboardingState> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.OnboardingState", aVar, 4);
            pluginGeneratedSerialDescriptor.i("screens_seen", true);
            pluginGeneratedSerialDescriptor.i("topic_ids_selected", true);
            pluginGeneratedSerialDescriptor.i("club_ids_followed", true);
            pluginGeneratedSerialDescriptor.i("user_ids_followed", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{new n0.c.k.e(h.a), new n0.c.k.e(e0Var), new n0.c.k.e(e0Var), new n0.c.k.e(e0Var)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r14) {
            /*
                r13 = this;
                java.lang.String r0 = "decoder"
                m0.n.b.i.e(r14, r0)
                kotlinx.serialization.descriptors.SerialDescriptor r0 = b
                n0.c.j.c r14 = r14.c(r0)
                boolean r1 = r14.y()
                r2 = 3
                r3 = 0
                r4 = 0
                r5 = 1
                r6 = 2
                if (r1 == 0) goto L_0x0044
                n0.c.k.e r1 = new n0.c.k.e
                i0.e.b.b3.a.b.c.h r7 = i0.e.b.b3.a.b.c.h.a
                r1.<init>(r7)
                java.lang.Object r1 = r14.m(r0, r4, r1, r3)
                n0.c.k.e r4 = new n0.c.k.e
                n0.c.k.e0 r7 = n0.c.k.e0.b
                r4.<init>(r7)
                java.lang.Object r4 = r14.m(r0, r5, r4, r3)
                n0.c.k.e r5 = new n0.c.k.e
                r5.<init>(r7)
                java.lang.Object r5 = r14.m(r0, r6, r5, r3)
                n0.c.k.e r6 = new n0.c.k.e
                r6.<init>(r7)
                java.lang.Object r2 = r14.m(r0, r2, r6, r3)
                r3 = 15
                r9 = r4
                r4 = r3
                goto L_0x009f
            L_0x0044:
                r1 = r3
                r7 = r1
                r8 = r7
                r9 = r8
                r3 = r4
                r10 = r5
            L_0x004a:
                if (r10 == 0) goto L_0x009b
                int r11 = r14.x(r0)
                r12 = -1
                if (r11 == r12) goto L_0x0099
                if (r11 == 0) goto L_0x008b
                if (r11 == r5) goto L_0x007d
                if (r11 == r6) goto L_0x006f
                if (r11 != r2) goto L_0x0069
                n0.c.k.e r11 = new n0.c.k.e
                n0.c.k.e0 r12 = n0.c.k.e0.b
                r11.<init>(r12)
                java.lang.Object r7 = r14.m(r0, r2, r11, r7)
                r3 = r3 | 8
                goto L_0x004a
            L_0x0069:
                kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
                r14.<init>(r11)
                throw r14
            L_0x006f:
                n0.c.k.e r11 = new n0.c.k.e
                n0.c.k.e0 r12 = n0.c.k.e0.b
                r11.<init>(r12)
                java.lang.Object r1 = r14.m(r0, r6, r11, r1)
                r3 = r3 | 4
                goto L_0x004a
            L_0x007d:
                n0.c.k.e r11 = new n0.c.k.e
                n0.c.k.e0 r12 = n0.c.k.e0.b
                r11.<init>(r12)
                java.lang.Object r9 = r14.m(r0, r5, r11, r9)
                r3 = r3 | 2
                goto L_0x004a
            L_0x008b:
                n0.c.k.e r11 = new n0.c.k.e
                i0.e.b.b3.a.b.c.h r12 = i0.e.b.b3.a.b.c.h.a
                r11.<init>(r12)
                java.lang.Object r8 = r14.m(r0, r4, r11, r8)
                r3 = r3 | 1
                goto L_0x004a
            L_0x0099:
                r10 = r4
                goto L_0x004a
            L_0x009b:
                r5 = r1
                r4 = r3
                r2 = r7
                r1 = r8
            L_0x009f:
                r14.b(r0)
                com.clubhouse.android.data.models.remote.request.OnboardingState r14 = new com.clubhouse.android.data.models.remote.request.OnboardingState
                r0 = r1
                java.util.List r0 = (java.util.List) r0
                r6 = r9
                java.util.List r6 = (java.util.List) r6
                r7 = r5
                java.util.List r7 = (java.util.List) r7
                r8 = r2
                java.util.List r8 = (java.util.List) r8
                r3 = r14
                r5 = r0
                r3.<init>((int) r4, (java.util.List) r5, (java.util.List) r6, (java.util.List) r7, (java.util.List) r8)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.request.OnboardingState.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            OnboardingState onboardingState = (OnboardingState) obj;
            i.e(encoder, "encoder");
            i.e(onboardingState, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(onboardingState, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || !i.a(onboardingState.a, EmptyList.c)) {
                c.z(serialDescriptor, 0, new n0.c.k.e(h.a), onboardingState.a);
            }
            if (c.v(serialDescriptor, 1) || !i.a(onboardingState.b, EmptyList.c)) {
                c.z(serialDescriptor, 1, new n0.c.k.e(e0.b), onboardingState.b);
            }
            if (c.v(serialDescriptor, 2) || !i.a(onboardingState.c, EmptyList.c)) {
                c.z(serialDescriptor, 2, new n0.c.k.e(e0.b), onboardingState.c);
            }
            if (c.v(serialDescriptor, 3) || !i.a(onboardingState.d, EmptyList.c)) {
                z = true;
            }
            if (z) {
                c.z(serialDescriptor, 3, new n0.c.k.e(e0.b), onboardingState.d);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public OnboardingState() {
        this((List) null, (List) null, (List) null, (List) null, 15);
    }

    public OnboardingState(int i, List<SourceLocation> list, List list2, List list3, List list4) {
        if ((i & 0) == 0) {
            this.a = (i & 1) == 0 ? EmptyList.c : list;
            if ((i & 2) == 0) {
                this.b = EmptyList.c;
            } else {
                this.b = list2;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.c;
            } else {
                this.c = list3;
            }
            if ((i & 8) == 0) {
                this.d = EmptyList.c;
            } else {
                this.d = list4;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        }
    }

    public static OnboardingState a(OnboardingState onboardingState, List<SourceLocation> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, int i) {
        if ((i & 1) != 0) {
            list = onboardingState.a;
        }
        if ((i & 2) != 0) {
            list2 = onboardingState.b;
        }
        if ((i & 4) != 0) {
            list3 = onboardingState.c;
        }
        if ((i & 8) != 0) {
            list4 = onboardingState.d;
        }
        Objects.requireNonNull(onboardingState);
        i.e(list, "screensSeen");
        i.e(list2, "topicIdsSelected");
        i.e(list3, "clubIdsFollowed");
        i.e(list4, "userIdsFollowed");
        return new OnboardingState(list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingState)) {
            return false;
        }
        OnboardingState onboardingState = (OnboardingState) obj;
        return i.a(this.a, onboardingState.a) && i.a(this.b, onboardingState.b) && i.a(this.c, onboardingState.c) && i.a(this.d, onboardingState.d);
    }

    public int hashCode() {
        return this.d.hashCode() + i0.d.a.a.a.H(this.c, i0.d.a.a.a.H(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("OnboardingState(screensSeen=");
        P0.append(this.a);
        P0.append(", topicIdsSelected=");
        P0.append(this.b);
        P0.append(", clubIdsFollowed=");
        P0.append(this.c);
        P0.append(", userIdsFollowed=");
        return i0.d.a.a.a.A0(P0, this.d, ')');
    }

    public OnboardingState(List<? extends SourceLocation> list, List<Integer> list2, List<Integer> list3, List<Integer> list4) {
        i.e(list, "screensSeen");
        i.e(list2, "topicIdsSelected");
        i.e(list3, "clubIdsFollowed");
        i.e(list4, "userIdsFollowed");
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OnboardingState(List list, List list2, List list3, List list4, int i) {
        this((i & 1) != 0 ? EmptyList.c : null, (i & 2) != 0 ? EmptyList.c : null, (i & 4) != 0 ? EmptyList.c : null, (i & 8) != 0 ? EmptyList.c : null);
    }
}
