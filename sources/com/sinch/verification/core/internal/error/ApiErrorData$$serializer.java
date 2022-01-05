package com.sinch.verification.core.internal.error;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.j.c;
import n0.c.j.d;
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/sinch/verification/core/internal/error/ApiErrorData.$serializer", "Ln0/c/k/v;", "Lcom/sinch/verification/core/internal/error/ApiErrorData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lm0/i;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sinch/verification/core/internal/error/ApiErrorData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sinch/verification/core/internal/error/ApiErrorData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: ApiErrorData.kt */
public final class ApiErrorData$$serializer implements v<ApiErrorData> {
    private static final /* synthetic */ SerialDescriptor $$serialDesc;
    public static final ApiErrorData$$serializer INSTANCE;

    static {
        ApiErrorData$$serializer apiErrorData$$serializer = new ApiErrorData$$serializer();
        INSTANCE = apiErrorData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sinch.verification.core.internal.error.ApiErrorData", apiErrorData$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("errorCode", true);
        pluginGeneratedSerialDescriptor.i(InstabugDbContract.BugEntry.COLUMN_MESSAGE, true);
        pluginGeneratedSerialDescriptor.i("reference", true);
        $$serialDesc = pluginGeneratedSerialDescriptor;
    }

    private ApiErrorData$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        g1 g1Var = g1.b;
        return new KSerializer[]{a.R1(e0.b), a.R1(g1Var), a.R1(g1Var)};
    }

    public ApiErrorData deserialize(Decoder decoder) {
        String str;
        int i;
        String str2;
        Integer num;
        i.e(decoder, "decoder");
        SerialDescriptor serialDescriptor = $$serialDesc;
        c c = decoder.c(serialDescriptor);
        Integer num2 = null;
        if (!c.y()) {
            String str3 = null;
            String str4 = null;
            int i2 = 0;
            while (true) {
                int x = c.x(serialDescriptor);
                if (x == -1) {
                    str = str3;
                    num = num2;
                    str2 = str4;
                    i = i2;
                    break;
                } else if (x == 0) {
                    num2 = (Integer) c.v(serialDescriptor, 0, e0.b, num2);
                    i2 |= 1;
                } else if (x == 1) {
                    str3 = (String) c.v(serialDescriptor, 1, g1.b, str3);
                    i2 |= 2;
                } else if (x == 2) {
                    str4 = (String) c.v(serialDescriptor, 2, g1.b, str4);
                    i2 |= 4;
                } else {
                    throw new UnknownFieldException(x);
                }
            }
        } else {
            num = (Integer) c.v(serialDescriptor, 0, e0.b, null);
            g1 g1Var = g1.b;
            str = (String) c.v(serialDescriptor, 1, g1Var, null);
            str2 = (String) c.v(serialDescriptor, 2, g1Var, null);
            i = Integer.MAX_VALUE;
        }
        c.b(serialDescriptor);
        return new ApiErrorData(i, num, str, str2);
    }

    public SerialDescriptor getDescriptor() {
        return $$serialDesc;
    }

    public void serialize(Encoder encoder, ApiErrorData apiErrorData) {
        i.e(encoder, "encoder");
        i.e(apiErrorData, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        SerialDescriptor serialDescriptor = $$serialDesc;
        d c = encoder.c(serialDescriptor);
        i.e(apiErrorData, "self");
        i.e(c, "output");
        i.e(serialDescriptor, "serialDesc");
        if ((!i.a(apiErrorData.a, (Object) null)) || c.v(serialDescriptor, 0)) {
            c.l(serialDescriptor, 0, e0.b, apiErrorData.a);
        }
        if ((!i.a(apiErrorData.b, (Object) null)) || c.v(serialDescriptor, 1)) {
            c.l(serialDescriptor, 1, g1.b, apiErrorData.b);
        }
        if ((!i.a(apiErrorData.c, (Object) null)) || c.v(serialDescriptor, 2)) {
            c.l(serialDescriptor, 2, g1.b, apiErrorData.c);
        }
        c.b(serialDescriptor);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return v0.a;
    }
}
