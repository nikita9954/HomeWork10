public class DocumentNumber {
    StringBuilder numberdocument = new StringBuilder();

    void method() {
        numberdocument.delete(4, 10);
        numberdocument.delete(8, 18);
        System.out.println(numberdocument);
    }
    void method1() {
        numberdocument.replace(5, 9, "****");
        numberdocument.replace(15, 19, "****");
        System.out.println(numberdocument);
    }
    void method2() {
        numberdocument.delete(0, 5);
        numberdocument.delete(4, 10);
        numberdocument.delete(8, 13);
        String c = "Letters:";
        String d = numberdocument.toString();
        d = d.toUpperCase();
        System.out.println(c.concat(d));
    }
    void method4() {
        String d = numberdocument.toString();
        if (d.startsWith("5555")) {
            System.out.println("Начинается с 1356");
        } else System.out.println("Нет");
    }
    void method3() {
        String d = numberdocument.toString();
        if (d.contains("tynd")) {
            System.out.println("Да cостоит");
        } else {
            System.out.println("Нет");
        }
    }
    void method5() {
        String d = numberdocument.toString();
        if (d.endsWith("1443")) {
            System.out.println("Да заканчивается");
        } else {
            System.out.println("Нет");
        }
    }
    void method6() {
        numberdocument.reverse();
        System.out.println(numberdocument);
    }
}
