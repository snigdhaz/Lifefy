import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Bill extends JFrame implements ActionListener {

    private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JLabel Ebill,background;
    private static JLabel Pbill;
    private static JLabel Wbill;
    private static JLabel wibill;
    private static JLabel success;
    private static JRadioButton picon;
    private static JRadioButton wicon;
    private static JRadioButton wifiicon;
    private static JRadioButton eicon;
    private static ButtonGroup group;
    private static JButton click;
    private static JButton back;
    Container panel =getContentPane();

    Bill() {

        setTitle("PAY BILLS");
        setSize(1200,800);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        panel.setLayout(null);

        JLabel text = new JLabel("What would you like to pay?");
        text.setFont(new Font("Lucinda", Font.PLAIN, 40));
        text.setBounds(325, 100,600, 50);
        panel.add(text);

        group =new ButtonGroup();


        Ebill = new JLabel("Electricity Bill");
        Ebill .setFont(new Font("Lucida Grande", Font.PLAIN,20));
        Ebill.setSize(350, 100);
        Ebill.setLocation(310, 253);
        Ebill.setIcon(new ImageIcon("bill_icons/light.png"));
        panel.add(Ebill);

        eicon=new JRadioButton();    
        eicon.setBounds(270, 290, 30,30);  
        eicon.setContentAreaFilled(false);
        eicon.setBorderPainted(false);
        panel.add(eicon); 

        Pbill = new JLabel("Phone Bill");
        Pbill .setFont(new Font("Lucida Grande", Font.PLAIN,20));
        Pbill.setSize(350, 100);
        Pbill.setLocation(680,258);
        Pbill.setIcon(new ImageIcon("bill_icons/phone.png"));
        panel.add(Pbill);

        picon=new JRadioButton();    
        picon.setBounds(645,290,30,30);
        picon.setContentAreaFilled(false);
        picon.setBorderPainted(false);
        panel.add(picon); 

        Wbill = new JLabel("Water Bill");
        Wbill .setFont(new Font("Lucida Grande", Font.PLAIN,20));
        Wbill.setSize(350, 100);
        Wbill.setLocation(310, 423);
        Wbill.setIcon(new ImageIcon("bill_icons/water.png"));
        panel.add(Wbill);

        wicon=new JRadioButton();    
        wicon.setBounds(270,463,30,30); 
        wicon.setContentAreaFilled(false);
        wicon.setBorderPainted(false);  
        panel.add(wicon); 

        wibill = new JLabel("Wifi Bill");
        wibill .setFont(new Font("Lucida Grande", Font.PLAIN,20));
        wibill.setSize(350, 100);
        wibill.setLocation(680, 417);
        wibill.setIcon(new ImageIcon("bill_icons/wifi.png"));
        panel.add(wibill);

        wifiicon=new JRadioButton();    
        wifiicon.setBounds(645,453,30,30); 
        wifiicon.setContentAreaFilled(false);
        wifiicon.setBorderPainted(false);   
        panel.add(wifiicon);

        group.add(eicon);
        group.add(wifiicon);
        group.add(wicon);
        group.add(picon);  


        click =new JButton("Next");  
        click.setFont(new Font("Lucida Grande", Font.PLAIN,20));
        click.setForeground(new Color(0, 161, 156));
        click.setBounds(715,635,200,40);    
        click.addActionListener(this);
        panel.add(click); 

        back =new JButton("Back");  
        back.setFont(new Font("Lucida Grande", Font.PLAIN,20));
        back.setForeground(new Color(0, 161, 156));
        back.setBounds(285,635,200,40);    
        back.addActionListener(this);
        panel.add(back); 


        success = new JLabel("");
        success.setBounds(160,250,150,25);
        success.setForeground(Color.BLACK);
        panel.add(success);

        background=new JLabel(new ImageIcon("bill_icons/bg.gif"));
        background.setBounds(0,0,1200,800);
        panel.add(background);
        setVisible(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == back)
        {
            this.dispose();
        }
        else if(eicon.isSelected())
        { 

         Eframe elec_bill= new Eframe();
         elec_bill.setVisible(true);    
         } 

        else if(wifiicon.isSelected()){ 

         Bframe wifi_bill= new Bframe();
         wifi_bill.setVisible(true);     
        }

        else if(picon.isSelected()){ 

        Pframe phoneb= new Pframe();
        phoneb.setVisible(true);  
        }

        else if(wicon.isSelected()){

        Wframe water_bill= new Wframe();
        water_bill.setVisible(true);
        } 

    }

}

class Wframe extends JFrame implements ActionListener
{
    JLabel paydate_label,state_label,city_label,rcomplex_label,usnumber_label,amount_label,valid1,valid2,valid3,valid4,txt;
    JTextField city_text,rcomplex_text,usnumber_text,amount_text;
    JComboBox day, month, year, state; 
    JLabel dsclmr;
    JButton reset,submit, proceed; 
    JTextArea receipt;
    JButton download, print, save, back,pay;
    JLabel card_label,exp_label,Cvv,cardh_name,visa, master, validc1, validc2,validc3,txtc1, txtc1c2;
    JTextField card_text,exp_text_dd, exp_text_yy, Cvv_text,name_text;
    JCheckBox tap;
    Container c=getContentPane();

    Wframe()
    {
        setTitle("Water Bill Payment Portal");
        setSize(1200,800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        c.setBackground(new Color(204,229,255));

        paydate_label=new JLabel("Date of Payment:");
        paydate_label.setSize(200, 20);
        paydate_label.setLocation(100, 100);
        c.add(paydate_label);

        String dd[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18", "19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String mm[]={"01","02","03","04","05","06","07","08","09","10","11","12"};
        String yyyy[]={"2021","2022"};

        day=new JComboBox(dd);
        day.setSize(70, 20);
        day.setLocation(300, 100);
        c.add(day);

        month=new JComboBox(mm);
        month.setSize(85, 20);
        month.setLocation(370, 100);
        c.add(month);
  
        year=new JComboBox(yyyy);
        year.setSize(85, 20);
        year.setLocation(455, 100);
        c.add(year);
    
        state_label=new JLabel("State of Current Residency:");
        state_label.setSize(250, 20);
        state_label.setLocation(100, 150);
        c.add(state_label);

        String sor[]={"Andaman & Nicobar Islands","Andhra Pradesh","Arunchal Pradesh","Assam","Bihar","Chandigarh","Chhattisgarh","Dadra & Nagar Haveli","Daman & Diu","Delhi","Goa","Gujarat","Haryana","Himachal Pradesh",
                       "Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Ladhak","Lakshadweep","Madhya Pradesh","Maharashtra","Manipur","Meghalaya",
                        "Nagaland","Odisha","Puducherry","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh",
                        "Uttarakhand","West Bengal"};

        state=new JComboBox(sor);
        state.setSize(239, 20);
        state.setLocation(300, 150);
        c.add(state);

        city_label=new JLabel("City of Current Residency:");
        city_label.setSize(300, 20);
        city_label.setLocation(100, 200);
        c.add(city_label);

        valid1=new JLabel("");
        valid1.setSize(300, 20);
        valid1.setLocation(100, 220);
        c.add(valid1);

        city_text=new JTextField();
        city_text.setSize(239, 20);
        city_text.setLocation(300, 200);
        c.add(city_text);

        rcomplex_label=new JLabel("Name of Residential Complex:");
        rcomplex_label.setSize(300, 20);
        rcomplex_label.setLocation(100, 250);
        c.add(rcomplex_label);

        valid2=new JLabel("");
        valid2.setSize(300, 20);
        valid2.setLocation(100, 270);
        c.add(valid2);

        rcomplex_text=new JTextField();
        rcomplex_text.setSize(239, 20);
        rcomplex_text.setLocation(300, 250);
        c.add(rcomplex_text);

        usnumber_label=new JLabel("Unique Service Number:");
        usnumber_label.setSize(300, 20);
        usnumber_label.setLocation(100, 300);
        c.add(usnumber_label);

        valid3=new JLabel("");
        valid3.setSize(300, 20);
        valid3.setLocation(100, 320);
        c.add(valid3);

        usnumber_text=new JTextField();
        usnumber_text.setSize(239, 20);
        usnumber_text.setLocation(300, 300);
        c.add(usnumber_text);

        amount_label=new JLabel("Amount to be Paid:");
        amount_label.setSize(300, 20);
        amount_label.setLocation(100, 350);
        c.add(amount_label);

        valid4=new JLabel("");
        valid4.setSize(300, 20);
        valid4.setLocation(100, 370);
        c.add(valid4);

        amount_text=new JTextField();
        amount_text.setSize(239, 20);
        amount_text.setLocation(300, 350);
        c.add(amount_text);

        reset=new JButton("Reset");
        reset.setSize(220, 25);
        reset.setLocation(104, 640);
        c.add(reset);
        reset.addActionListener(this);

        pay=new JButton("Make Payment");
        pay.setSize(220, 25);
        pay.setLocation(335, 640);
        c.add(pay);
        pay.addActionListener(this);

        txt=new JLabel("");
        txt.setSize(450, 20);
        txt.setLocation(97, 445);
        c.add(txt);

        receipt=new JTextArea();
        receipt.setSize(400,560);
        receipt.setLocation(605, 100);
        receipt.setEditable(false);
        c.add(receipt);

        download = new JButton();
        download.setSize(18, 18);
        download.setLocation(945, 75);
        download.setIcon(new ImageIcon("bill2_icons/download.png"));
        download.setContentAreaFilled(false);
        download.setBorderPainted(false);
        c.add(download);
        download.addActionListener(this);

        print = new JButton();
        print.setSize(18, 18);
        print.setLocation(910, 75);
        print.setIcon(new ImageIcon("bill2_icons/print.png"));
        print.setContentAreaFilled(false);
        print.setBorderPainted(false);
        c.add(print);
        print.addActionListener(this);

        save = new JButton();
        save.setSize(18, 18);
        save.setLocation(875, 75);
        save.setIcon(new ImageIcon("bill2_icons/save.png"));
        save.setContentAreaFilled(false);
        save.setBorderPainted(false);
        c.add(save);
        save.addActionListener(this);

        back = new JButton();
        back.setSize(18, 18);
        back.setLocation(45, 75);
        back.setIcon(new ImageIcon("bill2_icons/back.png"));
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        c.add(back);
        back.addActionListener(this);

        card_label=new JLabel("Card Number: ");
        card_label.setSize(100, 20);
        card_label.setLocation(103, 420);
        c.add(card_label);

        validc1=new JLabel("");
        validc1.setSize(400, 20);
        validc1.setLocation(103, 438);
        c.add(validc1);

        card_text=new JTextField();
        card_text.setSize(338, 20);
        card_text.setLocation(200, 420);
        c.add(card_text);

        exp_label=new JLabel("Exp. Date:");
        exp_label.setSize(100, 20);
        exp_label.setLocation(103, 475);
        c.add(exp_label);

        exp_text_dd=new JTextField();
        exp_text_dd.setSize(50, 20);
        exp_text_dd.setLocation(200, 475);
        c.add(exp_text_dd);

        validc2=new JLabel("");
        validc2.setSize(400, 20);
        validc2.setLocation(103, 503);
        c.add(validc2);

        exp_text_yy=new JTextField();
        exp_text_yy.setSize(50, 20);
        exp_text_yy.setLocation(260, 475);
        c.add(exp_text_yy);

        Cvv=new JLabel("CVV:");
        Cvv.setSize(100, 20);
        Cvv.setLocation(340, 475);
        c.add(Cvv);

        Cvv_text=new JTextField();
        Cvv_text.setSize(50, 20);
        Cvv_text.setLocation(380, 475);
        c.add(Cvv_text);

        visa = new JLabel(new ImageIcon("card_pics/visa1.png"));
        visa.setSize(40, 40);
        visa.setLocation(440, 465);
        c.add(visa);

        master = new JLabel(new ImageIcon("card_pics/master1.png"));
        master.setSize(40, 40);
        master.setLocation(490, 465);
        c.add(master);

        cardh_name=new JLabel("Card Holder Name:");
        cardh_name.setSize(300, 20);
        cardh_name.setLocation(104, 535);
        c.add(cardh_name);

        name_text=new JTextField();
        name_text.setSize(308, 20);
        name_text.setLocation(235, 535);
        c.add(name_text);

        validc3=new JLabel("");
        validc3.setSize(400, 20);
        validc3.setLocation(104, 555);
        c.add(validc3);

        tap=new JCheckBox("I agree to the Terms of Use and Privacy Statement");
        tap.setSize(400, 30);
        tap.setLocation(100,583);
        c.add(tap);

        txtc1=new JLabel("");
        txtc1.setSize(450, 20);
        txtc1.setLocation(103, 690);
        c.add(txtc1);

        txtc1c2=new JLabel("");
        txtc1c2.setSize(450, 20);
        txtc1c2.setLocation(100, 750);
        c.add(txtc1c2);
 
        c.setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
    
        if(e.getSource() == back)
        {
            this.dispose();
        }

        if((e.getSource()==pay))
        { 
            String pd=day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
            String socr=state.getSelectedItem().toString();
    
            String cocr=city_text.getText();
            String rc=rcomplex_text.getText();
            String usn=usnumber_text.getText();
            String amnt=amount_text.getText();
            String cn=card_text.getText();
            String dd=exp_text_dd.getText();
            String yy=exp_text_yy.getText();
            String cvv=Cvv_text.getText();
            String n=name_text.getText();
            
            
            if (!cn.matches("[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]"))
            {
                validc1.setForeground(new Color(179, 25, 0));
                validc1.setText("Please re-check field!");
                
            }
            else
            {
                validc1.setText("");
            }

            if (!dd.matches("[z0-9]+[z0-9]"))
            {
                validc2.setForeground(new Color(179, 25, 0));
                validc2.setText("Please re-check field!");
               

            }
            else
            {
                validc2.setText("");
            }

            if (!yy.matches("[z0-9]+[z0-9]"))
            {
                validc2.setForeground(new Color(179, 25, 0));
                validc2.setText("Please re-check the field!");
            

            }
            else
            {
                validc2.setText("");
            }

            if (!cvv.matches("[z0-9]+[z0-9]+[z0-9]"))
            {
                validc2.setForeground(new Color(179, 25, 0));
                validc2.setText("Please re-check the field!");
               

            }
            else
            {
                validc2.setText("");
            }

            if (!n.matches("[a-zA-Z]+"))
            {
                validc3.setForeground(new Color(179, 25, 0));
                validc3.setText("Please re-check the field!");

            }
            else
            {
                validc3.setText("");
            }
           
            txtc1.setText("");
            

            if (!cocr.matches("[a-zA-Z]+"))
            {
                valid1.setForeground(new Color(179, 25, 0));
                valid1.setText("Please re-check feild!");
                System.out.println("check fields");

            }
            else
            {
                valid1.setText("");
            }

            if (!rc.matches("[a-zA-Z]+"))
            {
                valid2.setForeground(new Color(179, 25, 0));
                valid2.setText("Please re-check feild!");
                System.out.println("check fields");

            }
            else
            {
                valid2.setText("");
            }

            if (!usn.matches("[a-zA-Z0-9]+"))
            {
                valid3.setForeground(new Color(179, 25, 0));
                valid3.setText("Please re-check feild!");
                System.out.println("check fields");

            }
            else
            {
                valid3.setText("");
            }

            if (!amnt.matches("[z0-9]+"))
            {
                System.out.println("check fields");
                valid4.setForeground(new Color(179, 25, 0));
                valid4.setText("Please re-check feild!");

            }
            else
            {
                valid4.setText("");
            }
            
        }
        else
        {
            System.out.println("all correct");
        }

        if((e.getSource()==pay)
        &&(!city_text.getText().equals("")&&!rcomplex_text.getText().equals("")&&!usnumber_text.getText().equals("")&&!amount_text.getText().equals("")&&valid1.getText().equals("")&&valid2.getText().equals("")&&valid3.getText().equals("")&&valid4.getText().equals(""))
        &&(tap.isSelected())&&(!card_text.getText().equals("")&&!exp_text_dd.getText().equals("")&&!exp_text_yy.getText().equals("")&&!Cvv_text.getText().equals("")&&!name_text.getText().equals("")&&validc1.getText().equals("")&&validc2.getText().equals("")&&validc3.getText().equals("")))
        {
            String pd=year.getSelectedItem()+"-"+month.getSelectedItem()+"-"+day.getSelectedItem();
            String socr=state.getSelectedItem().toString();
    
            String cocr=city_text.getText();
            String rc=rcomplex_text.getText();
            String usn=usnumber_text.getText();
            String amnt=amount_text.getText();
            String cn=card_text.getText();
            String dd=exp_text_dd.getText();
            String yy=exp_text_yy.getText();
           String cvv=Cvv_text.getText();
           String n=name_text.getText();
            System.out.println("here");
            txtc1c2.setText("");
            txtc1.setText("");
            JOptionPane.showMessageDialog(c,"Transaction was successful");
            

            money wbill = new money();
            wbill.update_Water_payment(Example.cutomer_username,pd,socr,cocr,rc,usn,Integer.parseInt(amnt)); 

            receipt.setText("\n\n*********************WATER BILL RECEIPT*************************\n\n\n   Payment Date: " + pd+"\n\n   Residential Complex: "+rc+"\n   City of Current Residency: "+cocr+"\n   State of Current Residency: "+socr+"\n\n  Amount Paid: "+amnt+"\n\n\n*****************THANK YOU FOR USING LIFEFY********************");

        }

        if(e.getSource()==reset)
        {
        
            city_text.setText("");
            rcomplex_text.setText("");
            usnumber_text.setText("");
            amount_text.setText("");

            txt.setText("");

            valid1.setText("");
            valid2.setText("");
            valid3.setText("");
            valid4.setText("");

            state.setSelectedIndex(0);

            day.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);

            receipt.setText("");

        }


        if(e.getSource()==print)
        {
            JOptionPane.showMessageDialog(c,"Bill receipt succesfully printed");
        }
            
        if(e.getSource()==download)
        {
            JOptionPane.showMessageDialog(c,"Bill receipt downloaded");
        }
            
        if(e.getSource()==save)
        {
            JOptionPane.showMessageDialog(c,"Bill receipt saved into your Clipboard");
        }

    }
}
class Pframe extends JFrame implements ActionListener
{
    JLabel phonen_label,sprovider_label,plan_label,paydate_label,amount_label,valid1,valid2;
    JTextField phonen_text,amount_text;
    JRadioButton pre,post;
    JComboBox day, month, year, provider; 
    JButton reset,submit, proceed, b4;
    JLabel txt;
    JTextArea receipt;
    JButton download, print, save, back;
    JLabel card_label,exp_label,Cvv,cardh_name,visa, master,valid3,valid4,validc1,validc2, validc3;
    JTextField card_text,exp_text_dd, exp_text_yy, Cvv_text,name_text;
    JCheckBox tap;
    JButton clear,pay;
    JLabel txt2;
    Container c=getContentPane();
    

    Pframe()
    {
        setTitle("Phone Bill Payment Portal");
        setSize(1200,800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        c.setBackground(new Color(192, 174, 224));

        phonen_label=new JLabel("Phone Number:");
        phonen_label.setSize(100, 20);
        phonen_label.setLocation(100, 100);
        c.add(phonen_label);

        valid1=new JLabel("");
        valid1.setSize(200, 20);
        valid1.setLocation(100, 120);
        c.add(valid1);

        phonen_text=new JTextField();
        phonen_text.setSize(234, 20);
        phonen_text.setLocation(230, 100);
        c.add(phonen_text);

        sprovider_label=new JLabel("Service Provider:");
        sprovider_label.setSize(200, 20);
        sprovider_label.setLocation(100, 150);
        c.add(sprovider_label);

        String p[]={"AirTel","Reliance Jio","Vodaphone Idea","BSNL Mobile" };

        provider=new JComboBox(p);
        provider.setSize(236, 20);
        provider.setLocation(230, 150);
        c.add(provider);

        plan_label=new JLabel("Plan Chosen:");
        plan_label.setSize(100, 20);
        plan_label.setLocation(100, 200);
        c.add(plan_label);


        pre=new JRadioButton("Pre-Paid");
        pre.setSelected(true);
        pre.setSize(100, 20);
        pre.setLocation(230, 200);
        c.add(pre);
  
        post=new JRadioButton("Post-paid");
        post.setSelected(false);
        post.setSize(100, 20);
        post.setLocation(370, 200);
        c.add(post);

        ButtonGroup g=new ButtonGroup();
        g.add(pre);
        g.add(post);

        paydate_label=new JLabel("Payment Date:");
        paydate_label.setSize(200, 20);
        paydate_label.setLocation(100, 250);
        c.add(paydate_label);

        String dd[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18", "19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String mm[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec" };
        String yyyy[]={"2021","2020" };

        day=new JComboBox(dd);
        day.setSize(70, 20);
        day.setLocation(230, 250);
        c.add(day);

        month=new JComboBox(mm);
        month.setSize(85, 20);
        month.setLocation(300, 250);
        c.add(month);
  
        year=new JComboBox(yyyy);
        year.setSize(85, 20);
        year.setLocation(385, 250);
        c.add(year);

        amount_label=new JLabel("Amount to be paid:");
        amount_label.setSize(200, 20);
        amount_label.setLocation(100, 300);
        c.add(amount_label);

        amount_text=new JTextField();
        amount_text.setSize(236, 20);
        amount_text.setLocation(230, 300);
        c.add(amount_text);

        valid2=new JLabel("");
        valid2.setSize(200, 20);
        valid2.setLocation(100, 320);
        c.add(valid2);

        txt=new JLabel("");
        txt.setSize(450, 20);
        txt.setLocation(97, 390);
        c.add(txt);

        receipt=new JTextArea();
        receipt.setSize(400,560);
        receipt.setLocation(605, 100);
        receipt.setEditable(false);
        c.add(receipt);

        download = new JButton();
        download.setSize(18, 18);
        download.setLocation(945, 75);
        download.setIcon(new ImageIcon("bill2_icons/download.png"));
        download.setContentAreaFilled(false);
        download.setBorderPainted(false);
        download.addActionListener(this);
        c.add(download);

        print = new JButton();
        print.setSize(18, 18);
        print.setLocation(910, 75);
        print.setIcon(new ImageIcon("bill2_icons/print.png"));
        print.setContentAreaFilled(false);
        print.setBorderPainted(false);
        print.addActionListener(this);
        c.add(print);

        save = new JButton();
        save.setSize(18, 18);
        save.setLocation(875, 75);
        save.setIcon(new ImageIcon("bill2_icons/save.png"));
        save.setContentAreaFilled(false);
        save.setBorderPainted(false);
        save.addActionListener(this);
        c.add(save);

        back = new JButton();
        back.setSize(18, 18);
        back.setLocation(45, 75);
        back.setIcon(new ImageIcon("bill2_icons/back.png"));
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        c.add(back);
        back.addActionListener(this);

        card_label=new JLabel("Card Number: ");
        card_label.setSize(100, 20);
        card_label.setLocation(103, 370);
        c.add(card_label);

        validc1=new JLabel("");
        validc1.setSize(400, 20);
        validc1.setLocation(103, 388);
        c.add(validc1);

        card_text=new JTextField();
        card_text.setSize(338, 20);
        card_text.setLocation(200, 370);
        c.add(card_text);

        exp_label=new JLabel("Exp. Date:");
        exp_label.setSize(100, 20);
        exp_label.setLocation(103, 425);
        c.add(exp_label);

        exp_text_dd=new JTextField();
        exp_text_dd.setSize(50, 20);
        exp_text_dd.setLocation(200, 425);
        c.add(exp_text_dd);

        validc2=new JLabel("");
        validc2.setSize(400, 20);
        validc2.setLocation(103, 453);
        c.add(validc2);

        exp_text_yy=new JTextField();
        exp_text_yy.setSize(50, 20);
        exp_text_yy.setLocation(260, 425);
        c.add(exp_text_yy);

        Cvv=new JLabel("CVV:");
        Cvv.setSize(100, 20);
        Cvv.setLocation(340, 425);
        c.add(Cvv);

        Cvv_text=new JTextField();
        Cvv_text.setSize(50, 20);
        Cvv_text.setLocation(380, 425);
        c.add(Cvv_text);

        visa = new JLabel(new ImageIcon("card_pics/visa1.png"));
        visa.setSize(40, 40);
        visa.setLocation(440, 415);
        c.add(visa);

        master = new JLabel(new ImageIcon("card_pics/master1.png"));
        master.setSize(40, 40);
        master.setLocation(490, 415);
        c.add(master);

        cardh_name=new JLabel("Card Holder Name:");
        cardh_name.setSize(300, 20);
        cardh_name.setLocation(104, 485);
        c.add(cardh_name);

        name_text=new JTextField();
        name_text.setSize(308, 20);
        name_text.setLocation(235, 485);
        c.add(name_text);

        validc3=new JLabel("");
        validc3.setSize(400, 20);
        validc3.setLocation(104, 505);
        c.add(validc3);

        tap=new JCheckBox("I agree to the Terms of Use and Privacy Statement");
        tap.setSize(400, 30);
        tap.setLocation(100,533);
        c.add(tap);

        reset=new JButton("Reset");
        reset.setSize(220, 25);
        reset.setLocation(104, 590);
        c.add(reset);
        reset.addActionListener(this);

        pay=new JButton("Make Payment");
        pay.setSize(220, 25);
        pay.setLocation(335, 590);
        c.add(pay);
        pay.addActionListener(this);


        txt=new JLabel("");
        txt.setSize(450, 20);
        txt.setLocation(103, 330);
        c.add(txt);

        txt2=new JLabel("");
        txt2.setSize(450, 20);
        txt2.setLocation(100, 400);
        c.add(txt2);

 
        c.setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==back)
        {
            this.dispose();
        }

        if(e.getSource()==pay)
        {
            String pn=phonen_text.getText();
            String amount_paying=amount_text.getText();
            String cn=card_text.getText();
            String dd=exp_text_dd.getText();
            String yy=exp_text_yy.getText();
            String cvv=Cvv_text.getText();
            String n=name_text.getText();

            if (!cn.matches("[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]"))
            {
                validc1.setForeground(new Color(179, 25, 0));
                validc1.setText("Please re-check field!");
            }
            else
            {
                validc1.setText("");
            }

            if (!dd.matches("[z0-9]+[z0-9]"))
            {
                validc2.setForeground(new Color(179, 25, 0));
                validc2.setText("Please re-check field!");

            }
            else
            {
                validc2.setText("");
            }

            if (!yy.matches("[z0-9]+[z0-9]"))
            {
                validc2.setForeground(new Color(179, 25, 0));
                validc2.setText("Please re-check the field!");

            }
            else
            {
                validc2.setText("");
            }

            if (!cvv.matches("[z0-9]+[z0-9]+[z0-9]"))
            {
                validc2.setForeground(new Color(179, 25, 0));
                validc2.setText("Please re-check the field!");

            }
            else
            {
                validc2.setText("");
            }

            if (!n.matches("[a-zA-Z]+"))
            {
                validc3.setForeground(new Color(179, 25, 0));
                validc3.setText("Please re-check the field!");

            }
            else
            {
                validc3.setText("");
            }
           
            txt.setText("");


            if (!pn.matches("[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]"))
            {
                valid1.setForeground(new Color(179, 25, 0));
                valid1.setText("PPlease re-check the field!");

            }
            else
            {
                valid1.setText("");
            }

            if (!amount_paying.matches("[z0-9]+"))
            {
                valid2.setForeground(new Color(179, 25, 0));
                valid2.setText("Please re-check the field!");

            }
            else
            {
                valid2.setText("");
            }

        }

        if((e.getSource()==pay)
            &&(!phonen_text.getText().equals("")&&!amount_text.getText().equals("")&&valid1.getText().equals("")&&valid2.getText().equals(""))
            &&(tap.isSelected())&&(!card_text.getText().equals("")&&!exp_text_dd.getText().equals("")&&!exp_text_yy.getText().equals("")&&!Cvv_text.getText().equals("")&&!name_text.getText().equals("")&&valid1.getText().equals("")&&valid2.getText().equals("")&&valid3.getText().equals("")))
        {
            String pn=phonen_text.getText();
            String sp=provider.getSelectedItem().toString();
            String pc="Pre-paid";

            if(post.isSelected())
            {
                pc="Post-Paid";
            }
            String pd=year.getSelectedItem()+"-"+month.getSelectedItem()+"-"+day.getSelectedItem();
            String amount_paying=amount_text.getText();

             //String o =  Example.cutomer_username;
             //System.out.println(o);
            money k = new money();
            k.update_Ppayment(Example.cutomer_username,pn,sp,pc,pd,Integer.parseInt(amount_paying)); 


            receipt.setText("\n\n**********PHONE BILL RECEIPT************\n\n\n   Payment Date: " + pd+"\n\n   Phone Number: "+pn+"\n   Service Provider: "+sp+"\n   Plan Chosen: "+pc+"\n\n   Amount: "+amount_paying+"\n\n\n*****THANK YOU FOR USING LIFEFY********");
            

            txt.setForeground(new Color(0,0,128));

            JOptionPane.showMessageDialog(c,"Transaction was successful");
           


        }

        if(e.getSource()==print)
        {
            JOptionPane.showMessageDialog(c,"Bill receipt succesfully printed");
        }
            
        if(e.getSource()==download)
        {
            JOptionPane.showMessageDialog(c,"Bill receipt downloaded");
        }
            
        if(e.getSource()==save)
        {
            JOptionPane.showMessageDialog(c,"Bill receipt saved into your Clipboard");
        }

        if(e.getSource()==reset)
        {
            phonen_text.setText("");
            amount_text.setText("");

            provider.setSelectedIndex(0);
            day.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
  
            txt.setText("");

            valid1.setText("");
            valid2.setText("");

            receipt.setText("");

    
        }
        
    }

}


class Eframe extends JFrame implements ActionListener
{
    JLabel paydate_label,stateor_label,city_label,rcomplexname_label,usnum_label,meternum_label,amount_label,valid1,valid2,valid3,valid4,valid5;
    JTextField city_text,rcomplexname_text,uservicenum_text,meternum_text,amount_text;
    JComboBox day, month, year, state; 
    JLabel dsclmr;
    JButton reset,submit, proceed;
    JLabel txt;
    JTextArea receipt;
    JButton download, print, save, back;
    JLabel card_label,exp_label,Cvv,cardh_name,visa, master, validc1, validc2,validc3,validc4;
    JTextField card_text,exp_text_dd, exp_text_yy, Cvv_text,name_text;
    JCheckBox tap;
    JButton pay;
    JLabel txtc1, txtc1c2;
    Container c=getContentPane();

    Eframe()
    {
        setTitle("Electricity Payment Portal");
        setSize(1200,800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        c.setBackground(new Color(239,204,0));

        paydate_label=new JLabel("Date of Payment:");
        paydate_label.setSize(200, 20);
        paydate_label.setLocation(100, 100);
        c.add(paydate_label);

        String dd[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18", "19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String mm[]={"01","02","03","04","05","06","07","08","09","10","11","12" };
        String yyyy[]={"2021","2020" };

        day=new JComboBox(dd);
        day.setSize(70, 20);
        day.setLocation(300, 100);
        c.add(day);

        month=new JComboBox(mm);
        month.setSize(85, 20);
        month.setLocation(370, 100);
        c.add(month);
  
        year=new JComboBox(yyyy);
        year.setSize(85, 20);
        year.setLocation(455, 100);
        c.add(year);
    
        stateor_label=new JLabel("State of Current Residency:");
        stateor_label.setSize(250, 20);
        stateor_label.setLocation(100, 150);
        c.add(stateor_label);

        String sor[]={"Andaman & Nicobar Islands","Andhra Pradesh","Arunchal Pradesh","Assam","Bihar","Chandigarh","Chhattisgarh","Dadra & Nagar Haveli","Daman & Diu","Delhi","Goa","Gujarat","Haryana","Himachal Pradesh",
                       "Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Ladhak","Lakshadweep","Madhya Pradesh","Maharashtra","Manipur","Meghalaya",
                        "Nagaland","Odisha","Puducherry","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh",
                        "Uttarakhand","West Bengal"};

        state=new JComboBox(sor);
        state.setSize(239, 20);
        state.setLocation(300, 150);
        c.add(state);

        city_label=new JLabel("City of Current Residency:");
        city_label.setSize(300, 20);
        city_label.setLocation(100, 200);
        c.add(city_label);

        valid1=new JLabel("");
        valid1.setSize(300, 20);
        valid1.setLocation(100, 215);
        c.add(valid1);

        city_text=new JTextField();
        city_text.setSize(239, 20);
        city_text.setLocation(300, 200);
        c.add(city_text);

        rcomplexname_label=new JLabel("Name of Resindtial Complex:");
        rcomplexname_label.setSize(300, 20);
        rcomplexname_label.setLocation(100, 250);
        c.add(rcomplexname_label);

        valid2=new JLabel("");
        valid2.setSize(300, 20);
        valid2.setLocation(100, 265);
        c.add(valid2);

        rcomplexname_text=new JTextField();
        rcomplexname_text.setSize(239, 20);
        rcomplexname_text.setLocation(300, 250);
        c.add(rcomplexname_text);

        usnum_label=new JLabel("Unique Service Number:");
        usnum_label.setSize(300, 20);
        usnum_label.setLocation(100, 300);
        c.add(usnum_label);

        valid3=new JLabel("");
        valid3.setSize(300, 20);
        valid3.setLocation(100, 315);
        c.add(valid3);

        uservicenum_text=new JTextField();
        uservicenum_text.setSize(239, 20);
        uservicenum_text.setLocation(300, 300);
        c.add(uservicenum_text);

        meternum_label=new JLabel("Meter No:");
        meternum_label.setSize(200, 20);
        meternum_label.setLocation(100, 350);
        c.add(meternum_label);

        meternum_text=new JTextField();
        meternum_text.setSize(110, 20);
        meternum_text.setLocation(175, 350);
        c.add(meternum_text);

        valid4=new JLabel("");
        valid4.setSize(300, 20);
        valid4.setLocation(100, 365);
        c.add(valid4);

        amount_label=new JLabel("Amount:");
        amount_label.setSize(200, 20);
        amount_label.setLocation(304, 350);
        c.add(amount_label);

        valid5=new JLabel();
        valid5.setSize(300, 20);
        valid5.setLocation(304, 365);
        c.add(valid5);

        amount_text=new JTextField();
        amount_text.setSize(169, 20);
        amount_text.setLocation(370, 350);
        c.add(amount_text);

        txt=new JLabel("");
        txt.setSize(450, 20);
        txt.setLocation(97, 445);
        c.add(txt);

        receipt=new JTextArea();
        receipt.setSize(400,560);
        receipt.setLocation(605, 100);
        receipt.setEditable(false);
        c.add(receipt);

        download = new JButton();
        download.setSize(18, 18);
        download.setLocation(945, 75);
        download.setIcon(new ImageIcon("bill2_icons/download.png"));
        download.setContentAreaFilled(false);
        download.setBorderPainted(false);
        download.addActionListener(this);
        c.add(download);

        print = new JButton();
        print.setSize(18, 18);
        print.setLocation(910, 75);
        print.setIcon(new ImageIcon("bill2_icons/print.png"));
        print.setContentAreaFilled(false);
        print.setBorderPainted(false);
        print.addActionListener(this);
        c.add(print);

        save = new JButton();
        save.setSize(18, 18);
        save.setLocation(875, 75);
        save.setIcon(new ImageIcon("bill2_icons/save.png"));
        save.setContentAreaFilled(false);
        save.setBorderPainted(false);
        save.addActionListener(this);
        c.add(save);

        back = new JButton();
        back.setSize(18, 18);
        back.setLocation(45, 75);
        back.setIcon(new ImageIcon("bill2_icons/back.png"));
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        c.add(back);
        back.addActionListener(this);

        card_label=new JLabel("Card Number: ");
        card_label.setSize(100, 20);
        card_label.setLocation(103, 420);
        c.add(card_label);

        validc1=new JLabel("");
        validc1.setSize(400, 20);
        validc1.setLocation(103, 438);
        c.add(validc1);

        card_text=new JTextField();
        card_text.setSize(338, 20);
        card_text.setLocation(200, 420);
        c.add(card_text);

        exp_label=new JLabel("Exp. Date:");
        exp_label.setSize(100, 20);
        exp_label.setLocation(103, 475);
        c.add(exp_label);

        exp_text_dd=new JTextField();
        exp_text_dd.setSize(50, 20);
        exp_text_dd.setLocation(200, 475);
        c.add(exp_text_dd);

        validc2=new JLabel("");
        validc2.setSize(400, 20);
        validc2.setLocation(103, 503);
        c.add(validc2);

        exp_text_yy=new JTextField();
        exp_text_yy.setSize(50, 20);
        exp_text_yy.setLocation(260, 475);
        c.add(exp_text_yy);

        Cvv=new JLabel("CVV:");
        Cvv.setSize(100, 20);
        Cvv.setLocation(340, 475);
        c.add(Cvv);

        Cvv_text=new JTextField();
        Cvv_text.setSize(50, 20);
        Cvv_text.setLocation(380, 475);
        c.add(Cvv_text);

        visa = new JLabel(new ImageIcon("card_pics/visa1.png"));
        visa.setSize(40, 40);
        visa.setLocation(440, 465);
        c.add(visa);

        master = new JLabel(new ImageIcon("card_pics/master1.png"));
        master.setSize(40, 40);
        master.setLocation(490, 465);
        c.add(master);

        cardh_name=new JLabel("Card Holder Name:");
        cardh_name.setSize(300, 20);
        cardh_name.setLocation(104, 535);
        c.add(cardh_name);

        name_text=new JTextField();
        name_text.setSize(308, 20);
        name_text.setLocation(235, 535);
        c.add(name_text);

        validc3=new JLabel("");
        validc3.setSize(400, 20);
        validc3.setLocation(104, 555);
        c.add(validc3);

        tap=new JCheckBox("I agree to the Terms of Use and Privacy Statement");
        tap.setSize(400, 30);
        tap.setLocation(100,583);
        c.add(tap);

        txtc1=new JLabel("");
        txtc1.setSize(450, 20);
        txtc1.setLocation(103, 330);
        c.add(txtc1);

        txtc1c2=new JLabel("");
        txtc1c2.setSize(450, 20);
        txtc1c2.setLocation(100, 400);
        c.add(txtc1c2);

        reset=new JButton("Reset");
        reset.setSize(220, 25);
        reset.setLocation(104, 640);
        c.add(reset);
        reset.addActionListener(this);

        pay=new JButton("Make Payment");
        pay.setSize(220, 25);
        pay.setLocation(335, 640);
        c.add(pay);
        pay.addActionListener(this);

        c.setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String cn=card_text.getText();
        String dd=exp_text_dd.getText();
        String yy=exp_text_yy.getText();
        String cvv=Cvv_text.getText();
        String n=name_text.getText();
    
        if(e.getSource() == back)
        {
            this.dispose();
        }
        
        if((e.getSource()==pay))
        {
            
            String cocr=city_text.getText();
            String rc=rcomplexname_text.getText();
            String usn=uservicenum_text.getText();
            String mn=meternum_text.getText();
            String amnt=amount_text.getText();

            if (!cn.matches("[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]"))
            {
                validc1.setForeground(new Color(179, 25, 0));
                validc1.setText("Please re-check field!");
            }
            else
            {
                validc1.setText("");
            }

            if (!dd.matches("[z0-9]+[z0-9]"))
            {
                validc2.setForeground(new Color(179, 25, 0));
                validc2.setText("Please re-check field!");

            }
            else
            {
                validc2.setText("");
            }

            if (!yy.matches("[z0-9]+[z0-9]"))
            {
                validc2.setForeground(new Color(179, 25, 0));
                validc2.setText("Please re-check the field!");

            }
            else
            {
                validc2.setText("");
            }

            if (!cvv.matches("[z0-9]+[z0-9]+[z0-9]"))
            {
                validc2.setForeground(new Color(179, 25, 0));
                validc2.setText("Please re-check the field!");

            }
            else
            {
                validc2.setText("");
            }

            if (!n.matches("[a-zA-Z]+"))
            {
                validc3.setForeground(new Color(179, 25, 0));
                validc3.setText("Please re-check the field!");

            }
            else
            {
                validc3.setText("");
            }
           
            txtc1.setText("");

            if (!cocr.matches("[a-zA-Z]+"))
            {
                valid1.setForeground(new Color(179, 25, 0));
                valid1.setText("Please re-check field!");

            }
            else
            {
                valid1.setText("");
            }

            if (!rc.matches("[a-zA-Z]+"))
            {
                valid2.setForeground(new Color(179, 25, 0));
                valid2.setText("Please re-check field!");

            }
            else
            {
                valid2.setText("");
            }

            if (!usn.matches("[a-zA-Z0-9]+"))
            {
                valid3.setForeground(new Color(179, 25, 0));
                valid3.setText("Please re-check the field!");

            }
            else
            {
                valid3.setText("");
            }

            if (!mn.matches("[z0-9]+"))
            {
                valid4.setForeground(new Color(179, 25, 0));
                valid4.setText("Please re-check the field!");

            }
            else
            {
                valid4.setText("");
            }

            if (!amnt.matches("[z0-9]+"))
            {
                valid5.setForeground(new Color(179, 25, 0));
                valid5.setText("Please re-check the field!");

            }
            else
            {
                valid5.setText("");
            }
           
        }


        if((e.getSource()==pay)&&(!city_text.getText().equals("")
            &&!rcomplexname_text.getText().equals("")&&!uservicenum_text.getText().equals("")&&!meternum_text.getText().equals("")&&!amount_text.getText().equals("")&&valid1.getText().equals("")&&valid2.getText().equals("")&&valid3.getText().equals("")&&valid4.getText().equals("")&&valid5.getText().equals(""))
            &&(!card_text.getText().equals("")&&!exp_text_dd.getText().equals("")&&!exp_text_yy.getText().equals("")&&!Cvv_text.getText().equals("")&&!name_text.getText().equals("")&&validc1.getText().equals("")&&validc2.getText().equals("")&&validc3.getText().equals("")))
        {
            String pd=year.getSelectedItem()+"-"+month.getSelectedItem()+"-"+day.getSelectedItem();
            String socr=state.getSelectedItem().toString();
            String cocr=city_text.getText();
            String rc=rcomplexname_text.getText();
            String usn=uservicenum_text.getText();
            String mn=meternum_text.getText();
            String amnt=amount_text.getText();

            money k = new money();
            k.update_Epayment(Example.cutomer_username,pd,usn,Integer.parseInt(amnt),socr,cocr,rc,mn); 


            receipt.setText("\n\n******************ELECTRICITY BILL RECEIPT**********************\n\n\n   Payment Date: " + pd+"\n\n   Residental Complex: "+rc+"\n   City of Current Residency: "+cocr+"\n   State of Current Residency: "+socr+"\n\n  Meter No: "+mn+"\n  Amount Paid: "+amnt+"\n\n\n*****************THANK YOU FOR USING LIFEFY********************");
            JOptionPane.showMessageDialog(c,"Transaction was successful");
            txt.setForeground(new Color(0,0,128));



        }

        if(e.getSource()==print)
        {
            JOptionPane.showMessageDialog(c,"Bill receipt succesfully printed");
        }

        if(e.getSource()==download)
        {
            JOptionPane.showMessageDialog(c,"Bill receipt downloaded");
        }

        if(e.getSource()==save){
            JOptionPane.showMessageDialog(c,"Bill receipt saved into your Clipboard");
        }

        if(e.getSource()==reset)
        {
        
            city_text.setText("");
            rcomplexname_text.setText("");
            uservicenum_text.setText("");
            meternum_text.setText("");
            amount_text.setText("");

            txt.setText("");

            state.setSelectedIndex(0);

            day.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);

            card_text.setText("");
            exp_text_dd.setText("");
            exp_text_yy.setText("");
            Cvv_text.setText("");
            name_text.setText("");

            tap.setSelected(false);

            validc1.setText("");
            validc2.setText("");
            validc3.setText("");

            txtc1.setText("");
            txtc1c2.setText("");

            valid1.setText("");
            valid2.setText("");
            valid3.setText("");
            valid4.setText("");
            valid5.setText("");

            receipt.setText("");
        }
        
    }
}

class Bframe extends JFrame implements ActionListener
{
    JLabel serviceo_label,sid_label,choose_plan,paydate_label,amount_label,valid1,valid2;
    JTextField sid_text,amount_text;
    JRadioButton pre,post;
    JComboBox day, month, year, operator; 
    JButton reset,submit, b4;
    JLabel txt;
    JTextArea receipt;
    JButton download, print, save, back;
    JLabel card_label,exp_label,Cvv,cardh_name,visa, master, validc1, validc2,validc3,validc4;
    JTextField card_text,exp_text_dd, exp_text_yy, Cvv_text,name_text;
    JCheckBox tap;
    JButton pay;
    JLabel txtc1, txtc1c2;
    Container c=getContentPane();

    Bframe()
    {
        setTitle("BroadBand Bill Payment Portal");
        setSize(1200,800);;
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        c.setBackground(new Color(200, 200, 200));

        serviceo_label=new JLabel("Service Operator:");
        serviceo_label.setSize(200, 20);
        serviceo_label.setLocation(100, 110);
        c.add(serviceo_label);

        String o[]={"AirTel","Reliance JioFiber","BSNL","ACT FiberNet","Zoom FiberNet","ExciTel", "Hathway","YouBroadband","GigaTel","Spectra","MTNL","SITI","Other" };

        operator=new JComboBox(o);
        operator.setSize(236, 20);
        operator.setLocation(230, 110);
        c.add(operator);

        sid_label=new JLabel("Service ID Number:");
        sid_label.setSize(200, 20);
        sid_label.setLocation(100, 160);
        c.add(sid_label);

        valid1=new JLabel("");
        valid1.setSize(200, 20);
        valid1.setLocation(100, 180);
        c.add(valid1);

        sid_text=new JTextField();
        sid_text.setSize(234, 20);
        sid_text.setLocation(230, 160);
        c.add(sid_text);

        choose_plan=new JLabel("Plan Chosen:");
        choose_plan.setSize(100, 20);
        choose_plan.setLocation(100, 210);
        c.add(choose_plan);

        pre=new JRadioButton("Pre-Paid");
        pre.setSelected(true);
        pre.setSize(100, 20);
        pre.setLocation(230, 210);
        c.add(pre);
  
        post=new JRadioButton("Post-paid");
        post.setSelected(false);
        post.setSize(100, 20);
        post.setLocation(370, 210);
        c.add(post);

        ButtonGroup g=new ButtonGroup();
        g.add(pre);
        g.add(post);

        paydate_label=new JLabel("Payment Date:");
        paydate_label.setSize(200, 20);
        paydate_label.setLocation(100, 260);
        c.add(paydate_label);

        String dd[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18", "19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String mm[]={"01","02","03","04","05","06","07","08","09","10","11","12" };
        String yyyy[]={"2021","2020" };

        day=new JComboBox(dd);
        day.setSize(70, 20);
        day.setLocation(230, 260);
        c.add(day);

        month=new JComboBox(mm);
        month.setSize(85, 20);
        month.setLocation(300, 260);
        c.add(month);
  
        year=new JComboBox(yyyy);
        year.setSize(85, 20);
        year.setLocation(385, 260);
        c.add(year);

        amount_label=new JLabel("Amount to be paid:");
        amount_label.setSize(200, 20);
        amount_label.setLocation(100, 310);
        c.add(amount_label);

        valid2=new JLabel("");
        valid2.setSize(200, 20);
        valid2.setLocation(100, 330);
        c.add(valid2);

        amount_text=new JTextField();
        amount_text.setSize(236, 20);
        amount_text.setLocation(230, 310);
        c.add(amount_text);

        txt=new JLabel("");
        txt.setSize(450, 20);
        txt.setLocation(97, 400);
        c.add(txt);

        receipt=new JTextArea();
        receipt.setSize(400,520);
        receipt.setLocation(605, 90);
        receipt.setEditable(false);
        c.add(receipt);

        download = new JButton();
        download.setSize(18, 18);
        download.setLocation(945, 60);
        download.setIcon(new ImageIcon("bill2_icons/download.png"));
        download.setContentAreaFilled(false);
        download.setBorderPainted(false);
        download.addActionListener(this);
        c.add(download);

        print = new JButton();
        print.setSize(18, 18);
        print.setLocation(910, 60);
        print.setIcon(new ImageIcon("bill2_icons/print.png"));
        print.setContentAreaFilled(false);
        print.setBorderPainted(false);
        print.addActionListener(this);
        c.add(print);

        save = new JButton();
        save.setSize(18, 18);
        save.setLocation(875, 60);
        save.setIcon(new ImageIcon("bill2_icons/save.png"));
        save.setContentAreaFilled(false);
        save.setBorderPainted(false);
        save.addActionListener(this);
        c.add(save);

        back = new JButton();
        back.setSize(18, 18);
        back.setLocation(45, 75);
        back.setIcon(new ImageIcon("bill2_icons/back.png"));
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        c.add(back);
        back.addActionListener(this);

        card_label=new JLabel("Card Number: ");
        card_label.setSize(100, 20);
        card_label.setLocation(103, 370);
        c.add(card_label);

        validc1=new JLabel("");
        validc1.setSize(400, 20);
        validc1.setLocation(103, 388);
        c.add(validc1);

        card_text=new JTextField();
        card_text.setSize(338, 20);
        card_text.setLocation(200, 370);
        c.add(card_text);

        exp_label=new JLabel("Exp. Date:");
        exp_label.setSize(100, 20);
        exp_label.setLocation(103, 425);
        c.add(exp_label);

        exp_text_dd=new JTextField();
        exp_text_dd.setSize(50, 20);
        exp_text_dd.setLocation(200, 425);
        c.add(exp_text_dd);

        validc2=new JLabel("");
        validc2.setSize(400, 20);
        validc2.setLocation(103, 453);
        c.add(validc2);

        exp_text_yy=new JTextField();
        exp_text_yy.setSize(50, 20);
        exp_text_yy.setLocation(260, 425);
        c.add(exp_text_yy);

        Cvv=new JLabel("CVV:");
        Cvv.setSize(100, 20);
        Cvv.setLocation(340, 425);
        c.add(Cvv);

        Cvv_text=new JTextField();
        Cvv_text.setSize(50, 20);
        Cvv_text.setLocation(380, 425);
        c.add(Cvv_text);

        visa = new JLabel(new ImageIcon("card_pics/visa1.png"));
        visa.setSize(40, 40);
        visa.setLocation(440, 415);
        c.add(visa);

        master = new JLabel(new ImageIcon("card_pics/master1.png"));
        master.setSize(40, 40);
        master.setLocation(490, 415);
        c.add(master);

        cardh_name=new JLabel("Card Holder Name:");
        cardh_name.setSize(300, 20);
        cardh_name.setLocation(104, 485);
        c.add(cardh_name);

        name_text=new JTextField();
        name_text.setSize(308, 20);
        name_text.setLocation(235, 485);
        c.add(name_text);

        validc3=new JLabel("");
        validc3.setSize(400, 20);
        validc3.setLocation(104, 505);
        c.add(validc3);

        tap=new JCheckBox("I agree to the Terms of Use and Privacy Statement");
        tap.setSize(400, 30);
        tap.setLocation(100,533);
        c.add(tap);

        txtc1=new JLabel("");
        txtc1.setSize(450, 20);
        txtc1.setLocation(103, 280);
        c.add(txtc1);

        txtc1c2=new JLabel("");
        txtc1c2.setSize(450, 20);
        txtc1c2.setLocation(100, 350);
        c.add(txtc1c2);

        reset=new JButton("Reset");
        reset.setSize(220, 25);
        reset.setLocation(104, 590);
        c.add(reset);
        reset.addActionListener(this);

        pay=new JButton("Make Payment");
        pay.setSize(220, 25);
        pay.setLocation(335, 590);
        c.add(pay);
        pay.addActionListener(this);

        c.setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {

        String cn=card_text.getText();
        String dd=exp_text_dd.getText();
        String yy=exp_text_yy.getText();
        String cvv=Cvv_text.getText();
        String n=name_text.getText();

        if(e.getSource() == back)
        {
            this.dispose();
        }

        if((e.getSource()==pay))
        {
            String sin=sid_text.getText();
            String amnt=amount_text.getText();

            if (!cn.matches("[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]"))
            {
                validc1.setForeground(new Color(179, 25, 0));
                validc1.setText("Please re-check field!");
            }
            else
            {
                validc1.setText("");
            }

            if (!dd.matches("[z0-9]+[z0-9]"))
            {
                validc2.setForeground(new Color(179, 25, 0));
                validc2.setText("Please re-check field!");

            }
            else
            {
                validc2.setText("");
            }

            if (!yy.matches("[z0-9]+[z0-9]"))
            {
                validc2.setForeground(new Color(179, 25, 0));
                validc2.setText("Please re-check the field!");

            }
            else
            {
                validc2.setText("");
            }

            if (!cvv.matches("[z0-9]+[z0-9]+[z0-9]"))
            {
                validc2.setForeground(new Color(179, 25, 0));
                validc2.setText("Please re-check the field!");

            }
            else
            {
                validc2.setText("");
            }

            if (!n.matches("[a-zA-Z]+"))
            {
                validc3.setForeground(new Color(179, 25, 0));
                validc3.setText("Please re-check the field!");

            }
            else
            {
                validc3.setText("");
            }
           
            txtc1.setText("");
            if (!sin.matches("[a-zA-Z0-9]+"))
            {
                valid1.setForeground(new Color(179, 25, 0));
                valid1.setText("Please re-check the field!");
            }
            else
            {
                valid1.setText("");
            }

            if (!amnt.matches("[z0-9]+"))
            {
                valid2.setForeground(new Color(179, 25, 0));
                valid2.setText("Please re-check the field!");

            }
            else
            {
                valid2.setText("");
            }

        }

        if((e.getSource()==pay)
            &&(!sid_text.getText().equals("")&&!amount_text.getText().equals("")&&valid1.getText().equals("")&&valid2.getText().equals(""))
            &&(!card_text.getText().equals("")&&!exp_text_dd.getText().equals("")&&!exp_text_yy.getText().equals("")&&!Cvv_text.getText().equals("")&&!name_text.getText().equals("")&&validc1.getText().equals("")&&validc2.getText().equals("")&&validc3.getText().equals("")))
        {
            String so=operator.getSelectedItem().toString();
            String sin=sid_text.getText();
            String pd=year.getSelectedItem()+"-"+month.getSelectedItem()+"-"+day.getSelectedItem();
            String pc="Pre-paid";

            if(post.isSelected())
            {
                pc="Post-Paid";
            }
            String amnt=amount_text.getText();

            money k = new money();
            k.update_Wifi_payment(Example.cutomer_username,sin,so,pd,pc,Integer.parseInt(amnt)); 
            
            receipt.setText("\n\n********BROADBAND BILL RECEIPT***********\n\n\n   Payment Date: " + pd+"\n\n   Service Operator: "+so+"\n   Service ID Number: "+sin+"\n   Plan Chosen: "+pc+"\n\n   Amount: "+amnt+"\n\n\n*****THANK YOU FOR USING LIFEFY********");
            JOptionPane.showMessageDialog(c,"Transaction was successful");
            txt.setForeground(new Color(0,0,128));

        }

        if(e.getSource()==print)
        {
            JOptionPane.showMessageDialog(c,"Bill receipt succesfully printed");
        }

        if(e.getSource()==download)
        {
            JOptionPane.showMessageDialog(c,"Bill receipt downloaded");
        }

        if(e.getSource()==save)
        {
            JOptionPane.showMessageDialog(c,"Bill receipt saved into your Clipboard");
        }

        if(e.getSource()==reset)
        {
            sid_text.setText("");
            amount_text.setText("");

            operator.setSelectedIndex(0);
            day.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
  
            txt.setText("");
            receipt.setText("");

           valid1.setText("");
           valid2.setText("");

            card_text.setText("");
            exp_text_dd.setText("");
            exp_text_yy.setText("");
            Cvv_text.setText("");
            name_text.setText("");

            tap.setSelected(false);

            validc1.setText("");
            validc2.setText("");
            validc3.setText("");

            txtc1.setText("");
            txtc1c2.setText("");
        }

    }
}


/*class Cframe extends JFrame implements ActionListener
{
    JLabel card_label,exp_label,Cvv,cardh_name,visa, master, valid1, valid2,valid3,valid4;
    JTextField card_text,exp_text_dd, exp_text_yy, Cvv_text,name_text;
    JCheckBox tap;
    JButton clear,pay;
    JLabel txt, txt2;
    Container c=getContentPane();

    Cframe()
    {
        setTitle("CARD PAYMENT");
        setSize(530,460);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        c.setBackground(new Color(245,245,220));

        card_label=new JLabel("Card Number: ");
        card_label.setSize(100, 20);
        card_label.setLocation(103, 60);
        c.add(card_label);

        valid1=new JLabel("");
        valid1.setSize(400, 20);
        valid1.setLocation(103, 125);
        c.add(valid1);

        card_text=new JTextField();
        card_text.setSize(338, 20);
        card_text.setLocation(100, 95);
        c.add(card_text);

        exp_label=new JLabel("Exp. Date:");
        exp_label.setSize(100, 20);
        exp_label.setLocation(103, 155);
        c.add(exp_label);

        exp_text_dd=new JTextField();
        exp_text_dd.setSize(50, 20);
        exp_text_dd.setLocation(100, 185);
        c.add(exp_text_dd);

        valid2=new JLabel("");
        valid2.setSize(400, 20);
        valid2.setLocation(103, 210);
        c.add(valid2);

        exp_text_yy=new JTextField();
        exp_text_yy.setSize(50, 20);
        exp_text_yy.setLocation(160, 185);
        c.add(exp_text_yy);

        Cvv=new JLabel("CVV:");
        Cvv.setSize(100, 20);
        Cvv.setLocation(240, 155);
        c.add(Cvv);

        Cvv_text=new JTextField();
        Cvv_text.setSize(50, 20);
        Cvv_text.setLocation(234, 185);
        c.add(Cvv_text);


        cardh_name=new JLabel("Card Holder Name:");
        cardh_name.setSize(300, 20);
        cardh_name.setLocation(104, 240);
        c.add(cardh_name);

        name_text=new JTextField();
        name_text.setSize(338, 20);
        name_text.setLocation(100, 270);
        c.add(name_text);

        
        valid3=new JLabel("");
        valid3.setSize(400, 20);
        valid3.setLocation(104, 295);
        c.add(valid3);

        tap=new JCheckBox("I agree to the Terms of Use and Privacy Statement");
        tap.setSize(400, 30);
        tap.setLocation(97, 320);
        c.add(tap);

        clear=new JButton("Clear");
        clear.setSize(150, 20);
        clear.setLocation(100, 370);
        c.add(clear);
        clear.addActionListener(this);

        pay=new JButton("Make Payment");
        pay.setSize(150, 20);
        pay.setLocation(285, 370);
        c.add(pay);
        pay.addActionListener(this);

        visa = new JLabel(new ImageIcon("card_pics/visa1.png"));
        visa.setSize(40, 40);
        visa.setLocation(355, 190);
        c.add(visa);

        master = new JLabel(new ImageIcon("card_pics/master1.png"));
        master.setSize(40, 40);
        master.setLocation(310, 190);
        c.add(master);

        txt=new JLabel("");
        txt.setSize(450, 20);
        txt.setLocation(103, 330);
        c.add(txt);

        txt2=new JLabel("");
        txt2.setSize(450, 20);
        txt2.setLocation(100, 400);
        c.add(txt2);

        c.setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String cn=card_text.getText();
        String dd=exp_text_dd.getText();
        String yy=exp_text_yy.getText();
        String cvv=Cvv_text.getText();
        String n=name_text.getText();

        if( (e.getSource()==pay))
        {

            if (!cn.matches("[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]+[z0-9]"))
            {
                valid1.setForeground(new Color(179, 25, 0));
                valid1.setText("Please re-check field!");
            }
            else
            {
                valid1.setText("");
            }

            if (!dd.matches("[z0-9]+[z0-9]"))
            {
                valid2.setForeground(new Color(179, 25, 0));
                valid2.setText("Please re-check field!");

            }
            else
            {
                valid2.setText("");
            }

            if (!yy.matches("[z0-9]+[z0-9]"))
            {
                valid2.setForeground(new Color(179, 25, 0));
                valid2.setText("Please re-check the field!");

            }
            else
            {
                valid2.setText("");
            }

            if (!cvv.matches("[z0-9]+[z0-9]+[z0-9]"))
            {
                valid2.setForeground(new Color(179, 25, 0));
                valid2.setText("Please re-check the field!");

            }
            else
            {
                valid2.setText("");
            }

            if (!n.matches("[a-zA]+"))
            {
                valid3.setForeground(new Color(179, 25, 0));
                valid3.setText("Please re-check the field!");

            }
            else
            {
                valid3.setText("");
            }
           
            txt.setText("");
        }

        if((e.getSource()==pay)&&(tap.isSelected())&&(!card_text.getText().equals("")&&!exp_text_dd.getText().equals("")&&!exp_text_yy.getText().equals("")&&!Cvv_text.getText().equals("")&&!name_text.getText().equals("")&&valid1.getText().equals("")&&valid2.getText().equals("")&&valid3.getText().equals("")))
        {
            txt2.setText("");
            txt.setText("");
            JOptionPane.showMessageDialog(c,"Transaction was successful");
            Pframe p = new Pframe();
            setVisible(false);
            //money bills = new money(); 
            //bills.update_Ppayment(p.pn,p.sp,p.pc,p.pd,p.amount_paying,cn,dd,yy,cvv,n);
            this.dispose();
        }


        if(e.getSource()==clear)
        {
            card_text.setText("");
            exp_text_dd.setText("");
            exp_text_yy.setText("");
            Cvv_text.setText("");
            name_text.setText("");

            tap.setSelected(false);

            valid1.setText("");
            valid2.setText("");
            valid3.setText("");

            txt.setText("");
            txt2.setText("");
        }
    }
}
*/