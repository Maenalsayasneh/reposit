package i0.f.a.b.j;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import i0.f.a.b.d;
import i0.f.a.b.h.b;
import i0.f.a.b.i.a;
import i0.f.a.b.k.b;
import i0.f.a.b.m.c;
import i0.f.a.b.m.i;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Objects;

/* compiled from: ReaderBasedJsonParser */
public class f extends b {
    public static final int G2 = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    public static final int H2 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    public static final int I2 = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    public static final int J2 = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    public static final int K2 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    public static final int L2 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    public static final int M2 = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    public static final int N2 = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    public static final int[] O2 = a.c;
    public Reader P2;
    public char[] Q2;
    public boolean R2 = true;
    public d S2;
    public final i0.f.a.b.k.b T2;
    public final int U2;
    public boolean V2;
    public long W2;
    public int X2;
    public int Y2;

    public f(i0.f.a.b.i.b bVar, int i, Reader reader, d dVar, i0.f.a.b.k.b bVar2) {
        super(bVar, i);
        this.P2 = reader;
        bVar.a(bVar.g);
        char[] b = bVar.d.b(0, 0);
        bVar.g = b;
        this.Q2 = b;
        this.j2 = 0;
        this.k2 = 0;
        this.S2 = dVar;
        this.T2 = bVar2;
        this.U2 = bVar2.c;
    }

    public final void G1(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) i2)) {
            c2(str.substring(0, i));
            throw null;
        }
    }

    public final void H1(int i) throws JsonParseException {
        if (i == 93) {
            p2();
            if (this.r2.d()) {
                this.r2 = this.r2.i();
                this.f2 = JsonToken.END_ARRAY;
            } else {
                y1(i, '}');
                throw null;
            }
        }
        if (i == 125) {
            p2();
            if (this.r2.e()) {
                this.r2 = this.r2.i();
                this.f2 = JsonToken.END_OBJECT;
                return;
            }
            y1(i, ']');
            throw null;
        }
    }

    public byte[] I1(Base64Variant base64Variant) throws IOException {
        c r1 = r1();
        while (true) {
            if (this.j2 >= this.k2) {
                O1();
            }
            char[] cArr = this.Q2;
            int i = this.j2;
            this.j2 = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                int e = base64Variant.e(c);
                if (e < 0) {
                    if (c == '\"') {
                        return r1.k();
                    }
                    e = o1(base64Variant, c, 0);
                    if (e < 0) {
                        continue;
                    }
                }
                if (this.j2 >= this.k2) {
                    O1();
                }
                char[] cArr2 = this.Q2;
                int i2 = this.j2;
                this.j2 = i2 + 1;
                char c2 = cArr2[i2];
                int e2 = base64Variant.e(c2);
                if (e2 < 0) {
                    e2 = o1(base64Variant, c2, 1);
                }
                int i3 = (e << 6) | e2;
                if (this.j2 >= this.k2) {
                    O1();
                }
                char[] cArr3 = this.Q2;
                int i4 = this.j2;
                this.j2 = i4 + 1;
                char c3 = cArr3[i4];
                int e3 = base64Variant.e(c3);
                if (e3 < 0) {
                    if (e3 != -2) {
                        if (c3 == '\"') {
                            r1.b(i3 >> 4);
                            if (!base64Variant.Z1) {
                                return r1.k();
                            }
                            this.j2--;
                            t1(base64Variant);
                            throw null;
                        }
                        e3 = o1(base64Variant, c3, 2);
                    }
                    if (e3 == -2) {
                        if (this.j2 >= this.k2) {
                            O1();
                        }
                        char[] cArr4 = this.Q2;
                        int i5 = this.j2;
                        this.j2 = i5 + 1;
                        char c4 = cArr4[i5];
                        if (base64Variant.l(c4) || o1(base64Variant, c4, 3) == -2) {
                            r1.b(i3 >> 4);
                        } else {
                            StringBuilder P0 = i0.d.a.a.a.P0("expected padding character '");
                            P0.append(base64Variant.y);
                            P0.append("'");
                            throw D1(base64Variant, c4, 3, P0.toString());
                        }
                    }
                }
                int i6 = (i3 << 6) | e3;
                if (this.j2 >= this.k2) {
                    O1();
                }
                char[] cArr5 = this.Q2;
                int i7 = this.j2;
                this.j2 = i7 + 1;
                char c5 = cArr5[i7];
                int e4 = base64Variant.e(c5);
                if (e4 < 0) {
                    if (e4 != -2) {
                        if (c5 == '\"') {
                            r1.f(i6 >> 2);
                            if (!base64Variant.Z1) {
                                return r1.k();
                            }
                            this.j2--;
                            t1(base64Variant);
                            throw null;
                        }
                        e4 = o1(base64Variant, c5, 3);
                    }
                    if (e4 == -2) {
                        r1.f(i6 >> 2);
                    }
                }
                r1.e((i6 << 6) | e4);
            }
        }
    }

    public final void J1() throws IOException {
        int i = this.j2;
        int i2 = this.k2;
        if (i < i2) {
            int[] iArr = O2;
            int length = iArr.length;
            while (true) {
                char[] cArr = this.Q2;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    i iVar = this.t2;
                    int i3 = this.j2;
                    iVar.r(cArr, i3, i - i3);
                    this.j2 = i + 1;
                    return;
                }
            }
        }
        i iVar2 = this.t2;
        char[] cArr2 = this.Q2;
        int i4 = this.j2;
        int i5 = i - i4;
        iVar2.c = null;
        iVar2.d = -1;
        iVar2.e = 0;
        iVar2.k = null;
        iVar2.l = null;
        if (iVar2.g) {
            iVar2.d();
        } else if (iVar2.i == null) {
            iVar2.i = iVar2.c(i5);
        }
        iVar2.h = 0;
        iVar2.j = 0;
        iVar2.b(cArr2, i4, i5);
        this.j2 = i;
        char[] m = this.t2.m();
        int i6 = this.t2.j;
        int[] iArr2 = O2;
        int length2 = iArr2.length;
        while (true) {
            if (this.j2 < this.k2 || N1()) {
                char[] cArr3 = this.Q2;
                int i7 = this.j2;
                this.j2 = i7 + 1;
                char c2 = cArr3[i7];
                if (c2 < length2 && iArr2[c2] != 0) {
                    if (c2 == '\"') {
                        this.t2.j = i6;
                        return;
                    } else if (c2 == '\\') {
                        c2 = q1();
                    } else if (c2 < ' ') {
                        z1(c2, "string value");
                    }
                }
                if (i6 >= m.length) {
                    m = this.t2.l();
                    i6 = 0;
                }
                m[i6] = c2;
                i6++;
            } else {
                d1(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                throw null;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String K0() throws java.io.IOException {
        /*
            r13 = this;
            r0 = 0
            r13.y2 = r0
            com.fasterxml.jackson.core.JsonToken r0 = r13.f2
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            r2 = 0
            if (r0 != r1) goto L_0x000e
            r13.T1()
            return r2
        L_0x000e:
            boolean r0 = r13.V2
            if (r0 == 0) goto L_0x0015
            r13.l2()
        L_0x0015:
            int r0 = r13.m2()
            if (r0 >= 0) goto L_0x0021
            r13.close()
            r13.f2 = r2
            return r2
        L_0x0021:
            r13.x2 = r2
            r3 = 93
            if (r0 == r3) goto L_0x0164
            r4 = 125(0x7d, float:1.75E-43)
            if (r0 != r4) goto L_0x002d
            goto L_0x0164
        L_0x002d:
            i0.f.a.b.j.d r5 = r13.r2
            boolean r5 = r5.l()
            if (r5 == 0) goto L_0x0048
            int r0 = r13.i2(r0)
            int r5 = r13.d
            int r6 = G2
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0048
            if (r0 == r3) goto L_0x0044
            if (r0 != r4) goto L_0x0048
        L_0x0044:
            r13.H1(r0)
            return r2
        L_0x0048:
            i0.f.a.b.j.d r3 = r13.r2
            boolean r3 = r3.e()
            r4 = 123(0x7b, float:1.72E-43)
            r5 = 116(0x74, float:1.63E-43)
            r6 = 110(0x6e, float:1.54E-43)
            r7 = 102(0x66, float:1.43E-43)
            r8 = 91
            r9 = 1
            r10 = 34
            if (r3 != 0) goto L_0x00f1
            r13.p2()
            if (r0 != r10) goto L_0x006a
            r13.V2 = r9
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            r13.f2 = r0
            goto L_0x00f0
        L_0x006a:
            if (r0 == r8) goto L_0x00e0
            if (r0 == r7) goto L_0x00d6
            if (r0 == r6) goto L_0x00cc
            if (r0 == r5) goto L_0x00c2
            if (r0 == r4) goto L_0x00b1
            switch(r0) {
                case 44: goto L_0x008a;
                case 45: goto L_0x0083;
                case 46: goto L_0x007b;
                default: goto L_0x0077;
            }
        L_0x0077:
            switch(r0) {
                case 48: goto L_0x00a3;
                case 49: goto L_0x00a3;
                case 50: goto L_0x00a3;
                case 51: goto L_0x00a3;
                case 52: goto L_0x00a3;
                case 53: goto L_0x00a3;
                case 54: goto L_0x00a3;
                case 55: goto L_0x00a3;
                case 56: goto L_0x00a3;
                case 57: goto L_0x00a3;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x00aa
        L_0x007b:
            com.fasterxml.jackson.core.JsonToken r0 = r13.V1()
            r13.f2 = r0
            goto L_0x00f0
        L_0x0083:
            com.fasterxml.jackson.core.JsonToken r0 = r13.Y1()
            r13.f2 = r0
            goto L_0x00f0
        L_0x008a:
            i0.f.a.b.j.d r1 = r13.r2
            boolean r1 = r1.f()
            if (r1 != 0) goto L_0x00aa
            int r1 = r13.d
            int r3 = J2
            r1 = r1 & r3
            if (r1 == 0) goto L_0x00aa
            int r0 = r13.j2
            int r0 = r0 - r9
            r13.j2 = r0
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r13.f2 = r0
            goto L_0x00f0
        L_0x00a3:
            com.fasterxml.jackson.core.JsonToken r0 = r13.a2(r0)
            r13.f2 = r0
            goto L_0x00f0
        L_0x00aa:
            com.fasterxml.jackson.core.JsonToken r0 = r13.M1(r0)
            r13.f2 = r0
            goto L_0x00f0
        L_0x00b1:
            i0.f.a.b.j.d r0 = r13.r2
            int r1 = r13.p2
            int r3 = r13.q2
            i0.f.a.b.j.d r0 = r0.k(r1, r3)
            r13.r2 = r0
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            r13.f2 = r0
            goto L_0x00f0
        L_0x00c2:
            java.lang.String r0 = "true"
            r13.R1(r0, r9)
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE
            r13.f2 = r0
            goto L_0x00f0
        L_0x00cc:
            java.lang.String r0 = "null"
            r13.R1(r0, r9)
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r13.f2 = r0
            goto L_0x00f0
        L_0x00d6:
            java.lang.String r0 = "false"
            r13.R1(r0, r9)
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE
            r13.f2 = r0
            goto L_0x00f0
        L_0x00e0:
            i0.f.a.b.j.d r0 = r13.r2
            int r1 = r13.p2
            int r3 = r13.q2
            i0.f.a.b.j.d r0 = r0.j(r1, r3)
            r13.r2 = r0
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            r13.f2 = r0
        L_0x00f0:
            return r2
        L_0x00f1:
            int r2 = r13.j2
            long r11 = (long) r2
            r13.W2 = r11
            int r3 = r13.m2
            r13.X2 = r3
            int r3 = r13.n2
            int r2 = r2 - r3
            r13.Y2 = r2
            if (r0 != r10) goto L_0x0106
            java.lang.String r0 = r13.W1()
            goto L_0x010a
        L_0x0106:
            java.lang.String r0 = r13.L1(r0)
        L_0x010a:
            i0.f.a.b.j.d r2 = r13.r2
            r2.n(r0)
            r13.f2 = r1
            int r1 = r13.g2()
            r13.p2()
            if (r1 != r10) goto L_0x0121
            r13.V2 = r9
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            r13.s2 = r1
            return r0
        L_0x0121:
            r2 = 45
            if (r1 == r2) goto L_0x015d
            r2 = 46
            if (r1 == r2) goto L_0x0158
            if (r1 == r8) goto L_0x0155
            if (r1 == r7) goto L_0x014f
            if (r1 == r6) goto L_0x0149
            if (r1 == r5) goto L_0x0143
            if (r1 == r4) goto L_0x0140
            switch(r1) {
                case 48: goto L_0x013b;
                case 49: goto L_0x013b;
                case 50: goto L_0x013b;
                case 51: goto L_0x013b;
                case 52: goto L_0x013b;
                case 53: goto L_0x013b;
                case 54: goto L_0x013b;
                case 55: goto L_0x013b;
                case 56: goto L_0x013b;
                case 57: goto L_0x013b;
                default: goto L_0x0136;
            }
        L_0x0136:
            com.fasterxml.jackson.core.JsonToken r1 = r13.M1(r1)
            goto L_0x0161
        L_0x013b:
            com.fasterxml.jackson.core.JsonToken r1 = r13.a2(r1)
            goto L_0x0161
        L_0x0140:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            goto L_0x0161
        L_0x0143:
            r13.S1()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE
            goto L_0x0161
        L_0x0149:
            r13.Q1()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            goto L_0x0161
        L_0x014f:
            r13.P1()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE
            goto L_0x0161
        L_0x0155:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            goto L_0x0161
        L_0x0158:
            com.fasterxml.jackson.core.JsonToken r1 = r13.V1()
            goto L_0x0161
        L_0x015d:
            com.fasterxml.jackson.core.JsonToken r1 = r13.Y1()
        L_0x0161:
            r13.s2 = r1
            return r0
        L_0x0164:
            r13.H1(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.j.f.K0():java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ?, r10v1 ?, r10v4 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public com.fasterxml.jackson.core.JsonToken K1(
/*
Method generation error in method: i0.f.a.b.j.f.K1(int, boolean):com.fasterxml.jackson.core.JsonToken, dex: classes2.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    public final String L0() throws IOException {
        if (this.f2 == JsonToken.FIELD_NAME) {
            this.v2 = false;
            JsonToken jsonToken = this.s2;
            this.s2 = null;
            this.f2 = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this.V2) {
                    this.V2 = false;
                    J1();
                }
                return this.t2.h();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this.r2 = this.r2.j(this.p2, this.q2);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this.r2 = this.r2.k(this.p2, this.q2);
            }
            return null;
        } else if (M0() == JsonToken.VALUE_STRING) {
            return Z();
        } else {
            return null;
        }
    }

    public String L1(int i) throws IOException {
        boolean z;
        if (i == 39 && (this.d & K2) != 0) {
            int i2 = this.j2;
            int i3 = this.U2;
            int i4 = this.k2;
            if (i2 < i4) {
                int[] iArr = O2;
                int length = iArr.length;
                do {
                    char[] cArr = this.Q2;
                    char c = cArr[i2];
                    if (c != '\'') {
                        if (c < length && iArr[c] != 0) {
                            break;
                        }
                        i3 = (i3 * 33) + c;
                        i2++;
                    } else {
                        int i5 = this.j2;
                        this.j2 = i2 + 1;
                        return this.T2.c(cArr, i5, i2 - i5, i3);
                    }
                } while (i2 < i4);
            }
            int i6 = this.j2;
            this.j2 = i2;
            return X1(i6, i3, 39);
        } else if ((this.d & L2) != 0) {
            int[] iArr2 = a.e;
            int length2 = iArr2.length;
            if (i < length2) {
                z = iArr2[i] == 0;
            } else {
                z = Character.isJavaIdentifierPart((char) i);
            }
            if (z) {
                int i7 = this.j2;
                int i8 = this.U2;
                int i9 = this.k2;
                if (i7 < i9) {
                    do {
                        char[] cArr2 = this.Q2;
                        char c2 = cArr2[i7];
                        if (c2 < length2) {
                            if (iArr2[c2] != 0) {
                                int i10 = this.j2 - 1;
                                this.j2 = i7;
                                return this.T2.c(cArr2, i10, i7 - i10, i8);
                            }
                        } else if (!Character.isJavaIdentifierPart((char) c2)) {
                            int i11 = this.j2 - 1;
                            this.j2 = i7;
                            return this.T2.c(this.Q2, i11, i7 - i11, i8);
                        }
                        i8 = (i8 * 33) + c2;
                        i7++;
                    } while (i7 < i9);
                }
                int i12 = this.j2 - 1;
                this.j2 = i7;
                this.t2.r(this.Q2, i12, i7 - i12);
                char[] m = this.t2.m();
                int i13 = this.t2.j;
                int length3 = iArr2.length;
                while (true) {
                    if (this.j2 >= this.k2 && !N1()) {
                        break;
                    }
                    char c3 = this.Q2[this.j2];
                    if (c3 >= length3) {
                        if (!Character.isJavaIdentifierPart(c3)) {
                            break;
                        }
                    } else if (iArr2[c3] != 0) {
                        break;
                    }
                    this.j2++;
                    i8 = (i8 * 33) + c3;
                    int i14 = i13 + 1;
                    m[i13] = c3;
                    if (i14 >= m.length) {
                        m = this.t2.l();
                        i13 = 0;
                    } else {
                        i13 = i14;
                    }
                }
                i iVar = this.t2;
                iVar.j = i13;
                return this.T2.c(iVar.n(), iVar.o(), iVar.t(), i8);
            }
            f1(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
            throw null;
        } else {
            f1(i, "was expecting double-quote to start field name");
            throw null;
        }
    }

    public final JsonToken M0() throws IOException {
        JsonToken jsonToken;
        JsonToken jsonToken2 = this.f2;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            return T1();
        }
        this.y2 = 0;
        if (this.V2) {
            l2();
        }
        int m2 = m2();
        if (m2 < 0) {
            close();
            this.f2 = null;
            return null;
        }
        this.x2 = null;
        if (m2 == 93 || m2 == 125) {
            H1(m2);
            return this.f2;
        }
        if (this.r2.l()) {
            m2 = i2(m2);
            if ((this.d & G2) != 0 && (m2 == 93 || m2 == 125)) {
                H1(m2);
                return this.f2;
            }
        }
        boolean e = this.r2.e();
        if (e) {
            int i = this.j2;
            this.W2 = (long) i;
            this.X2 = this.m2;
            this.Y2 = i - this.n2;
            this.r2.n(m2 == 34 ? W1() : L1(m2));
            this.f2 = jsonToken3;
            m2 = g2();
        }
        p2();
        if (m2 == 34) {
            this.V2 = true;
            jsonToken = JsonToken.VALUE_STRING;
        } else if (m2 == 91) {
            if (!e) {
                this.r2 = this.r2.j(this.p2, this.q2);
            }
            jsonToken = JsonToken.START_ARRAY;
        } else if (m2 == 102) {
            P1();
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (m2 == 110) {
            Q1();
            jsonToken = JsonToken.VALUE_NULL;
        } else if (m2 == 116) {
            S1();
            jsonToken = JsonToken.VALUE_TRUE;
        } else if (m2 == 123) {
            if (!e) {
                this.r2 = this.r2.k(this.p2, this.q2);
            }
            jsonToken = JsonToken.START_OBJECT;
        } else if (m2 == 125) {
            f1(m2, "expected a value");
            throw null;
        } else if (m2 == 45) {
            jsonToken = Y1();
        } else if (m2 != 46) {
            switch (m2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonToken = a2(m2);
                    break;
                default:
                    jsonToken = M1(m2);
                    break;
            }
        } else {
            jsonToken = V1();
        }
        if (e) {
            this.s2 = jsonToken;
            return this.f2;
        }
        this.f2 = jsonToken;
        return jsonToken;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r8 != 44) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r7.r2.d() == false) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken M1(int r8) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            r1 = 39
            r2 = 0
            if (r8 == r1) goto L_0x0096
            r1 = 73
            r3 = 1
            if (r8 == r1) goto L_0x007b
            r1 = 78
            if (r8 == r1) goto L_0x0060
            r1 = 93
            if (r8 == r1) goto L_0x003f
            r1 = 43
            if (r8 == r1) goto L_0x001d
            r0 = 44
            if (r8 == r0) goto L_0x0049
            goto L_0x00f5
        L_0x001d:
            int r8 = r7.j2
            int r1 = r7.k2
            if (r8 < r1) goto L_0x0030
            boolean r8 = r7.N1()
            if (r8 == 0) goto L_0x002a
            goto L_0x0030
        L_0x002a:
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r7.e1(r8)
            throw r2
        L_0x0030:
            char[] r8 = r7.Q2
            int r1 = r7.j2
            int r2 = r1 + 1
            r7.j2 = r2
            char r8 = r8[r1]
            com.fasterxml.jackson.core.JsonToken r8 = r7.K1(r8, r0)
            return r8
        L_0x003f:
            i0.f.a.b.j.d r0 = r7.r2
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x0049
            goto L_0x00f5
        L_0x0049:
            i0.f.a.b.j.d r0 = r7.r2
            boolean r0 = r0.f()
            if (r0 != 0) goto L_0x00f5
            int r0 = r7.d
            int r1 = J2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00f5
            int r8 = r7.j2
            int r8 = r8 - r3
            r7.j2 = r8
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r8
        L_0x0060:
            java.lang.String r8 = "NaN"
            r7.R1(r8, r3)
            int r0 = r7.d
            int r1 = I2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0073
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r8 = r7.E1(r8, r0)
            return r8
        L_0x0073:
            com.fasterxml.jackson.core.JsonParseException r8 = new com.fasterxml.jackson.core.JsonParseException
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r8.<init>(r7, r0)
            throw r8
        L_0x007b:
            java.lang.String r8 = "Infinity"
            r7.R1(r8, r3)
            int r0 = r7.d
            int r1 = I2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x008e
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r8 = r7.E1(r8, r0)
            return r8
        L_0x008e:
            com.fasterxml.jackson.core.JsonParseException r8 = new com.fasterxml.jackson.core.JsonParseException
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r8.<init>(r7, r0)
            throw r8
        L_0x0096:
            int r3 = r7.d
            int r4 = K2
            r3 = r3 & r4
            if (r3 == 0) goto L_0x00f5
            i0.f.a.b.m.i r8 = r7.t2
            char[] r8 = r8.i()
            i0.f.a.b.m.i r3 = r7.t2
            int r3 = r3.j
        L_0x00a7:
            int r4 = r7.j2
            int r5 = r7.k2
            if (r4 < r5) goto L_0x00bc
            boolean r4 = r7.N1()
            if (r4 == 0) goto L_0x00b4
            goto L_0x00bc
        L_0x00b4:
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            java.lang.String r0 = ": was expecting closing quote for a string value"
            r7.d1(r0, r8)
            throw r2
        L_0x00bc:
            char[] r4 = r7.Q2
            int r5 = r7.j2
            int r6 = r5 + 1
            r7.j2 = r6
            char r4 = r4[r5]
            r5 = 92
            if (r4 > r5) goto L_0x00e5
            if (r4 != r5) goto L_0x00d1
            char r4 = r7.q1()
            goto L_0x00e5
        L_0x00d1:
            if (r4 > r1) goto L_0x00e5
            if (r4 != r1) goto L_0x00dc
            i0.f.a.b.m.i r8 = r7.t2
            r8.j = r3
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            return r8
        L_0x00dc:
            r5 = 32
            if (r4 >= r5) goto L_0x00e5
            java.lang.String r5 = "string value"
            r7.z1(r4, r5)
        L_0x00e5:
            int r5 = r8.length
            if (r3 < r5) goto L_0x00ef
            i0.f.a.b.m.i r8 = r7.t2
            char[] r8 = r8.l()
            r3 = r0
        L_0x00ef:
            int r5 = r3 + 1
            r8[r3] = r4
            r3 = r5
            goto L_0x00a7
        L_0x00f5:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r8)
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            char r8 = (char) r8
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = r7.A1()
            r7.d2(r8, r0)
            throw r2
        L_0x0111:
            java.lang.String r0 = "expected a valid value "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.String r1 = r7.A1()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.f1(r8, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.j.f.M1(int):com.fasterxml.jackson.core.JsonToken");
    }

    public boolean N1() throws IOException {
        Reader reader = this.P2;
        if (reader != null) {
            char[] cArr = this.Q2;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                int i = this.k2;
                long j = (long) i;
                this.l2 += j;
                this.n2 -= i;
                this.W2 -= j;
                this.j2 = 0;
                this.k2 = read;
                return true;
            }
            n1();
            if (read == 0) {
                StringBuilder P0 = i0.d.a.a.a.P0("Reader returned 0 characters when trying to read ");
                P0.append(this.k2);
                throw new IOException(P0.toString());
            }
        }
        return false;
    }

    public void O1() throws IOException {
        if (!N1()) {
            c1();
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P1() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.j2
            int r1 = r0 + 4
            int r2 = r5.k2
            r3 = 1
            if (r1 >= r2) goto L_0x0038
            char[] r1 = r5.Q2
            char r2 = r1[r0]
            r4 = 97
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 115(0x73, float:1.61E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 101(0x65, float:1.42E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x0035
            r2 = 93
            if (r1 == r2) goto L_0x0035
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x0038
        L_0x0035:
            r5.j2 = r0
            return
        L_0x0038:
            java.lang.String r0 = "false"
            r5.R1(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.j.f.P1():void");
    }

    public int Q0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this.V2 || this.f2 != JsonToken.VALUE_STRING) {
            byte[] n = n(base64Variant);
            outputStream.write(n);
            return n.length;
        }
        byte[] d = this.h2.d();
        try {
            return b2(base64Variant, outputStream, d);
        } finally {
            this.h2.e(d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r0 = r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Q1() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.j2
            int r1 = r0 + 3
            int r2 = r5.k2
            r3 = 1
            if (r1 >= r2) goto L_0x002f
            char[] r1 = r5.Q2
            char r2 = r1[r0]
            r4 = 117(0x75, float:1.64E-43)
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r2 = r1[r0]
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x002c
            r2 = 93
            if (r1 == r2) goto L_0x002c
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x002f
        L_0x002c:
            r5.j2 = r0
            return
        L_0x002f:
            java.lang.String r0 = "null"
            r5.R1(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.j.f.Q1():void");
    }

    public final void R1(String str, int i) throws IOException {
        int i2;
        char c;
        int length = str.length();
        if (this.j2 + length >= this.k2) {
            int length2 = str.length();
            do {
                if ((this.j2 < this.k2 || N1()) && this.Q2[this.j2] == str.charAt(i)) {
                    i2 = this.j2 + 1;
                    this.j2 = i2;
                    i++;
                } else {
                    c2(str.substring(0, i));
                    throw null;
                }
            } while (i < length2);
            if ((i2 < this.k2 || N1()) && (c = this.Q2[this.j2]) >= '0' && c != ']' && c != '}') {
                G1(str, i, c);
                return;
            }
            return;
        }
        while (this.Q2[this.j2] == str.charAt(i)) {
            int i3 = this.j2 + 1;
            this.j2 = i3;
            i++;
            if (i >= length) {
                char c2 = this.Q2[i3];
                if (c2 >= '0' && c2 != ']' && c2 != '}') {
                    G1(str, i, c2);
                    return;
                }
                return;
            }
        }
        c2(str.substring(0, i));
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S1() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.j2
            int r1 = r0 + 3
            int r2 = r5.k2
            r3 = 1
            if (r1 >= r2) goto L_0x0031
            char[] r1 = r5.Q2
            char r2 = r1[r0]
            r4 = 114(0x72, float:1.6E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 117(0x75, float:1.64E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 101(0x65, float:1.42E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x002e
            r2 = 93
            if (r1 == r2) goto L_0x002e
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x0031
        L_0x002e:
            r5.j2 = r0
            return
        L_0x0031:
            java.lang.String r0 = "true"
            r5.R1(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.j.f.S1():void");
    }

    public final JsonToken T1() {
        this.v2 = false;
        JsonToken jsonToken = this.s2;
        this.s2 = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this.r2 = this.r2.j(this.p2, this.q2);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.r2 = this.r2.k(this.p2, this.q2);
        }
        this.f2 = jsonToken;
        return jsonToken;
    }

    public i0.f.a.b.m.f<StreamReadCapability> U() {
        return b.g2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r8 == 'E') goto L_0x0036;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.core.JsonToken U1(int r8, int r9, int r10, boolean r11, int r12) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7.k2
            r1 = 0
            r2 = 57
            r3 = 48
            r4 = 0
            r5 = 46
            if (r8 != r5) goto L_0x002e
            r8 = r4
        L_0x000d:
            if (r10 < r0) goto L_0x0014
            com.fasterxml.jackson.core.JsonToken r8 = r7.Z1(r11, r9)
            return r8
        L_0x0014:
            char[] r5 = r7.Q2
            int r6 = r10 + 1
            char r10 = r5[r10]
            if (r10 < r3) goto L_0x0023
            if (r10 <= r2) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r8 = r8 + 1
            r10 = r6
            goto L_0x000d
        L_0x0023:
            if (r8 == 0) goto L_0x0028
            r8 = r10
            r10 = r6
            goto L_0x002e
        L_0x0028:
            java.lang.String r8 = "Decimal point not followed by a digit"
            r7.l1(r10, r8)
            throw r1
        L_0x002e:
            r5 = 101(0x65, float:1.42E-43)
            if (r8 == r5) goto L_0x0036
            r5 = 69
            if (r8 != r5) goto L_0x0079
        L_0x0036:
            if (r10 < r0) goto L_0x003f
            r7.j2 = r9
            com.fasterxml.jackson.core.JsonToken r8 = r7.Z1(r11, r9)
            return r8
        L_0x003f:
            char[] r8 = r7.Q2
            int r5 = r10 + 1
            char r10 = r8[r10]
            r6 = 45
            if (r10 == r6) goto L_0x0052
            r6 = 43
            if (r10 != r6) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            r8 = r10
            r10 = r5
        L_0x0050:
            r5 = r4
            goto L_0x0060
        L_0x0052:
            if (r5 < r0) goto L_0x005b
            r7.j2 = r9
            com.fasterxml.jackson.core.JsonToken r8 = r7.Z1(r11, r9)
            return r8
        L_0x005b:
            int r10 = r5 + 1
            char r8 = r8[r5]
            goto L_0x0050
        L_0x0060:
            if (r8 > r2) goto L_0x0077
            if (r8 < r3) goto L_0x0077
            int r5 = r5 + 1
            if (r10 < r0) goto L_0x006f
            r7.j2 = r9
            com.fasterxml.jackson.core.JsonToken r8 = r7.Z1(r11, r9)
            return r8
        L_0x006f:
            char[] r8 = r7.Q2
            int r6 = r10 + 1
            char r8 = r8[r10]
            r10 = r6
            goto L_0x0060
        L_0x0077:
            if (r5 == 0) goto L_0x0099
        L_0x0079:
            int r10 = r10 + -1
            r7.j2 = r10
            i0.f.a.b.j.d r0 = r7.r2
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0088
            r7.q2(r8)
        L_0x0088:
            int r10 = r10 - r9
            i0.f.a.b.m.i r8 = r7.t2
            char[] r0 = r7.Q2
            r8.r(r0, r9, r10)
            r7.E2 = r11
            r7.F2 = r12
            r7.y2 = r4
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            return r8
        L_0x0099:
            java.lang.String r9 = "Exponent indicator not followed by a digit"
            r7.l1(r8, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.j.f.U1(int, int, int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    public final JsonToken V1() throws IOException {
        if (!C0(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return M1(46);
        }
        int i = this.j2;
        return U1(46, i - 1, i, false, 0);
    }

    public final String W1() throws IOException {
        int i = this.j2;
        int i2 = this.U2;
        int[] iArr = O2;
        while (true) {
            if (i >= this.k2) {
                break;
            }
            char[] cArr = this.Q2;
            char c = cArr[i];
            if (c >= iArr.length || iArr[c] == 0) {
                i2 = (i2 * 33) + c;
                i++;
            } else if (c == '\"') {
                int i3 = this.j2;
                this.j2 = i + 1;
                return this.T2.c(cArr, i3, i - i3, i2);
            }
        }
        int i4 = this.j2;
        this.j2 = i;
        return X1(i4, i2, 34);
    }

    public final String X1(int i, int i2, int i3) throws IOException {
        this.t2.r(this.Q2, i, this.j2 - i);
        char[] m = this.t2.m();
        int i4 = this.t2.j;
        while (true) {
            if (this.j2 < this.k2 || N1()) {
                char[] cArr = this.Q2;
                int i5 = this.j2;
                this.j2 = i5 + 1;
                char c = cArr[i5];
                if (c <= '\\') {
                    if (c == '\\') {
                        c = q1();
                    } else if (c <= i3) {
                        if (c == i3) {
                            i iVar = this.t2;
                            iVar.j = i4;
                            return this.T2.c(iVar.n(), iVar.o(), iVar.t(), i2);
                        } else if (c < ' ') {
                            z1(c, "name");
                        }
                    }
                }
                i2 = (i2 * 33) + c;
                int i6 = i4 + 1;
                m[i4] = c;
                if (i6 >= m.length) {
                    m = this.t2.l();
                    i4 = 0;
                } else {
                    i4 = i6;
                }
            } else {
                d1(" in field name", JsonToken.FIELD_NAME);
                throw null;
            }
        }
    }

    public final JsonToken Y1() throws IOException {
        int i = this.j2;
        int i2 = i - 1;
        int i3 = this.k2;
        if (i >= i3) {
            return Z1(true, i2);
        }
        int i4 = i + 1;
        char c = this.Q2[i];
        if (c > '9' || c < '0') {
            this.j2 = i4;
            return K1(c, true);
        } else if (c == '0') {
            return Z1(true, i2);
        } else {
            int i5 = 1;
            while (i4 < i3) {
                int i6 = i4 + 1;
                char c2 = this.Q2[i4];
                if (c2 >= '0' && c2 <= '9') {
                    i5++;
                    i4 = i6;
                } else if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this.j2 = i6;
                    return U1(c2, i2, i6, true, i5);
                } else {
                    int i7 = i6 - 1;
                    this.j2 = i7;
                    if (this.r2.f()) {
                        q2(c2);
                    }
                    this.t2.r(this.Q2, i2, i7 - i2);
                    return F1(true, i5);
                }
            }
            return Z1(true, i2);
        }
    }

    public final String Z() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.V2) {
                this.V2 = false;
                J1();
            }
            return this.t2.h();
        } else if (jsonToken == null) {
            return null;
        } else {
            int id = jsonToken.id();
            if (id == 5) {
                return this.r2.f;
            }
            if (id == 6 || id == 7 || id == 8) {
                return this.t2.h();
            }
            return jsonToken.asString();
        }
    }

    public final JsonToken Z1(boolean z, int i) throws IOException {
        int i2;
        char c;
        boolean z2;
        int i3;
        char c2;
        char r2;
        int i4;
        char c3;
        if (z) {
            i++;
        }
        this.j2 = i;
        char[] i5 = this.t2.i();
        int i6 = 0;
        if (z) {
            i5[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = this.j2;
        if (i7 < this.k2) {
            char[] cArr = this.Q2;
            this.j2 = i7 + 1;
            c = cArr[i7];
        } else {
            c = r2("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (c == '0') {
            int i8 = this.j2;
            int i9 = this.k2;
            if ((i8 >= i9 || ((c3 = this.Q2[i8]) >= '0' && c3 <= '9')) && ((i8 < i9 || N1()) && (c = this.Q2[i4]) >= '0' && c <= '9')) {
                if ((this.d & H2) != 0) {
                    this.j2 = (i4 = this.j2) + 1;
                    if (c == '0') {
                        while (true) {
                            if (this.j2 >= this.k2 && !N1()) {
                                break;
                            }
                            char[] cArr2 = this.Q2;
                            int i10 = this.j2;
                            c = cArr2[i10];
                            if (c < '0' || c > '9') {
                                break;
                            }
                            this.j2 = i10 + 1;
                            if (c != '0') {
                                break;
                            }
                        }
                    }
                } else {
                    throw new JsonParseException(this, i0.d.a.a.a.n0("Invalid numeric value: ", "Leading zeroes not allowed"));
                }
            }
            c = '0';
        }
        int i11 = 0;
        while (true) {
            if (c >= '0' && c <= '9') {
                i11++;
                if (i2 >= i5.length) {
                    i5 = this.t2.l();
                    i2 = 0;
                }
                int i12 = i2 + 1;
                i5[i2] = c;
                if (this.j2 >= this.k2 && !N1()) {
                    c = 0;
                    i2 = i12;
                    z2 = true;
                    break;
                }
                char[] cArr3 = this.Q2;
                int i13 = this.j2;
                this.j2 = i13 + 1;
                c = cArr3[i13];
                i2 = i12;
            } else {
                z2 = false;
            }
        }
        if (i11 == 0) {
            return K1(c, z);
        }
        if (c == '.') {
            if (i2 >= i5.length) {
                i5 = this.t2.l();
                i2 = 0;
            }
            i5[i2] = c;
            int i14 = i2 + 1;
            i3 = 0;
            while (true) {
                if (this.j2 >= this.k2 && !N1()) {
                    z2 = true;
                    break;
                }
                char[] cArr4 = this.Q2;
                int i15 = this.j2;
                this.j2 = i15 + 1;
                c = cArr4[i15];
                if (c < '0' || c > '9') {
                    break;
                }
                i3++;
                if (i2 >= i5.length) {
                    i5 = this.t2.l();
                    i2 = 0;
                }
                i5[i2] = c;
                i14 = i2 + 1;
            }
            if (i3 == 0) {
                l1(c, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            i3 = 0;
        }
        if (c == 'e' || c == 'E') {
            if (i2 >= i5.length) {
                i5 = this.t2.l();
            } else {
                i6 = i2;
            }
            int i16 = i6 + 1;
            i5[i6] = c;
            int i17 = this.j2;
            if (i17 < this.k2) {
                char[] cArr5 = this.Q2;
                this.j2 = i17 + 1;
                c2 = cArr5[i17];
            } else {
                c2 = r2("expected a digit for number exponent", (JsonToken) null);
            }
            if (c2 == '-' || c2 == '+') {
                if (i16 >= i5.length) {
                    i5 = this.t2.l();
                    i16 = 0;
                }
                int i18 = i16 + 1;
                i5[i16] = c2;
                int i19 = this.j2;
                if (i19 < this.k2) {
                    char[] cArr6 = this.Q2;
                    this.j2 = i19 + 1;
                    r2 = cArr6[i19];
                } else {
                    r2 = r2("expected a digit for number exponent", (JsonToken) null);
                }
                i16 = i18;
            }
            int i20 = 0;
            char c4 = c2;
            while (true) {
                if (c > '9' || c < '0') {
                    break;
                }
                i20++;
                if (i16 >= i5.length) {
                    i5 = this.t2.l();
                    i16 = 0;
                }
                int i21 = i16 + 1;
                i5[i16] = c;
                if (this.j2 >= this.k2 && !N1()) {
                    i16 = i21;
                    z2 = true;
                    break;
                }
                char[] cArr7 = this.Q2;
                int i22 = this.j2;
                this.j2 = i22 + 1;
                c4 = cArr7[i22];
                i16 = i21;
            }
            i6 = i20;
            if (i6 == 0) {
                l1(c, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this.j2--;
            if (this.r2.f()) {
                q2(c);
            }
        }
        this.t2.j = i2;
        if (i3 >= 1 || i6 >= 1) {
            this.E2 = z;
            this.F2 = i11;
            this.y2 = 0;
            return JsonToken.VALUE_NUMBER_FLOAT;
        }
        this.E2 = z;
        this.F2 = i11;
        this.y2 = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    public final JsonToken a2(int i) throws IOException {
        int i2 = this.j2;
        int i3 = i2 - 1;
        int i4 = this.k2;
        if (i == 48) {
            return Z1(false, i3);
        }
        int i5 = 1;
        while (i2 < i4) {
            int i6 = i2 + 1;
            char c = this.Q2[i2];
            if (c >= '0' && c <= '9') {
                i5++;
                i2 = i6;
            } else if (c == '.' || c == 'e' || c == 'E') {
                this.j2 = i6;
                return U1(c, i3, i6, false, i5);
            } else {
                int i7 = i6 - 1;
                this.j2 = i7;
                if (this.r2.f()) {
                    q2(c);
                }
                this.t2.r(this.Q2, i3, i7 - i3);
                return F1(false, i5);
            }
        }
        this.j2 = i3;
        return Z1(false, i3);
    }

    public final char[] b0() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        if (id != 5) {
            if (id != 6) {
                if (!(id == 7 || id == 8)) {
                    return this.f2.asCharArray();
                }
            } else if (this.V2) {
                this.V2 = false;
                J1();
            }
            return this.t2.n();
        }
        if (!this.v2) {
            String str = this.r2.f;
            int length = str.length();
            char[] cArr = this.u2;
            if (cArr == null) {
                i0.f.a.b.i.b bVar = this.h2;
                bVar.a(bVar.i);
                char[] b = bVar.d.b(3, length);
                bVar.i = b;
                this.u2 = b;
            } else if (cArr.length < length) {
                this.u2 = new char[length];
            }
            str.getChars(0, length, this.u2, 0);
            this.v2 = true;
        }
        return this.u2;
    }

    public int b2(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        Base64Variant base64Variant2 = base64Variant;
        OutputStream outputStream2 = outputStream;
        byte[] bArr2 = bArr;
        int i3 = 3;
        int length = bArr2.length - 3;
        boolean z4 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (this.j2 >= this.k2) {
                O1();
            }
            char[] cArr = this.Q2;
            int i6 = this.j2;
            this.j2 = i6 + 1;
            char c = cArr[i6];
            if (c <= ' ') {
                z = z4;
            } else {
                int e = base64Variant2.e(c);
                if (e < 0) {
                    if (c == '\"') {
                        z2 = z4;
                        break;
                    }
                    e = o1(base64Variant2, c, z4);
                    if (e < 0) {
                        z = z4;
                        continue;
                    }
                }
                if (i4 > length) {
                    i5 += i4;
                    outputStream2.write(bArr2, z4 ? 1 : 0, i4);
                    i = z4;
                } else {
                    i = i4;
                }
                if (this.j2 >= this.k2) {
                    O1();
                }
                char[] cArr2 = this.Q2;
                int i7 = this.j2;
                this.j2 = i7 + 1;
                char c2 = cArr2[i7];
                int e2 = base64Variant2.e(c2);
                if (e2 < 0) {
                    e2 = o1(base64Variant2, c2, 1);
                }
                int i8 = (e << 6) | e2;
                if (this.j2 >= this.k2) {
                    O1();
                }
                char[] cArr3 = this.Q2;
                int i9 = this.j2;
                this.j2 = i9 + 1;
                char c3 = cArr3[i9];
                int e3 = base64Variant2.e(c3);
                if (e3 < 0) {
                    if (e3 != -2) {
                        if (c3 == '\"') {
                            int i10 = i + 1;
                            bArr2[i] = (byte) (i8 >> 4);
                            if (!base64Variant2.Z1) {
                                i4 = i10;
                            } else {
                                this.j2--;
                                t1(base64Variant);
                                throw null;
                            }
                        } else {
                            e3 = o1(base64Variant2, c3, 2);
                        }
                    }
                    if (e3 == -2) {
                        if (this.j2 >= this.k2) {
                            O1();
                        }
                        char[] cArr4 = this.Q2;
                        int i11 = this.j2;
                        this.j2 = i11 + 1;
                        char c4 = cArr4[i11];
                        if (base64Variant2.l(c4) || o1(base64Variant2, c4, i3) == -2) {
                            int i12 = i + 1;
                            bArr2[i] = (byte) (i8 >> 4);
                            z = false;
                            i4 = i12;
                        } else {
                            StringBuilder P0 = i0.d.a.a.a.P0("expected padding character '");
                            P0.append(base64Variant2.y);
                            P0.append("'");
                            throw D1(base64Variant2, c4, i3, P0.toString());
                        }
                    }
                }
                int i13 = (i8 << 6) | e3;
                if (this.j2 >= this.k2) {
                    O1();
                }
                char[] cArr5 = this.Q2;
                int i14 = this.j2;
                this.j2 = i14 + 1;
                char c5 = cArr5[i14];
                int e4 = base64Variant2.e(c5);
                if (e4 < 0) {
                    if (e4 == -2) {
                        z3 = false;
                        i2 = 3;
                    } else if (c5 == '\"') {
                        int i15 = i13 >> 2;
                        int i16 = i + 1;
                        bArr2[i] = (byte) (i15 >> 8);
                        int i17 = i16 + 1;
                        bArr2[i16] = (byte) i15;
                        if (!base64Variant2.Z1) {
                            i4 = i17;
                        } else {
                            this.j2--;
                            t1(base64Variant);
                            throw null;
                        }
                    } else {
                        i2 = 3;
                        e4 = o1(base64Variant2, c5, 3);
                        z3 = false;
                    }
                    if (e4 == -2) {
                        int i18 = i13 >> 2;
                        int i19 = i + 1;
                        bArr2[i] = (byte) (i18 >> 8);
                        bArr2[i19] = (byte) i18;
                        i3 = i2;
                        boolean z5 = z3;
                        i4 = i19 + 1;
                        z = z5;
                    }
                } else {
                    z3 = false;
                    i2 = 3;
                }
                int i20 = (i13 << 6) | e4;
                int i21 = i + 1;
                bArr2[i] = (byte) (i20 >> 16);
                int i22 = i21 + 1;
                bArr2[i21] = (byte) (i20 >> 8);
                int i23 = i22 + 1;
                bArr2[i22] = (byte) i20;
                z = z3;
                i4 = i23;
                i3 = i2;
            }
            z4 = z;
        }
        z2 = false;
        this.V2 = z2;
        if (i4 <= 0) {
            return i5;
        }
        int i24 = i5 + i4;
        outputStream2.write(bArr2, z2 ? 1 : 0, i4);
        return i24;
    }

    public final int c0() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == null) {
            return 0;
        }
        int id = jsonToken.id();
        if (id == 5) {
            return this.r2.f.length();
        }
        if (id != 6) {
            if (!(id == 7 || id == 8)) {
                return this.f2.asCharArray().length;
            }
        } else if (this.V2) {
            this.V2 = false;
            J1();
        }
        return this.t2.t();
    }

    public void c2(String str) throws IOException {
        d2(str, A1());
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 8) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d0() throws java.io.IOException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3.f2
            r1 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L_0x0014
            r2 = 7
            if (r0 == r2) goto L_0x001d
            r2 = 8
            if (r0 == r2) goto L_0x001d
            goto L_0x0024
        L_0x0014:
            boolean r0 = r3.V2
            if (r0 == 0) goto L_0x001d
            r3.V2 = r1
            r3.J1()
        L_0x001d:
            i0.f.a.b.m.i r0 = r3.t2
            int r0 = r0.o()
            return r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.j.f.d0():int");
    }

    public void d2(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.j2 >= this.k2 && !N1()) {
                break;
            }
            char c = this.Q2[this.j2];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.j2++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        b1("Unrecognized token '%s': was expecting %s", sb, str2);
        throw null;
    }

    public final int e2() throws IOException {
        char c;
        while (true) {
            if (this.j2 < this.k2 || N1()) {
                char[] cArr = this.Q2;
                int i = this.j2;
                int i2 = i + 1;
                this.j2 = i2;
                c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        j2();
                    } else if (c != '#' || !o2()) {
                        return c;
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this.m2++;
                    this.n2 = i2;
                } else if (c == 13) {
                    f2();
                } else if (c != 9) {
                    g1(c);
                    throw null;
                }
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0("Unexpected end-of-input within/between ");
                P0.append(this.r2.h());
                P0.append(" entries");
                throw new JsonParseException(this, P0.toString());
            }
        }
        return c;
    }

    public JsonLocation f0() {
        if (this.f2 == JsonToken.FIELD_NAME) {
            long j = this.l2;
            return new JsonLocation(s1(), -1, (this.W2 - 1) + j, this.X2, this.Y2);
        }
        return new JsonLocation(s1(), -1, this.o2 - 1, this.p2, this.q2);
    }

    public final void f2() throws IOException {
        if (this.j2 < this.k2 || N1()) {
            char[] cArr = this.Q2;
            int i = this.j2;
            if (cArr[i] == 10) {
                this.j2 = i + 1;
            }
        }
        this.m2++;
        this.n2 = this.j2;
    }

    public final int g2() throws IOException {
        int i = this.j2;
        if (i + 4 >= this.k2) {
            return h2(false);
        }
        char[] cArr = this.Q2;
        char c = cArr[i];
        if (c == ':') {
            int i2 = i + 1;
            this.j2 = i2;
            char c2 = cArr[i2];
            if (c2 <= ' ') {
                if (c2 == ' ' || c2 == 9) {
                    int i3 = i2 + 1;
                    this.j2 = i3;
                    char c3 = cArr[i3];
                    if (c3 > ' ') {
                        if (c3 == '/' || c3 == '#') {
                            return h2(true);
                        }
                        this.j2 = i3 + 1;
                        return c3;
                    }
                }
                return h2(true);
            } else if (c2 == '/' || c2 == '#') {
                return h2(true);
            } else {
                this.j2 = i2 + 1;
                return c2;
            }
        } else {
            if (c == ' ' || c == 9) {
                int i4 = i + 1;
                this.j2 = i4;
                c = cArr[i4];
            }
            if (c != ':') {
                return h2(false);
            }
            int i5 = this.j2 + 1;
            this.j2 = i5;
            char c4 = cArr[i5];
            if (c4 <= ' ') {
                if (c4 == ' ' || c4 == 9) {
                    int i6 = i5 + 1;
                    this.j2 = i6;
                    char c5 = cArr[i6];
                    if (c5 > ' ') {
                        if (c5 == '/' || c5 == '#') {
                            return h2(true);
                        }
                        this.j2 = i6 + 1;
                        return c5;
                    }
                }
                return h2(true);
            } else if (c4 == '/' || c4 == '#') {
                return h2(true);
            } else {
                this.j2 = i5 + 1;
                return c4;
            }
        }
    }

    public final int h2(boolean z) throws IOException {
        while (true) {
            if (this.j2 < this.k2 || N1()) {
                char[] cArr = this.Q2;
                int i = this.j2;
                int i2 = i + 1;
                this.j2 = i2;
                char c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        j2();
                    } else if (c != '#' || !o2()) {
                        if (z) {
                            return c;
                        }
                        if (c == ':') {
                            z = true;
                        } else {
                            f1(c, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this.m2++;
                    this.n2 = i2;
                } else if (c == 13) {
                    f2();
                } else if (c != 9) {
                    g1(c);
                    throw null;
                }
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0(" within/between ");
                P0.append(this.r2.h());
                P0.append(" entries");
                d1(P0.toString(), (JsonToken) null);
                throw null;
            }
        }
    }

    public final int i2(int i) throws IOException {
        if (i == 44) {
            while (true) {
                int i2 = this.j2;
                if (i2 >= this.k2) {
                    return e2();
                }
                char[] cArr = this.Q2;
                int i3 = i2 + 1;
                this.j2 = i3;
                char c = cArr[i2];
                if (c > ' ') {
                    if (c != '/' && c != '#') {
                        return c;
                    }
                    this.j2 = i3 - 1;
                    return e2();
                } else if (c < ' ') {
                    if (c == 10) {
                        this.m2++;
                        this.n2 = i3;
                    } else if (c == 13) {
                        f2();
                    } else if (c != 9) {
                        g1(c);
                        throw null;
                    }
                }
            }
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("was expecting comma to separate ");
            P0.append(this.r2.h());
            P0.append(" entries");
            f1(i, P0.toString());
            throw null;
        }
    }

    public final void j2() throws IOException {
        if ((this.d & M2) == 0) {
            f1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this.j2 < this.k2 || N1()) {
            char[] cArr = this.Q2;
            int i = this.j2;
            this.j2 = i + 1;
            char c = cArr[i];
            if (c == '/') {
                k2();
            } else if (c == '*') {
                while (true) {
                    if (this.j2 >= this.k2 && !N1()) {
                        break;
                    }
                    char[] cArr2 = this.Q2;
                    int i2 = this.j2;
                    int i3 = i2 + 1;
                    this.j2 = i3;
                    char c2 = cArr2[i2];
                    if (c2 <= '*') {
                        if (c2 == '*') {
                            if (i3 >= this.k2 && !N1()) {
                                break;
                            }
                            char[] cArr3 = this.Q2;
                            int i4 = this.j2;
                            if (cArr3[i4] == '/') {
                                this.j2 = i4 + 1;
                                return;
                            }
                        } else if (c2 >= ' ') {
                            continue;
                        } else if (c2 == 10) {
                            this.m2++;
                            this.n2 = i3;
                        } else if (c2 == 13) {
                            f2();
                        } else if (c2 != 9) {
                            g1(c2);
                            throw null;
                        }
                    }
                }
                d1(" in a comment", (JsonToken) null);
                throw null;
            } else {
                f1(c, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            d1(" in a comment", (JsonToken) null);
            throw null;
        }
    }

    public final void k2() throws IOException {
        while (true) {
            if (this.j2 < this.k2 || N1()) {
                char[] cArr = this.Q2;
                int i = this.j2;
                int i2 = i + 1;
                this.j2 = i2;
                char c = cArr[i];
                if (c < ' ') {
                    if (c == 10) {
                        this.m2++;
                        this.n2 = i2;
                        return;
                    } else if (c == 13) {
                        f2();
                        return;
                    } else if (c != 9) {
                        g1(c);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void l2() throws IOException {
        this.V2 = false;
        int i = this.j2;
        int i2 = this.k2;
        char[] cArr = this.Q2;
        while (true) {
            if (i >= i2) {
                this.j2 = i;
                if (N1()) {
                    i = this.j2;
                    i2 = this.k2;
                } else {
                    d1(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                    throw null;
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this.j2 = i3;
                    q1();
                    i = this.j2;
                    i2 = this.k2;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.j2 = i3;
                        return;
                    } else if (c < ' ') {
                        this.j2 = i3;
                        z1(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    public final int m2() throws IOException {
        if (this.j2 < this.k2 || N1()) {
            char[] cArr = this.Q2;
            int i = this.j2;
            int i2 = i + 1;
            this.j2 = i2;
            char c = cArr[i];
            if (c <= ' ') {
                if (c != ' ') {
                    if (c == 10) {
                        this.m2++;
                        this.n2 = i2;
                    } else if (c == 13) {
                        f2();
                    } else if (c != 9) {
                        g1(c);
                        throw null;
                    }
                }
                while (true) {
                    int i3 = this.j2;
                    if (i3 >= this.k2) {
                        return n2();
                    }
                    char[] cArr2 = this.Q2;
                    int i4 = i3 + 1;
                    this.j2 = i4;
                    char c2 = cArr2[i3];
                    if (c2 > ' ') {
                        if (c2 != '/' && c2 != '#') {
                            return c2;
                        }
                        this.j2 = i4 - 1;
                        return n2();
                    } else if (c2 != ' ') {
                        if (c2 == 10) {
                            this.m2++;
                            this.n2 = i4;
                        } else if (c2 == 13) {
                            f2();
                        } else if (c2 != 9) {
                            g1(c2);
                            throw null;
                        }
                    }
                }
            } else if (c != '/' && c != '#') {
                return c;
            } else {
                this.j2 = i2 - 1;
                return n2();
            }
        } else {
            X0();
            return -1;
        }
    }

    public byte[] n(Base64Variant base64Variant) throws IOException {
        byte[] bArr;
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && (bArr = this.x2) != null) {
            return bArr;
        }
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.V2) {
                try {
                    this.x2 = I1(base64Variant);
                    this.V2 = false;
                } catch (IllegalArgumentException e) {
                    throw new JsonParseException(this, "Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e.getMessage());
                }
            } else if (this.x2 == null) {
                c r1 = r1();
                V0(Z(), r1, base64Variant);
                this.x2 = r1.k();
            }
            return this.x2;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Current token (");
        P0.append(this.f2);
        P0.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        throw new JsonParseException(this, P0.toString());
    }

    public void n1() throws IOException {
        if (this.P2 != null) {
            if (this.h2.c || C0(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.P2.close();
            }
            this.P2 = null;
        }
    }

    public final int n2() throws IOException {
        char c;
        while (true) {
            if (this.j2 < this.k2 || N1()) {
                char[] cArr = this.Q2;
                int i = this.j2;
                int i2 = i + 1;
                this.j2 = i2;
                c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        j2();
                    } else if (c != '#' || !o2()) {
                        return c;
                    }
                } else if (c == ' ') {
                    continue;
                } else if (c == 10) {
                    this.m2++;
                    this.n2 = i2;
                } else if (c == 13) {
                    f2();
                } else if (c != 9) {
                    g1(c);
                    throw null;
                }
            } else {
                X0();
                return -1;
            }
        }
        return c;
    }

    public final boolean o2() throws IOException {
        if ((this.d & N2) == 0) {
            return false;
        }
        k2();
        return true;
    }

    public final void p2() {
        int i = this.j2;
        this.o2 = this.l2 + ((long) i);
        this.p2 = this.m2;
        this.q2 = i - this.n2;
    }

    public char q1() throws IOException {
        if (this.j2 < this.k2 || N1()) {
            char[] cArr = this.Q2;
            int i = this.j2;
            this.j2 = i + 1;
            char c = cArr[i];
            if (c == '\"' || c == '/' || c == '\\') {
                return c;
            }
            if (c == 'b') {
                return 8;
            }
            if (c == 'f') {
                return 12;
            }
            if (c == 'n') {
                return 10;
            }
            if (c == 'r') {
                return 13;
            }
            if (c == 't') {
                return 9;
            }
            if (c != 'u') {
                u1(c);
                return c;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < 4) {
                if (this.j2 < this.k2 || N1()) {
                    char[] cArr2 = this.Q2;
                    int i4 = this.j2;
                    this.j2 = i4 + 1;
                    char c2 = cArr2[i4];
                    int i5 = a.i[c2 & 255];
                    if (i5 >= 0) {
                        i3 = (i3 << 4) | i5;
                        i2++;
                    } else {
                        f1(c2, "expected a hex-digit for character escape sequence");
                        throw null;
                    }
                } else {
                    d1(" in character escape sequence", JsonToken.VALUE_STRING);
                    throw null;
                }
            }
            return (char) i3;
        }
        d1(" in character escape sequence", JsonToken.VALUE_STRING);
        throw null;
    }

    public final void q2(int i) throws IOException {
        int i2 = this.j2 + 1;
        this.j2 = i2;
        if (i == 9) {
            return;
        }
        if (i == 10) {
            this.m2++;
            this.n2 = i2;
        } else if (i == 13) {
            f2();
        } else if (i != 32) {
            f1(i, "Expected space separating root-level values");
            throw null;
        }
    }

    public final String r0() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.V2) {
                this.V2 = false;
                J1();
            }
            return this.t2.h();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return y();
        } else {
            return super.u0((String) null);
        }
    }

    public char r2(String str, JsonToken jsonToken) throws IOException {
        if (this.j2 < this.k2 || N1()) {
            char[] cArr = this.Q2;
            int i = this.j2;
            this.j2 = i + 1;
            return cArr[i];
        }
        d1(str, jsonToken);
        throw null;
    }

    public final String u0(String str) throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.V2) {
                this.V2 = false;
                J1();
            }
            return this.t2.h();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return y();
        } else {
            return super.u0(str);
        }
    }

    public d v() {
        return this.S2;
    }

    public JsonLocation w() {
        return new JsonLocation(s1(), -1, ((long) this.j2) + this.l2, this.m2, (this.j2 - this.n2) + 1);
    }

    public void x1() throws IOException {
        char[] cArr;
        i0.f.a.b.k.b bVar;
        this.t2.p();
        char[] cArr2 = this.u2;
        if (cArr2 != null) {
            this.u2 = null;
            this.h2.f(cArr2);
        }
        i0.f.a.b.k.b bVar2 = this.T2;
        if ((!bVar2.l) && (bVar = bVar2.a) != null && bVar2.e) {
            b.C0119b bVar3 = new b.C0119b(bVar2);
            int i = bVar3.a;
            b.C0119b bVar4 = bVar.b.get();
            if (i != bVar4.a) {
                if (i > 12000) {
                    bVar3 = new b.C0119b(0, 0, new String[64], new b.a[32]);
                }
                bVar.b.compareAndSet(bVar4, bVar3);
            }
            bVar2.l = true;
        }
        if (this.R2 && (cArr = this.Q2) != null) {
            this.Q2 = null;
            i0.f.a.b.i.b bVar5 = this.h2;
            Objects.requireNonNull(bVar5);
            bVar5.c(cArr, bVar5.g);
            bVar5.g = null;
            bVar5.d.d.set(0, cArr);
        }
    }
}
