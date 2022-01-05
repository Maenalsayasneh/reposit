package s0.a.b.e0;

public class d1 extends c1 {
    public void a(byte[] bArr, byte[] bArr2) {
        this.c = 0;
        this.b = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.b[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.b;
            int i3 = i2 & 255;
            byte b = bArr3[(this.c + bArr3[i3] + bArr[i2 % bArr.length]) & 255];
            this.c = b;
            byte b2 = bArr3[i3];
            bArr3[i3] = bArr3[b & 255];
            bArr3[b & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.b;
            int i5 = i4 & 255;
            byte b3 = bArr4[(this.c + bArr4[i5] + bArr2[i4 % bArr2.length]) & 255];
            this.c = b3;
            byte b4 = bArr4[i5];
            bArr4[i5] = bArr4[b3 & 255];
            bArr4[b3 & 255] = b4;
        }
        for (int i6 = 0; i6 < 768; i6++) {
            byte[] bArr5 = this.b;
            int i7 = i6 & 255;
            byte b5 = bArr5[(this.c + bArr5[i7] + bArr[i6 % bArr.length]) & 255];
            this.c = b5;
            byte b6 = bArr5[i7];
            bArr5[i7] = bArr5[b5 & 255];
            bArr5[b5 & 255] = b6;
        }
        this.a = 0;
    }

    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }
}
