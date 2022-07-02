package _04CustomArrayList;


import java.util.ArrayList;
import java.util.Random;

public class CustomList extends ArrayList {
    public Object getRandomElement(){
            int index = new Random().nextInt(super.size());
            return super.remove(index);
    }
}
