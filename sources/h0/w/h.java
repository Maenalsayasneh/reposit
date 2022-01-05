package h0.w;

import android.content.Context;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import h0.y.a.b;
import h0.y.a.c;
import i0.d.a.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* compiled from: SQLiteCopyOpenHelper */
public class h implements c {
    public a Y1;
    public boolean Z1;
    public final Context c;
    public final String d;
    public final File q;
    public final int x;
    public final c y;

    public synchronized b L() {
        if (!this.Z1) {
            b();
            this.Z1 = true;
        }
        return this.y.L();
    }

    /* JADX INFO: finally extract failed */
    public final void a(File file) throws IOException {
        ReadableByteChannel readableByteChannel;
        if (this.d != null) {
            readableByteChannel = Channels.newChannel(this.c.getAssets().open(this.d));
        } else if (this.q != null) {
            readableByteChannel = new FileInputStream(this.q).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.c.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        try {
            channel.transferFrom(readableByteChannel, 0, RecyclerView.FOREVER_NS);
            channel.force(false);
            readableByteChannel.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder P0 = a.P0("Failed to create directories for ");
                P0.append(file.getAbsolutePath());
                throw new IOException(P0.toString());
            } else if (!createTempFile.renameTo(file)) {
                StringBuilder P02 = a.P0("Failed to move intermediate file (");
                P02.append(createTempFile.getAbsolutePath());
                P02.append(") to destination (");
                P02.append(file.getAbsolutePath());
                P02.append(").");
                throw new IOException(P02.toString());
            }
        } catch (Throwable th) {
            readableByteChannel.close();
            channel.close();
            throw th;
        }
    }

    public final void b() {
        String databaseName = this.y.getDatabaseName();
        File databasePath = this.c.getDatabasePath(databaseName);
        h0.w.k.a aVar = new h0.w.k.a(databaseName, this.c.getFilesDir(), this.Y1 == null);
        try {
            aVar.c.lock();
            if (aVar.d) {
                FileChannel channel = new FileOutputStream(aVar.b).getChannel();
                aVar.e = channel;
                channel.lock();
            }
            if (!databasePath.exists()) {
                a(databasePath);
                aVar.a();
            } else if (this.Y1 == null) {
                aVar.a();
            } else {
                try {
                    int b = h0.w.k.b.b(databasePath);
                    int i = this.x;
                    if (b == i) {
                        aVar.a();
                    } else if (this.Y1.a(b, i)) {
                        aVar.a();
                    } else {
                        if (this.c.deleteDatabase(databaseName)) {
                            try {
                                a(databasePath);
                            } catch (IOException e) {
                                Log.w("ROOM", "Unable to copy database file.", e);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar.a();
                    }
                } catch (IOException e2) {
                    Log.w("ROOM", "Unable to read database version.", e2);
                    aVar.a();
                }
            }
        } catch (IOException e3) {
            throw new RuntimeException("Unable to copy database file.", e3);
        } catch (IOException e4) {
            throw new IllegalStateException("Unable to grab copy lock.", e4);
        } catch (Throwable th) {
            aVar.a();
            throw th;
        }
    }

    public synchronized void close() {
        this.y.close();
        this.Z1 = false;
    }

    public String getDatabaseName() {
        return this.y.getDatabaseName();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.y.setWriteAheadLoggingEnabled(z);
    }
}
