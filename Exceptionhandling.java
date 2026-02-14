class Exception1{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("Cannot divided by zero");
        }
        System.out.println("Program is running successfully");
    }
}

class Exception2{
    public static void main(String[] args) {
        String str=null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Null pointer exception"+ e.getMessage());
        }
        System.out.println("Program is running successfully");
    }
}


class Exception3{
    public static void main(String[] args) {
        int[] arr=new int[5];
        try{
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is oout of bounds"+ e.getMessage());
        }
        System.out.println("Program continues after handling the exception");
    }
}


class Exception4{
    public static void main(String[] args) {
        String str="abc";
        try{
            int num=Integer.parseInt(str);
            System.out.println(num);
        }
        catch(NumberFormatException e){

            System.out.println("Cannot convert number into string"+ e.getMessage());
        }
        System.out.println("Program continues after handling the exception");
    }
}

class Exception5{
    public static void main(String[] args) {
        try{
            int result=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Caught an Arithmatic expression"+ e.getMessage());
        }
        finally{
            System.out.println("This block will always executes");
        }
        System.out.println("Programs Continue after handling the exception");
    }
}


class Exceptionthrow{
    public static void main(String[] args) {
        int a=1;
        if(a<0){
            throw new IllegalArgumentException("Value cannot be negative"+a);
        }
        System.out.println("Value is"+a);
    }

}

class Exceptionthrows{
    public static void main(String[] args){
        try{
            methodThatThrowsException();
        }
        catch(Exception e){
            System.out.println("Caught an exception:"+e.getMessage());
        }
    }
    public static void methodThatThrowsException() throws Exception{
        throw new Exception("This is a custom exception");
    }
}
