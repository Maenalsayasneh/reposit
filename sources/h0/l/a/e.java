package h0.l.a;

import h0.l.a.b;

/* compiled from: SpringForce */
public final class e {
    public double a = Math.sqrt(1500.0d);
    public double b = 0.5d;
    public boolean c = false;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i = Double.MAX_VALUE;
    public final b.h j = new b.h();

    public e() {
    }

    public e a(float f2) {
        if (f2 >= 0.0f) {
            this.b = (double) f2;
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public e b(float f2) {
        if (f2 > 0.0f) {
            this.a = Math.sqrt((double) f2);
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public b.h c(double d2, double d3, long j2) {
        double d4;
        double d5;
        if (!this.c) {
            if (this.i != Double.MAX_VALUE) {
                double d6 = this.b;
                if (d6 > 1.0d) {
                    double d7 = this.a;
                    this.f = (Math.sqrt((d6 * d6) - 1.0d) * d7) + ((-d6) * d7);
                    double d8 = this.b;
                    double d9 = this.a;
                    this.g = ((-d8) * d9) - (Math.sqrt((d8 * d8) - 1.0d) * d9);
                } else if (d6 >= 0.0d && d6 < 1.0d) {
                    this.h = Math.sqrt(1.0d - (d6 * d6)) * this.a;
                }
                this.c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d10 = ((double) j2) / 1000.0d;
        double d11 = d2 - this.i;
        double d12 = this.b;
        if (d12 > 1.0d) {
            double d13 = this.g;
            double d14 = this.f;
            double d15 = d11 - (((d13 * d11) - d3) / (d13 - d14));
            double d16 = ((d11 * d13) - d3) / (d13 - d14);
            d4 = (Math.pow(2.718281828459045d, this.f * d10) * d16) + (Math.pow(2.718281828459045d, d13 * d10) * d15);
            double d17 = this.g;
            double pow = Math.pow(2.718281828459045d, d17 * d10) * d15 * d17;
            double d18 = this.f;
            d5 = (Math.pow(2.718281828459045d, d18 * d10) * d16 * d18) + pow;
        } else if (d12 == 1.0d) {
            double d19 = this.a;
            double d20 = (d19 * d11) + d3;
            double d21 = (d20 * d10) + d11;
            double pow2 = Math.pow(2.718281828459045d, (-d19) * d10) * d21;
            double pow3 = Math.pow(2.718281828459045d, (-this.a) * d10) * d21;
            double d22 = this.a;
            d5 = (Math.pow(2.718281828459045d, (-d22) * d10) * d20) + (pow3 * (-d22));
            d4 = pow2;
        } else {
            double d23 = 1.0d / this.h;
            double d24 = this.a;
            double d25 = ((d12 * d24 * d11) + d3) * d23;
            double sin = ((Math.sin(this.h * d10) * d25) + (Math.cos(this.h * d10) * d11)) * Math.pow(2.718281828459045d, (-d12) * d24 * d10);
            double d26 = this.a;
            double d27 = this.b;
            double d28 = (-d26) * sin * d27;
            double pow4 = Math.pow(2.718281828459045d, (-d27) * d26 * d10);
            double d29 = this.h;
            double d30 = sin;
            double d31 = (-d29) * d11;
            double d32 = this.h;
            d5 = (((Math.cos(d32 * d10) * d25 * d32) + (Math.sin(d29 * d10) * d31)) * pow4) + d28;
            d4 = d30;
        }
        b.h hVar = this.j;
        hVar.a = (float) (d4 + this.i);
        hVar.b = (float) d5;
        return hVar;
    }

    public e(float f2) {
        this.i = (double) f2;
    }
}
