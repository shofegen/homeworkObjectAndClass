public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Николаевич");
        Book annaKarenina = new Book("Анна Каренина", "Толстой Лев Николаевич", 1873);
        Author lermontov = new Author("Михаил", "Лермонтов");
        Book mtsyri = new Book("Мцыри", "Михаил Юрьевич Лермонтов", 1837);
        mtsyri.setYearOfPublication(1838);
        System.out.println("tolstoy.getName() = " + tolstoy.getName());
        System.out.println("tolstoy.getSurname() = " + tolstoy.getSurname());
        System.out.println("annaKarenina.getNameBook() = " + annaKarenina.getNameBook());
        System.out.println("annaKarenina.getAuthor() = " + annaKarenina.getAuthor());
        System.out.println("annaKarenina.getYearOfPublication() = " + annaKarenina.getYearOfPublication());
        System.out.println("lermontov.getName() = " + lermontov.getName());
        System.out.println("lermontov.getSurname() = " + lermontov.getSurname());
        System.out.println("mtsyri.getNameBook() = " + mtsyri.getNameBook());
        System.out.println("mtsyri.getAuthor() = " + mtsyri.getAuthor());
        System.out.println("mtsyri.getYearOfPublication() = " + mtsyri.getYearOfPublication());

    }
    }
