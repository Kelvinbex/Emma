import java.util.Scanner;

public class App {

    public static void sumar(){
        int a = 2001;
        int b = 2023;
        int c = a - b;
        System.out.println("La suma es: " + c);
    }

    public static void acceder(){
        String usuario ="Kelvin";
        int password = 12345;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        String user = sc.nextLine();
        System.out.print("Ingrese su password: ");
        int pass = sc.nextInt();

        if(user.equals(usuario) && pass == password){
            System.out.println("Bienvenido " + user);
        }else{  
            System.out.println("Usuario o contraseña incorrecta");
        }

    }
    public static void main(String[] args) throws Exception {
        String name = "Noma";
        String apellido ="Obamedo";
        int edad = 22;
        System.out.println("Mi nombre es " + name +" " + apellido + " "+ "tengo " + edad + " años");
        sumar();

        acceder();
    }
}
