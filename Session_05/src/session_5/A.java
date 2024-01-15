
package session_5;

public class A {
    final int a; // cannot change its value

    public A() {
        a = 100;
    }

    public void get() // can be overridden in subclasses
    {
        System.out.println("In get() of A");
    }
}
