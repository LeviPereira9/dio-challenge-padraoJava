package edu.dio;

public class App {
    public static void main(String[] args) throws Exception {
        Teste test = new Teste();
        System.out.println(test);
        test = new Teste();
        System.out.println(test);

        SingletonLazy instanceLazy = SingletonLazy.getInstance();
        System.out.println(instanceLazy);
        instanceLazy = SingletonLazy.getInstance();
        System.out.println(instanceLazy);

        SingletonEager instanceEager = SingletonEager.getInstance();
        System.out.println(instanceEager);
        instanceEager = SingletonEager.getInstance();
        System.out.println(instanceEager);

        SingletonLazyHolder instanceLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(instanceLazyHolder);
        instanceLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(instanceLazyHolder);
    }
}
