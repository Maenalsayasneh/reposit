package org.bouncycastle.pqc.crypto.xmss;

import java.io.Serializable;

public class BDSTreeHash implements Serializable, Cloneable {
    public boolean Y1 = false;
    public XMSSNode c;
    public final int d;
    public int q;
    public int x;
    public boolean y = false;

    public BDSTreeHash(int i) {
        this.d = i;
    }

    /* renamed from: b */
    public BDSTreeHash clone() {
        BDSTreeHash bDSTreeHash = new BDSTreeHash(this.d);
        bDSTreeHash.c = this.c;
        bDSTreeHash.q = this.q;
        bDSTreeHash.x = this.x;
        bDSTreeHash.y = this.y;
        bDSTreeHash.Y1 = this.Y1;
        return bDSTreeHash;
    }

    public int c() {
        if (!this.y || this.Y1) {
            return Integer.MAX_VALUE;
        }
        return this.q;
    }
}
