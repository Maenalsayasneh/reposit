package i0.o.a;

import i0.d.a.a.a;
import java.io.PrintWriter;

/* compiled from: StatsSnapshot */
public class y {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;
    public final long n;

    public y(int i2, int i3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i4, int i5, int i6, long j10) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = j8;
        this.j = j9;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = j10;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.b) / ((float) this.a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        StringBuilder P0 = a.P0("StatsSnapshot{maxSize=");
        P0.append(this.a);
        P0.append(", size=");
        P0.append(this.b);
        P0.append(", cacheHits=");
        P0.append(this.c);
        P0.append(", cacheMisses=");
        P0.append(this.d);
        P0.append(", downloadCount=");
        P0.append(this.k);
        P0.append(", totalDownloadSize=");
        P0.append(this.e);
        P0.append(", averageDownloadSize=");
        P0.append(this.h);
        P0.append(", totalOriginalBitmapSize=");
        P0.append(this.f);
        P0.append(", totalTransformedBitmapSize=");
        P0.append(this.g);
        P0.append(", averageOriginalBitmapSize=");
        P0.append(this.i);
        P0.append(", averageTransformedBitmapSize=");
        P0.append(this.j);
        P0.append(", originalBitmapCount=");
        P0.append(this.l);
        P0.append(", transformedBitmapCount=");
        P0.append(this.m);
        P0.append(", timeStamp=");
        P0.append(this.n);
        P0.append('}');
        return P0.toString();
    }
}
