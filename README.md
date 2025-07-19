# Java Helper Library (`helper-lib.jar`)

Library ini berisi **class `helper.AppHelper`** yang menyediakan berbagai fungsi utilitas 
untuk aplikasi Java berbasis console, seperti input validasi, clear screen, dan pause.

## Fitur Utama
- Input **integer** dan **string** dengan validasi otomatis.
- Membersihkan layar console (`clearScreen`).
- Fungsi pause (`enterToContinue`).
- Fungsi `cariIndex` untuk mencari slot kosong pada array generik.

---

## 🔹 Bagian 1 – Untuk Developer

Jika Anda ingin **mengembangkan** atau **update versi `helper-lib.jar`**, ikuti langkah berikut.

### **1. Struktur Source**
Pastikan repository memiliki struktur awal seperti ini:
```
java-helper-lib/
├── src/
│ └── helper/
│ └── AppHelper.java
├── examples/
│ └── Main.java                           # Contoh penggunaan (opsional)
├── build.sh                              # Script build (Linux/Mac)
├── build.bat                             # Script build (Windows)
└── README.md

```
### **2. Build JAR**
Jalankan perintah build:
#### Linux/Mac:
```bash
./build.sh

```
#### windows:
```bash
build.bat

```
Setelah selesai, helper-lib.jar akan dibuat di root folder:
```
java-helper-lib/
├── helper-lib.jar               # hasil build
├── src/helper/AppHelper.java
├── examples/Main.java
└── README.md

```

### 3. Rilis Versi Distribusi
- Untuk mendistribusikan hanya file JAR (tanpa source):
    1. Commit helper-lib.jar ke branch utama.
    2. (Opsional) Pindahkan src/ dan examples/ ke branch terpisah (source),sehingga branch utama hanya berisi file JAR dan README:
```bash
java-helper-lib/
├── helper-lib.jar
└── README.md

```

---

## 🔹 Bagian 2 – Untuk User
Jika Anda ingin memakai library ini di proyek Anda:
1. Tambahkan sebagai Submodule
Di dalam folder proyek:
```bash
git submodule add https://github.com/username/java-helper-lib.git lib/helper

```
Struktur proyek akan menjadi:
```css
PerpusApp/
├── lib/
│   └── helper/
│       └── helper-lib.jar
├── src/
│   └── Main.java
└── out/

```

2. Gunakan di Kode
Contoh Main.java:
```java
import helper.AppHelper;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama = AppHelper.inputStr("Masukkan nama: ", sc);
        int umur = AppHelper.inputInt("Masukkan umur: ", sc);

        System.out.println("\nHalo, " + nama + "! (Umur: " + umur + ")");
        AppHelper.enterToContinue(sc);
    }
}

```

3. Compile & Jalankan
```bash
javac -cp lib/helper/helper-lib.jar -d out src/**/*.java
java -cp out:lib/helper/helper-lib.jar Main

```
> Catatan: Untuk Windows, ganti `:` menjadi `;` pada `-cp`.

4. Update Library
Jika ada pembaruan:
```bash
cd lib/helper
git pull origin main

```

---

## Lisensi
Bebas digunakan dan dimodifikasi untuk keperluan pribadi maupun komersial.

## Dwi312