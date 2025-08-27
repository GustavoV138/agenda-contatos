package com.agenda.repositories;

import com.agenda.entities.Contato;
import com.agenda.entities.Endereco;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContatoRepository {


    Connection conn;
    Statement st;
    PreparedStatement stmt;

    // Credenciais do banco
    private final String DB_URL = "jdbc:h2:mem:agenda_db;DB_CLOSE_DELAY=-1";
    private final String USER_DB = "sa";
    private final String PASS_DB = "";

    public void inicializarTabela() {

        try {
            // Abrindo uma conexao
            conn = DriverManager.getConnection(DB_URL, USER_DB, PASS_DB);
            System.out.println("Conexão estabelecida!");

            // Passando uma query SQL
            // Abrindo o st
            st = conn.createStatement();
            st.executeUpdate("CREATE TABLE IF NOT EXISTS contatoTb (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "telefone VARCHAR(11) UNIQUE," +
                    "email VARCHAR(100) )");

            conn.close();
            st.close();

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao DB\n" + e.getMessage());
        }
    }

    public void adicionarDB(Contato contato){

        String sql = "INSERT INTO contatoTb (nome, telefone, email) VALUES (?, ?, ?)";

        try {
            conn = DriverManager.getConnection(DB_URL, USER_DB, PASS_DB);

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getTelefone());
            stmt.setString(3, contato.getEmail());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Contato> consultarTudo(){
        List<Contato> agenda = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(DB_URL, USER_DB, PASS_DB);

            String sql = "SELECT * FROM contatoTb";

            st = conn.createStatement();
            ResultSet result = st.executeQuery(sql);

            while(result.next()) {
                String nome = result.getString("nome");
                String telefone = result.getString("telefone");
                String email = result.getString("email");
                Endereco endereco = null;
                Contato contato = new Contato(nome, telefone, email, endereco);
                agenda.add(contato);
            }

            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return agenda;
    }

}


