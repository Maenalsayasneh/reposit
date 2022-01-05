package r0;

import java.util.List;
import java.util.RandomAccess;
import m0.n.b.f;
import okio.ByteString;

/* compiled from: Options.kt */
public final class q extends m0.j.a<ByteString> implements RandomAccess {
    public static final a c = new a((f) null);
    public final ByteString[] d;
    public final int[] q;

    /* compiled from: Options.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final void a(long j, f fVar, int i, List<? extends ByteString> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            f fVar2;
            f fVar3 = fVar;
            int i8 = i;
            List<? extends ByteString> list3 = list;
            int i9 = i2;
            int i10 = i3;
            List<Integer> list4 = list2;
            if (i9 < i10) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((ByteString) list3.get(i11)).e() >= i8) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                ByteString byteString = (ByteString) list.get(i2);
                ByteString byteString2 = (ByteString) list3.get(i10 - 1);
                int i12 = -1;
                if (i8 == byteString.e()) {
                    int intValue = list4.get(i9).intValue();
                    int i13 = i9 + 1;
                    i4 = i13;
                    i5 = intValue;
                    byteString = (ByteString) list3.get(i13);
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (byteString.i(i8) != byteString2.i(i8)) {
                    int i14 = 1;
                    for (int i15 = i4 + 1; i15 < i10; i15++) {
                        if (((ByteString) list3.get(i15 - 1)).i(i8) != ((ByteString) list3.get(i15)).i(i8)) {
                            i14++;
                        }
                    }
                    long b = b(fVar3) + j + ((long) 2) + ((long) (i14 * 2));
                    fVar3.O(i14);
                    fVar3.O(i5);
                    for (int i16 = i4; i16 < i10; i16++) {
                        byte i17 = ((ByteString) list3.get(i16)).i(i8);
                        if (i16 == i4 || i17 != ((ByteString) list3.get(i16 - 1)).i(i8)) {
                            fVar3.O(i17 & 255);
                        }
                    }
                    f fVar4 = new f();
                    while (i4 < i10) {
                        byte i18 = ((ByteString) list3.get(i4)).i(i8);
                        int i19 = i4 + 1;
                        int i20 = i19;
                        while (true) {
                            if (i20 >= i10) {
                                i6 = i10;
                                break;
                            } else if (i18 != ((ByteString) list3.get(i20)).i(i8)) {
                                i6 = i20;
                                break;
                            } else {
                                i20++;
                            }
                        }
                        if (i19 == i6 && i8 + 1 == ((ByteString) list3.get(i4)).e()) {
                            fVar3.O(list4.get(i4).intValue());
                            i7 = i6;
                            fVar2 = fVar4;
                        } else {
                            fVar3.O(((int) (b(fVar4) + b)) * i12);
                            i7 = i6;
                            fVar2 = fVar4;
                            a(b, fVar4, i8 + 1, list, i4, i6, list2);
                        }
                        fVar4 = fVar2;
                        i4 = i7;
                        i12 = -1;
                    }
                    fVar3.V(fVar4);
                    return;
                }
                int min = Math.min(byteString.e(), byteString2.e());
                int i21 = i8;
                int i22 = 0;
                while (i21 < min && byteString.i(i21) == byteString2.i(i21)) {
                    i22++;
                    i21++;
                }
                long b2 = b(fVar3) + j + ((long) 2) + ((long) i22) + 1;
                fVar3.O(-i22);
                fVar3.O(i5);
                int i23 = i8 + i22;
                while (i8 < i23) {
                    fVar3.O(byteString.i(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i23 == ((ByteString) list3.get(i4)).e()) {
                        fVar3.O(list4.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                f fVar5 = new f();
                fVar3.O(((int) (b(fVar5) + b2)) * -1);
                a(b2, fVar5, i23, list, i4, i3, list2);
                fVar3.V(fVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long b(f fVar) {
            return fVar.d / ((long) 4);
        }
    }

    public q(ByteString[] byteStringArr, int[] iArr, f fVar) {
        this.d = byteStringArr;
        this.q = iArr;
    }

    public int b() {
        return this.d.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    public Object get(int i) {
        return this.d[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
