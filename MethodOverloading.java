public class MethodOverloading {
    double avg(int a, int b) {
        double avg = (a + b) / 2; // Ensure the division results in a double
        return avg;
    }

    double avg(int a, int b, int c) {
        double avg = (a + b + c) / 3; // Ensure the division results in a double
        return avg;
    }

    double avg(int a, int b, int c, int d) { // Correct method name
        double avg = (a + b + c + d) / 4; // Ensure the division results in a double
        return avg;
    }

    public static void main(String[] args) {
        MethodOvloading load = new MethodOvloading();
        System.out.println("Average = " + load.avg(23, 32)); 
        System.out.println("Average = " + load.avg(23, 32, 45)); 
        System.out.println("Average = " + load.avg(23, 32, 45, 50)); 
    }
}
