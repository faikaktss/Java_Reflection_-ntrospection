# 🔍 Java Reflection Introspection

Bu proje, **Java Reflection API** kullanarak bir sınıfın alanlarını, yapıcı metotlarını (constructors) ve metodlarını dinamik olarak inceleme ve değerlerine erişme örneğini içermektedir.  

Projedeki temel amaç, derleme zamanında bilinmeyen bir sınıfın özelliklerine **çalışma zamanında** erişebilmek ve yönetebilmektir.

---

## 🚀 Özellikler

- Belirtilen sınıfın (`Emplooye`) **private / public alanlarına** erişim
- Alanların değerlerini çalışma anında okuma
- Constructor bilgilerini listeleme
- Metod bilgilerine erişim
- `setAccessible(true)` ile **erişim kısıtlamalarını aşma**
- Java Reflection’ın temellerini öğrenmek için basit ve anlaşılır bir örnek

---

## 🏗 Kullanılan Teknolojiler

- **Java 17+**
- **Reflection API** (`java.lang.reflect`)
  - `Class`
  - `Field`
  - `Constructor`
  - `Method`
  - `Parameter`

---

## 📂 Proje Yapısı

```bash
src/
 └── Default/
     └── Main.java       # Reflection örnekleri
 └── net/
     └── faikaktas/
         └── Emplooye.java   # Örnek model sınıfı
