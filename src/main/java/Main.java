import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>();
        Person p1 = new Person("edek", "sztacheta", "85634523");
        Person p2 = new Person("madzia", "wodzianka", "85634523");
        Person p3 = new Person("wiesiek", "czosnek", "85634523");
        Person p4 = new Person("czesiek", "papryka", "85634523");
        Person p5 =new Person("ewa", "waż", "85634523");
        Person p6 =new Person("bożenka", "z klanu", "85634523");
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        Iterator<Person> iterator = people.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Przychodnia!!!");
        Queue<Person> queue = new PriorityQueue<>();
        queue.offer(p1);
        queue.offer(p2);
        queue.offer(p3);
        queue.offer(p4);
        queue.offer(p5);
        queue.offer(p6);

        Iterator<Person> kolejkaIterator = queue.iterator();

        while(!queue.isEmpty()){
            System.out.println("Pacjent: "+queue.peek()+ " proszony do gabinetu");
            System.out.println("Pacjent "+queue.poll()+" obsłużony");

        }

    }
}
