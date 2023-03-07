package Controllers;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import libraryClasses.*;

/**
 * 
 *      +--------------------------+
 *      |                          |
 *      |  @author BenjaminFisico! |
 *      |                          |
 *      +--------------------------+
 *  This class serves as a mediator between the program and the databased.
 *  - Conection is open when is necessary using ConOpen() method, then is closed using ConClosed() method,
 *  that process is used in all other methods.
 * - The methods are now static, it is to ease call it.
 */
public class DbController {
    
    private static Connection con;
    private static PreparedStatement stmt = null;
    
    // Constructor
    public DbController(){}
    
    /**
      This method is used to open connection with your database!
      You must not forget to close.
    */
    private static void ConOpen(){
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/librarymanagementsystem?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC" , "root", "123698745");
        }catch (SQLException ex) {
            Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
      This method is used to execute SQL SELECT query in the database.
      @param query Sets execute query.
      @return ResultSet An object containing all database responses or null if it is the case.
    */
    private static ResultSet ExecuteSelectQuery(String query){
        try{
            stmt = con.prepareStatement(query);
            return stmt.executeQuery();
        } catch (SQLException ex){
            Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /**
      This method is used to obtain rows of member table in database.
      @param condition It indicate member search condition in SQL syntax (WHERE CLAUSE).
      @return ArrayList A list that contains all obtained members.
    */
    public static ArrayList GetMembers(String condition){
        ArrayList<Member> list = new ArrayList();
        ConOpen();
        String query = "SELECT * FROM MEMBER " + condition;
        ResultSet rs = ExecuteSelectQuery(query);
        try{
            // If there is a next row, retrieve all data
            while(rs.next()){
                Member temp = new Member();
                temp.setName(rs.getString("Name"));
                temp.setSurname(rs.getString("SurName"));
                temp.setAge(rs.getInt("Age"));
                temp.setAddress(rs.getString("Address"));
                temp.setTel1("Telephone1");
                temp.setTel2("Telephone2");
                temp.setDni(rs.getInt("Dni"));
                list.add(temp);
            }
            rs.close();
            stmt.close();
        }catch (SQLException ex){
            Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConClosed();
        return list;
    }
    
     /**
      This method is used to obtain rows of books table in database.
      @param condition It indicate book search condition in SQL syntax (WHERE CLAUSE).
      @return ArrayList A list that contains all obtained books.
    */
    public static ArrayList GetBooks(String condition){
        ArrayList<Book> list = new ArrayList();
        ConOpen();
        String query = "SELECT * FROM BOOK " + condition;
        ResultSet rs = ExecuteSelectQuery(query);
        try{
            // If there is a next row, retrieve all data
            while(rs.next()){
                Book temp = new Book();
                temp.setTitle(rs.getString("title"));
                temp.setAuthor(rs.getString("author"));
                temp.setPags(rs.getInt("pags"));
                list.add(temp);
            }
            rs.close();
            stmt.close();
        }catch (SQLException ex){
            Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConClosed();
        return list;
    }
    
    /**
      This method is used to obtain the name of genres in database.
      @param condition it indicate genre search condition in SQL syntax (WHERE CLAUSE).
      @return String[] A list that contains all genres names.
    */
    public static List<String> GetGenres(String condition){
        ConOpen();
        List<String> lst = new ArrayList<>();
        String query = "SELECT Name FROM Genre "+condition;
        ResultSet rs = ExecuteSelectQuery(query);
        try{
            while(rs.next()){
                lst.add(rs.getString("name"));
            }
            stmt.close();
            rs.close();
            ConClosed();
            return lst;
        }catch(SQLException ex){
            Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConClosed();
        return null;
    }
    
    /**
      This method is used to obtain the name and surname of members in database.
      @param condition it indicate member search condition in SQL syntax (WHERE CLAUSE).
      @return String[] A list that contains all members names.
    */
    public static List<String> GetMembersName(String condition){
        ConOpen();
        List<String> lst = new ArrayList<>();
        String query = "SELECT Name,Surname FROM MEMBER "+condition;
        ResultSet rs = ExecuteSelectQuery(query);
        try{
            while(rs.next()){
                lst.add(rs.getString("name") + " " + rs.getString("surname"));
            }
            stmt.close();
            rs.close();
            ConClosed();
            return lst;
        }catch(SQLException ex){
            Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConClosed();
        return null;
    }
    
    /**
      This method is used to obtain the name of books in database.
      @param condition it indicate book search condition in SQL syntax (WHERE CLAUSE).
      @return String[] A list that contains all books names.
    */
    public static List<String> getBooksName(String condition){
        ConOpen();
        List<String> lst = new ArrayList<>();
        String query = "SELECT Title,Author FROM Book "+condition;
        ResultSet rs = ExecuteSelectQuery(query);
        try{
            while(rs.next()){
                lst.add(rs.getString("Title") + ", " + rs.getString("Author"));
            }
            stmt.close();
            rs.close();
            ConClosed();
            return lst;
        }catch(SQLException ex){
            Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConClosed();
        return null;
    }
    
    /**
        This method is used to insert a new row in member table in the database.
        NO NULL COLUMS {Name , Surname}
        @param member Sets the member to save in database.
        @return boolean Either true in case of a successful save or false otherwise.
    */
    public static boolean SaveMember(Member member){
        ConOpen();
        String InsertQuery = "INSERT INTO member " +
                "(`Name`,`Surname`,`File`,`Dni`,`Address`,`Age`,`Telephone1`,`Telephone2`) " +
                "VALUES (?,?,?,?,?,?,?,?)";
        try{
            stmt = con.prepareStatement(InsertQuery);
            stmt.setString(1,member.getName() );
            stmt.setString(2, member.getSurname() );
            stmt.setString(3, member.getFile() );
            stmt.setInt(4, member.getDni() );
            stmt.setString(5, member.getAddress() );
            stmt.setInt(6, member.getAge() );
            stmt.setString(7, member.getTel1() );
            stmt.setString(8, member.getTel2() );
            
            if (stmt.executeUpdate() == 0){
                return false;
            }
            stmt.close();
            ConClosed();
            return true;
        }catch (SQLException ex){
            Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConClosed();
        return false;
    }
    
    /**
        This method is used to insert a new row in book table in the database.
        NO NULL COLUMS {Title, Author}
        @param book Sets the book to save in database.
        @return boolean Either true in case of a successful save or false otherwise.
    */
    public static boolean SaveBook(Book book){
        ConOpen();
        String InsertQuery = "INSERT INTO book " +
                "(`title`,`author`,`pags`) " +
                "VALUES (?,?,?)";
        try{
            stmt = con.prepareStatement(InsertQuery);
            stmt.setString(1, book.getTitle() );
            stmt.setString(2, book.getAuthor() );
            stmt.setInt(3, book.getPags() );
            
            if (stmt.executeUpdate() == 0){
                return false;
            }
            stmt.close();
            ConClosed();
            return true;
        }catch (SQLException ex){
            Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConClosed();
        return false;
    }
    
    /**
        This method is used to insert a new row in genre table in the database.
        @param name Sets the name of genre to save in database.
        @return boolean Either true in case of a successful save or false otherwise.
    */
    public static boolean SaveGenre(String name){
        ConOpen();
        String InsertQuery = "INSERT INTO Genre " +
                "(`name`) " +
                "VALUES (?)";
        try{
            stmt = con.prepareStatement(InsertQuery);
            stmt.setString(1, name );
            
            if (stmt.executeUpdate() == 0){
                return false;
            }
            stmt.close();
            ConClosed();
            return true;
        }catch (SQLException ex){
            Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConClosed();
        return false;
    }
    
    public static boolean DeleteStatement(String Table,String condition){
        ConOpen();
        String DelQuery = "DELETE FROM "+Table+" WHERE "+condition;
        try{
            stmt = con.prepareStatement(DelQuery);

            if (stmt.executeUpdate() == 0){
                return false;
            }
            stmt.close();
            ConClosed();
            return true;
        }catch (SQLException ex){
            Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConClosed();
        return false;
        
    }
    
    /**
      This method is used to closed connection with your database!
      That is useful in case of connection is open.
    */
    private static void ConClosed(){
        if (con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
