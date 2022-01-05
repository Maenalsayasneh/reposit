package h0.w;

import h0.y.a.d;
import h0.y.a.e;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery */
public class g implements e, d {
    public static final TreeMap<Integer, g> c = new TreeMap<>();
    public final byte[][] Y1;
    public final int[] Z1;
    public final int a2;
    public int b2;
    public volatile String d;
    public final long[] q;
    public final double[] x;
    public final String[] y;

    public g(int i) {
        this.a2 = i;
        int i2 = i + 1;
        this.Z1 = new int[i2];
        this.q = new long[i2];
        this.x = new double[i2];
        this.y = new String[i2];
        this.Y1 = new byte[i2][];
    }

    public static g e(String str, int i) {
        TreeMap<Integer, g> treeMap = c;
        synchronized (treeMap) {
            Map.Entry<Integer, g> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                g value = ceilingEntry.getValue();
                value.d = str;
                value.b2 = i;
                return value;
            }
            g gVar = new g(i);
            gVar.d = str;
            gVar.b2 = i;
            return gVar;
        }
    }

    public String a() {
        return this.d;
    }

    public void b(d dVar) {
        for (int i = 1; i <= this.b2; i++) {
            int i2 = this.Z1[i];
            if (i2 == 1) {
                ((h0.y.a.f.e) dVar).c.bindNull(i);
            } else if (i2 == 2) {
                ((h0.y.a.f.e) dVar).c.bindLong(i, this.q[i]);
            } else if (i2 == 3) {
                ((h0.y.a.f.e) dVar).c.bindDouble(i, this.x[i]);
            } else if (i2 == 4) {
                ((h0.y.a.f.e) dVar).c.bindString(i, this.y[i]);
            } else if (i2 == 5) {
                ((h0.y.a.f.e) dVar).c.bindBlob(i, this.Y1[i]);
            }
        }
    }

    public void close() {
    }

    public void f(int i, long j) {
        this.Z1[i] = 2;
        this.q[i] = j;
    }

    public void i(int i) {
        this.Z1[i] = 1;
    }

    public void k(int i, String str) {
        this.Z1[i] = 4;
        this.y[i] = str;
    }

    public void l() {
        TreeMap<Integer, g> treeMap = c;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a2), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
