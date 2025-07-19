# Java Helper Library (`helper-lib.jar`)

Library Java siap pakai yang berisi utilitas umum untuk aplikasi berbasis console:
- Validasi input angka & string
- Membersihkan layar (Windows/Linux/Mac)
- Pause (tekan Enter untuk lanjut)

Dapat digunakan langsung oleh pengguna **tanpa perlu build ulang**.

---

## **Untuk Pengguna (User)**

Gunakan library ini sebagai dependensi di proyekmu tanpa perlu source code.

### **Instalasi (via Git Submodule)**
```bash
git submodule add https://github.com/dwi312/java-helper-lib.git lib/helper

```

### **Struktur proyek setelah ditambahkan**:
```css
PerpusApp/
├── lib/
│   └── helper/
│       └── helper-lib.jar
└── src/
    └── Main.java

```

### **Cara Compile & Jalankan**
```bash
javac -cp lib/helper/helper-lib.jar -d out src/**/*.java
java -cp out:lib/helper/helper-lib.jar Main

```

### **Contoh Penggunaan (`Main.java`)**
```java
import helper.AppHelper;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = AppHelper.inputInt(sc);

        System.out.println("Angka yang dimasukkan: " + angka);

        AppHelper.enterToContinue(sc);
    }
}


```

---

## Untuk Developer (Kontributor)
### Source code berada di branch `source`:
```bash
git clone -b source https://github.com/dwi312/java-helper-lib.git

```
### Build JAR
```bash
./build.sh

```
### Rilis Versi Baru
Gunakan skrip `release.sh` untuk memperbarui `helper-lib.jar` di branch `main`:
```bash
./release.sh 1.1

```
Skrip ini akan:
- Build JAR terbaru
- Update branch main (hanya helper-lib.jar + README.md)
- Membuat tag versi v1.1
- Push semua ke GitHub

---

#### Dwi312
