package merve_gündoğmuş.Day2;

public class Engineer extends Employee {// mühendis sınıfı miras alıyır personel sınıfından

    public Engineer(String name, double salary, int age) {
        super(name, salary, age); // isim yaş ve maaş bilgilerini personel sınıfınfan miras aldığı için
                                  // super anahtar kelimesi ile çağırıyoruz
    }

    public double getAnnualBonus() {
        return super.salary * .05;
    }
}
