Syarat 1: Memiliki minimal 3 Attribute, di mana salah satu atribut merupakan objek dari class lain
 
  Pada class `HeroML`, terdapat atribut `equippedItem` yang merupakan objek dari class `Item`.

---

Syarat 2: Memiliki minimal 2 Behavior (method), tidak termasuk setter-getter

- **Method pertama:**  
  Pada class `HeroML`, terdapat method `getTotalAttack()` yang berinteraksi langsung dengan atribut objek `equippedItem`. Method ini mengambil nilai bonus serangan dari objek `Item` yang dimiliki oleh hero.

- **Method kedua:**  
  Terdapat method `attack(HeroML enemy)` pada class `HeroML` yang menerima parameter bertipe objek dari class yang sama (`HeroML`) dan melakukan aksi penyerangan dengan mencetak output berdasarkan atribut milik objek.

---

Syarat 3: Class memiliki minimal 2 constructor

- **Constructor default:**  
  Pada class `HeroML`, terdapat constructor tanpa parameter (`HeroML()`), yang menginisialisasi atribut dengan nilai default.

- **Constructor dengan parameter:**  
  Pada class `HeroML`, terdapat constructor dengan parameter (`HeroML(String name, int basicAttack, Item equippedItem)`) yang digunakan untuk mengisi nilai atribut saat objek dibuat.


Constructor dengan parameter:
Terdapat constructor dengan parameter (Item(String name, int bonusAttack)) untuk menginisialisasi atribut saat objek dibuat.


Syarat 4: Salah satu method harus melibatkan interaksi antar objek dari class yang sama

- **Contoh pada kode:**  
  Pada class `HeroML`, method `attack(HeroML enemy)` melibatkan interaksi antar objek dari class yang sama. Method ini menerima parameter berupa objek `HeroML` lain dan melakukan aksi serangan terhadapnya.

---

