import java.awt.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.text.*;


class ForgetPassword extends JFrame implements ActionListener{

    private static JLabel key, error_text;
    private static JButton submit,reset;
    private static JTextField fptextfield, otptextfield;
    private static JLabel ptext,otptext,text, fptext;
    Container panel=getContentPane();

    ForgetPassword(){
        
        setTitle("Password Reset");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        panel.setLayout(null);
        panel.setBackground(new Color(252, 108, 133));

        fptext = new JLabel("Forgot Password?");
        fptext.setBounds(135,30,135, 30);   
        fptext.setFont(new Font("Ariel", Font.BOLD, 14)); 
        fptext.setVisible(true); 
        panel.add(fptext);

        key = new JLabel(new ImageIcon("fp/key.png"));
        key.setBounds(180,70,32,32);
        key.setVisible(true); 
        panel.add(key);

        fptext = new JLabel("Enter the email address associated with your account");
        fptext.setBounds(37,122,350, 30);   
        fptext.setFont(new Font("Ariel", Font.BOLD, 12)); 
        fptext.setVisible(true); 
        panel.add(fptext);

        ptext = new JLabel("Enter Email : ");
        ptext.setFont(new Font("Ariel", Font.BOLD, 12));
        ptext.setBounds(37,170,100, 30);    
        ptext.setVisible(true); 
        panel.add(ptext); 

        fptextfield = new JTextField("");
        fptextfield.setBounds(125,172,210, 25);
        fptextfield.addActionListener(this);
        fptextfield.setVisible(true); 
        panel.add(fptextfield);  


        submit = new JButton(new ImageIcon("fp/next.png"));
        submit.setOpaque(false);
        submit.setContentAreaFilled(false);
        submit.setBorderPainted(false);
        submit.setBounds(345,172,24, 24);    
        submit.setVisible(true); 
        panel.add(submit);
        submit.addActionListener(this);


        text = new JLabel("A verification code has been sent to your mail, Please Check!");
        text.setBounds(10,122,400,20);    
        text.setFont(new Font("Ariel", Font.BOLD, 12)); 
        text.setVisible(false); 
        panel.add(text);

        otptext = new JLabel("Enter OTP :");
        otptext .setFont(new Font("Ariel", Font.BOLD, 12));
        otptext.setBounds(37,170,100, 30);    
        otptext.setVisible(false); 
        panel.add(otptext);

        otptextfield = new JTextField("");
        otptextfield.setBounds(125,172,210, 25);
        otptextfield.addActionListener(this);
        otptextfield.setVisible(false); 
        panel.add(otptextfield);  

        reset = new JButton(new ImageIcon("fp/next.png"));
        reset.setOpaque(false);
        reset.setContentAreaFilled(false);
        reset.setBorderPainted(false);
        reset.setBounds(295,180,24, 24);    
        reset.setVisible(false); 
        panel.add(reset);
        reset.addActionListener(this);
        

        error_text = new JLabel("");
        error_text.setBounds(130,220,180, 20);
        error_text.setForeground(Color.WHITE);
        error_text.setVisible(true);
        panel.add(error_text);
       
        setVisible(true);  


    }
    public void actionPerformed(ActionEvent e){

    if(e.getSource()== submit)
    {
        String getmail = fptextfield.getText();
        if(getmail.isEmpty()==true)
        {
            error_text.setText("Please Enter a valid Email Id");            
        }
        else
        {
           panel.setBackground(new Color(108,252,155));
           ptext.setVisible(false); 
           fptext.setVisible(false);
           fptextfield.setVisible(false);
           submit.setVisible(false);
           error_text.setVisible(false);
           text.setVisible(true);
           otptext.setVisible(true);
           otptextfield.setVisible(true);
           reset.setBounds(345,172,24, 24);
           reset.setVisible(true); 
           
        }


    }
     if(e.getSource()== reset)
        {
            String getotp = otptextfield.getText();

        if(getotp.isEmpty()==true)
        {
            error_text.setText("Please Enter a valid OTP");
            error_text.setBounds(130,220,180, 20);
            error_text.setForeground(Color.RED);
            error_text.setVisible(true);
            
        }
        else
        {
          this.dispose();
          Reset res = new Reset();
          res.setVisible(true);
           
        } 
        }
     

    }
}