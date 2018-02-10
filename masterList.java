/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishackathonP8;

import java.util.ArrayList;

/**
 *
 * @author 46158
 */
public class masterList {
    fishFeed f=new fishFeed();
    ArrayList<fishFeed> list =new ArrayList<>();
    public static void main(String[] args) {
        String choice;

    }
    public void sort(){
        
    }
    public void filter(){
        
    }
    public ArrayList search(String word){
        ArrayList <fishFeed> temp=new ArrayList();
        for (int i=0;i<list.size();i++){
            if (list.get(i).getName().indexOf(word)>-1){
                temp.add(list.get(i));
            }
        }
        return temp;
    }
}
