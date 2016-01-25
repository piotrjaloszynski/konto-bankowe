package bank;
//test


/**
 * Created by Gosia on 2016-01-24.
 */public class Switchu {
    public static void main(String[] args) {
        int age ;
        age=3;

            switch (age) {
            case 1:
                System.out.println("You are too young for going alone to kinderparty");
                break;
            case 2:
                System.out.println("You can go alone with mom");
                break;
            case 3:
                System.out.println("You are grown up - enjoy your time");
           break;
            case 4:
                System.out.println("You can start your school");
                break;
            default:
                System.out.println("Started going to school");
        }
    }}
