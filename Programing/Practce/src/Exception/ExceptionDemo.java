package Exception;

//public class ExceptionDemo {
// InvalidAgeException
    public class ExceptionDemo extends Exception {
        public ExceptionDemo(String message) {
            super(message);
        }
    }

    class MainFork {
        public static void validateAge(int age) throws ExceptionDemo {
            if (age < 18) {
                throw new ExceptionDemo("Age must be 18 or above.");
            } else {
                System.out.println("Valid age.");
            }
        }
    }




//    public static void show() {
//        // Catching Multiple Exception
//        try {
//            var reader = new FileReader("file.txt");
////            var value = reader.read();
//        }
//        catch (IOException e){
//
//            e.printStackTrace();
//        }
//        // Polymorphism
// //            System.out.println("fuck you the file dose not exist");
////        }
////        public static void sayfuck(String name){
////        System.out.println(name.toLowerCase());
////    }

//    }

