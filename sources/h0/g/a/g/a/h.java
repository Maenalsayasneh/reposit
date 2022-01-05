package h0.g.a.g.a;

import i0.d.a.a.a;
import java.util.Arrays;

/* compiled from: Oscillator */
public class h {
    public float[] a = new float[0];
    public double[] b = new double[0];
    public double[] c;
    public String d;
    public g e;
    public int f;

    public void a(double d2, float f2) {
        int length = this.a.length + 1;
        int binarySearch = Arrays.binarySearch(this.b, d2);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.b = Arrays.copyOf(this.b, length);
        this.a = Arrays.copyOf(this.a, length);
        this.c = new double[length];
        double[] dArr = this.b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.b[binarySearch] = d2;
        this.a[binarySearch] = f2;
    }

    public String toString() {
        StringBuilder P0 = a.P0("pos =");
        P0.append(Arrays.toString(this.b));
        P0.append(" period=");
        P0.append(Arrays.toString(this.a));
        return P0.toString();
    }
}
