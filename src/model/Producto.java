package model;

public abstract class Producto {
    private int banco;
    private int sucursal;
    private int numProducto;
    private static int contadorNumP = 0;


    public Producto(int banco, int sucursal){
        this.banco = banco;
        this.sucursal = sucursal;
        this.numProducto = Producto.contadorNumP + 1;
        Producto.contadorNumP++;
    }

    public int getBanco() {
        return banco;
    }
    public void setBanco(int banco) {
        this.banco = banco;
    }
     public int getSucursal(){
        return sucursal;
     }
     public void setSucursal(int sucursal){
        this.sucursal = sucursal;
     }
    public int getNumProducto(){
        return numProducto;
    }



    public void mostrarProducto(){

    }

}
