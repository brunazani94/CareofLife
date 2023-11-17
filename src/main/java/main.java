

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Bruna
 */
public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver carregado com sucesso!");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            System.out.println("Driver nao pode ser carregado!");
        }
    }
}
