package org.bouncycastle.jcajce.provider.asymmetric.gost;

import androidx.recyclerview.widget.RecyclerView;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import s0.a.b.f0.q;
import s0.a.b.j;
import s0.a.b.k0.q0;
import s0.a.b.k0.t0;
import s0.a.d.e.l;
import s0.a.d.e.n;

public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    public SecureRandom random;
    public int strength = RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;

    public AlgorithmParameters engineGenerateParameters() {
        q0 q0Var;
        long j;
        BigInteger bigInteger;
        BigInteger add;
        BigInteger[] bigIntegerArr;
        String str;
        BigInteger bigInteger2;
        int i;
        BigInteger add2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        q qVar = new q();
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            qVar.c = this.strength;
            qVar.d = 2;
            qVar.e = secureRandom;
        } else {
            int i2 = this.strength;
            SecureRandom a = j.a();
            qVar.c = i2;
            qVar.d = 2;
            qVar.e = a;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        String str2 = "0";
        int i3 = 0;
        if (qVar.d == 1) {
            int nextInt = qVar.e.nextInt();
            int nextInt2 = qVar.e.nextInt();
            int i4 = qVar.c;
            if (i4 == 512) {
                qVar.a(nextInt, nextInt2, bigIntegerArr2, 512);
            } else if (i4 == 1024) {
                int i5 = nextInt;
                while (true) {
                    if (i5 >= 0 && i5 <= 65536) {
                        break;
                    }
                    i5 = qVar.e.nextInt() / 32768;
                    i3 = 0;
                }
                int i6 = nextInt2;
                while (true) {
                    if (i6 >= 0 && i6 <= 65536 && i6 / 2 != 0) {
                        break;
                    }
                    i6 = (qVar.e.nextInt() / 32768) + 1;
                    i3 = 0;
                }
                BigInteger[] bigIntegerArr3 = new BigInteger[2];
                BigInteger bigInteger5 = new BigInteger(Integer.toString(i6));
                BigInteger bigInteger6 = new BigInteger("19381");
                int a2 = qVar.a(i5, i6, bigIntegerArr3, 256);
                BigInteger bigInteger7 = bigIntegerArr3[i3];
                int a3 = qVar.a(a2, i6, bigIntegerArr3, 512);
                BigInteger bigInteger8 = bigIntegerArr3[i3];
                BigInteger[] bigIntegerArr4 = new BigInteger[65];
                bigIntegerArr4[i3] = new BigInteger(Integer.toString(a3));
                loop2:
                while (true) {
                    int i7 = i3;
                    while (true) {
                        i = 64;
                        if (i7 >= 64) {
                            break;
                        }
                        int i8 = i7 + 1;
                        bigIntegerArr4[i8] = bigIntegerArr4[i7].multiply(bigInteger6).add(bigInteger5).mod(q.b.pow(16));
                        i7 = i8;
                    }
                    BigInteger bigInteger9 = new BigInteger(str2);
                    int i9 = i3;
                    while (i9 < i) {
                        bigInteger9 = bigInteger9.add(bigIntegerArr4[i9].multiply(q.b.pow(i9 * 16)));
                        i9++;
                        i = 64;
                    }
                    bigIntegerArr4[0] = bigIntegerArr4[i];
                    BigInteger bigInteger10 = q.b;
                    BigInteger[] bigIntegerArr5 = bigIntegerArr4;
                    BigInteger add3 = bigInteger10.pow(1023).divide(bigInteger7.multiply(bigInteger8)).add(bigInteger10.pow(1023).multiply(bigInteger9).divide(bigInteger7.multiply(bigInteger8).multiply(bigInteger10.pow(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE))));
                    BigInteger mod = add3.mod(bigInteger10);
                    BigInteger bigInteger11 = q.a;
                    if (mod.compareTo(bigInteger11) == 0) {
                        add3 = add3.add(bigInteger11);
                    }
                    BigInteger bigInteger12 = add3;
                    int i10 = 0;
                    while (true) {
                        long j2 = (long) i10;
                        BigInteger multiply = bigInteger7.multiply(bigInteger8).multiply(bigInteger12.add(BigInteger.valueOf(j2)));
                        BigInteger bigInteger13 = q.a;
                        add2 = multiply.add(bigInteger13);
                        bigInteger3 = bigInteger5;
                        BigInteger bigInteger14 = q.b;
                        bigInteger4 = bigInteger6;
                        if (add2.compareTo(bigInteger14.pow(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE)) != 1) {
                            if (bigInteger14.modPow(bigInteger7.multiply(bigInteger8).multiply(bigInteger12.add(BigInteger.valueOf(j2))), add2).compareTo(bigInteger13) == 0 && bigInteger14.modPow(bigInteger7.multiply(bigInteger12.add(BigInteger.valueOf(j2))), add2).compareTo(bigInteger13) != 0) {
                                break loop2;
                            }
                            i10 += 2;
                            bigInteger5 = bigInteger3;
                            bigInteger6 = bigInteger4;
                        } else {
                            break;
                        }
                    }
                    bigIntegerArr4 = bigIntegerArr5;
                    bigInteger5 = bigInteger3;
                    bigInteger6 = bigInteger4;
                    i3 = 0;
                }
                bigIntegerArr2[0] = add2;
                bigIntegerArr2[1] = bigInteger7;
            } else {
                throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
            }
            BigInteger bigInteger15 = bigIntegerArr2[0];
            BigInteger bigInteger16 = bigIntegerArr2[1];
            q0Var = new q0(bigInteger15, bigInteger16, qVar.c(bigInteger15, bigInteger16), new t0(nextInt, nextInt2));
        } else {
            long nextLong = qVar.e.nextLong();
            long nextLong2 = qVar.e.nextLong();
            int i11 = qVar.c;
            if (i11 == 512) {
                j = nextLong2;
                qVar.b(nextLong, j, bigIntegerArr2, 512);
            } else if (i11 == 1024) {
                long j3 = nextLong;
                while (true) {
                    if (j3 >= 0 && j3 <= 4294967296L) {
                        break;
                    }
                    j3 = (long) (qVar.e.nextInt() * 2);
                    str2 = str2;
                    nextLong2 = nextLong2;
                }
                long j4 = nextLong2;
                while (true) {
                    if (j4 >= 0 && j4 <= 4294967296L && j4 / 2 != 0) {
                        break;
                    }
                    str2 = str2;
                    j4 = (long) ((qVar.e.nextInt() * 2) + 1);
                    nextLong2 = nextLong2;
                }
                BigInteger[] bigIntegerArr6 = new BigInteger[2];
                BigInteger bigInteger17 = new BigInteger(Long.toString(j4));
                q qVar2 = qVar;
                long j5 = j4;
                BigInteger[] bigIntegerArr7 = bigIntegerArr6;
                j = nextLong2;
                BigInteger bigInteger18 = new BigInteger("97781173");
                long b = qVar2.b(j3, j5, bigIntegerArr7, 256);
                BigInteger bigInteger19 = bigIntegerArr6[0];
                long b2 = qVar2.b(b, j5, bigIntegerArr7, 512);
                BigInteger bigInteger20 = bigIntegerArr6[0];
                BigInteger[] bigIntegerArr8 = new BigInteger[33];
                bigIntegerArr8[0] = new BigInteger(Long.toString(b2));
                loop8:
                while (true) {
                    int i12 = 0;
                    while (i12 < 32) {
                        int i13 = i12 + 1;
                        bigIntegerArr8[i13] = bigIntegerArr8[i12].multiply(bigInteger18).add(bigInteger17).mod(q.b.pow(32));
                        i12 = i13;
                    }
                    BigInteger bigInteger21 = new BigInteger(str2);
                    for (int i14 = 0; i14 < 32; i14++) {
                        bigInteger21 = bigInteger21.add(bigIntegerArr8[i14].multiply(q.b.pow(i14 * 32)));
                    }
                    bigIntegerArr8[0] = bigIntegerArr8[32];
                    BigInteger bigInteger22 = q.b;
                    bigInteger = bigInteger19;
                    BigInteger add4 = bigInteger22.pow(1023).divide(bigInteger.multiply(bigInteger20)).add(bigInteger22.pow(1023).multiply(bigInteger21).divide(bigInteger.multiply(bigInteger20).multiply(bigInteger22.pow(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE))));
                    BigInteger mod2 = add4.mod(bigInteger22);
                    BigInteger bigInteger23 = q.a;
                    if (mod2.compareTo(bigInteger23) == 0) {
                        add4 = add4.add(bigInteger23);
                    }
                    BigInteger bigInteger24 = add4;
                    int i15 = 0;
                    while (true) {
                        long j6 = (long) i15;
                        BigInteger multiply2 = bigInteger.multiply(bigInteger20).multiply(bigInteger24.add(BigInteger.valueOf(j6)));
                        BigInteger bigInteger25 = q.a;
                        add = multiply2.add(bigInteger25);
                        bigIntegerArr = bigIntegerArr8;
                        BigInteger bigInteger26 = q.b;
                        str = str2;
                        bigInteger2 = bigInteger18;
                        if (add.compareTo(bigInteger26.pow(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE)) != 1) {
                            if (bigInteger26.modPow(bigInteger.multiply(bigInteger20).multiply(bigInteger24.add(BigInteger.valueOf(j6))), add).compareTo(bigInteger25) == 0 && bigInteger26.modPow(bigInteger.multiply(bigInteger24.add(BigInteger.valueOf(j6))), add).compareTo(bigInteger25) != 0) {
                                break loop8;
                            }
                            i15 += 2;
                            bigInteger18 = bigInteger2;
                            bigIntegerArr8 = bigIntegerArr;
                            str2 = str;
                        } else {
                            break;
                        }
                    }
                    bigInteger19 = bigInteger;
                    bigInteger18 = bigInteger2;
                    bigIntegerArr8 = bigIntegerArr;
                    str2 = str;
                }
                bigIntegerArr2[0] = add;
                bigIntegerArr2[1] = bigInteger;
            } else {
                throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
            }
            BigInteger bigInteger27 = bigIntegerArr2[0];
            BigInteger bigInteger28 = bigIntegerArr2[1];
            q0Var = new q0(bigInteger27, bigInteger28, qVar.c(bigInteger27, bigInteger28), new t0(nextLong, j));
        }
        try {
            AlgorithmParameters createParametersInstance = createParametersInstance("GOST3410");
            createParametersInstance.init(new l(new n(q0Var.c, q0Var.d, q0Var.q)));
            return createParametersInstance;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void engineInit(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }

    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for GOST3410 parameter generation.");
    }
}
