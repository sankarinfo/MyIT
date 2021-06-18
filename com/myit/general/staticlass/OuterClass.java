package com.myit.general.staticlass;

public class OuterClass {
	private static String msg = "GeeksForGeeks";
	  
    public static class NestedStaticClass {
  
        public void printMessage()
        {
  
            System.out.println(
                "Message from nested static class: "
                + msg);
        }
    }
  
    public class InnerClass {
        public void display()
        {
            System.out.println(
                "Message from non-static nested class: "
                + msg);
        }
    }
    
    
    public static void main(String args[])
    {
        OuterClass.NestedStaticClass printer
            = new OuterClass.NestedStaticClass();
  
        printer.printMessage();
  
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner
            = outer.new InnerClass();
  
        inner.display();
  
        OuterClass.InnerClass innerObject
            = new OuterClass().new InnerClass();
  
        innerObject.display();
    }
}