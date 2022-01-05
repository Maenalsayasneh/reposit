package h0.u;

import androidx.paging.LoadType;
import androidx.paging.PageEvent;
import h0.u.h0;
import h0.u.j;
import h0.u.x;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.f2.d;
import n0.a.k2.b;

/* compiled from: PageFetcherSnapshotState.kt */
public final class r<Key, Value> {
    public final List<x.b.C0069b<Key, Value>> a;
    public final List<x.b.C0069b<Key, Value>> b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final d<Integer> h = m0.r.t.a.r.m.a1.a.d(-1, (BufferOverflow) null, (l) null, 6);
    public final d<Integer> i = m0.r.t.a.r.m.a1.a.d(-1, (BufferOverflow) null, (l) null, 6);
    public final Map<LoadType, h0> j = new LinkedHashMap();
    public k k;
    public final v l;

    /* compiled from: PageFetcherSnapshotState.kt */
    public static final class a<Key, Value> {
        public final b a = n0.a.k2.d.a(false, 1);
        public final r<Key, Value> b;
        public final v c;

        public a(v vVar) {
            i.e(vVar, "config");
            this.c = vVar;
            this.b = new r<>(vVar, (f) null);
        }
    }

    public r(v vVar, f fVar) {
        this.l = vVar;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = arrayList;
        k kVar = k.b;
        this.k = k.a;
    }

    public final y<Key, Value> a(h0.a aVar) {
        Integer num;
        int i2;
        List<T> v02 = g.v0(this.b);
        if (aVar != null) {
            int e2 = e();
            int i3 = -this.c;
            int y = g.y(this.b) - this.c;
            int i4 = aVar.e;
            for (int i5 = i3; i5 < i4; i5++) {
                if (i5 > y) {
                    i2 = this.l.a;
                } else {
                    i2 = this.b.get(this.c + i5).a.size();
                }
                e2 += i2;
            }
            int i6 = e2 + aVar.f;
            if (aVar.e < i3) {
                i6 -= this.l.a;
            }
            num = Integer.valueOf(i6);
        } else {
            num = null;
        }
        return new y<>(v02, num, this.l, e());
    }

    public final void b(PageEvent.a<Value> aVar) {
        i.e(aVar, "event");
        if (aVar.c() <= this.b.size()) {
            this.j.remove(aVar.a);
            this.k = this.k.c(aVar.a, j.c.c);
            int ordinal = aVar.a.ordinal();
            if (ordinal == 1) {
                int c2 = aVar.c();
                for (int i2 = 0; i2 < c2; i2++) {
                    this.a.remove(0);
                }
                this.c -= aVar.c();
                i(aVar.d);
                int i3 = this.f + 1;
                this.f = i3;
                this.h.offer(Integer.valueOf(i3));
            } else if (ordinal == 2) {
                int c3 = aVar.c();
                for (int i4 = 0; i4 < c3; i4++) {
                    this.a.remove(this.b.size() - 1);
                }
                h(aVar.d);
                int i5 = this.g + 1;
                this.g = i5;
                this.i.offer(Integer.valueOf(i5));
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0("cannot drop ");
                P0.append(aVar.a);
                throw new IllegalArgumentException(P0.toString());
            }
        } else {
            StringBuilder P02 = i0.d.a.a.a.P0("invalid drop count. have ");
            P02.append(this.b.size());
            P02.append(" but wanted to drop ");
            P02.append(aVar.c());
            throw new IllegalStateException(P02.toString().toString());
        }
    }

    public final PageEvent.a<Value> c(LoadType loadType, h0 h0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        i.e(loadType, "loadType");
        i.e(h0Var, "hint");
        PageEvent.a<Value> aVar = null;
        if (this.l.e == Integer.MAX_VALUE || this.b.size() <= 2 || f() <= this.l.e) {
            return null;
        }
        int i8 = 0;
        if (loadType != LoadType.REFRESH) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < this.b.size() && f() - i10 > this.l.e) {
                if (loadType.ordinal() != 1) {
                    List<x.b.C0069b<Key, Value>> list = this.b;
                    i6 = list.get(g.y(list) - i9).a.size();
                } else {
                    i6 = this.b.get(i9).a.size();
                }
                if (loadType.ordinal() != 1) {
                    i7 = h0Var.b;
                } else {
                    i7 = h0Var.a;
                }
                if ((i7 - i10) - i6 < this.l.b) {
                    break;
                }
                i10 += i6;
                i9++;
            }
            if (i9 != 0) {
                if (loadType.ordinal() != 1) {
                    i2 = (g.y(this.b) - this.c) - (i9 - 1);
                } else {
                    i2 = -this.c;
                }
                if (loadType.ordinal() != 1) {
                    i4 = g.y(this.b);
                    i3 = this.c;
                } else {
                    i4 = i9 - 1;
                    i3 = this.c;
                }
                int i11 = i4 - i3;
                if (this.l.c) {
                    if (loadType == LoadType.PREPEND) {
                        i5 = e();
                    } else {
                        i5 = d();
                    }
                    i8 = i5 + i10;
                }
                aVar = new PageEvent.a<>(loadType, i2, i11, i8);
            }
            return aVar;
        }
        throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
    }

    public final int d() {
        if (this.l.c) {
            return this.e;
        }
        return 0;
    }

    public final int e() {
        if (this.l.c) {
            return this.d;
        }
        return 0;
    }

    public final int f() {
        int i2 = 0;
        for (x.b.C0069b bVar : this.b) {
            i2 += bVar.a.size();
        }
        return i2;
    }

    public final boolean g(int i2, LoadType loadType, x.b.C0069b<Key, Value> bVar) {
        i.e(loadType, "loadType");
        i.e(bVar, "page");
        int ordinal = loadType.ordinal();
        int i3 = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (!(!this.b.isEmpty())) {
                        throw new IllegalStateException("should've received an init before append".toString());
                    } else if (i2 != this.g) {
                        return false;
                    } else {
                        this.a.add(bVar);
                        int i4 = bVar.e;
                        if (i4 == Integer.MIN_VALUE) {
                            int d2 = d() - bVar.a.size();
                            if (d2 >= 0) {
                                i3 = d2;
                            }
                            i4 = i3;
                        }
                        h(i4);
                        this.j.remove(LoadType.APPEND);
                    }
                }
            } else if (!(!this.b.isEmpty())) {
                throw new IllegalStateException("should've received an init before prepend".toString());
            } else if (i2 != this.f) {
                return false;
            } else {
                this.a.add(0, bVar);
                this.c++;
                int i5 = bVar.d;
                if (i5 == Integer.MIN_VALUE) {
                    int e2 = e() - bVar.a.size();
                    if (e2 >= 0) {
                        i3 = e2;
                    }
                    i5 = i3;
                }
                i(i5);
                this.j.remove(LoadType.PREPEND);
            }
        } else if (this.b.isEmpty()) {
            if (i2 == 0) {
                this.a.add(bVar);
                this.c = 0;
                h(bVar.e);
                i(bVar.d);
            } else {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
        } else {
            throw new IllegalStateException("cannot receive multiple init calls".toString());
        }
        return true;
    }

    public final void h(int i2) {
        if (i2 == Integer.MIN_VALUE) {
            i2 = 0;
        }
        this.e = i2;
    }

    public final void i(int i2) {
        if (i2 == Integer.MIN_VALUE) {
            i2 = 0;
        }
        this.d = i2;
    }

    public final boolean j(LoadType loadType, j jVar) {
        i.e(loadType, "type");
        i.e(jVar, "newState");
        if (i.a(this.k.b(loadType), jVar)) {
            return false;
        }
        this.k = this.k.c(loadType, jVar);
        return true;
    }

    public final PageEvent<Value> k(x.b.C0069b<Key, Value> bVar, LoadType loadType) {
        i.e(bVar, "$this$toPageEvent");
        i.e(loadType, "loadType");
        int ordinal = loadType.ordinal();
        int i2 = 0;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i2 = 0 - this.c;
            } else if (ordinal == 2) {
                i2 = (this.b.size() - this.c) - 1;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        List L2 = h.L2(new f0(i2, bVar.a));
        int ordinal2 = loadType.ordinal();
        if (ordinal2 == 0) {
            PageEvent.Insert.a aVar = PageEvent.Insert.b;
            int e2 = e();
            int d2 = d();
            k kVar = this.k;
            return aVar.c(L2, e2, d2, new b(kVar.c, kVar.d, kVar.e, kVar, (k) null));
        } else if (ordinal2 == 1) {
            PageEvent.Insert.a aVar2 = PageEvent.Insert.b;
            int e3 = e();
            k kVar2 = this.k;
            return aVar2.b(L2, e3, new b(kVar2.c, kVar2.d, kVar2.e, kVar2, (k) null));
        } else if (ordinal2 == 2) {
            PageEvent.Insert.a aVar3 = PageEvent.Insert.b;
            int d3 = d();
            k kVar3 = this.k;
            return aVar3.a(L2, d3, new b(kVar3.c, kVar3.d, kVar3.e, kVar3, (k) null));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
