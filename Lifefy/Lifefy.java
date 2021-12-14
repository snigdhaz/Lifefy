import java.awt.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.text.*;

class Start extends JFrame implements ActionListener {

    private static JLabel background;
    private static JButton fpbutton;
    private static JButton sbutton,lbutton;
    private static JLabel lifey;

    Start(){
        
        setSize(1200,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        Container panel=getContentPane();
        panel.setLayout(null);

        lbutton = new JButton("Log in");
        lbutton.setFont(new Font("Lucida Grande", Font.PLAIN,40));
        lbutton.setForeground(new Color(14, 74, 108));
        lbutton.setBounds(775,310,350,75);  
        panel.add(lbutton); 
        lbutton.setBackground(new Color(249,226,213));
        lbutton.setOpaque(true);
        lbutton.setBorderPainted(false); 
        lbutton.addActionListener(this);
           
        sbutton = new JButton("Sign up");
        sbutton.setFont(new Font("Lucida Grande", Font.PLAIN,40));
        sbutton.setForeground(new Color(14, 74, 108));
        sbutton.setBounds(775,470,350,75);    
        panel.add(sbutton);
        sbutton.setBackground(new Color(249,226,213));
        sbutton.setOpaque(true);
        sbutton.setBorderPainted(false);
        sbutton.addActionListener(this);

        background = new JLabel(new ImageIcon("startpage/start.gif"));
        background.setBounds(0,0,1200,800);
        background.setVisible(true);
        panel.add(background);
        setVisible(true);
 

    }
 public void actionPerformed(ActionEvent e)
        {
        if(e.getSource()==sbutton)
        {
            
            Sframe sign= new Sframe();
            sign.setVisible(true);
        }

        else if(e.getSource()==lbutton)
        {
            Login log= new Login();
            log.setVisible(true);
        }

       
        }

        
    

    }
    
class Example {
    public static String cutomer_username;
}


class Login extends JFrame implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JLabel background, usericon, lockicon;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JButton fpbutton;
    private static JButton sbutton;
    private static JLabel success, valid;
    private static JCheckBox showPassword;
    public static String user ;
    public static String password ;

    Login()
    {

        setTitle("Login");
        JPanel panel = new JPanel();

        setSize(1200,800);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        add(panel);
        setResizable(false);
        setLocationRelativeTo(null);

        panel.setLayout(null);
        panel.setBackground(new Color(176, 224, 230));

        JLabel welcome = new JLabel("Welcome!");
        welcome.setFont(new Font("Lucida Grande", Font.PLAIN,40));
        welcome.setSize(325, 100);
        welcome.setLocation(495, 10);
        panel.add(welcome); 

        usericon=new JLabel(new ImageIcon("login/user.png"));
        usericon.setBounds(325,175,75,75);
        panel.add(usericon);

        userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Lucida Grande", Font.PLAIN,20));
        userLabel.setSize(300, 30);
        userLabel.setLocation(430, 200);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setSize(300, 30);
        userText.setLocation(550, 200);
        panel.add(userText);

        lockicon=new JLabel(new ImageIcon("login/lock.png"));
        lockicon.setBounds(325,285,75,75);
        panel.add(lockicon);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Lucida Grande", Font.PLAIN,20));
        passwordLabel.setSize(200, 20);
        passwordLabel.setLocation(430, 325);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setSize(300, 30);
        passwordText.setLocation(550, 325);
        panel.add(passwordText);

        fpbutton = new JButton("Forgot password?");
        fpbutton.setFont(new Font("Lucida Grande", Font.PLAIN,20));
        fpbutton.setOpaque(false); 
        fpbutton.setSize(300, 30);
        fpbutton.setLocation(275, 430);
        fpbutton.addActionListener(this);
        fpbutton.setContentAreaFilled(false);
        fpbutton.setBorderPainted(false);
        panel.add(fpbutton);

        showPassword=new JCheckBox("Show Password");
        showPassword.setFont(new Font("Lucida Grande", Font.PLAIN,20));
        showPassword.setSize(300, 30);
        showPassword.setLocation(675, 430);
        showPassword.setBackground(new Color(176, 224, 230));
        showPassword.addActionListener(this);
        panel.add(showPassword); 

        button = new JButton("Log in");
        button.setFont(new Font("Lucida Grande", Font.PLAIN,20));
        button.setSize(200, 35);
        button.setLocation(475, 555);
        button.addActionListener(this);
        panel.add(button);

        sbutton = new JButton("Dont have an account? sign up!");
        sbutton.setFont(new Font("Lucida Grande", Font.PLAIN,20));
        sbutton.setSize(400, 30);
        sbutton.setLocation(370, 650);
        sbutton.addActionListener(this);
        sbutton.setContentAreaFilled(false);
        sbutton.setBorderPainted(false);
        panel.add(sbutton);
        

        success = new JLabel("");
        success.setFont(new Font("Lucida Grande", Font.PLAIN,20));
        success.setBounds(385,495,700,30);
        success.setForeground(Color.YELLOW);
        panel.add(success);
        setVisible(true); 


    }
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == button) {

        user = userText.getText();
        password = passwordText.getText();


        if(user.isEmpty()==true || password.isEmpty()==true)
        {
            success.setText("Please check username and password.");
            success.setForeground(Color.RED);
        }

        else
        {
            success.setText("");
            sql log = new sql();
            if(log.check_for_existing_user(user,password))
            {
                this.dispose();
                Example.cutomer_username= user;
                MainScreen ms = new MainScreen();
                ms.setVisible(true);
            }
            else
            {
                success.setText("Please enter a valid username and password.");
                success.setForeground(Color.RED);
            }

            
        
        }
        }

        if (e.getSource() == showPassword){

            if (showPassword.isSelected()) {
                passwordText.setEchoChar((char) 0);
            } 
            else {
                passwordText.setEchoChar('*');
            }
        }
        if (e.getSource() == sbutton){
            
            Sframe sign= new Sframe();
            sign.setVisible(true);
            
        }
        if(e.getSource() == fpbutton)
        {
            ForgetPassword obj = new ForgetPassword();
            obj.setVisible(true);
        }

    }
}

	
class Sframe extends JFrame implements ActionListener
{
    JLabel name_label,mail_label,phonenum_label,gender_label,date_label, user_label, password_label, valid1,valid2,valid3,valid4,valid5;
    JTextField name_text,mail_text,phonenum_text, user_text, password_text;
    JRadioButton male,female,other;
    JComboBox day, month, year; 
    JCheckBox check_tc;
    JButton reset,submit, next;
    JLabel txt, txmail_text;

    Sframe()
    {
        setTitle("Sign Up");
        setSize(1200,800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        Container c=getContentPane();
        c.setBackground(new Color(209, 226, 196));

        name_label=new JLabel("Name:");
        name_label.setFont(new Font("Lucida Grande", Font.PLAIN,17));
        name_label.setSize(223, 20);
        name_label.setLocation(400, 150);
        c.add(name_label);

        name_text=new JTextField();
        name_text.setSize(223, 20);
        name_text.setLocation(540, 150);
        c.add(name_text);

        mail_label=new JLabel("Email Id:");
        mail_label.setFont(new Font("Lucida Grande", Font.PLAIN,17));
        mail_label.setSize(100, 20);
        mail_label.setLocation(400, 200);
        c.add(mail_label);

        mail_text=new JTextField();
        mail_text.setSize(223, 20);
        mail_text.setLocation(540, 200);
        c.add(mail_text);

        phonenum_label=new JLabel("Phone Number:");
        phonenum_label.setFont(new Font("Lucida Grande", Font.PLAIN,17));
        phonenum_label.setSize(223, 20);
        phonenum_label.setLocation(400, 250);
        c.add(phonenum_label);

        phonenum_text=new JTextField();
        phonenum_text.setSize(223, 20);
        phonenum_text.setLocation(540, 250);
        c.add(phonenum_text);

        gender_label=new JLabel("Gender:");
        gender_label.setFont(new Font("Lucida Grande", Font.PLAIN,17));
        gender_label.setSize(100, 20);
        gender_label.setLocation(400, 300);
        c.add(gender_label);

        male=new JRadioButton("Male");
        male.setSelected(true);
        male.setSize(80, 20);
        male.setLocation(540, 300);
        c.add(male);
  
        female =new JRadioButton("Female");
        female.setSelected(false);
        female.setSize(85, 20);
        female.setLocation(600, 300);
        c.add(female);

        other=new JRadioButton("Other");
        other.setSelected(false);
        other.setSize(85, 20);
        other.setLocation(680, 300);
        c.add(other);

        ButtonGroup group=new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(other);

        date_label=new JLabel("Date Of Birth:");
        date_label.setFont(new Font("Lucida Grande", Font.PLAIN,17));
        date_label.setSize(223, 20);
        date_label.setLocation(400, 350);
        c.add(date_label);

        String dd[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18", "19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String mm[]={"01","02","03","04","05","06","07","08","09","10","11","12"};
        String yyyy[]={"2020","2021","2019","2018","2017","2016","2015","2014","2013","2012","2011",
                       "2010","2009","2008","2007","2006","2005","2004","2003","2002","2001",
                       "2000","1999","1998","1997","1996","1995","1994","1993","1992","1991",
                       "1990","1989","1988","1987","1986","1985","1984","1983","1982","1981",
                       "1980","1979","1978","1977","1976","1975","1974","1973","1972","1971",
                       "1970","1969","1968","1967","1966","1965","1964","1963","1962","1961",
                       "1960","1959","1958","1957","1956","1955","1954","1953","1952","1951",
                       "1950","1949","1948","1947","1996","1995","1944","1943","1942","1941",
                       "1940","1939","1938","1937","1936","1935","1934","1933","1932","1931","1930" };

        day=new JComboBox(dd);
        day.setSize(70, 20);
        day.setLocation(540, 350);
        c.add(day);

        month=new JComboBox(mm);
        month.setSize(70, 20);
        month.setLocation(610, 350);
        c.add(month);
  
        year=new JComboBox(yyyy);
        year.setSize(90, 20);
        year.setLocation(680, 350);
        c.add(year);

        user_label=new JLabel("Username:");
        user_label.setFont(new Font("Lucida Grande", Font.PLAIN,17));
        user_label.setSize(100, 20);
        user_label.setLocation(400, 400);
        c.add(user_label);

        user_text=new JTextField();
        user_text.setSize(223, 20);
        user_text.setLocation(540, 400);
        c.add(user_text);

        password_label=new JLabel("Password:");
        password_label.setFont(new Font("Lucida Grande", Font.PLAIN,17));
        password_label.setSize(100, 20);
        password_label.setLocation(400, 450);
        c.add(password_label);

        password_text=new JTextField();
        password_text.setSize(223, 20);
        password_text.setLocation(540, 450);

        c.add(password_text);

        check_tc=new JCheckBox("I agree to the Terms of Use and Privacy Statement");
        check_tc.setFont(new Font("Lucida Grande", Font.PLAIN,17));
        check_tc.setSize(500, 30);
        check_tc.setLocation(392, 500);
        c.add(check_tc);

        reset=new JButton("Reset");
        reset.setFont(new Font("Lucida Grande", Font.PLAIN,17));
        reset.setSize(150, 30);
        reset.setLocation(400, 560);
        c.add(reset);
        reset.addActionListener(this);

        submit=new JButton("Submit");
        submit.setFont(new Font("Lucida Grande", Font.PLAIN,17));
        submit.setSize(150, 30);
        submit.setLocation(585, 560);
        c.add(submit);
        submit.addActionListener(this);

        next=new JButton("Next");
        next.setFont(new Font("Lucida Grande", Font.PLAIN,17));
        next.setSize(150, 30);
        next.setLocation(585, 600);
        c.add(next);
        next.addActionListener(this);

        txt=new JLabel("");
        txt.setSize(450, 20);
        txt.setLocation(400, 530);
        c.add(txt);

        txmail_text=new JLabel("");
        txmail_text.setSize(450, 20);
        txmail_text.setLocation(400, 590);
        c.add(txmail_text);

        valid1=new JLabel("");
        valid1.setSize(200, 200);
        valid1.setLocation(400, 80);
        c.add(valid1);

        valid2=new JLabel("");
        valid2.setSize(400, 200);
        valid2.setLocation(400, 130);
        c.add(valid2);

        valid3=new JLabel("");
        valid3.setSize(400, 200);
        valid3.setLocation(400, 180);
        c.add(valid3);

        valid4=new JLabel("");
        valid4.setSize(400, 200);
        valid4.setLocation(400, 330);
        c.add(valid4);

        next.setVisible(false);
 
        c.setLayout(null);
        setVisible(true);
    }

        public void actionPerformed(ActionEvent e)
        {
            String name = name_text.getText();
            String mail = mail_text.getText();
            String phone = phonenum_text.getText();
            String user = user_text.getText();
            String pass = password_text.getText();

        if((e.getSource()==submit))
        {
       
            //System.out.println(name+" "+mail+" "+phone+" "+user+" "+pass);

            String epat = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    
            if (!mail.matches(epat))
            {
                valid2.setForeground(new Color(179, 25, 0));
                valid2.setText("Please enter a valid email id!");

            }
            else
            {
                valid2.setText("");
            }

            if (!name.matches("[a-zA-Z]+"))
            {
                valid1.setForeground(new Color(179, 25, 0));
                valid1.setText("Please check!");

            }
            else
            {
                valid1.setText("");
            }

            if (!mail.matches(epat))
            {
                valid2.setForeground(new Color(179, 25, 0));
                valid2.setText("Please enter a valid email id!");

            }
            else
            {
                valid2.setText("");
            }

            if (!phone.matches("[z70-9]+[z70-9]+[z70-9]+[z70-9]+[z70-9]+[z70-9]+[z70-9]+[z70-9]+[z70-9]+[z70-9]"))
            {
                valid3.setForeground(new Color(179, 25, 0));
                valid3.setText("Please enter a valid phone number!");

            }
            else
            {
                valid3.setText("");
            }

            if (!user.matches("[a-zA-Z0-9]+"))
            {
                valid4.setForeground(new Color(179, 25, 0));
                valid4.setText("Please don't use special characters!");

            }
            else
            {
                valid4.setText("");
            }
            
        }
        
        if((e.getSource()==submit)&&(check_tc.isSelected())&&(!name_text.getText().equals("")&&!mail_text.getText().equals("")&&!phonenum_text.getText().equals("")&&!user_text.getText().equals("")&&!password_text.getText().equals("")&&valid1.getText().equals("")&&valid2.getText().equals("")&&valid3.getText().equals("")&&valid4.getText().equals("")))
        {
            String gender ="m" ;
            String dob;

            dob = year.getItemAt(year.getSelectedIndex())+"-"+month.getItemAt(month.getSelectedIndex())+"-"+day.getItemAt(day.getSelectedIndex()); 
            //System.out.println(dob);
            if(male.isSelected())
            {    
                  gender = "M";
            }  
             if(female.isSelected())
            {    
                  gender = "F";
            }  
             if(other.isSelected())
            {    
                  gender = "O";
            } 
            txmail_text.setForeground(new Color(0,100,0));
            //System.out.println(name+mail+phone+user+pass+phone+dob+gender);
            sql fill_user_data= new sql();
            fill_user_data.add_user_info(name,user,mail,phone,gender,dob,pass);
            txmail_text.setText("Registeration is complete.");
            txt.setText("");
            next.setVisible(true);
         }
        else
        {
            txt.setText("");
        }

        if(e.getSource()==next)
        {
                this.dispose();
                Login log = new Login();
                log.setVisible(true);
        }


        else if (!check_tc.isSelected())
        {
            txt.setForeground(new Color(179, 25, 0));
            txt.setText("Please accept the Terms of Use and Privacy.");
            txmail_text.setText("");
            next.setVisible(false);
        } 

        if(e.getSource()==reset)
        {
         
            name_text.setText("");
            mail_text.setText("");
            phonenum_text.setText("");

            check_tc.setSelected(false);

            day.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);

            txt.setText("");
            txmail_text.setText("");

            user_text.setText("");
            password_text.setText("");
            valid1.setText("");
            valid2.setText("");
            valid3.setText("");
            valid4.setText("");

            next.setVisible(false);
        }
    }
}

class MainScreen extends JFrame implements ActionListener {

    JButton money_management;
    JButton self_care;
    JLabel background,text1,text; 
  
    
    MainScreen() {

        
        setTitle("HOME PAGE");
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(1200,800);
        setLocationRelativeTo(null);
        setResizable(false);

        Container panel=getContentPane();
         panel.setLayout(null);

        Color color = new Color(212,6,6);    
        
        text1 = new JLabel("Welcome to Lifefy!");
        text1.setBounds(380,210,700,100);
        text1.setFont(new Font("Contrast", Font.BOLD, 50));
        panel.add(text1);

        text = new JLabel("What would you like to do today?");
        text.setBounds(400,310,500,45);
        text.setForeground(new Color(1, 50, 32));
        text.setFont(new Font("Contrast", Font.BOLD, 25));
        panel.add(text);
    

        money_management = new JButton("Money Management");
        money_management.setBounds(635,420,300,50);  
        panel.add(money_management);  
        money_management.setBackground(color);
        money_management.setBorderPainted(false);
        money_management.setFont(new Font("Contrast", Font.BOLD,20)) ;
        money_management.setForeground(Color.WHITE);
        money_management.setOpaque(true);
        money_management.addActionListener(this);

        self_care = new JButton("Personal Care");
        self_care.setBorderPainted(false);
        panel.add(self_care);  
        self_care.setBounds(290,420,300,50);   
        self_care.setBackground(color);  
        self_care.setBorderPainted(false);
        self_care.setFont(new Font("Contrast", Font.BOLD,20)) ;
        self_care.setForeground(Color.WHITE);
        self_care.setOpaque(true);
        self_care.addActionListener(this);   

        background=new JLabel(new ImageIcon("mainscreen/final.gif"));
        background.setBounds(0,0,1200,800);
        panel.add(background);
        setVisible(true);
        }
         public void actionPerformed(ActionEvent ae){

            if(ae.getSource() == money_management)
            {
                Bill bill_page = new Bill();
                bill_page.setVisible(true);
            }
            else if(ae.getSource() == self_care)
            {
                SelfCare sc = new SelfCare();
                sc.setVisible(true);
            }
        
    }
}


class Reset extends JFrame implements ActionListener {

    private static JLabel password, rpassword;
    private static JTextField passtext, rpasstext;
    private static JLabel background;
    private static JButton button, back;
    private static JLabel success;
    Container panel = getContentPane();

    Reset(){

        setTitle("Reset");
        setSize(450,350);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        panel.setLayout(null);
        panel.setBackground(new Color(119, 221, 119));

        JLabel resetpass = new JLabel("RESET PASSWORD");
        resetpass.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        resetpass.setSize(200, 30);
        resetpass.setLocation(125,30);
        panel.add(resetpass); 

        password = new JLabel("Enter Password:");
        password.setSize(150, 20);
        password.setLocation(60, 90);
        panel.add(password);

        passtext = new JTextField();
        passtext.setSize(200, 20);
        passtext.setLocation(190, 90);
        panel.add(passtext);

        rpassword = new JLabel("Re-enter Password:");
        rpassword.setSize(200, 20);
        rpassword.setLocation(60, 130);
        panel.add(rpassword);

        rpasstext = new JTextField();
        rpasstext.setSize(200, 20);
        rpasstext.setLocation(190, 130);
        panel.add(rpasstext);

        button = new JButton("Reset");
        button.setSize(100, 20);
        button.setOpaque(true);
        button.setLocation(175, 190);
        button.addActionListener(this);
        panel.add(button);

        back = new JButton("< back");
        back.setSize(100, 20);
        back.setOpaque(false);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setLocation(10,270);
        back.addActionListener(this);
        panel.add(back);

        success = new JLabel("");
        success.setBounds(130,220,320,25);
        success.setForeground(Color.WHITE);
        panel.add(success);
        setVisible(true); 


    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==back)
        {
            this.dispose();
        }
        else if(e.getSource()==button){

            String pass = passtext.getText();
            String cpass = rpasstext.getText();

        if(pass.isEmpty()==true || cpass.isEmpty()==true)
        {
            success.setText("Please fill in both the sections");            
        }
        else if(!pass.equals(cpass)){
            success.setText("Passwords don't match");
            
        }
        else{
            JOptionPane.showMessageDialog(panel,"Your password has been reset. Click okay to Login");
            this.dispose();

        }
        }
}
}

public class Lifefy{
    
 public static void main(String[] args){

            Start obj = new Start();
}
}