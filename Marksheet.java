public class Marksheet {

    public static void main(String[] args) {
    // three main subjects are maths,science and english
        int Maths = 70; // 70 marks out of 100
        int Science = 80; //85 marks out of 100
        int English = 70;  //75 marks out of 100

       int Score = Maths + Science + English;
       int Totalmarks = 300;

       int Percentage = Score * 100 / Totalmarks;


        System.out.println("The Percentage is ="+Percentage);
    }
}
