import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 упражнение
        Student student1 = new Student("Алиса", "Смит", "Коктем-2", 24);
        Student student2 = new Student("Азамат", "Елчибаев", "Коктем-3", 26);
        Student student3 = new Student("Кристина", "Соколова", "Коктем-4", 28);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        //2 упражнение
        Triangle trinagle1 = new Triangle(1.3f, 5.5f, 6.6f);
        trinagle1.printAreaAndPerimetrOfTriangle();

        //3 упражнение
        Rectangle rectangle1 = new Rectangle(5f, 8f);
        Rectangle rectangle2 = new Rectangle(10f, 20f);
        System.out.println("Площадь прямоугольника: " + rectangle1.countArea());
        System.out.println("Площадь прямоугольника: " + rectangle2.countArea());

        //4 упражнение
        Average average = new Average();
        average.countAndPrintAverage(10, 20, 30);

        //5 упражнение
        Movie mv1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie mv2 = new Movie("Главный герой", "20th Century Studios");
        mv1.printMovieInfo();
        mv2.printMovieInfo();
    }
}
