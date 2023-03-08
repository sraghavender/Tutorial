import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListExample {
	public static void main(String[] args) {
    LinkedList<String> namesLinkedList = new LinkedList<>();
    namesLinkedList.add("Mango");
    namesLinkedList.add("Orange");
    namesLinkedList.add("Banana");
    namesLinkedList.add("Grape");
    namesLinkedList.add("Melon");
    namesLinkedList.add(0, "Grape");
    System.out.println(namesLinkedList.get(0));
    ArrayList<String>  namesArrayList = new ArrayList<>();
    namesArrayList.add("Mango");
    namesArrayList.add("Orange");
    namesArrayList.add("Banana");
    namesArrayList.add("Grape");
    namesArrayList.add("Melon");
    System.out.println(namesArrayList.get(2));
    String[] name = new String[5];
    name[0] = "Mango";
    name[1] = "Orange";
    name[2] ="Banana";
    name[3] = "Grape";
    name[4]= "Melon";
    System.out.println(name[2]);
     
	}

}
