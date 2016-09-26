package ejercicioWithSE;

public class Account {
    private String tipo;
    private String numeroDeCuenta;
    private int monto;

    public Account(String tipo, String numeroDeCuenta, int monto) {
        this.tipo = tipo;
        this.numeroDeCuenta = numeroDeCuenta;
        this.monto = monto;
    }
    
    private boolean cuentaBajoFlujo(){
        return monto <= 500;
    }
    
    
    public void deuda(int deuda) throws Exception{
        if(cuentaBajoFlujo()){
            throw new Exception("Balance minimo deberia ser sobre 500");
        }
        
        monto = monto - deuda;
        System.out.println("Ahora el monto es " + monto);
    }
    
    public void transferir(Account from, Account to, int montoCredito) throws Exception{
        if(cuentaBajoFlujo()){
            throw new Exception("Balance minimo deberia ser sobre 500");
        }
    }
    
    public void enviarMensajeAdvertencia(){
        if(cuentaBajoFlujo()){
            System.out.println("Monto deberia ser sobre 500");
        }
    }
}
