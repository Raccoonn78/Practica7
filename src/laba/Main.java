package laba;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author mutagen
 */
public class Main {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int l=0;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);

        }
        Collections.shuffle(arr);
        System.out.println(arr);
        Integer[] shuffledArray = arr.toArray(new Integer[0]);

        List<Integer> Player1 = new ArrayList<>();
        List<Integer> Player2 = new ArrayList<>();
        for(int j=0;j<10;j++){
            if(j<5){
                Player1.add(arr.get(j));
            }else {
                Player2.add(arr.get(j));
            }
        }
        System.out.println(Player1);
        System.out.println(Player2);


        int nun=0;
        int summ=0;
        System.out.println(Player1.size());
        System.out.println(Player2.size());
        while (Player1.size()>0 && Player2.size()>0) {
    if(summ>106){break;}
                if((Player1.get(nun) == 0) || (Player2.get(nun) == 0)) {
                        if(Player1.get(nun) == 0 && Player2.get(nun) == 9) {
                    Player1.add(Player1.get(nun));
                    Player1.add(Player2.get(nun));
                    Player1.remove(nun);
                    Player2.remove(nun);
                    System.out.println(Player1);
                    System.out.println(Player2);
                    System.out.println("-----0--9-");
                        }else{
                                if((Player1.get(nun) == 0) && (Player2.get(nun) < 9)) {
                                    Player2.add(Player2.get(nun));
                                    Player2.add(Player1.get(nun));
                                    Player2.remove(nun);
                                    Player1.remove(nun);
                                    System.out.println(Player1);
                                    System.out.println(Player2);
                                    System.out.println("--0-->--9--");
                                }else{
                                        if((Player1.get(nun) < 9) && (Player2.get(nun) == 0)) {
                                            Player1.add(Player1.get(nun));
                                            Player1.add(Player2.get(nun));
                                            Player1.remove(nun);
                                            Player2.remove(nun);
                                            System.out.println(Player1);
                                            System.out.println(Player2);
                                            System.out.println("--9--<--0--");
                                                                                               }
                                   }
                            }
                }else{
                        if(Player1.get(nun) > Player2.get(nun)) {
                            Player1.add(Player1.get(nun));
                            Player1.add(Player2.get(nun));
                            Player1.remove(nun);
                            Player2.remove(nun);
                            System.out.println(Player1);
                            System.out.println(Player2);
                            System.out.println("--1---w--2-");
                        }else{
                            Player2.add(Player2.get(nun));
                            Player2.add(Player1.get(nun));
                            Player2.remove(nun);
                            Player1.remove(nun);
                            System.out.println(Player1);
                            System.out.println(Player2);
                            System.out.println("--2---w--1-");

                }
            }
summ=summ+1;
        }

        if(summ>106){
            System.out.println("Botva");
        }else {
        if(Player1.size()==0){
            System.out.println(Player2);
            System.out.println(summ);
            System.out.println("Игрок два выиграл");
        }else {
            System.out.println(Player1);
            System.out.println(summ);
            System.out.println("Игрок один выиграл");
        }}


    }
}
