package sql;

import java.sql.*;

public class StudentRecord {
    public static void createtable(){
        Statement smt=null;
        Connection con=null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=student;encrypt=true;trustServerCertificate=true","sa","dilepBABU@11");
            String createtable="Create table Details(" +
                    "id int,"+"name varchar(100),"+"age int,"+"Department varchar(100))";
            smt=con.createStatement();
             int create=smt.executeUpdate(createtable);
            System.out.println(create);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try
            {
                if(smt!=null) smt.close();
                if(con!=null) con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void insertq()
    {
        Statement smt=null;
        Connection con=null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=student;encrypt=true;trustServerCertificate=true","sa","dilepBABU@11");
            String insertqueries="insert into Details values(1,'dilep',21,'IT')";
            smt=con.createStatement();
            int insert= smt.executeUpdate(insertqueries);
            System.out.println(insert);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try
            {
                if(smt!=null) smt.close();
                if(con!=null) con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void select()
    {
        Statement smt=null;
        Connection con=null;
        ResultSet rs=null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=student;encrypt=true;trustServerCertificate=true","sa","dilepBABU@11");
            smt=con.createStatement();
            String statement="select * from Details";
             rs=smt.executeQuery(statement);
             while (rs.next())
             {
                 System.out.println(rs.getInt("id"));
                 System.out.println(rs.getString("name"));
                 System.out.println(rs.getInt("age"));
                 System.out.println(rs.getString("Department"));
             }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try
            {
                if(rs!=null) rs.close();
                if(smt!=null) smt.close();
                if(con!=null) con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void prepared()
    {
        PreparedStatement smt=null;
        Connection con=null;
        ResultSet rs=null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=student;encrypt=true;trustServerCertificate=true","sa","dilepBABU@11");
            DatabaseMetaData databaseMetaData=con.getMetaData();
            System.out.println(databaseMetaData.getDatabaseProductName());
            System.out.println(databaseMetaData.getDatabaseProductVersion());
            smt=con.prepareStatement("select * from Details where id=? and Department=?");
            smt.setInt(1,1);
            smt.setString(2,"IT");
            rs=smt.executeQuery();
            while (rs.next())
            {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getString("Department"));
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try
            {
                if(rs!=null) rs.close();
                if(smt!=null) smt.close();
                if(con!=null) con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
//       select();
       prepared();
    }
}
