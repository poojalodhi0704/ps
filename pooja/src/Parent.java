/**
 * Created by Mario on 8/23/16.

import java.io.*;

public class Parent {
    void msg()
    {
        System.out.println("parent");
    }}
    class Child extends Parent
    {
        void msg() throws IOException {
            System.out.println("child");
        }
     public static void main(String...as)
     {
         Parent p1=new Parent();
         p1.msg();
         System.out.println("flow is normal");
     }



}
*/
