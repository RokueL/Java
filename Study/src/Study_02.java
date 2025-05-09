public class Study_02
{
    public static void main(String[] args)
    {
        Test t = new Test();
        Test t1 = new Test();

        System.out.println(t.ReturnTest());
        Test.count++;
        System.out.println(t.ReturnTest());
        System.out.println(t1.ReturnTest());
        Test.count++;
        System.out.println(t.ReturnTest());
        System.out.println(t1.ReturnTest());
    }
}
