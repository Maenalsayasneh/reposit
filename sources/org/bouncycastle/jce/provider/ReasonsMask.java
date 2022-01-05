package org.bouncycastle.jce.provider;

import s0.a.a.c3.k0;

public class ReasonsMask {
    public static final ReasonsMask allReasons = new ReasonsMask(33023);
    private int _reasons;

    public ReasonsMask() {
        this(0);
    }

    private ReasonsMask(int i) {
        this._reasons = i;
    }

    public ReasonsMask(k0 k0Var) {
        int min = Math.min(4, k0Var.d.length - 1);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i |= (255 & k0Var.d[i2]) << (i2 * 8);
        }
        if (min >= 0 && min < 4) {
            i |= (((byte) ((255 << k0Var.q) & k0Var.d[min])) & 255) << (min * 8);
        }
        this._reasons = i;
    }

    public void addReasons(ReasonsMask reasonsMask) {
        this._reasons = reasonsMask.getReasons() | this._reasons;
    }

    public int getReasons() {
        return this._reasons;
    }

    public boolean hasNewReasons(ReasonsMask reasonsMask) {
        return ((reasonsMask.getReasons() ^ this._reasons) | this._reasons) != 0;
    }

    public ReasonsMask intersect(ReasonsMask reasonsMask) {
        ReasonsMask reasonsMask2 = new ReasonsMask();
        reasonsMask2.addReasons(new ReasonsMask(reasonsMask.getReasons() & this._reasons));
        return reasonsMask2;
    }

    public boolean isAllReasons() {
        return this._reasons == allReasons._reasons;
    }
}
