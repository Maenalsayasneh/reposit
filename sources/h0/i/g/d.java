package h0.i.g;

/* compiled from: TextDirectionHeuristicsCompat */
public final class d {
    public static final c a = new C0044d((b) null, false);
    public static final c b = new C0044d((b) null, true);
    public static final c c;
    public static final c d;

    /* compiled from: TextDirectionHeuristicsCompat */
    public static class a implements b {
        public static final a a = new a();

        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i));
                c cVar = d.a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i4 = 2;
                                break;
                        }
                    }
                    i4 = 0;
                    i++;
                }
                i4 = 1;
                i++;
            }
            return i4;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    public interface b {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    public static abstract class c implements c {
        public final b a;

        public c(b bVar) {
            this.a = bVar;
        }

        public abstract boolean a();

        public boolean b(CharSequence charSequence, int i, int i2) {
            if (i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            b bVar = this.a;
            if (bVar == null) {
                return a();
            }
            int a2 = bVar.a(charSequence, i, i2);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return a();
            }
            return false;
        }
    }

    /* renamed from: h0.i.g.d$d  reason: collision with other inner class name */
    /* compiled from: TextDirectionHeuristicsCompat */
    public static class C0044d extends c {
        public final boolean b;

        public C0044d(b bVar, boolean z) {
            super(bVar);
            this.b = z;
        }

        public boolean a() {
            return this.b;
        }
    }

    static {
        a aVar = a.a;
        c = new C0044d(aVar, false);
        d = new C0044d(aVar, true);
    }
}
