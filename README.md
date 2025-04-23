# Tugas JUnit 📚

Repositori ini berisi serangkaian **unit tests** dan **instrumented tests** yang digunakan untuk menguji aplikasi kalkulator sederhana. Aplikasi ini memiliki fungsi untuk penjumlahan dan pengurangan dua angka.

## Deskripsi Proyek 🧑‍💻

Proyek ini bertujuan untuk melaksanakan pengujian otomatis menggunakan **JUnit**, termasuk pengujian lokal (unit tests) dan pengujian berbasis Android (instrumented tests). Aplikasi ini menggunakan Android Studio untuk pengembangan dan pengujian.

### Fitur Aplikasi:
- Penjumlahan dua angka
- Pengurangan dua angka

### Struktur Proyek:
- **Calculator.java**: Kelas yang mengimplementasikan operasi dasar kalkulator.
- **MainActivity.java**: Aktivitas utama aplikasi yang meng-handle input dan menampilkan hasil perhitungan.
- **CalculatorTest.java**: Test unit untuk menguji fungsi-fungsi dalam kelas `Calculator`.
- **MainActivityTest.java**: Test UI untuk memastikan aplikasi berjalan dengan benar.
- **ExampleInstrumentedTest.java**: Test instrumented untuk memverifikasi konteks aplikasi di perangkat Android.
- **ExampleUnitTest.java**: Test unit sederhana untuk memverifikasi operasi dasar.

## Instruksi Penggunaan 🚀

1. Clone repositori ini ke komputer Anda:
   ```bash
   git clone https://github.com/Athrayyanmuhmd/JUnit.git
   ```

2. Buka proyek di Android Studio dan jalankan pengujian.

3. Jalankan pengujian unit atau pengujian instrumented sesuai kebutuhan:
   - **Unit Test**: Menjalankan pengujian yang dieksekusi di mesin pengembangan.
   - **Instrumented Test**: Menjalankan pengujian pada perangkat Android untuk memverifikasi fungsionalitas aplikasi secara keseluruhan.

## Pengujian yang Dilakukan 📝

### 1. **Instrumented Tests** 📱
Instrumented tests dijalankan di perangkat Android untuk memverifikasi apakah aplikasi dapat berfungsi dengan benar di lingkungan Android.

- **ExampleInstrumentedTest.java**
    - **Tujuan**: Menguji apakah aplikasi dapat memuat konteks aplikasi dengan benar.
    - **Test Case**: Memverifikasi bahwa nama paket aplikasi sesuai dengan yang diharapkan (`com.example.tugasjunit`).

  ```java
  @Test
  public void useAppContext() {
      // Verifikasi bahwa nama paket aplikasi sesuai
      Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
      assertEquals("com.example.tugasjunit", appContext.getPackageName());
  }
  ```

### 2. **Local Unit Tests** 🧪
Unit tests dijalankan pada mesin pengembangan tanpa melibatkan perangkat Android. Pengujian ini memastikan bahwa logika program berjalan dengan baik.

- **CalculatorTest.java**
    - **add_PositiveNumbers_ReturnsCorrectSum**: Menguji apakah fungsi penjumlahan mengembalikan hasil yang benar ketika menggunakan angka positif.
    
      ```java
      @Test
      public void add_PositiveNumbers_ReturnsCorrectSum() {
          int result = calculator.add(5, 7);
          assertEquals(12, result);
      }
      ```

    - **subtract_ResultNegative_ReturnsNegativeDifference**: Menguji apakah fungsi pengurangan menghasilkan nilai negatif ketika angka pertama lebih kecil dari angka kedua.
    
      ```java
      @Test
      public void subtract_ResultNegative_ReturnsNegativeDifference() {
          int result = calculator.subtract(5, 10);
          assertEquals(-5, result);
      }
      ```

### 3. **Test UI dengan Espresso** 🖥️
- **MainActivityTest.java**
    - **testAddOperation**: Menguji apakah aplikasi dapat melakukan penjumlahan dua angka melalui UI dan menampilkan hasil yang benar.
    - **testSubtractOperation**: Menguji apakah aplikasi dapat melakukan pengurangan dua angka melalui UI dan menampilkan hasil yang benar.

    ```java
    @Test
    public void testAddOperation() {
        Espresso.onView(ViewMatchers.withId(R.id.firstNumberEditText))
                .perform(ViewActions.typeText("15"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.secondNumberEditText))
                .perform(ViewActions.typeText("7"), ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.addButton))
                .perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.resultTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("15 + 7 = 22")));
    }
    ```

## Cara Berkontribusi 💡

1. Fork repositori ini.
2. Buat cabang baru (`git checkout -b feature-branch`).
3. Lakukan perubahan yang diinginkan.
4. Commit perubahan Anda (`git commit -am 'Add new feature'`).
5. Push ke cabang baru (`git push origin feature-branch`).
6. Buat pull request.
