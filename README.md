Yazdığımız program sayi1 ve sayi2 olmak üzere iki adet değer(BigInteger) almaktadır. Aynı zamanda SeriHesaplama ve ParalelHesaplama adında iki adet sınıf projeye dahil edilmiştir. Girilen bu sayi1 ve sayi2 değerler bahse konu sınıflardan nesne oluşturulduğunda parametre olarak oluşan nesneye gönderilmektedir.
SeriHesaplama sınıfı: sayı1 ve sayı2 bu sınıfa parametre olarak gelmekte hesaplama işlemi seri olarak yapılmaktadır. Hesaplama süresi çıktı olarak yazdırılmaktadır.
ParalelHesaplama sınıfı: sayı1 ve sayı2 bu sınıfa parametre olarak gelmektedir. Sınıf içerisinde iki adet thread oluşturulmuştur. İlk thread sayı2’nin ilk rakamından başlayarak sayı2’nin uzunluğunun yarısında bulunan rakama kadar tüm rakamları tek tek sayı1 ile çarpmakta ve değişkende tutmaktadır. Thread2 ise sayı2’nin ortasındaki rakamdan başlayarak sayı2’nin son basamağına kadar olan rakamları sayı1 ile çarparak başka bir değişkende tutmaktadır. Bu iki thread aynı anda çalıştırılmakta ve bu sayede seri hesaplamanın yaklaşık 10 katı kadar hızlı hesaplama yapılması sağlanmaktadır.
