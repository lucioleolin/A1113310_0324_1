import java.util.Scanner;

class Animal{
    String name;
    double height;
    int weight;
    int speed;

    void show(){
        System.out.println("name\theight\tweight\tspeed");
        System.out.println(name+"\t"+height+"\t"+weight+"\t"+speed);
    }
    double distance(double x, double y){
        return x*y*speed;
    }
    double distance(double x){
        return x*speed;
    }
}

public class A1113310_0324_1{
    public static void main(String [] args){
        Animal animal1, animal2, animal3, animal4;

        animal1 = new Animal();
        animal2 = new Animal();
        animal3 = new Animal();
        animal4 = new Animal();

        animal1.name="monkey";
        animal1.weight=52;
        animal1.height=1.1;
        animal1.speed=100;
        animal1.show();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter time : ");
        double x = sc.nextDouble();
        System.out.print("Enter acceleration: ");
        double y = sc.nextDouble();
        System.out.println("monkey distance: "+animal1.distance(x, y));
        System.out.println();
        
        animal2.name="Donkey";
        animal2.weight=99;
        animal2.height=1.5;
        animal2.speed=200;
        animal2.show();
        System.out.print("Enter time : ");
        double a = sc.nextDouble();
        System.out.print("Enter acceleration: ");
        double b = sc.nextDouble();
        System.out.println("donkey distance: "+animal2.distance(a, b));
        System.out.println();

        animal3.name="Anna";
        animal3.weight=48;
        animal3.height=1.7;
        animal3.speed=120;
        animal3.show();
        System.out.print("Enter time : ");
        double c = sc.nextDouble();
        System.out.print("Enter acceleration: ");
        double d = sc.nextDouble();
        System.out.println("Anna distance: "+animal3.distance(c, d));
        System.out.println();

        animal4.name="Aisyah";
        animal4.weight=50;
        animal4.height=1.7;
        animal4.speed=120;
        animal4.show();
        System.out.print("Enter time : ");
        double e = sc.nextDouble();
        System.out.print("Enter acceleration: ");
        double f = sc.nextDouble();
        System.out.println("Aisyah distance: "+animal4.distance(c, d));
        System.out.println();

    
    }
}
