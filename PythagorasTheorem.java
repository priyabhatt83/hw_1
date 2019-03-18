public class PythagorasTheorem {

    public static void main(String[] args){

        int side1 = 10; //side1 is a one side of right angled triangle
        int side2 = 20; //side2 is second side of right angled triangle

        //to count hypotenuse side3, we use Phythagoras theorem equation


        double hypotenuse = Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2));

        System.out.println("Hypotenuse side3 ="+hypotenuse);
    }
}
