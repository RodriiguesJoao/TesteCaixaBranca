    package login;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.Statement;
    
    /**
     * Classe responsável por gerenciar a conexão com o banco de dados
     * e realizar a verificação de usuários.
     */
    public class User {
    
        /**
         * Estabelece uma conexão com o banco de dados.
         *
         * @return Um objeto {@link Connection} se a conexão for bem-sucedida, ou {@code null} caso contrário.
         */
        public Connection conectarBD() {
            Connection conn = null;
            try {
                Class.forName("com.mysql.Driver.Manager").newInstance();
                String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
                conn = DriverManager.getConnection(url);
            } catch (Exception e) {
                // Tratamento de exceção ausente
            }
            return conn;
        }
    
        /**
         * Realiza a verificação de um usuário no banco de dados com base no login e senha fornecidos.
         *
         * @param login O login do usuário a ser verificado.
         * @param senha A senha do usuário a ser verificada.
         * @return {@code true} se o usuário foi encontrado e a autenticação foi bem-sucedida, 
         *         ou {@code false} caso contrário.
         */
        public boolean verificarUsuario(String login, String senha) {
            String sql = "";
            Connection conn = conectarBD();
            boolean result = false;
    
            // Início da verificação
            sql += "select nome from usuarios ";
            sql += "where login = '" + login + "'";
            sql += " and senha = '" + senha + "';";
            
            try {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    result = true;
                    String nome = rs.getString("nome");
                }
            } catch (Exception e) {
                // Tratamento de exceção ausente
            }
    
            return result;
        }
    }    