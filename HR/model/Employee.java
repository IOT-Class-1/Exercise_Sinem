package com.example.HR.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // bu anotasyon bu sınıfın bir veritabanı tablosuna karşılık geldiğin, belirtir.
public class Employee {

    @Id // bu anatasyon, id alanının birincil anahtar olduğunu belirtir.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  id alanının otomatik olarak arttırılacağını belirtir.
    private long id; // Çalışanın benzersiz kimliği

    private String name; // Çalışanın adı
    private String position; // çalınan pozisyonu

    //Getter ve setter metotları
    //getter, özel alanların değerini okumak için kullanılır
    //setter, özel alanların değerini ayarlamak için kullanılır

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
