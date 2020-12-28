package Test;

import java.util.*;

public class CountChar {

    public Map<Character,Integer> getChartOccurence(String str){
        Map<Character ,Integer> mapValues = new HashMap<Character ,Integer>();
        char[] arrayStr = str.toCharArray();
        for(Character c : arrayStr){
            if(mapValues.containsKey(c)){
                 mapValues.put(c,mapValues.get(c) +1);
            }else{
                 mapValues.put(c,1);
            }
        }
        return mapValues;
    }

    public static void addElem(String str){
        List<String> list = Arrays.asList("test","test2");
        List<String> list2 = List.copyOf(list);
        list2.add(str);
        System.out.println(list.get(0));
    }

    public void pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Rows You Want In Your Pyramid?");
        int noOfRows = sc.nextInt();

        int rowCount = 1;
        System.out.println("Here Is Your Pyramid");

        for (int i = noOfRows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();

            rowCount++;
        }
    }

    public static void main(String... args) {
        {
            CountChar.addElem("ed");
        }
    }
}
