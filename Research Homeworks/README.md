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


## <a name="3"></a> Araştırma Projesi 3

- Font family dosyası nasıl oluşturulup kullanıyoruz?
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?



# <a name="x"></a> Cevaplar:

Android 8.0 (API düzeyi 26), yazı tiplerini kaynak olarak kullanmamıza olanak tanıyan XML'deki Yazı Tipleri adlı yeni bir özelliği bizlere sundu. Yazı tiplerini kaynak olarak paketlemek için resource altındaki font klasörüne ekleyebiliyoruz . Bu sayede Android Studio içinde bize sunulan fontlardan bir gün destek çekilirse ve bu fontlar kullanımdan kalkarsa, bizim programımızın sürdürülebilirdiğinin devam etmesi için hali hazırda bir font dosyamız oluyor ve bu sayede bir sorunla karşılaşmamış oluyoruz.
Projemize font family dosyası eklemek için öncellikle proje dizininin altındaki “res” klasörüne sağ tıklıyoruz. Ardından açılan pencereden “New”i seçiyoruz. Daha sonra açılan pencerede “Android Resource File”ı seçiyoruz. File name bölümüne import edeceğimiz font ismini verdikten sonra “Resouce Type” olarak “Font”ı seçiyoruz ve “OK” buttonuna basıp font dosyamızı projemize eklemiş oluyoruz.

![image](https://user-images.githubusercontent.com/39194998/164943224-e4152855-81df-4b03-bc89-b8decfd5f9dc.png)

Daha sonra eklediğimiz font dosyasına çift tıklayarak, fontu daha kapsamlı görebiliyoruz. 

![image](https://user-images.githubusercontent.com/39194998/164943233-ee0d9566-23d2-4f33-af26-4c086f60bc78.png)

Projemize import ettiğimiz font’u nerelerde kullanacağımıza karar verdikten sonra ise style dosyamızın içinde “android:fontFamily” tag’ine “@font/fontname” olarak kullandığımız font’u belirtiyoruz.

![image](https://user-images.githubusercontent.com/39194998/164943245-d1eec19a-2ca4-4d0b-a3cf-4ee5ae5cd5f1.png)


