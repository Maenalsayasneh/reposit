package h0.g0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Data */
public final class d {
    public static final String a = i.e("Data");
    public static final d b;
    public Map<String, Object> c;

    /* compiled from: Data */
    public static final class a {
        public Map<String, Object> a = new HashMap();

        public d a() {
            d dVar = new d((Map<String, ?>) this.a);
            d.b(dVar);
            return dVar;
        }

        public a b(Map<String, Object> map) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value == null) {
                    this.a.put(str, (Object) null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        this.a.put(str, value);
                    } else {
                        int i = 0;
                        if (cls == boolean[].class) {
                            Map<String, Object> map2 = this.a;
                            boolean[] zArr = (boolean[]) value;
                            String str2 = d.a;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i < zArr.length) {
                                boolArr[i] = Boolean.valueOf(zArr[i]);
                                i++;
                            }
                            map2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            Map<String, Object> map3 = this.a;
                            byte[] bArr = (byte[]) value;
                            String str3 = d.a;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i < bArr.length) {
                                bArr2[i] = Byte.valueOf(bArr[i]);
                                i++;
                            }
                            map3.put(str, bArr2);
                        } else if (cls == int[].class) {
                            Map<String, Object> map4 = this.a;
                            int[] iArr = (int[]) value;
                            String str4 = d.a;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i < iArr.length) {
                                numArr[i] = Integer.valueOf(iArr[i]);
                                i++;
                            }
                            map4.put(str, numArr);
                        } else if (cls == long[].class) {
                            Map<String, Object> map5 = this.a;
                            long[] jArr = (long[]) value;
                            String str5 = d.a;
                            Long[] lArr = new Long[jArr.length];
                            while (i < jArr.length) {
                                lArr[i] = Long.valueOf(jArr[i]);
                                i++;
                            }
                            map5.put(str, lArr);
                        } else if (cls == float[].class) {
                            Map<String, Object> map6 = this.a;
                            float[] fArr = (float[]) value;
                            String str6 = d.a;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i < fArr.length) {
                                fArr2[i] = Float.valueOf(fArr[i]);
                                i++;
                            }
                            map6.put(str, fArr2);
                        } else if (cls == double[].class) {
                            Map<String, Object> map7 = this.a;
                            double[] dArr = (double[]) value;
                            String str7 = d.a;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i < dArr.length) {
                                dArr2[i] = Double.valueOf(dArr[i]);
                                i++;
                            }
                            map7.put(str, dArr2);
                        } else {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
                        }
                    }
                }
            }
            return this;
        }
    }

    static {
        d dVar = new d((Map<String, ?>) new HashMap());
        b(dVar);
        b = dVar;
    }

    public d() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[SYNTHETIC, Splitter:B:25:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a A[SYNTHETIC, Splitter:B:34:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h0.g0.d a(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L_0x007f
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0045, ClassNotFoundException -> 0x0043, all -> 0x0041 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0045, ClassNotFoundException -> 0x0043, all -> 0x0041 }
            int r7 = r3.readInt()     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
        L_0x001b:
            if (r7 <= 0) goto L_0x002b
            java.lang.String r4 = r3.readUTF()     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
            java.lang.Object r5 = r3.readObject()     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
            r1.put(r4, r5)     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
            int r7 = r7 + -1
            goto L_0x001b
        L_0x002b:
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0035
        L_0x002f:
            r7 = move-exception
            java.lang.String r3 = a
            android.util.Log.e(r3, r0, r7)
        L_0x0035:
            r2.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0060
        L_0x0039:
            r7 = move-exception
            goto L_0x005b
        L_0x003b:
            r7 = move-exception
            goto L_0x0066
        L_0x003d:
            r7 = move-exception
            goto L_0x0049
        L_0x003f:
            r7 = move-exception
            goto L_0x0049
        L_0x0041:
            r1 = move-exception
            goto L_0x0068
        L_0x0043:
            r3 = move-exception
            goto L_0x0046
        L_0x0045:
            r3 = move-exception
        L_0x0046:
            r6 = r3
            r3 = r7
            r7 = r6
        L_0x0049:
            java.lang.String r4 = a     // Catch:{ all -> 0x003b }
            android.util.Log.e(r4, r0, r7)     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0035
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0035
        L_0x0054:
            r7 = move-exception
            java.lang.String r3 = a
            android.util.Log.e(r3, r0, r7)
            goto L_0x0035
        L_0x005b:
            java.lang.String r2 = a
            android.util.Log.e(r2, r0, r7)
        L_0x0060:
            h0.g0.d r7 = new h0.g0.d
            r7.<init>((java.util.Map<java.lang.String, ?>) r1)
            return r7
        L_0x0066:
            r1 = r7
            r7 = r3
        L_0x0068:
            if (r7 == 0) goto L_0x0074
            r7.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0074
        L_0x006e:
            r7 = move-exception
            java.lang.String r3 = a
            android.util.Log.e(r3, r0, r7)
        L_0x0074:
            r2.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x007e
        L_0x0078:
            r7 = move-exception
            java.lang.String r2 = a
            android.util.Log.e(r2, r0, r7)
        L_0x007e:
            throw r1
        L_0x007f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g0.d.a(byte[]):h0.g0.d");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c A[SYNTHETIC, Splitter:B:31:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093 A[SYNTHETIC, Splitter:B:41:0x0093] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] b(h0.g0.d r5) {
        /*
            java.lang.String r0 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0070 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0070 }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.c     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            int r2 = r2.size()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeInt(r2)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.c     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
        L_0x0020:
            boolean r2 = r5.hasNext()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r5.next()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object r4 = r2.getKey()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeUTF(r4)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeObject(r2)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            goto L_0x0020
        L_0x003d:
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r5 = move-exception
            java.lang.String r2 = a
            android.util.Log.e(r2, r0, r5)
        L_0x0047:
            r1.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x0051
        L_0x004b:
            r5 = move-exception
            java.lang.String r2 = a
            android.util.Log.e(r2, r0, r5)
        L_0x0051:
            int r5 = r1.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r5 > r0) goto L_0x005e
            byte[] r5 = r1.toByteArray()
            return r5
        L_0x005e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        L_0x0066:
            r5 = move-exception
            goto L_0x006a
        L_0x0068:
            r5 = move-exception
            goto L_0x006c
        L_0x006a:
            r2 = r3
            goto L_0x0091
        L_0x006c:
            r2 = r3
            goto L_0x0071
        L_0x006e:
            r5 = move-exception
            goto L_0x0091
        L_0x0070:
            r5 = move-exception
        L_0x0071:
            java.lang.String r3 = a     // Catch:{ all -> 0x006e }
            android.util.Log.e(r3, r0, r5)     // Catch:{ all -> 0x006e }
            byte[] r5 = r1.toByteArray()     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0086
            r2.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0086
        L_0x0080:
            r2 = move-exception
            java.lang.String r3 = a
            android.util.Log.e(r3, r0, r2)
        L_0x0086:
            r1.close()     // Catch:{ IOException -> 0x008a }
            goto L_0x0090
        L_0x008a:
            r1 = move-exception
            java.lang.String r2 = a
            android.util.Log.e(r2, r0, r1)
        L_0x0090:
            return r5
        L_0x0091:
            if (r2 == 0) goto L_0x009d
            r2.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x009d
        L_0x0097:
            r2 = move-exception
            java.lang.String r3 = a
            android.util.Log.e(r3, r0, r2)
        L_0x009d:
            r1.close()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a7
        L_0x00a1:
            r1 = move-exception
            java.lang.String r2 = a
            android.util.Log.e(r2, r0, r1)
        L_0x00a7:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g0.d.b(h0.g0.d):byte[]");
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        Set<String> keySet = this.c.keySet();
        if (!keySet.equals(dVar.c.keySet())) {
            return false;
        }
        for (String next : keySet) {
            Object obj2 = this.c.get(next);
            Object obj3 = dVar.c.get(next);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.c.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.c.isEmpty()) {
            for (String next : this.c.keySet()) {
                sb.append(next);
                sb.append(" : ");
                Object obj = this.c.get(next);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public d(d dVar) {
        this.c = new HashMap(dVar.c);
    }

    public d(Map<String, ?> map) {
        this.c = new HashMap(map);
    }
}
