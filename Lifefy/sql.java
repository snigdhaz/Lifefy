import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class sql extends Lifefy
{
	private static String url ;
	private static String uname ;
	private static String password;
	private static PreparedStatement pst = null;
	private static Connection con=null;
	private static Statement st= null;

	sql()
	{
        try
        {
        url ="jdbc:mysql://localhost:3306/Customer_info";
		uname = "root";
		password = "SnigSql@7001";
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,uname,password);
		st =  con.createStatement();
		}
		catch (Exception ex) 
		{
		System.out.println("hi");
        //ex.printStackTrace(System.err);
        }
         
	}

	public void add_user_info(String name,String username,String mail,String phone,String gender,String dob,String password)
	{
	 String query1 = "INSERT INTO users VALUES ('" + name +"','"+ username+ "','"+ mail+"','"+phone+"','"+gender+"','"+dob +"' );";
	 String query2 = "INSERT INTO login_info Values('" +username+"','"+password+"');";
	 //System.out.println(query1);
	 try 
        {

	    st.executeUpdate(query1);
	    st.executeUpdate(query2);
       
	    }
	catch (Exception ex) 
		{
			System.out.println("error");
            ex.printStackTrace(System.err);
        }
	}
	public boolean check_for_existing_user(String name,String password)
	{
		//String query = "SELECT EXISTS(SELECT * from login_info WHERE username='"+name+"' and password ='"+password+"');";
		String query = "SELECT * from login_info WHERE username='"+name+"' and password ='"+password+"';";
		//System.out.println(query);

		try 
        {
         ResultSet rs = st.executeQuery(query);
         //System.out.println ("jj"+rs.next());
         if(rs.next())
         {
         	return true;
         }
         else
         {
         	return false;
         }
	    //System.out.println(st.executeQuery(query));
		//return st.executeQuery(query);
	    }
	    catch (Exception ex) 
		{
			System.out.println("error");
            ex.printStackTrace(System.err);
        }
        return false;

	}
}

	class money extends Lifefy
	{ 
	private static String url ;
	private static String uname ;
	private static String password;
	private static PreparedStatement pst = null;
	private static Connection con=null;
	private static Statement st= null;

	money()
	{
        try
        {
        url ="jdbc:mysql://localhost:3306/Money_management";
		uname = "root";
		password = "SnigSql@7001";
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,uname,password);
		st =  con.createStatement();
		}
		catch (Exception ex) 
		{
			System.out.println("hi");
        //ex.printStackTrace(System.err);
        }
         
	}

	

	public void update_Ppayment(String username,String pn,String sp,String pc, String pd, int amount_paying)
	{

     String query1 = "INSERT INTO telephone_bill VALUES ('" + username +"','"+ pn+ "','"+ sp+"','"+pd+"','"+pc+"','"+amount_paying +"' );";
	 //System.out.println(query1);
	 try 
        {
	    st.executeUpdate(query1);
	    }
	catch (Exception ex) 
		{
			System.out.println("error");
            ex.printStackTrace(System.err);
        }
	}

	public void update_Water_payment(String username,String pd,String state,String city,String rc, String usn,int amnt)
	{
		String query1 = "INSERT INTO water_bill VALUES ('" + username +"','"+ pd+ "','"+ usn+"','"+amnt+"','"+state+"','"+city +"','"+rc+"' );";
	 //System.out.println(query1);
	 try 
        {
	    st.executeUpdate(query1);
	    }
	catch (Exception ex) 
		{
			System.out.println("error");
            ex.printStackTrace(System.err);
        }
	}
	public void update_Epayment(String username,String pd,String usn,int amnt, String socr,String cocr, String rc,String mn)
	{
		String query1 = "INSERT INTO e_bill VALUES ('" + username +"','"+ pd+ "','"+ usn+"','"+amnt+"','"+socr+"','"+cocr +"','"+rc+"','"+mn+"' );";
	 //System.out.println(query1);
	 try 
        {
	    st.executeUpdate(query1);
	    }
	catch (Exception ex) 
		{
			System.out.println("error");
            ex.printStackTrace(System.err);
        }
	}

	public void update_Wifi_payment(String username,String sid,String so, String pd,String pc,int amount)
	{
		String query1 = "INSERT INTO wifi_bill VALUES ('" + username +"','"+ sid+ "','"+ so+"','"+pd+"','"+pc+"','"+amount+"' );";
	 //System.out.println(query1);
	 try 
        {
	    st.executeUpdate(query1);
	    }
	catch (Exception ex) 
		{
			System.out.println("error");
            ex.printStackTrace(System.err);
        }

	} 
}

class pcsql extends Lifefy
{
    private static String url;
	private static String uname;
	private static String password;
	private static PreparedStatement pst = null;
	private static Connection con=null;
	private static Statement st= null;

	pcsql()
	{
        try
        {
        url ="jdbc:mysql://localhost:3306/Personal_Care";
		uname = "root";
		password = "SnigSql@7001";
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,uname,password);
		st =  con.createStatement();
		}
		catch (Exception ex) 
		{
			System.out.println("Error");
			//ex.printStackTrace(System.err);
        }
         
	}
	public void add_data_health(String username, String sleepd, String wd,String diet, String workout)
	{
	String check_query = "SELECT * from health_tracker WHERE Date= CURDATE() and username='"+username+"';";
	
	 try{
		ResultSet rs = st.executeQuery(check_query);
         if(rs.next())
         {
         	String query1 = "UPDATE health_tracker SET sleep_duration ="+ sleepd+", workout_duration ="+ wd +",diet='"+diet+"',workout ='"+workout+"' WHERE Date = CURDATE() and username ='"+username+"';";
         	try
         	{
         	st.executeUpdate(query1);
            }
            catch (Exception ex)
            {
            	System.out.println ("update prob");
            }
         }
         else
         {
            String query2 = "INSERT INTO Health_Tracker VALUES('"+username+"',CURDATE(),'"+sleepd+"','"+wd+"','"+diet+"','"+workout+"');";
	        //System.out.println(query2);
	        try{
	        st.executeUpdate(query2);
	        }
	        catch (Exception ex)
	        {
	        	System.out.println ("insert error");
	        }
	     }
	    }
	     catch (Exception ex) 
		{
			System.out.println("error");
            ex.printStackTrace(System.err);
        }

	}

	public void  add_data_rate_health(String username, int hscore,boolean eatcheck,boolean walkcheck, boolean sccheck,boolean stcheck, boolean slcheck, boolean echeck,boolean mcheck,boolean wcheck)
	{
	String check_query = "SELECT * from rate_health WHERE Date= CURDATE() and username='"+username+"';";
         //System.out.println ("jj"+rs.next());

	    try{
		ResultSet rs = st.executeQuery(check_query);
         if(rs.next())
         {
         	String query1 = "UPDATE rate_health SET health_score ="+ hscore+", water ="+ wcheck +",sleep="+slcheck+",meditate="+mcheck+", stretch=" +stcheck+", walk="+ walkcheck+", screen_time="+ sccheck+", exercise=" +echeck+" WHERE Date = CURDATE() and username ='"+username+"';";
         	try{
         	st.executeUpdate(query1);
            }
            catch (Exception ex){
            	System.out.println ("update prob");
            }
         }
         else
         {
            String query2 ="INSERT INTO rate_health VALUES ('" + username +"',CURDATE(),"+hscore+ ","+ wcheck+","+slcheck+","+mcheck+","+echeck +","+stcheck+"," +walkcheck+","+sccheck+");";
	        System.out.println(query2);
	        try{
	        st.executeUpdate(query2);
	        }
	        catch (Exception ex)
	        {
	        	System.out.println ("insert error");
	        }
	     }
	    }
	     catch (Exception ex) 
		{
			System.out.println("error");
            ex.printStackTrace(System.err);
        }

	 
	}
	public void add_data_rate_attitude(String username,int score,boolean lcheck,boolean gcheck,boolean fcheck,boolean pcheck,boolean readcheck, boolean smilecheck,boolean activpcheck,boolean strengthcheck)

	{
	String check_query = "SELECT * from rate_attitude WHERE Date= CURDATE();";
         //System.out.println ("jj"+rs.next());

	    try{
		ResultSet rs = st.executeQuery(check_query);
         if(rs.next())
         {
         	String query1 = "UPDATE rate_attitude SET attitude_score ="+ score+", laugh ="+ lcheck +",gratitude="+gcheck+",reflection="+fcheck+", positive=" +pcheck+", read_book="+ readcheck+", smile="+ smilecheck+", lend=" +strengthcheck+" WHERE Date = CURDATE() and username ='"+username+"';";
         	try{
         	st.executeUpdate(query1);
            }
            catch (Exception ex){
            	System.out.println ("update prob");
            }
         }
         else
         {
            String query2 ="INSERT INTO rate_attitude VALUES ('" + username +"',CURDATE(),"+score+ ","+ lcheck+","+gcheck+","+fcheck+","+pcheck +","+readcheck+"," +smilecheck+","+strengthcheck+");";
	        System.out.println(query2);
	        try{
	        st.executeUpdate(query2);
	        }
	        catch (Exception ex)
	        {
	        	System.out.println ("insert error");
	        }
	     }
	    }
	     catch (Exception ex) 
		{
			System.out.println("error");
            ex.printStackTrace(System.err);
        }
	}
	public void add_data_health(String username, String date, String m1, String m2, String m3, String m4, String m5)
	{
	String q4 = "INSERT INTO Mood_Tracker VALUES('"+username+"','"+date+"', '"+m1+"','"+m2+"','"+m3+"','"+m4+"','"+m5+"');";
	 try 
        {
	    st.executeUpdate(q4);
	  
	    }
	catch (Exception ex) 
		{
			System.out.println("error");
            ex.printStackTrace(System.err);
        }
	}
	public void add_mini_diary(String username, String notes)
	{
	String q5 = "INSERT INTO Mini_Diary VALUES('"+username+",CURDATE(),"+notes+"');";
	//System.out.println("update successful");
	 try 
        {

            st.executeUpdate(q5);
	   
	    }
	catch (Exception ex) 
		{
			System.out.println("error");
            ex.printStackTrace(System.err);
        }
	}

	public void add_mood_tracker(String username,boolean red,boolean orange,boolean yellow,boolean mint,boolean green)
	{
	String check_query = "SELECT * from mood_tracker WHERE Date= CURDATE() and username ='"+username+"';";
         //System.out.println ("jj"+rs.next());

	    try{
		ResultSet rs = st.executeQuery(check_query);
         if(rs.next())
         {
         	String query1 = "UPDATE mood_tracker SET red ="+ red+", orange ="+ orange +",yellow="+yellow+",mint="+mint+", green=" +green+" WHERE Date = CURDATE() and username ='"+username+"';";
         	try{
         	st.executeUpdate(query1);
            }
            catch (Exception ex){
            	System.out.println ("update prob");
            }
         }
         else
         {
            String query2 ="INSERT INTO mood_tracker VALUES ('" + username +"',CURDATE(),"+red+ ","+ orange+","+yellow+","+mint+","+green+");";
	        System.out.println(query2);
	        try{
	        st.executeUpdate(query2);
	        }
	        catch (Exception ex)
	        {
	        	System.out.println ("insert error");
	        }
	     }
	    }
	     catch (Exception ex) 
		{
			System.out.println("error");
            ex.printStackTrace(System.err);
        }
	}


} 
