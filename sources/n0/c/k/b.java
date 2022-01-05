package n0.c.k;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.d;
import m0.r.t.a.r.m.a1.a;
import n0.c.f;

/* compiled from: AbstractPolymorphicSerializer.kt */
public abstract class b<T> implements KSerializer<T> {
    public abstract d<T> a();

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        if (r1 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        r10.b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cc, code lost:
        throw new java.lang.IllegalArgumentException(("Polymorphic value has not been read for class " + ((java.lang.String) r8.c)).toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T deserialize(kotlinx.serialization.encoding.Decoder r10) {
        /*
            r9 = this;
            java.lang.String r0 = "decoder"
            m0.n.b.i.e(r10, r0)
            r0 = r9
            kotlinx.serialization.PolymorphicSerializer r0 = (kotlinx.serialization.PolymorphicSerializer) r0
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r0.a
            n0.c.j.c r10 = r10.c(r0)
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ all -> 0x00cd }
            r8.<init>()     // Catch:{ all -> 0x00cd }
            r1 = 0
            r8.c = r1     // Catch:{ all -> 0x00cd }
            boolean r2 = r10.y()     // Catch:{ all -> 0x00cd }
            if (r2 == 0) goto L_0x003a
            r1 = r9
            kotlinx.serialization.PolymorphicSerializer r1 = (kotlinx.serialization.PolymorphicSerializer) r1     // Catch:{ all -> 0x00cd }
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r1.a     // Catch:{ all -> 0x00cd }
            r3 = 0
            java.lang.String r2 = r10.t(r2, r3)     // Catch:{ all -> 0x00cd }
            n0.c.b r4 = m0.r.t.a.r.m.a1.a.q1(r9, r10, r2)     // Catch:{ all -> 0x00cd }
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r1.a     // Catch:{ all -> 0x00cd }
            r3 = 1
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r10
            java.lang.Object r1 = m0.r.t.a.r.m.a1.a.c1(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00cd }
            r10.b(r0)
            return r1
        L_0x003a:
            r2 = r9
            kotlinx.serialization.PolymorphicSerializer r2 = (kotlinx.serialization.PolymorphicSerializer) r2     // Catch:{ all -> 0x00cd }
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.a     // Catch:{ all -> 0x00cd }
            int r3 = r10.x(r2)     // Catch:{ all -> 0x00cd }
            r2 = -1
            if (r3 == r2) goto L_0x00a8
            if (r3 == 0) goto L_0x009c
            r1 = 1
            if (r3 == r1) goto L_0x0073
            kotlinx.serialization.SerializationException r10 = new kotlinx.serialization.SerializationException     // Catch:{ all -> 0x00cd }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cd }
            r0.<init>()     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = "Invalid index in polymorphic deserialization of "
            r0.append(r1)     // Catch:{ all -> 0x00cd }
            T r1 = r8.c     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            java.lang.String r1 = "unknown class"
        L_0x0060:
            r0.append(r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = "\n Expected 0, 1 or DECODE_DONE(-1), but found "
            r0.append(r1)     // Catch:{ all -> 0x00cd }
            r0.append(r3)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00cd }
            r10.<init>(r0)     // Catch:{ all -> 0x00cd }
            throw r10     // Catch:{ all -> 0x00cd }
        L_0x0073:
            T r1 = r8.c     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x0090
            r8.c = r1     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00cd }
            n0.c.b r4 = m0.r.t.a.r.m.a1.a.q1(r9, r10, r1)     // Catch:{ all -> 0x00cd }
            r1 = r9
            kotlinx.serialization.PolymorphicSerializer r1 = (kotlinx.serialization.PolymorphicSerializer) r1     // Catch:{ all -> 0x00cd }
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r1.a     // Catch:{ all -> 0x00cd }
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r10
            java.lang.Object r1 = m0.r.t.a.r.m.a1.a.c1(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00cd }
            goto L_0x003a
        L_0x0090:
            java.lang.String r10 = "Cannot read polymorphic value before its type token"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00cd }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00cd }
            r0.<init>(r10)     // Catch:{ all -> 0x00cd }
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x009c:
            r2 = r9
            kotlinx.serialization.PolymorphicSerializer r2 = (kotlinx.serialization.PolymorphicSerializer) r2     // Catch:{ all -> 0x00cd }
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.a     // Catch:{ all -> 0x00cd }
            java.lang.String r2 = r10.t(r2, r3)     // Catch:{ all -> 0x00cd }
            r8.c = r2     // Catch:{ all -> 0x00cd }
            goto L_0x003a
        L_0x00a8:
            if (r1 == 0) goto L_0x00ae
            r10.b(r0)
            return r1
        L_0x00ae:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cd }
            r10.<init>()     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "Polymorphic value has not been read for class "
            r10.append(r0)     // Catch:{ all -> 0x00cd }
            T r0 = r8.c     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00cd }
            r10.append(r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00cd }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00cd }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00cd }
            r0.<init>(r10)     // Catch:{ all -> 0x00cd }
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.k.b.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    public final void serialize(Encoder encoder, T t) {
        i.e(encoder, "encoder");
        i.e(t, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        f r1 = a.r1(this, encoder, t);
        SerialDescriptor serialDescriptor = ((PolymorphicSerializer) this).a;
        n0.c.j.d c = encoder.c(serialDescriptor);
        c.s(((PolymorphicSerializer) this).a, 0, r1.getDescriptor().a());
        c.z(((PolymorphicSerializer) this).a, 1, r1, t);
        c.b(serialDescriptor);
    }
}
