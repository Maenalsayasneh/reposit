package m0.r.t.a.r.m.a1;

import android.net.Uri;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.NetworkLog;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.CancellationException;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.sequences.SequencesKt__SequencesKt$flatten$1;
import kotlin.sequences.SequencesKt__SequencesKt$flatten$3;
import kotlin.sequences.SequencesKt__SequencesKt$generateSequence$1;
import kotlin.sequences.SequencesKt__SequencesKt$generateSequence$2;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1;
import kotlinx.coroutines.flow.FlowKt__DistinctKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt$buildSerialDescriptor$1;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import m0.l.d;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.q;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.s0;
import m0.s.d;
import n0.a.b2;
import n0.a.c0;
import n0.a.f0;
import n0.a.f1;
import n0.a.f2.d;
import n0.a.g2.d0.m;
import n0.a.h0;
import n0.a.j0;
import n0.a.k1;
import n0.a.l0;
import n0.a.v1;
import n0.a.w1;
import n0.c.i.e;
import n0.c.i.h;
import n0.c.l.a;
import okio.SegmentedByteString;
import org.bouncycastle.crypto.util.SSHNamedCurves;
import org.json.JSONException;
import org.json.JSONObject;
import q0.h0.f.d;
import r0.p;
import r0.r;
import r0.t;
import r0.w;
import r0.x;
import r0.y;
import r0.z;
import s0.a.a.a0;
import s0.a.a.a1;
import s0.a.a.b0;
import s0.a.a.b1;
import s0.a.a.c;
import s0.a.a.c1;
import s0.a.a.d1;
import s0.a.a.e;
import s0.a.a.e0;
import s0.a.a.f1;
import s0.a.a.g;
import s0.a.a.g0;
import s0.a.a.g1;
import s0.a.a.g2.b;
import s0.a.a.h;
import s0.a.a.h1;
import s0.a.a.i0;
import s0.a.a.i1;
import s0.a.a.j1;
import s0.a.a.k;
import s0.a.a.k0;
import s0.a.a.n;
import s0.a.a.n0;
import s0.a.a.o;
import s0.a.a.o0;
import s0.a.a.s;
import s0.a.a.t0;
import s0.a.a.u;
import s0.a.a.u0;
import s0.a.a.v;
import s0.a.a.v0;
import s0.a.b.k0.y0;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.e;
import s0.a.g.j;

/* compiled from: TypeUtils.kt */
public final class a {
    public static void A(int[] iArr, int[] iArr2, int i, int[] iArr3) {
        int length = iArr3.length;
        while (true) {
            length--;
            if (length >= 0) {
                iArr3[length] = iArr[length] ^ iArr2[i + length];
            } else {
                return;
            }
        }
    }

    public static final void A0(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final String A1(long j) {
        String str;
        if (j <= ((long) -999500000)) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= ((long) -999500)) {
            str = ((j - ((long) NetworkLog.SQL_RECORD_CHAR_LIMIT)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < ((long) 999500)) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < ((long) 999500000)) {
            str = ((j + ((long) NetworkLog.SQL_RECORD_CHAR_LIMIT)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        i.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final boolean A2(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        if (z) {
            return 'A' <= charAt && charAt <= 'Z';
        }
        return Character.isUpperCase(charAt);
    }

    public static final w A3(OutputStream outputStream) {
        Logger logger = p.a;
        i.e(outputStream, "$this$sink");
        return new r(outputStream, new z());
    }

    public static void B(String str, boolean z, s0.a.a.r rVar, StringBuffer stringBuffer) {
        String str2;
        String str3;
        StringBuilder sb;
        BigInteger bigInteger;
        StringBuilder sb2;
        String str4;
        String str5;
        StringBuilder sb3;
        int i;
        String str6 = j.a;
        if (rVar instanceof s) {
            Enumeration E = ((s) rVar).E();
            String str7 = str + "    ";
            stringBuffer.append(str);
            stringBuffer.append(rVar instanceof g0 ? "BER Sequence" : rVar instanceof b1 ? "DER Sequence" : "Sequence");
            while (true) {
                stringBuffer.append(str6);
                while (E.hasMoreElements()) {
                    Object nextElement = E.nextElement();
                    if (nextElement == null || nextElement.equals(v0.c)) {
                        stringBuffer.append(str7);
                        stringBuffer.append("NULL");
                    } else {
                        B(str7, z, nextElement instanceof s0.a.a.r ? (s0.a.a.r) nextElement : ((e) nextElement).c(), stringBuffer);
                    }
                }
                return;
            }
        } else if (rVar instanceof s0.a.a.z) {
            String str8 = str + "    ";
            stringBuffer.append(str);
            stringBuffer.append(rVar instanceof k0 ? "BER Tagged [" : "Tagged [");
            s0.a.a.z zVar = (s0.a.a.z) rVar;
            stringBuffer.append(Integer.toString(zVar.c));
            stringBuffer.append(']');
            if (!zVar.d) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(str6);
            B(str8, z, zVar.C(), stringBuffer);
        } else if (rVar instanceof v) {
            v vVar = (v) rVar;
            Objects.requireNonNull(vVar);
            u uVar = new u(vVar);
            String str9 = str + "    ";
            stringBuffer.append(str);
            stringBuffer.append(rVar instanceof i0 ? "BER Set" : rVar instanceof c1 ? "DER Set" : "Set");
            while (true) {
                stringBuffer.append(str6);
                while (uVar.hasMoreElements()) {
                    Object nextElement2 = uVar.nextElement();
                    if (nextElement2 == null) {
                        stringBuffer.append(str9);
                        stringBuffer.append("NULL");
                    } else {
                        B(str9, z, nextElement2 instanceof s0.a.a.r ? (s0.a.a.r) nextElement2 : ((e) nextElement2).c(), stringBuffer);
                    }
                }
                return;
            }
        } else {
            if (rVar instanceof o) {
                o oVar = (o) rVar;
                if (rVar instanceof e0) {
                    sb3 = i0.d.a.a.a.S0(str, "BER Constructed Octet String[");
                    i = oVar.c.length;
                } else {
                    sb3 = i0.d.a.a.a.S0(str, "DER Octet String[");
                    i = oVar.c.length;
                }
                sb3.append(i);
                sb3.append("] ");
                stringBuffer.append(sb3.toString());
                if (z) {
                    str2 = k1(str, oVar.c);
                    stringBuffer.append(str2);
                    return;
                }
            } else {
                if (rVar instanceof n) {
                    sb2 = i0.d.a.a.a.S0(str, "ObjectIdentifier(");
                    sb2.append(((n) rVar).d);
                } else if (rVar instanceof c) {
                    sb2 = i0.d.a.a.a.S0(str, "Boolean(");
                    sb2.append(((c) rVar).E());
                } else {
                    if (rVar instanceof k) {
                        sb2 = i0.d.a.a.a.S0(str, "Integer(");
                        bigInteger = ((k) rVar).E();
                    } else {
                        if (rVar instanceof o0) {
                            o0 o0Var = (o0) rVar;
                            StringBuilder S0 = i0.d.a.a.a.S0(str, "DER Bit String[");
                            S0.append(o0Var.B().length);
                            S0.append(", ");
                            S0.append(o0Var.q);
                            S0.append("] ");
                            stringBuffer.append(S0.toString());
                            if (z) {
                                str2 = k1(str, o0Var.B());
                            }
                        } else {
                            if (rVar instanceof u0) {
                                sb = i0.d.a.a.a.S0(str, "IA5String(");
                                str4 = ((u0) rVar).e();
                            } else if (rVar instanceof f1) {
                                sb = i0.d.a.a.a.S0(str, "UTF8String(");
                                str4 = ((f1) rVar).e();
                            } else if (rVar instanceof a1) {
                                sb = i0.d.a.a.a.S0(str, "PrintableString(");
                                str4 = ((a1) rVar).e();
                            } else if (rVar instanceof i1) {
                                sb = i0.d.a.a.a.S0(str, "VisibleString(");
                                str4 = ((i1) rVar).e();
                            } else if (rVar instanceof n0) {
                                sb = i0.d.a.a.a.S0(str, "BMPString(");
                                str4 = ((n0) rVar).e();
                            } else if (rVar instanceof d1) {
                                sb = i0.d.a.a.a.S0(str, "T61String(");
                                str4 = ((d1) rVar).e();
                            } else if (rVar instanceof t0) {
                                sb = i0.d.a.a.a.S0(str, "GraphicString(");
                                str4 = ((t0) rVar).e();
                            } else if (rVar instanceof h1) {
                                sb = i0.d.a.a.a.S0(str, "VideotexString(");
                                str4 = ((h1) rVar).e();
                            } else if (rVar instanceof a0) {
                                sb = i0.d.a.a.a.S0(str, "UTCTime(");
                                str4 = ((a0) rVar).C();
                            } else if (rVar instanceof s0.a.a.i) {
                                sb = i0.d.a.a.a.S0(str, "GeneralizedTime(");
                                str4 = ((s0.a.a.i) rVar).G();
                            } else {
                                if (rVar instanceof b0) {
                                    str5 = "BER";
                                } else if (rVar instanceof j1) {
                                    str5 = "";
                                } else if (rVar instanceof g) {
                                    sb2 = i0.d.a.a.a.S0(str, "DER Enumerated(");
                                    bigInteger = ((g) rVar).D();
                                } else if (rVar instanceof h) {
                                    h hVar = (h) rVar;
                                    stringBuffer.append(str + "External " + str6);
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(str);
                                    sb4.append("    ");
                                    String sb5 = sb4.toString();
                                    if (hVar.c != null) {
                                        StringBuilder S02 = i0.d.a.a.a.S0(sb5, "Direct Reference: ");
                                        S02.append(hVar.c.d);
                                        S02.append(str6);
                                        stringBuffer.append(S02.toString());
                                    }
                                    if (hVar.d != null) {
                                        StringBuilder S03 = i0.d.a.a.a.S0(sb5, "Indirect Reference: ");
                                        S03.append(hVar.d.toString());
                                        S03.append(str6);
                                        stringBuffer.append(S03.toString());
                                    }
                                    s0.a.a.r rVar2 = hVar.q;
                                    if (rVar2 != null) {
                                        B(sb5, z, rVar2, stringBuffer);
                                    }
                                    StringBuilder S04 = i0.d.a.a.a.S0(sb5, "Encoding: ");
                                    S04.append(hVar.x);
                                    S04.append(str6);
                                    stringBuffer.append(S04.toString());
                                    B(sb5, z, hVar.y, stringBuffer);
                                    return;
                                } else {
                                    sb = i0.d.a.a.a.P0(str);
                                    str3 = rVar.toString();
                                    sb.append(str3);
                                    sb.append(str6);
                                    str2 = sb.toString();
                                }
                                str2 = R2(str5, str, z, rVar, str6);
                            }
                            sb.append(str4);
                            str3 = ") ";
                            sb.append(str3);
                            sb.append(str6);
                            str2 = sb.toString();
                        }
                        stringBuffer.append(str2);
                        return;
                    }
                    sb2.append(bigInteger);
                }
                str3 = ")";
                sb.append(str3);
                sb.append(str6);
                str2 = sb.toString();
                stringBuffer.append(str2);
                return;
            }
            stringBuffer.append(str6);
        }
    }

    public static final int B0(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder Q0 = i0.d.a.a.a.Q0("radix ", i, " was not in valid range ");
        Q0.append(new m0.q.e(2, 36));
        throw new IllegalArgumentException(Q0.toString());
    }

    public static byte[] B1(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if (bArr == null) {
            throw new IllegalArgumentException("Passphrase P must be provided.");
        } else if (bArr2 != null) {
            if (i > 1) {
                if (((i + -1) & i) == 0) {
                    if (i2 == 1 && i >= 65536) {
                        throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
                    } else if (i2 >= 1) {
                        int i5 = i2 * 128;
                        int i6 = Integer.MAX_VALUE / (i5 * 8);
                        if (i3 < 1 || i3 > i6) {
                            throw new IllegalArgumentException(i0.d.a.a.a.j0("Parallelisation parameter p must be >= 1 and <= ", i6, " (based on block size r of ", i2, ")"));
                        } else if (i4 >= 1) {
                            byte[] y = y(bArr, bArr2, i3 * i5);
                            try {
                                int length = y.length >>> 2;
                                int[] iArr = new int[length];
                                int i7 = 0;
                                for (int i8 = 0; i8 < length; i8++) {
                                    iArr[i8] = h3.g2(y, i7);
                                    i7 += 4;
                                }
                                int i9 = i * i2;
                                int i10 = 0;
                                while (i - i10 > 2 && i9 > 1024) {
                                    i10++;
                                    i9 >>>= 1;
                                }
                                int i11 = i5 >>> 2;
                                for (int i12 = 0; i12 < length; i12 += i11) {
                                    x(iArr, i12, i, i10, i2);
                                }
                                h3.E1(iArr, y, 0);
                                byte[] y2 = y(bArr, y, i4);
                                Arrays.fill(y, (byte) 0);
                                e(iArr);
                                return y2;
                            } catch (Throwable th) {
                                if (y != null) {
                                    Arrays.fill(y, (byte) 0);
                                }
                                e((int[]) null);
                                throw th;
                            }
                        } else {
                            throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
                        }
                    } else {
                        throw new IllegalArgumentException("Block size r must be >= 1.");
                    }
                }
            }
            throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
        } else {
            throw new IllegalArgumentException("Salt S must be provided.");
        }
    }

    public static final boolean B2(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final w B3(Socket socket) throws IOException {
        Logger logger = p.a;
        i.e(socket, "$this$sink");
        x xVar = new x(socket);
        OutputStream outputStream = socket.getOutputStream();
        i.d(outputStream, "getOutputStream()");
        r rVar = new r(outputStream, xVar);
        i.e(rVar, "sink");
        return new r0.c(xVar, rVar);
    }

    public static final void C(m0.l.c cVar, Throwable th) {
        cVar.resumeWith(i0.j.f.p.h.l0(th));
        throw th;
    }

    public static s0.a.e.b.h C0(s0.a.e.b.e eVar, s0.a.e.b.h hVar) {
        if (eVar.j(hVar.b)) {
            return eVar.h(hVar.i(false));
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static final <T> m0.s.h<T> C1(T t, l<? super T, ? extends T> lVar) {
        i.e(lVar, "nextFunction");
        if (t == null) {
            return d.a;
        }
        return new m0.s.g(new SequencesKt__SequencesKt$generateSequence$2(t), lVar);
    }

    public static String C2(Iterable<String> iterable) {
        if (iterable == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String next : iterable) {
            x0(!TextUtils.isEmpty(next), "individual scopes cannot be null or empty");
            linkedHashSet.add(next);
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(" ", linkedHashSet);
    }

    public static w C3(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        Logger logger = p.a;
        if ((i & 1) != 0) {
            z = false;
        }
        i.e(file, "$this$sink");
        return A3(new FileOutputStream(file, z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object D(n0.a.g2.e r4, java.lang.Object r5, m0.l.c r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002b:
            java.lang.Object r4 = r0.c
            n0.a.g2.e r4 = (n0.a.g2.e) r4
            i0.j.f.p.h.d4(r6)
            goto L_0x0041
        L_0x0033:
            i0.j.f.p.h.d4(r6)
            r0.c = r4
            r0.q = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.D(n0.a.g2.e, java.lang.Object, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ boolean D0(n0.a.f2.r rVar, Throwable th, int i, Object obj) {
        int i2 = i & 1;
        return rVar.o((Throwable) null);
    }

    public static final <T> m0.s.h<T> D1(m0.n.a.a<? extends T> aVar) {
        i.e(aVar, "nextFunction");
        m0.s.g gVar = new m0.s.g(aVar, new SequencesKt__SequencesKt$generateSequence$1(aVar));
        i.e(gVar, "$this$constrainOnce");
        return gVar instanceof m0.s.a ? gVar : new m0.s.a(gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object D2(n0.a.f1[] r6, m0.l.c<? super m0.i> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.AwaitKt$joinAll$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = (kotlinx.coroutines.AwaitKt$joinAll$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = new kotlinx.coroutines.AwaitKt$joinAll$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.x
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            int r6 = r0.q
            int r2 = r0.d
            java.lang.Object r4 = r0.c
            n0.a.f1[] r4 = (n0.a.f1[]) r4
            i0.j.f.p.h.d4(r7)
            r7 = r4
            goto L_0x0054
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            i0.j.f.p.h.d4(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r5
        L_0x0041:
            if (r6 >= r2) goto L_0x0056
            r4 = r7[r6]
            r0.c = r7
            r0.d = r2
            r0.q = r6
            r0.y = r3
            java.lang.Object r4 = r4.l(r0)
            if (r4 != r1) goto L_0x0054
            return r1
        L_0x0054:
            int r6 = r6 + r3
            goto L_0x0041
        L_0x0056:
            m0.i r6 = m0.i.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.D2(n0.a.f1[], m0.l.c):java.lang.Object");
    }

    public static final y D3(InputStream inputStream) {
        Logger logger = p.a;
        i.e(inputStream, "$this$source");
        return new r0.o(inputStream, new z());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: n0.a.f2.r} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (d1(r8, r0) == r1) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (d1(r6, r0) != r1) goto L_0x007d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object E(long r6, long r8, n0.a.f2.r r10, m0.l.c r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x0050
            if (r2 == r3) goto L_0x0045
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            long r6 = r0.c
            java.lang.Object r8 = r0.d
            n0.a.f2.r r8 = (n0.a.f2.r) r8
            i0.j.f.p.h.d4(r11)
            goto L_0x007d
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            long r6 = r0.c
            java.lang.Object r8 = r0.d
            n0.a.f2.r r8 = (n0.a.f2.r) r8
            i0.j.f.p.h.d4(r11)
            goto L_0x0070
        L_0x0045:
            long r6 = r0.c
            java.lang.Object r8 = r0.d
            r10 = r8
            n0.a.f2.r r10 = (n0.a.f2.r) r10
            i0.j.f.p.h.d4(r11)
            goto L_0x0060
        L_0x0050:
            i0.j.f.p.h.d4(r11)
            r0.d = r10
            r0.c = r6
            r0.x = r3
            java.lang.Object r8 = d1(r8, r0)
            if (r8 != r1) goto L_0x0060
            goto L_0x007c
        L_0x0060:
            m0.i r8 = m0.i.a
            r0.d = r10
            r0.c = r6
            r0.x = r5
            java.lang.Object r8 = r10.t(r8, r0)
            if (r8 != r1) goto L_0x006f
            goto L_0x007c
        L_0x006f:
            r8 = r10
        L_0x0070:
            r0.d = r8
            r0.c = r6
            r0.x = r4
            java.lang.Object r9 = d1(r6, r0)
            if (r9 != r1) goto L_0x007d
        L_0x007c:
            return r1
        L_0x007d:
            r10 = r8
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.E(long, long, n0.a.f2.r, m0.l.c):java.lang.Object");
    }

    public static final <T> Object E0(n0.a.g2.d<? extends T> dVar, m0.n.a.p<? super T, ? super m0.l.c<? super m0.i>, ? extends Object> pVar, m0.l.c<? super m0.i> cVar) {
        int i = n0.a.g2.k.a;
        Object collect = d0(new ChannelFlowTransformLatest(new FlowKt__MergeKt$mapLatest$1(pVar, (m0.l.c<? super FlowKt__MergeKt$mapLatest$1>) null), dVar, (m0.l.e) null, 0, (BufferOverflow) null, 28), 0, (BufferOverflow) null, 2, (Object) null).collect(m.c, cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (collect != coroutineSingletons) {
            collect = m0.i.a;
        }
        return collect == coroutineSingletons ? collect : m0.i.a;
    }

    public static final Boolean E1(JsonPrimitive jsonPrimitive) {
        i.e(jsonPrimitive, "$this$booleanOrNull");
        return n0.c.l.q.u.b(jsonPrimitive.b());
    }

    public static n0.a.f1 E2(f0 f0Var, m0.l.e eVar, CoroutineStart coroutineStart, m0.n.a.p pVar, int i, Object obj) {
        n0.a.d dVar;
        if ((i & 1) != 0) {
            eVar = EmptyCoroutineContext.c;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        m0.l.e a = c0.a(f0Var, eVar);
        if (coroutineStart.isLazy()) {
            dVar = new k1(a, pVar);
        } else {
            dVar = new v1(a, true);
        }
        coroutineStart.invoke(pVar, dVar, dVar);
        return dVar;
    }

    public static final y E3(Socket socket) throws IOException {
        Logger logger = p.a;
        i.e(socket, "$this$source");
        x xVar = new x(socket);
        InputStream inputStream = socket.getInputStream();
        i.d(inputStream, "getInputStream()");
        r0.o oVar = new r0.o(inputStream, xVar);
        i.e(oVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        return new r0.d(xVar, oVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e1, code lost:
        if (d1(r12 / 1000000, r1) != r2) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object F(long r21, long r23, n0.a.f2.r r25, m0.l.c r26) {
        /*
            r0 = r26
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1) r1
            int r2 = r1.y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.y = r2
            goto L_0x001a
        L_0x0015:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.x
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.y
            r4 = 1
            r5 = 4
            r6 = 3
            r7 = 2
            if (r3 == 0) goto L_0x0064
            if (r3 == r4) goto L_0x0056
            if (r3 == r7) goto L_0x0049
            if (r3 == r6) goto L_0x0037
            if (r3 != r5) goto L_0x002f
            goto L_0x0037
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0037:
            long r3 = r1.d
            long r8 = r1.c
            java.lang.Object r10 = r1.q
            n0.a.f2.r r10 = (n0.a.f2.r) r10
            i0.j.f.p.h.d4(r0)
            r0 = r10
        L_0x0043:
            r19 = r3
            r3 = r8
            r8 = r19
            goto L_0x008a
        L_0x0049:
            long r3 = r1.d
            long r8 = r1.c
            java.lang.Object r10 = r1.q
            n0.a.f2.r r10 = (n0.a.f2.r) r10
            i0.j.f.p.h.d4(r0)
            r0 = r10
            goto L_0x00a1
        L_0x0056:
            long r3 = r1.d
            long r8 = r1.c
            java.lang.Object r10 = r1.q
            n0.a.f2.r r10 = (n0.a.f2.r) r10
            i0.j.f.p.h.d4(r0)
            r0 = r10
            r10 = r8
            goto L_0x0086
        L_0x0064:
            i0.j.f.p.h.d4(r0)
            long r8 = java.lang.System.nanoTime()
            long r10 = n0.a.v0.a(r23)
            long r8 = r8 + r10
            r0 = r25
            r1.q = r0
            r10 = r21
            r1.c = r10
            r1.d = r8
            r1.y = r4
            r3 = r23
            java.lang.Object r3 = d1(r3, r1)
            if (r3 != r2) goto L_0x0085
            goto L_0x00e3
        L_0x0085:
            r3 = r8
        L_0x0086:
            long r8 = n0.a.v0.a(r10)
        L_0x008a:
            long r3 = r3 + r8
            m0.i r10 = m0.i.a
            r1.q = r0
            r1.c = r3
            r1.d = r8
            r1.y = r7
            java.lang.Object r10 = r0.t(r10, r1)
            if (r10 != r2) goto L_0x009c
            goto L_0x00e3
        L_0x009c:
            r19 = r3
            r3 = r8
            r8 = r19
        L_0x00a1:
            long r10 = java.lang.System.nanoTime()
            long r12 = r8 - r10
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x00ae
            r12 = r14
        L_0x00ae:
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r17 = 1000000(0xf4240, double:4.940656E-318)
            if (r16 != 0) goto L_0x00d3
            int r14 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r14 == 0) goto L_0x00d3
            long r8 = r10 - r8
            long r8 = r8 % r3
            long r8 = r3 - r8
            long r10 = r10 + r8
            long r8 = r8 / r17
            r1.q = r0
            r1.c = r10
            r1.d = r3
            r1.y = r6
            java.lang.Object r8 = d1(r8, r1)
            if (r8 != r2) goto L_0x00d0
            goto L_0x00e3
        L_0x00d0:
            r8 = r3
            r3 = r10
            goto L_0x008a
        L_0x00d3:
            long r12 = r12 / r17
            r1.q = r0
            r1.c = r8
            r1.d = r3
            r1.y = r5
            java.lang.Object r10 = d1(r12, r1)
            if (r10 != r2) goto L_0x0043
        L_0x00e3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.F(long, long, n0.a.f2.r, m0.l.c):java.lang.Object");
    }

    public static final <R, T> Object F0(n0.a.g2.e<? super R> eVar, n0.a.g2.d<? extends T>[] dVarArr, m0.n.a.a<T[]> aVar, q<? super n0.a.g2.e<? super R>, ? super T[], ? super m0.l.c<? super m0.i>, ? extends Object> qVar, m0.l.c<? super m0.i> cVar) {
        Object z1 = z1(new CombineKt$combineInternal$2(dVarArr, aVar, qVar, eVar, (m0.l.c<? super CombineKt$combineInternal$2>) null), cVar);
        if (z1 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return z1;
        }
        return m0.i.a;
    }

    public static final f F1(m0.r.t.a.r.m.v vVar) {
        i.e(vVar, "<this>");
        f m = vVar.I0().m();
        i.d(m, "constructor.builtIns");
        return m;
    }

    public static final <T> n0.a.f1 F2(n0.a.g2.d<? extends T> dVar, f0 f0Var) {
        return E2(f0Var, (m0.l.e) null, (CoroutineStart) null, new FlowKt__CollectKt$launchIn$1(dVar, (m0.l.c<? super FlowKt__CollectKt$launchIn$1>) null), 3, (Object) null);
    }

    public static void F3(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        l2(jArr, jArr3);
        e3(jArr3, jArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object G(n0.a.g2.e r4, m0.n.a.q r5, java.lang.Throwable r6, m0.l.c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r4 = r0.c
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            i0.j.f.p.h.d4(r7)     // Catch:{ all -> 0x0045 }
            goto L_0x0042
        L_0x002c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0034:
            i0.j.f.p.h.d4(r7)
            r0.c = r6     // Catch:{ all -> 0x0045 }
            r0.q = r3     // Catch:{ all -> 0x0045 }
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch:{ all -> 0x0045 }
            if (r4 != r1) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            m0.i r1 = m0.i.a
        L_0x0044:
            return r1
        L_0x0045:
            r4 = move-exception
            if (r6 == 0) goto L_0x004d
            if (r6 == r4) goto L_0x004d
            i0.j.f.p.h.m(r4, r6)
        L_0x004d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.G(n0.a.g2.e, m0.n.a.q, java.lang.Throwable, m0.l.c):java.lang.Object");
    }

    public static final <T> List<T> G0(ArrayList<T> arrayList) {
        i.e(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return EmptyList.c;
        }
        if (size == 1) {
            return i0.j.f.p.h.L2(m0.j.g.u(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r0 = (s0.a.a.d3.i) s0.a.a.d3.e.y.get(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static s0.a.a.d3.h G1(java.lang.String r3) {
        /*
            java.util.Hashtable r0 = s0.a.a.d3.e.x
            java.lang.String r1 = s0.a.g.j.d(r3)
            java.lang.Object r0 = r0.get(r1)
            s0.a.a.n r0 = (s0.a.a.n) r0
            r1 = 0
            if (r0 == 0) goto L_0x001e
            java.util.Hashtable r2 = s0.a.a.d3.e.y
            java.lang.Object r0 = r2.get(r0)
            s0.a.a.d3.i r0 = (s0.a.a.d3.i) r0
            if (r0 == 0) goto L_0x001e
            s0.a.a.d3.h r0 = r0.b()
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            if (r0 != 0) goto L_0x0035
            java.util.Hashtable r0 = s0.a.a.y2.c.H
            java.lang.String r2 = s0.a.g.j.d(r3)
            java.lang.Object r0 = r0.get(r2)
            s0.a.a.n r0 = (s0.a.a.n) r0
            if (r0 != 0) goto L_0x0031
            r0 = r1
            goto L_0x0035
        L_0x0031:
            s0.a.a.d3.h r0 = s0.a.a.y2.c.e(r0)
        L_0x0035:
            if (r0 != 0) goto L_0x004b
            java.util.Hashtable r0 = s0.a.a.r2.a.a
            java.lang.String r2 = s0.a.g.j.g(r3)
            java.lang.Object r0 = r0.get(r2)
            s0.a.a.n r0 = (s0.a.a.n) r0
            if (r0 == 0) goto L_0x004a
            s0.a.a.d3.h r0 = s0.a.a.y2.c.e(r0)
            goto L_0x004b
        L_0x004a:
            r0 = r1
        L_0x004b:
            if (r0 != 0) goto L_0x006b
            java.util.Hashtable r0 = s0.a.a.z2.a.o
            java.lang.String r2 = s0.a.g.j.d(r3)
            java.lang.Object r0 = r0.get(r2)
            s0.a.a.n r0 = (s0.a.a.n) r0
            if (r0 == 0) goto L_0x006a
            java.util.Hashtable r2 = s0.a.a.z2.a.p
            java.lang.Object r0 = r2.get(r0)
            s0.a.a.d3.i r0 = (s0.a.a.d3.i) r0
            if (r0 == 0) goto L_0x006a
            s0.a.a.d3.h r0 = r0.b()
            goto L_0x006b
        L_0x006a:
            r0 = r1
        L_0x006b:
            if (r0 != 0) goto L_0x008c
            java.util.Hashtable r0 = s0.a.a.b2.a.b
            java.lang.String r2 = s0.a.g.j.d(r3)
            java.lang.Object r0 = r0.get(r2)
            s0.a.a.n r0 = (s0.a.a.n) r0
            if (r0 != 0) goto L_0x007c
            goto L_0x0086
        L_0x007c:
            java.util.Hashtable r2 = s0.a.a.b2.a.c
            java.lang.Object r0 = r2.get(r0)
            s0.a.a.d3.i r0 = (s0.a.a.d3.i) r0
            if (r0 != 0) goto L_0x0088
        L_0x0086:
            r0 = r1
            goto L_0x008c
        L_0x0088:
            s0.a.a.d3.h r0 = r0.b()
        L_0x008c:
            if (r0 != 0) goto L_0x009e
            java.util.Hashtable r0 = s0.a.a.g2.b.a
            java.lang.Object r0 = r0.get(r3)
            s0.a.a.n r0 = (s0.a.a.n) r0
            if (r0 != 0) goto L_0x009a
            r0 = r1
            goto L_0x009e
        L_0x009a:
            s0.a.a.d3.h r0 = s0.a.a.g2.b.a(r0)
        L_0x009e:
            if (r0 != 0) goto L_0x00bf
            java.util.Hashtable r0 = s0.a.a.j2.a.c
            java.lang.String r3 = s0.a.g.j.d(r3)
            java.lang.Object r3 = r0.get(r3)
            s0.a.a.n r3 = (s0.a.a.n) r3
            if (r3 != 0) goto L_0x00af
            goto L_0x00be
        L_0x00af:
            java.util.Hashtable r0 = s0.a.a.j2.a.d
            java.lang.Object r3 = r0.get(r3)
            s0.a.a.d3.i r3 = (s0.a.a.d3.i) r3
            if (r3 != 0) goto L_0x00ba
            goto L_0x00be
        L_0x00ba:
            s0.a.a.d3.h r1 = r3.b()
        L_0x00be:
            r0 = r1
        L_0x00bf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.G1(java.lang.String):s0.a.a.d3.h");
    }

    public static final m0.r.t.a.r.o.i<MemberScope> G2(Iterable<? extends MemberScope> iterable) {
        i.e(iterable, "scopes");
        m0.r.t.a.r.o.i<MemberScope> iVar = new m0.r.t.a.r.o.i<>();
        for (Object next : iterable) {
            MemberScope memberScope = (MemberScope) next;
            if ((memberScope == null || memberScope == MemberScope.a.b) ? false : true) {
                iVar.add(next);
            }
        }
        return iVar;
    }

    public static void G3(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[4];
        l2(jArr, jArr3);
        while (true) {
            e3(jArr3, jArr2);
            i--;
            if (i > 0) {
                l2(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    public static final void H(q0.h0.f.a aVar, q0.h0.f.c cVar, String str) {
        d.b bVar = q0.h0.f.d.c;
        Logger logger = q0.h0.f.d.b;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f);
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        i.d(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.c);
        logger.fine(sb.toString());
    }

    public static final <T> Collection<T> H0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        i.e(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static s0.a.a.d3.h H1(n nVar) {
        s0.a.a.d3.i iVar = (s0.a.a.d3.i) s0.a.a.d3.e.y.get(nVar);
        s0.a.a.d3.h hVar = null;
        s0.a.a.d3.h b = iVar != null ? iVar.b() : null;
        if (b == null) {
            b = s0.a.a.y2.c.e(nVar);
        }
        if (b == null) {
            s0.a.a.d3.i iVar2 = (s0.a.a.d3.i) s0.a.a.z2.a.p.get(nVar);
            b = iVar2 != null ? iVar2.b() : null;
        }
        if (b == null) {
            s0.a.a.d3.i iVar3 = (s0.a.a.d3.i) s0.a.a.b2.a.c.get(nVar);
            b = iVar3 == null ? null : iVar3.b();
        }
        if (b == null) {
            b = b.a(nVar);
        }
        if (b != null) {
            return b;
        }
        s0.a.a.d3.i iVar4 = (s0.a.a.d3.i) s0.a.a.j2.a.d.get(nVar);
        if (iVar4 != null) {
            hVar = iVar4.b();
        }
        return hVar;
    }

    public static final m0.r.t.a.r.m.v H2(m0.r.t.a.r.m.v vVar) {
        i.e(vVar, "<this>");
        m0.r.t.a.r.m.v i = s0.i(vVar);
        i.d(i, "makeNotNullable(this)");
        return i;
    }

    public static final <T> void H3(l<? super m0.l.c<? super T>, ? extends Object> lVar, m0.l.c<? super T> cVar) {
        try {
            n0.a.h2.h.b(i0.j.f.p.h.b2(i0.j.f.p.h.e0(lVar, cVar)), m0.i.a, (l) null, 2);
        } catch (Throwable th) {
            C(cVar, th);
            throw null;
        }
    }

    public static void I(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01b7, code lost:
        if (r3 == 0) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0130, code lost:
        if (r8 == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0132, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0177, code lost:
        if (r6 == false) goto L_0x0179;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0174 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ec A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x018e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x018f A[SYNTHETIC, Splitter:B:99:0x018f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> kotlinx.serialization.KSerializer<T> I0(m0.r.d<T> r14, kotlinx.serialization.KSerializer<java.lang.Object>... r15) {
        /*
            java.lang.Class<kotlinx.serialization.PolymorphicSerializer> r0 = kotlinx.serialization.PolymorphicSerializer.class
            java.lang.Class<kotlinx.serialization.KSerializer> r1 = kotlinx.serialization.KSerializer.class
            java.lang.String r2 = "$this$constructSerializerForGivenTypeArgs"
            m0.n.b.i.e(r14, r2)
            java.lang.String r2 = "args"
            m0.n.b.i.e(r15, r2)
            java.lang.Class r2 = i0.j.f.p.h.l1(r14)
            boolean r3 = r2.isEnum()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0049
            java.lang.Class<n0.c.e> r3 = n0.c.e.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            if (r3 != 0) goto L_0x002c
            java.lang.Class<n0.c.c> r3 = n0.c.c.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            if (r3 != 0) goto L_0x002c
            r3 = r5
            goto L_0x002d
        L_0x002c:
            r3 = r4
        L_0x002d:
            if (r3 == 0) goto L_0x0049
            java.lang.Object[] r14 = r2.getEnumConstants()
            kotlinx.serialization.internal.EnumSerializer r15 = new kotlinx.serialization.internal.EnumSerializer
            java.lang.String r0 = r2.getCanonicalName()
            java.lang.String r1 = "canonicalName"
            m0.n.b.i.d(r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>"
            java.util.Objects.requireNonNull(r14, r1)
            java.lang.Enum[] r14 = (java.lang.Enum[]) r14
            r15.<init>(r0, r14)
            return r15
        L_0x0049:
            boolean r3 = r2.isInterface()
            r6 = 0
            if (r3 == 0) goto L_0x0076
            java.lang.Class r15 = i0.j.f.p.h.l1(r14)
            java.lang.Class<n0.c.e> r1 = n0.c.e.class
            java.lang.annotation.Annotation r15 = r15.getAnnotation(r1)
            n0.c.e r15 = (n0.c.e) r15
            if (r15 == 0) goto L_0x0070
            java.lang.Class r15 = r15.with()
            m0.r.d r15 = m0.n.b.m.a(r15)
            m0.r.d r0 = m0.n.b.m.a(r0)
            boolean r15 = m0.n.b.i.a(r15, r0)
            if (r15 == 0) goto L_0x0075
        L_0x0070:
            kotlinx.serialization.PolymorphicSerializer r6 = new kotlinx.serialization.PolymorphicSerializer
            r6.<init>(r14)
        L_0x0075:
            return r6
        L_0x0076:
            int r3 = r15.length
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r3)
            kotlinx.serialization.KSerializer[] r15 = (kotlinx.serialization.KSerializer[]) r15
            java.lang.String r3 = "Companion"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0090 }
            java.lang.String r7 = "companion"
            m0.n.b.i.d(r3, r7)     // Catch:{ all -> 0x0090 }
            r3.setAccessible(r5)     // Catch:{ all -> 0x0090 }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x0090 }
            goto L_0x0091
        L_0x0090:
            r3 = r6
        L_0x0091:
            java.lang.String r7 = "serializer"
            if (r3 == 0) goto L_0x00e9
            int r8 = r15.length     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            if (r8 != 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r5 = r4
        L_0x009a:
            if (r5 == 0) goto L_0x009f
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            goto L_0x00ab
        L_0x009f:
            int r5 = r15.length     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            r9 = r4
        L_0x00a3:
            if (r9 >= r5) goto L_0x00aa
            r8[r9] = r1     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            int r9 = r9 + 1
            goto L_0x00a3
        L_0x00aa:
            r5 = r8
        L_0x00ab:
            java.lang.Class r8 = r3.getClass()     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            int r9 = r5.length     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r9)     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            java.lang.Class[] r5 = (java.lang.Class[]) r5     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            java.lang.reflect.Method r5 = r8.getDeclaredMethod(r7, r5)     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            int r8 = r15.length     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r8)     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            java.lang.Object r15 = r5.invoke(r3, r15)     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            boolean r3 = r15 instanceof kotlinx.serialization.KSerializer     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            if (r3 != 0) goto L_0x00c8
            r15 = r6
        L_0x00c8:
            kotlinx.serialization.KSerializer r15 = (kotlinx.serialization.KSerializer) r15     // Catch:{ NoSuchMethodException -> 0x00e9, InvocationTargetException -> 0x00cb }
            goto L_0x00ea
        L_0x00cb:
            r14 = move-exception
            java.lang.Throwable r15 = r14.getCause()
            if (r15 == 0) goto L_0x00e8
            java.lang.String r0 = "e.cause ?: throw e"
            m0.n.b.i.d(r15, r0)
            java.lang.reflect.InvocationTargetException r0 = new java.lang.reflect.InvocationTargetException
            java.lang.String r1 = r15.getMessage()
            if (r1 == 0) goto L_0x00e0
            goto L_0x00e4
        L_0x00e0:
            java.lang.String r1 = r14.getMessage()
        L_0x00e4:
            r0.<init>(r15, r1)
            throw r0
        L_0x00e8:
            throw r14
        L_0x00e9:
            r15 = r6
        L_0x00ea:
            if (r15 == 0) goto L_0x00ed
            return r15
        L_0x00ed:
            java.lang.reflect.Field[] r15 = r2.getDeclaredFields()
            java.lang.String r3 = "jClass.declaredFields"
            m0.n.b.i.d(r15, r3)
            int r3 = r15.length
            r5 = r4
            r8 = r5
            r9 = r6
        L_0x00fa:
            java.lang.String r10 = "INSTANCE"
            java.lang.String r11 = "it"
            if (r5 >= r3) goto L_0x0130
            r12 = r15[r5]
            m0.n.b.i.d(r12, r11)
            java.lang.String r13 = r12.getName()
            boolean r13 = m0.n.b.i.a(r13, r10)
            if (r13 == 0) goto L_0x0125
            java.lang.Class r13 = r12.getType()
            boolean r13 = m0.n.b.i.a(r13, r2)
            if (r13 == 0) goto L_0x0125
            int r13 = r12.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isStatic(r13)
            if (r13 == 0) goto L_0x0125
            r13 = 1
            goto L_0x0126
        L_0x0125:
            r13 = r4
        L_0x0126:
            if (r13 == 0) goto L_0x012d
            if (r8 == 0) goto L_0x012b
            goto L_0x0132
        L_0x012b:
            r8 = 1
            r9 = r12
        L_0x012d:
            int r5 = r5 + 1
            goto L_0x00fa
        L_0x0130:
            if (r8 != 0) goto L_0x0133
        L_0x0132:
            r9 = r6
        L_0x0133:
            if (r9 == 0) goto L_0x018b
            java.lang.Object r15 = r9.get(r6)
            java.lang.reflect.Method[] r3 = r2.getMethods()
            java.lang.String r5 = "jClass.methods"
            m0.n.b.i.d(r3, r5)
            int r5 = r3.length
            r8 = r6
            r6 = r4
        L_0x0145:
            if (r4 >= r5) goto L_0x0177
            r9 = r3[r4]
            boolean r12 = i0.d.a.a.a.z(r9, r11, r7)
            if (r12 == 0) goto L_0x016c
            java.lang.Class[] r12 = r9.getParameterTypes()
            java.lang.String r13 = "it.parameterTypes"
            m0.n.b.i.d(r12, r13)
            int r12 = r12.length
            if (r12 != 0) goto L_0x015d
            r12 = 1
            goto L_0x015e
        L_0x015d:
            r12 = 0
        L_0x015e:
            if (r12 == 0) goto L_0x016c
            java.lang.Class r12 = r9.getReturnType()
            boolean r12 = m0.n.b.i.a(r12, r1)
            if (r12 == 0) goto L_0x016c
            r12 = 1
            goto L_0x016d
        L_0x016c:
            r12 = 0
        L_0x016d:
            if (r12 == 0) goto L_0x0174
            if (r6 == 0) goto L_0x0172
            goto L_0x0179
        L_0x0172:
            r6 = 1
            r8 = r9
        L_0x0174:
            int r4 = r4 + 1
            goto L_0x0145
        L_0x0177:
            if (r6 != 0) goto L_0x017a
        L_0x0179:
            r8 = 0
        L_0x017a:
            r4 = 0
            if (r8 == 0) goto L_0x018b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Object r15 = r8.invoke(r15, r1)
            boolean r1 = r15 instanceof kotlinx.serialization.KSerializer
            if (r1 != 0) goto L_0x0188
            r15 = 0
        L_0x0188:
            kotlinx.serialization.KSerializer r15 = (kotlinx.serialization.KSerializer) r15
            goto L_0x018c
        L_0x018b:
            r15 = 0
        L_0x018c:
            if (r15 == 0) goto L_0x018f
            return r15
        L_0x018f:
            java.lang.Class[] r15 = r2.getDeclaredClasses()     // Catch:{ NoSuchFieldException -> 0x01d2 }
            java.lang.String r1 = "jClass.declaredClasses"
            m0.n.b.i.d(r15, r1)     // Catch:{ NoSuchFieldException -> 0x01d2 }
            int r1 = r15.length     // Catch:{ NoSuchFieldException -> 0x01d2 }
            r2 = 0
            r3 = r4
        L_0x019b:
            if (r4 >= r1) goto L_0x01b7
            r5 = r15[r4]     // Catch:{ NoSuchFieldException -> 0x01d2 }
            m0.n.b.i.d(r5, r11)     // Catch:{ NoSuchFieldException -> 0x01d2 }
            java.lang.String r6 = r5.getSimpleName()     // Catch:{ NoSuchFieldException -> 0x01d2 }
            java.lang.String r7 = "$serializer"
            boolean r6 = m0.n.b.i.a(r6, r7)     // Catch:{ NoSuchFieldException -> 0x01d2 }
            if (r6 == 0) goto L_0x01b4
            if (r3 == 0) goto L_0x01b1
            goto L_0x01b9
        L_0x01b1:
            r2 = 1
            r3 = r2
            r2 = r5
        L_0x01b4:
            int r4 = r4 + 1
            goto L_0x019b
        L_0x01b7:
            if (r3 != 0) goto L_0x01ba
        L_0x01b9:
            r2 = 0
        L_0x01ba:
            if (r2 == 0) goto L_0x01c8
            java.lang.reflect.Field r15 = r2.getField(r10)     // Catch:{ NoSuchFieldException -> 0x01d2 }
            if (r15 == 0) goto L_0x01c8
            r1 = 0
            java.lang.Object r15 = r15.get(r1)     // Catch:{ NoSuchFieldException -> 0x01d3 }
            goto L_0x01ca
        L_0x01c8:
            r15 = 0
            r1 = r15
        L_0x01ca:
            boolean r2 = r15 instanceof kotlinx.serialization.KSerializer     // Catch:{ NoSuchFieldException -> 0x01d3 }
            if (r2 != 0) goto L_0x01cf
            r15 = r1
        L_0x01cf:
            kotlinx.serialization.KSerializer r15 = (kotlinx.serialization.KSerializer) r15     // Catch:{ NoSuchFieldException -> 0x01d3 }
            goto L_0x01d4
        L_0x01d2:
            r1 = 0
        L_0x01d3:
            r15 = r1
        L_0x01d4:
            if (r15 == 0) goto L_0x01d7
            return r15
        L_0x01d7:
            java.lang.Class r15 = i0.j.f.p.h.l1(r14)
            java.lang.Class<n0.c.c> r2 = n0.c.c.class
            java.lang.annotation.Annotation r2 = r15.getAnnotation(r2)
            if (r2 == 0) goto L_0x01e9
            kotlinx.serialization.PolymorphicSerializer r1 = new kotlinx.serialization.PolymorphicSerializer
            r1.<init>(r14)
            goto L_0x020a
        L_0x01e9:
            java.lang.Class<n0.c.e> r2 = n0.c.e.class
            java.lang.annotation.Annotation r15 = r15.getAnnotation(r2)
            n0.c.e r15 = (n0.c.e) r15
            if (r15 == 0) goto L_0x020a
            java.lang.Class r15 = r15.with()
            m0.r.d r15 = m0.n.b.m.a(r15)
            m0.r.d r0 = m0.n.b.m.a(r0)
            boolean r15 = m0.n.b.i.a(r15, r0)
            if (r15 == 0) goto L_0x020a
            kotlinx.serialization.PolymorphicSerializer r1 = new kotlinx.serialization.PolymorphicSerializer
            r1.<init>(r14)
        L_0x020a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.I0(m0.r.d, kotlinx.serialization.KSerializer[]):kotlinx.serialization.KSerializer");
    }

    public static final String I1(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final m0.r.t.a.r.m.v I2(m0.r.t.a.r.m.v vVar) {
        i.e(vVar, "<this>");
        m0.r.t.a.r.m.v j = s0.j(vVar, true);
        i.d(j, "makeNullable(this)");
        return j;
    }

    public static void I3(m0.n.a.p pVar, Object obj, m0.l.c cVar, l lVar, int i) {
        int i2 = i & 4;
        try {
            n0.a.h2.h.a(i0.j.f.p.h.b2(i0.j.f.p.h.f0(pVar, obj, cVar)), m0.i.a, (l<? super Throwable, m0.i>) null);
        } catch (Throwable th) {
            C(cVar, th);
            throw null;
        }
    }

    public static void J(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static final <T> n0.a.g2.d<T> J0(n0.a.f2.n<? extends T> nVar) {
        return new n0.a.g2.a(nVar, true, (m0.l.e) null, 0, (BufferOverflow) null, 28);
    }

    public static int J1(s0.a.e.b.e eVar) {
        BigInteger bigInteger = eVar.d;
        return bigInteger == null ? eVar.l() + 1 : bigInteger.bitLength();
    }

    public static JSONObject J2(Map<String, String> map) {
        Objects.requireNonNull(map);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            z0(next.getKey(), "map entries must not have null keys");
            z0(next.getValue(), "map entries must not have null values");
            Y2(jSONObject, (String) next.getKey(), (String) next.getValue());
        }
        return jSONObject;
    }

    public static final <R, T> void J3(m0.n.a.p<? super R, ? super m0.l.c<? super T>, ? extends Object> pVar, R r, m0.l.c<? super T> cVar) {
        i.e(cVar, "completion");
        if (pVar != null) {
            try {
                m0.n.b.r.c(pVar, 2);
                Object invoke = pVar.invoke(r, cVar);
                if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    cVar.resumeWith(invoke);
                }
            } catch (Throwable th) {
                cVar.resumeWith(i0.j.f.p.h.l0(th));
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
    }

    public static void K(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static final boolean K0(m0.r.t.a.r.m.v vVar, l<? super m0.r.t.a.r.m.v0, Boolean> lVar) {
        i.e(vVar, "<this>");
        i.e(lVar, "predicate");
        return s0.c(vVar, lVar);
    }

    public static final j0 K1(m0.l.e eVar) {
        int i = m0.l.d.h;
        e.a aVar = eVar.get(d.a.c);
        j0 j0Var = aVar instanceof j0 ? (j0) aVar : null;
        return j0Var == null ? h0.a : j0Var;
    }

    public static final <T> n0.a.g2.d<T> K2(n0.a.g2.d<? extends T>... dVarArr) {
        int i = n0.a.g2.k.a;
        return new ChannelLimitedFlowMerge(i0.j.f.p.h.v(dVarArr), (m0.l.e) null, 0, (BufferOverflow) null, 14);
    }

    public static final <T, R> Object K3(n0.a.h2.r<? super T> rVar, R r, m0.n.a.p<? super R, ? super m0.l.c<? super T>, ? extends Object> pVar) {
        Object obj;
        Object g02;
        if (pVar != null) {
            try {
                m0.n.b.r.c(pVar, 2);
                obj = pVar.invoke(r, rVar);
            } catch (Throwable th) {
                obj = new n0.a.z(th, false, 2);
            }
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj == coroutineSingletons || (g02 = rVar.g0(obj)) == n0.a.j1.b) {
                return coroutineSingletons;
            }
            if (!(g02 instanceof n0.a.z)) {
                return n0.a.j1.a(g02);
            }
            throw ((n0.a.z) g02).b;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    public static void L(Vector vector, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
    }

    public static int L0(char c) {
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        return (('a' > c || c > 'f') ? c - 'A' : c - 'a') + 10;
    }

    public static final int L1(SerialDescriptor serialDescriptor, String str) {
        i.e(serialDescriptor, "$this$getElementIndexOrThrow");
        i.e(str, "name");
        int d = serialDescriptor.d(str);
        if (d != -3) {
            return d;
        }
        throw new SerializationException(serialDescriptor.a() + " does not contain element with name '" + str + '\'');
    }

    public static final String L2(String str, int i) {
        if (str.length() < 200) {
            return str;
        }
        String str2 = ".....";
        if (i == -1) {
            int length = str.length() - 60;
            if (length <= 0) {
                return str;
            }
            StringBuilder P0 = i0.d.a.a.a.P0(str2);
            String substring = str.substring(length);
            i.d(substring, "(this as java.lang.String).substring(startIndex)");
            P0.append(substring);
            return P0.toString();
        }
        int i2 = i - 30;
        int i3 = i + 30;
        String str3 = i2 <= 0 ? "" : str2;
        if (i3 >= str.length()) {
            str2 = "";
        }
        StringBuilder P02 = i0.d.a.a.a.P0(str3);
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = str.length();
        if (i3 > length2) {
            i3 = length2;
        }
        String substring2 = str.substring(i2, i3);
        i.d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        P02.append(substring2);
        P02.append(str2);
        return P02.toString();
    }

    public static byte[] L3(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public static void M(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void M0(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static final String M1(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static void M2(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long reverse = Long.reverse(j);
        long reverse2 = Long.reverse(j2);
        long reverse3 = Long.reverse(j3);
        long reverse4 = Long.reverse(j4);
        long reverse5 = Long.reverse(f2(reverse, reverse3));
        long f2 = f2(j, j3) << 1;
        long reverse6 = Long.reverse(f2(reverse2, reverse4));
        long j5 = j2;
        long f22 = f2(j5, j4) << 1;
        long f23 = ((f2(j ^ j5, j3 ^ j4) << 1) ^ ((reverse6 ^ f2) ^ f22)) ^ ((f22 << 62) ^ (f22 << 57));
        long j6 = f23 >>> 7;
        long j7 = (f23 << 57) ^ ((f23 << 63) ^ (f23 << 62));
        jArr[0] = reverse5 ^ (j6 ^ ((f23 ^ (f23 >>> 1)) ^ (f23 >>> 2)));
        jArr[1] = j7 ^ ((Long.reverse(f2(reverse ^ reverse2, reverse3 ^ reverse4)) ^ ((f2 ^ reverse5) ^ reverse6)) ^ (((f22 ^ (f22 >>> 1)) ^ (f22 >>> 2)) ^ (f22 >>> 7)));
    }

    public static s0.a.e.b.h M3(s0.a.e.b.h hVar, BigInteger bigInteger, s0.a.e.b.h hVar2, BigInteger bigInteger2) {
        s0.a.e.b.h j2;
        s0.a.e.b.h hVar3;
        s0.a.e.b.h hVar4 = hVar;
        BigInteger bigInteger3 = bigInteger;
        BigInteger bigInteger4 = bigInteger2;
        s0.a.e.b.e eVar = hVar4.b;
        s0.a.e.b.h n2 = n2(eVar, hVar2);
        if (!(eVar instanceof e.a) || !((e.a) eVar).v()) {
            s0.a.e.b.c0.c cVar = eVar.g;
            if (cVar instanceof s0.a.e.b.c0.c) {
                int i = 2;
                boolean z = false;
                boolean z2 = true;
                s0.a.e.b.h[] hVarArr = {hVar4, n2};
                BigInteger[] bigIntegerArr = {bigInteger3, bigInteger4};
                BigInteger bigInteger5 = hVarArr[0].b.d;
                BigInteger[] bigIntegerArr2 = new BigInteger[4];
                int i2 = 0;
                for (int i3 = 0; i3 < 2; i3++) {
                    BigInteger[] c = cVar.c(bigIntegerArr[i3].mod(bigInteger5));
                    int i4 = i2 + 1;
                    bigIntegerArr2[i2] = c[0];
                    i2 = i4 + 1;
                    bigIntegerArr2[i4] = c[1];
                }
                int i5 = 8;
                if (cVar.b()) {
                    boolean[] zArr = new boolean[4];
                    s0.a.e.b.u[] uVarArr = new s0.a.e.b.u[4];
                    byte[][] bArr = new byte[4][];
                    s0.a.e.b.p a = cVar.a();
                    int i6 = 0;
                    while (i6 < i) {
                        int i7 = i6 << 1;
                        int i8 = i7 + 1;
                        BigInteger bigInteger6 = bigIntegerArr2[i7];
                        zArr[i7] = bigInteger6.signum() < 0 ? z2 : z;
                        BigInteger abs = bigInteger6.abs();
                        BigInteger bigInteger7 = bigIntegerArr2[i8];
                        zArr[i8] = bigInteger7.signum() < 0 ? z2 : z;
                        BigInteger abs2 = bigInteger7.abs();
                        int d = s0.a.e.b.v.d(Math.max(abs.bitLength(), abs2.bitLength()), i5);
                        s0.a.e.b.h hVar5 = hVarArr[i6];
                        s0.a.e.b.u f = s0.a.e.b.v.f(hVar5, d, z2);
                        s0.a.e.b.h p2 = h3.p2(cVar, hVar5);
                        BigInteger[] bigIntegerArr3 = bigIntegerArr2;
                        s0.a.e.b.u uVar = (s0.a.e.b.u) p2.b.r(p2, "bc_wnaf", new s0.a.e.b.w(f, z2, a));
                        int min = Math.min(8, f.f);
                        int min2 = Math.min(8, uVar.f);
                        uVarArr[i7] = f;
                        uVarArr[i8] = uVar;
                        bArr[i7] = s0.a.e.b.v.b(min, abs);
                        bArr[i8] = s0.a.e.b.v.b(min2, abs2);
                        i6++;
                        bigIntegerArr2 = bigIntegerArr3;
                        z2 = true;
                        i5 = 8;
                        i = 2;
                        z = false;
                    }
                    hVar3 = m2(zArr, uVarArr, bArr);
                } else {
                    BigInteger[] bigIntegerArr4 = bigIntegerArr2;
                    s0.a.e.b.h[] hVarArr2 = new s0.a.e.b.h[4];
                    int i9 = 0;
                    for (int i10 = 0; i10 < 2; i10++) {
                        s0.a.e.b.h hVar6 = hVarArr[i10];
                        s0.a.e.b.h p22 = h3.p2(cVar, hVar6);
                        int i11 = i9 + 1;
                        hVarArr2[i9] = hVar6;
                        i9 = i11 + 1;
                        hVarArr2[i11] = p22;
                    }
                    boolean[] zArr2 = new boolean[4];
                    s0.a.e.b.u[] uVarArr2 = new s0.a.e.b.u[4];
                    byte[][] bArr2 = new byte[4][];
                    for (int i12 = 0; i12 < 4; i12++) {
                        BigInteger bigInteger8 = bigIntegerArr4[i12];
                        zArr2[i12] = bigInteger8.signum() < 0;
                        BigInteger abs3 = bigInteger8.abs();
                        s0.a.e.b.u f2 = s0.a.e.b.v.f(hVarArr2[i12], s0.a.e.b.v.d(abs3.bitLength(), 8), true);
                        int min3 = Math.min(8, f2.f);
                        uVarArr2[i12] = f2;
                        bArr2[i12] = s0.a.e.b.v.b(min3, abs3);
                    }
                    hVar3 = m2(zArr2, uVarArr2, bArr2);
                }
                e2(hVar3);
                return hVar3;
            }
            j2 = j2(hVar4, bigInteger3, n2, bigInteger4);
        } else {
            j2 = hVar.o(bigInteger).a(n2.o(bigInteger4));
        }
        e2(j2);
        return j2;
    }

    public static final <T> void N(Collection<T> collection, T t) {
        i.e(collection, "<this>");
        if (t != null) {
            collection.add(t);
        }
    }

    public static void N0(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static final int N1(JsonPrimitive jsonPrimitive) {
        i.e(jsonPrimitive, "$this$int");
        return Integer.parseInt(jsonPrimitive.b());
    }

    public static void N2(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        g2(jArr, jArr2, jArr4);
        e3(jArr4, jArr3);
    }

    public static final int N3(String str, int i, int i2, int i3) {
        return (int) O3(str, (long) i, (long) i2, (long) i3);
    }

    public static final <T> void O(Appendable appendable, T t, l<? super T, ? extends CharSequence> lVar) {
        i.e(appendable, "$this$appendElement");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }

    public static void O0(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
        jArr2[7] = jArr[7];
    }

    public static final JsonObject O1(JsonElement jsonElement) {
        i.e(jsonElement, "$this$jsonObject");
        JsonObject jsonObject = (JsonObject) (!(jsonElement instanceof JsonObject) ? null : jsonElement);
        if (jsonObject != null) {
            return jsonObject;
        }
        p1(jsonElement, "JsonObject");
        throw null;
    }

    public static void O2(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        g2(jArr, jArr2, jArr4);
        M(jArr3, jArr4, jArr3);
    }

    public static final long O3(String str, long j, long j2, long j3) {
        String P3 = P3(str);
        if (P3 == null) {
            return j;
        }
        i.e(P3, "$this$toLongOrNull");
        Long U = StringsKt__IndentKt.U(P3, 10);
        if (U != null) {
            long longValue = U.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + P3 + '\'').toString());
    }

    public static void P(Uri.Builder builder, String str, Object obj) {
        if (obj != null && obj.toString() != null) {
            builder.appendQueryParameter(str, obj.toString());
        }
    }

    public static final <R> Object P0(m0.n.a.p<? super f0, ? super m0.l.c<? super R>, ? extends Object> pVar, m0.l.c<? super R> cVar) {
        n0.a.h2.r rVar = new n0.a.h2.r(cVar.getContext(), cVar);
        Object K3 = K3(rVar, rVar, pVar);
        if (K3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            i.e(cVar, "frame");
        }
        return K3;
    }

    public static final JsonPrimitive P1(JsonElement jsonElement) {
        i.e(jsonElement, "$this$jsonPrimitive");
        JsonPrimitive jsonPrimitive = (JsonPrimitive) (!(jsonElement instanceof JsonPrimitive) ? null : jsonElement);
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        p1(jsonElement, "JsonPrimitive");
        throw null;
    }

    public static <T> Object[] P2(n0.b.a aVar) {
        i.e(aVar, "this");
        throw new NotImplementedError("Generated by Android Extensions automatically");
    }

    public static final String P3(String str) {
        int i = n0.a.h2.u.a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void Q(StringBuffer stringBuffer, s0.a.a.b3.b bVar, Hashtable hashtable) {
        boolean z = true;
        if (bVar.c.c.length > 1) {
            s0.a.a.b3.a[] u = bVar.u();
            for (int i = 0; i != u.length; i++) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append('+');
                }
                R(stringBuffer, u[i], hashtable);
            }
        } else if (bVar.s() != null) {
            R(stringBuffer, bVar.s(), hashtable);
        }
    }

    public static final m0 Q0(m0.r.t.a.r.m.v vVar, Variance variance, m0.r.t.a.r.c.m0 m0Var) {
        i.e(vVar, "type");
        i.e(variance, "projectionKind");
        if ((m0Var == null ? null : m0Var.l()) == variance) {
            variance = Variance.INVARIANT;
        }
        return new m0.r.t.a.r.m.o0(variance, vVar);
    }

    public static String Q1(n nVar) {
        String str = (String) s0.a.a.d3.e.z.get(nVar);
        if (str == null) {
            str = (String) s0.a.a.y2.c.J.get(nVar);
        }
        if (str == null) {
            str = (String) s0.a.a.r2.a.b.get(nVar);
        }
        if (str == null) {
            str = (String) s0.a.a.z2.a.q.get(nVar);
        }
        if (str == null) {
            str = (String) s0.a.a.b2.a.d.get(nVar);
        }
        if (str == null) {
            str = b.b(nVar);
        }
        if (str == null) {
            str = (String) s0.a.a.j2.a.e.get(nVar);
        }
        return str == null ? (String) s0.a.b.c0.a.J.get(nVar) : str;
    }

    public static final <K, V> HashMap<K, V> Q2(int i) {
        return new HashMap<>(s0(i));
    }

    public static /* synthetic */ int Q3(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return N3(str, i, i2, i3);
    }

    public static void R(StringBuffer stringBuffer, s0.a.a.b3.a aVar, Hashtable hashtable) {
        String str = (String) hashtable.get(aVar.c);
        if (str == null) {
            str = aVar.c.d;
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(j4(aVar.d));
    }

    public static s0.a.b.n R0() {
        return new s0.a.b.b0.z(224);
    }

    public static final <T> KSerializer<T> R1(KSerializer<T> kSerializer) {
        i.e(kSerializer, "$this$nullable");
        return kSerializer.getDescriptor().c() ? kSerializer : new n0.c.k.s0(kSerializer);
    }

    public static String R2(String str, String str2, boolean z, s0.a.a.r rVar, String str3) {
        s0.a.a.a B = s0.a.a.a.B(rVar);
        StringBuffer stringBuffer = new StringBuffer();
        if (B.c) {
            try {
                s B2 = s.B(B.C(16));
                stringBuffer.append(str2 + str + " ApplicationSpecific[" + B.d + "]" + str3);
                Enumeration E = B2.E();
                while (E.hasMoreElements()) {
                    B(str2 + "    ", z, (s0.a.a.r) E.nextElement(), stringBuffer);
                }
            } catch (IOException e) {
                stringBuffer.append(e);
            }
            return stringBuffer.toString();
        }
        StringBuilder T0 = i0.d.a.a.a.T0(str2, str, " ApplicationSpecific[");
        T0.append(B.d);
        T0.append("] (");
        T0.append(j.a(s0.a.g.k.d.d(h3.I(B.q))));
        T0.append(")");
        T0.append(str3);
        return T0.toString();
    }

    public static /* synthetic */ long R3(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = RecyclerView.FOREVER_NS;
        }
        return O3(str, j, j4, j3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final m0.r.t.a.r.m.b1.a<m0.r.t.a.r.m.v> S(m0.r.t.a.r.m.v r14) {
        /*
            java.lang.String r0 = "type"
            m0.n.b.i.e(r14, r0)
            boolean r1 = i0.j.f.p.h.k2(r14)
            if (r1 == 0) goto L_0x0053
            m0.r.t.a.r.m.a0 r0 = i0.j.f.p.h.P2(r14)
            m0.r.t.a.r.m.b1.a r0 = S(r0)
            m0.r.t.a.r.m.a0 r1 = i0.j.f.p.h.B4(r14)
            m0.r.t.a.r.m.b1.a r1 = S(r1)
            m0.r.t.a.r.m.b1.a r2 = new m0.r.t.a.r.m.b1.a
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r3 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
            T r3 = r0.a
            m0.r.t.a.r.m.v r3 = (m0.r.t.a.r.m.v) r3
            m0.r.t.a.r.m.a0 r3 = i0.j.f.p.h.P2(r3)
            T r4 = r1.a
            m0.r.t.a.r.m.v r4 = (m0.r.t.a.r.m.v) r4
            m0.r.t.a.r.m.a0 r4 = i0.j.f.p.h.B4(r4)
            m0.r.t.a.r.m.v0 r3 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.c(r3, r4)
            m0.r.t.a.r.m.v0 r3 = i0.j.f.p.h.a2(r3, r14)
            T r0 = r0.b
            m0.r.t.a.r.m.v r0 = (m0.r.t.a.r.m.v) r0
            m0.r.t.a.r.m.a0 r0 = i0.j.f.p.h.P2(r0)
            T r1 = r1.b
            m0.r.t.a.r.m.v r1 = (m0.r.t.a.r.m.v) r1
            m0.r.t.a.r.m.a0 r1 = i0.j.f.p.h.B4(r1)
            m0.r.t.a.r.m.v0 r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.c(r0, r1)
            m0.r.t.a.r.m.v0 r14 = i0.j.f.p.h.a2(r0, r14)
            r2.<init>(r3, r14)
            return r2
        L_0x0053:
            m0.r.t.a.r.m.j0 r1 = r14.I0()
            boolean r2 = i0.j.f.p.h.c2(r14)
            java.lang.String r3 = "type.builtIns.nothingType"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x00c4
            m0.r.t.a.r.j.o.a.b r1 = (m0.r.t.a.r.j.o.a.b) r1
            m0.r.t.a.r.m.m0 r0 = r1.e()
            m0.r.t.a.r.m.v r1 = r0.getType()
            java.lang.String r2 = "typeProjection.type"
            m0.n.b.i.d(r1, r2)
            boolean r2 = r14.J0()
            m0.r.t.a.r.m.v r1 = m0.r.t.a.r.m.s0.k(r1, r2)
            java.lang.String r2 = "makeNullableIfNeeded(this, type.isMarkedNullable)"
            m0.n.b.i.d(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r0.b()
            int r6 = r6.ordinal()
            if (r6 == r5) goto L_0x00b1
            if (r6 != r4) goto L_0x00a5
            m0.r.t.a.r.m.b1.a r0 = new m0.r.t.a.r.m.b1.a
            m0.r.t.a.r.b.f r4 = F1(r14)
            m0.r.t.a.r.m.a0 r4 = r4.o()
            m0.n.b.i.d(r4, r3)
            boolean r14 = r14.J0()
            m0.r.t.a.r.m.v r14 = m0.r.t.a.r.m.s0.k(r4, r14)
            m0.n.b.i.d(r14, r2)
            r0.<init>(r14, r1)
            goto L_0x00c3
        L_0x00a5:
            java.lang.AssertionError r14 = new java.lang.AssertionError
            java.lang.String r1 = "Only nontrivial projections should have been captured, not: "
            java.lang.String r0 = m0.n.b.i.k(r1, r0)
            r14.<init>(r0)
            throw r14
        L_0x00b1:
            m0.r.t.a.r.m.b1.a r0 = new m0.r.t.a.r.m.b1.a
            m0.r.t.a.r.b.f r14 = F1(r14)
            m0.r.t.a.r.m.a0 r14 = r14.p()
            java.lang.String r2 = "type.builtIns.nullableAnyType"
            m0.n.b.i.d(r14, r2)
            r0.<init>(r1, r14)
        L_0x00c3:
            return r0
        L_0x00c4:
            java.util.List r2 = r14.H0()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0229
            java.util.List r2 = r14.H0()
            int r2 = r2.size()
            java.util.List r6 = r1.getParameters()
            int r6 = r6.size()
            if (r2 == r6) goto L_0x00e2
            goto L_0x0229
        L_0x00e2:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = r14.H0()
            java.util.List r1 = r1.getParameters()
            java.lang.String r8 = "typeConstructor.parameters"
            m0.n.b.i.d(r1, r8)
            java.util.List r1 = m0.j.g.F0(r7, r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0103:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x01e3
            java.lang.Object r7 = r1.next()
            kotlin.Pair r7 = (kotlin.Pair) r7
            A r8 = r7.c
            m0.r.t.a.r.m.m0 r8 = (m0.r.t.a.r.m.m0) r8
            B r7 = r7.d
            m0.r.t.a.r.c.m0 r7 = (m0.r.t.a.r.c.m0) r7
            java.lang.String r9 = "typeParameter"
            m0.n.b.i.d(r7, r9)
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = r7.l()
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r10 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.a
            r10 = 0
            if (r9 == 0) goto L_0x01dd
            if (r8 == 0) goto L_0x01d7
            boolean r11 = r8.c()
            if (r11 == 0) goto L_0x0138
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            if (r9 == 0) goto L_0x0132
            goto L_0x0140
        L_0x0132:
            r14 = 35
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.a(r14)
            throw r10
        L_0x0138:
            kotlin.reflect.jvm.internal.impl.types.Variance r10 = r8.b()
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.b(r9, r10)
        L_0x0140:
            int r9 = r9.ordinal()
            if (r9 == 0) goto L_0x0184
            if (r9 == r5) goto L_0x016a
            if (r9 != r4) goto L_0x0164
            m0.r.t.a.r.m.b1.c r9 = new m0.r.t.a.r.m.b1.c
            m0.r.t.a.r.b.f r10 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.f(r7)
            m0.r.t.a.r.m.a0 r10 = r10.o()
            java.lang.String r11 = "typeParameter.builtIns.nothingType"
            m0.n.b.i.d(r10, r11)
            m0.r.t.a.r.m.v r11 = r8.getType()
            m0.n.b.i.d(r11, r0)
            r9.<init>(r7, r10, r11)
            goto L_0x0197
        L_0x0164:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x016a:
            m0.r.t.a.r.m.b1.c r9 = new m0.r.t.a.r.m.b1.c
            m0.r.t.a.r.m.v r10 = r8.getType()
            m0.n.b.i.d(r10, r0)
            m0.r.t.a.r.b.f r11 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.f(r7)
            m0.r.t.a.r.m.a0 r11 = r11.p()
            java.lang.String r12 = "typeParameter.builtIns.nullableAnyType"
            m0.n.b.i.d(r11, r12)
            r9.<init>(r7, r10, r11)
            goto L_0x0197
        L_0x0184:
            m0.r.t.a.r.m.b1.c r9 = new m0.r.t.a.r.m.b1.c
            m0.r.t.a.r.m.v r10 = r8.getType()
            m0.n.b.i.d(r10, r0)
            m0.r.t.a.r.m.v r11 = r8.getType()
            m0.n.b.i.d(r11, r0)
            r9.<init>(r7, r10, r11)
        L_0x0197:
            boolean r7 = r8.c()
            if (r7 == 0) goto L_0x01a5
            r2.add(r9)
            r6.add(r9)
            goto L_0x0103
        L_0x01a5:
            m0.r.t.a.r.m.v r7 = r9.b
            m0.r.t.a.r.m.b1.a r7 = S(r7)
            T r8 = r7.a
            m0.r.t.a.r.m.v r8 = (m0.r.t.a.r.m.v) r8
            T r7 = r7.b
            m0.r.t.a.r.m.v r7 = (m0.r.t.a.r.m.v) r7
            m0.r.t.a.r.m.v r10 = r9.c
            m0.r.t.a.r.m.b1.a r10 = S(r10)
            T r11 = r10.a
            m0.r.t.a.r.m.v r11 = (m0.r.t.a.r.m.v) r11
            T r10 = r10.b
            m0.r.t.a.r.m.v r10 = (m0.r.t.a.r.m.v) r10
            m0.r.t.a.r.m.b1.c r12 = new m0.r.t.a.r.m.b1.c
            m0.r.t.a.r.c.m0 r13 = r9.a
            r12.<init>(r13, r7, r11)
            m0.r.t.a.r.m.b1.c r7 = new m0.r.t.a.r.m.b1.c
            m0.r.t.a.r.c.m0 r9 = r9.a
            r7.<init>(r9, r8, r10)
            r2.add(r12)
            r6.add(r7)
            goto L_0x0103
        L_0x01d7:
            r14 = 34
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.a(r14)
            throw r10
        L_0x01dd:
            r14 = 33
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.a(r14)
            throw r10
        L_0x01e3:
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x01eb
            goto L_0x020c
        L_0x01eb:
            java.util.Iterator r0 = r2.iterator()
        L_0x01ef:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x020c
            java.lang.Object r4 = r0.next()
            m0.r.t.a.r.m.b1.c r4 = (m0.r.t.a.r.m.b1.c) r4
            java.util.Objects.requireNonNull(r4)
            m0.r.t.a.r.m.x0.d r7 = m0.r.t.a.r.m.x0.d.a
            m0.r.t.a.r.m.v r8 = r4.b
            m0.r.t.a.r.m.v r4 = r4.c
            boolean r4 = r7.d(r8, r4)
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x01ef
            goto L_0x020d
        L_0x020c:
            r5 = r1
        L_0x020d:
            m0.r.t.a.r.m.b1.a r0 = new m0.r.t.a.r.m.b1.a
            if (r5 == 0) goto L_0x021d
            m0.r.t.a.r.b.f r1 = F1(r14)
            m0.r.t.a.r.m.a0 r1 = r1.o()
            m0.n.b.i.d(r1, r3)
            goto L_0x0221
        L_0x021d:
            m0.r.t.a.r.m.v r1 = i3(r14, r2)
        L_0x0221:
            m0.r.t.a.r.m.v r14 = i3(r14, r6)
            r0.<init>(r1, r14)
            return r0
        L_0x0229:
            m0.r.t.a.r.m.b1.a r0 = new m0.r.t.a.r.m.b1.a
            r0.<init>(r14, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.S(m0.r.t.a.r.m.v):m0.r.t.a.r.m.b1.a");
    }

    public static s0.a.b.n S0() {
        return new s0.a.b.b0.z(256);
    }

    public static n S1(String str) {
        n nVar = (n) s0.a.a.d3.e.x.get(j.d(str));
        if (nVar == null) {
            nVar = (n) s0.a.a.y2.c.H.get(j.d(str));
        }
        if (nVar == null) {
            nVar = (n) s0.a.a.r2.a.a.get(j.g(str));
        }
        if (nVar == null) {
            nVar = (n) s0.a.a.z2.a.o.get(j.d(str));
        }
        if (nVar == null) {
            nVar = (n) s0.a.a.b2.a.b.get(j.d(str));
        }
        if (nVar == null) {
            nVar = b.c(str);
        }
        if (nVar == null) {
            nVar = (n) s0.a.a.j2.a.c.get(j.d(str));
        }
        return (nVar != null || !str.equals("curve25519")) ? nVar : s0.a.a.f2.a.c;
    }

    public static s0.a.b.k0.b S2(byte[] bArr) {
        s0.a.b.k0.b bVar;
        s0.a.b.k0.b c0Var;
        s0.a.b.o0.e eVar = new s0.a.b.o0.e(bArr);
        String d = eVar.d();
        if ("ssh-rsa".equals(d)) {
            bVar = new s0.a.b.k0.k1(false, eVar.b(), eVar.b());
        } else {
            if ("ssh-dss".equals(d)) {
                c0Var = new s0.a.b.k0.r(eVar.b(), new s0.a.b.k0.p(eVar.b(), eVar.b(), eVar.b()));
            } else if (d.startsWith("ecdsa")) {
                String d2 = eVar.d();
                n nVar = SSHNamedCurves.b.get(d2);
                Hashtable hashtable = s0.a.a.r2.a.a;
                s0.a.a.d3.h e = s0.a.a.y2.c.e(nVar);
                if (e != null) {
                    c0Var = new s0.a.b.k0.c0(e.q.h(eVar.c()), new s0.a.b.k0.a0(nVar, e));
                } else {
                    throw new IllegalStateException("unable to find curve for " + d + " using curve name " + d2);
                }
            } else if ("ssh-ed25519".equals(d)) {
                byte[] c = eVar.c();
                if (c.length == 32) {
                    bVar = new s0.a.b.k0.f0(c, 0);
                } else {
                    throw new IllegalStateException("public key value of wrong length");
                }
            } else {
                bVar = null;
            }
            bVar = c0Var;
        }
        if (bVar == null) {
            throw new IllegalArgumentException("unable to parse key");
        } else if (!eVar.a()) {
            return bVar;
        } else {
            throw new IllegalArgumentException("decoded key has trailing data");
        }
    }

    public static final String S3(String str, int i) {
        i.e(str, "$this$take");
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(0, i);
            i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.g0("Requested character count ", i, " is less than zero.").toString());
    }

    public static final boolean T(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        i.e(bArr, "a");
        i.e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static s0.a.b.n T0() {
        return new s0.a.b.b0.z(384);
    }

    public static final <T> n0.a.n<T> T1(m0.l.c<? super T> cVar) {
        if (!(cVar instanceof n0.a.h2.g)) {
            return new n0.a.n<>(cVar, 1);
        }
        n0.a.n<T> h = ((n0.a.h2.g) cVar).h();
        if (h == null || !h.w()) {
            h = null;
        }
        return h == null ? new n0.a.n<>(cVar, 2) : h;
    }

    public static final f0 T2(f0 f0Var, m0.l.e eVar) {
        return new n0.a.h2.f(f0Var.C().plus(eVar));
    }

    public static final <T> n0.a.g2.d<T> T3(n0.a.g2.d<? extends T> dVar, int i) {
        if (i > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(dVar, i);
        }
        throw new IllegalArgumentException(i0.d.a.a.a.g0("Requested element count ", i, " should be positive").toString());
    }

    public static final n0.c.l.e U(Decoder decoder) {
        i.e(decoder, "$this$asJsonDecoder");
        n0.c.l.e eVar = (n0.c.l.e) (!(decoder instanceof n0.c.l.e) ? null : decoder);
        if (eVar != null) {
            return eVar;
        }
        StringBuilder S0 = i0.d.a.a.a.S0("This serializer can be used only with Json format.", "Expected Decoder to be JsonDecoder, got ");
        S0.append(m0.n.b.m.a(decoder.getClass()));
        throw new IllegalStateException(S0.toString());
    }

    public static s0.a.b.n U0() {
        return new s0.a.b.b0.z(512);
    }

    public static s0.a.d.e.c U1(String str) {
        n nVar = (n) b.a.get(str);
        s0.a.a.d3.h a = nVar == null ? null : b.a(nVar);
        if (a == null) {
            try {
                a = b.a(new n(str));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (a == null) {
            return null;
        }
        return new s0.a.d.e.c(str, a.q, a.s(), a.y, a.Y1, a.u());
    }

    public static final Object U2(Object obj, E e) {
        if (obj == null) {
            return e;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return arrayList;
    }

    public static final String U3(String str, int i) {
        i.e(str, "$this$takeLast");
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(length - i);
            i.d(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.g0("Requested character count ", i, " is less than zero.").toString());
    }

    public static final n0.c.l.g V(Encoder encoder) {
        i.e(encoder, "$this$asJsonEncoder");
        n0.c.l.g gVar = (n0.c.l.g) (!(encoder instanceof n0.c.l.g) ? null : encoder);
        if (gVar != null) {
            return gVar;
        }
        StringBuilder S0 = i0.d.a.a.a.S0("This serializer can be used only with Json format.", "Expected Encoder to be JsonEncoder, got ");
        S0.append(m0.n.b.m.a(encoder.getClass()));
        throw new IllegalStateException(S0.toString());
    }

    public static s0.a.b.n V0() {
        return new s0.a.b.b0.b0(224);
    }

    public static final m0.r.t.a.r.m.v V1(m0.r.t.a.r.c.m0 m0Var) {
        T t;
        i.e(m0Var, "<this>");
        List<m0.r.t.a.r.m.v> upperBounds = m0Var.getUpperBounds();
        i.d(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<m0.r.t.a.r.m.v> upperBounds2 = m0Var.getUpperBounds();
        i.d(upperBounds2, "upperBounds");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T c = ((m0.r.t.a.r.m.v) next).I0().c();
            if (c instanceof m0.r.t.a.r.c.d) {
                t = (m0.r.t.a.r.c.d) c;
            }
            boolean z = false;
            if (!(t == null || t.f() == ClassKind.INTERFACE || t.f() == ClassKind.ANNOTATION_CLASS)) {
                z = true;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        m0.r.t.a.r.m.v vVar = (m0.r.t.a.r.m.v) t;
        if (vVar != null) {
            return vVar;
        }
        List<m0.r.t.a.r.m.v> upperBounds3 = m0Var.getUpperBounds();
        i.d(upperBounds3, "upperBounds");
        Object u = m0.j.g.u(upperBounds3);
        i.d(u, "upperBounds.first()");
        return (m0.r.t.a.r.m.v) u;
    }

    public static s0.a.e.b.j V2(s0.a.e.b.h hVar) {
        s0.a.e.b.e eVar = hVar.b;
        return (s0.a.e.b.j) eVar.r(hVar, "bc_fixed_point", new s0.a.e.b.k(eVar, hVar));
    }

    public static final Void V3(n0.c.l.q.i iVar, Number number) {
        i.e(iVar, "$this$throwInvalidFloatingPointDecoded");
        i.e(number, "result");
        iVar.c("Unexpected special floating-point value " + number + ". By default, " + "non-finite floating point values are prohibited because they do not conform JSON specification. " + "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", iVar.a);
        throw null;
    }

    public static long[] W(byte[] bArr) {
        long[] jArr = new long[2];
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            jArr[i2] = h3.z(bArr, i);
            i += 8;
        }
        return jArr;
    }

    public static s0.a.b.n W0() {
        return new s0.a.b.b0.b0(256);
    }

    public static String W1(JSONObject jSONObject, String str) throws JSONException {
        z0(jSONObject, "json must not be null");
        z0(str, "field must not be null");
        if (jSONObject.has(str)) {
            String string = jSONObject.getString(str);
            if (string != null) {
                return string;
            }
            throw new JSONException(i0.d.a.a.a.o0("field \"", str, "\" is mapped to a null value"));
        }
        throw new JSONException(i0.d.a.a.a.o0("field \"", str, "\" not found in json object"));
    }

    public static final JsonElement W2(n0.c.l.m mVar, String str, Number number) {
        i.e(mVar, "$this$put");
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        JsonPrimitive r = r(number);
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        i.e(r, "element");
        return mVar.a.put(str, r);
    }

    public static final void W3(int i, int i2, SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.g(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(arrayList, serialDescriptor.a());
    }

    public static final <T> m0.s.h<T> X(Iterator<? extends T> it) {
        i.e(it, "$this$asSequence");
        m0.s.m mVar = new m0.s.m(it);
        i.e(mVar, "$this$constrainOnce");
        return mVar instanceof m0.s.a ? mVar : new m0.s.a(mVar);
    }

    public static final <T> n0.a.g2.d<T> X0(n0.a.g2.d<? extends T> dVar, long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? dVar : new n0.a.g2.d0.i(new FlowKt__DelayKt$debounceInternal$1(new FlowKt__DelayKt$debounce$2(j), dVar, (m0.l.c<? super FlowKt__DelayKt$debounceInternal$1>) null));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    public static String X1(JSONObject jSONObject, String str) throws JSONException {
        z0(jSONObject, "json must not be null");
        z0(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException(i0.d.a.a.a.o0("field \"", str, "\" is mapped to a null value"));
    }

    public static void X2(JSONObject jSONObject, String str, int i) {
        z0(jSONObject, "json must not be null");
        z0(str, "field must not be null");
        z0(Integer.valueOf(i), "value must not be null");
        try {
            jSONObject.put(str, i);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    public static final Void X3(String str, m0.r.d<?> dVar) {
        String str2;
        i.e(dVar, "baseClass");
        String str3 = "in the scope of '" + dVar.e() + '\'';
        if (str == null) {
            str2 = i0.d.a.a.a.n0("Class discriminator was missing and no default polymorphic serializers were registered ", str3);
        } else {
            StringBuilder U0 = i0.d.a.a.a.U0("Class '", str, "' is not registered for polymorphic serialization ", str3, ".\n");
            U0.append("Mark the base class as 'sealed' or register the serializer explicitly.");
            str2 = U0.toString();
        }
        throw new SerializationException(str2);
    }

    public static final m0 Y(m0.r.t.a.r.m.v vVar) {
        i.e(vVar, "<this>");
        return new m0.r.t.a.r.m.o0(vVar);
    }

    public static n Y0(String str, Hashtable hashtable) {
        if (j.g(str).startsWith("OID.")) {
            return new n(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new n(str);
        }
        n nVar = (n) hashtable.get(j.d(str));
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.o0("Unknown object id - ", str, " - passed to distinguished name"));
    }

    public static Map<String, String> Y1(JSONObject jSONObject, String str) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        z0(jSONObject, "json must not be null");
        z0(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return linkedHashMap;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string = jSONObject2.getString(next);
            z0(string, "additional parameter values must not be null");
            linkedHashMap.put(next, string);
        }
        return linkedHashMap;
    }

    public static void Y2(JSONObject jSONObject, String str, String str2) {
        z0(jSONObject, "json must not be null");
        z0(str, "field must not be null");
        z0(str2, "value must not be null");
        try {
            jSONObject.put(str, (Object) str2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static final String Y3(String str) {
        InetAddress inetAddress;
        i.e(str, "$this$toCanonicalHost");
        int i = 0;
        int i2 = -1;
        if (StringsKt__IndentKt.d(str, ":", false, 2)) {
            if (!StringsKt__IndentKt.J(str, "[", false, 2) || !StringsKt__IndentKt.e(str, "]", false, 2)) {
                inetAddress = a1(str, 0, str.length());
            } else {
                inetAddress = a1(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                i.d(address, PaymentMethod.BillingDetails.PARAM_ADDRESS);
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i2 = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                r0.f fVar = new r0.f();
                while (i < address.length) {
                    if (i == i2) {
                        fVar.I(58);
                        i += i4;
                        if (i == 16) {
                            fVar.I(58);
                        }
                    } else {
                        if (i > 0) {
                            fVar.I(58);
                        }
                        byte b = address[i];
                        byte[] bArr = q0.h0.c.a;
                        fVar.W((long) (((b & 255) << 8) | (address[i + 1] & 255)));
                        i += 2;
                    }
                }
                return fVar.w();
            } else if (address.length == 4) {
                return inetAddress.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                i.d(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                i.d(locale, "Locale.US");
                String lowerCase = ascii.toLowerCase(locale);
                i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    char charAt = lowerCase.charAt(i7);
                    if (i.g(charAt, 31) <= 0) {
                        break;
                    } else if (i.g(charAt, 127) >= 0) {
                        break;
                    } else if (StringsKt__IndentKt.l(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        break;
                    } else {
                        i7++;
                    }
                }
                i = 1;
                if (i != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static final <T> Object Z(i0.h.a.b.m.g<T> gVar, m0.l.c<? super T> cVar) {
        if (gVar.m()) {
            Exception i = gVar.i();
            if (i != null) {
                throw i;
            } else if (!gVar.l()) {
                return gVar.j();
            } else {
                throw new CancellationException("Task " + gVar + " was cancelled normally.");
            }
        } else {
            n0.a.n nVar = new n0.a.n(i0.j.f.p.h.b2(cVar), 1);
            nVar.q();
            gVar.b(new n0.a.l2.a(nVar));
            Object o = nVar.o();
            if (o != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return o;
            }
            i.e(cVar, "frame");
            return o;
        }
    }

    public static int Z0(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        return -1;
    }

    public static Uri Z1(JSONObject jSONObject, String str) throws JSONException {
        z0(jSONObject, "json must not be null");
        z0(str, "field must not be null");
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException(i0.d.a.a.a.o0("field \"", str, "\" is mapped to a null value"));
    }

    public static void Z2(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        z0(jSONObject, "json must not be null");
        z0(str, "field must not be null");
        z0(jSONObject2, "value must not be null");
        try {
            jSONObject.put(str, (Object) jSONObject2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static final String Z3(m0.l.c<?> cVar) {
        String str;
        if (cVar instanceof n0.a.h2.g) {
            return cVar.toString();
        }
        try {
            str = cVar + '@' + M1(cVar);
        } catch (Throwable th) {
            str = i0.j.f.p.h.l0(th);
        }
        Throwable a = Result.a(str);
        String str2 = str;
        if (a != null) {
            str2 = cVar.getClass().getName() + '@' + M1(cVar);
        }
        return (String) str2;
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
            default:
                objArr[0] = "nodes";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static n0.c.j.d a0(Encoder encoder, SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "descriptor");
        return encoder.c(serialDescriptor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r0 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress a1(java.lang.String r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r18
            r8 = r4
            r9 = r8
            r7 = r5
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00df
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 4
            r13 = 255(0xff, float:3.57E-43)
            if (r11 > r1) goto L_0x0033
            java.lang.String r14 = "::"
            boolean r14 = kotlin.text.StringsKt__IndentKt.I(r0, r14, r6, r5, r12)
            if (r14 == 0) goto L_0x0033
            if (r8 == r4) goto L_0x0027
            return r10
        L_0x0027:
            int r7 = r7 + 2
            if (r11 != r1) goto L_0x002f
            r0 = r2
            r8 = r7
            goto L_0x00e0
        L_0x002f:
            r8 = r7
            r9 = r11
            goto L_0x00ac
        L_0x0033:
            if (r7 == 0) goto L_0x00ab
            java.lang.String r11 = ":"
            boolean r11 = kotlin.text.StringsKt__IndentKt.I(r0, r11, r6, r5, r12)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = kotlin.text.StringsKt__IndentKt.I(r0, r11, r6, r5, r12)
            if (r6 == 0) goto L_0x00aa
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r1) goto L_0x009c
            if (r11 != r2) goto L_0x0051
            goto L_0x005b
        L_0x0051:
            if (r11 == r6) goto L_0x005f
            char r14 = r0.charAt(r9)
            r15 = 46
            if (r14 == r15) goto L_0x005d
        L_0x005b:
            r0 = r5
            goto L_0x00a2
        L_0x005d:
            int r9 = r9 + 1
        L_0x005f:
            r15 = r5
            r14 = r9
        L_0x0061:
            if (r14 >= r1) goto L_0x008b
            char r5 = r0.charAt(r14)
            r2 = 48
            int r16 = m0.n.b.i.g(r5, r2)
            if (r16 < 0) goto L_0x008b
            r4 = 57
            int r4 = m0.n.b.i.g(r5, r4)
            if (r4 <= 0) goto L_0x0078
            goto L_0x008b
        L_0x0078:
            if (r15 != 0) goto L_0x007d
            if (r9 == r14) goto L_0x007d
            goto L_0x00a1
        L_0x007d:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r13) goto L_0x0084
            goto L_0x00a1
        L_0x0084:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0061
        L_0x008b:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x004c
        L_0x009c:
            int r6 = r6 + r12
            if (r11 != r6) goto L_0x00a1
            r0 = 1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 != 0) goto L_0x00a5
            return r10
        L_0x00a5:
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00e0
        L_0x00aa:
            return r10
        L_0x00ab:
            r9 = r6
        L_0x00ac:
            r6 = r9
            r2 = 0
        L_0x00ae:
            if (r6 >= r1) goto L_0x00c2
            char r4 = r0.charAt(r6)
            int r4 = q0.h0.c.q(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00ae
        L_0x00c2:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00de
            if (r4 <= r12) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r13
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00de:
            return r10
        L_0x00df:
            r0 = r2
        L_0x00e0:
            if (r7 == r0) goto L_0x00f5
            r1 = -1
            if (r8 != r1) goto L_0x00e6
            return r10
        L_0x00e6:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00f5:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.a1(java.lang.String, int, int):java.net.InetAddress");
    }

    public static Uri a2(JSONObject jSONObject, String str) throws JSONException {
        z0(jSONObject, "json must not be null");
        z0(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException(i0.d.a.a.a.o0("field \"", str, "\" is mapped to a null value"));
    }

    public static void a3(JSONObject jSONObject, String str, String str2) {
        z0(jSONObject, "json must not be null");
        z0(str, "field must not be null");
        if (str2 != null) {
            try {
                jSONObject.put(str, (Object) str2);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
    }

    public static final Double a4(String str) {
        i.e(str, "$this$toDoubleOrNull");
        try {
            if (m0.t.d.a.a(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final <T, E extends T> KSerializer<E[]> b(m0.r.d<T> dVar, KSerializer<E> kSerializer) {
        i.e(dVar, "kClass");
        i.e(kSerializer, "elementSerializer");
        return new n0.c.k.b1(dVar, kSerializer);
    }

    public static final r0.h b0(w wVar) {
        i.e(wVar, "$this$buffer");
        return new r0.s(wVar);
    }

    public static s0.a.e.b.h b1(s0.a.e.b.e eVar, byte[] bArr) {
        s0.a.e.b.g k = eVar.k(BigInteger.valueOf((long) (bArr[bArr.length - 1] & 1)));
        s0.a.e.b.g k2 = eVar.k(new BigInteger(1, bArr));
        if (!g4(k2).equals(eVar.b)) {
            k2 = k2.b();
        }
        s0.a.e.b.g gVar = null;
        if (k2.i()) {
            gVar = eVar.c.n();
        } else {
            s0.a.e.b.g a = k2.o().g().j(eVar.c).a(eVar.b).a(k2);
            if (!a.i()) {
                s0.a.e.b.g k3 = eVar.k(s0.a.e.b.c.a);
                Random random = new Random();
                int f = a.f();
                while (true) {
                    s0.a.e.b.g k4 = eVar.k(new BigInteger(f, random));
                    s0.a.e.b.g gVar2 = a;
                    s0.a.e.b.g gVar3 = k3;
                    for (int i = 1; i <= f - 1; i++) {
                        s0.a.e.b.g o = gVar2.o();
                        gVar3 = gVar3.o().a(o.j(k4));
                        gVar2 = o.a(a);
                    }
                    if (gVar2.i()) {
                        if (!gVar3.o().a(gVar3).i()) {
                            a = gVar3;
                            break;
                        }
                    } else {
                        a = null;
                        break;
                    }
                }
            }
            if (a != null) {
                if (!g4(a).equals(k)) {
                    a = a.b();
                }
                gVar = k2.j(a);
            }
        }
        if (gVar != null) {
            return eVar.u(k2.t(), gVar.t());
        }
        throw new IllegalArgumentException("Invalid point compression");
    }

    public static final void b2(m0.l.e eVar, Throwable th) {
        try {
            int i = CoroutineExceptionHandler.j;
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) eVar.get(CoroutineExceptionHandler.a.c);
            if (coroutineExceptionHandler == null) {
                n0.a.e0.a(eVar, th);
            } else {
                coroutineExceptionHandler.handleException(eVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                i0.j.f.p.h.m(runtimeException, th);
                th = runtimeException;
            }
            n0.a.e0.a(eVar, th);
        }
    }

    public static boolean b3(s0.a.a.b3.b bVar, s0.a.a.b3.b bVar2) {
        if (bVar.size() != bVar2.size()) {
            return false;
        }
        s0.a.a.b3.a[] u = bVar.u();
        s0.a.a.b3.a[] u2 = bVar2.u();
        if (u.length != u2.length) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i == u.length) {
                return true;
            }
            s0.a.a.b3.a aVar = u[i];
            s0.a.a.b3.a aVar2 = u2[i];
            if (aVar != aVar2 && (aVar == null || aVar2 == null || !aVar.c.w(aVar2.c) || !r0(aVar.d).equals(r0(aVar2.d)))) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    public static final Float b4(String str) {
        i.e(str, "$this$toFloatOrNull");
        try {
            if (m0.t.d.a.a(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = i * 2; i4 > 0; i4--) {
            A(iArr2, iArr, i2, iArr3);
            s0.a.b.e0.t0.f(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i3, 16);
            i3 = (length + i2) - i3;
            i2 += 16;
        }
    }

    public static final r0.i c0(y yVar) {
        i.e(yVar, "$this$buffer");
        return new t(yVar);
    }

    public static /* synthetic */ Object c1(n0.c.j.c cVar, SerialDescriptor serialDescriptor, int i, n0.c.b bVar, Object obj, int i2, Object obj2) {
        int i3 = i2 & 8;
        return cVar.m(serialDescriptor, i, bVar, null);
    }

    public static final int c2(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        i.e(serialDescriptor, "$this$hashCodeImpl");
        i.e(serialDescriptorArr, "typeParams");
        int hashCode = (serialDescriptor.a().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        i.e(serialDescriptor, "$this$elementDescriptors");
        n0.c.i.e eVar = new n0.c.i.e(serialDescriptor);
        e.a aVar = new e.a(eVar);
        int i = 1;
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (!aVar.hasNext()) {
                break;
            }
            int i4 = i2 * 31;
            String a = ((SerialDescriptor) aVar.next()).a();
            if (a != null) {
                i3 = a.hashCode();
            }
            i2 = i4 + i3;
        }
        e.a aVar2 = new e.a(eVar);
        while (aVar2.hasNext()) {
            int i5 = i * 31;
            n0.c.i.g f = ((SerialDescriptor) aVar2.next()).f();
            i = i5 + (f != null ? f.hashCode() : 0);
        }
        return (((hashCode * 31) + i2) * 31) + i;
    }

    public static s0.a.a.b3.b[] c3(String str, s0.a.a.b3.d dVar) {
        String str2;
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        int i = -1;
        while (true) {
            int i2 = 0;
            if (i != str.length()) {
                if (i == str.length()) {
                    str2 = null;
                } else {
                    i++;
                    stringBuffer.setLength(0);
                    boolean z = false;
                    boolean z2 = false;
                    while (i != str.length()) {
                        char charAt = str.charAt(i);
                        if (charAt == '\"') {
                            if (!z) {
                                z2 = !z2;
                            }
                        } else if (!z && !z2) {
                            if (charAt == '\\') {
                                stringBuffer.append(charAt);
                                z = true;
                            } else if (charAt == ',') {
                                break;
                            } else {
                                stringBuffer.append(charAt);
                            }
                            i++;
                        }
                        stringBuffer.append(charAt);
                        z = false;
                        i++;
                    }
                    str2 = stringBuffer.toString();
                }
                if (str2.indexOf(43) > 0) {
                    s0.a.a.b3.e.e eVar = new s0.a.a.b3.e.e(str2, '+');
                    s0.a.a.b3.e.e eVar2 = new s0.a.a.b3.e.e(eVar.b(), '=');
                    String b = eVar2.b();
                    if (eVar2.a()) {
                        String b2 = eVar2.b();
                        n c = dVar.c(b.trim());
                        if (eVar.a()) {
                            Vector vector2 = new Vector();
                            Vector vector3 = new Vector();
                            while (true) {
                                vector2.addElement(c);
                                vector3.addElement(h4(b2));
                                if (eVar.a()) {
                                    s0.a.a.b3.e.e eVar3 = new s0.a.a.b3.e.e(eVar.b(), '=');
                                    String b3 = eVar3.b();
                                    if (eVar3.a()) {
                                        b2 = eVar3.b();
                                        c = dVar.c(b3.trim());
                                    } else {
                                        throw new IllegalArgumentException("badly formatted directory string");
                                    }
                                } else {
                                    int size = vector2.size();
                                    n[] nVarArr = new n[size];
                                    for (int i3 = 0; i3 != size; i3++) {
                                        nVarArr[i3] = (n) vector2.elementAt(i3);
                                    }
                                    int size2 = vector3.size();
                                    String[] strArr = new String[size2];
                                    for (int i4 = 0; i4 != size2; i4++) {
                                        strArr[i4] = (String) vector3.elementAt(i4);
                                    }
                                    s0.a.a.e[] eVarArr = new s0.a.a.e[size2];
                                    for (int i5 = 0; i5 != size2; i5++) {
                                        eVarArr[i5] = ((s0.a.a.b3.e.a) dVar).g(nVarArr[i5], strArr[i5]);
                                    }
                                    s0.a.a.b3.a[] aVarArr = new s0.a.a.b3.a[size];
                                    while (i2 != size) {
                                        aVarArr[i2] = new s0.a.a.b3.a(nVarArr[i2], eVarArr[i2]);
                                        i2++;
                                    }
                                    vector.addElement(new s0.a.a.b3.b(aVarArr));
                                }
                            }
                        } else {
                            vector.addElement(new s0.a.a.b3.b(c, ((s0.a.a.b3.e.a) dVar).g(c, h4(b2))));
                        }
                    } else {
                        throw new IllegalArgumentException("badly formatted directory string");
                    }
                } else {
                    s0.a.a.b3.e.e eVar4 = new s0.a.a.b3.e.e(str2, '=');
                    String b4 = eVar4.b();
                    if (eVar4.a()) {
                        String b5 = eVar4.b();
                        n c2 = dVar.c(b4.trim());
                        vector.addElement(new s0.a.a.b3.b(c2, ((s0.a.a.b3.e.a) dVar).g(c2, h4(b5))));
                    } else {
                        throw new IllegalArgumentException("badly formatted directory string");
                    }
                }
            } else {
                int size3 = vector.size();
                s0.a.a.b3.b[] bVarArr = new s0.a.a.b3.b[size3];
                while (i2 != size3) {
                    bVarArr[i2] = (s0.a.a.b3.b) vector.elementAt(i2);
                    i2++;
                }
                return new s0.a.a.b3.c(dVar, bVarArr).u();
            }
        }
    }

    public static final String c4(byte b) {
        char[] cArr = r0.a0.b.a;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    public static n0.a.f2.d d(int i, BufferOverflow bufferOverflow, l lVar, int i2) {
        boolean z = false;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        int i3 = i2 & 4;
        int i4 = 1;
        if (i == -2) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                Objects.requireNonNull(n0.a.f2.d.l);
                i4 = d.a.b;
            }
            return new n0.a.f2.c(i4, bufferOverflow, (l) null);
        } else if (i == -1) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                z = true;
            }
            if (z) {
                return new n0.a.f2.i((l) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i != 0) {
            if (i == Integer.MAX_VALUE) {
                return new n0.a.f2.j((l) null);
            }
            if (i == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) {
                return new n0.a.f2.i((l) null);
            }
            return new n0.a.f2.c(i, bufferOverflow, (l) null);
        } else if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new n0.a.f2.p((l) null);
        } else {
            return new n0.a.f2.c(1, bufferOverflow, (l) null);
        }
    }

    public static n0.a.g2.d d0(n0.a.g2.d dVar, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
        BufferOverflow bufferOverflow2;
        int i3;
        if ((i2 & 1) != 0) {
            i = -2;
        }
        BufferOverflow bufferOverflow3 = (i2 & 2) != 0 ? BufferOverflow.SUSPEND : null;
        boolean z = true;
        if (i >= 0 || i == -2 || i == -1) {
            if (i == -1 && bufferOverflow3 != BufferOverflow.SUSPEND) {
                z = false;
            }
            if (z) {
                if (i == -1) {
                    bufferOverflow2 = BufferOverflow.DROP_OLDEST;
                    i3 = 0;
                } else {
                    i3 = i;
                    bufferOverflow2 = bufferOverflow3;
                }
                if (dVar instanceof n0.a.g2.d0.k) {
                    return ((n0.a.g2.d0.k) dVar).c(EmptyCoroutineContext.c, i3, bufferOverflow2);
                }
                return new n0.a.g2.d0.f(dVar, (m0.l.e) null, i3, bufferOverflow2, 2);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(i.k("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", Integer.valueOf(i)).toString());
    }

    public static final Object d1(long j, m0.l.c<? super m0.i> cVar) {
        if (j <= 0) {
            return m0.i.a;
        }
        n0.a.n nVar = new n0.a.n(i0.j.f.p.h.b2(cVar), 1);
        nVar.q();
        if (j < RecyclerView.FOREVER_NS) {
            K1(nVar.Z1).e(j, nVar);
        }
        Object o = nVar.o();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (o == coroutineSingletons) {
            i.e(cVar, "frame");
        }
        if (o == coroutineSingletons) {
            return o;
        }
        return m0.i.a;
    }

    public static <N> Boolean d2(Collection<N> collection, m0.r.t.a.r.o.c<N> cVar, l<N, Boolean> lVar) {
        if (lVar != null) {
            return (Boolean) e1(collection, cVar, new m0.r.t.a.r.o.a(lVar, new boolean[1]));
        }
        a(9);
        throw null;
    }

    public static final <T> Object d3(Object obj, m0.l.c<? super T> cVar) {
        return obj instanceof n0.a.z ? i0.j.f.p.h.l0(((n0.a.z) obj).b) : obj;
    }

    public static final String d4(String str, boolean z) {
        if (z) {
            i.e(str, "<this>");
            StringBuilder sb = new StringBuilder(str.length());
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                i++;
                if ('A' <= charAt && charAt <= 'Z') {
                    charAt = Character.toLowerCase(charAt);
                }
                sb.append(charAt);
            }
            String sb2 = sb.toString();
            i.d(sb2, "builder.toString()");
            return sb2;
        }
        String lowerCase = str.toLowerCase();
        i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    public static void e(int[] iArr) {
        if (iArr != null) {
            Arrays.fill(iArr, 0);
        }
    }

    public static final SerialDescriptor e0(String str, SerialDescriptor[] serialDescriptorArr, l<? super n0.c.i.a, m0.i> lVar) {
        i.e(str, "serialName");
        i.e(serialDescriptorArr, "typeParameters");
        i.e(lVar, "builderAction");
        if (!StringsKt__IndentKt.o(str)) {
            n0.c.i.a aVar = new n0.c.i.a(str);
            lVar.invoke(aVar);
            return new SerialDescriptorImpl(str, h.a.a, aVar.b.size(), i0.j.f.p.h.l4(serialDescriptorArr), aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static <N, R> R e1(Collection<N> collection, m0.r.t.a.r.o.c<N> cVar, m0.r.t.a.r.o.d<N, R> dVar) {
        if (collection == null) {
            a(4);
            throw null;
        } else if (cVar != null) {
            m0.r.t.a.r.o.f fVar = new m0.r.t.a.r.o.f();
            for (N g1 : collection) {
                g1(g1, cVar, fVar, dVar);
            }
            return dVar.a();
        } else {
            a(5);
            throw null;
        }
    }

    public static s0.a.e.b.h e2(s0.a.e.b.h hVar) {
        if (hVar.l(false, false)) {
            return hVar;
        }
        throw new IllegalStateException("Invalid result");
    }

    public static void e3(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    public static final <T> Object e4(Object obj, l<? super Throwable, m0.i> lVar) {
        Throwable a = Result.a(obj);
        if (a != null) {
            return new n0.a.z(a, false, 2);
        }
        if (lVar != null) {
            return new n0.a.a0(obj, lVar);
        }
        return obj;
    }

    public static void f(int[][] iArr) {
        for (int[] e : iArr) {
            e(e);
        }
    }

    public static final SerialDescriptor f0(String str, n0.c.i.g gVar, SerialDescriptor[] serialDescriptorArr, l<? super n0.c.i.a, m0.i> lVar) {
        i.e(str, "serialName");
        i.e(gVar, "kind");
        i.e(serialDescriptorArr, "typeParameters");
        i.e(lVar, "builder");
        if (!(!StringsKt__IndentKt.o(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        } else if (!i.a(gVar, h.a.a)) {
            n0.c.i.a aVar = new n0.c.i.a(str);
            lVar.invoke(aVar);
            return new SerialDescriptorImpl(str, gVar, aVar.b.size(), i0.j.f.p.h.l4(serialDescriptorArr), aVar);
        } else {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
    }

    public static final <T> n0.a.g2.d<T> f1(n0.a.g2.d<? extends T> dVar) {
        l<Object, Object> lVar = FlowKt__DistinctKt.a;
        if (dVar instanceof n0.a.g2.z) {
            return dVar;
        }
        l<Object, Object> lVar2 = FlowKt__DistinctKt.a;
        m0.n.a.p<Object, Object, Boolean> pVar = FlowKt__DistinctKt.b;
        if (dVar instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) dVar;
            if (distinctFlowImpl.d == lVar2 && distinctFlowImpl.q == pVar) {
                return dVar;
            }
        }
        return new DistinctFlowImpl(dVar, lVar2, pVar);
    }

    public static long f2(long j, long j2) {
        long j3 = j & 1229782938247303441L;
        long j4 = j & 2459565876494606882L;
        long j5 = j & 4919131752989213764L;
        long j6 = j & -8608480567731124088L;
        long j7 = j2 & 1229782938247303441L;
        long j8 = j2 & 2459565876494606882L;
        long j9 = j2 & 4919131752989213764L;
        long j10 = j2 & -8608480567731124088L;
        return (((((j3 * j7) ^ (j4 * j10)) ^ (j5 * j9)) ^ (j6 * j8)) & 1229782938247303441L) | (((((j3 * j8) ^ (j4 * j7)) ^ (j5 * j10)) ^ (j6 * j9)) & 2459565876494606882L) | (((((j3 * j9) ^ (j4 * j8)) ^ (j5 * j7)) ^ (j6 * j10)) & 4919131752989213764L) | (((((j3 * j10) ^ (j4 * j9)) ^ (j5 * j8)) ^ (j6 * j7)) & -8608480567731124088L);
    }

    public static s0.a.e.b.h f3(s0.a.e.b.h hVar, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        s0.a.e.b.h m = hVar.b.m();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                m = hVar;
            }
            for (int i = 1; i < bitLength; i++) {
                hVar = hVar.z();
                if (abs.testBit(i)) {
                    m = m.a(hVar);
                }
            }
        }
        return bigInteger.signum() < 0 ? m.p() : m;
    }

    public static /* synthetic */ Object f4(Object obj, l lVar, int i) {
        int i2 = i & 1;
        return e4(obj, (l<? super Throwable, m0.i>) null);
    }

    public static n0.a.v g(n0.a.f1 f1Var, int i) {
        int i2 = i & 1;
        return new n0.a.w((n0.a.f1) null);
    }

    public static /* synthetic */ SerialDescriptor g0(String str, n0.c.i.g gVar, SerialDescriptor[] serialDescriptorArr, l lVar, int i) {
        return f0(str, gVar, serialDescriptorArr, (i & 8) != 0 ? SerialDescriptorsKt$buildSerialDescriptor$1.c : null);
    }

    public static <N> void g1(N n, m0.r.t.a.r.o.c<N> cVar, m0.r.t.a.r.o.e<N> eVar, m0.r.t.a.r.o.d<N, ?> dVar) {
        if (n == null) {
            a(22);
            throw null;
        } else if (cVar == null) {
            a(23);
            throw null;
        } else if (eVar == null) {
            a(24);
            throw null;
        } else if (dVar == null) {
            a(25);
            throw null;
        } else if (((m0.r.t.a.r.o.f) eVar).a.add(n) && dVar.c(n)) {
            for (Object g1 : cVar.a(n)) {
                g1(g1, cVar, eVar, dVar);
            }
            dVar.b(n);
        }
    }

    public static void g2(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((jArr2[1] << 7) ^ (j4 >>> 57)) & 144115188075855871L;
        long j6 = j4 & 144115188075855871L;
        long[] jArr4 = new long[6];
        long[] jArr5 = jArr3;
        long[] jArr6 = jArr4;
        h2(jArr5, j3, j6, jArr4, 0);
        long[] jArr7 = jArr6;
        h2(jArr5, j2, j5, jArr7, 2);
        h2(jArr5, j3 ^ j2, j6 ^ j5, jArr7, 4);
        long j7 = jArr6[1] ^ jArr6[2];
        long j8 = jArr6[0];
        long j9 = jArr6[3];
        long j10 = (jArr6[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr6[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    public static final m0.r.t.a.r.m.v g3(m0.r.t.a.r.m.v vVar, m0.r.t.a.r.c.r0.f fVar) {
        i.e(vVar, "<this>");
        i.e(fVar, "newAnnotations");
        if (!vVar.getAnnotations().isEmpty() || !fVar.isEmpty()) {
            return vVar.L0().O0(fVar);
        }
        return vVar;
    }

    public static s0.a.e.b.g g4(s0.a.e.b.g gVar) {
        s0.a.e.b.g gVar2 = gVar;
        for (int i = 1; i < gVar.f(); i++) {
            gVar2 = gVar2.o().a(gVar);
        }
        return gVar2;
    }

    public static final f0 h(m0.l.e eVar) {
        int i = n0.a.f1.k;
        if (eVar.get(f1.a.c) == null) {
            eVar = eVar.plus(n((n0.a.f1) null, 1, (Object) null));
        }
        return new n0.a.h2.f(eVar);
    }

    public static String h0(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 != i + i2; i3++) {
            if (bArr[i3] >= 32 && bArr[i3] <= 126) {
                stringBuffer.append((char) bArr[i3]);
            }
        }
        return stringBuffer.toString();
    }

    public static final String h1(String str, int i) {
        i.e(str, "$this$drop");
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(i);
            i.d(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.g0("Requested character count ", i, " is less than zero.").toString());
    }

    public static void h2(long[] jArr, long j, long j2, long[] jArr2, int i) {
        long j3 = j;
        jArr[1] = j2;
        jArr[2] = jArr[1] << 1;
        jArr[3] = jArr[2] ^ j2;
        jArr[4] = jArr[2] << 1;
        jArr[5] = jArr[4] ^ j2;
        jArr[6] = jArr[3] << 1;
        jArr[7] = jArr[6] ^ j2;
        long j4 = jArr[((int) j3) & 7];
        long j5 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j3 >>> i2);
            long j6 = (jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6);
            j4 ^= j6 << i2;
            j5 ^= j6 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr2[i] = 144115188075855871L & j4;
        jArr2[i + 1] = (((((j3 & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j5) << 7) ^ (j4 >>> 57);
    }

    public static final m0.r.t.a.r.m.v h3(m0.r.t.a.r.m.v vVar) {
        m0.r.t.a.r.m.a0 a0Var;
        i.e(vVar, "<this>");
        m0.r.t.a.r.m.v0 L0 = vVar.L0();
        if (L0 instanceof m0.r.t.a.r.m.q) {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
            m0.r.t.a.r.m.q qVar = (m0.r.t.a.r.m.q) L0;
            m0.r.t.a.r.m.a0 a0Var2 = qVar.d;
            if (!a0Var2.I0().getParameters().isEmpty() && a0Var2.I0().c() != null) {
                List<m0.r.t.a.r.c.m0> parameters = a0Var2.I0().getParameters();
                i.d(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(parameters, 10));
                for (m0.r.t.a.r.c.m0 starProjectionImpl : parameters) {
                    arrayList.add(new StarProjectionImpl(starProjectionImpl));
                }
                a0Var2 = i0.j.f.p.h.v3(a0Var2, arrayList, (m0.r.t.a.r.c.r0.f) null, 2);
            }
            m0.r.t.a.r.m.a0 a0Var3 = qVar.q;
            if (!a0Var3.I0().getParameters().isEmpty() && a0Var3.I0().c() != null) {
                List<m0.r.t.a.r.c.m0> parameters2 = a0Var3.I0().getParameters();
                i.d(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(i0.j.f.p.h.K(parameters2, 10));
                for (m0.r.t.a.r.c.m0 starProjectionImpl2 : parameters2) {
                    arrayList2.add(new StarProjectionImpl(starProjectionImpl2));
                }
                a0Var3 = i0.j.f.p.h.v3(a0Var3, arrayList2, (m0.r.t.a.r.c.r0.f) null, 2);
            }
            a0Var = KotlinTypeFactory.c(a0Var2, a0Var3);
        } else if (L0 instanceof m0.r.t.a.r.m.a0) {
            m0.r.t.a.r.m.a0 a0Var4 = (m0.r.t.a.r.m.a0) L0;
            boolean isEmpty = a0Var4.I0().getParameters().isEmpty();
            a0Var = a0Var4;
            if (!isEmpty) {
                m0.r.t.a.r.c.f c = a0Var4.I0().c();
                a0Var = a0Var4;
                if (c != null) {
                    List<m0.r.t.a.r.c.m0> parameters3 = a0Var4.I0().getParameters();
                    i.d(parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(i0.j.f.p.h.K(parameters3, 10));
                    for (m0.r.t.a.r.c.m0 starProjectionImpl3 : parameters3) {
                        arrayList3.add(new StarProjectionImpl(starProjectionImpl3));
                    }
                    a0Var = i0.j.f.p.h.v3(a0Var4, arrayList3, (m0.r.t.a.r.c.r0.f) null, 2);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return i0.j.f.p.h.a2(a0Var, L0);
    }

    public static String h4(String str) {
        int i;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            i = 2;
            stringBuffer.append("\\#");
        } else {
            i = 0;
        }
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c = 0;
        while (i != charArray.length) {
            char c2 = charArray[i];
            if (c2 != ' ') {
                z3 = true;
            }
            if (c2 == '\"') {
                if (!z) {
                    z2 = !z2;
                }
                stringBuffer.append(c2);
            } else if (c2 == '\\' && !z && !z2) {
                i2 = stringBuffer.length();
                z = true;
                i++;
            } else if (c2 != ' ' || z || z3) {
                if (z) {
                    if (('0' <= c2 && c2 <= '9') || ('a' <= c2 && c2 <= 'f') || ('A' <= c2 && c2 <= 'F')) {
                        if (c != 0) {
                            stringBuffer.append((char) (L0(c2) + (L0(c) * 16)));
                            z = false;
                            c = 0;
                        } else {
                            c = c2;
                        }
                        i++;
                    }
                }
                stringBuffer.append(c2);
            } else {
                i++;
            }
            z = false;
            i++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i2 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static final <T> SerialDescriptor i(String str, KSerializer<T> kSerializer) {
        i.e(str, "name");
        i.e(kSerializer, "primitiveSerializer");
        return new n0.c.k.a0(str, new n0.c.k.b0(kSerializer));
    }

    public static final <E> UndeliveredElementException i0(l<? super E, m0.i> lVar, E e, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException(i.k("Exception in undelivered element handler for ", e), th);
            }
            i0.j.f.p.h.m(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static final <T> n0.a.g2.d<T> i1(n0.a.g2.d<? extends T> dVar, int i) {
        if (i >= 0) {
            return new n0.a.g2.g(dVar, i);
        }
        throw new IllegalArgumentException(i.k("Drop count should be non-negative, but had ", Integer.valueOf(i)).toString());
    }

    public static s0.a.e.b.h i2(s0.a.e.b.h hVar, BigInteger bigInteger, s0.a.e.b.h hVar2, BigInteger bigInteger2) {
        s0.a.e.b.h a;
        s0.a.e.b.h hVar3;
        s0.a.e.b.h hVar4 = hVar;
        BigInteger bigInteger3 = bigInteger;
        BigInteger bigInteger4 = bigInteger2;
        s0.a.e.b.e eVar = hVar4.b;
        int J1 = J1(eVar);
        if (bigInteger.bitLength() > J1 || bigInteger2.bitLength() > J1) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        s0.a.e.b.j V2 = V2(hVar);
        s0.a.e.b.j V22 = V2(hVar2);
        s0.a.e.b.a aVar = V2.b;
        s0.a.e.b.a aVar2 = V22.b;
        int i = V2.c;
        if (i != V22.c) {
            s0.a.e.b.i iVar = new s0.a.e.b.i();
            a = iVar.a(hVar4, bigInteger3);
            hVar3 = iVar.a(hVar2, bigInteger4);
        } else {
            int i2 = ((J1 + i) - 1) / i;
            s0.a.e.b.h m = eVar.m();
            int i3 = i * i2;
            int[] P0 = h3.P0(i3, bigInteger3);
            int[] P02 = h3.P0(i3, bigInteger4);
            int i4 = i3 - 1;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = 0;
                int i7 = 0;
                for (int i8 = i4 - i5; i8 >= 0; i8 -= i2) {
                    int i9 = i8 >>> 5;
                    int i10 = i8 & 31;
                    int i11 = P0[i9] >>> i10;
                    i6 = ((i6 ^ (i11 >>> 1)) << 1) ^ i11;
                    int i12 = P02[i9] >>> i10;
                    i7 = ((i7 ^ (i12 >>> 1)) << 1) ^ i12;
                }
                m = m.A(aVar.c(i6).a(aVar2.c(i7)));
            }
            a = m.a(V2.a);
            hVar3 = V22.a;
        }
        return a.a(hVar3);
    }

    public static final m0.r.t.a.r.m.v i3(m0.r.t.a.r.m.v vVar, List<m0.r.t.a.r.m.b1.c> list) {
        m0.r.t.a.r.m.o0 o0Var;
        Variance variance;
        vVar.H0().size();
        list.size();
        ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(list, 10));
        for (m0.r.t.a.r.m.b1.c cVar : list) {
            Objects.requireNonNull(cVar);
            m0.r.t.a.r.m.x0.d.a.d(cVar.b, cVar.c);
            if (i.a(cVar.b, cVar.c) || cVar.a.l() == (variance = Variance.IN_VARIANCE)) {
                o0Var = new m0.r.t.a.r.m.o0(cVar.b);
            } else if (f.F(cVar.b) && cVar.a.l() != variance) {
                Variance variance2 = Variance.OUT_VARIANCE;
                if (variance2 == cVar.a.l()) {
                    variance2 = Variance.INVARIANT;
                }
                o0Var = new m0.r.t.a.r.m.o0(variance2, cVar.c);
            } else if (f.G(cVar.c)) {
                if (variance == cVar.a.l()) {
                    variance = Variance.INVARIANT;
                }
                o0Var = new m0.r.t.a.r.m.o0(variance, cVar.b);
            } else {
                Variance variance3 = Variance.OUT_VARIANCE;
                if (variance3 == cVar.a.l()) {
                    variance3 = Variance.INVARIANT;
                }
                o0Var = new m0.r.t.a.r.m.o0(variance3, cVar.c);
            }
            arrayList.add(o0Var);
        }
        return i0.j.f.p.h.u3(vVar, arrayList, (m0.r.t.a.r.c.r0.f) null, (List) null, 6);
    }

    public static final String i4(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, " + "non-finite floating point values are prohibited because they do not conform JSON specification. " + "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\n" + "Current output: " + L2(str2, -1);
    }

    public static final JsonDecodingException j(Number number, String str, String str2) {
        i.e(number, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        i.e(str2, "output");
        return p(-1, i4(number, str, str2));
    }

    public static /* synthetic */ UndeliveredElementException j0(l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i) {
        int i2 = i & 2;
        return i0(lVar, obj, (UndeliveredElementException) null);
    }

    public static String j1(Object obj) {
        s0.a.a.r rVar;
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof s0.a.a.r) {
            rVar = (s0.a.a.r) obj;
        } else if (obj instanceof s0.a.a.e) {
            rVar = ((s0.a.a.e) obj).c();
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("unknown object type ");
            P0.append(obj.toString());
            return P0.toString();
        }
        B("", false, rVar, stringBuffer);
        return stringBuffer.toString();
    }

    public static s0.a.e.b.h j2(s0.a.e.b.h hVar, BigInteger bigInteger, s0.a.e.b.h hVar2, BigInteger bigInteger2) {
        s0.a.e.b.h[] hVarArr;
        s0.a.e.b.h[] hVarArr2;
        s0.a.e.b.h[] hVarArr3;
        s0.a.e.b.h[] hVarArr4;
        s0.a.e.b.h hVar3 = hVar;
        boolean z = false;
        boolean z2 = bigInteger.signum() < 0;
        boolean z3 = bigInteger2.signum() < 0;
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int d = s0.a.e.b.v.d(abs.bitLength(), 8);
        int d2 = s0.a.e.b.v.d(abs2.bitLength(), 8);
        s0.a.e.b.u f = s0.a.e.b.v.f(hVar3, d, true);
        s0.a.e.b.u f2 = s0.a.e.b.v.f(hVar2, d2, true);
        int J1 = J1(hVar3.b);
        if (!z2 && !z3 && bigInteger.bitLength() <= J1 && bigInteger2.bitLength() <= J1) {
            if (f.a <= 0) {
                if (f2.a <= 0) {
                    z = true;
                }
                if (z) {
                    return i2(hVar, bigInteger, hVar2, bigInteger2);
                }
            }
        }
        int min = Math.min(8, f.f);
        int min2 = Math.min(8, f2.f);
        if (z2) {
            hVarArr = f.d;
        } else {
            hVarArr = f.c;
        }
        s0.a.e.b.h[] hVarArr5 = hVarArr;
        if (z3) {
            hVarArr2 = f2.d;
        } else {
            hVarArr2 = f2.c;
        }
        s0.a.e.b.h[] hVarArr6 = hVarArr2;
        if (z2) {
            hVarArr3 = f.c;
        } else {
            hVarArr3 = f.d;
        }
        s0.a.e.b.h[] hVarArr7 = hVarArr3;
        if (z3) {
            hVarArr4 = f2.c;
        } else {
            hVarArr4 = f2.d;
        }
        return k2(hVarArr5, hVarArr7, s0.a.e.b.v.b(min, abs), hVarArr6, hVarArr4, s0.a.e.b.v.b(min2, abs2));
    }

    public static o0.a.a.b j3(String str) throws JSONException {
        z0(str, "jsonStr can not be null");
        JSONObject jSONObject = new JSONObject(str);
        Set<String> set = o0.a.a.d.a;
        if (jSONObject.has("redirectUri")) {
            return o0.a.a.d.c(jSONObject);
        }
        if (jSONObject.has("post_logout_redirect_uri")) {
            z0(jSONObject, "json cannot be null");
            return new o0.a.a.i(o0.a.a.g.a(jSONObject.getJSONObject("configuration")), W1(jSONObject, "id_token_hint"), Z1(jSONObject, "post_logout_redirect_uri"), W1(jSONObject, "state"));
        }
        throw new IllegalArgumentException("No AuthorizationManagementRequest found matching to this json schema");
    }

    public static String j4(s0.a.a.e eVar) {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        if (!(eVar instanceof s0.a.a.y) || (eVar instanceof g1)) {
            try {
                stringBuffer.append('#');
                stringBuffer.append(s0.a.g.k.d.f(eVar.c().r("DER")));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String e = ((s0.a.a.y) eVar).e();
            if (e.length() > 0 && e.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(e);
        }
        int length = stringBuffer.length();
        int i3 = 2;
        if (!(stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#')) {
            i3 = 0;
        }
        while (i != length) {
            char charAt = stringBuffer.charAt(i);
            if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            stringBuffer.insert(i, "\\");
            i += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' ') {
                stringBuffer.insert(i2, "\\");
                i2 += 2;
            }
        }
        int length2 = stringBuffer.length() - 1;
        while (length2 >= 0 && stringBuffer.charAt(length2) == ' ') {
            stringBuffer.insert(length2, '\\');
            length2--;
        }
        return stringBuffer.toString();
    }

    public static final JsonEncodingException k(Number number, String str) {
        i.e(number, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        i.e(str, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, " + "non-finite floating point values are prohibited because they do not conform JSON specification. " + "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\n" + "Current output: " + L2(str, -1));
    }

    public static final <T> n0.a.g2.d<T> k0(m0.n.a.p<? super n0.a.f2.l<? super T>, ? super m0.l.c<? super m0.i>, ? extends Object> pVar) {
        return new CallbackFlowBuilder(pVar, (m0.l.e) null, 0, (BufferOverflow) null, 14);
    }

    public static String k1(String str, byte[] bArr) {
        String h02;
        String str2 = j.a;
        StringBuffer stringBuffer = new StringBuffer();
        String str3 = str + "    ";
        stringBuffer.append(str2);
        for (int i = 0; i < bArr.length; i += 32) {
            int length = bArr.length - i;
            stringBuffer.append(str3);
            if (length > 32) {
                stringBuffer.append(j.a(s0.a.g.k.d.e(bArr, i, 32)));
                stringBuffer.append("    ");
                h02 = h0(bArr, i, 32);
            } else {
                stringBuffer.append(j.a(s0.a.g.k.d.e(bArr, i, bArr.length - i)));
                for (int length2 = bArr.length - i; length2 != 32; length2++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append("    ");
                h02 = h0(bArr, i, bArr.length - i);
            }
            stringBuffer.append(h02);
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    public static s0.a.e.b.h k2(s0.a.e.b.h[] hVarArr, s0.a.e.b.h[] hVarArr2, byte[] bArr, s0.a.e.b.h[] hVarArr3, s0.a.e.b.h[] hVarArr4, byte[] bArr2) {
        s0.a.e.b.h hVar;
        int max = Math.max(bArr.length, bArr2.length);
        s0.a.e.b.h m = hVarArr[0].b.m();
        int i = max - 1;
        int i2 = 0;
        s0.a.e.b.h hVar2 = m;
        while (i >= 0) {
            byte b = i < bArr.length ? bArr[i] : 0;
            byte b2 = i < bArr2.length ? bArr2[i] : 0;
            if ((b | b2) == 0) {
                i2++;
            } else {
                if (b != 0) {
                    hVar = m.a((b < 0 ? hVarArr2 : hVarArr)[Math.abs(b) >>> 1]);
                } else {
                    hVar = m;
                }
                if (b2 != 0) {
                    hVar = hVar.a((b2 < 0 ? hVarArr4 : hVarArr3)[Math.abs(b2) >>> 1]);
                }
                if (i2 > 0) {
                    hVar2 = hVar2.y(i2);
                    i2 = 0;
                }
                hVar2 = hVar2.A(hVar);
            }
            i--;
        }
        return i2 > 0 ? hVar2.y(i2) : hVar2;
    }

    public static final <T> void k3(l0<? super T> l0Var, m0.l.c<? super T> cVar, boolean z) {
        Object g = l0Var.g();
        Throwable d = l0Var.d(g);
        Object l02 = d != null ? i0.j.f.p.h.l0(d) : l0Var.e(g);
        if (z) {
            n0.a.h2.g gVar = (n0.a.h2.g) cVar;
            m0.l.c<T> cVar2 = gVar.Y1;
            Object obj = gVar.a2;
            m0.l.e context = cVar2.getContext();
            Object c = ThreadContextKt.c(context, obj);
            b2<?> b = c != ThreadContextKt.a ? c0.b(cVar2, context, c) : null;
            try {
                gVar.Y1.resumeWith(l02);
            } finally {
                if (b == null || b.w0()) {
                    ThreadContextKt.a(context, c);
                }
            }
        } else {
            cVar.resumeWith(l02);
        }
    }

    /* JADX INFO: finally extract failed */
    public static final <T> Object k4(m0.l.e eVar, m0.n.a.p<? super f0, ? super m0.l.c<? super T>, ? extends Object> pVar, m0.l.c<? super T> cVar) {
        Object obj;
        m0.l.e context = cVar.getContext();
        m0.l.e plus = context.plus(eVar);
        n1(plus);
        if (plus == context) {
            n0.a.h2.r rVar = new n0.a.h2.r(plus, cVar);
            obj = K3(rVar, rVar, pVar);
        } else {
            int i = m0.l.d.h;
            d.a aVar = d.a.c;
            if (i.a(plus.get(aVar), context.get(aVar))) {
                b2 b2Var = new b2(plus, cVar);
                Object c = ThreadContextKt.c(plus, (Object) null);
                try {
                    Object K3 = K3(b2Var, b2Var, pVar);
                    ThreadContextKt.a(plus, c);
                    obj = K3;
                } catch (Throwable th) {
                    ThreadContextKt.a(plus, c);
                    throw th;
                }
            } else {
                n0.a.k0 k0Var = new n0.a.k0(plus, cVar);
                I3(pVar, k0Var, k0Var, (l) null, 4);
                obj = k0Var.w0();
            }
        }
        if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
            i.e(cVar, "frame");
        }
        return obj;
    }

    public static final JsonEncodingException l(Number number, String str, String str2) {
        i.e(number, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        i.e(str2, "output");
        return new JsonEncodingException(i4(number, str, str2));
    }

    public static final void l0(m0.l.e eVar, CancellationException cancellationException) {
        int i = n0.a.f1.k;
        n0.a.f1 f1Var = (n0.a.f1) eVar.get(f1.a.c);
        if (f1Var != null) {
            f1Var.b(cancellationException);
        }
    }

    public static <T> void l1(Encoder encoder, n0.c.f<? super T> fVar, T t) {
        i.e(fVar, "serializer");
        if (fVar.getDescriptor().c()) {
            encoder.e(fVar, t);
        } else if (t == null) {
            encoder.f();
        } else {
            encoder.p();
            encoder.e(fVar, t);
        }
    }

    public static void l2(long[] jArr, long[] jArr2) {
        s0.a.e.d.a.b(jArr, 0, 2, jArr2, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: n0.a.z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object l3(m0.l.e r4, m0.n.a.p r5, int r6, java.lang.Object r7) throws java.lang.InterruptedException {
        /*
            r4 = r6 & 1
            r6 = 0
            if (r4 == 0) goto L_0x0008
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.c
            goto L_0x0009
        L_0x0008:
            r4 = r6
        L_0x0009:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            m0.l.d$a r0 = m0.l.d.a.c
            r4.get(r0)
            n0.a.y1 r4 = n0.a.y1.a
            n0.a.s0 r4 = n0.a.y1.a()
            java.lang.String r1 = "context"
            m0.n.b.i.e(r4, r1)
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.c
            java.util.Objects.requireNonNull(r2)
            m0.n.b.i.e(r4, r1)
            n0.a.d0 r1 = n0.a.m0.a
            if (r4 == r1) goto L_0x0034
            m0.l.e$a r0 = r4.get(r0)
            if (r0 != 0) goto L_0x0034
            m0.l.e r0 = r4.plus(r1)
            goto L_0x0035
        L_0x0034:
            r0 = r4
        L_0x0035:
            n0.a.g r1 = new n0.a.g
            r1.<init>(r0, r7, r4)
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r4.invoke(r5, r1, r1)
            n0.a.s0 r4 = r1.x     // Catch:{ all -> 0x009f }
            r5 = 0
            if (r4 != 0) goto L_0x0045
            goto L_0x004a
        L_0x0045:
            int r7 = n0.a.s0.d     // Catch:{ all -> 0x009f }
            r4.Z(r5)     // Catch:{ all -> 0x009f }
        L_0x004a:
            boolean r4 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0094 }
            if (r4 != 0) goto L_0x008b
            n0.a.s0 r4 = r1.x     // Catch:{ all -> 0x0094 }
            if (r4 != 0) goto L_0x005a
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x005e
        L_0x005a:
            long r2 = r4.c0()     // Catch:{ all -> 0x0094 }
        L_0x005e:
            java.lang.Object r4 = r1.a0()     // Catch:{ all -> 0x0094 }
            boolean r4 = r4 instanceof n0.a.a1     // Catch:{ all -> 0x0094 }
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0087
            n0.a.s0 r4 = r1.x     // Catch:{ all -> 0x009f }
            if (r4 != 0) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            int r7 = n0.a.s0.d     // Catch:{ all -> 0x009f }
            r4.T(r5)     // Catch:{ all -> 0x009f }
        L_0x0072:
            java.lang.Object r4 = r1.a0()
            java.lang.Object r4 = n0.a.j1.a(r4)
            boolean r5 = r4 instanceof n0.a.z
            if (r5 == 0) goto L_0x0081
            r6 = r4
            n0.a.z r6 = (n0.a.z) r6
        L_0x0081:
            if (r6 != 0) goto L_0x0084
            return r4
        L_0x0084:
            java.lang.Throwable r4 = r6.b
            throw r4
        L_0x0087:
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r2)     // Catch:{ all -> 0x0094 }
            goto L_0x004a
        L_0x008b:
            java.lang.InterruptedException r4 = new java.lang.InterruptedException     // Catch:{ all -> 0x0094 }
            r4.<init>()     // Catch:{ all -> 0x0094 }
            r1.K(r4)     // Catch:{ all -> 0x0094 }
            throw r4     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r4 = move-exception
            n0.a.s0 r6 = r1.x     // Catch:{ all -> 0x009f }
            if (r6 == 0) goto L_0x009e
            int r7 = n0.a.s0.d     // Catch:{ all -> 0x009f }
            r6.T(r5)     // Catch:{ all -> 0x009f }
        L_0x009e:
            throw r4     // Catch:{ all -> 0x009f }
        L_0x009f:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.l3(m0.l.e, m0.n.a.p, int, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    public static final <T, V> Object l4(m0.l.e eVar, V v, Object obj, m0.n.a.p<? super V, ? super m0.l.c<? super T>, ? extends Object> pVar, m0.l.c<? super T> cVar) {
        Object c = ThreadContextKt.c(eVar, obj);
        try {
            n0.a.g2.d0.p pVar2 = new n0.a.g2.d0.p(cVar, eVar);
            if (pVar != null) {
                m0.n.b.r.c(pVar, 2);
                Object invoke = pVar.invoke(v, pVar2);
                ThreadContextKt.a(eVar, c);
                if (invoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    i.e(cVar, "frame");
                }
                return invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            ThreadContextKt.a(eVar, c);
            throw th;
        }
    }

    public static final JsonEncodingException m(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "keyDescriptor");
        StringBuilder P0 = i0.d.a.a.a.P0("Value of type '");
        P0.append(serialDescriptor.a());
        P0.append("' can't be used in JSON as a key in the map. ");
        P0.append("It should have either primitive or enum kind, but its kind is '");
        P0.append(serialDescriptor.f());
        P0.append("'.\n");
        P0.append("Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
        return new JsonEncodingException(P0.toString());
    }

    public static /* synthetic */ void m0(m0.l.e eVar, CancellationException cancellationException, int i, Object obj) {
        int i2 = i & 1;
        l0(eVar, (CancellationException) null);
    }

    public static byte[] m1(s0.a.b.k0.b bVar) throws IOException {
        String str;
        if (bVar == null) {
            throw new IllegalArgumentException("cipherParameters was null.");
        } else if (bVar instanceof s0.a.b.k0.k1) {
            if (!bVar.c) {
                s0.a.b.k0.k1 k1Var = (s0.a.b.k0.k1) bVar;
                s0.a.b.o0.f fVar = new s0.a.b.o0.f();
                fVar.e("ssh-rsa");
                fVar.c(k1Var.y);
                fVar.c(k1Var.x);
                return fVar.a();
            }
            throw new IllegalArgumentException("RSAKeyParamaters was for encryption");
        } else if (bVar instanceof s0.a.b.k0.c0) {
            s0.a.b.o0.f fVar2 = new s0.a.b.o0.f();
            s0.a.b.k0.c0 c0Var = (s0.a.b.k0.c0) bVar;
            s0.a.b.k0.w wVar = c0Var.d;
            Map<n, String> map = SSHNamedCurves.a;
            if (wVar instanceof s0.a.b.k0.a0) {
                str = SSHNamedCurves.a.get(((s0.a.b.k0.a0) wVar).m);
            } else {
                str = SSHNamedCurves.c.get(SSHNamedCurves.d.get(wVar.g));
            }
            if (str != null) {
                fVar2.e("ecdsa-sha2-" + str);
                fVar2.e(str);
                fVar2.d(c0Var.q.i(false));
                return fVar2.a();
            }
            StringBuilder P0 = i0.d.a.a.a.P0("unable to derive ssh curve name for ");
            P0.append(c0Var.d.g.getClass().getName());
            throw new IllegalArgumentException(P0.toString());
        } else if (bVar instanceof s0.a.b.k0.r) {
            s0.a.b.k0.r rVar = (s0.a.b.k0.r) bVar;
            s0.a.b.k0.p pVar = rVar.d;
            s0.a.b.o0.f fVar3 = new s0.a.b.o0.f();
            fVar3.e("ssh-dss");
            fVar3.c(pVar.q);
            fVar3.c(pVar.d);
            fVar3.c(pVar.c);
            fVar3.c(rVar.y);
            return fVar3.a();
        } else if (bVar instanceof s0.a.b.k0.f0) {
            s0.a.b.o0.f fVar4 = new s0.a.b.o0.f();
            fVar4.e("ssh-ed25519");
            fVar4.d(((s0.a.b.k0.f0) bVar).getEncoded());
            return fVar4.a();
        } else {
            StringBuilder P02 = i0.d.a.a.a.P0("unable to convert ");
            P02.append(bVar.getClass().getName());
            P02.append(" to private key");
            throw new IllegalArgumentException(P02.toString());
        }
    }

    public static s0.a.e.b.h m2(boolean[] zArr, s0.a.e.b.u[] uVarArr, byte[][] bArr) {
        s0.a.e.b.h[] hVarArr;
        int i = 0;
        for (byte[] length : bArr) {
            i = Math.max(i, length.length);
        }
        s0.a.e.b.h m = uVarArr[0].c[0].b.m();
        int i2 = i - 1;
        int i3 = 0;
        s0.a.e.b.h hVar = m;
        while (i2 >= 0) {
            s0.a.e.b.h hVar2 = m;
            for (int i4 = 0; i4 < r0; i4++) {
                byte[] bArr2 = bArr[i4];
                byte b = i2 < bArr2.length ? bArr2[i2] : 0;
                if (b != 0) {
                    int abs = Math.abs(b);
                    s0.a.e.b.u uVar = uVarArr[i4];
                    if ((b < 0) == zArr[i4]) {
                        hVarArr = uVar.c;
                    } else {
                        hVarArr = uVar.d;
                    }
                    hVar2 = hVar2.a(hVarArr[abs >>> 1]);
                }
            }
            if (hVar2 == m) {
                i3++;
            } else {
                if (i3 > 0) {
                    hVar = hVar.y(i3);
                    i3 = 0;
                }
                hVar = hVar.A(hVar2);
            }
            i2--;
        }
        return i3 > 0 ? hVar.y(i3) : hVar;
    }

    public static final int m3(SegmentedByteString segmentedByteString, int i) {
        int i2;
        i.e(segmentedByteString, "$this$segment");
        int[] iArr = segmentedByteString.Z1;
        int i3 = i + 1;
        int length = segmentedByteString.Y1.length;
        i.e(iArr, "$this$binarySearch");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public static void m4(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        while (true) {
            i3--;
            if (i3 >= 0) {
                int i4 = i + i3;
                bArr[i4] = (byte) (bArr[i4] ^ bArr2[i2 + i3]);
            } else {
                return;
            }
        }
    }

    public static n0.a.x n(n0.a.f1 f1Var, int i, Object obj) {
        int i2 = i & 1;
        return new n0.a.h1((n0.a.f1) null);
    }

    public static void n0(f0 f0Var, CancellationException cancellationException, int i) {
        int i2 = i & 1;
        m0.l.e C = f0Var.C();
        int i3 = n0.a.f1.k;
        n0.a.f1 f1Var = (n0.a.f1) C.get(f1.a.c);
        if (f1Var != null) {
            f1Var.b((CancellationException) null);
            return;
        }
        throw new IllegalStateException(i.k("Scope cannot be cancelled because it does not have a job: ", f0Var).toString());
    }

    public static final void n1(m0.l.e eVar) {
        int i = n0.a.f1.k;
        n0.a.f1 f1Var = (n0.a.f1) eVar.get(f1.a.c);
        if (f1Var != null && !f1Var.a()) {
            throw f1Var.v();
        }
    }

    public static s0.a.e.b.h n2(s0.a.e.b.e eVar, s0.a.e.b.h hVar) {
        if (eVar.j(hVar.b)) {
            return eVar.n(hVar);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static final <T> m0.s.h<T> n3(T... tArr) {
        i.e(tArr, "elements");
        return tArr.length == 0 ? m0.s.d.a : i0.j.f.p.h.w(tArr);
    }

    public static void n4(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i3 + 1;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i = i4 + 1;
        } while (i < 16);
    }

    public static n0.c.l.a o(n0.c.l.a aVar, l lVar, int i) {
        boolean z = true;
        a.C0281a aVar2 = (i & 1) != 0 ? n0.c.l.a.a : null;
        i.e(aVar2, "from");
        i.e(lVar, "builderAction");
        n0.c.l.c cVar = new n0.c.l.c(aVar2.b);
        lVar.invoke(cVar);
        if (!cVar.h || i.a(cVar.i, "type")) {
            if (!cVar.e) {
                if (!i.a(cVar.f, "    ")) {
                    throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
                }
            } else if (!i.a(cVar.f, "    ")) {
                String str = cVar.f;
                int i2 = 0;
                while (true) {
                    if (i2 >= str.length()) {
                        break;
                    }
                    char charAt = str.charAt(i2);
                    if (!(charAt == ' ' || charAt == 9 || charAt == 13 || charAt == 10)) {
                        z = false;
                        break;
                    }
                    i2++;
                }
                if (!z) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ");
                    P0.append(cVar.f);
                    throw new IllegalArgumentException(P0.toString().toString());
                }
            }
            return new n0.c.l.h(new n0.c.l.q.d(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h, cVar.i, cVar.j, cVar.k));
        }
        throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
    }

    public static /* synthetic */ void o0(n0.a.f1 f1Var, CancellationException cancellationException, int i, Object obj) {
        int i2 = i & 1;
        f1Var.b((CancellationException) null);
    }

    public static final boolean o1(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static String o2(m0.r.t.a.r.n.b bVar, m0.r.t.a.r.c.r rVar) {
        i.e(bVar, "this");
        i.e(rVar, "functionDescriptor");
        if (!bVar.b(rVar)) {
            return bVar.getDescription();
        }
        return null;
    }

    public static final KSerializer<Byte> o3(m0.n.b.b bVar) {
        i.e(bVar, "$this$serializer");
        return n0.c.k.k.b;
    }

    public static void o4(byte[] bArr, byte[] bArr2, int i) {
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
            int i4 = i3 + 1;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i + i4]);
            int i5 = i4 + 1;
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i + i5]);
            i2 = i5 + 1;
        } while (i2 < 16);
    }

    public static final JsonDecodingException p(int i, String str) {
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static void p0(m0.l.e eVar, CancellationException cancellationException, int i, Object obj) {
        int i2 = i & 1;
        int i3 = n0.a.f1.k;
        n0.a.f1 f1Var = (n0.a.f1) eVar.get(f1.a.c);
        if (f1Var != null) {
            for (n0.a.f1 b : f1Var.getChildren()) {
                b.b((CancellationException) null);
            }
        }
    }

    public static final Void p1(JsonElement jsonElement, String str) {
        StringBuilder P0 = i0.d.a.a.a.P0("Element ");
        P0.append(m0.n.b.m.a(jsonElement.getClass()));
        P0.append(" is not a ");
        P0.append(str);
        throw new IllegalArgumentException(P0.toString());
    }

    public static /* synthetic */ n0.a.o0 p2(n0.a.f1 f1Var, boolean z, boolean z2, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return f1Var.q(z, z2, lVar);
    }

    public static final KSerializer<Integer> p3(m0.n.b.h hVar) {
        i.e(hVar, "$this$serializer");
        return n0.c.k.e0.b;
    }

    public static final JsonDecodingException q(int i, String str, String str2) {
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        i.e(str2, "input");
        return p(i, str + "\nJSON input: " + L2(str2, i));
    }

    public static final void q0(n0.a.f2.n<?> nVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th);
            }
        }
        nVar.b(cancellationException);
    }

    public static final <T> n0.c.b<? extends T> q1(n0.c.k.b<T> bVar, n0.c.j.c cVar, String str) {
        i.e(bVar, "$this$findPolymorphicSerializer");
        i.e(cVar, "decoder");
        i.e(cVar, "decoder");
        n0.c.b<? extends T> c = cVar.a().c(bVar.a(), str);
        if (c != null) {
            return c;
        }
        X3(str, bVar.a());
        throw null;
    }

    public static n0.a.o0 q2(long j, Runnable runnable, m0.l.e eVar) {
        return h0.a.C(j, runnable, eVar);
    }

    public static final KSerializer<Long> q3(m0.n.b.k kVar) {
        i.e(kVar, "$this$serializer");
        return n0.c.k.o0.b;
    }

    public static final JsonPrimitive r(Number number) {
        if (number == null) {
            return n0.c.l.k.a;
        }
        return new n0.c.l.i(number, false);
    }

    public static String r0(s0.a.a.e eVar) {
        String j4 = j4(eVar);
        if (j4.length() > 0 && j4.charAt(0) == '#') {
            try {
                s0.a.a.r x = s0.a.a.r.x(s0.a.g.k.d.c(j4, 1, j4.length() - 1));
                if (x instanceof s0.a.a.y) {
                    j4 = ((s0.a.a.y) x).e();
                }
            } catch (IOException e) {
                throw new IllegalStateException("unknown encoding in name: " + e);
            }
        }
        String d = j.d(j4);
        int length = d.length();
        if (length < 2) {
            return d;
        }
        int i = length - 1;
        int i2 = 0;
        while (i2 < i && d.charAt(i2) == '\\' && d.charAt(i2 + 1) == ' ') {
            i2 += 2;
        }
        int i3 = i2 + 1;
        int i4 = i;
        while (i4 > i3 && d.charAt(i4 - 1) == '\\' && d.charAt(i4) == ' ') {
            i4 -= 2;
        }
        if (i2 > 0 || i4 < i) {
            d = d.substring(i2, i4 + 1);
        }
        if (d.indexOf("  ") < 0) {
            return d;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char charAt = d.charAt(0);
        stringBuffer.append(charAt);
        for (int i5 = 1; i5 < d.length(); i5++) {
            char charAt2 = d.charAt(i5);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static final <T> n0.c.f<T> r1(n0.c.k.b<T> bVar, Encoder encoder, T t) {
        i.e(bVar, "$this$findPolymorphicSerializer");
        i.e(encoder, "encoder");
        i.e(t, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        i.e(encoder, "encoder");
        i.e(t, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        n0.c.f<T> d = encoder.a().d(bVar.a(), t);
        if (d != null) {
            return d;
        }
        m0.r.d a = m0.n.b.m.a(t.getClass());
        m0.r.d<T> a2 = bVar.a();
        i.e(a, "subClass");
        i.e(a2, "baseClass");
        String e = a.e();
        if (e == null) {
            e = String.valueOf(a);
        }
        X3(e, a2);
        throw null;
    }

    public static final boolean r2(f0 f0Var) {
        m0.l.e C = f0Var.C();
        int i = n0.a.f1.k;
        n0.a.f1 f1Var = (n0.a.f1) C.get(f1.a.c);
        if (f1Var == null) {
            return true;
        }
        return f1Var.a();
    }

    public static final KSerializer<Short> r3(m0.n.b.o oVar) {
        i.e(oVar, "$this$serializer");
        return n0.c.k.f1.b;
    }

    public static final JsonPrimitive s(String str) {
        if (str == null) {
            return n0.c.l.k.a;
        }
        return new n0.c.l.i(str, true);
    }

    public static final int s0(int i) {
        if (i < 3) {
            return 3;
        }
        return (i / 3) + i + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object s1(n0.a.g2.d<? extends T> r4, m0.l.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r4 = r0.d
            n0.a.g2.l r4 = (n0.a.g2.l) r4
            java.lang.Object r0 = r0.c
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            i0.j.f.p.h.d4(r5)     // Catch:{ AbortFlowException -> 0x002f }
            goto L_0x0061
        L_0x002f:
            r5 = move-exception
            goto L_0x005d
        L_0x0031:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0039:
            i0.j.f.p.h.d4(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            n0.a.h2.t r2 = n0.a.g2.d0.n.a
            r5.c = r2
            n0.a.g2.l r2 = new n0.a.g2.l
            r2.<init>(r5)
            r0.c = r5     // Catch:{ AbortFlowException -> 0x0059 }
            r0.d = r2     // Catch:{ AbortFlowException -> 0x0059 }
            r0.x = r3     // Catch:{ AbortFlowException -> 0x0059 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ AbortFlowException -> 0x0059 }
            if (r4 != r1) goto L_0x0057
            goto L_0x0067
        L_0x0057:
            r0 = r5
            goto L_0x0061
        L_0x0059:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005d:
            n0.a.g2.e<?> r1 = r5.c
            if (r1 != r4) goto L_0x0070
        L_0x0061:
            T r1 = r0.c
            n0.a.h2.t r4 = n0.a.g2.d0.n.a
            if (r1 == r4) goto L_0x0068
        L_0x0067:
            return r1
        L_0x0068:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        L_0x0070:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.s1(n0.a.g2.d, m0.l.c):java.lang.Object");
    }

    public static final boolean s2(AssertionError assertionError) {
        Logger logger = p.a;
        i.e(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? StringsKt__IndentKt.d(message, "getsockname failed", false, 2) : false;
    }

    public static final KSerializer<String> s3(m0.n.b.q qVar) {
        i.e(qVar, "$this$serializer");
        return n0.c.k.g1.b;
    }

    public static byte[] t(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, bArr.length - i, bArr2, 0, i);
        return bArr2;
    }

    public static final String t0(String str) {
        i.e(str, "<this>");
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt <= 'z') {
            z = true;
        }
        if (!z) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        i.d(substring, "(this as java.lang.String).substring(startIndex)");
        return String.valueOf(upperCase) + substring;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r5.collect(r2, r0) == r1) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object t1(n0.a.g2.d<? extends T> r5, m0.n.a.p<? super T, ? super m0.l.c<? super java.lang.Boolean>, ? extends java.lang.Object> r6, m0.l.c<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.x
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r5 = r0.q
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r5 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) r5
            java.lang.Object r6 = r0.d
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.c
            m0.n.a.p r0 = (m0.n.a.p) r0
            i0.j.f.p.h.d4(r7)     // Catch:{ AbortFlowException -> 0x0033 }
            goto L_0x006a
        L_0x0033:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L_0x0064
        L_0x0039:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0041:
            i0.j.f.p.h.d4(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            n0.a.h2.t r2 = n0.a.g2.d0.n.a
            r7.c = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2
            r2.<init>(r6, r7)
            r0.c = r6     // Catch:{ AbortFlowException -> 0x0061 }
            r0.d = r7     // Catch:{ AbortFlowException -> 0x0061 }
            r0.q = r2     // Catch:{ AbortFlowException -> 0x0061 }
            r0.y = r3     // Catch:{ AbortFlowException -> 0x0061 }
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch:{ AbortFlowException -> 0x0061 }
            if (r5 != r1) goto L_0x0068
            goto L_0x0070
        L_0x0061:
            r5 = move-exception
            r0 = r5
            r5 = r2
        L_0x0064:
            n0.a.g2.e<?> r1 = r0.c
            if (r1 != r5) goto L_0x007d
        L_0x0068:
            r0 = r6
            r6 = r7
        L_0x006a:
            T r1 = r6.c
            n0.a.h2.t r5 = n0.a.g2.d0.n.a
            if (r1 == r5) goto L_0x0071
        L_0x0070:
            return r1
        L_0x0071:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element matching the predicate "
            java.lang.String r6 = m0.n.b.i.k(r6, r0)
            r5.<init>(r6)
            throw r5
        L_0x007d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.t1(n0.a.g2.d, m0.n.a.p, m0.l.c):java.lang.Object");
    }

    public static final boolean t2(int i) {
        return i == 1 || i == 2;
    }

    public static final KSerializer<Object> t3(n0.c.m.b bVar, Type type) {
        i.e(bVar, "$this$serializer");
        i.e(type, "type");
        KSerializer<Object> b = n0.c.g.b(bVar, type, true);
        if (b != null) {
            return b;
        }
        n0.c.k.u0.d(n0.c.g.a(type));
        throw null;
    }

    public static final <T> KSerializer<List<T>> u(KSerializer<T> kSerializer) {
        i.e(kSerializer, "elementSerializer");
        return new n0.c.k.e(kSerializer);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object u0(n0.a.g2.d<? extends T> r4, n0.a.g2.e<? super T> r5, m0.l.c<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.c
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            i0.j.f.p.h.d4(r6)     // Catch:{ all -> 0x002b }
            goto L_0x004e
        L_0x002b:
            r5 = move-exception
            r1 = r5
            goto L_0x0053
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            i0.j.f.p.h.d4(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1 r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1     // Catch:{ all -> 0x0050 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0050 }
            r0.c = r6     // Catch:{ all -> 0x0050 }
            r0.q = r3     // Catch:{ all -> 0x0050 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ all -> 0x0050 }
            if (r4 != r1) goto L_0x004e
            goto L_0x008c
        L_0x004e:
            r1 = 0
            goto L_0x008c
        L_0x0050:
            r4 = move-exception
            r1 = r4
            r4 = r6
        L_0x0053:
            T r4 = r4.c
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r5 = 0
            if (r4 == 0) goto L_0x0062
            boolean r4 = m0.n.b.i.a(r4, r1)
            if (r4 == 0) goto L_0x0062
            r4 = r3
            goto L_0x0063
        L_0x0062:
            r4 = r5
        L_0x0063:
            if (r4 != 0) goto L_0x008d
            m0.l.e r4 = r0.getContext()
            int r6 = n0.a.f1.k
            n0.a.f1$a r6 = n0.a.f1.a.c
            m0.l.e$a r4 = r4.get(r6)
            n0.a.f1 r4 = (n0.a.f1) r4
            if (r4 == 0) goto L_0x0089
            boolean r6 = r4.isCancelled()
            if (r6 != 0) goto L_0x007c
            goto L_0x0089
        L_0x007c:
            java.util.concurrent.CancellationException r4 = r4.v()
            if (r4 == 0) goto L_0x0089
            boolean r4 = m0.n.b.i.a(r4, r1)
            if (r4 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r3 = r5
        L_0x008a:
            if (r3 != 0) goto L_0x008d
        L_0x008c:
            return r1
        L_0x008d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.u0(n0.a.g2.d, n0.a.g2.e, m0.l.c):java.lang.Object");
    }

    public static final Character u1(CharSequence charSequence) {
        i.e(charSequence, "$this$firstOrNull");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static boolean u2(s0.a.e.b.e eVar) {
        s0.a.e.c.a aVar = eVar.a;
        return aVar.b() > 1 && aVar.c().equals(s0.a.e.b.c.c) && (aVar instanceof s0.a.e.c.e);
    }

    public static final KSerializer<Object> u3(n0.c.m.b bVar, m0.r.n nVar) {
        i.e(bVar, "$this$serializer");
        i.e(nVar, "type");
        KSerializer<Object> c = n0.c.g.c(bVar, nVar, true);
        if (c != null) {
            return c;
        }
        m0.r.d<Object> c2 = n0.c.k.u0.c(nVar);
        i.e(c2, "$this$platformSpecificSerializerNotRegistered");
        n0.c.k.u0.d(c2);
        throw null;
    }

    public static final <K, V> KSerializer<Map<K, V>> v(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        i.e(kSerializer, "keySerializer");
        i.e(kSerializer2, "valueSerializer");
        return new n0.c.k.h0(kSerializer, kSerializer2);
    }

    public static final byte v0(char c) {
        if (c < '~') {
            return n0.c.l.q.c.b[c];
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object v1(n0.a.g2.d<? extends T> r4, m0.l.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r4 = r0.d
            n0.a.g2.m r4 = (n0.a.g2.m) r4
            java.lang.Object r0 = r0.c
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            i0.j.f.p.h.d4(r5)     // Catch:{ AbortFlowException -> 0x002f }
            goto L_0x005d
        L_0x002f:
            r5 = move-exception
            goto L_0x0059
        L_0x0031:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0039:
            i0.j.f.p.h.d4(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            n0.a.g2.m r2 = new n0.a.g2.m
            r2.<init>(r5)
            r0.c = r5     // Catch:{ AbortFlowException -> 0x0055 }
            r0.d = r2     // Catch:{ AbortFlowException -> 0x0055 }
            r0.x = r3     // Catch:{ AbortFlowException -> 0x0055 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ AbortFlowException -> 0x0055 }
            if (r4 != r1) goto L_0x0053
            goto L_0x005f
        L_0x0053:
            r0 = r5
            goto L_0x005d
        L_0x0055:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x0059:
            n0.a.g2.e<?> r1 = r5.c
            if (r1 != r4) goto L_0x0060
        L_0x005d:
            T r1 = r0.c
        L_0x005f:
            return r1
        L_0x0060:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.v1(n0.a.g2.d, m0.l.c):java.lang.Object");
    }

    public static boolean v2(s0.a.e.b.e eVar) {
        return w2(eVar.a);
    }

    public static final <T> KSerializer<T> v3(m0.r.d<T> dVar) {
        i.e(dVar, "$this$serializerOrNull");
        i.e(dVar, "$this$compiledSerializerImpl");
        KSerializer<T> I0 = I0(dVar, new KSerializer[0]);
        if (I0 != null) {
            return I0;
        }
        Map<m0.r.d<? extends Object>, KSerializer<? extends Object>> map = n0.c.k.a1.a;
        i.e(dVar, "$this$builtinSerializerOrNull");
        return n0.c.k.a1.a.get(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.serialization.descriptors.SerialDescriptor w(java.lang.String r5, n0.c.i.d r6) {
        /*
            java.lang.String r0 = "serialName"
            m0.n.b.i.e(r5, r0)
            java.lang.String r1 = "kind"
            m0.n.b.i.e(r6, r1)
            boolean r2 = kotlin.text.StringsKt__IndentKt.o(r5)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0081
            java.util.Map<m0.r.d<? extends java.lang.Object>, kotlinx.serialization.KSerializer<? extends java.lang.Object>> r2 = n0.c.k.a1.a
            m0.n.b.i.e(r5, r0)
            m0.n.b.i.e(r6, r1)
            java.util.Map<m0.r.d<? extends java.lang.Object>, kotlinx.serialization.KSerializer<? extends java.lang.Object>> r0 = n0.c.k.a1.a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007b
            java.lang.Object r1 = r0.next()
            m0.r.d r1 = (m0.r.d) r1
            java.lang.String r1 = r1.e()
            m0.n.b.i.c(r1)
            java.lang.String r1 = kotlin.text.StringsKt__IndentKt.a(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "kotlin."
            r2.append(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            boolean r2 = kotlin.text.StringsKt__IndentKt.f(r5, r2, r3)
            if (r2 != 0) goto L_0x0059
            boolean r2 = kotlin.text.StringsKt__IndentKt.f(r5, r1, r3)
            if (r2 != 0) goto L_0x0059
            goto L_0x0024
        L_0x0059:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name "
            java.lang.String r2 = " there already exist "
            java.lang.StringBuilder r5 = i0.d.a.a.a.T0(r0, r5, r2)
            java.lang.String r0 = kotlin.text.StringsKt__IndentKt.a(r1)
            r5.append(r0)
            java.lang.String r0 = "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = kotlin.text.StringsKt__IndentKt.Y(r5)
            r6.<init>(r5)
            throw r6
        L_0x007b:
            n0.c.k.z0 r0 = new n0.c.k.z0
            r0.<init>(r5, r6)
            return r0
        L_0x0081:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Blank serial names are prohibited"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.w(java.lang.String, n0.c.i.d):kotlinx.serialization.descriptors.SerialDescriptor");
    }

    public static Map<String, String> w0(Map<String, String> map, Set<String> set) {
        if (map == null) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            z0(str, "additional parameter keys cannot be null");
            z0(str2, "additional parameter values cannot be null");
            Object[] objArr = {str};
            if (!set.contains(str)) {
                linkedHashMap.put(str, str2);
            } else {
                throw new IllegalArgumentException(String.format("Parameter %s is directly supported via the authorization request builder, use the builder method instead", objArr));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object w1(n0.a.g2.d<? extends T> r4, m0.n.a.p<? super T, ? super m0.l.c<? super java.lang.Boolean>, ? extends java.lang.Object> r5, m0.l.c<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r4 = r0.d
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) r4
            java.lang.Object r5 = r0.c
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            i0.j.f.p.h.d4(r6)     // Catch:{ AbortFlowException -> 0x002f }
            goto L_0x005d
        L_0x002f:
            r6 = move-exception
            goto L_0x0059
        L_0x0031:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0039:
            i0.j.f.p.h.d4(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2
            r2.<init>(r5, r6)
            r0.c = r6     // Catch:{ AbortFlowException -> 0x0055 }
            r0.d = r2     // Catch:{ AbortFlowException -> 0x0055 }
            r0.x = r3     // Catch:{ AbortFlowException -> 0x0055 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ AbortFlowException -> 0x0055 }
            if (r4 != r1) goto L_0x0053
            goto L_0x005f
        L_0x0053:
            r5 = r6
            goto L_0x005d
        L_0x0055:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L_0x0059:
            n0.a.g2.e<?> r0 = r6.c
            if (r0 != r4) goto L_0x0060
        L_0x005d:
            T r1 = r5.c
        L_0x005f:
            return r1
        L_0x0060:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.w1(n0.a.g2.d, m0.n.a.p, m0.l.c):java.lang.Object");
    }

    public static boolean w2(s0.a.e.c.a aVar) {
        return aVar.b() == 1;
    }

    public static final KSerializer<Object> w3(n0.c.m.b bVar, Type type) {
        i.e(bVar, "$this$serializerOrNull");
        i.e(type, "type");
        return n0.c.g.b(bVar, type, false);
    }

    public static void x(int[] iArr, int i, int i2, int i3, int i4) {
        int[] iArr2 = iArr;
        int i5 = i;
        int i6 = i2;
        int i7 = i4;
        int i8 = i6 >>> i3;
        int i9 = 1 << i3;
        int i10 = i8 - 1;
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) - i3;
        int i11 = i7 * 32;
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[i11];
        int[] iArr6 = new int[i11];
        int[][] iArr7 = new int[i9][];
        try {
            System.arraycopy(iArr2, i5, iArr6, 0, i11);
            int i12 = 0;
            while (i12 < i9) {
                int[] iArr8 = new int[(i8 * i11)];
                iArr7[i12] = iArr8;
                int i13 = i9;
                int i14 = 0;
                int i15 = 0;
                while (i15 < i8) {
                    System.arraycopy(iArr6, 0, iArr8, i14, i11);
                    int i16 = i14 + i11;
                    c(iArr6, iArr3, iArr4, iArr5, i7);
                    System.arraycopy(iArr5, 0, iArr8, i16, i11);
                    i14 = i16 + i11;
                    c(iArr5, iArr3, iArr4, iArr6, i7);
                    i15 += 2;
                    i8 = i8;
                }
                int i17 = i8;
                i12++;
                int[] iArr9 = iArr;
                i9 = i13;
            }
            int i18 = i6 - 1;
            for (int i19 = 0; i19 < i6; i19++) {
                int i20 = iArr6[i11 - 16] & i18;
                System.arraycopy(iArr7[i20 >>> numberOfTrailingZeros], (i20 & i10) * i11, iArr5, 0, i11);
                A(iArr5, iArr6, 0, iArr5);
                c(iArr5, iArr3, iArr4, iArr6, i7);
            }
            System.arraycopy(iArr6, 0, iArr, i5, i11);
            f(iArr7);
            f(new int[][]{iArr6, iArr3, iArr4, iArr5});
        } catch (Throwable th) {
            f(iArr7);
            f(new int[][]{iArr6, iArr3, iArr4, iArr5});
            throw th;
        }
    }

    public static void x0(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static final <T> m0.s.h<T> x1(m0.s.h<? extends m0.s.h<? extends T>> hVar) {
        i.e(hVar, "$this$flatten");
        SequencesKt__SequencesKt$flatten$1 sequencesKt__SequencesKt$flatten$1 = SequencesKt__SequencesKt$flatten$1.c;
        if (!(hVar instanceof m0.s.q)) {
            return new m0.s.f(hVar, SequencesKt__SequencesKt$flatten$3.c, sequencesKt__SequencesKt$flatten$1);
        }
        m0.s.q qVar = (m0.s.q) hVar;
        i.e(sequencesKt__SequencesKt$flatten$1, "iterator");
        return new m0.s.f(qVar.a, qVar.b, sequencesKt__SequencesKt$flatten$1);
    }

    public static final boolean x2(r0.f fVar) {
        i.e(fVar, "$this$isProbablyUtf8");
        try {
            r0.f fVar2 = new r0.f();
            fVar.f(fVar2, 0, m0.q.i.a(fVar.d, 64));
            for (int i = 0; i < 16; i++) {
                if (fVar2.t()) {
                    return true;
                }
                int z = fVar2.z();
                if (Character.isISOControl(z) && !Character.isWhitespace(z)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r3 == 0) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> n0.a.g2.t<T> x3(n0.a.g2.d<? extends T> r9, n0.a.f0 r10, n0.a.g2.x r11, int r12) {
        /*
            n0.a.f2.d$a r0 = n0.a.f2.d.l
            java.util.Objects.requireNonNull(r0)
            int r0 = n0.a.f2.d.a.b
            if (r12 >= r0) goto L_0x000a
            goto L_0x000b
        L_0x000a:
            r0 = r12
        L_0x000b:
            int r0 = r0 - r12
            boolean r1 = r9 instanceof n0.a.g2.d0.d
            if (r1 == 0) goto L_0x003e
            r1 = r9
            n0.a.g2.d0.d r1 = (n0.a.g2.d0.d) r1
            n0.a.g2.d r2 = r1.i()
            if (r2 == 0) goto L_0x003e
            n0.a.g2.w r9 = new n0.a.g2.w
            int r3 = r1.d
            r4 = -3
            r5 = 0
            if (r3 == r4) goto L_0x0028
            r4 = -2
            if (r3 == r4) goto L_0x0028
            if (r3 == 0) goto L_0x0028
            r0 = r3
            goto L_0x0036
        L_0x0028:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.q
            kotlinx.coroutines.channels.BufferOverflow r6 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r6) goto L_0x0031
            if (r3 != 0) goto L_0x0036
            goto L_0x0035
        L_0x0031:
            if (r12 != 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = r5
        L_0x0036:
            kotlinx.coroutines.channels.BufferOverflow r3 = r1.q
            m0.l.e r1 = r1.c
            r9.<init>(r2, r0, r3, r1)
            goto L_0x0048
        L_0x003e:
            n0.a.g2.w r1 = new n0.a.g2.w
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.c
            r1.<init>(r9, r0, r2, r3)
            r9 = r1
        L_0x0048:
            int r0 = r9.b
            kotlinx.coroutines.channels.BufferOverflow r1 = r9.c
            n0.a.g2.p r12 = n0.a.g2.u.a(r12, r0, r1)
            m0.l.e r1 = r9.d
            n0.a.g2.d<T> r4 = r9.a
            n0.a.h2.t r6 = n0.a.g2.u.a
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1 r9 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1
            r8 = 0
            r7 = 0
            r2 = r9
            r3 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = 0
            r4 = 2
            r0 = r10
            r3 = r9
            r5 = r8
            n0.a.f1 r9 = E2(r0, r1, r2, r3, r4, r5)
            n0.a.g2.r r10 = new n0.a.g2.r
            r10.<init>(r12, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.a1.a.x3(n0.a.g2.d, n0.a.f0, n0.a.g2.x, int):n0.a.g2.t");
    }

    public static byte[] y(byte[] bArr, byte[] bArr2, int i) {
        s0.a.b.f0.v vVar = new s0.a.b.f0.v(new s0.a.b.b0.x());
        vVar.init(bArr, bArr2, 1);
        return ((y0) vVar.generateDerivedParameters(i * 8)).c;
    }

    public static String y0(String str, Object obj) {
        z0(str, obj);
        x0(!TextUtils.isEmpty(str), obj);
        return str;
    }

    public static final <T1, T2, R> n0.a.g2.d<R> y1(n0.a.g2.d<? extends T1> dVar, n0.a.g2.d<? extends T2> dVar2, m0.n.a.r<? super n0.a.g2.e<? super R>, ? super T1, ? super T2, ? super m0.l.c<? super m0.i>, ? extends Object> rVar) {
        return new n0.a.g2.s(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new n0.a.g2.d[]{dVar, dVar2}, (m0.l.c) null, rVar));
    }

    public static final boolean y2(Throwable th) {
        i.e(th, "<this>");
        Class cls = th.getClass();
        while (!i.a(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ n0.a.g2.t y3(n0.a.g2.d dVar, f0 f0Var, n0.a.g2.x xVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return x3(dVar, f0Var, xVar, i);
    }

    public static n0.a.x z(n0.a.f1 f1Var, int i) {
        int i2 = i & 1;
        return new w1((n0.a.f1) null);
    }

    public static <T> T z0(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static final <R> Object z1(m0.n.a.p<? super f0, ? super m0.l.c<? super R>, ? extends Object> pVar, m0.l.c<? super R> cVar) {
        n0.a.g2.d0.h hVar = new n0.a.g2.d0.h(cVar.getContext(), cVar);
        Object K3 = K3(hVar, hVar, pVar);
        if (K3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            i.e(cVar, "frame");
        }
        return K3;
    }

    public static final boolean z2(m0.r.t.a.r.m.v vVar) {
        i.e(vVar, "<this>");
        return s0.h(vVar);
    }

    public static final char z3(CharSequence charSequence) {
        i.e(charSequence, "$this$single");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (length == 1) {
            return charSequence.charAt(0);
        } else {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }
}
