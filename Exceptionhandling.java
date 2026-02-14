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
