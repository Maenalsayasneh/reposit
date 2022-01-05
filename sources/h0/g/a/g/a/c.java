package h0.g.a.g.a;

import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: Easing */
public class c {
    public static c a = new c();
    public static String[] b = {"standard", "accelerate", "decelerate", "linear"};
    public String c = "identity";

    /* compiled from: Easing */
    public static class a extends c {
        public double d;
        public double e;
        public double f;
        public double g;

        public a(String str) {
            this.c = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.e = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        public double a(double d2) {
            if (d2 <= 0.0d) {
                return 0.0d;
            }
            if (d2 >= 1.0d) {
                return 1.0d;
            }
            double d3 = 0.5d;
            double d4 = 0.5d;
            while (d3 > 0.01d) {
                d3 *= 0.5d;
                d4 = d(d4) < d2 ? d4 + d3 : d4 - d3;
            }
            double d5 = d4 - d3;
            double d6 = d(d5);
            double d7 = d4 + d3;
            double d8 = d(d7);
            double e2 = e(d5);
            return (((d2 - d6) * (e(d7) - e2)) / (d8 - d6)) + e2;
        }

        public double b(double d2) {
            double d3 = 0.5d;
            double d4 = 0.5d;
            while (d3 > 1.0E-4d) {
                d3 *= 0.5d;
                d4 = d(d4) < d2 ? d4 + d3 : d4 - d3;
            }
            double d5 = d4 - d3;
            double d6 = d4 + d3;
            return (e(d6) - e(d5)) / (d(d6) - d(d5));
        }

        public final double d(double d2) {
            double d3 = 1.0d - d2;
            double d4 = 3.0d * d3;
            double d5 = d3 * d4 * d2;
            double d6 = d4 * d2 * d2;
            return (this.f * d6) + (this.d * d5) + (d2 * d2 * d2);
        }

        public final double e(double d2) {
            double d3 = 1.0d - d2;
            double d4 = 3.0d * d3;
            double d5 = d3 * d4 * d2;
            double d6 = d4 * d2 * d2;
            return (this.g * d6) + (this.e * d5) + (d2 * d2 * d2);
        }
    }

    public static c c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new l(str);
        }
        if (str.startsWith("Schlick")) {
            return new i(str);
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new a("cubic(1, 1, 0, 0)");
            case 3:
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                PrintStream printStream = System.err;
                StringBuilder P0 = i0.d.a.a.a.P0("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                P0.append(Arrays.toString(b));
                printStream.println(P0.toString());
                return a;
        }
    }

    public double a(double d) {
        return d;
    }

    public double b(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.c;
    }
}
