public class Singleton {
    //对uniqueInstance分配内存空间
    private volatile static Singleton uniqueInstance;

    //初始化
    private Singleton(){
    }

    //将uniqueInstance指向分配的内存地址
    public static Singleton getUniqueInstance(){
        if (uniqueInstance == null) {
            synchronized (Singleton.class){
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

//    public static void main(String[] args) {
//        String str1 = "str";
//        String str2 = "ing";
//
//        String str3 = "str" + "ing";//常量池中的对象
//        String str4 = str1 + str2; //在堆上创建的新的对象
//        String str5 = "string";//常量池中的对象
//        System.out.println(str3 == str4);//false
//        System.out.println(str3 == str5);//true
//        System.out.println(str4 == str5);//false
//
//        System.out.println("===============>");
//        Integer i1 = 40;//Integer i1=40；Java 在编译的时候会直接将代码封装成 Integer i1=Integer.valueOf(40);，从而使用常量池中的对象。
//        Integer i2 = new Integer(40);//Integer i1 = new Integer(40);这种情况下会创建新的对象。
//        System.out.println(i1==i2);//输出 false
//    }
    public static void main(String[] args) {
        byte[] allocation1, allocation2,allocation3,allocation4,allocation5;
        allocation1 = new byte[32000*1024];
        allocation2 = new byte[1000*1024];
        allocation3 = new byte[1000*1024];
        allocation4 = new byte[1000*1024];
        allocation5 = new byte[1000*1024];
    }

}
