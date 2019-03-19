public class Result {
     static void Addition1 ( int m, int s, int e)
             //m stands for maths marks out from 100
             //s stands for science marks out from 100
             //e stands for english marks out from 100
     {
         System.out.println("Marksheet1");
         System.out.println("Total =" + (m + s + e));
         System.out.println("Pecentage = " + (m + s + e) * 100 / 300);
         //where 300 is total marks of all three subjects
     }
    static void Addition2 ( int x, int y, int z)
    //x stands for maths marks out from 100
    //y stands for science marks out from 100
    //z stands for english marks out from 100
    {
        System.out.println("Marksheet2");
        System.out.println("Total2 =" +(x + y + z));
        System.out.println("Pecentage = " + (x +y +z) * 100 / 300);

        //where 300 is total marks of all three subjects
    }
    public static void main(String[] args)
        {
            Addition1(85,75,70);
            Addition2(60,65,65);
        }

    }







