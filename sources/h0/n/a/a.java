package h0.n.a;

import android.content.res.AssetManager;
import android.util.Log;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: ExifInterface */
public class a {
    public static final HashMap<Integer, Integer> A = new HashMap<>();
    public static final Charset B;
    public static final byte[] C;
    public static final List<Integer> a = Arrays.asList(new Integer[]{1, 6, 3, 8});
    public static final List<Integer> b = Arrays.asList(new Integer[]{2, 7, 4, 5});
    public static final int[] c = {8, 8, 8};
    public static final int[] d = {8};
    public static final byte[] e = {-1, -40, -1};
    public static final byte[] f = {79, 76, 89, 77, 80, 0};
    public static final byte[] g = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static SimpleDateFormat h;
    public static final String[] i = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final int[] j = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] k = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final c[] l;
    public static final c[] m;
    public static final c[] n;
    public static final c[] o;
    public static final c[] p;
    public static final c q = new c("StripOffsets", 273, 3);
    public static final c[] r;
    public static final c[] s;
    public static final c[] t;
    public static final c[] u;
    public static final c[][] v;
    public static final c[] w = {new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
    public static final HashMap<Integer, c>[] x;
    public static final HashMap<String, c>[] y;
    public static final HashSet<String> z = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public final String D;
    public final AssetManager.AssetInputStream E;
    public int F;
    public final HashMap<String, b>[] G;
    public Set<Integer> H;
    public ByteOrder I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;

    /* compiled from: ExifInterface */
    public static class b {
        public final int a;
        public final int b;
        public final byte[] c;

        public b(int i, int i2, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = bArr;
        }

        public static b a(String str) {
            byte[] bytes = (str + 0).getBytes(a.B);
            return new b(2, bytes.length, bytes);
        }

        public static b b(long j, ByteOrder byteOrder) {
            long[] jArr = {j};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.j[4] * 1)]);
            wrap.order(byteOrder);
            for (int i = 0; i < 1; i++) {
                wrap.putInt((int) jArr[i]);
            }
            return new b(4, 1, wrap.array());
        }

        public static b c(d dVar, ByteOrder byteOrder) {
            d[] dVarArr = {dVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.j[5] * 1)]);
            wrap.order(byteOrder);
            for (int i = 0; i < 1; i++) {
                d dVar2 = dVarArr[i];
                wrap.putInt((int) dVar2.a);
                wrap.putInt((int) dVar2.b);
            }
            return new b(5, 1, wrap.array());
        }

        public static b d(int i, ByteOrder byteOrder) {
            int[] iArr = {i};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.j[3] * 1)]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                wrap.putShort((short) iArr[i2]);
            }
            return new b(3, 1, wrap.array());
        }

        public double e(ByteOrder byteOrder) {
            Object h = h(byteOrder);
            if (h == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (h instanceof String) {
                return Double.parseDouble((String) h);
            } else {
                if (h instanceof long[]) {
                    long[] jArr = (long[]) h;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h instanceof int[]) {
                    int[] iArr = (int[]) h;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h instanceof double[]) {
                    double[] dArr = (double[]) h;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h instanceof d[]) {
                    d[] dVarArr = (d[]) h;
                    if (dVarArr.length == 1) {
                        d dVar = dVarArr[0];
                        return ((double) dVar.a) / ((double) dVar.b);
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int f(ByteOrder byteOrder) {
            Object h = h(byteOrder);
            if (h == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (h instanceof String) {
                return Integer.parseInt((String) h);
            } else {
                if (h instanceof long[]) {
                    long[] jArr = (long[]) h;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h instanceof int[]) {
                    int[] iArr = (int[]) h;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String g(ByteOrder byteOrder) {
            Object h = h(byteOrder);
            if (h == null) {
                return null;
            }
            if (h instanceof String) {
                return (String) h;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (h instanceof long[]) {
                long[] jArr = (long[]) h;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(InstabugDbContract.COMMA_SEP);
                    }
                }
                return sb.toString();
            } else if (h instanceof int[]) {
                int[] iArr = (int[]) h;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(InstabugDbContract.COMMA_SEP);
                    }
                }
                return sb.toString();
            } else if (h instanceof double[]) {
                double[] dArr = (double[]) h;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(InstabugDbContract.COMMA_SEP);
                    }
                }
                return sb.toString();
            } else if (!(h instanceof d[])) {
                return null;
            } else {
                d[] dVarArr = (d[]) h;
                while (i < dVarArr.length) {
                    sb.append(dVarArr[i].a);
                    sb.append('/');
                    sb.append(dVarArr[i].b);
                    i++;
                    if (i != dVarArr.length) {
                        sb.append(InstabugDbContract.COMMA_SEP);
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:164:0x01a2 A[SYNTHETIC, Splitter:B:164:0x01a2] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object h(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                h0.n.a.a$a r3 = new h0.n.a.a$a     // Catch:{ IOException -> 0x018c, all -> 0x018a }
                byte[] r4 = r10.c     // Catch:{ IOException -> 0x018c, all -> 0x018a }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x018c, all -> 0x018a }
                r3.x = r11     // Catch:{ IOException -> 0x0188 }
                int r11 = r10.a     // Catch:{ IOException -> 0x0188 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0147;
                    case 2: goto L_0x00fc;
                    case 3: goto L_0x00e2;
                    case 4: goto L_0x00c8;
                    case 5: goto L_0x00a5;
                    case 6: goto L_0x0147;
                    case 7: goto L_0x00fc;
                    case 8: goto L_0x008b;
                    case 9: goto L_0x0071;
                    case 10: goto L_0x004c;
                    case 11: goto L_0x0031;
                    case 12: goto L_0x0017;
                    default: goto L_0x0015;
                }     // Catch:{ IOException -> 0x0188 }
            L_0x0015:
                goto L_0x017f
            L_0x0017:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x001b:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x0028
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x001b
            L_0x0028:
                r3.close()     // Catch:{ IOException -> 0x002c }
                goto L_0x0030
            L_0x002c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0030:
                return r11
            L_0x0031:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x0035:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x0043
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0188 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x0035
            L_0x0043:
                r3.close()     // Catch:{ IOException -> 0x0047 }
                goto L_0x004b
            L_0x0047:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004b:
                return r11
            L_0x004c:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                h0.n.a.a$d[] r11 = new h0.n.a.a.d[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x0050:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x0068
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0188 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0188 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0188 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0188 }
                h0.n.a.a$d r4 = new h0.n.a.a$d     // Catch:{ IOException -> 0x0188 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x0050
            L_0x0068:
                r3.close()     // Catch:{ IOException -> 0x006c }
                goto L_0x0070
            L_0x006c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0070:
                return r11
            L_0x0071:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x0075:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x0082
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x0075
            L_0x0082:
                r3.close()     // Catch:{ IOException -> 0x0086 }
                goto L_0x008a
            L_0x0086:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008a:
                return r11
            L_0x008b:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x008f:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x009c
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x008f
            L_0x009c:
                r3.close()     // Catch:{ IOException -> 0x00a0 }
                goto L_0x00a4
            L_0x00a0:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a4:
                return r11
            L_0x00a5:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                h0.n.a.a$d[] r11 = new h0.n.a.a.d[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x00a9:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x00bf
                long r6 = r3.a()     // Catch:{ IOException -> 0x0188 }
                long r8 = r3.a()     // Catch:{ IOException -> 0x0188 }
                h0.n.a.a$d r4 = new h0.n.a.a$d     // Catch:{ IOException -> 0x0188 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x00a9
            L_0x00bf:
                r3.close()     // Catch:{ IOException -> 0x00c3 }
                goto L_0x00c7
            L_0x00c3:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c7:
                return r11
            L_0x00c8:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x00cc:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x00d9
                long r6 = r3.a()     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x00cc
            L_0x00d9:
                r3.close()     // Catch:{ IOException -> 0x00dd }
                goto L_0x00e1
            L_0x00dd:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e1:
                return r11
            L_0x00e2:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0188 }
            L_0x00e6:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x00f3
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0188 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0188 }
                int r5 = r5 + 1
                goto L_0x00e6
            L_0x00f3:
                r3.close()     // Catch:{ IOException -> 0x00f7 }
                goto L_0x00fb
            L_0x00f7:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fb:
                return r11
            L_0x00fc:
                int r11 = r10.b     // Catch:{ IOException -> 0x0188 }
                byte[] r6 = h0.n.a.a.k     // Catch:{ IOException -> 0x0188 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0188 }
                if (r11 < r6) goto L_0x0119
                r11 = r5
            L_0x0104:
                byte[] r6 = h0.n.a.a.k     // Catch:{ IOException -> 0x0188 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0188 }
                if (r11 >= r7) goto L_0x0116
                byte[] r7 = r10.c     // Catch:{ IOException -> 0x0188 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0188 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0188 }
                if (r7 == r8) goto L_0x0113
                r4 = r5
                goto L_0x0116
            L_0x0113:
                int r11 = r11 + 1
                goto L_0x0104
            L_0x0116:
                if (r4 == 0) goto L_0x0119
                int r5 = r6.length     // Catch:{ IOException -> 0x0188 }
            L_0x0119:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0188 }
                r11.<init>()     // Catch:{ IOException -> 0x0188 }
            L_0x011e:
                int r4 = r10.b     // Catch:{ IOException -> 0x0188 }
                if (r5 >= r4) goto L_0x013a
                byte[] r4 = r10.c     // Catch:{ IOException -> 0x0188 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0188 }
                if (r4 != 0) goto L_0x0129
                goto L_0x013a
            L_0x0129:
                r6 = 32
                if (r4 < r6) goto L_0x0132
                char r4 = (char) r4     // Catch:{ IOException -> 0x0188 }
                r11.append(r4)     // Catch:{ IOException -> 0x0188 }
                goto L_0x0137
            L_0x0132:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0188 }
            L_0x0137:
                int r5 = r5 + 1
                goto L_0x011e
            L_0x013a:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0188 }
                r3.close()     // Catch:{ IOException -> 0x0142 }
                goto L_0x0146
            L_0x0142:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0146:
                return r11
            L_0x0147:
                byte[] r11 = r10.c     // Catch:{ IOException -> 0x0188 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0188 }
                if (r6 != r4) goto L_0x016d
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0188 }
                if (r6 < 0) goto L_0x016d
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0188 }
                if (r11 > r4) goto L_0x016d
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0188 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0188 }
                byte[] r6 = r10.c     // Catch:{ IOException -> 0x0188 }
                byte r6 = r6[r5]     // Catch:{ IOException -> 0x0188 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0188 }
                r4[r5] = r6     // Catch:{ IOException -> 0x0188 }
                r11.<init>(r4)     // Catch:{ IOException -> 0x0188 }
                r3.close()     // Catch:{ IOException -> 0x0168 }
                goto L_0x016c
            L_0x0168:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x016c:
                return r11
            L_0x016d:
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0188 }
                byte[] r4 = r10.c     // Catch:{ IOException -> 0x0188 }
                java.nio.charset.Charset r5 = h0.n.a.a.B     // Catch:{ IOException -> 0x0188 }
                r11.<init>(r4, r5)     // Catch:{ IOException -> 0x0188 }
                r3.close()     // Catch:{ IOException -> 0x017a }
                goto L_0x017e
            L_0x017a:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x017e:
                return r11
            L_0x017f:
                r3.close()     // Catch:{ IOException -> 0x0183 }
                goto L_0x0187
            L_0x0183:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0187:
                return r2
            L_0x0188:
                r11 = move-exception
                goto L_0x018e
            L_0x018a:
                r11 = move-exception
                goto L_0x01a0
            L_0x018c:
                r11 = move-exception
                r3 = r2
            L_0x018e:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019e }
                if (r3 == 0) goto L_0x019d
                r3.close()     // Catch:{ IOException -> 0x0199 }
                goto L_0x019d
            L_0x0199:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x019d:
                return r2
            L_0x019e:
                r11 = move-exception
                r2 = r3
            L_0x01a0:
                if (r2 == 0) goto L_0x01aa
                r2.close()     // Catch:{ IOException -> 0x01a6 }
                goto L_0x01aa
            L_0x01a6:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01aa:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.n.a.a.b.h(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("(");
            P0.append(a.i[this.a]);
            P0.append(", data length:");
            return i0.d.a.a.a.u0(P0, this.c.length, ")");
        }
    }

    /* compiled from: ExifInterface */
    public static class d {
        public final long a;
        public final long b;

        public d(long j, long j2) {
            if (j2 == 0) {
                this.a = 0;
                this.b = 1;
                return;
            }
            this.a = j;
            this.b = j2;
        }

        public String toString() {
            return this.a + "/" + this.b;
        }
    }

    static {
        c[] cVarArr = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
        l = cVarArr;
        c[] cVarArr2 = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        m = cVarArr2;
        c[] cVarArr3 = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
        n = cVarArr3;
        c[] cVarArr4 = {new c("InteroperabilityIndex", 1, 2)};
        o = cVarArr4;
        c[] cVarArr5 = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        p = cVarArr5;
        c[] cVarArr6 = {new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
        r = cVarArr6;
        c[] cVarArr7 = {new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
        s = cVarArr7;
        c[] cVarArr8 = {new c("AspectFrame", 4371, 3)};
        t = cVarArr8;
        c[] cVarArr9 = {new c("ColorSpace", 55, 3)};
        u = cVarArr9;
        c[][] cVarArr10 = {cVarArr, cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr, cVarArr6, cVarArr7, cVarArr8, cVarArr9};
        v = cVarArr10;
        x = new HashMap[cVarArr10.length];
        y = new HashMap[cVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        B = forName;
        C = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        h = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            c[][] cVarArr11 = v;
            if (i2 < cVarArr11.length) {
                x[i2] = new HashMap<>();
                y[i2] = new HashMap<>();
                for (c cVar : cVarArr11[i2]) {
                    x[i2].put(Integer.valueOf(cVar.a), cVar);
                    y[i2].put(cVar.b, cVar);
                }
                i2++;
            } else {
                HashMap<Integer, Integer> hashMap = A;
                c[] cVarArr12 = w;
                hashMap.put(Integer.valueOf(cVarArr12[0].a), 5);
                hashMap.put(Integer.valueOf(cVarArr12[1].a), 1);
                hashMap.put(Integer.valueOf(cVarArr12[2].a), 2);
                hashMap.put(Integer.valueOf(cVarArr12[3].a), 3);
                hashMap.put(Integer.valueOf(cVarArr12[4].a), 7);
                hashMap.put(Integer.valueOf(cVarArr12[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC, Splitter:B:16:0x0031] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.lang.String r3) throws java.io.IOException {
        /*
            r2 = this;
            r2.<init>()
            h0.n.a.a$c[][] r0 = v
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r2.G = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r2.H = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.I = r0
            if (r3 == 0) goto L_0x0038
            r0 = 0
            r2.E = r0
            r2.D = r3
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x002e }
            r1.<init>(r3)     // Catch:{ all -> 0x002e }
            r2.m(r1)     // Catch:{ all -> 0x002b }
            r1.close()     // Catch:{ RuntimeException -> 0x0029, Exception -> 0x0028 }
        L_0x0028:
            return
        L_0x0029:
            r3 = move-exception
            throw r3
        L_0x002b:
            r3 = move-exception
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r3 = move-exception
        L_0x002f:
            if (r0 == 0) goto L_0x0037
            r0.close()     // Catch:{ RuntimeException -> 0x0035, Exception -> 0x0037 }
            goto L_0x0037
        L_0x0035:
            r3 = move-exception
            throw r3
        L_0x0037:
            throw r3
        L_0x0038:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "filename cannot be null"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.n.a.a.<init>(java.lang.String):void");
    }

    public static long[] b(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    public final void a() {
        String c2 = c("DateTimeOriginal");
        if (c2 != null && c("DateTime") == null) {
            this.G[0].put("DateTime", b.a(c2));
        }
        if (c("ImageWidth") == null) {
            this.G[0].put("ImageWidth", b.b(0, this.I));
        }
        if (c("ImageLength") == null) {
            this.G[0].put("ImageLength", b.b(0, this.I));
        }
        if (c("Orientation") == null) {
            this.G[0].put("Orientation", b.b(0, this.I));
        }
        if (c("LightSource") == null) {
            this.G[1].put("LightSource", b.b(0, this.I));
        }
    }

    public String c(String str) {
        b d2 = d(str);
        if (d2 != null) {
            if (!z.contains(str)) {
                return d2.g(this.I);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = d2.a;
                if (i2 == 5 || i2 == 10) {
                    d[] dVarArr = (d[]) d2.h(this.I);
                    if (dVarArr == null || dVarArr.length != 3) {
                        StringBuilder P0 = i0.d.a.a.a.P0("Invalid GPS Timestamp array. array=");
                        P0.append(Arrays.toString(dVarArr));
                        Log.w("ExifInterface", P0.toString());
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) dVarArr[0].a) / ((float) dVarArr[0].b))), Integer.valueOf((int) (((float) dVarArr[1].a) / ((float) dVarArr[1].b))), Integer.valueOf((int) (((float) dVarArr[2].a) / ((float) dVarArr[2].b)))});
                }
                StringBuilder P02 = i0.d.a.a.a.P0("GPS Timestamp format is not rational. format=");
                P02.append(d2.a);
                Log.w("ExifInterface", P02.toString());
                return null;
            }
            try {
                return Double.toString(d2.e(this.I));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final b d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < v.length; i2++) {
            b bVar = this.G[i2].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0087 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(h0.n.a.a.C0059a r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r10.x = r0
            long r0 = (long) r11
            r10.b(r0)
            byte r0 = r10.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x0142
            r3 = 1
            int r11 = r11 + r3
            byte r4 = r10.readByte()
            r5 = -40
            if (r4 != r5) goto L_0x0132
            int r11 = r11 + r3
        L_0x001c:
            byte r0 = r10.readByte()
            if (r0 != r2) goto L_0x0120
            int r11 = r11 + r3
            byte r0 = r10.readByte()
            int r11 = r11 + r3
            r1 = -39
            if (r0 == r1) goto L_0x011b
            r1 = -38
            if (r0 != r1) goto L_0x0032
            goto L_0x011b
        L_0x0032:
            int r1 = r10.readUnsignedShort()
            int r1 = r1 + -2
            int r11 = r11 + 2
            java.lang.String r4 = "Invalid length"
            if (r1 < 0) goto L_0x0115
            r5 = -31
            r6 = 0
            java.lang.String r7 = "Invalid exif"
            if (r0 == r5) goto L_0x00b8
            r5 = -2
            if (r0 == r5) goto L_0x008f
            switch(r0) {
                case -64: goto L_0x0056;
                case -63: goto L_0x0056;
                case -62: goto L_0x0056;
                case -61: goto L_0x0056;
                default: goto L_0x004b;
            }
        L_0x004b:
            switch(r0) {
                case -59: goto L_0x0056;
                case -58: goto L_0x0056;
                case -57: goto L_0x0056;
                default: goto L_0x004e;
            }
        L_0x004e:
            switch(r0) {
                case -55: goto L_0x0056;
                case -54: goto L_0x0056;
                case -53: goto L_0x0056;
                default: goto L_0x0051;
            }
        L_0x0051:
            switch(r0) {
                case -51: goto L_0x0056;
                case -50: goto L_0x0056;
                case -49: goto L_0x0056;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x00ea
        L_0x0056:
            int r0 = r10.skipBytes(r3)
            if (r0 != r3) goto L_0x0087
            java.util.HashMap<java.lang.String, h0.n.a.a$b>[] r0 = r9.G
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.I
            h0.n.a.a$b r5 = h0.n.a.a.b.b(r5, r7)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r5)
            java.util.HashMap<java.lang.String, h0.n.a.a$b>[] r0 = r9.G
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.I
            h0.n.a.a$b r5 = h0.n.a.a.b.b(r5, r7)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r5)
            int r1 = r1 + -5
            goto L_0x00ea
        L_0x0087:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid SOFx"
            r10.<init>(r11)
            throw r10
        L_0x008f:
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00b2
            java.lang.String r1 = "UserComment"
            java.lang.String r5 = r9.c(r1)
            if (r5 != 0) goto L_0x00e9
            java.util.HashMap<java.lang.String, h0.n.a.a$b>[] r5 = r9.G
            r5 = r5[r3]
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = B
            r7.<init>(r0, r8)
            h0.n.a.a$b r0 = h0.n.a.a.b.a(r7)
            r5.put(r1, r0)
            goto L_0x00e9
        L_0x00b2:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x00b8:
            r0 = 6
            if (r1 >= r0) goto L_0x00bc
            goto L_0x00ea
        L_0x00bc:
            byte[] r5 = new byte[r0]
            int r8 = r10.read(r5)
            if (r8 != r0) goto L_0x010f
            int r11 = r11 + 6
            int r1 = r1 + -6
            byte[] r0 = C
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 != 0) goto L_0x00d1
            goto L_0x00ea
        L_0x00d1:
            if (r1 <= 0) goto L_0x0109
            r9.K = r11
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x0103
            int r11 = r11 + r1
            h0.n.a.a$a r5 = new h0.n.a.a$a
            r5.<init>((byte[]) r0)
            r9.n(r5, r1)
            r9.p(r5, r12)
        L_0x00e9:
            r1 = r6
        L_0x00ea:
            if (r1 < 0) goto L_0x00fd
            int r0 = r10.skipBytes(r1)
            if (r0 != r1) goto L_0x00f5
            int r11 = r11 + r1
            goto L_0x001c
        L_0x00f5:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid JPEG segment"
            r10.<init>(r11)
            throw r10
        L_0x00fd:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x0103:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0109:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x010f:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0115:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x011b:
            java.nio.ByteOrder r11 = r9.I
            r10.x = r11
            return
        L_0x0120:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid marker:"
            java.lang.StringBuilder r11 = i0.d.a.a.a.P0(r11)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = i0.d.a.a.a.R(r12, r11)
            r10.<init>(r11)
            throw r10
        L_0x0132:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = i0.d.a.a.a.P0(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = i0.d.a.a.a.R(r12, r11)
            r10.<init>(r11)
            throw r10
        L_0x0142:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = i0.d.a.a.a.P0(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = i0.d.a.a.a.R(r12, r11)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.n.a.a.e(h0.n.a.a$a, int, int):void");
    }

    public final int f(BufferedInputStream bufferedInputStream) throws IOException {
        boolean z2;
        boolean z3;
        boolean z4;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i2 = 0;
        while (true) {
            byte[] bArr2 = e;
            z2 = true;
            if (i2 >= bArr2.length) {
                z3 = true;
                break;
            } else if (bArr[i2] != bArr2[i2]) {
                z3 = false;
                break;
            } else {
                i2++;
            }
        }
        if (z3) {
            return 4;
        }
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i3 = 0;
        while (true) {
            if (i3 >= bytes.length) {
                z4 = true;
                break;
            } else if (bArr[i3] != bytes[i3]) {
                z4 = false;
                break;
            } else {
                i3++;
            }
        }
        if (z4) {
            return 9;
        }
        C0059a aVar = new C0059a(bArr);
        ByteOrder o2 = o(aVar);
        this.I = o2;
        aVar.x = o2;
        short readShort = aVar.readShort();
        aVar.close();
        if (readShort == 20306 || readShort == 21330) {
            return 7;
        }
        C0059a aVar2 = new C0059a(bArr);
        ByteOrder o3 = o(aVar2);
        this.I = o3;
        aVar2.x = o3;
        short readShort2 = aVar2.readShort();
        aVar2.close();
        if (readShort2 != 85) {
            z2 = false;
        }
        if (z2) {
            return 10;
        }
        return 0;
    }

    public final void g(C0059a aVar) throws IOException {
        i(aVar);
        b bVar = this.G[1].get("MakerNote");
        if (bVar != null) {
            C0059a aVar2 = new C0059a(bVar.c);
            aVar2.x = this.I;
            byte[] bArr = f;
            byte[] bArr2 = new byte[bArr.length];
            aVar2.readFully(bArr2);
            aVar2.b(0);
            byte[] bArr3 = g;
            byte[] bArr4 = new byte[bArr3.length];
            aVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                aVar2.b(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                aVar2.b(12);
            }
            p(aVar2, 6);
            b bVar2 = this.G[7].get("PreviewImageStart");
            b bVar3 = this.G[7].get("PreviewImageLength");
            if (!(bVar2 == null || bVar3 == null)) {
                this.G[5].put("JPEGInterchangeFormat", bVar2);
                this.G[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            b bVar4 = this.G[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.h(this.I);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Invalid aspect frame values. frame=");
                    P0.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", P0.toString());
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i2 = (iArr[2] - iArr[0]) + 1;
                    int i3 = (iArr[3] - iArr[1]) + 1;
                    if (i2 < i3) {
                        int i4 = i2 + i3;
                        i3 = i4 - i3;
                        i2 = i4 - i3;
                    }
                    b d2 = b.d(i2, this.I);
                    b d3 = b.d(i3, this.I);
                    this.G[0].put("ImageWidth", d2);
                    this.G[0].put("ImageLength", d3);
                }
            }
        }
    }

    public final void h(C0059a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        e(aVar, i2, 5);
        aVar.b((long) i3);
        aVar.x = ByteOrder.BIG_ENDIAN;
        int readInt = aVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == q.a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b d2 = b.d(readShort, this.I);
                b d3 = b.d(readShort2, this.I);
                this.G[0].put("ImageLength", d2);
                this.G[0].put("ImageWidth", d3);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void i(C0059a aVar) throws IOException {
        b bVar;
        n(aVar, aVar.available());
        p(aVar, 0);
        s(aVar, 0);
        s(aVar, 5);
        s(aVar, 4);
        r(0, 5);
        r(0, 4);
        r(5, 4);
        b bVar2 = this.G[1].get("PixelXDimension");
        b bVar3 = this.G[1].get("PixelYDimension");
        if (!(bVar2 == null || bVar3 == null)) {
            this.G[0].put("ImageWidth", bVar2);
            this.G[0].put("ImageLength", bVar3);
        }
        if (this.G[4].isEmpty() && l(this.G[5])) {
            HashMap<String, b>[] hashMapArr = this.G;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!l(this.G[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.F == 8 && (bVar = this.G[1].get("MakerNote")) != null) {
            C0059a aVar2 = new C0059a(bVar.c);
            aVar2.x = this.I;
            aVar2.b(6);
            p(aVar2, 9);
            b bVar4 = this.G[9].get("ColorSpace");
            if (bVar4 != null) {
                this.G[1].put("ColorSpace", bVar4);
            }
        }
    }

    public final void j(C0059a aVar) throws IOException {
        i(aVar);
        if (this.G[0].get("JpgFromRaw") != null) {
            e(aVar, this.O, 5);
        }
        b bVar = this.G[0].get("ISO");
        b bVar2 = this.G[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            this.G[1].put("PhotographicSensitivity", bVar);
        }
    }

    public final void k(C0059a aVar, HashMap hashMap) throws IOException {
        int i2;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int f2 = bVar.f(this.I);
            int min = Math.min(bVar2.f(this.I), aVar.available() - f2);
            int i3 = this.F;
            if (i3 == 4 || i3 == 9 || i3 == 10) {
                i2 = this.K;
            } else {
                if (i3 == 7) {
                    i2 = this.L;
                }
                if (f2 > 0 && min > 0 && this.D == null && this.E == null) {
                    aVar.b((long) f2);
                    aVar.readFully(new byte[min]);
                    return;
                }
                return;
            }
            f2 += i2;
            if (f2 > 0) {
            }
        }
    }

    public final boolean l(HashMap hashMap) throws IOException {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.f(this.I) <= 512 && bVar2.f(this.I) <= 512;
    }

    public final void m(InputStream inputStream) throws IOException {
        int i2 = 0;
        while (i2 < v.length) {
            try {
                this.G[i2] = new HashMap<>();
                i2++;
            } catch (IOException unused) {
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.F = f(bufferedInputStream);
        C0059a aVar = new C0059a((InputStream) bufferedInputStream);
        switch (this.F) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                i(aVar);
                break;
            case 4:
                e(aVar, 0, 0);
                break;
            case 7:
                g(aVar);
                break;
            case 9:
                h(aVar);
                break;
            case 10:
                j(aVar);
                break;
        }
        q(aVar);
        a();
    }

    public final void n(C0059a aVar, int i2) throws IOException {
        ByteOrder o2 = o(aVar);
        this.I = o2;
        aVar.x = o2;
        int readUnsignedShort = aVar.readUnsignedShort();
        int i3 = this.F;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i2) {
                throw new IOException(i0.d.a.a.a.e0("Invalid first Ifd offset: ", readInt));
            }
            int i4 = readInt - 8;
            if (i4 > 0 && aVar.skipBytes(i4) != i4) {
                throw new IOException(i0.d.a.a.a.e0("Couldn't jump to first Ifd: ", i4));
            }
            return;
        }
        throw new IOException(i0.d.a.a.a.R(readUnsignedShort, i0.d.a.a.a.P0("Invalid start code: ")));
    }

    public final ByteOrder o(C0059a aVar) throws IOException {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException(i0.d.a.a.a.R(readShort, i0.d.a.a.a.P0("Invalid byte order: ")));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        r14 = r12.d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(h0.n.a.a.C0059a r23, int r24) throws java.io.IOException {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.util.Set<java.lang.Integer> r3 = r0.H
            int r4 = r1.Y1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.Y1
            int r3 = r3 + 2
            int r4 = r1.y
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r23.readShort()
            int r4 = r1.Y1
            int r5 = r3 * 12
            int r5 = r5 + r4
            int r4 = r1.y
            if (r5 > r4) goto L_0x0346
            if (r3 > 0) goto L_0x002b
            goto L_0x0346
        L_0x002b:
            r4 = 0
        L_0x002c:
            java.lang.String r5 = "ExifInterface"
            r6 = 4
            if (r4 >= r3) goto L_0x02d9
            int r7 = r23.readUnsignedShort()
            int r8 = r23.readUnsignedShort()
            int r9 = r23.readInt()
            int r10 = r1.Y1
            long r10 = (long) r10
            r12 = 4
            long r10 = r10 + r12
            java.util.HashMap<java.lang.Integer, h0.n.a.a$c>[] r12 = x
            r12 = r12[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            java.lang.Object r12 = r12.get(r13)
            h0.n.a.a$c r12 = (h0.n.a.a.c) r12
            r14 = 7
            if (r12 != 0) goto L_0x0069
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "Skip the tag entry since tag number is not defined: "
            r6.append(r13)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r5, r6)
            goto L_0x00c1
        L_0x0069:
            if (r8 <= 0) goto L_0x00f6
            int[] r15 = j
            int r13 = r15.length
            if (r8 < r13) goto L_0x0072
            goto L_0x00f6
        L_0x0072:
            int r13 = r12.c
            if (r13 == r14) goto L_0x00a0
            if (r8 != r14) goto L_0x0079
            goto L_0x00a0
        L_0x0079:
            if (r13 == r8) goto L_0x00a0
            int r14 = r12.d
            if (r14 != r8) goto L_0x0080
            goto L_0x00a0
        L_0x0080:
            if (r13 == r6) goto L_0x0084
            if (r14 != r6) goto L_0x0088
        L_0x0084:
            r6 = 3
            if (r8 != r6) goto L_0x0088
            goto L_0x00a0
        L_0x0088:
            r6 = 9
            if (r13 == r6) goto L_0x008e
            if (r14 != r6) goto L_0x0093
        L_0x008e:
            r6 = 8
            if (r8 != r6) goto L_0x0093
            goto L_0x00a0
        L_0x0093:
            r6 = 12
            if (r13 == r6) goto L_0x0099
            if (r14 != r6) goto L_0x009e
        L_0x0099:
            r6 = 11
            if (r8 != r6) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r6 = 0
            goto L_0x00a1
        L_0x00a0:
            r6 = 1
        L_0x00a1:
            if (r6 != 0) goto L_0x00c5
            java.lang.String r6 = "Skip the tag entry since data format ("
            java.lang.StringBuilder r6 = i0.d.a.a.a.P0(r6)
            java.lang.String[] r13 = i
            r13 = r13[r8]
            r6.append(r13)
            java.lang.String r13 = ") is unexpected for tag: "
            r6.append(r13)
            java.lang.String r13 = r12.b
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r5, r6)
        L_0x00c1:
            r15 = r3
            r17 = r4
            goto L_0x010d
        L_0x00c5:
            r6 = 7
            if (r8 != r6) goto L_0x00c9
            r8 = r13
        L_0x00c9:
            long r13 = (long) r9
            r6 = r15[r8]
            r15 = r3
            r17 = r4
            long r3 = (long) r6
            long r3 = r3 * r13
            r13 = 0
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x00e1
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            r13 = 1
            goto L_0x0110
        L_0x00e1:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r13)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r5, r6)
            goto L_0x010f
        L_0x00f6:
            r15 = r3
            r17 = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r5, r3)
        L_0x010d:
            r3 = 0
        L_0x010f:
            r13 = 0
        L_0x0110:
            if (r13 != 0) goto L_0x0119
            r1.b(r10)
            r16 = r15
            goto L_0x02d2
        L_0x0119:
            r13 = 4
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            java.lang.String r13 = "Compression"
            if (r6 <= 0) goto L_0x01cc
            int r6 = r23.readInt()
            int r14 = r0.F
            r16 = r15
            r15 = 7
            if (r14 != r15) goto L_0x018b
            java.lang.String r14 = r12.b
            java.lang.String r15 = "MakerNote"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0139
            r0.L = r6
            goto L_0x0184
        L_0x0139:
            r14 = 6
            if (r2 != r14) goto L_0x0184
            java.lang.String r14 = r12.b
            java.lang.String r15 = "ThumbnailImage"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0184
            r0.M = r6
            r0.N = r9
            java.nio.ByteOrder r14 = r0.I
            r15 = 6
            h0.n.a.a$b r14 = h0.n.a.a.b.d(r15, r14)
            int r15 = r0.M
            r19 = r8
            r18 = r9
            long r8 = (long) r15
            java.nio.ByteOrder r15 = r0.I
            h0.n.a.a$b r8 = h0.n.a.a.b.b(r8, r15)
            int r9 = r0.N
            r20 = r10
            long r9 = (long) r9
            java.nio.ByteOrder r11 = r0.I
            h0.n.a.a$b r9 = h0.n.a.a.b.b(r9, r11)
            java.util.HashMap<java.lang.String, h0.n.a.a$b>[] r10 = r0.G
            r11 = 4
            r10 = r10[r11]
            r10.put(r13, r14)
            java.util.HashMap<java.lang.String, h0.n.a.a$b>[] r10 = r0.G
            r10 = r10[r11]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r10.put(r14, r8)
            java.util.HashMap<java.lang.String, h0.n.a.a$b>[] r8 = r0.G
            r8 = r8[r11]
            java.lang.String r10 = "JPEGInterchangeFormatLength"
            r8.put(r10, r9)
            goto L_0x01a1
        L_0x0184:
            r19 = r8
            r18 = r9
            r20 = r10
            goto L_0x01a1
        L_0x018b:
            r19 = r8
            r18 = r9
            r20 = r10
            r8 = 10
            if (r14 != r8) goto L_0x01a1
            java.lang.String r8 = r12.b
            java.lang.String r9 = "JpgFromRaw"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x01a1
            r0.O = r6
        L_0x01a1:
            long r8 = (long) r6
            long r10 = r8 + r3
            int r14 = r1.y
            long r14 = (long) r14
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 > 0) goto L_0x01b1
            r1.b(r8)
            r10 = r20
            goto L_0x01d2
        L_0x01b1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data offset is invalid: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r5, r3)
            r10 = r20
            r1.b(r10)
            goto L_0x02d2
        L_0x01cc:
            r19 = r8
            r18 = r9
            r16 = r15
        L_0x01d2:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = A
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r6 = r6.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x026a
            r3 = -1
            r7 = 3
            r8 = r19
            if (r8 == r7) goto L_0x0206
            r7 = 4
            if (r8 == r7) goto L_0x0201
            r7 = 8
            if (r8 == r7) goto L_0x01fc
            r7 = 9
            if (r8 == r7) goto L_0x01f7
            r7 = 13
            if (r8 == r7) goto L_0x01f7
            goto L_0x020b
        L_0x01f7:
            int r3 = r23.readInt()
            goto L_0x020a
        L_0x01fc:
            short r3 = r23.readShort()
            goto L_0x020a
        L_0x0201:
            long r3 = r23.a()
            goto L_0x020b
        L_0x0206:
            int r3 = r23.readUnsignedShort()
        L_0x020a:
            long r3 = (long) r3
        L_0x020b:
            r7 = 0
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0252
            int r7 = r1.y
            long r7 = (long) r7
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0252
            java.util.Set<java.lang.Integer> r7 = r0.H
            int r8 = (int) r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x0230
            r1.b(r3)
            int r3 = r6.intValue()
            r0.p(r1, r3)
            goto L_0x0266
        L_0x0230:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Skip jump into the IFD since it has already been read: IfdType "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = " (at "
            r7.append(r6)
            r7.append(r3)
            java.lang.String r3 = ")"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            android.util.Log.w(r5, r3)
            goto L_0x0266
        L_0x0252:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since its offset is invalid: "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            android.util.Log.w(r5, r3)
        L_0x0266:
            r1.b(r10)
            goto L_0x02d2
        L_0x026a:
            r8 = r19
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            h0.n.a.a$b r4 = new h0.n.a.a$b
            r5 = r18
            r4.<init>(r8, r5, r3)
            java.util.HashMap<java.lang.String, h0.n.a.a$b>[] r3 = r0.G
            r3 = r3[r2]
            java.lang.String r5 = r12.b
            r3.put(r5, r4)
            java.lang.String r3 = r12.b
            java.lang.String r5 = "DNGVersion"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x028f
            r3 = 3
            r0.F = r3
        L_0x028f:
            java.lang.String r3 = r12.b
            java.lang.String r5 = "Make"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x02a3
            java.lang.String r3 = r12.b
            java.lang.String r5 = "Model"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x02b1
        L_0x02a3:
            java.nio.ByteOrder r3 = r0.I
            java.lang.String r3 = r4.g(r3)
            java.lang.String r5 = "PENTAX"
            boolean r3 = r3.contains(r5)
            if (r3 != 0) goto L_0x02c4
        L_0x02b1:
            java.lang.String r3 = r12.b
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x02c8
            java.nio.ByteOrder r3 = r0.I
            int r3 = r4.f(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r4) goto L_0x02c8
        L_0x02c4:
            r3 = 8
            r0.F = r3
        L_0x02c8:
            int r3 = r1.Y1
            long r3 = (long) r3
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x02d2
            r1.b(r10)
        L_0x02d2:
            int r4 = r17 + 1
            short r4 = (short) r4
            r3 = r16
            goto L_0x002c
        L_0x02d9:
            int r2 = r1.Y1
            int r2 = r2 + 4
            int r3 = r1.y
            if (r2 > r3) goto L_0x0346
            int r2 = r23.readInt()
            long r3 = (long) r2
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0332
            int r6 = r1.y
            if (r2 >= r6) goto L_0x0332
            java.util.Set<java.lang.Integer> r6 = r0.H
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x031d
            r1.b(r3)
            java.util.HashMap<java.lang.String, h0.n.a.a$b>[] r2 = r0.G
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x030e
            r0.p(r1, r3)
            goto L_0x0346
        L_0x030e:
            java.util.HashMap<java.lang.String, h0.n.a.a$b>[] r2 = r0.G
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0346
            r0.p(r1, r3)
            goto L_0x0346
        L_0x031d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r5, r1)
            goto L_0x0346
        L_0x0332:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r5, r1)
        L_0x0346:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.n.a.a.p(h0.n.a.a$a, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (java.util.Arrays.equals(r1, d) != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (java.util.Arrays.equals(r1, r5) != false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(h0.n.a.a.C0059a r13) throws java.io.IOException {
        /*
            r12 = this;
            java.util.HashMap<java.lang.String, h0.n.a.a$b>[] r0 = r12.G
            r1 = 4
            r0 = r0[r1]
            java.lang.String r1 = "Compression"
            java.lang.Object r1 = r0.get(r1)
            h0.n.a.a$b r1 = (h0.n.a.a.b) r1
            r2 = 6
            if (r1 == 0) goto L_0x00dd
            java.nio.ByteOrder r3 = r12.I
            int r1 = r1.f(r3)
            r12.J = r1
            r3 = 1
            if (r1 == r3) goto L_0x0027
            if (r1 == r2) goto L_0x0022
            r4 = 7
            if (r1 == r4) goto L_0x0027
            goto L_0x00e2
        L_0x0022:
            r12.k(r13, r0)
            goto L_0x00e2
        L_0x0027:
            java.lang.String r1 = "BitsPerSample"
            java.lang.Object r1 = r0.get(r1)
            h0.n.a.a$b r1 = (h0.n.a.a.b) r1
            r4 = 0
            if (r1 == 0) goto L_0x006b
            java.nio.ByteOrder r5 = r12.I
            java.lang.Object r1 = r1.h(r5)
            int[] r1 = (int[]) r1
            int[] r5 = c
            boolean r6 = java.util.Arrays.equals(r5, r1)
            if (r6 == 0) goto L_0x0043
            goto L_0x006c
        L_0x0043:
            int r6 = r12.F
            r7 = 3
            if (r6 != r7) goto L_0x006b
            java.lang.String r6 = "PhotometricInterpretation"
            java.lang.Object r6 = r0.get(r6)
            h0.n.a.a$b r6 = (h0.n.a.a.b) r6
            if (r6 == 0) goto L_0x006b
            java.nio.ByteOrder r7 = r12.I
            int r6 = r6.f(r7)
            if (r6 != r3) goto L_0x0062
            int[] r7 = d
            boolean r7 = java.util.Arrays.equals(r1, r7)
            if (r7 != 0) goto L_0x006c
        L_0x0062:
            if (r6 != r2) goto L_0x006b
            boolean r1 = java.util.Arrays.equals(r1, r5)
            if (r1 == 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r3 = r4
        L_0x006c:
            if (r3 == 0) goto L_0x00e2
            java.lang.String r1 = "StripOffsets"
            java.lang.Object r1 = r0.get(r1)
            h0.n.a.a$b r1 = (h0.n.a.a.b) r1
            java.lang.String r2 = "StripByteCounts"
            java.lang.Object r0 = r0.get(r2)
            h0.n.a.a$b r0 = (h0.n.a.a.b) r0
            if (r1 == 0) goto L_0x00e2
            if (r0 == 0) goto L_0x00e2
            java.nio.ByteOrder r2 = r12.I
            java.lang.Object r1 = r1.h(r2)
            long[] r1 = b(r1)
            java.nio.ByteOrder r2 = r12.I
            java.lang.Object r0 = r0.h(r2)
            long[] r0 = b(r0)
            java.lang.String r2 = "ExifInterface"
            if (r1 != 0) goto L_0x00a0
            java.lang.String r13 = "stripOffsets should not be null."
            android.util.Log.w(r2, r13)
            goto L_0x00e2
        L_0x00a0:
            if (r0 != 0) goto L_0x00a8
            java.lang.String r13 = "stripByteCounts should not be null."
            android.util.Log.w(r2, r13)
            goto L_0x00e2
        L_0x00a8:
            r5 = 0
            int r3 = r0.length
            r7 = r4
        L_0x00ac:
            if (r7 >= r3) goto L_0x00b4
            r8 = r0[r7]
            long r5 = r5 + r8
            int r7 = r7 + 1
            goto L_0x00ac
        L_0x00b4:
            int r3 = (int) r5
            byte[] r3 = new byte[r3]
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x00ba:
            int r8 = r1.length
            if (r5 >= r8) goto L_0x00e2
            r8 = r1[r5]
            int r8 = (int) r8
            r9 = r0[r5]
            int r9 = (int) r9
            int r8 = r8 - r6
            if (r8 >= 0) goto L_0x00cb
            java.lang.String r10 = "Invalid strip offset value"
            android.util.Log.d(r2, r10)
        L_0x00cb:
            long r10 = (long) r8
            r13.b(r10)
            int r6 = r6 + r8
            byte[] r8 = new byte[r9]
            r13.read(r8)
            int r6 = r6 + r9
            java.lang.System.arraycopy(r8, r4, r3, r7, r9)
            int r7 = r7 + r9
            int r5 = r5 + 1
            goto L_0x00ba
        L_0x00dd:
            r12.J = r2
            r12.k(r13, r0)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.n.a.a.q(h0.n.a.a$a):void");
    }

    public final void r(int i2, int i3) throws IOException {
        if (!this.G[i2].isEmpty() && !this.G[i3].isEmpty()) {
            b bVar = this.G[i2].get("ImageLength");
            b bVar2 = this.G[i2].get("ImageWidth");
            b bVar3 = this.G[i3].get("ImageLength");
            b bVar4 = this.G[i3].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int f2 = bVar.f(this.I);
                int f3 = bVar2.f(this.I);
                int f4 = bVar3.f(this.I);
                int f5 = bVar4.f(this.I);
                if (f2 < f4 && f3 < f5) {
                    HashMap<String, b>[] hashMapArr = this.G;
                    HashMap<String, b> hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            }
        }
    }

    public final void s(C0059a aVar, int i2) throws IOException {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4 = this.G[i2].get("DefaultCropSize");
        b bVar5 = this.G[i2].get("SensorTopBorder");
        b bVar6 = this.G[i2].get("SensorLeftBorder");
        b bVar7 = this.G[i2].get("SensorBottomBorder");
        b bVar8 = this.G[i2].get("SensorRightBorder");
        if (bVar4 != null) {
            if (bVar4.a == 5) {
                d[] dVarArr = (d[]) bVar4.h(this.I);
                if (dVarArr == null || dVarArr.length != 2) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Invalid crop size values. cropSize=");
                    P0.append(Arrays.toString(dVarArr));
                    Log.w("ExifInterface", P0.toString());
                    return;
                }
                bVar3 = b.c(dVarArr[0], this.I);
                bVar2 = b.c(dVarArr[1], this.I);
            } else {
                int[] iArr = (int[]) bVar4.h(this.I);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder P02 = i0.d.a.a.a.P0("Invalid crop size values. cropSize=");
                    P02.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", P02.toString());
                    return;
                }
                bVar3 = b.d(iArr[0], this.I);
                bVar2 = b.d(iArr[1], this.I);
            }
            this.G[i2].put("ImageWidth", bVar3);
            this.G[i2].put("ImageLength", bVar2);
        } else if (bVar5 == null || bVar6 == null || bVar7 == null || bVar8 == null) {
            b bVar9 = this.G[i2].get("ImageLength");
            b bVar10 = this.G[i2].get("ImageWidth");
            if ((bVar9 == null || bVar10 == null) && (bVar = this.G[i2].get("JPEGInterchangeFormat")) != null) {
                e(aVar, bVar.f(this.I), i2);
            }
        } else {
            int f2 = bVar5.f(this.I);
            int f3 = bVar7.f(this.I);
            int f4 = bVar8.f(this.I);
            int f5 = bVar6.f(this.I);
            if (f3 > f2 && f4 > f5) {
                b d2 = b.d(f3 - f2, this.I);
                b d3 = b.d(f4 - f5, this.I);
                this.G[i2].put("ImageLength", d2);
                this.G[i2].put("ImageWidth", d3);
            }
        }
    }

    /* renamed from: h0.n.a.a$a  reason: collision with other inner class name */
    /* compiled from: ExifInterface */
    public static class C0059a extends InputStream implements DataInput {
        public static final ByteOrder c = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder d = ByteOrder.BIG_ENDIAN;
        public int Y1;
        public DataInputStream q;
        public ByteOrder x;
        public final int y;

        public C0059a(InputStream inputStream) throws IOException {
            this.x = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.q = dataInputStream;
            int available = dataInputStream.available();
            this.y = available;
            this.Y1 = 0;
            this.q.mark(available);
        }

        public long a() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public int available() throws IOException {
            return this.q.available();
        }

        public void b(long j) throws IOException {
            int i = this.Y1;
            if (((long) i) > j) {
                this.Y1 = 0;
                this.q.reset();
                this.q.mark(this.y);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public int read() throws IOException {
            this.Y1++;
            return this.q.read();
        }

        public boolean readBoolean() throws IOException {
            this.Y1++;
            return this.q.readBoolean();
        }

        public byte readByte() throws IOException {
            int i = this.Y1 + 1;
            this.Y1 = i;
            if (i <= this.y) {
                int read = this.q.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.Y1 += 2;
            return this.q.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.Y1 + i2;
            this.Y1 = i3;
            if (i3 > this.y) {
                throw new EOFException();
            } else if (this.q.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            int i = this.Y1 + 4;
            this.Y1 = i;
            if (i <= this.y) {
                int read = this.q.read();
                int read2 = this.q.read();
                int read3 = this.q.read();
                int read4 = this.q.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.x;
                    if (byteOrder == c) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == d) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder P0 = i0.d.a.a.a.P0("Invalid byte order: ");
                    P0.append(this.x);
                    throw new IOException(P0.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() throws IOException {
            int i = this.Y1 + 8;
            this.Y1 = i;
            if (i <= this.y) {
                int read = this.q.read();
                int read2 = this.q.read();
                int read3 = this.q.read();
                int read4 = this.q.read();
                int read5 = this.q.read();
                int read6 = this.q.read();
                int read7 = this.q.read();
                int read8 = this.q.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.x;
                    if (byteOrder == c) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == d) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder P0 = i0.d.a.a.a.P0("Invalid byte order: ");
                    P0.append(this.x);
                    throw new IOException(P0.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            int i = this.Y1 + 2;
            this.Y1 = i;
            if (i <= this.y) {
                int read = this.q.read();
                int read2 = this.q.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.x;
                    if (byteOrder == c) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == d) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder P0 = i0.d.a.a.a.P0("Invalid byte order: ");
                    P0.append(this.x);
                    throw new IOException(P0.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.Y1 += 2;
            return this.q.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.Y1++;
            return this.q.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            int i = this.Y1 + 2;
            this.Y1 = i;
            if (i <= this.y) {
                int read = this.q.read();
                int read2 = this.q.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.x;
                    if (byteOrder == c) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == d) {
                        return (read << 8) + read2;
                    }
                    StringBuilder P0 = i0.d.a.a.a.P0("Invalid byte order: ");
                    P0.append(this.x);
                    throw new IOException(P0.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.y - this.Y1);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.q.skipBytes(min - i2);
            }
            this.Y1 += i2;
            return i2;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.q.read(bArr, i, i2);
            this.Y1 += read;
            return read;
        }

        public void readFully(byte[] bArr) throws IOException {
            int length = this.Y1 + bArr.length;
            this.Y1 = length;
            if (length > this.y) {
                throw new EOFException();
            } else if (this.q.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public C0059a(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }
    }

    /* compiled from: ExifInterface */
    public static class c {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public c(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        public c(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public a(InputStream inputStream) throws IOException {
        c[][] cVarArr = v;
        this.G = new HashMap[cVarArr.length];
        this.H = new HashSet(cVarArr.length);
        this.I = ByteOrder.BIG_ENDIAN;
        this.D = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.E = (AssetManager.AssetInputStream) inputStream;
        } else {
            this.E = null;
        }
        m(inputStream);
    }
}
