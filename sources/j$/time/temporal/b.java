package j$.time.temporal;

public final /* synthetic */ class b implements m {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    public final Temporal e(Temporal temporal) {
        int i = this.a;
        int j = temporal.j(j.DAY_OF_WEEK);
        if (j == i) {
            return temporal;
        }
        int i2 = j - i;
        return temporal.a((long) (i2 >= 0 ? 7 - i2 : -i2), ChronoUnit.DAYS);
    }
}
