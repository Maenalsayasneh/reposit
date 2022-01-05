package com.sinch.metadata.model;

import android.os.Build;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.sinch.metadata.model.network.NetworkInfo$$serializer;
import com.sinch.metadata.model.sim.SimCardInfo;
import com.sinch.metadata.model.sim.SimState$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.j.d;
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/sinch/metadata/model/PhoneMetadata.$serializer", "Ln0/c/k/v;", "Lcom/sinch/metadata/model/PhoneMetadata;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lm0/i;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sinch/metadata/model/PhoneMetadata;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sinch/metadata/model/PhoneMetadata;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: PhoneMetadata.kt */
public final class PhoneMetadata$$serializer implements v<PhoneMetadata> {
    private static final /* synthetic */ SerialDescriptor $$serialDesc;
    public static final PhoneMetadata$$serializer INSTANCE;

    static {
        PhoneMetadata$$serializer phoneMetadata$$serializer = new PhoneMetadata$$serializer();
        INSTANCE = phoneMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sinch.metadata.model.PhoneMetadata", phoneMetadata$$serializer, 13);
        pluginGeneratedSerialDescriptor.i("os", true);
        pluginGeneratedSerialDescriptor.i("platform", true);
        pluginGeneratedSerialDescriptor.i("sdk", false);
        pluginGeneratedSerialDescriptor.i("buildFlavor", false);
        pluginGeneratedSerialDescriptor.i("device", false);
        pluginGeneratedSerialDescriptor.i("simCardsInfo", false);
        pluginGeneratedSerialDescriptor.i("simState", false);
        pluginGeneratedSerialDescriptor.i("defaultLocale", false);
        pluginGeneratedSerialDescriptor.i("permissions", false);
        pluginGeneratedSerialDescriptor.i("networkInfo", false);
        pluginGeneratedSerialDescriptor.i("batteryLevel", false);
        pluginGeneratedSerialDescriptor.i("version", true);
        pluginGeneratedSerialDescriptor.i("simCardCount", true);
        $$serialDesc = pluginGeneratedSerialDescriptor;
    }

    private PhoneMetadata$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        g1 g1Var = g1.b;
        e0 e0Var = e0.b;
        return new KSerializer[]{g1Var, g1Var, g1Var, g1Var, DeviceMetadata$$serializer.INSTANCE, a.R1(i0.n.b.b.a.a.b), SimState$$serializer.INSTANCE, g1Var, PermissionsMetadata$$serializer.INSTANCE, NetworkInfo$$serializer.INSTANCE, g1Var, e0Var, a.R1(e0Var)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: com.sinch.metadata.model.DeviceMetadata} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: com.sinch.metadata.model.sim.SimState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.sinch.metadata.model.PermissionsMetadata} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.sinch.metadata.model.network.NetworkInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Integer} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0148, code lost:
        r4 = 11;
        r5 = 10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sinch.metadata.model.PhoneMetadata deserialize(kotlinx.serialization.encoding.Decoder r39) {
        /*
            r38 = this;
            r0 = r39
            java.lang.String r1 = "decoder"
            m0.n.b.i.e(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = $$serialDesc
            n0.c.j.c r0 = r0.c(r1)
            boolean r2 = r0.y()
            r4 = 11
            r5 = 10
            r6 = 9
            r7 = 7
            r8 = 6
            r9 = 5
            r10 = 3
            r11 = 8
            r12 = 4
            r13 = 2
            r14 = 1
            r15 = 0
            r3 = 0
            if (r2 == 0) goto L_0x0095
            java.lang.String r2 = r0.t(r1, r15)
            java.lang.String r14 = r0.t(r1, r14)
            java.lang.String r13 = r0.t(r1, r13)
            java.lang.String r10 = r0.t(r1, r10)
            com.sinch.metadata.model.DeviceMetadata$$serializer r15 = com.sinch.metadata.model.DeviceMetadata$$serializer.INSTANCE
            java.lang.Object r12 = r0.m(r1, r12, r15, r3)
            com.sinch.metadata.model.DeviceMetadata r12 = (com.sinch.metadata.model.DeviceMetadata) r12
            i0.n.b.b.a.a r15 = i0.n.b.b.a.a.b
            java.lang.Object r9 = r0.v(r1, r9, r15, r3)
            java.util.List r9 = (java.util.List) r9
            com.sinch.metadata.model.sim.SimState$$serializer r15 = com.sinch.metadata.model.sim.SimState$$serializer.INSTANCE
            java.lang.Object r8 = r0.m(r1, r8, r15, r3)
            com.sinch.metadata.model.sim.SimState r8 = (com.sinch.metadata.model.sim.SimState) r8
            java.lang.String r7 = r0.t(r1, r7)
            com.sinch.metadata.model.PermissionsMetadata$$serializer r15 = com.sinch.metadata.model.PermissionsMetadata$$serializer.INSTANCE
            java.lang.Object r11 = r0.m(r1, r11, r15, r3)
            com.sinch.metadata.model.PermissionsMetadata r11 = (com.sinch.metadata.model.PermissionsMetadata) r11
            com.sinch.metadata.model.network.NetworkInfo$$serializer r15 = com.sinch.metadata.model.network.NetworkInfo$$serializer.INSTANCE
            java.lang.Object r6 = r0.m(r1, r6, r15, r3)
            com.sinch.metadata.model.network.NetworkInfo r6 = (com.sinch.metadata.model.network.NetworkInfo) r6
            java.lang.String r5 = r0.t(r1, r5)
            int r4 = r0.k(r1, r4)
            n0.c.k.e0 r15 = n0.c.k.e0.b
            r16 = r14
            r14 = 12
            java.lang.Object r3 = r0.v(r1, r14, r15, r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r14 = 2147483647(0x7fffffff, float:NaN)
            r25 = r2
            r37 = r3
            r36 = r4
            r35 = r5
            r34 = r6
            r32 = r7
            r31 = r8
            r30 = r9
            r28 = r10
            r33 = r11
            r29 = r12
            r27 = r13
            r24 = r14
            r26 = r16
            goto L_0x016a
        L_0x0095:
            r2 = r14
            r14 = 12
            r2 = r3
            r9 = r2
            r10 = r9
            r12 = r10
            r13 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r20 = r18
            r21 = r20
            r8 = r15
            r22 = r8
            r15 = r21
        L_0x00ac:
            int r7 = r0.x(r1)
            switch(r7) {
                case -1: goto L_0x014e;
                case 0: goto L_0x013c;
                case 1: goto L_0x0132;
                case 2: goto L_0x0128;
                case 3: goto L_0x011e;
                case 4: goto L_0x010f;
                case 5: goto L_0x0101;
                case 6: goto L_0x00f3;
                case 7: goto L_0x00eb;
                case 8: goto L_0x00df;
                case 9: goto L_0x00d3;
                case 10: goto L_0x00cc;
                case 11: goto L_0x00c5;
                case 12: goto L_0x00b9;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r7)
            throw r0
        L_0x00b9:
            n0.c.k.e0 r7 = n0.c.k.e0.b
            java.lang.Object r7 = r0.v(r1, r14, r7, r9)
            r9 = r7
            java.lang.Integer r9 = (java.lang.Integer) r9
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            goto L_0x00ac
        L_0x00c5:
            int r22 = r0.k(r1, r4)
            r8 = r8 | 2048(0x800, float:2.87E-42)
            goto L_0x00ac
        L_0x00cc:
            java.lang.String r21 = r0.t(r1, r5)
            r8 = r8 | 1024(0x400, float:1.435E-42)
            goto L_0x00ac
        L_0x00d3:
            com.sinch.metadata.model.network.NetworkInfo$$serializer r7 = com.sinch.metadata.model.network.NetworkInfo$$serializer.INSTANCE
            java.lang.Object r7 = r0.m(r1, r6, r7, r12)
            r12 = r7
            com.sinch.metadata.model.network.NetworkInfo r12 = (com.sinch.metadata.model.network.NetworkInfo) r12
            r8 = r8 | 512(0x200, float:7.175E-43)
            goto L_0x00ac
        L_0x00df:
            com.sinch.metadata.model.PermissionsMetadata$$serializer r7 = com.sinch.metadata.model.PermissionsMetadata$$serializer.INSTANCE
            java.lang.Object r7 = r0.m(r1, r11, r7, r10)
            r10 = r7
            com.sinch.metadata.model.PermissionsMetadata r10 = (com.sinch.metadata.model.PermissionsMetadata) r10
            r8 = r8 | 256(0x100, float:3.59E-43)
            goto L_0x00ac
        L_0x00eb:
            r7 = 7
            java.lang.String r20 = r0.t(r1, r7)
            r8 = r8 | 128(0x80, float:1.794E-43)
            goto L_0x00ac
        L_0x00f3:
            r7 = 7
            com.sinch.metadata.model.sim.SimState$$serializer r4 = com.sinch.metadata.model.sim.SimState$$serializer.INSTANCE
            r5 = 6
            java.lang.Object r4 = r0.m(r1, r5, r4, r13)
            r13 = r4
            com.sinch.metadata.model.sim.SimState r13 = (com.sinch.metadata.model.sim.SimState) r13
            r8 = r8 | 64
            goto L_0x0148
        L_0x0101:
            r5 = 6
            r7 = 7
            i0.n.b.b.a.a r4 = i0.n.b.b.a.a.b
            r5 = 5
            java.lang.Object r2 = r0.v(r1, r5, r4, r2)
            java.util.List r2 = (java.util.List) r2
            r8 = r8 | 32
            goto L_0x0148
        L_0x010f:
            r5 = 5
            r7 = 7
            com.sinch.metadata.model.DeviceMetadata$$serializer r4 = com.sinch.metadata.model.DeviceMetadata$$serializer.INSTANCE
            r5 = 4
            java.lang.Object r4 = r0.m(r1, r5, r4, r15)
            r15 = r4
            com.sinch.metadata.model.DeviceMetadata r15 = (com.sinch.metadata.model.DeviceMetadata) r15
            r8 = r8 | 16
            goto L_0x0148
        L_0x011e:
            r4 = 3
            r5 = 4
            r7 = 7
            java.lang.String r18 = r0.t(r1, r4)
            r8 = r8 | 8
            goto L_0x0148
        L_0x0128:
            r4 = 2
            r5 = 4
            r7 = 7
            java.lang.String r17 = r0.t(r1, r4)
            r8 = r8 | 4
            goto L_0x0148
        L_0x0132:
            r4 = 1
            r5 = 4
            r7 = 7
            java.lang.String r16 = r0.t(r1, r4)
            r8 = r8 | 2
            goto L_0x0148
        L_0x013c:
            r3 = 0
            r4 = 1
            r5 = 4
            r7 = 7
            java.lang.String r19 = r0.t(r1, r3)
            r8 = r8 | 1
            r3 = r19
        L_0x0148:
            r4 = 11
            r5 = 10
            goto L_0x00ac
        L_0x014e:
            r30 = r2
            r25 = r3
            r24 = r8
            r37 = r9
            r33 = r10
            r34 = r12
            r31 = r13
            r29 = r15
            r26 = r16
            r27 = r17
            r28 = r18
            r32 = r20
            r35 = r21
            r36 = r22
        L_0x016a:
            r0.b(r1)
            com.sinch.metadata.model.PhoneMetadata r0 = new com.sinch.metadata.model.PhoneMetadata
            r23 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sinch.metadata.model.PhoneMetadata$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.sinch.metadata.model.PhoneMetadata");
    }

    public SerialDescriptor getDescriptor() {
        return $$serialDesc;
    }

    public void serialize(Encoder encoder, PhoneMetadata phoneMetadata) {
        i.e(encoder, "encoder");
        i.e(phoneMetadata, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        SerialDescriptor serialDescriptor = $$serialDesc;
        d c = encoder.c(serialDescriptor);
        i.e(phoneMetadata, "self");
        i.e(c, "output");
        i.e(serialDescriptor, "serialDesc");
        String str = phoneMetadata.c;
        String str2 = Build.VERSION.RELEASE;
        i.d(str2, "Build.VERSION.RELEASE");
        boolean z = false;
        if ((!i.a(str, str2)) || c.v(serialDescriptor, 0)) {
            c.s(serialDescriptor, 0, phoneMetadata.c);
        }
        if ((!i.a(phoneMetadata.d, "Android")) || c.v(serialDescriptor, 1)) {
            c.s(serialDescriptor, 1, phoneMetadata.d);
        }
        c.s(serialDescriptor, 2, phoneMetadata.e);
        c.s(serialDescriptor, 3, phoneMetadata.f);
        c.z(serialDescriptor, 4, DeviceMetadata$$serializer.INSTANCE, phoneMetadata.g);
        c.l(serialDescriptor, 5, i0.n.b.b.a.a.b, phoneMetadata.h);
        c.z(serialDescriptor, 6, SimState$$serializer.INSTANCE, phoneMetadata.i);
        c.s(serialDescriptor, 7, phoneMetadata.j);
        c.z(serialDescriptor, 8, PermissionsMetadata$$serializer.INSTANCE, phoneMetadata.k);
        c.z(serialDescriptor, 9, NetworkInfo$$serializer.INSTANCE, phoneMetadata.l);
        c.s(serialDescriptor, 10, phoneMetadata.m);
        if (phoneMetadata.a != 2) {
            z = true;
        }
        if (z || c.v(serialDescriptor, 11)) {
            c.q(serialDescriptor, 11, phoneMetadata.a);
        }
        Integer num = phoneMetadata.b;
        List<SimCardInfo> list = phoneMetadata.h;
        if ((!i.a(num, list != null ? Integer.valueOf(list.size()) : null)) || c.v(serialDescriptor, 12)) {
            c.l(serialDescriptor, 12, e0.b, phoneMetadata.b);
        }
        c.b(serialDescriptor);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return v0.a;
    }
}
