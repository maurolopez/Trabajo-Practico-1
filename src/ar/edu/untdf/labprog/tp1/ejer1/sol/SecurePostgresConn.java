package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Mauro Federico Lopez
 */
public class SecurePostgresConn implements Conn {

    @Override
    public void connect() {
        System.out.println("Conectado a Postgres en forma segura");
    }

    @Override
    public void query() {
        System.out.println("Consultando en Postgres de forma segura");
    }
}
