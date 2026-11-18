package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    // =====================================================================
    // EP3: completa los datos de conexión de tu laboratorio.
    //
    //   Formato de URL según el motor:
    //     MySQL  -> jdbc:mysql://<servidor>:<puerto>/<base_de_datos>
    //     Oracle -> jdbc:oracle:thin:@<servidor>:<puerto>/<servicio>
    // =====================================================================
    private static final String URL = "jdbc:mysql://localhost:3306/cursos_capacitacion";
    private static final String USUARIO = "alumno_java";
    private static final String CLAVE = "CambiarEstaClave2026!";

    private ConexionBD() {
    }

    /**
     * @return una conexión abierta a la base de datos. Quien la utiliza debe cerrarla.
     * @throws SQLException si no es posible conectarse.
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CLAVE);
    }
}