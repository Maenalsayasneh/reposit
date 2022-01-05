package s0.a.g.l.c;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
import org.bouncycastle.util.encoders.EncoderException;
import s0.a.g.j;
import s0.a.g.k.a;
import s0.a.g.k.c;

public class d extends BufferedWriter {
    public char[] c = new char[64];

    public d(Writer writer) {
        super(writer);
        String str = j.a;
        if (str != null) {
            str.length();
        }
    }

    public void a(c cVar) throws IOException {
        char[] cArr;
        int i;
        b bVar = (b) cVar;
        write("-----BEGIN CERTIFICATE-----");
        newLine();
        if (!bVar.b.isEmpty()) {
            for (a requireNonNull : bVar.b) {
                Objects.requireNonNull(requireNonNull);
                write((String) null);
                write(": ");
                write((String) null);
                newLine();
            }
            newLine();
        }
        byte[] bArr = bVar.c;
        c cVar2 = a.a;
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            a.a.b(bArr, 0, length, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i2 = 0;
            while (i2 < byteArray.length) {
                int i3 = 0;
                while (true) {
                    cArr = this.c;
                    if (i3 == cArr.length || (i = i2 + i3) >= byteArray.length) {
                        write(cArr, 0, i3);
                        newLine();
                        i2 += this.c.length;
                    } else {
                        cArr[i3] = (char) byteArray[i];
                        i3++;
                    }
                }
                write(cArr, 0, i3);
                newLine();
                i2 += this.c.length;
            }
            write("-----END CERTIFICATE-----");
            newLine();
        } catch (Exception e) {
            throw new EncoderException(i0.d.a.a.a.a0(e, i0.d.a.a.a.P0("exception encoding base64 string: ")), e);
        }
    }
}
