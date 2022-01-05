package i0.h.a.d.a.b;

import com.google.android.play.core.assetpacks.bv;
import i0.h.a.d.a.e.f;
import i0.h.a.d.a.e.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;
import java.util.Properties;

public final class g2 {
    public static final f a = new f("SliceMetadataManager");
    public final byte[] b = new byte[8192];
    public final y c;
    public final String d;
    public final int e;
    public final long f;
    public final String g;
    public int h;

    public g2(y yVar, String str, int i, long j, String str2) {
        this.c = yVar;
        this.d = str;
        this.e = i;
        this.f = j;
        this.g = str2;
        this.h = -1;
    }

    public final void a(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            z.a.a(th, th);
        }
        throw th;
    }

    public final void b(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            y yVar = this.c;
            String str = this.d;
            int i2 = this.e;
            long j = this.f;
            String str2 = this.g;
            Objects.requireNonNull(yVar);
            File file = new File(yVar.p(str, i2, j, str2), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable th) {
                z.a.a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            z.a.a(th, th2);
        }
    }

    public final void c(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(i().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            z.a.a(th, th);
        }
        throw th;
    }

    public final void d(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            z.a.a(th, th);
        }
        throw th;
    }

    public final f2 e() throws IOException {
        File o = this.c.o(this.d, this.e, this.f, this.g);
        if (o.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(o);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new bv("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new f2(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e2) {
                    throw new bv("Slice checkpoint file corrupt.", (Exception) e2);
                }
            } catch (Throwable th) {
                z.a.a(th, th);
            }
        } else {
            throw new bv("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    public final void f(byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream;
        this.h++;
        try {
            fileOutputStream = new FileOutputStream(new File(l(), String.format("%s-LFH.dat", new Object[]{Integer.valueOf(this.h)})));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (IOException e2) {
            throw new bv("Could not write metadata file.", (Exception) e2);
        } catch (Throwable th) {
            z.a.a(th, th);
        }
        throw th;
    }

    public final void g(byte[] bArr, InputStream inputStream) throws IOException {
        this.h++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.b);
            while (read > 0) {
                fileOutputStream.write(this.b, 0, read);
                read = inputStream.read(this.b);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            z.a.a(th, th);
        }
        throw th;
    }

    public final void h(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(i(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            z.a.a(th, th);
        }
        throw th;
    }

    public final File i() {
        return new File(l(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.h)}));
    }

    public final int j() throws IOException {
        File o = this.c.o(this.d, this.e, this.f, this.g);
        if (!o.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(o);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new bv("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            z.a.a(th, th);
        }
        throw th;
    }

    public final void k(byte[] bArr, int i) throws IOException {
        this.h++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            z.a.a(th, th);
        }
        throw th;
    }

    public final File l() {
        File p = this.c.p(this.d, this.e, this.f, this.g);
        if (!p.exists()) {
            p.mkdirs();
        }
        return p;
    }

    public final File m() throws IOException {
        File o = this.c.o(this.d, this.e, this.f, this.g);
        o.getParentFile().mkdirs();
        o.createNewFile();
        return o;
    }
}
