public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Роберт", "Мартин");
        Author author2 = new Author("Николай", "Прохоренок");
        //System.out.println("author2.authorSurname = " + author2.getAuthorSurname());
        Book book1 = new Book("Чистый Код", author1, 2022);
        Book book2 = new Book("Основы JAVA", author2, 2019);
        System.out.println(book1.getBookName() + " " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getSecondName()+ " " + book1.getPublishingYear());
        System.out.println(book2.getBookName() + " " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getSecondName()+ " " + book2.getPublishingYear());
        book1.setPublishingYear(2021);
        System.out.println("book1.age = " + book1.getPublishingYear());
        System.out.println(book1);
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode() == book2.hashCode());
    }
}