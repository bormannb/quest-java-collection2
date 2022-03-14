import java.util.ArrayList;
import java.util.List;

import javax.xml.catalog.Catalog;

import java.util.Collections;
import java.util.Comparator;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)


        System.out.println("\nOrder by name:");
        Collections.sort(heroes);
        showList(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)


        System.out.println("\nOrder by age:");


        Comparator<Hero> heroAgeComparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero t1,Hero t2 ) { 
             
                if(t1.getAge() < t2.getAge()){
                    return 1;
                } else if(t1.getAge()>t2.getAge()){
                    return -1;  
                } else {
                    return 0; 
                }  
            }
        };
       
        Collections.sort(heroes, heroAgeComparator);
        
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }

}