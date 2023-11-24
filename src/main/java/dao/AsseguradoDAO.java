package dao;
import factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;

public class AsseguradoDAO { 
    private final Connection connection;
    Long id;
    String nome;
    String cpf;
    String endereco;
    String telefone;
    
    public AsseguradoDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 

    /**
     *
     * @param assegurado
     */
    public void adiciona(Dados_Assegurado assegurado){ 
        String sql = "INSERT INTO usuario(nome,cpf,endereco,telefone) VALUES(?,?,?,?)";
        try { 
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, assegurado.getNome());
                stmt.setString(2, assegurado.getCpf());
                stmt.setString(3, assegurado.getEndereco());
                stmt.setString(4, assegurado.getTelefone());
                stmt.execute();
            }
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 

    private static class Dados_Assegurado {

        public Dados_Assegurado() {
        }

        private String getNome() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getCpf() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getEndereco() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getTelefone() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}