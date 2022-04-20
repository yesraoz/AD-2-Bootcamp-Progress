@ -1,44 +0,0 @@
# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)
- [Öğrenci Cevapları](#x)


### <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?


# <a name="x"></a> Cevaplar:
Val, sabit değer tanımlamak için kullanılır. Tanımlandıktan sonra tekrar değiştirilemez. 
Var normal değişken tanımlamak için kullanılır. Tanımladıktan sonra dilediğinizde değerini değiştirebilirsiniz. 
Lateinit ise sadece var olan değişkenlerde kullanılır. Bir değişkenin non-nullable olduğundan emin olduğumuz durumlarda kullanırız. 
Lateinit sayesinde Kotlin bu değişkeni Non-Null olarak görmektedir. Bu şekilde Nullsafe yapılmış olunur ve hata oranını azaltır. 
Bu değişkeni herhangi bir yerde, tanımlama yapmadan kullanmaya çalışırsak Kotlin “UninitializedPropertyAccessException” hatası verecektir.

private lateinit var button:Button
private lateinit var textView:TextView


### <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 


# <a name="x"></a> Cevaplar:

Uygulama geliştirirken tasarım tarafında yapılan değişikliklerin çıktısını uygulamayı çalıştırmadan anında görebilmek tools attribute kullanıyoruz. 
XML'de belirtilen tasarım yeteneklerini ortaya çıkarır. Derleme araçları, uygulama çalışırken bu özellikleri kaldırır, 
böylece tasarımda görünürler ancak uygulama çalışırken görünmezler.

tools:visibility="invisible" 
tools:ignore="ContentDescription"
tools:targetApi="lollipop"