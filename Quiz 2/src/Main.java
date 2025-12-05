import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player healthCliff = new Player (1, "Healthcliff", 105);
        Player asuna = new Player (2, "Asuna", 100);
        Player lethalBacon = new Player (3, "LethalBacon", 205);
        Player hpDeskjet = new Player (4, "HPDeskjet", 34);

        //PlayerLinkedList.add(new Player(4, "Arctis", 35));
       // PlayerLinkedList.remove(0);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        playerLinkedList.addToFront(healthCliff);
        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        playerLinkedList.printList();
    }

}