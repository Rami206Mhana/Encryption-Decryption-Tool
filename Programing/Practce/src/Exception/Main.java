package Exception;

import static Exception.MainFork.validateAge;

public class Main {
    public static void main(String [] args){

        try {
            validateAge(16);
        } catch (ExceptionDemo e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
//        ExceptionDemo.show();
    }

