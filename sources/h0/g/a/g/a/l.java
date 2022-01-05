package h0.g.a.g.a;

import i0.d.a.a.a;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: StepCurve */
public class l extends c {
    public g d;

    public l(String str) {
        String str2 = str;
        this.c = str2;
        double[] dArr = new double[(str.length() / 2)];
        int indexOf = str2.indexOf(40) + 1;
        int indexOf2 = str2.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str2.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str2.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str2.substring(indexOf, str2.indexOf(41, indexOf)).trim());
        double[] copyOf = Arrays.copyOf(dArr, i + 1);
        int length = (copyOf.length * 3) - 2;
        int length2 = copyOf.length - 1;
        double d2 = 1.0d / ((double) length2);
        int[] iArr = new int[2];
        iArr[1] = 1;
        iArr[0] = length;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
        double[] dArr3 = new double[length];
        for (int i2 = 0; i2 < copyOf.length; i2++) {
            double d3 = copyOf[i2];
            int i3 = i2 + length2;
            dArr2[i3][0] = d3;
            double d4 = ((double) i2) * d2;
            dArr3[i3] = d4;
            if (i2 > 0) {
                int i4 = (length2 * 2) + i2;
                dArr2[i4][0] = d3 + 1.0d;
                dArr3[i4] = d4 + 1.0d;
                int i5 = i2 - 1;
                dArr2[i5][0] = (d3 - 1.0d) - d2;
                dArr3[i5] = (d4 - 4.0d) - d2;
            }
        }
        g gVar = new g(dArr3, dArr2);
        PrintStream printStream = System.out;
        StringBuilder P0 = a.P0(" 0 ");
        P0.append(gVar.b(0.0d, 0));
        printStream.println(P0.toString());
        PrintStream printStream2 = System.out;
        StringBuilder P02 = a.P0(" 1 ");
        P02.append(gVar.b(1.0d, 0));
        printStream2.println(P02.toString());
        this.d = gVar;
    }

    public double a(double d2) {
        return this.d.b(d2, 0);
    }

    public double b(double d2) {
        return this.d.h(d2, 0);
    }
}
