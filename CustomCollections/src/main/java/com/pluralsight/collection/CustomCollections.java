package com.pluralsight.collection;
import java.time.LocalDate;
public class CustomCollections {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // bu ekleme başarısız olmalı
        System.out.println("Numbers size: " + numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        // dates.add(15); // Bu satır derleme hatası verir çünkü tür uyuşmazlığı var
        System.out.println("Dates size: " + dates.getItems().size());
    }
}

