import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args)  {
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

        Customer c1 = new Customer("111", "Mieczysław", "Bąk", "66666666");
        Customer c2 = new Customer("222", "Edzia", "Stalin", "777777777");
        Customer c3 = new Customer("333", "Jozek", "Hitler", "8888888");

        Map<String,Customer> map = new HashMap<>();
        map.put(c1.getId(), c1);
        map.put(c2.getId(), c2);
        map.put(c3.getId(), c3);

        System.out.println(map.keySet());
        System.out.println(map.values());

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj id klienta");
        String id = sc.nextLine();
        if(map.keySet().contains(id)){
            System.out.println(map.get(id));
        } else {
            System.out.println("klient nie istnieje");
        }

        File file = new File("movies.csv");
        Scanner screader = null;
        try {
            screader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        screader.nextLine();
        while(screader.hasNextLine()){
            String[] elements = screader.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
            String[] genres = elements[2].split("\\|");
            ArrayList genreList = new ArrayList<>(Arrays.asList(genres));
            System.out.println(genreList);
        }
    }
}
