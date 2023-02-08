public class Main {
    public static void main(String[] args) {
        System.out.println(getFactorial(0));;
    }
//    public static void method(int a) {
//        try {
//            System.out.println(a < 1);
//        }catch (RuntimeException e){
//            e.printStackTrace();
//        }finally{
//            System.out.println("Финиш");
//        }
//        int result = 1;
//        for (int i = 1; i < a; i++) {
//            result = result * i;
//        }
//        System.out.println(result);
//    }
public static int getFactorial(int num){

    int result=1;
    try{
        if(num<1) throw new Exception("The number is less than 1");

        for(int i=1; i<=num;i++){
            result*=i;
        }
    }
    catch(Exception ex){

        System.out.println(ex.getMessage());
        result=num;
    }
    return result;
}
}