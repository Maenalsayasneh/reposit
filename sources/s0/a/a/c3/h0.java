package s0.a.a.c3;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m0.r.t.a.r.m.a1.a;
import org.bouncycastle.asn1.x509.NameConstraintValidatorException;
import s0.a.a.b3.b;
import s0.a.a.b3.c;
import s0.a.a.b3.e.d;
import s0.a.a.o;
import s0.a.a.s;
import s0.a.a.u0;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public class h0 {
    public Set a = new HashSet();
    public Set b = new HashSet();
    public Set c = new HashSet();
    public Set d = new HashSet();
    public Set e = new HashSet();
    public Set f = new HashSet();
    public Set g;
    public Set h;
    public Set i;
    public Set j;
    public Set k;
    public Set l;

    public static byte[] m(byte[] bArr, byte[] bArr2) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if ((bArr[i2] & 65535) > (65535 & bArr2[i2])) {
                return bArr;
            }
        }
        return bArr2;
    }

    public static byte[] n(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] | bArr2[i2]);
        }
        return bArr3;
    }

    public static boolean q(s sVar, s sVar2) {
        if (sVar2.size() < 1 || sVar2.size() > sVar.size()) {
            return false;
        }
        b t = b.t(sVar2.D(0));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= sVar.size()) {
                i2 = i3;
                break;
            } else if (a.b3(t, b.t(sVar.D(i2)))) {
                break;
            } else {
                i3 = i2;
                i2++;
            }
        }
        if (sVar2.size() > sVar.size() - i2) {
            return false;
        }
        for (int i4 = 0; i4 < sVar2.size(); i4++) {
            b t2 = b.t(sVar2.D(i4));
            b t3 = b.t(sVar.D(i2 + i4));
            if (t2.size() != t3.size() || !t2.s().c.w(t3.s().c)) {
                return false;
            }
            if (t2.size() != 1 || !t2.s().c.w(d.E)) {
                if (!a.b3(t2, t3)) {
                    return false;
                }
            } else if (!t3.s().d.toString().startsWith(t2.s().d.toString())) {
                return false;
            }
        }
        return true;
    }

    public final void a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(j.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(s0.a.a.c3.w r4) throws org.bouncycastle.asn1.x509.NameConstraintValidatorException {
        /*
            r3 = this;
            int r0 = r4.d
            if (r0 == 0) goto L_0x00dd
            r1 = 1
            if (r0 == r1) goto L_0x00b1
            r1 = 2
            if (r0 == r1) goto L_0x007e
            r1 = 4
            if (r0 == r1) goto L_0x0073
            r1 = 6
            if (r0 == r1) goto L_0x0046
            r1 = 7
            if (r0 == r1) goto L_0x0015
            goto L_0x010d
        L_0x0015:
            java.util.Set r0 = r3.e
            s0.a.a.e r4 = r4.c
            s0.a.a.o r4 = s0.a.a.o.B(r4)
            byte[] r4 = r4.c
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0027
            goto L_0x010d
        L_0x0027:
            java.util.Iterator r0 = r0.iterator()
        L_0x002b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x010d
            java.lang.Object r1 = r0.next()
            byte[] r1 = (byte[]) r1
            boolean r1 = r3.k(r4, r1)
            if (r1 != 0) goto L_0x003e
            goto L_0x002b
        L_0x003e:
            org.bouncycastle.asn1.x509.NameConstraintValidatorException r4 = new org.bouncycastle.asn1.x509.NameConstraintValidatorException
            java.lang.String r0 = "IP is from an excluded subtree."
            r4.<init>(r0)
            throw r4
        L_0x0046:
            java.util.Set r0 = r3.d
            java.lang.String r4 = r3.h(r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0054
            goto L_0x010d
        L_0x0054:
            java.util.Iterator r0 = r0.iterator()
        L_0x0058:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x010d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.l(r4, r1)
            if (r1 != 0) goto L_0x006b
            goto L_0x0058
        L_0x006b:
            org.bouncycastle.asn1.x509.NameConstraintValidatorException r4 = new org.bouncycastle.asn1.x509.NameConstraintValidatorException
            java.lang.String r0 = "URI is from an excluded subtree."
            r4.<init>(r0)
            throw r4
        L_0x0073:
            s0.a.a.e r4 = r4.c
            s0.a.a.b3.c r4 = s0.a.a.b3.c.s(r4)
            r3.c(r4)
            goto L_0x010d
        L_0x007e:
            java.util.Set r0 = r3.b
            java.lang.String r4 = r3.h(r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x008c
            goto L_0x010d
        L_0x008c:
            java.util.Iterator r0 = r0.iterator()
        L_0x0090:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x010d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r3.r(r4, r1)
            if (r2 != 0) goto L_0x00a9
            boolean r1 = r4.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x00a9
            goto L_0x0090
        L_0x00a9:
            org.bouncycastle.asn1.x509.NameConstraintValidatorException r4 = new org.bouncycastle.asn1.x509.NameConstraintValidatorException
            java.lang.String r0 = "DNS is from an excluded subtree."
            r4.<init>(r0)
            throw r4
        L_0x00b1:
            java.util.Set r0 = r3.c
            java.lang.String r4 = r3.h(r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x00be
            goto L_0x010d
        L_0x00be:
            java.util.Iterator r0 = r0.iterator()
        L_0x00c2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x010d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.g(r4, r1)
            if (r1 != 0) goto L_0x00d5
            goto L_0x00c2
        L_0x00d5:
            org.bouncycastle.asn1.x509.NameConstraintValidatorException r4 = new org.bouncycastle.asn1.x509.NameConstraintValidatorException
            java.lang.String r0 = "Email address is from an excluded subtree."
            r4.<init>(r0)
            throw r4
        L_0x00dd:
            java.util.Set r0 = r3.f
            s0.a.a.e r4 = r4.c
            s0.a.a.c3.g0 r4 = s0.a.a.c3.g0.s(r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x00ec
            goto L_0x010d
        L_0x00ec:
            java.util.Iterator r0 = r0.iterator()
        L_0x00f0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x010d
            java.lang.Object r1 = r0.next()
            s0.a.a.c3.g0 r1 = s0.a.a.c3.g0.s(r1)
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0105
            goto L_0x00f0
        L_0x0105:
            org.bouncycastle.asn1.x509.NameConstraintValidatorException r4 = new org.bouncycastle.asn1.x509.NameConstraintValidatorException
            java.lang.String r0 = "OtherName is from an excluded subtree."
            r4.<init>(r0)
            throw r4
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.a.c3.h0.b(s0.a.a.c3.w):void");
    }

    public void c(c cVar) throws NameConstraintValidatorException {
        Set<s> set = this.a;
        s B = s.B(cVar);
        if (!set.isEmpty()) {
            for (s q : set) {
                if (q(B, q)) {
                    throw new NameConstraintValidatorException("Subject distinguished name is from an excluded subtree");
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(s0.a.a.c3.w r5) throws org.bouncycastle.asn1.x509.NameConstraintValidatorException {
        /*
            r4 = this;
            int r0 = r5.d
            if (r0 == 0) goto L_0x0103
            r1 = 1
            if (r0 == r1) goto L_0x00ce
            r1 = 2
            if (r0 == r1) goto L_0x0091
            r1 = 4
            if (r0 == r1) goto L_0x0086
            r1 = 6
            if (r0 == r1) goto L_0x004e
            r1 = 7
            if (r0 == r1) goto L_0x0015
            goto L_0x0126
        L_0x0015:
            java.util.Set r0 = r4.k
            s0.a.a.e r5 = r5.c
            s0.a.a.o r5 = s0.a.a.o.B(r5)
            byte[] r5 = r5.c
            if (r0 != 0) goto L_0x0023
            goto L_0x0126
        L_0x0023:
            java.util.Iterator r1 = r0.iterator()
        L_0x0027:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r1.next()
            byte[] r2 = (byte[]) r2
            boolean r2 = r4.k(r5, r2)
            if (r2 == 0) goto L_0x0027
            goto L_0x0126
        L_0x003b:
            int r5 = r5.length
            if (r5 != 0) goto L_0x0046
            int r5 = r0.size()
            if (r5 != 0) goto L_0x0046
            goto L_0x0126
        L_0x0046:
            org.bouncycastle.asn1.x509.NameConstraintValidatorException r5 = new org.bouncycastle.asn1.x509.NameConstraintValidatorException
            java.lang.String r0 = "IP is not from a permitted subtree."
            r5.<init>(r0)
            throw r5
        L_0x004e:
            java.util.Set r0 = r4.j
            java.lang.String r5 = r4.h(r5)
            if (r0 != 0) goto L_0x0058
            goto L_0x0126
        L_0x0058:
            java.util.Iterator r1 = r0.iterator()
        L_0x005c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r4.l(r5, r2)
            if (r2 == 0) goto L_0x005c
            goto L_0x0126
        L_0x0070:
            int r5 = r5.length()
            if (r5 != 0) goto L_0x007e
            int r5 = r0.size()
            if (r5 != 0) goto L_0x007e
            goto L_0x0126
        L_0x007e:
            org.bouncycastle.asn1.x509.NameConstraintValidatorException r5 = new org.bouncycastle.asn1.x509.NameConstraintValidatorException
            java.lang.String r0 = "URI is not from a permitted subtree."
            r5.<init>(r0)
            throw r5
        L_0x0086:
            s0.a.a.e r5 = r5.c
            s0.a.a.b3.c r5 = s0.a.a.b3.c.s(r5)
            r4.e(r5)
            goto L_0x0126
        L_0x0091:
            java.util.Set r0 = r4.h
            java.lang.String r5 = r4.h(r5)
            if (r0 != 0) goto L_0x009b
            goto L_0x0126
        L_0x009b:
            java.util.Iterator r1 = r0.iterator()
        L_0x009f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00b9
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r4.r(r5, r2)
            if (r3 != 0) goto L_0x0126
            boolean r2 = r5.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x009f
            goto L_0x0126
        L_0x00b9:
            int r5 = r5.length()
            if (r5 != 0) goto L_0x00c6
            int r5 = r0.size()
            if (r5 != 0) goto L_0x00c6
            goto L_0x0126
        L_0x00c6:
            org.bouncycastle.asn1.x509.NameConstraintValidatorException r5 = new org.bouncycastle.asn1.x509.NameConstraintValidatorException
            java.lang.String r0 = "DNS is not from a permitted subtree."
            r5.<init>(r0)
            throw r5
        L_0x00ce:
            java.util.Set r0 = r4.i
            java.lang.String r5 = r4.h(r5)
            if (r0 != 0) goto L_0x00d7
            goto L_0x0126
        L_0x00d7:
            java.util.Iterator r1 = r0.iterator()
        L_0x00db:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ee
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r4.g(r5, r2)
            if (r2 == 0) goto L_0x00db
            goto L_0x0126
        L_0x00ee:
            int r5 = r5.length()
            if (r5 != 0) goto L_0x00fb
            int r5 = r0.size()
            if (r5 != 0) goto L_0x00fb
            goto L_0x0126
        L_0x00fb:
            org.bouncycastle.asn1.x509.NameConstraintValidatorException r5 = new org.bouncycastle.asn1.x509.NameConstraintValidatorException
            java.lang.String r0 = "Subject email address is not from a permitted subtree."
            r5.<init>(r0)
            throw r5
        L_0x0103:
            java.util.Set r0 = r4.l
            s0.a.a.e r5 = r5.c
            s0.a.a.c3.g0 r5 = s0.a.a.c3.g0.s(r5)
            if (r0 != 0) goto L_0x010e
            goto L_0x0126
        L_0x010e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0112:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0127
            java.lang.Object r1 = r0.next()
            s0.a.a.c3.g0 r1 = s0.a.a.c3.g0.s(r1)
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0112
        L_0x0126:
            return
        L_0x0127:
            org.bouncycastle.asn1.x509.NameConstraintValidatorException r5 = new org.bouncycastle.asn1.x509.NameConstraintValidatorException
            java.lang.String r0 = "Subject OtherName is not from a permitted subtree."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.a.c3.h0.d(s0.a.a.c3.w):void");
    }

    public void e(c cVar) throws NameConstraintValidatorException {
        Set<s> set = this.g;
        s B = s.B(cVar.Y1);
        if (set != null) {
            if (!set.isEmpty() || B.size() != 0) {
                for (s q : set) {
                    if (q(B, q)) {
                        return;
                    }
                }
                throw new NameConstraintValidatorException("Subject distinguished name is not from a permitted subtree");
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return f(h0Var.a, this.a) && f(h0Var.b, this.b) && f(h0Var.c, this.c) && f(h0Var.e, this.e) && f(h0Var.d, this.d) && f(h0Var.f, this.f) && f(h0Var.g, this.g) && f(h0Var.h, this.h) && f(h0Var.i, this.i) && f(h0Var.k, this.k) && f(h0Var.j, this.j) && f(h0Var.l, this.l);
    }

    public final boolean f(Collection collection, Collection collection2) {
        boolean z;
        boolean z2;
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        for (Object next : collection) {
            Iterator it = collection2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    continue;
                    break;
                }
                Object next2 = it.next();
                if (next == next2) {
                    z2 = true;
                    continue;
                } else if (next == null || next2 == null) {
                    z2 = false;
                    continue;
                } else if (!(next instanceof byte[]) || !(next2 instanceof byte[])) {
                    z2 = next.equals(next2);
                    continue;
                } else {
                    z2 = Arrays.equals((byte[]) next, (byte[]) next2);
                    continue;
                }
                if (z2) {
                    z = true;
                    continue;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(String str, String str2) {
        String f0 = i0.d.a.a.a.f0(str, 64, 1);
        if (str2.indexOf(64) != -1) {
            return str.equalsIgnoreCase(str2) || f0.equalsIgnoreCase(str2.substring(1));
        }
        if (str2.charAt(0) != '.') {
            if (f0.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (r(f0, str2)) {
            return true;
        }
    }

    public final String h(w wVar) {
        return u0.B(wVar.c).e();
    }

    public int hashCode() {
        return i(this.l) + i(this.j) + i(this.k) + i(this.i) + i(this.h) + i(this.g) + i(this.f) + i(this.d) + i(this.e) + i(this.c) + i(this.b) + i(this.a);
    }

    public final int i(Collection collection) {
        int i2 = 0;
        if (collection == null) {
            return 0;
        }
        for (Object next : collection) {
            i2 += next instanceof byte[] ? h3.m1((byte[]) next) : next.hashCode();
        }
        return i2;
    }

    public void j(y[] yVarArr) {
        Iterator it;
        Iterator it2;
        Iterator it3;
        Set set;
        char c2;
        y[] yVarArr2 = yVarArr;
        HashMap hashMap = new HashMap();
        int i2 = 0;
        for (int i3 = 0; i3 != yVarArr2.length; i3++) {
            y yVar = yVarArr2[i3];
            Integer valueOf = Integer.valueOf(yVar.d.d);
            if (hashMap.get(valueOf) == null) {
                hashMap.put(valueOf, new HashSet());
            }
            ((Set) hashMap.get(valueOf)).add(yVar);
        }
        Iterator it4 = hashMap.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue != 0) {
                char c3 = 1;
                if (intValue != 1) {
                    int i4 = 2;
                    if (intValue != 2) {
                        int i5 = 4;
                        if (intValue == 4) {
                            it = it4;
                            Set<s> set2 = this.g;
                            HashSet hashSet = new HashSet();
                            for (y yVar2 : (Set) entry.getValue()) {
                                s B = s.B(yVar2.d.c.c());
                                if (set2 != null) {
                                    for (s sVar : set2) {
                                        if (q(B, sVar)) {
                                            hashSet.add(B);
                                        } else if (q(sVar, B)) {
                                            hashSet.add(sVar);
                                        }
                                    }
                                } else if (B != null) {
                                    hashSet.add(B);
                                }
                            }
                            this.g = hashSet;
                        } else if (intValue == 6) {
                            it = it4;
                            Set<String> set3 = this.j;
                            HashSet hashSet2 = new HashSet();
                            for (y yVar3 : (Set) entry.getValue()) {
                                String h2 = h(yVar3.d);
                                if (set3 == null) {
                                    hashSet2.add(h2);
                                } else {
                                    for (String str : set3) {
                                        if (str.indexOf(64) != -1) {
                                            String f0 = i0.d.a.a.a.f0(str, 64, 1);
                                            if (h2.indexOf(64) != -1) {
                                                if (!str.equalsIgnoreCase(h2)) {
                                                }
                                            } else if (h2.startsWith(".")) {
                                                if (!r(f0, h2)) {
                                                }
                                            } else if (!f0.equalsIgnoreCase(h2)) {
                                            }
                                        } else {
                                            if (str.startsWith(".")) {
                                                if (h2.indexOf(64) != -1) {
                                                    if (!r(h2.substring(str.indexOf(64) + 1), str)) {
                                                    }
                                                } else if (h2.startsWith(".")) {
                                                    if (!r(str, h2) && !str.equalsIgnoreCase(h2)) {
                                                        if (!r(h2, str)) {
                                                        }
                                                    }
                                                } else if (!r(h2, str)) {
                                                }
                                            } else if (h2.indexOf(64) != -1) {
                                                if (!h2.substring(h2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                                                }
                                            } else if (h2.startsWith(".")) {
                                                if (!r(str, h2)) {
                                                }
                                            } else if (!str.equalsIgnoreCase(h2)) {
                                            }
                                            hashSet2.add(h2);
                                        }
                                        hashSet2.add(str);
                                    }
                                }
                            }
                            this.j = hashSet2;
                        } else if (intValue == 7) {
                            Set<byte[]> set4 = this.k;
                            HashSet hashSet3 = new HashSet();
                            Iterator it5 = ((Set) entry.getValue()).iterator();
                            while (it5.hasNext()) {
                                byte[] bArr = o.B(((y) it5.next()).d.c).c;
                                if (set4 != null) {
                                    for (byte[] bArr2 : set4) {
                                        if (bArr2.length != bArr.length) {
                                            it2 = it4;
                                            it3 = it5;
                                        } else {
                                            int length = bArr2.length / i4;
                                            byte[] bArr3 = new byte[length];
                                            byte[] bArr4 = new byte[length];
                                            System.arraycopy(bArr2, i2, bArr3, i2, length);
                                            System.arraycopy(bArr2, length, bArr4, i2, length);
                                            byte[] bArr5 = new byte[length];
                                            byte[] bArr6 = new byte[length];
                                            System.arraycopy(bArr, i2, bArr5, i2, length);
                                            System.arraycopy(bArr, length, bArr6, i2, length);
                                            byte[][] bArr7 = new byte[i5][];
                                            bArr7[i2] = bArr3;
                                            bArr7[c3] = bArr4;
                                            bArr7[i4] = bArr5;
                                            bArr7[3] = bArr6;
                                            byte[] bArr8 = bArr7[i2];
                                            byte[] bArr9 = bArr7[c3];
                                            byte[] bArr10 = bArr7[i4];
                                            byte[] bArr11 = bArr7[3];
                                            int length2 = bArr8.length;
                                            byte[] bArr12 = new byte[length2];
                                            byte[] bArr13 = new byte[length2];
                                            byte[] bArr14 = new byte[length2];
                                            byte[] bArr15 = new byte[length2];
                                            it2 = it4;
                                            int i6 = 0;
                                            while (i6 < length2) {
                                                bArr12[i6] = (byte) (bArr8[i6] & bArr9[i6]);
                                                bArr13[i6] = (byte) ((bArr8[i6] & bArr9[i6]) | (~bArr9[i6]));
                                                bArr14[i6] = (byte) (bArr10[i6] & bArr11[i6]);
                                                bArr15[i6] = (byte) ((bArr10[i6] & bArr11[i6]) | (~bArr11[i6]));
                                                i6++;
                                                bArr8 = bArr8;
                                                it5 = it5;
                                            }
                                            it3 = it5;
                                            byte[][] bArr16 = {bArr12, bArr13, bArr14, bArr15};
                                            byte[] bArr17 = bArr16[1];
                                            byte[] bArr18 = bArr16[3];
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 >= bArr17.length) {
                                                    bArr17 = bArr18;
                                                    break;
                                                } else if ((bArr17[i7] & 65535) < (65535 & bArr18[i7])) {
                                                    break;
                                                } else {
                                                    i7++;
                                                }
                                            }
                                            byte[] m = m(bArr16[0], bArr16[2]);
                                            if (Arrays.equals(m, bArr17)) {
                                                c2 = 0;
                                            } else {
                                                c2 = Arrays.equals(m(m, bArr17), m) ? (char) 1 : 65535;
                                            }
                                            if (c2 == 1) {
                                                i5 = 4;
                                            } else {
                                                i2 = 0;
                                                byte[] n = n(bArr16[0], bArr16[2]);
                                                byte[] n2 = n(bArr9, bArr11);
                                                int length3 = n.length;
                                                byte[] bArr19 = new byte[(length3 * 2)];
                                                System.arraycopy(n, 0, bArr19, 0, length3);
                                                System.arraycopy(n2, 0, bArr19, length3, length3);
                                                Set singleton = Collections.singleton(bArr19);
                                                i5 = 4;
                                                set = singleton;
                                                i4 = 2;
                                                hashSet3.addAll(set);
                                                c3 = 1;
                                                it4 = it2;
                                                it5 = it3;
                                            }
                                        }
                                        set = Collections.EMPTY_SET;
                                        i4 = 2;
                                        i2 = 0;
                                        hashSet3.addAll(set);
                                        c3 = 1;
                                        it4 = it2;
                                        it5 = it3;
                                    }
                                } else if (bArr != null) {
                                    hashSet3.add(bArr);
                                }
                            }
                            it = it4;
                            this.k = hashSet3;
                        } else {
                            throw new IllegalStateException(i0.d.a.a.a.e0("Unknown tag encountered: ", intValue));
                        }
                    } else {
                        it = it4;
                        Set<String> set5 = this.h;
                        HashSet hashSet4 = new HashSet();
                        for (y yVar4 : (Set) entry.getValue()) {
                            String h3 = h(yVar4.d);
                            if (set5 == null) {
                                hashSet4.add(h3);
                            } else {
                                for (String str2 : set5) {
                                    if (r(str2, h3)) {
                                        hashSet4.add(str2);
                                    } else if (r(h3, str2)) {
                                        hashSet4.add(h3);
                                    }
                                }
                            }
                        }
                        this.h = hashSet4;
                    }
                } else {
                    it = it4;
                    Set<String> set6 = this.i;
                    HashSet hashSet5 = new HashSet();
                    for (y yVar5 : (Set) entry.getValue()) {
                        String h4 = h(yVar5.d);
                        if (set6 == null) {
                            hashSet5.add(h4);
                        } else {
                            for (String str3 : set6) {
                                if (h4.indexOf(64) != -1) {
                                    String f02 = i0.d.a.a.a.f0(h4, 64, 1);
                                    if (str3.indexOf(64) != -1) {
                                        if (!h4.equalsIgnoreCase(str3)) {
                                        }
                                    } else if (str3.startsWith(".")) {
                                        if (!r(f02, str3)) {
                                        }
                                    } else if (!f02.equalsIgnoreCase(str3)) {
                                    }
                                } else {
                                    if (h4.startsWith(".")) {
                                        if (str3.indexOf(64) != -1) {
                                            if (!r(str3.substring(h4.indexOf(64) + 1), h4)) {
                                            }
                                        } else if (str3.startsWith(".")) {
                                            if (!r(h4, str3) && !h4.equalsIgnoreCase(str3)) {
                                                if (!r(str3, h4)) {
                                                }
                                            }
                                        } else if (!r(str3, h4)) {
                                        }
                                    } else if (str3.indexOf(64) != -1) {
                                        if (!str3.substring(str3.indexOf(64) + 1).equalsIgnoreCase(h4)) {
                                        }
                                    } else if (str3.startsWith(".")) {
                                        if (!r(h4, str3)) {
                                        }
                                    } else if (!h4.equalsIgnoreCase(str3)) {
                                    }
                                    hashSet5.add(str3);
                                }
                                hashSet5.add(h4);
                            }
                        }
                    }
                    this.i = hashSet5;
                }
            } else {
                it = it4;
                Set<Object> set7 = this.l;
                HashSet hashSet6 = new HashSet();
                for (y yVar6 : (Set) entry.getValue()) {
                    g0 s = g0.s(yVar6.d.c);
                    if (set7 != null) {
                        for (Object s2 : set7) {
                            if (s.equals(g0.s(s2))) {
                                hashSet6.add(s);
                            }
                        }
                    } else if (s != null) {
                        hashSet6.add(s);
                    }
                }
                this.l = hashSet6;
            }
            it4 = it;
        }
    }

    public final boolean k(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr4[i2] = (byte) (bArr2[i2] & bArr3[i2]);
            bArr5[i2] = (byte) (bArr[i2] & bArr3[i2]);
        }
        return Arrays.equals(bArr4, bArr5);
    }

    public final boolean l(String str, String str2) {
        String f0 = i0.d.a.a.a.f0(str, 58, 1);
        if (f0.indexOf("//") != -1) {
            f0 = f0.substring(f0.indexOf("//") + 2);
        }
        if (f0.lastIndexOf(58) != -1) {
            f0 = f0.substring(0, f0.lastIndexOf(58));
        }
        String f02 = i0.d.a.a.a.f0(i0.d.a.a.a.f0(f0, 58, 1), 64, 1);
        if (f02.indexOf(47) != -1) {
            f02 = f02.substring(0, f02.indexOf(47));
        }
        if (!str2.startsWith(".")) {
            if (f02.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (r(f02, str2)) {
            return true;
        }
        return false;
    }

    public final String o(Set set) {
        StringBuilder P0 = i0.d.a.a.a.P0("[");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            boolean z = true;
            if (P0.length() > 1) {
                P0.append(InstabugDbContract.COMMA_SEP);
            }
            byte[] bArr = (byte[]) it.next();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < bArr.length / 2; i2++) {
                if (sb.length() > 0) {
                    sb.append(".");
                }
                sb.append(Integer.toString(bArr[i2] & 255));
            }
            sb.append("/");
            for (int length = bArr.length / 2; length < bArr.length; length++) {
                if (z) {
                    z = false;
                } else {
                    sb.append(".");
                }
                sb.append(Integer.toString(bArr[length] & 255));
            }
            P0.append(sb.toString());
        }
        P0.append("]");
        return P0.toString();
    }

    public final String p(Set set) {
        StringBuilder P0 = i0.d.a.a.a.P0("[");
        for (Object s : set) {
            if (P0.length() > 1) {
                P0.append(InstabugDbContract.COMMA_SEP);
            }
            g0 s2 = g0.s(s);
            P0.append(s2.c.d);
            P0.append(":");
            try {
                P0.append(s0.a.g.k.d.f(s2.d.c().getEncoded()));
            } catch (IOException e2) {
                P0.append(e2.toString());
            }
        }
        P0.append("]");
        return P0.toString();
    }

    public final boolean r(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] b2 = j.b(str2, '.');
        String[] b3 = j.b(str, '.');
        if (b3.length <= b2.length) {
            return false;
        }
        int length = b3.length - b2.length;
        for (int i2 = -1; i2 < b2.length; i2++) {
            if (i2 == -1) {
                if (b3[i2 + length].equals("")) {
                    return false;
                }
            } else if (!b2[i2].equalsIgnoreCase(b3[i2 + length])) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("permitted:");
        sb.append(j.a);
        if (this.g != null) {
            sb.append("DN:");
            sb.append(j.a);
            a(sb, this.g.toString());
        }
        if (this.h != null) {
            sb.append("DNS:");
            sb.append(j.a);
            a(sb, this.h.toString());
        }
        if (this.i != null) {
            sb.append("Email:");
            sb.append(j.a);
            a(sb, this.i.toString());
        }
        if (this.j != null) {
            sb.append("URI:");
            sb.append(j.a);
            a(sb, this.j.toString());
        }
        if (this.k != null) {
            sb.append("IP:");
            sb.append(j.a);
            a(sb, o(this.k));
        }
        if (this.l != null) {
            sb.append("OtherName:");
            sb.append(j.a);
            a(sb, p(this.l));
        }
        sb.append("excluded:");
        sb.append(j.a);
        if (!this.a.isEmpty()) {
            sb.append("DN:");
            sb.append(j.a);
            a(sb, this.a.toString());
        }
        if (!this.b.isEmpty()) {
            sb.append("DNS:");
            sb.append(j.a);
            a(sb, this.b.toString());
        }
        if (!this.c.isEmpty()) {
            sb.append("Email:");
            sb.append(j.a);
            a(sb, this.c.toString());
        }
        if (!this.d.isEmpty()) {
            sb.append("URI:");
            sb.append(j.a);
            a(sb, this.d.toString());
        }
        if (!this.e.isEmpty()) {
            sb.append("IP:");
            sb.append(j.a);
            a(sb, o(this.e));
        }
        if (!this.f.isEmpty()) {
            sb.append("OtherName:");
            sb.append(j.a);
            a(sb, p(this.f));
        }
        return sb.toString();
    }
}
