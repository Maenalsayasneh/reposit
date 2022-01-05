package h0.g.a.g.a;

/* compiled from: SpringStopEngine */
public class k implements m {
    public double a = 0.5d;
    public double b;
    public double c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i = 0;

    public boolean a() {
        double d2 = ((double) this.e) - this.c;
        double d3 = this.b;
        double d4 = (double) this.f;
        return Math.sqrt((((d3 * d2) * d2) + ((d4 * d4) * ((double) this.g))) / d3) <= ((double) this.h);
    }

    public float b() {
        return 0.0f;
    }

    public float getInterpolation(float f2) {
        k kVar = this;
        double d2 = (double) (f2 - kVar.d);
        double d3 = kVar.b;
        double d4 = kVar.a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d3 / ((double) kVar.g)) * d2) * 4.0d)) + 1.0d);
        double d5 = d2 / ((double) sqrt);
        int i2 = 0;
        while (i2 < sqrt) {
            double d6 = (double) kVar.e;
            double d7 = kVar.c;
            int i3 = sqrt;
            int i4 = i2;
            double d8 = (double) kVar.f;
            double d9 = (double) kVar.g;
            double d10 = ((((((-d3) * (d6 - d7)) - (d8 * d4)) / d9) * d5) / 2.0d) + d8;
            double d11 = ((((-((((d5 * d10) / 2.0d) + d6) - d7)) * d3) - (d10 * d4)) / d9) * d5;
            float f3 = (float) (d8 + d11);
            this.f = f3;
            float f4 = (float) ((((d11 / 2.0d) + d8) * d5) + d6);
            this.e = f4;
            int i5 = this.i;
            if (i5 > 0) {
                if (f4 < 0.0f && (i5 & 1) == 1) {
                    this.e = -f4;
                    this.f = -f3;
                }
                float f5 = this.e;
                if (f5 > 1.0f && (i5 & 2) == 2) {
                    this.e = 2.0f - f5;
                    this.f = -this.f;
                }
            }
            float f6 = f2;
            sqrt = i3;
            i2 = i4 + 1;
            kVar = this;
        }
        k kVar2 = kVar;
        kVar2.d = f2;
        return kVar2.e;
    }
}
