interface Test8 {
    void m1(int x,String s);
}
class Test1{
public static void main(String[] args) {



Test8 i =(x, s) ->{
        System.out.println(x+","+s);
};
i.m1(1,"Hello");
     }}




