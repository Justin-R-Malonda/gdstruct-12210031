import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1, "Healthcliff", 100));
        playerList.add(new Player(2, "Asuna", 100));
        playerList.add(new Player(3, "LethalBacon", 205));
        playerList.add(new Player(4, "HPDeskjet", 35));


        //playerList.add(1, new Player(553, "Arctis", 55))

        //playerList.remove(0);

        //System.out.println(playerList.contains(new Player(3, "LethalBacon", 205)));
        System.out.println(playerList.indexOf(new Player(3, "LethalBacon", 205)));
        //playerList.forEach(player -> System.out.println())
        for (Player p : playerList)
        {
            System.out.println(p);
        }
    }
}