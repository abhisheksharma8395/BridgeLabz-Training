package collectors.library_book_statistics;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Dune", "Sci-Fi", 412));
        books.add(new Book("Neuromancer", "Sci-Fi", 271));
        books.add(new Book("1984", "Dystopian", 328));
        books.add(new Book("Brave New World", "Dystopian", 288));
        books.add(new Book("The Hobbit", "Fantasy", 310));
        books.add(new Book("The Fellowship of the Ring", "Fantasy", 423));
        books.add(new Book("Clean Code", "Programming", 464));
        books.add(new Book("Effective Java", "Programming", 416));
        books.add(new Book("Sapiens", "History", 498));
        books.add(new Book("Guns, Germs, and Steel", "History", 425));

        Map<String, IntSummaryStatistics> map = books.stream().collect(Collectors.groupingBy(Book ::getGenre, Collectors.summarizingInt(Book ::getPages)));
        map.forEach((genre,stats) ->{
            System.out.println("Genre : "+genre);
            System.out.println("Total Pages : "+stats.getSum());
            System.out.println("Average Pages : "+stats.getAverage());
            System.out.println("Maximum Pages : "+stats.getMax());
        } );
    }
}
