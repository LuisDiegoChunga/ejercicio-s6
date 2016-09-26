package ejercicioWithoutSE;

public class Account {
    private String tipo;
    private String numeroDeCuenta;
    private int monto;

    public Account(String tipo, String numeroDeCuenta, int monto) {
        this.tipo = tipo;
        this.numeroDeCuenta = numeroDeCuenta;
        this.monto = monto;
    }

    
    
    public void deuda(int deuda) throws Exception{
        if(monto <= 500){
            throw new Exception("Balance minimo deberia ser sobre 500");
        }
        
        monto = monto - deuda;
        System.out.println("Ahora el monto es " + monto);
    }
    
    public void transferir(Account from, Account to, int montoCredito) throws Exception{
        if(from.monto <= 500){
            throw new Exception("Balance minimo deberia ser sobre 500");
        }
    }
    
    public void enviarMensajeAdvertencia(){
        if(monto <= 500){
            System.out.println("Monto deberia ser sobre 500");
        }
    }
    
}
