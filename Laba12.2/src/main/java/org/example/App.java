package org.example;
public class App {
    public static void main(String[] args) {
        Tester  tst = new Tester("Vlad","Khab");
        Tester  tst2 = new Tester("Vlad","Khab",24);
        Tester  tst3 = new Tester("Vlad","Khab",24, "Norm" );
        tst.printInfo();
        tst2.printInfo("Титл");
        tst3.printInfo("Еще Титл", true);
        Tester.staticMethod();
    }
}

