import java.util.*;

public class Thanos {

    public static void main(String[] args) {
        Hero Hulk = new Hero ("Hulk", 49);
        Hero Thor = new Hero ("Thor", 1500);
        Hero ScarletWitch = new Hero ("Scarlet Witch", 29);
        Hero IronMan = new Hero ("Iron Man", 48);
        Hero Vision = new Hero ("Vision", 3);
        Hero CaptainAmerica = new Hero ("Captain america", 100);
        Hero BlackWidow = new Hero ("Black Widow", 34);
        Hero SpiderMan = new Hero ("Spider-Man", 18);
        Hero DoctorStrange = new Hero ("Doctor Strange", 42);

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list

        heroes.add(BlackWidow);
        heroes.add(CaptainAmerica);
        heroes.add(Vision);
        heroes.add(IronMan);
        heroes.add(ScarletWitch);
        heroes.add(Thor);
        heroes.add(SpiderMan);
        heroes.add(Hulk);
        heroes.add(DoctorStrange);

        // TODO 3 : It's Thor birthday, now he's 1501
        Hero Thor2 = new Hero ("Thor", 1501);
        heroes.set(5, Thor2);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
        List<Hero> heroes2 = heroes.subList(0, 4);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for ( int i = 0; i < heroes2.size(); i++) {
            Hero name = heroes2.get(i);
            System.out.println(name.getName());
        }
    }
}