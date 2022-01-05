package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import i0.f.a.c.t.r;
import java.io.IOException;

@a
public class TokenBufferSerializer extends StdSerializer<r> {
    public TokenBufferSerializer() {
        super(r.class);
    }

    public /* bridge */ /* synthetic */ void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
        v((r) obj, jsonGenerator);
    }

    public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        r rVar = (r) obj;
        WritableTypeId e = eVar.e(jsonGenerator, eVar.d(rVar, JsonToken.VALUE_EMBEDDED_OBJECT));
        v(rVar, jsonGenerator);
        eVar.f(jsonGenerator, e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0034 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(i0.f.a.c.t.r r8, com.fasterxml.jackson.core.JsonGenerator r9) throws java.io.IOException {
        /*
            r7 = this;
            i0.f.a.c.t.r$b r0 = r8.e2
            boolean r8 = r8.c2
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L_0x0013
            java.util.TreeMap<java.lang.Integer, java.lang.Object> r3 = r0.e
            if (r3 == 0) goto L_0x000e
            r3 = r1
            goto L_0x000f
        L_0x000e:
            r3 = r2
        L_0x000f:
            if (r3 == 0) goto L_0x0013
            r3 = r1
            goto L_0x0014
        L_0x0013:
            r3 = r2
        L_0x0014:
            r4 = -1
        L_0x0015:
            int r4 = r4 + r1
            r5 = 16
            if (r4 < r5) goto L_0x002e
            i0.f.a.c.t.r$b r0 = r0.b
            if (r0 != 0) goto L_0x001f
            goto L_0x0034
        L_0x001f:
            if (r8 == 0) goto L_0x002c
            java.util.TreeMap<java.lang.Integer, java.lang.Object> r3 = r0.e
            if (r3 == 0) goto L_0x0027
            r3 = r1
            goto L_0x0028
        L_0x0027:
            r3 = r2
        L_0x0028:
            if (r3 == 0) goto L_0x002c
            r3 = r1
            goto L_0x002d
        L_0x002c:
            r3 = r2
        L_0x002d:
            r4 = r2
        L_0x002e:
            com.fasterxml.jackson.core.JsonToken r5 = r0.k(r4)
            if (r5 != 0) goto L_0x0035
        L_0x0034:
            return
        L_0x0035:
            if (r3 == 0) goto L_0x0049
            java.lang.Object r6 = r0.f(r4)
            if (r6 == 0) goto L_0x0040
            r9.v0(r6)
        L_0x0040:
            java.lang.Object r6 = r0.g(r4)
            if (r6 == 0) goto L_0x0049
            r9.S0(r6)
        L_0x0049:
            int r5 = r5.ordinal()
            switch(r5) {
                case 1: goto L_0x0170;
                case 2: goto L_0x016b;
                case 3: goto L_0x0166;
                case 4: goto L_0x0161;
                case 5: goto L_0x014b;
                case 6: goto L_0x0114;
                case 7: goto L_0x00fe;
                case 8: goto L_0x00b7;
                case 9: goto L_0x0064;
                case 10: goto L_0x0060;
                case 11: goto L_0x005c;
                case 12: goto L_0x0058;
                default: goto L_0x0050;
            }
        L_0x0050:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Internal error: should never end up through this code path"
            r8.<init>(r9)
            throw r8
        L_0x0058:
            r9.c0()
            goto L_0x0015
        L_0x005c:
            r9.O(r2)
            goto L_0x0015
        L_0x0060:
            r9.O(r1)
            goto L_0x0015
        L_0x0064:
            java.lang.Object[] r5 = r0.d
            r5 = r5[r4]
            boolean r6 = r5 instanceof java.lang.Double
            if (r6 == 0) goto L_0x0076
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            r9.d0(r5)
            goto L_0x0015
        L_0x0076:
            boolean r6 = r5 instanceof java.math.BigDecimal
            if (r6 == 0) goto L_0x0080
            java.math.BigDecimal r5 = (java.math.BigDecimal) r5
            r9.n0(r5)
            goto L_0x0015
        L_0x0080:
            boolean r6 = r5 instanceof java.lang.Float
            if (r6 == 0) goto L_0x008e
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r9.f0(r5)
            goto L_0x0015
        L_0x008e:
            if (r5 != 0) goto L_0x0094
            r9.c0()
            goto L_0x0015
        L_0x0094:
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L_0x009f
            java.lang.String r5 = (java.lang.String) r5
            r9.m0(r5)
            goto L_0x0015
        L_0x009f:
            com.fasterxml.jackson.core.JsonGenerationException r8 = new com.fasterxml.jackson.core.JsonGenerationException
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getName()
            r0[r2] = r1
            java.lang.String r1 = "Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r8.<init>(r0, r9)
            throw r8
        L_0x00b7:
            java.lang.Object[] r5 = r0.d
            r5 = r5[r4]
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x00ca
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r9.g0(r5)
            goto L_0x0015
        L_0x00ca:
            boolean r6 = r5 instanceof java.math.BigInteger
            if (r6 == 0) goto L_0x00d5
            java.math.BigInteger r5 = (java.math.BigInteger) r5
            r9.p0(r5)
            goto L_0x0015
        L_0x00d5:
            boolean r6 = r5 instanceof java.lang.Long
            if (r6 == 0) goto L_0x00e4
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r9.i0(r5)
            goto L_0x0015
        L_0x00e4:
            boolean r6 = r5 instanceof java.lang.Short
            if (r6 == 0) goto L_0x00f3
            java.lang.Short r5 = (java.lang.Short) r5
            short r5 = r5.shortValue()
            r9.r0(r5)
            goto L_0x0015
        L_0x00f3:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r9.g0(r5)
            goto L_0x0015
        L_0x00fe:
            java.lang.Object[] r5 = r0.d
            r5 = r5[r4]
            boolean r6 = r5 instanceof i0.f.a.b.f
            if (r6 == 0) goto L_0x010d
            i0.f.a.b.f r5 = (i0.f.a.b.f) r5
            r9.P0(r5)
            goto L_0x0015
        L_0x010d:
            java.lang.String r5 = (java.lang.String) r5
            r9.Q0(r5)
            goto L_0x0015
        L_0x0114:
            java.lang.Object[] r5 = r0.d
            r5 = r5[r4]
            boolean r6 = r5 instanceof i0.f.a.c.t.p
            if (r6 == 0) goto L_0x013d
            i0.f.a.c.t.p r5 = (i0.f.a.c.t.p) r5
            java.lang.Object r5 = r5.c
            boolean r6 = r5 instanceof i0.f.a.c.f
            if (r6 == 0) goto L_0x0129
            r9.u0(r5)
            goto L_0x0015
        L_0x0129:
            boolean r6 = r5 instanceof i0.f.a.b.f
            if (r6 == 0) goto L_0x0134
            i0.f.a.b.f r5 = (i0.f.a.b.f) r5
            r9.D0(r5)
            goto L_0x0015
        L_0x0134:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r9.F0(r5)
            goto L_0x0015
        L_0x013d:
            boolean r6 = r5 instanceof i0.f.a.c.f
            if (r6 == 0) goto L_0x0146
            r9.u0(r5)
            goto L_0x0015
        L_0x0146:
            r9.Q(r5)
            goto L_0x0015
        L_0x014b:
            java.lang.Object[] r5 = r0.d
            r5 = r5[r4]
            boolean r6 = r5 instanceof i0.f.a.b.f
            if (r6 == 0) goto L_0x015a
            i0.f.a.b.f r5 = (i0.f.a.b.f) r5
            r9.Z(r5)
            goto L_0x0015
        L_0x015a:
            java.lang.String r5 = (java.lang.String) r5
            r9.b0(r5)
            goto L_0x0015
        L_0x0161:
            r9.T()
            goto L_0x0015
        L_0x0166:
            r9.I0()
            goto L_0x0015
        L_0x016b:
            r9.U()
            goto L_0x0015
        L_0x0170:
            r9.M0()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer.v(i0.f.a.c.t.r, com.fasterxml.jackson.core.JsonGenerator):void");
    }
}
