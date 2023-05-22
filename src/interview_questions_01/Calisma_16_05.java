package interview_questions_01;

import java.util.Scanner;

public class Calisma_16_05 {

    public static void main(String[] args) {
        changetoasterixlowercases();

        /*Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
    işaretiyle yazdırmak için gereken kodu yazınız.
    Örneğin; 75.4238 ´ *4*2*3*8
            1. Yol:
     */
        double num = 75.4238;
        String s1 = String.valueOf(num);
        int idxOfComma = s1.indexOf(".");
        String decimalPart = s1.substring(idxOfComma + 1);
        String t = "";
        for(int i=0; i<decimalPart.length(); i++){
            String r = decimalPart.substring(i,i+1);
            t = t + "*" + r;
        }
        System.out.println(t);

        sekil();

        /*
        Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.

        A A A A A A A A
        A X X X X X X A
        A X X X X X X A
        A A A A A A A A

         */
        //1. Yol:
        int rows = 4, columns = 8;
        for(int i=1; i<=rows; i++){
            String s = "";
            if(i==1 || i==rows){
                for(Integer k=1; k<=columns; k++){
                    s = s + "A ";
                }
                System.out.println(s);
            }else{
                s = s + "A ";
                for(Integer m=2; m<columns; m++){
                    s = s + "X ";
                }
                s = s + "A ";
                System.out.println(s);
            }
        }
    }


    public static String unique_nums (int x){
        String y = String.valueOf(x);
        for (int i=1; i<y.length(); i++){

        }

        return y;
    }

    public static String uniqueNum(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num=input.nextInt();
        String number=String.valueOf(num);
        String s="";
        for (int i=0;i<number.length();i++){
            String str=number.substring(i,i+1);
            if (number.indexOf(str)==number.lastIndexOf(str)){

                s+=str;

            }
        }
        return s;
    }



    // Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.

    // A A A A A
    // A A A A A
    // A A A A A
    public static void sekil(){

        for (int i=0; i<3;i++){

            for (int y=0; y<6;y++){

                System.out.print("A");
            }
            System.out.println();

        }

    }


    //String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.

    public static void changetoasterixlowercases(){
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen adınızı ve soyadınızı giriniz");
        String name=input.nextLine();
        String name2="";
        for (int i = 0; i < name.length(); i++) {
            if (name.substring(i,i+1).replaceAll("[^a-z]","").length()==0){
                name2=name2+name.substring(i,i+1);
            }else name2=name2+"*";
        }
        System.out.println(name2);
    }

}
