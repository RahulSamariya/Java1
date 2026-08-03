public class varargs {
    public static void main(String[] args) {

        // varargs = allow a method to accept the varying # arguments
        //           makes methods, more flexible, no need for overloaded methods
        //           java will pack the arguments into array
        //           ... (ellipis)

        System.out.println(average(5, 10));
    }
    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return  0;
        }

        for(double num : numbers){
            sum += num;
        }

        return sum / numbers.length;
    }


}
