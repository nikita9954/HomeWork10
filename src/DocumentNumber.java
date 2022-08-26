
public class DocumentNumber {
    StringBuilder numberdocument=new StringBuilder();
    void method(){
        numberdocument.delete(4,10);
        numberdocument.delete(8,18);
        System.out.println(numberdocument);
    }
    void method1(){
        numberdocument.replace(5,9,"****");
        numberdocument.replace(15,19,"****");
        System.out.println(numberdocument);
    }
    void method2(){
        numberdocument.delete(0,5);
        numberdocument.delete(4,10);
        numberdocument.delete(8,13);
        String c="Letters:";
        String d=numberdocument.toString();
        d.toUpperCase();
        System.out.println(c.concat(d));
    }
}
