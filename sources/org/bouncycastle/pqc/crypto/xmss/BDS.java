package org.bouncycastle.pqc.crypto.xmss;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.TreeMap;
import s0.a.a.n;
import s0.a.e.b.b0.c.h3;
import s0.a.f.b.h.d;
import s0.a.f.b.h.f;
import s0.a.f.b.h.g;
import s0.a.f.b.h.h;
import s0.a.f.b.h.j;
import s0.a.f.b.h.k;

public final class BDS implements Serializable {
    public List<XMSSNode> Y1;
    public Map<Integer, LinkedList<XMSSNode>> Z1;
    public Stack<XMSSNode> a2;
    public Map<Integer, XMSSNode> b2;
    public transient h c;
    public int c2;
    public final int d;
    public boolean d2;
    public transient int e2;
    public final List<BDSTreeHash> q;
    public int x;
    public XMSSNode y;

    public BDS(BDS bds) {
        this.c = new h(bds.c.a);
        this.d = bds.d;
        this.x = bds.x;
        this.y = bds.y;
        ArrayList arrayList = new ArrayList();
        this.Y1 = arrayList;
        arrayList.addAll(bds.Y1);
        this.Z1 = new TreeMap();
        for (Integer next : bds.Z1.keySet()) {
            this.Z1.put(next, (LinkedList) bds.Z1.get(next).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.a2 = stack;
        stack.addAll(bds.a2);
        this.q = new ArrayList();
        for (BDSTreeHash b : bds.q) {
            this.q.add(b.clone());
        }
        this.b2 = new TreeMap(bds.b2);
        this.c2 = bds.c2;
        this.e2 = bds.e2;
        this.d2 = bds.d2;
    }

    public BDS(h hVar, int i, int i2, int i3) {
        this.c = hVar;
        this.d = i;
        this.e2 = i3;
        this.x = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.Y1 = new ArrayList();
                this.Z1 = new TreeMap();
                this.a2 = new Stack<>();
                this.q = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.q.add(new BDSTreeHash(i5));
                }
                this.b2 = new TreeMap();
                this.c2 = 0;
                this.d2 = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public final void a(byte[] bArr, byte[] bArr2, g gVar) {
        int i;
        int i2;
        Objects.requireNonNull(gVar, "otsHashAddress == null");
        f fVar = (f) ((f.b) ((f.b) new f.b().c(gVar.a)).d(gVar.b)).e();
        d dVar = (d) ((d.b) ((d.b) new d.b().c(gVar.a)).d(gVar.b)).e();
        for (int i3 = 0; i3 < (1 << this.d); i3++) {
            g.b bVar = (g.b) ((g.b) new g.b().c(gVar.a)).d(gVar.b);
            bVar.e = i3;
            bVar.f = gVar.f;
            bVar.g = gVar.g;
            gVar = (g) ((g.b) bVar.b(gVar.d)).e();
            h hVar = this.c;
            hVar.d(hVar.c(bArr2, gVar), bArr);
            k b = this.c.b(gVar);
            f.b bVar2 = (f.b) ((f.b) new f.b().c(fVar.a)).d(fVar.b);
            bVar2.e = i3;
            bVar2.f = fVar.f;
            bVar2.g = fVar.g;
            fVar = (f) ((f.b) bVar2.b(fVar.d)).e();
            XMSSNode e22 = h3.e2(this.c, b, fVar);
            d.b bVar3 = (d.b) ((d.b) new d.b().c(dVar.a)).d(dVar.b);
            bVar3.f = i3;
            dVar = (d) ((d.b) bVar3.b(dVar.d)).e();
            while (!this.a2.isEmpty() && this.a2.peek().c == (i = e22.c)) {
                int i4 = i3 / (1 << i);
                if (i4 == 1) {
                    this.Y1.add(e22);
                }
                if (i4 == 3 && (i2 = e22.c) < this.d - this.x) {
                    BDSTreeHash bDSTreeHash = this.q.get(i2);
                    bDSTreeHash.c = e22;
                    int i5 = e22.c;
                    bDSTreeHash.q = i5;
                    if (i5 == bDSTreeHash.d) {
                        bDSTreeHash.Y1 = true;
                    }
                }
                if (i4 >= 3 && (i4 & 1) == 1) {
                    int i6 = e22.c;
                    int i7 = this.d;
                    if (i6 >= i7 - this.x && i6 <= i7 - 2) {
                        if (this.Z1.get(Integer.valueOf(i6)) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(e22);
                            this.Z1.put(Integer.valueOf(e22.c), linkedList);
                        } else {
                            this.Z1.get(Integer.valueOf(e22.c)).add(e22);
                        }
                    }
                }
                d.b bVar4 = (d.b) ((d.b) new d.b().c(dVar.a)).d(dVar.b);
                bVar4.e = dVar.e;
                bVar4.f = (dVar.f - 1) / 2;
                d dVar2 = (d) ((d.b) bVar4.b(dVar.d)).e();
                XMSSNode G2 = h3.G2(this.c, this.a2.pop(), e22, dVar2);
                XMSSNode xMSSNode = new XMSSNode(G2.c + 1, G2.a());
                d.b bVar5 = (d.b) ((d.b) new d.b().c(dVar2.a)).d(dVar2.b);
                bVar5.e = dVar2.e + 1;
                bVar5.f = dVar2.f;
                dVar = (d) ((d.b) bVar5.b(dVar2.d)).e();
                e22 = xMSSNode;
            }
            this.a2.push(e22);
        }
        this.y = this.a2.pop();
    }

    public final void b(byte[] bArr, byte[] bArr2, g gVar) {
        Object obj;
        List<XMSSNode> list;
        Objects.requireNonNull(gVar, "otsHashAddress == null");
        if (!this.d2) {
            int i = this.c2;
            if (i <= this.e2 - 1) {
                int i2 = this.d;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = 0;
                        break;
                    } else if (((i >> i3) & 1) == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (((this.c2 >> (i3 + 1)) & 1) == 0 && i3 < this.d - 1) {
                    this.b2.put(Integer.valueOf(i3), this.Y1.get(i3));
                }
                f fVar = (f) ((f.b) ((f.b) new f.b().c(gVar.a)).d(gVar.b)).e();
                d dVar = (d) ((d.b) ((d.b) new d.b().c(gVar.a)).d(gVar.b)).e();
                if (i3 == 0) {
                    g.b bVar = (g.b) ((g.b) new g.b().c(gVar.a)).d(gVar.b);
                    bVar.e = this.c2;
                    bVar.f = gVar.f;
                    bVar.g = gVar.g;
                    gVar = (g) ((g.b) bVar.b(gVar.d)).e();
                    h hVar = this.c;
                    hVar.d(hVar.c(bArr2, gVar), bArr);
                    k b = this.c.b(gVar);
                    f.b bVar2 = (f.b) ((f.b) new f.b().c(fVar.a)).d(fVar.b);
                    bVar2.e = this.c2;
                    bVar2.f = fVar.f;
                    bVar2.g = fVar.g;
                    this.Y1.set(0, h3.e2(this.c, b, (f) ((f.b) bVar2.b(fVar.d)).e()));
                } else {
                    d.b bVar3 = (d.b) ((d.b) new d.b().c(dVar.a)).d(dVar.b);
                    int i4 = i3 - 1;
                    bVar3.e = i4;
                    bVar3.f = this.c2 >> i3;
                    h hVar2 = this.c;
                    hVar2.d(hVar2.c(bArr2, gVar), bArr);
                    XMSSNode G2 = h3.G2(this.c, this.Y1.get(i4), this.b2.get(Integer.valueOf(i4)), (d) ((d.b) bVar3.b(dVar.d)).e());
                    this.Y1.set(i3, new XMSSNode(G2.c + 1, G2.a()));
                    this.b2.remove(Integer.valueOf(i4));
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (i5 < this.d - this.x) {
                            list = this.Y1;
                            obj = this.q.get(i5).c;
                        } else {
                            list = this.Y1;
                            obj = this.Z1.get(Integer.valueOf(i5)).removeFirst();
                        }
                        list.set(i5, obj);
                    }
                    int min = Math.min(i3, this.d - this.x);
                    for (int i6 = 0; i6 < min; i6++) {
                        int i7 = ((1 << i6) * 3) + this.c2 + 1;
                        if (i7 < (1 << this.d)) {
                            BDSTreeHash bDSTreeHash = this.q.get(i6);
                            bDSTreeHash.c = null;
                            bDSTreeHash.q = bDSTreeHash.d;
                            bDSTreeHash.x = i7;
                            bDSTreeHash.y = true;
                            bDSTreeHash.Y1 = false;
                        }
                    }
                }
                for (int i8 = 0; i8 < ((this.d - this.x) >> 1); i8++) {
                    BDSTreeHash bDSTreeHash2 = null;
                    for (BDSTreeHash next : this.q) {
                        if (!next.Y1 && next.y) {
                            if (bDSTreeHash2 == null || next.c() < bDSTreeHash2.c() || (next.c() == bDSTreeHash2.c() && next.x < bDSTreeHash2.x)) {
                                bDSTreeHash2 = next;
                            }
                        }
                    }
                    if (bDSTreeHash2 != null) {
                        Stack<XMSSNode> stack = this.a2;
                        h hVar3 = this.c;
                        if (bDSTreeHash2.Y1 || !bDSTreeHash2.y) {
                            throw new IllegalStateException("finished or not initialized");
                        }
                        g.b bVar4 = (g.b) ((g.b) new g.b().c(gVar.a)).d(gVar.b);
                        bVar4.e = bDSTreeHash2.x;
                        bVar4.f = gVar.f;
                        bVar4.g = gVar.g;
                        g gVar2 = (g) ((g.b) bVar4.b(gVar.d)).e();
                        f.b bVar5 = (f.b) ((f.b) new f.b().c(gVar2.a)).d(gVar2.b);
                        bVar5.e = bDSTreeHash2.x;
                        d.b bVar6 = (d.b) ((d.b) new d.b().c(gVar2.a)).d(gVar2.b);
                        bVar6.f = bDSTreeHash2.x;
                        d dVar2 = (d) bVar6.e();
                        hVar3.d(hVar3.c(bArr2, gVar2), bArr);
                        XMSSNode e22 = h3.e2(hVar3, hVar3.b(gVar2), (f) bVar5.e());
                        while (!stack.isEmpty() && stack.peek().c == e22.c && stack.peek().c != bDSTreeHash2.d) {
                            d.b bVar7 = (d.b) ((d.b) new d.b().c(dVar2.a)).d(dVar2.b);
                            bVar7.e = dVar2.e;
                            bVar7.f = (dVar2.f - 1) / 2;
                            d dVar3 = (d) ((d.b) bVar7.b(dVar2.d)).e();
                            XMSSNode G22 = h3.G2(hVar3, stack.pop(), e22, dVar3);
                            XMSSNode xMSSNode = new XMSSNode(G22.c + 1, G22.a());
                            d.b bVar8 = (d.b) ((d.b) new d.b().c(dVar3.a)).d(dVar3.b);
                            bVar8.e = dVar3.e + 1;
                            bVar8.f = dVar3.f;
                            XMSSNode xMSSNode2 = xMSSNode;
                            dVar2 = (d) ((d.b) bVar8.b(dVar3.d)).e();
                            e22 = xMSSNode2;
                        }
                        XMSSNode xMSSNode3 = bDSTreeHash2.c;
                        if (xMSSNode3 == null) {
                            bDSTreeHash2.c = e22;
                        } else if (xMSSNode3.c == e22.c) {
                            d.b bVar9 = (d.b) ((d.b) new d.b().c(dVar2.a)).d(dVar2.b);
                            bVar9.e = dVar2.e;
                            bVar9.f = (dVar2.f - 1) / 2;
                            d dVar4 = (d) ((d.b) bVar9.b(dVar2.d)).e();
                            e22 = new XMSSNode(bDSTreeHash2.c.c + 1, h3.G2(hVar3, bDSTreeHash2.c, e22, dVar4).a());
                            bDSTreeHash2.c = e22;
                            d.b bVar10 = (d.b) ((d.b) new d.b().c(dVar4.a)).d(dVar4.b);
                            bVar10.e = dVar4.e + 1;
                            bVar10.f = dVar4.f;
                            ((d.b) bVar10.b(dVar4.d)).e();
                        } else {
                            stack.push(e22);
                        }
                        if (bDSTreeHash2.c.c == bDSTreeHash2.d) {
                            bDSTreeHash2.Y1 = true;
                        } else {
                            bDSTreeHash2.q = e22.c;
                            bDSTreeHash2.x++;
                        }
                    }
                }
                this.c2++;
                return;
            }
            throw new IllegalStateException("index out of bounds");
        }
        throw new IllegalStateException("index already used");
    }

    public BDS(BDS bds, n nVar) {
        this.c = new h(new j(nVar));
        this.d = bds.d;
        this.x = bds.x;
        this.y = bds.y;
        ArrayList arrayList = new ArrayList();
        this.Y1 = arrayList;
        arrayList.addAll(bds.Y1);
        this.Z1 = new TreeMap();
        for (Integer next : bds.Z1.keySet()) {
            this.Z1.put(next, (LinkedList) bds.Z1.get(next).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.a2 = stack;
        stack.addAll(bds.a2);
        this.q = new ArrayList();
        for (BDSTreeHash b : bds.q) {
            this.q.add(b.clone());
        }
        this.b2 = new TreeMap(bds.b2);
        int i = bds.c2;
        this.c2 = i;
        this.e2 = bds.e2;
        this.d2 = bds.d2;
        if (this.Y1 == null) {
            throw new IllegalStateException("authenticationPath == null");
        } else if (this.Z1 == null) {
            throw new IllegalStateException("retain == null");
        } else if (this.a2 == null) {
            throw new IllegalStateException("stack == null");
        } else if (this.q == null) {
            throw new IllegalStateException("treeHashInstances == null");
        } else if (!h3.G1(this.d, (long) i)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    public BDS(BDS bds, byte[] bArr, byte[] bArr2, g gVar) {
        this.c = new h(bds.c.a);
        this.d = bds.d;
        this.x = bds.x;
        this.y = bds.y;
        ArrayList arrayList = new ArrayList();
        this.Y1 = arrayList;
        arrayList.addAll(bds.Y1);
        this.Z1 = new TreeMap();
        for (Integer next : bds.Z1.keySet()) {
            this.Z1.put(next, (LinkedList) bds.Z1.get(next).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.a2 = stack;
        stack.addAll(bds.a2);
        this.q = new ArrayList();
        for (BDSTreeHash b : bds.q) {
            this.q.add(b.clone());
        }
        this.b2 = new TreeMap(bds.b2);
        this.c2 = bds.c2;
        this.e2 = bds.e2;
        this.d2 = false;
        b(bArr, bArr2, gVar);
    }
}
