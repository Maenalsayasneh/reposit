package i0.h.a.d.a.b;

import com.google.android.play.core.assetpacks.bv;
import i0.h.a.d.a.e.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class i2 {
    public static final Pattern a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    public static List<File> a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(h2.a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[r2];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new bv("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    m2 a2 = new g0(fileInputStream).a();
                    if (a2.a != null) {
                        File file5 = new File(file, a2.a);
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new bv(String.format("Missing asset file %s during slice reconstruction.", new Object[]{file5.getCanonicalPath()}));
                        }
                    } else {
                        throw new bv("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    z.a.a(th, th);
                }
            }
        }
        return arrayList;
        throw th;
    }
}
