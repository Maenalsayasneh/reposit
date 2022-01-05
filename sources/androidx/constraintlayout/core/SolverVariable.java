package androidx.constraintlayout.core;

import h0.g.a.b;
import h0.g.a.d;
import i0.d.a.a.a;
import java.util.Arrays;

public class SolverVariable implements Comparable<SolverVariable> {
    public static int c = 1;
    public float Y1;
    public boolean Z1 = false;
    public float[] a2 = new float[9];
    public float[] b2 = new float[9];
    public Type c2;
    public boolean d;
    public b[] d2 = new b[16];
    public int e2 = 0;
    public int f2 = 0;
    public int g2 = -1;
    public int q = -1;
    public int x = -1;
    public int y = 0;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.c2 = type;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.e2;
            if (i >= i2) {
                b[] bVarArr = this.d2;
                if (i2 >= bVarArr.length) {
                    this.d2 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.d2;
                int i3 = this.e2;
                bVarArr2[i3] = bVar;
                this.e2 = i3 + 1;
                return;
            } else if (this.d2[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i = this.e2;
        int i2 = 0;
        while (i2 < i) {
            if (this.d2[i2] == bVar) {
                while (i2 < i - 1) {
                    b[] bVarArr = this.d2;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.e2--;
                return;
            }
            i2++;
        }
    }

    public int compareTo(Object obj) {
        return this.q - ((SolverVariable) obj).q;
    }

    public void e() {
        this.c2 = Type.UNKNOWN;
        this.y = 0;
        this.q = -1;
        this.x = -1;
        this.Y1 = 0.0f;
        this.Z1 = false;
        this.g2 = -1;
        int i = this.e2;
        for (int i2 = 0; i2 < i; i2++) {
            this.d2[i2] = null;
        }
        this.e2 = 0;
        this.f2 = 0;
        this.d = false;
        Arrays.fill(this.b2, 0.0f);
    }

    public void f(d dVar, float f) {
        this.Y1 = f;
        this.Z1 = true;
        this.g2 = -1;
        int i = this.e2;
        this.x = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.d2[i2].k(dVar, this, false);
        }
        this.e2 = 0;
    }

    public final void g(d dVar, b bVar) {
        int i = this.e2;
        for (int i2 = 0; i2 < i; i2++) {
            this.d2[i2].l(dVar, bVar, false);
        }
        this.e2 = 0;
    }

    public String toString() {
        StringBuilder P0 = a.P0("");
        P0.append(this.q);
        return P0.toString();
    }
}
