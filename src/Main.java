import exceptions.ExceptionInvalidNumber;
import model.Producto;
import model.cuentas.CuentaAhorro;
import model.cuentas.CuentaCorriente;
import model.tarjetas.TarjetaCredito;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresar N° de Banco. Tenemos: ");
            System.out.println("1)Banco Santa Fe.");
            System.out.println("2)Banco Provincia.");
            System.out.println("3)Banco Nación.");
            System.out.println("4)Banco ICBC");
            int numBanco = sc.nextByte();
            if(numBanco<=0 || numBanco > 4) throw new ExceptionInvalidNumber("El número de Banco sólo puede ser del 1 al 4");
            System.out.println("--------------------------------");

            System.out.println("Ingresar N° de Sucursal. Tenemos: ");
            System.out.println("1: Las Toscas.");
            System.out.println("2: Villa Ocampo.");
            int numSucursal = sc.nextByte();
            if(numSucursal<=0 || numSucursal > 2) throw new ExceptionInvalidNumber("El número de Sucursal sólo puede ser del 1 al 2");

            System.out.println("--------------------------------");

            System.out.println("Ingresar tipo de producto:");
            System.out.println("1: Cuenta de ahorro.");
            System.out.println("2: Cuenta corriente.");
            System.out.println("3: Tarjeta de crédito");
            int tipoProducto= sc.nextByte();
            if(tipoProducto<=0 || tipoProducto > 3) throw new ExceptionInvalidNumber("El número para Tipo de Producto sólo puede ser del 1 al 3");

            System.out.println("--------------------------------");

            Producto producto = null;

            switch (tipoProducto){
                case 1:
                    producto= new CuentaAhorro(numBanco,numSucursal);
                    break;
                case 2:
                    producto= new CuentaCorriente(numBanco,numSucursal);
                    break;
                case 3:
                    System.out.println("Definir clave de seguridad:");
                    int claveSeguridad = sc.nextByte();
                    producto= new TarjetaCredito(numBanco,numSucursal,claveSeguridad);
                    break;
            }

            if (producto != null){
                producto.mostrarProducto();
            }

        } catch (ExceptionInvalidNumber e) {
            System.out.println("El número ingresado es incorrecto: " + e.getMessage());
            e.printStackTrace();
        } catch (InputMismatchException e){
            System.out.println("El tipo de dato ingresado no corresponde al esperado. Debe ser entero");
        }



    }

}