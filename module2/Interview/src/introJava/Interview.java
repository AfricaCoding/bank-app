package introJava;

public class Interview {
    public static void main(String[]args){

        long valeur= 10L;
        int [] tableau= {1,15,30,20,40,60};

        int count=0;

        for(int i=0;i<tableau.length; i++){
            if (tableau[i]%2 !=0) {
                System.out.println(tableau[i]);
            }else {

//                continue;
            }
            count++;
        }
        System.out.println("count "+ count);

        try{
            int a= 6;
            int b= 0;
            int div= a/b;

        } catch(ArithmeticException e)  {
            System.out.println(" un nombre ne peut etre diviser par 0, entrez un nombre >0");

        }


//        int count=0;
//        while(count<tableau.length){
//            if (tableau[count]%2 !=0) {
//                System.out.println(tableau[count]);
//            }else {
//                continue;
//
//            }
//            count++;
//            System.out.println("count" + count);
//        }

    }
}
