

package dbo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.Types;
/**
 *
 * @author seckin.celik
 */
public class dealSave {
    
    
                Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
                CallableStatement cs=null;
                PreparedStatement ps=null;
                private final String connectionUrl="jdbc:mysql://localhost:3306/unit";
                private final String connectionUser="general_user";
                private final String connectionPassword= "Trade2013.";
                        
         public void enterData(String company){
             try {
                                
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
                         conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                        stmt = conn.createStatement();
                        ps=conn.prepareStatement("INSERT INTO company(Comp_Name) VALUES (?);");
                                              
                        ps.setString(1, company); 
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
    }
         
                  public void updateBG(int ID,String name,int size,java.sql.Blob binData){
             try {
                                
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
                         conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                        stmt = conn.createStatement();
                        ps=conn.prepareStatement("UPDATE unit.dbodeal set Filename= ?, Length=?, datay=? where id=?;");
                                              
                        ps.setString(1, name);  ps.setInt(2, size);  ps.setBlob(3, binData);  ps.setInt(4, ID); 
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
    }
                  public void updatePDF(int ID,String name,int size,java.sql.Blob binData){
             try {
                                
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
                         conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                        stmt = conn.createStatement();
                        ps=conn.prepareStatement("UPDATE unit.dbodeal set ContractName= ?, ContractSize=?, ContractDate=? where id=?;");
                                              
                        ps.setString(1, name);  ps.setInt(2, size);  ps.setBlob(3, binData);  ps.setInt(4, ID); 
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
    }
                   public void updateInv(int ID,String name,int size,java.sql.Blob binData){
             try {
                                
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
                         conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                        stmt = conn.createStatement();
                        ps=conn.prepareStatement("UPDATE unit.dbodeal set InvName= ?, InvSize=?, InvDate=? where id=?;");
                                              
                        ps.setString(1, name);  ps.setInt(2, size);  ps.setBlob(3, binData);  ps.setInt(4, ID); 
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
    }
            public void updateLFC(int ID,String name,int size,java.sql.Blob binData){
             try {
                                
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
                         conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                        stmt = conn.createStatement();
                        ps=conn.prepareStatement("UPDATE unit.dbodeal set LFCName= ?, LFCSize=?, LFCDate=? where id=?;");
                                              
                        ps.setString(1, name);  ps.setInt(2, size);  ps.setBlob(3, binData);  ps.setInt(4, ID); 
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
    }
            public void updatecbtCont(int ID,String name,int size,java.sql.Blob binData){
             try {
                                
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
                         conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                        stmt = conn.createStatement();
                        ps=conn.prepareStatement("UPDATE unit.dbodeal set CBTCName= ?, CBTCSize=?, CBTCDate=? where id=?;");
                                              
                        ps.setString(1, name);  ps.setInt(2, size);  ps.setBlob(3, binData);  ps.setInt(4, ID); 
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
    }
            public void updatecbtInv(int ID,String name,int size,java.sql.Blob binData){
             try {
                                
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
                         conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                        stmt = conn.createStatement();
                        ps=conn.prepareStatement("UPDATE unit.dbodeal set CBTCInvName= ?, CBTCInvSize=?, CBTCInvDate=? where id=?;");
                                              
                        ps.setString(1, name);  ps.setInt(2, size);  ps.setBlob(3, binData);  ps.setInt(4, ID); 
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
    }
       public void updateSchedule(double capc,java.sql.Date date1,int hr,int dealid){
             try {
                                
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
                         conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                        stmt = conn.createStatement();
                        ps=conn.prepareStatement("UPDATE unit.schedules set Capacity= ? WHERE Deal_Date= ? and Deal_Hr=? and DealID=?;");
                                              
                        ps.setDouble(1, capc); ps.setDate(2, date1);ps.setInt(3, hr);ps.setInt(4, dealid);
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
    }        
         public void enterDeal(String seller,String buyer,String type,Date sDate,int sHR,Date eDate,int eHR,
                 String direction,String stamp,double capacity,double energy,double price,double profit,double expense,double export,double suf,double perimeter,
                 double tloss,double cbtc,double exchange, double credit,Date payment,int pHr,Date issue,Date validity,double Brokerage,double commiosson,double amount,String brokername,double brokerrate,double brokeramount,String profil,String tarif,double fxcbtc,double brutprice ){
               
             
		try {
                                        
                                                
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
                         conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                        stmt = conn.createStatement();
                        String calll="{call insert_schedule(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
                        ps=conn.prepareCall(calll);                                              
                        ps.setString(1, seller); ps.setString(2, buyer);ps.setString(3, type);ps.setDate(4, sDate);ps.setInt(5, sHR);
                                                                                       
                        ps.setDate(6, eDate);ps.setInt(7, eHR);ps.setString(8, direction);ps.setString(9, stamp);ps.setDouble(10, capacity);
                                                                                            
                        ps.setDouble(11, energy);ps.setDouble(12,price);ps.setDouble(13,profit);ps.setDouble(14,expense);
                                                                      
                        ps.setDouble(15,export);ps.setDouble(16,suf);ps.setDouble(17,perimeter);ps.setDouble(18,tloss);ps.setDouble(19,cbtc);
                        
                        ps.setDouble(20,exchange);ps.setDouble(21,credit);ps.setDate(22,payment);ps.setInt(23,pHr);ps.setDate(24,issue);ps.setDate(25,validity);ps.setDouble(26,Brokerage);
                        
                        ps.setDouble(27,commiosson);ps.setDouble(28,amount);ps.setString(29,brokername);ps.setDouble(30,brokerrate);ps.setDouble(31,brokeramount);ps.setString(32, profil);ps.setString(33, tarif);ps.setDouble(34, fxcbtc);ps.setDouble(35, brutprice);
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
    }
                   public void verisil(int Id ){
        
		try {
                           
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
                         conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                        stmt = conn.createStatement();
                        String calll="{call veri_sil(?)}";
                        ps=conn.prepareCall(calll);                                              
                        ps.setInt(1, Id);
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
    }      
         public void deletion(int i){
         
                      try {
                                        
                                                
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
                         conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                        stmt = conn.createStatement();
                        ps=conn.prepareStatement("delete from unit.dbodeal where id="+i+";");
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
         }
         public ResultSet shortPosition(Date sDate,Date eDate){
                           
		try {                                
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
                         conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                        stmt = conn.createStatement();
                      
                         cs = conn.prepareCall("{call hourly_profit(?,?)}");                                              
                        cs.setDate(1, sDate);                                                             
                        cs.setDate(2, eDate);
                        rs=cs.executeQuery();
			return rs;
                
		}   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
//                 finally {
//			try { if (rs != null) rs.close(); } catch (SQLException e) {}
//			try { if (cs != null) cs.close(); } catch (SQLException e) {}
//			try { if (conn != null) conn.close(); } catch (SQLException e) {}
//		}
    }
        
         public void alter(String seller,String buyer,String type,Date sDate,int sHR,Date eDate,int eHR,
                 String direction,String stamp,double capacity,double energy,double price,double profit,double expense,double export,double suf,double perimeter,
                 double tloss,double cbtc,double exchange, double credit,Date payment,int pHr,Date issue,Date validity,String BrokerName,double commBrokerRate,double brokerAmount,String profile,String priceindex,double commis,int DealID){
                
		try {
                                        
                                                
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
                         conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                        stmt = conn.createStatement();

                        String sQl;
                    sQl = "UPDATE unit.dbodeal set Seller=?, Buyer=?, Typy=?, Start_Date=?, Start_Hr=?, End_Date=?, End_Hr=?, Direction=?, Stamp=?, Capacity=?, Energy=?, PriceBrut=?, Profit=?, Expense=?, Export=?, Suf=?, Perimeter=?, Tloss=?, Cbtc=?,Exchnge=?, credit=?, Payment_Date=?, Payment_Hr=?, Validity=?, Issue=?, BrokerName=?,BrokerRate=?, BrokerAmount=?, Profile=?, PriceIndex=?, Commission=? WHERE id=?;";
                                    
                        PreparedStatement ps = conn.prepareStatement(sQl);
                      
                        ps.setString(1, seller);ps.setString(2, buyer);ps.setString(3, type);ps.setDate(4, sDate);ps.setInt(5, sHR);
                                                                                       
                        ps.setDate(6, eDate);ps.setInt(7, eHR);ps.setString(8, direction);ps.setString(9, stamp);ps.setDouble(10, capacity);
                                                                                            
                        ps.setDouble(11, energy);ps.setDouble(12,price);ps.setDouble(13,profit);ps.setDouble(14,expense);
                                                                      
                        ps.setDouble(15,export);ps.setDouble(16,suf);ps.setDouble(17,perimeter);ps.setDouble(18,tloss);ps.setDouble(19,cbtc);
                        
                        ps.setDouble(20,exchange);ps.setDouble(21,credit);ps.setDate(22,payment);ps.setInt(23,pHr);ps.setDate(24,issue);ps.setDate(25,validity);ps.setString(26,BrokerName);
                        
                        ps.setDouble(27,commBrokerRate);ps.setDouble(28,brokerAmount);ps.setString(29,profile);ps.setString(30,priceindex);ps.setDouble(31, commis);ps.setInt(32,DealID);
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
    }    
         
         public ResultSet qry(){
                 try{
                 Class.forName("com.mysql.jdbc.Driver").newInstance();
			                
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT * FROM dbodeal;";
        stmts = con.createStatement();
        ResultSet rs = stmts.executeQuery(query);
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
                  public ResultSet user(String usermail,String password){
                 try{
                 Class.forName("com.mysql.jdbc.Driver").newInstance();
			                
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT * FROM unit.users where usermail='"+usermail+"' and userpassword='"+password+"';";
        stmts = con.createStatement();
        
                  ResultSet rsw = stmts.executeQuery(query);
             return rsw;
             }   catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
                          
                  public ResultSet maclar(){
                 try{
                 Class.forName("com.mysql.jdbc.Driver").newInstance();
			                
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT * FROM maclar;";
        stmts = con.createStatement();
        ResultSet rs = stmts.executeQuery(query);
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
                  
         public ResultSet getStartDate(int id){
                 try{
                 Class.forName("com.mysql.jdbc.Driver").newInstance();
			                
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT * FROM dbodeal where id="+id+";";
        stmts = con.createStatement();
        ResultSet rs = stmts.executeQuery(query);
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
          public ResultSet getCapint(int id){
                 try{
                 Class.forName("com.mysql.jdbc.Driver").newInstance();
			                
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT Capacity FROM schedules where dealID="+id+";";
        stmts = con.createStatement();
        ResultSet rs = stmts.executeQuery(query);
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
  public ResultSet view(Date from, Date to,int hrStart,int hrEnd,String position){
                 try{
                 Class.forName("com.mysql.jdbc.Driver").newInstance();
			                
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT * FROM schedules where Deal_Date>='"+from+"' and Deal_Date<'"+to+"' and Deal_Hr ="+hrStart+" and position='"+position+"';";
        stmts = con.createStatement();
        ResultSet rs = stmts.executeQuery(query);
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
  
    public ResultSet views(Date from,int hrStart,String position){
                 try{
                 Class.forName("com.mysql.jdbc.Driver").newInstance();
			                
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT Capacity,price FROM schedules where Deal_Date='"+from+"' and Deal_Hr ="+hrStart+" and position='"+position+"';";
        stmts = con.createStatement();
        ResultSet rs = stmts.executeQuery(query);
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
   public ResultSet dealids(Date from, Date to){
                 try{
                 Class.forName("com.mysql.jdbc.Driver").newInstance();
			                
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT distinct dealID,position FROM schedules where Deal_Date>='"+from+"' and Deal_Date<'"+to+"';";
        stmts = con.createStatement();
        ResultSet rs = stmts.executeQuery(query);
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
  public ResultSet view(Date from){
                 try{
                 Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT id,Seller,Buyer,Type,Start_Date,Start_Hr,End_Date,End_Hr,Capacity,Direction,Price,Profit,Expense FROM dbodeal where Start_Date>='"+from+"';";
        stmts = con.createStatement();
        ResultSet rs = stmts.executeQuery(query);
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
 public ResultSet view(){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT id,Seller,Buyer,Type,Start_Date,Start_Hr,End_Date,End_Hr,Direction,Stamp,Capacity,Energy,Price,Profit,Expense FROM dbodeal;";
        stmts = con.createStatement();
        ResultSet rs = stmts.executeQuery(query);
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
  public ResultSet monthview(){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT * FROM dbodeal ;";
        stmts = con.createStatement();
        ResultSet rs = stmts.executeQuery(query);
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
    public int monthvieww(){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        
        cs = con.prepareCall("{?=call deal_sayisi()};");
    
  int count = 0;
        cs.registerOutParameter(1, Types.INTEGER);
        cs.execute();
        count = cs.getInt(1);
        return count;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return 0;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
  public ResultSet view(int i){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT * FROM dbodeal where id="+i+";";
        stmts = con.createStatement();
        ResultSet rs = stmts.executeQuery(query);
             return rs;
             }   catch(Exception e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
   public ResultSet counterParties(){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT Comp_Name FROM company;";
        stmts = con.createStatement();
        ResultSet rs = stmts.executeQuery(query);
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
     public ResultSet types(){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT Type FROM deal_type;";
        stmts = con.createStatement();
        ResultSet rs = stmts.executeQuery(query);
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
     
       public ResultSet counterParties(String a){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT * FROM unit.dbodeal where Seller LIKE ? or Buyer LIKE ?;";
        ps = con.prepareStatement(query);
        ps.setString(1, "'"+a+"'");
        ps.setString(2, "'"+a+"'");
         rs = ps.executeQuery();
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
//			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
              public ResultSet monthNext(){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT * from dbodeal where month(Start_Date)>month(curdate());";
        ps = con.prepareStatement(query);
         rs = ps.executeQuery();
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
//			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
              public ResultSet previousmonth(){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT * from dbodeal where month(Start_Date)<month(curdate());";
        ps = con.prepareStatement(query);
         rs = ps.executeQuery();
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
//			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
              
                            public ResultSet currentmonth(){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT * from dbodeal where month(Start_Date)=month(curdate());";
        ps = con.prepareStatement(query);
         rs = ps.executeQuery();
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
//			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
             public ResultSet contractview(int a){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "SELECT * from dbodeal where id="+a+";";
        ps = con.prepareStatement(query);
         rs = ps.executeQuery();
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
//			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
            public ResultSet comp(){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "select distinct(Seller) from dbodeal;";
        ps = con.prepareStatement(query);
         rs = ps.executeQuery();
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
//			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
          public ResultSet contractCheck(int i){
              ResultSet spec=null;PreparedStatement psspec=null;
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
     
        String query = "select * from dbodeal where id="+i+";";
        psspec = con.prepareStatement(query);
         spec = psspec.executeQuery();
             return spec;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
//			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
              public ResultSet bgCheck(int i){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "select * from dbodeal where id="+i+";";
        ps = con.prepareStatement(query);
         rs = ps.executeQuery();
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
//			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
    public ResultSet invoiceCheck(int i){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "select * from dbodeal where id="+i+";";
        ps = con.prepareStatement(query);
         rs = ps.executeQuery();
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
//			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
    
     public ResultSet lfcCheck(int i){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "select LFCDate from dbodeal where id="+i+";";
        ps = con.prepareStatement(query);
         rs = ps.executeQuery();
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
//			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
          public ResultSet cbtcContractCheck(int i){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "select CBTCDate from dbodeal where id="+i+";";
        ps = con.prepareStatement(query);
         rs = ps.executeQuery();
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
//			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}
          public ResultSet cbtcInvCheck(int i){
                 try{             

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
			                 
                  java.sql.Connection con = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
                
        java.sql.Statement stmts = null;
        String query = "select CBTCInvDate from dbodeal where id="+i+";";
        ps = con.prepareStatement(query);
         rs = ps.executeQuery();
             return rs;
             }   catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){return null;}
                 finally {
//			try { if (rs != null) rs.close(); } catch (SQLException e) {}
			try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
                
}

    
                    
}
