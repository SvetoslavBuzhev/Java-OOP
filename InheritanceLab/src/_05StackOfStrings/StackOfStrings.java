package _05StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data =  new ArrayList<>();
    private int count=0;

    public void push(String toAdd){
        data.add(toAdd);
        count++;
    }
    public String pop (){
        if (data.isEmpty()){
            return "";
        }
        count--;
        return data.remove(data.size()-1);
    }
    public String peek(){
        return data.get(data.size()-1);
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }

}
