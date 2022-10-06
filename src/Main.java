public class Main {
    public static void main(String[] args) {
        Author ivanovIvan = new Author("Иван" , "Иванов");
        Author costenkoDmitri = new Author("Дмитрий" , "Костенко");
        Book sevenDays = new Book("Семь дней" , ivanovIvan , 2020);
        Book luckySummer = new Book("Удачное лето" , costenkoDmitri , 2010);

        System.out.println(sevenDays.toString());
        System.out.println(luckySummer.toString());
        System.out.println(sevenDays.equals(luckySummer));
        System.out.println(ivanovIvan.equals(costenkoDmitri));
        System.out.println(sevenDays.hashCode() + " , " + luckySummer.hashCode());
        System.out.println(ivanovIvan.hashCode() + " , " + costenkoDmitri.hashCode());
    }
}