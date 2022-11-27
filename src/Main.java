public class Main {
    public static void main(String[] args) {
                Author first = new Author("Василий", "Батьков");
                Author second = new Author("Troy", "Terner");
                Book book1 = new Book("Тысяча способов выучить язык Java", first , 2020);
                Book book2 = new Book("How to build a building", second, 1962);
                book1.setPublicationYear(2018);
        System.out.println(book1);
        System.out.println(book2);
    }
}