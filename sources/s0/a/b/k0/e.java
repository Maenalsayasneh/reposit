package s0.a.b.k0;

public class e extends b {
    public h d;

    public e(boolean z, h hVar) {
        super(z);
        this.d = hVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        h hVar = this.d;
        if (hVar == null) {
            return eVar.d == null;
        }
        return hVar.equals(eVar.d);
    }

    public int hashCode() {
        boolean z = !this.c;
        h hVar = this.d;
        return hVar != null ? z ^ hVar.hashCode() ? 1 : 0 : z ? 1 : 0;
    }
}
