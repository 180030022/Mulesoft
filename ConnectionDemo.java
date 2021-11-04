import java.sql.*;
import java.util.*;
import java.sql.DriverManager;
public class ConnectionDemo{
    public static void main(String[] args)
    {
                 Scanner sc = new Scanner(System.in);
                 try 
                 {
                       Class.forName("org.sqlite.JDBC");
                       Connection con = DriverManager.getConnection("jdbc:sqlite:movie.db");
                       if(con!=null)
                        {
                           Statement stmt = con.createStatement();
                        //   String sql = "update Movies set Movieactor='Yash' where Moviename='K.G.F'";
                        //   String sql1 = "delete from Movies where Moviename='Majili'";
                       //    int n = stmt.executeUpdate(sql);
                      //     System.out.println(n+"records updated");
                           //retrieving
                           PreparedStatement pstmt = con.prepareStatement("select * from Movies");
                           ResultSet result = pstmt.executeQuery();
                           System.out.println("Moviename  Moviedirector Movieactor Movieactress  Movieyear");
                           System.out.println("--------------------------------------------------------");
                            while(result.next())
                            {
                               System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4)+"\t"+result.getInt(5));
                            }
                           con.close();
          
          //Inserting Statements
      /*    stmt.executeUpdate("create table Movies(Movie_name text primary key,Movie_director text,Movie_actor text,Movie_actress text,Movie_year int)");
          System.out.println("table created");
          PreparedStatement pstmt = con.prepareStatement("insert into Movies values(?,?,?,?,?)");
          System.out.println("Enter number of Insertions");
          int m=sc.nextInt();
          for(int d=0;d<m;d++) {
          System.out.println("Enter the Movie Name");
          String Movie_name = sc.next();
          System.out.println("Enter the Movie Director");
          String Movie_director = sc.next();
          System.out.println("Enter the Movie Actor");
          String Movie_actor = sc.next();
          System.out.println("Enter the Movie Actress");
          String Movie_actress = sc.next();
          System.out.println("Enter the Year of Release");
          int Movie_year = sc.nextInt();  
          pstmt.setString(1,Movie_name);
          pstmt.setString(2,Movie_director);
          pstmt.setString(3,Movie_actor);
          pstmt.setString(4,Movie_actress);
          pstmt.setInt(5,Movie_year);
          int a = pstmt.executeUpdate();
          System.out.println(a);}
          */
          }
      }
      
      catch(Exception e) {
        System.out.println(e);
      }
    }
  }