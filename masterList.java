/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem8;

import java.util.*;

/**
 *
 * @author 46158
 */
public class masterList {

    Scanner input = new Scanner(System.in);
    ArrayList<fishFeed> list;

    public masterList() {
        list = new ArrayList();
    }

    public void sort() {

    }

    public ArrayList<fishFeed> filter(double num) {
        ArrayList<fishFeed> tempt = new ArrayList(list);
        System.out.print("Which catagory do you want to filter: ");
        String s = input.next();
        System.out.println("1. above/t2. below");
        int a = input.nextInt();
        if (a == 1) {
            switch (s) {
                case "carbon": {
                    for (int i = 0; i < tempt.size(); i++) {
                        if (tempt.get(i).getCarbon() < num) {
                            tempt.remove(i);
                        }
                    }
                    break;
                }
                case "phosphorous": {
                    for (int i = 0; i < tempt.size(); i++) {
                        if (tempt.get(i).getPhosphorous() < num) {
                            tempt.remove(i);
                        }
                    }
                    break;
                }
                case "nitrogen": {
                    for (int i = 0; i < tempt.size(); i++) {
                        if (tempt.get(i).getNitrogen() < num) {
                            tempt.remove(i);
                        }
                    }
                    break;
                }
                case "cost": {
                    for (int i = 0; i < tempt.size(); i++) {
                        if (tempt.get(i).getCost() < num) {
                            tempt.remove(i);
                        }
                    }
                    break;
                }
                case "fat": {
                    for (int i = 0; i < tempt.size(); i++) {
                        if (tempt.get(i).getFat() < num) {
                            tempt.remove(i);
                        }
                    }
                    break;
                }
                case "protein": {
                    for (int i = 0; i < tempt.size(); i++) {
                        if (tempt.get(i).getProtein() < num) {
                            tempt.remove(i);
                        }
                    }
                    break;
                }
                default: {

                }
            }
        } else {
            switch (s) {
                case "carbon": {
                    for (int i = 0; i < tempt.size(); i++) {
                        if (tempt.get(i).getCarbon() > num) {
                            tempt.remove(i);
                        }
                    }
                    break;
                }
                case "phosphorous": {
                    for (int i = 0; i < tempt.size(); i++) {
                        if (tempt.get(i).getPhosphorous() > num) {
                            tempt.remove(i);
                        }
                    }
                    break;
                }
                case "nitrogen": {
                    for (int i = 0; i < tempt.size(); i++) {
                        if (tempt.get(i).getNitrogen() > num) {
                            tempt.remove(i);
                        }
                    }
                    break;
                }
                case "cost": {
                    for (int i = 0; i < tempt.size(); i++) {
                        if (tempt.get(i).getCost() > num) {
                            tempt.remove(i);
                        }
                    }
                    break;
                }
                case "fat": {
                    for (int i = 0; i < tempt.size(); i++) {
                        if (tempt.get(i).getFat() > num) {
                            tempt.remove(i);
                        }
                    }
                    break;
                }
                case "protein": {
                    for (int i = 0; i < tempt.size(); i++) {
                        if (tempt.get(i).getProtein() > num) {
                            tempt.remove(i);
                        }
                    }
                    break;
                }
                default: {

                }
            }
        }
        return tempt;
    }

    public void search(String word) {

    }
}
