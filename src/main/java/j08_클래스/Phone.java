package j08_클래스;

public class Phone {
    String  company;
    String  model;

    Phone(){}

    Phone(String c,String m){
        System.out.println("생성자 호출?");
        System.out.println();
        company =c;
        model = m;

    }
    void  printPhoneCompany(){
        System.out.println("제조사 : "+company);
        System.out.println();
    }
    void  printPhoneModel(){
        System.out.println("모델명: "+model);
        System.out.println();
    }
}

