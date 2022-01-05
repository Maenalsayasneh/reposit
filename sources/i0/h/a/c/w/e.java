package i0.h.a.c.w;

/* compiled from: CutCornerTreatment */
public class e extends d {
    public void a(n nVar, float f, float f2, float f3) {
        nVar.e(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = (double) f3;
        double d2 = (double) f2;
        nVar.d((float) (Math.sin(Math.toRadians((double) f)) * d * d2), (float) (Math.sin(Math.toRadians((double) (90.0f - f))) * d * d2));
    }
}
