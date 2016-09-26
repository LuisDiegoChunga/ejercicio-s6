package ejercicioWithSE;

public class ShotgunSurgery {

    public static void main(String[] args) throws Exception {
        Account acc = new Account("Personal", "AC1234", 10000);
        acc.deuda(500);
        acc.enviarMensajeAdvertencia();
    }
    
}
