package h0.m.a;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import h0.a0.a.a.b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MetadataRepo */
public final class f {
    public final b a;
    public final char[] b;
    public final a c = new a(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE);
    public final Typeface d;

    public f(Typeface typeface, b bVar) {
        this.d = typeface;
        this.a = bVar;
        this.b = new char[(bVar.b() * 2)];
        int b2 = bVar.b();
        for (int i = 0; i < b2; i++) {
            b bVar2 = new b(this, i);
            Character.toChars(bVar2.d(), this.b, i * 2);
            g0.a.b.b.a.m(bVar2, "emoji metadata cannot be null");
            g0.a.b.b.a.j(bVar2.b() > 0, "invalid metadata codepoint length");
            this.c.a(bVar2, 0, bVar2.b() - 1);
        }
    }

    public static f a(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        long j;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        short s = duplicate.getShort() & 65535;
        if (s <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i = 0;
            while (true) {
                if (i >= s) {
                    j = -1;
                    break;
                }
                int i2 = duplicate.getInt();
                duplicate.position(duplicate.position() + 4);
                j = ((long) duplicate.getInt()) & 4294967295L;
                duplicate.position(duplicate.position() + 4);
                if (1835365473 == i2) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                duplicate.position(duplicate.position() + ((int) (j - ((long) duplicate.position()))));
                duplicate.position(duplicate.position() + 12);
                long j2 = ((long) duplicate.getInt()) & 4294967295L;
                for (int i3 = 0; ((long) i3) < j2; i3++) {
                    int i4 = duplicate.getInt();
                    long j3 = ((long) duplicate.getInt()) & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i4 || 1701669481 == i4) {
                        duplicate.position((int) (j3 + j));
                        b bVar = new b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.a = duplicate.position() + duplicate.getInt(duplicate.position());
                        bVar.b = duplicate;
                        return new f(typeface, bVar);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* compiled from: MetadataRepo */
    public static class a {
        public final SparseArray<a> a;
        public b b;

        public a() {
            this.a = new SparseArray<>(1);
        }

        public void a(b bVar, int i, int i2) {
            int a2 = bVar.a(i);
            SparseArray<a> sparseArray = this.a;
            a aVar = sparseArray == null ? null : sparseArray.get(a2);
            if (aVar == null) {
                aVar = new a();
                this.a.put(bVar.a(i), aVar);
            }
            if (i2 > i) {
                aVar.a(bVar, i + 1, i2);
            } else {
                aVar.b = bVar;
            }
        }

        public a(int i) {
            this.a = new SparseArray<>(i);
        }
    }
}
