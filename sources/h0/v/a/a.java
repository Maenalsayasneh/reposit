package h0.v.a;

import androidx.recyclerview.widget.RecyclerView;
import h0.i.h.d;
import h0.v.a.s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdapterHelper */
public final class a implements s.a {
    public d<b> a = new d<>(30);
    public final ArrayList<b> b = new ArrayList<>();
    public final ArrayList<b> c = new ArrayList<>();
    public final C0070a d;
    public final s e;
    public int f = 0;

    /* renamed from: h0.v.a.a$a  reason: collision with other inner class name */
    /* compiled from: AdapterHelper */
    public interface C0070a {
    }

    /* compiled from: AdapterHelper */
    public static final class b {
        public int a;
        public int b;
        public Object c;
        public int d;

        public b(int i, int i2, int i3, Object obj) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.a;
            if (i != bVar.a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(C0070a aVar) {
        this.d = aVar;
        this.e = new s(this);
    }

    public final boolean a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                if (f(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.b;
                int i5 = bVar.d + i4;
                while (i4 < i5) {
                    if (f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((RecyclerView.f) this.d).a(this.c.get(i));
        }
        l(this.c);
        this.f = 0;
    }

    public void c() {
        b();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.b.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                ((RecyclerView.f) this.d).a(bVar);
                RecyclerView.f fVar = (RecyclerView.f) this.d;
                RecyclerView.this.offsetPositionRecordsForInsert(bVar.b, bVar.d);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                ((RecyclerView.f) this.d).a(bVar);
                C0070a aVar = this.d;
                int i3 = bVar.b;
                int i4 = bVar.d;
                RecyclerView.f fVar2 = (RecyclerView.f) aVar;
                RecyclerView.this.offsetPositionRecordsForRemove(i3, i4, true);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mItemsAddedOrRemoved = true;
                recyclerView.mState.c += i4;
            } else if (i2 == 4) {
                ((RecyclerView.f) this.d).a(bVar);
                ((RecyclerView.f) this.d).c(bVar.b, bVar.d, bVar.c);
            } else if (i2 == 8) {
                ((RecyclerView.f) this.d).a(bVar);
                RecyclerView.f fVar3 = (RecyclerView.f) this.d;
                RecyclerView.this.offsetPositionRecordsForMove(bVar.b, bVar.d);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }
        }
        l(this.b);
        this.f = 0;
    }

    public final void d(b bVar) {
        int i;
        int i2 = bVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m = m(bVar.b, i2);
        int i3 = bVar.b;
        int i4 = bVar.a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.d; i6++) {
            int m2 = m((i * i6) + bVar.b, bVar.a);
            int i7 = bVar.a;
            if (i7 == 2 ? m2 == m : i7 == 4 && m2 == m + 1) {
                i5++;
            } else {
                b h = h(i7, m, i5, bVar.c);
                e(h, i3);
                k(h);
                if (bVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                m = m2;
            }
        }
        Object obj = bVar.c;
        k(bVar);
        if (i5 > 0) {
            b h2 = h(bVar.a, m, i5, obj);
            e(h2, i3);
            k(h2);
        }
    }

    public void e(b bVar, int i) {
        ((RecyclerView.f) this.d).a(bVar);
        int i2 = bVar.a;
        if (i2 == 2) {
            C0070a aVar = this.d;
            int i3 = bVar.d;
            RecyclerView.f fVar = (RecyclerView.f) aVar;
            RecyclerView.this.offsetPositionRecordsForRemove(i, i3, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.c += i3;
        } else if (i2 == 4) {
            RecyclerView.f fVar2 = (RecyclerView.f) this.d;
            RecyclerView.this.viewRangeUpdate(i, bVar.d, bVar.c);
            RecyclerView.this.mItemsChanged = true;
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public int f(int i, int i2) {
        int size = this.c.size();
        while (i2 < size) {
            b bVar = this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                int i4 = bVar.b;
                if (i4 == i) {
                    i = bVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean g() {
        return this.b.size() > 0;
    }

    public b h(int i, int i2, int i3, Object obj) {
        b a2 = this.a.a();
        if (a2 == null) {
            return new b(i, i2, i3, obj);
        }
        a2.a = i;
        a2.b = i2;
        a2.d = i3;
        a2.c = obj;
        return a2;
    }

    public final void i(b bVar) {
        this.c.add(bVar);
        int i = bVar.a;
        if (i == 1) {
            C0070a aVar = this.d;
            RecyclerView.f fVar = (RecyclerView.f) aVar;
            RecyclerView.this.offsetPositionRecordsForInsert(bVar.b, bVar.d);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        } else if (i == 2) {
            C0070a aVar2 = this.d;
            RecyclerView.f fVar2 = (RecyclerView.f) aVar2;
            RecyclerView.this.offsetPositionRecordsForRemove(bVar.b, bVar.d, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        } else if (i == 4) {
            ((RecyclerView.f) this.d).c(bVar.b, bVar.d, bVar.c);
        } else if (i == 8) {
            C0070a aVar3 = this.d;
            RecyclerView.f fVar3 = (RecyclerView.f) aVar3;
            RecyclerView.this.offsetPositionRecordsForMove(bVar.b, bVar.d);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j() {
        /*
            r16 = this;
            r0 = r16
            h0.v.a.s r1 = r0.e
            java.util.ArrayList<h0.v.a.a$b> r2 = r0.b
            java.util.Objects.requireNonNull(r1)
        L_0x0009:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r2.get(r3)
            h0.v.a.a$b r9 = (h0.v.a.a.b) r9
            int r9 = r9.a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = r4
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = r8
        L_0x0027:
            r6 = 0
            r9 = 4
            r10 = 2
            if (r3 == r8) goto L_0x01c6
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            h0.v.a.a$b r11 = (h0.v.a.a.b) r11
            java.lang.Object r12 = r2.get(r7)
            h0.v.a.a$b r12 = (h0.v.a.a.b) r12
            int r13 = r12.a
            if (r13 == r4) goto L_0x019c
            if (r13 == r10) goto L_0x00a8
            if (r13 == r9) goto L_0x0043
            goto L_0x0009
        L_0x0043:
            int r5 = r11.d
            int r8 = r12.b
            if (r5 >= r8) goto L_0x004e
            int r8 = r8 + -1
            r12.b = r8
            goto L_0x0064
        L_0x004e:
            int r10 = r12.d
            int r8 = r8 + r10
            if (r5 >= r8) goto L_0x0064
            int r10 = r10 + -1
            r12.d = r10
            h0.v.a.s$a r5 = r1.a
            int r8 = r11.b
            java.lang.Object r10 = r12.c
            h0.v.a.a r5 = (h0.v.a.a) r5
            h0.v.a.a$b r4 = r5.h(r9, r8, r4, r10)
            goto L_0x0065
        L_0x0064:
            r4 = r6
        L_0x0065:
            int r5 = r11.b
            int r8 = r12.b
            if (r5 > r8) goto L_0x0070
            int r8 = r8 + 1
            r12.b = r8
            goto L_0x0087
        L_0x0070:
            int r10 = r12.d
            int r8 = r8 + r10
            if (r5 >= r8) goto L_0x0087
            int r8 = r8 - r5
            h0.v.a.s$a r6 = r1.a
            int r5 = r5 + 1
            java.lang.Object r10 = r12.c
            h0.v.a.a r6 = (h0.v.a.a) r6
            h0.v.a.a$b r6 = r6.h(r9, r5, r8, r10)
            int r5 = r12.d
            int r5 = r5 - r8
            r12.d = r5
        L_0x0087:
            r2.set(r7, r11)
            int r5 = r12.d
            if (r5 <= 0) goto L_0x0092
            r2.set(r3, r12)
            goto L_0x009c
        L_0x0092:
            r2.remove(r3)
            h0.v.a.s$a r5 = r1.a
            h0.v.a.a r5 = (h0.v.a.a) r5
            r5.k(r12)
        L_0x009c:
            if (r4 == 0) goto L_0x00a1
            r2.add(r3, r4)
        L_0x00a1:
            if (r6 == 0) goto L_0x0009
            r2.add(r3, r6)
            goto L_0x0009
        L_0x00a8:
            int r8 = r11.b
            int r9 = r11.d
            if (r8 >= r9) goto L_0x00bd
            int r13 = r12.b
            if (r13 != r8) goto L_0x00bb
            int r13 = r12.d
            int r8 = r9 - r8
            if (r13 != r8) goto L_0x00bb
            r5 = r4
            r8 = 0
            goto L_0x00cd
        L_0x00bb:
            r5 = 0
            goto L_0x00c9
        L_0x00bd:
            int r13 = r12.b
            int r14 = r9 + 1
            if (r13 != r14) goto L_0x00cb
            int r13 = r12.d
            int r8 = r8 - r9
            if (r13 != r8) goto L_0x00cb
            r5 = r4
        L_0x00c9:
            r8 = r5
            goto L_0x00cd
        L_0x00cb:
            r8 = r4
            r5 = 0
        L_0x00cd:
            int r13 = r12.b
            if (r9 >= r13) goto L_0x00d6
            int r13 = r13 + -1
            r12.b = r13
            goto L_0x00f3
        L_0x00d6:
            int r14 = r12.d
            int r13 = r13 + r14
            if (r9 >= r13) goto L_0x00f3
            int r14 = r14 + -1
            r12.d = r14
            r11.a = r10
            r11.d = r4
            int r3 = r12.d
            if (r3 != 0) goto L_0x0009
            r2.remove(r7)
            h0.v.a.s$a r3 = r1.a
            h0.v.a.a r3 = (h0.v.a.a) r3
            r3.k(r12)
            goto L_0x0009
        L_0x00f3:
            int r4 = r11.b
            int r9 = r12.b
            if (r4 > r9) goto L_0x00fe
            int r9 = r9 + 1
            r12.b = r9
            goto L_0x0115
        L_0x00fe:
            int r13 = r12.d
            int r9 = r9 + r13
            if (r4 >= r9) goto L_0x0115
            int r9 = r9 - r4
            h0.v.a.s$a r13 = r1.a
            int r4 = r4 + 1
            h0.v.a.a r13 = (h0.v.a.a) r13
            h0.v.a.a$b r6 = r13.h(r10, r4, r9, r6)
            int r4 = r11.b
            int r9 = r12.b
            int r4 = r4 - r9
            r12.d = r4
        L_0x0115:
            if (r5 == 0) goto L_0x0126
            r2.set(r3, r12)
            r2.remove(r7)
            h0.v.a.s$a r3 = r1.a
            h0.v.a.a r3 = (h0.v.a.a) r3
            r3.k(r11)
            goto L_0x0009
        L_0x0126:
            if (r8 == 0) goto L_0x0157
            if (r6 == 0) goto L_0x0140
            int r4 = r11.b
            int r5 = r6.b
            if (r4 <= r5) goto L_0x0135
            int r5 = r6.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x0135:
            int r4 = r11.d
            int r5 = r6.b
            if (r4 <= r5) goto L_0x0140
            int r5 = r6.d
            int r4 = r4 - r5
            r11.d = r4
        L_0x0140:
            int r4 = r11.b
            int r5 = r12.b
            if (r4 <= r5) goto L_0x014b
            int r5 = r12.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x014b:
            int r4 = r11.d
            int r5 = r12.b
            if (r4 <= r5) goto L_0x0185
            int r5 = r12.d
            int r4 = r4 - r5
            r11.d = r4
            goto L_0x0185
        L_0x0157:
            if (r6 == 0) goto L_0x016f
            int r4 = r11.b
            int r5 = r6.b
            if (r4 < r5) goto L_0x0164
            int r5 = r6.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x0164:
            int r4 = r11.d
            int r5 = r6.b
            if (r4 < r5) goto L_0x016f
            int r5 = r6.d
            int r4 = r4 - r5
            r11.d = r4
        L_0x016f:
            int r4 = r11.b
            int r5 = r12.b
            if (r4 < r5) goto L_0x017a
            int r5 = r12.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x017a:
            int r4 = r11.d
            int r5 = r12.b
            if (r4 < r5) goto L_0x0185
            int r5 = r12.d
            int r4 = r4 - r5
            r11.d = r4
        L_0x0185:
            r2.set(r3, r12)
            int r4 = r11.b
            int r5 = r11.d
            if (r4 == r5) goto L_0x0192
            r2.set(r7, r11)
            goto L_0x0195
        L_0x0192:
            r2.remove(r7)
        L_0x0195:
            if (r6 == 0) goto L_0x0009
            r2.add(r3, r6)
            goto L_0x0009
        L_0x019c:
            int r4 = r11.d
            int r6 = r12.b
            if (r4 >= r6) goto L_0x01a4
            r5 = r8
            goto L_0x01a5
        L_0x01a4:
            r5 = 0
        L_0x01a5:
            int r8 = r11.b
            if (r8 >= r6) goto L_0x01ab
            int r5 = r5 + 1
        L_0x01ab:
            if (r6 > r8) goto L_0x01b2
            int r6 = r12.d
            int r8 = r8 + r6
            r11.b = r8
        L_0x01b2:
            int r6 = r12.b
            if (r6 > r4) goto L_0x01bb
            int r8 = r12.d
            int r4 = r4 + r8
            r11.d = r4
        L_0x01bb:
            int r6 = r6 + r5
            r12.b = r6
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0009
        L_0x01c6:
            java.util.ArrayList<h0.v.a.a$b> r1 = r0.b
            int r1 = r1.size()
            r2 = 0
        L_0x01cd:
            if (r2 >= r1) goto L_0x029a
            java.util.ArrayList<h0.v.a.a$b> r3 = r0.b
            java.lang.Object r3 = r3.get(r2)
            h0.v.a.a$b r3 = (h0.v.a.a.b) r3
            int r11 = r3.a
            if (r11 == r4) goto L_0x0293
            if (r11 == r10) goto L_0x023d
            if (r11 == r9) goto L_0x01e8
            if (r11 == r7) goto L_0x01e3
            goto L_0x0296
        L_0x01e3:
            r0.i(r3)
            goto L_0x0296
        L_0x01e8:
            int r11 = r3.b
            int r12 = r3.d
            int r12 = r12 + r11
            r15 = r8
            r13 = r11
            r14 = 0
        L_0x01f0:
            if (r11 >= r12) goto L_0x0224
            h0.v.a.a$a r5 = r0.d
            androidx.recyclerview.widget.RecyclerView$f r5 = (androidx.recyclerview.widget.RecyclerView.f) r5
            androidx.recyclerview.widget.RecyclerView$b0 r5 = r5.b(r11)
            if (r5 != 0) goto L_0x0212
            boolean r5 = r0.a(r11)
            if (r5 == 0) goto L_0x0203
            goto L_0x0212
        L_0x0203:
            if (r15 != r4) goto L_0x0210
            java.lang.Object r5 = r3.c
            h0.v.a.a$b r5 = r0.h(r9, r13, r14, r5)
            r0.i(r5)
            r13 = r11
            r14 = 0
        L_0x0210:
            r15 = 0
            goto L_0x0220
        L_0x0212:
            if (r15 != 0) goto L_0x021f
            java.lang.Object r5 = r3.c
            h0.v.a.a$b r5 = r0.h(r9, r13, r14, r5)
            r0.d(r5)
            r13 = r11
            r14 = 0
        L_0x021f:
            r15 = r4
        L_0x0220:
            int r14 = r14 + r4
            int r11 = r11 + 1
            goto L_0x01f0
        L_0x0224:
            int r5 = r3.d
            if (r14 == r5) goto L_0x0231
            java.lang.Object r5 = r3.c
            r0.k(r3)
            h0.v.a.a$b r3 = r0.h(r9, r13, r14, r5)
        L_0x0231:
            if (r15 != 0) goto L_0x0238
            r0.d(r3)
            goto L_0x0296
        L_0x0238:
            r0.i(r3)
            goto L_0x0296
        L_0x023d:
            int r5 = r3.b
            int r11 = r3.d
            int r11 = r11 + r5
            r12 = r5
            r14 = r8
            r13 = 0
        L_0x0245:
            if (r12 >= r11) goto L_0x027e
            h0.v.a.a$a r15 = r0.d
            androidx.recyclerview.widget.RecyclerView$f r15 = (androidx.recyclerview.widget.RecyclerView.f) r15
            androidx.recyclerview.widget.RecyclerView$b0 r15 = r15.b(r12)
            if (r15 != 0) goto L_0x0266
            boolean r15 = r0.a(r12)
            if (r15 == 0) goto L_0x0258
            goto L_0x0266
        L_0x0258:
            if (r14 != r4) goto L_0x0263
            h0.v.a.a$b r14 = r0.h(r10, r5, r13, r6)
            r0.i(r14)
            r14 = r4
            goto L_0x0264
        L_0x0263:
            r14 = 0
        L_0x0264:
            r15 = 0
            goto L_0x0273
        L_0x0266:
            if (r14 != 0) goto L_0x0271
            h0.v.a.a$b r14 = r0.h(r10, r5, r13, r6)
            r0.d(r14)
            r14 = r4
            goto L_0x0272
        L_0x0271:
            r14 = 0
        L_0x0272:
            r15 = r4
        L_0x0273:
            if (r14 == 0) goto L_0x0279
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = r4
            goto L_0x027b
        L_0x0279:
            int r13 = r13 + 1
        L_0x027b:
            int r12 = r12 + r4
            r14 = r15
            goto L_0x0245
        L_0x027e:
            int r11 = r3.d
            if (r13 == r11) goto L_0x0289
            r0.k(r3)
            h0.v.a.a$b r3 = r0.h(r10, r5, r13, r6)
        L_0x0289:
            if (r14 != 0) goto L_0x028f
            r0.d(r3)
            goto L_0x0296
        L_0x028f:
            r0.i(r3)
            goto L_0x0296
        L_0x0293:
            r0.i(r3)
        L_0x0296:
            int r2 = r2 + 1
            goto L_0x01cd
        L_0x029a:
            java.util.ArrayList<h0.v.a.a$b> r1 = r0.b
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.v.a.a.j():void");
    }

    public void k(b bVar) {
        bVar.c = null;
        this.a.b(bVar);
    }

    public void l(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            k(list.get(i));
        }
        list.clear();
    }

    public final int m(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b bVar = this.c.get(size);
            int i5 = bVar.a;
            if (i5 == 8) {
                int i6 = bVar.b;
                int i7 = bVar.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.b = i6 + 1;
                            bVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.b = i6 - 1;
                            bVar.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.d;
                    } else if (i5 == 2) {
                        i += bVar.d;
                    }
                } else if (i2 == 1) {
                    bVar.b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.b = i8 - 1;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.c.get(size2);
            if (bVar2.a == 8) {
                int i9 = bVar2.d;
                if (i9 == bVar2.b || i9 < 0) {
                    this.c.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.d <= 0) {
                this.c.remove(size2);
                k(bVar2);
            }
        }
        return i;
    }
}
