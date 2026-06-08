/*Write a Java program to demonstrate that a private member of a superclass cannot be accessed directly from a derived class.
*/
package src;

class Privsuper {
    private int privateData = 42;
    public int getPrivateData() {
        return privateData;
    }
}


class Privchild extends Privsuper {
    public void showPrivateData() {
        System.out.println("Private Data : " + getPrivateData());
    }
}

public class PrivateMemberDemo {
    public static void main(String[] args) {
        Privchild obj = new Privchild();
        obj.showPrivateData();
    }
}