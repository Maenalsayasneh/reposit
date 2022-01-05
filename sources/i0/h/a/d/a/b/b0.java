package i0.h.a.d.a.b;

import com.google.android.play.core.assetpacks.bv;
import i0.h.a.d.a.e.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class b0 extends r {
    public final File c;
    public final File d;
    public final NavigableMap<Long, File> q = new TreeMap();

    public b0(File file, File file2) throws IOException {
        this.c = file;
        this.d = file2;
        ArrayList arrayList = (ArrayList) i2.a(file, file2);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            long j = 0;
            while (it.hasNext()) {
                File file3 = (File) it.next();
                this.q.put(Long.valueOf(j), file3);
                j += file3.length();
            }
            return;
        }
        throw new bv(String.format("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    public final long a() {
        Map.Entry<Long, File> lastEntry = this.q.lastEntry();
        return lastEntry.getValue().length() + lastEntry.getKey().longValue();
    }

    public final InputStream b(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new bv(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 <= a()) {
            Long floorKey = this.q.floorKey(Long.valueOf(j));
            Long floorKey2 = this.q.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new a0(e(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(e(j, floorKey));
            Collection values = this.q.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new q1(Collections.enumeration(values)));
            }
            arrayList.add(new a0(new FileInputStream((File) this.q.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new bv(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(a()), Long.valueOf(j3)}));
    }

    public final void close() {
    }

    public final InputStream e(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.q.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new bv(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }
}
