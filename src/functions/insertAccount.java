package functions;
import objects.*;

import java.sql.Statement;

public class insertAccount {
    public insertAccount(Account acc){
        try{
            Statement stmt = new functions.Statement().getStatement();
            String query = "INSERT INTO account (name, surname, birthday, birthTown, email, username, password) " +
                    "VALUES ('"+acc.getName()+"', '"+acc.getSurname()+"', '"+acc.getBirthday()+"', '"+acc.getBirthTown()+"', " +
                    "'"+acc.getEmail()+"', '"+acc.getUserName()+"','"+acc.getPassword()+"')";
            System.out.println(query);
            stmt.executeUpdate(query);
            System.out.println("Account di "+acc.getName()+" "+acc.getSurname()+" inserito con successo!");
        }catch(java.sql.SQLException e){
            System.out.println("Errore nell'inserimento dell'account di "+acc.getName()+" "+acc.getSurname()+": ");
            System.out.println(e);
        }
    }
}
