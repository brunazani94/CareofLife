
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {

    // Informações do banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/careoflife";
    private static final String USUARIO = "root";
    private static final String SENHA = "c@reoflife";

    public static Connection conectar() {
        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelece a conexão com o banco de dados
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão estabelecida com sucesso!");
            return conexao;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Erro ao conectar ao banco de dados: " + ex.getMessage());
            return null;
        }
    }

    public static void desconectar(Connection conexao) {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
                System.out.println("Conexão fechada com sucesso!");
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao fechar a conexão: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Connection conexao = conectar();
        if (conexao != null) {
            // Faça suas operações no banco de dados aqui
            desconectar(conexao);
        } else {
            System.out.println("Usuário ou senha incorretos. Verifique suas credenciais.");
        }

    }
}
