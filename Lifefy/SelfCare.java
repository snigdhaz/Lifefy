import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class SelfCare extends JFrame implements ActionListener {

    private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JLabel Daily;
    private static JLabel Calendar;
    private static JLabel pic;
    private static JButton body, cal, soul, back;
    Container panel =getContentPane();
    
    SelfCare() {
        
        setTitle("Self Care");
        setSize(450,640);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        panel.setLayout(null);

        JLabel text = new JLabel("Start taking care of yourself now!");
        text.setFont(new Font("Lucinda Grande", Font.PLAIN, 18));
        text.setBounds(95,100,300, 100);
        panel.add(text);
        
        body =new JButton("Body");   
        body.setBounds(65,300,100, 20);    
        body.addActionListener(this);
        panel.add(body); 
        
        soul =new JButton("Soul");   
        soul.setBounds(175,300,100, 20);    
        soul.addActionListener(this);
        panel.add(soul);
        
        cal =new JButton("Mini Diary");  
        cal.setBounds(285,300,100, 20);    
        cal.addActionListener(this);
        panel.add(cal); 
        
        back =new JButton("Back");  
        back.setBounds(200,400,75, 20);    
        back.addActionListener(this);
        panel.add(back);

        pic = new JLabel(new ImageIcon("SC_mainpage/p3.gif"));
        pic.setBounds(0, 0, 450, 636);
        panel.add(pic);
        setVisible(true);
        } 

        public void actionPerformed(ActionEvent e){

        if (e.getSource() == back) {

            this.dispose();
        }
        if(e.getSource() == cal ){
            //dispose();
            CalendarProgram cd = new CalendarProgram();
            //cd.setVisible(true);
        }
        if(e.getSource() == soul ){
            this.dispose();
            SoulCare obj = new SoulCare();
            obj.setVisible(true);
        }
        if(e.getSource() == body ){
        dispose();
        new BodyCare();
        }
}
} 

class SoulCare extends JFrame implements ActionListener {

    private JButton attrate = new JButton("Rate Your Attitude");
    private JButton moodtrack = new JButton("Daily Mood Tracker");
    private JButton back =new JButton("Back"); 
    private JLabel pic;
    Container panel =getContentPane();

    
    
    SoulCare() {
        
        setTitle("Soul Care");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        
        
        attrate.setBounds(100,100,200, 40);    
        attrate.addActionListener(this);
        panel.add(attrate);
        
        
        moodtrack.setBounds(100,200,200, 40);    
        moodtrack.addActionListener(this);
        panel.add(moodtrack);
         
        back.setBounds(50,300,75, 20);    
        back.addActionListener(this);
        panel.add(back); 

        pic = new JLabel(new ImageIcon("SC_mainpage/scpic.png"));
        pic.setBounds(0, 0, 400, 400);
        panel.add(pic);
       
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource() == back) {

            this.dispose();
            SelfCare obj =new SelfCare();   
            obj.setVisible(true);

        }
        if(e.getSource() == attrate ){
            this.dispose();
            SoulCarer obj = new SoulCarer();
            obj.setVisible(true);
        }
        if(e.getSource() == moodtrack ){
            this.dispose();
            Lol obj = new Lol();
            obj.setVisible(true);
        }
}
}

class BodyCare extends JFrame implements ActionListener{
    private JButton healthrate = new JButton("Rate Your Health");
    private JButton healthtrack = new JButton("Daily Health Tracker");
    private JButton back =new JButton("Back"); 
    private JLabel pic;
    Container panel =getContentPane();
    
    BodyCare() {
        setTitle("Body Care");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(400,400);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);    
        
        healthrate.setBounds(100,100,200, 40);    
        healthrate.addActionListener(this);
        panel.add(healthrate);
        
        
        healthtrack.setBounds(100,200,200, 40);    
        healthtrack.addActionListener(this);
        panel.add(healthtrack);
         
        back.setBounds(50,300,75, 20);    
        back.addActionListener(this);
        panel.add(back);

        pic = new JLabel(new ImageIcon("SC_mainpage/bcpic.png"));
        pic.setBounds(0, 0, 400, 400);
        panel.add(pic);
   
       
       setVisible(true);
    }

     public void actionPerformed(ActionEvent e){

        if (e.getSource() == back) {

            this.dispose();
            SelfCare obj =new SelfCare();   
            obj.setVisible(true);

        }
        else if(e.getSource() == healthrate ){
            this.dispose();
            Bcare obj = new Bcare();
            obj.setVisible(true);
        }
        else if(e.getSource() == healthtrack ){

            this.dispose();
            Habit hab = new Habit();
            hab.setVisible(true);
        }
}
}

class Bcare extends JFrame implements ActionListener{

   
    private static JLabel background,display_score,result;
    private static JButton water_button,sleep_button, meditate_button, exercise_button, stretch_button;
    private static JButton sctime_button, walk_button,eat_button,done,back;
    Boolean wcheck,slcheck,mcheck,echeck,stcheck,sccheck,walkcheck, eatcheck;
    int score = 0;
 
    Container panel=getContentPane();
    

    Bcare(){
        
        setTitle("WELCOME!!");
        setSize(1350,650);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        water_button = new JButton("Plenty of water");
        water_button.setBackground(new Color(211,211,211));
        water_button.setOpaque(false);
        water_button.setForeground(new Color(211,211,211));
        water_button.setBorderPainted(false);
        water_button.setContentAreaFilled(false);
        water_button.setBounds(465,150,200, 100);
        water_button.setFont(new Font("Arial", Font.BOLD, 18));   
        water_button.addActionListener(this); 
        panel.add(water_button); 
        water_button.setVisible(true);
        wcheck = true;

        sleep_button = new JButton("8 hour sleep");
        sleep_button.setBackground(new Color(211,211,211));
        sleep_button.setOpaque(false);
        sleep_button.setForeground(new Color(211,211,211));
        sleep_button.setBorderPainted(false);
        sleep_button.setContentAreaFilled(false);
        sleep_button.setBounds(465,300,200, 100);
        sleep_button.setFont(new Font("Arial", Font.BOLD, 18));   
        sleep_button.addActionListener(this); 
        panel.add(sleep_button); 
        sleep_button.setVisible(true);
        slcheck = true;

        meditate_button = new JButton(" 40 min Meditation");
        meditate_button.setBackground(new Color(211,211,211));
        meditate_button.setOpaque(false);
        meditate_button.setForeground(new Color(211,211,211));
        meditate_button.setBorderPainted(false);
        meditate_button.setContentAreaFilled(false);
        meditate_button.setBounds(615,450,200, 100);
        meditate_button.setFont(new Font("Arial", Font.BOLD, 18));   
        meditate_button.addActionListener(this); 
        panel.add(meditate_button); 
        meditate_button.setVisible(true);
        mcheck = true;

        exercise_button = new JButton("30 min exercise");
        exercise_button.setBackground(new Color(211,211,211));
        exercise_button.setOpaque(false);
        exercise_button.setForeground(new Color(211,211,211));
        exercise_button.setBorderPainted(false);
        exercise_button.setContentAreaFilled(false);
        exercise_button.setBounds(765,150,200, 100);
        exercise_button.setFont(new Font("Arial", Font.BOLD, 18));   
        exercise_button.addActionListener(this); 
        panel.add(exercise_button); 
        exercise_button.setVisible(true);
        echeck = true;

        stretch_button = new JButton("15 min stertch");
        stretch_button.setBackground(new Color(211,211,211));
        stretch_button.setOpaque(false);
        stretch_button.setForeground(new Color(211,211,211));
        stretch_button.setBorderPainted(false);
        stretch_button.setContentAreaFilled(false);
        stretch_button.setBounds(1065,150,200, 100);
        stretch_button.setFont(new Font("Arial", Font.BOLD, 18));   
        stretch_button.addActionListener(this); 
        panel.add(stretch_button); 
        stretch_button.setVisible(true);
        stcheck = true;

        sctime_button = new JButton("Less screen time");
        sctime_button.setBackground(new Color(211,211,211));
        sctime_button.setOpaque(false);
        sctime_button.setForeground(new Color(211,211,211));
        sctime_button.setBorderPainted(false);
        sctime_button.setContentAreaFilled(false);
        sctime_button.setBounds(765,300,200, 100);
        sctime_button.setFont(new Font("Arial", Font.BOLD, 18));   
        sctime_button.addActionListener(this); 
        panel.add(sctime_button); 
        sctime_button.setVisible(true);
        sccheck = true;

        walk_button = new JButton("30 min walk");
        walk_button.setBackground(new Color(211,211,211));
        walk_button.setOpaque(false);
        walk_button.setForeground(new Color(211,211,211));
        walk_button.setBorderPainted(false);
        walk_button.setContentAreaFilled(false);
        walk_button.setBounds(1065,300,200, 100);
        walk_button.setFont(new Font("Arial", Font.BOLD, 18));   
        walk_button.addActionListener(this); 
        panel.add(walk_button); 
        walk_button.setVisible(true);
        walkcheck = true;

        eat_button= new JButton(" Ate Healthy");
        eat_button.setBackground(new Color(211,211,211));
        eat_button.setOpaque(false);
        eat_button.setForeground(new Color(211,211,211));
        eat_button.setBorderPainted(false);
        eat_button.setContentAreaFilled(false);
        eat_button.setBounds(915,450,200, 100);
        eat_button.setFont(new Font("Arial", Font.BOLD, 18));   
        eat_button.addActionListener(this); 
        panel.add(eat_button); 
        eat_button.setVisible(true);
        eatcheck = true;

       done= new JButton("Done");
       done.setBackground(Color.WHITE);
       done.setOpaque(true);
       done.setForeground(Color.BLACK);
       done.setBorderPainted(true);
       done.setContentAreaFilled(true);
       done.setBounds(820,560,100,30);   
       done.addActionListener(this); 
       panel.add(done); 
       done.setVisible(true);

        back= new JButton("<back");
        back.setOpaque(false);
        back.setForeground(Color.BLACK);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setBounds(20,550,100, 20);  
        back.addActionListener(this); 
        panel.add(back); 
        back.setVisible(true);

        display_score = new JLabel("");
        display_score.setBounds(186,196,198,213);
        display_score.setForeground(new Color(211,211,211) );
        display_score.setFont(new Font("Arial", Font.PLAIN, 54));
        panel.add(display_score);

        result = new JLabel("");
        result.setBounds(40,500,400,20);
        result.setForeground(new Color(101, 67, 33));
        result.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(result);

        panel.setLayout(null);
        background = new JLabel(new ImageIcon("ratebgs/bcf.png"));
        background.setBounds(0,0,1350,650);
        panel.add(background);

        setVisible(true); 
      
        }

        public void actionPerformed(ActionEvent e){

        if(e.getSource()==back){ 
         this.dispose();
         BodyCare obj = new BodyCare();
         obj.setVisible(true);
         }
        else if(e.getSource()==water_button && wcheck==true){ 
         water_button.setOpaque(true);
         water_button.setForeground(new Color(177, 156, 217));
         score = score + 3;
         wcheck = false;
         } 
         else if(e.getSource()==water_button && wcheck==false){
         water_button.setForeground(new Color(211,211,211));
         water_button.setOpaque(false);
         score = score - 3;
         wcheck = true;
         } 
         if(e.getSource()==sleep_button && slcheck==true){ 
         sleep_button.setOpaque(true);
         sleep_button.setForeground(new Color(177, 156, 217));
         score = score + 4;
         slcheck = false;
         } 
         else if(e.getSource()==sleep_button && slcheck==false){
         sleep_button.setForeground(new Color(211,211,211));
         sleep_button.setOpaque(false);
         score = score - 4;
         slcheck = true;
         }

         if(e.getSource()==meditate_button && mcheck==true){ 
         meditate_button.setOpaque(true);
         meditate_button.setForeground(new Color(177, 156, 217));
         score = score + 2;
         mcheck = false;
         } 
         else if(e.getSource()==meditate_button && mcheck==false){
         meditate_button.setForeground(new Color(211,211,211));
         meditate_button.setOpaque(false);
         score = score - 2;
         mcheck = true;
         } 

         if(e.getSource()==exercise_button && echeck==true){ 
         exercise_button.setOpaque(true);
         exercise_button.setForeground(new Color(177, 156, 217));
         score = score + 3;
         echeck = false;
         } 
         else if(e.getSource()==exercise_button && echeck==false){
         exercise_button.setForeground(new Color(211,211,211));
         exercise_button.setOpaque(false);
         score = score - 3;
         echeck = true;
         } 

         if(e.getSource()==stretch_button && stcheck==true){ 
         stretch_button.setOpaque(true);
         stretch_button.setForeground(new Color(177, 156, 217));
         score = score + 2;
         stcheck = false;
         } 
         else if(e.getSource()==stretch_button && stcheck==false){
         stretch_button.setForeground(new Color(211,211,211));
         stretch_button.setOpaque(false);
         score = score - 2;
         stcheck = true;
         } 

         if(e.getSource()==sctime_button && sccheck==true){ 
         sctime_button.setOpaque(true);
         sctime_button.setForeground(new Color(177, 156, 217));
         score = score + 2;
         sccheck = false;
         } 
         else if(e.getSource()==sctime_button && sccheck==false){
         sctime_button.setForeground(new Color(211,211,211));
         sctime_button.setOpaque(false);
         score = score - 2;
         sccheck = true;
        }

         if(e.getSource()==walk_button && walkcheck==true){ 
         walk_button.setOpaque(true);
         walk_button.setForeground(new Color(177, 156, 217));
         score = score + 3;
         walkcheck = false;
         } 
         else if(e.getSource()==walk_button && walkcheck==false){
         walk_button.setForeground(new Color(211,211,211));
         walk_button.setOpaque(false);
         score = score - 3;
         walkcheck = true;
         } 

        if(e.getSource()==eat_button&& eatcheck==true){ 
         eat_button.setOpaque(true);
         eat_button.setForeground(new Color(177, 156, 217));
         score = score + 1;
         eatcheck = false;
         } 
         else if(e.getSource()==eat_button&& eatcheck==false){
         eat_button.setForeground(new Color(211,211,211));
         eat_button.setOpaque(false);
         score = score - 1;
         eatcheck = true;
         }
         if(score>9)
         {
            display_score.setBounds(165,192,198,213);
         }
         if(score<10)
         {
            display_score.setBounds(186,196,198,213);
         }
         display_score.setText(String.valueOf(score));
         display_score.setVisible(true);

         if(e.getSource()==done)
         {
            pcsql health = new pcsql();
            health.add_data_rate_health(Example.cutomer_username,score,eatcheck, walkcheck, sccheck, stcheck, slcheck, echeck,mcheck,wcheck);
           
           if(score<8)
           {
            result.setText("You need to work more on your health :(");
            result.setVisible(true);
           }
           else if(score>7 && score<12)
           {
            result.setLocation(60,500);
            result.setText("Good Job! You're on the right track");
            result.setVisible(true);
           }
           else if(score>12)
           {
            result.setLocation(80,500);
            result.setText("Wow! Thats a great score!");
            result.setVisible(true);

           }
         }


    }
}

class SoulCarer extends JFrame implements ActionListener{

   
    private static JLabel background,result,display_score;
    private static JButton laugh_button,gratitude_button, reflection_buttonn, positive_button, read_button;
    private static JButton smile_button, active_button,strength_button, done,back;
    Boolean lcheck,gcheck,fcheck,pcheck,readcheck,smilpcheck,activpcheck, strengthcheck;
    int score = 0;
 
    Container panel=getContentPane();
    

    SoulCarer(){
        
        setTitle("WELCOME!!");
        setSize(1350,650);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        laugh_button = new JButton("Laugh Hard");
        laugh_button.setBackground(new Color(208, 223, 241));
        laugh_button.setOpaque(false);
        laugh_button.setForeground(new Color(208, 223, 241));
        laugh_button.setBorderPainted(false);
        laugh_button.setContentAreaFilled(false);
        laugh_button.setBounds(465,150,200, 100);
        laugh_button.setFont(new Font("Arial", Font.BOLD, 18));   
        laugh_button.addActionListener(this); 
        panel.add(laugh_button); 
        laugh_button.setVisible(true);
        lcheck = true;

        gratitude_button = new JButton("Live in the moment");
        gratitude_button.setBackground(new Color(208, 223, 241));
        gratitude_button.setOpaque(false);
        gratitude_button.setForeground(new Color(208, 223, 241));
        gratitude_button.setBorderPainted(false);
        gratitude_button.setContentAreaFilled(false);
        gratitude_button.setBounds(465,300,200, 100);
        gratitude_button.setFont(new Font("Arial", Font.BOLD, 16));   
        gratitude_button.addActionListener(this); 
        panel.add(gratitude_button); 
        gratitude_button.setVisible(true);
        gcheck = true;

        reflection_buttonn = new JButton("Reflection");
        reflection_buttonn.setBackground(new Color(208, 223, 241));
        reflection_buttonn.setOpaque(false);
        reflection_buttonn.setForeground(new Color(208, 223, 241));
        reflection_buttonn.setBorderPainted(false);
        reflection_buttonn.setContentAreaFilled(false);
        reflection_buttonn.setBounds(615,450,200, 100);
        reflection_buttonn.setFont(new Font("Arial", Font.BOLD, 18));   
        reflection_buttonn.addActionListener(this); 
        panel.add(reflection_buttonn); 
        reflection_buttonn.setVisible(true);
        fcheck = true;

        positive_button = new JButton("Stay Positive");
        positive_button.setBackground(new Color(208, 223, 241));
        positive_button.setOpaque(false);
        positive_button.setForeground(new Color(208, 223, 241));
        positive_button.setBorderPainted(false);
        positive_button.setContentAreaFilled(false);
        positive_button.setBounds(765,150,200, 100);
        positive_button.setFont(new Font("Arial", Font.BOLD, 18));   
        positive_button.addActionListener(this); 
        panel.add(positive_button); 
        positive_button.setVisible(true);
        pcheck = true;

        read_button = new JButton("Read a book");
        read_button.setBackground(new Color(208, 223, 241));
        read_button.setOpaque(false);
        read_button.setForeground(new Color(208, 223, 241));
        read_button.setBorderPainted(false);
        read_button.setContentAreaFilled(false);
        read_button.setBounds(1065,150,200, 100);
        read_button.setFont(new Font("Arial", Font.BOLD, 18));   
        read_button.addActionListener(this); 
        panel.add(read_button); 
        read_button.setVisible(true);
        readcheck = true;

        smile_button = new JButton("Smile");
        smile_button.setBackground(new Color(208, 223, 241));
        smile_button.setOpaque(false);
        smile_button.setForeground(new Color(208, 223, 241));
        smile_button.setBorderPainted(false);
        smile_button.setContentAreaFilled(false);
        smile_button.setBounds(765,300,200, 100);
        smile_button.setFont(new Font("Arial", Font.BOLD, 18));   
        smile_button.addActionListener(this); 
        panel.add(smile_button); 
        smile_button.setVisible(true);
        smilpcheck = true;

        active_button = new JButton("Treat yourself");
        active_button.setBackground(new Color(208, 223, 241));
        active_button.setOpaque(false);
        active_button.setForeground(new Color(208, 223, 241));
        active_button.setBorderPainted(false);
        active_button.setContentAreaFilled(false);
        active_button.setBounds(1065,300,200, 100);
        active_button.setFont(new Font("Arial", Font.BOLD, 18));   
        active_button.addActionListener(this); 
        panel.add(active_button); 
        active_button.setVisible(true);
        activpcheck = true;

        strength_button= new JButton("Lend a hand");
        strength_button.setBackground(new Color(208, 223, 241));
        strength_button.setOpaque(false);
        strength_button.setForeground(new Color(208, 223, 241));
        strength_button.setBorderPainted(false);
        strength_button.setContentAreaFilled(false);
        strength_button.setBounds(915,450,250, 100);
        strength_button.setFont(new Font("Arial", Font.BOLD, 18));   
        strength_button.addActionListener(this); 
        panel.add(strength_button); 
        strength_button.setVisible(true);
        strengthcheck = true;

       done= new JButton("Done");
       done.setBackground(Color.WHITE);
       done.setOpaque(true);
       done.setForeground(Color.BLACK);
       done.setBorderPainted(true);
       done.setContentAreaFilled(true);
       done.setBounds(820,560,100,30);   
       done.addActionListener(this); 
       panel.add(done); 
       done.setVisible(true);

        back= new JButton("<back");
        back.setOpaque(false);
        back.setForeground(Color.BLACK);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setBounds(20,550,100, 20);  
        back.addActionListener(this); 
        panel.add(back); 
        back.setVisible(true);

        display_score = new JLabel("");
        display_score.setBounds(186,196,198,213);
        display_score.setForeground(new Color(211,211,211) );
        display_score.setFont(new Font("Arial", Font.PLAIN, 54));
        panel.add(display_score);

        result = new JLabel("");
        result.setBounds(20,500,400,20);
        result.setForeground(new Color(0,0,128));
        result.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(result);

        panel.setLayout(null);
        background = new JLabel(new ImageIcon("ratebgs/Soul care.png"));
        background.setBounds(0,0,1350,650);
        panel.add(background);


 
        setVisible(true); 
      
        }

        public void actionPerformed(ActionEvent e){

        if(e.getSource()==back){ 
         this.dispose();
         SoulCare obj = new SoulCare();
         obj.setVisible(true);
         }

        if(e.getSource()==laugh_button && lcheck==true){ 
         laugh_button.setOpaque(true);
         laugh_button.setForeground(new Color( 159, 180, 221));
         score = score + 3;
         lcheck = false;
         } 
         else if(e.getSource()==laugh_button && lcheck==false){
         laugh_button.setForeground(new Color(208, 223, 241));
         laugh_button.setOpaque(false);
         score = score - 3;
         lcheck = true;
         } 
         if(e.getSource()==gratitude_button && gcheck==true){ 
         gratitude_button.setOpaque(true);
         gratitude_button.setForeground(new Color( 159, 180, 221));
         score = score + 4;
         gcheck = false;
         } 
         else if(e.getSource()==gratitude_button && gcheck==false){
         gratitude_button.setForeground(new Color(208, 223, 241));
         gratitude_button.setOpaque(false);
         score = score - 4;
         gcheck = true;
         }

         if(e.getSource()==reflection_buttonn && fcheck==true){ 
         reflection_buttonn.setOpaque(true);
         reflection_buttonn.setForeground(new Color( 159, 180, 221));
         score = score + 2;
         fcheck = false;
         } 
         else if(e.getSource()==reflection_buttonn && fcheck==false){
         reflection_buttonn.setForeground(new Color(208, 223, 241));
         reflection_buttonn.setOpaque(false);
         score = score - 2;
         fcheck = true;
         } 

         if(e.getSource()==positive_button && pcheck==true){ 
         positive_button.setOpaque(true);
         positive_button.setForeground(new Color( 159, 180, 221));
         score = score + 5;
         pcheck = false;
         } 
         else if(e.getSource()==positive_button && pcheck==false){
         positive_button.setForeground(new Color(208, 223, 241));
         positive_button.setOpaque(false);
         score = score - 5;
         pcheck = true;
         } 

         if(e.getSource()==read_button && readcheck==true){ 
         read_button.setOpaque(true);
         read_button.setForeground(new Color( 159, 180, 221));
         score = score + 2;
         readcheck = false;
         } 
         else if(e.getSource()==read_button && readcheck==false){
         read_button.setForeground(new Color(208, 223, 241));
         read_button.setOpaque(false);
         score = score - 2;
         readcheck = true;
         } 

         if(e.getSource()==smile_button && smilpcheck==true){ 
         smile_button.setOpaque(true);
         smile_button.setForeground(new Color( 159, 180, 221));
         score = score + 2;
         smilpcheck = false;
         } 
         else if(e.getSource()==smile_button && smilpcheck==false){
         smile_button.setForeground(new Color(208, 223, 241));
         smile_button.setOpaque(false);
         score = score - 2;
         smilpcheck = true;
        }

         if(e.getSource()==active_button && activpcheck==true){ 
         active_button.setOpaque(true);
         active_button.setForeground(new Color( 159, 180, 221));
         score = score + 3;
         activpcheck = false;
         } 
         else if(e.getSource()==active_button && activpcheck==false){
         active_button.setForeground(new Color(208, 223, 241));
         active_button.setOpaque(false);
         score = score - 3;
         activpcheck = true;
         } 

        if(e.getSource()==strength_button&& strengthcheck==true){ 
         strength_button.setOpaque(true);
         strength_button.setForeground(new Color( 159, 180, 221));
         score = score + 2;
         strengthcheck = false;
         } 
         else if(e.getSource()==strength_button&& strengthcheck==false){
         strength_button.setForeground(new Color(208, 223, 241));
         strength_button.setOpaque(false);
         score = score - 2;
         strengthcheck = true;
         }
         if(score>9)
         {
            display_score.setBounds(165,192,198,213);
         }
         if(score<10)
         {
           display_score.setBounds(186,196,198,213);
         }
         display_score.setText(String.valueOf(score));
         display_score.setVisible(true);

         if(e.getSource()==done)
         {
            pcsql health = new pcsql();
            health.add_data_rate_attitude(Example.cutomer_username,score,lcheck,gcheck,fcheck,pcheck,readcheck,smilpcheck,activpcheck,strengthcheck);
           
           if(score<8){
            result.setText("You need to work more on your health :(");
            result.setVisible(true);
           }
           else if(score>7 && score<12){
            result.setLocation(60,500);
            result.setText("Good Job! You're on the right track");
            result.setVisible(true);
           }
           else if(score>=12){
            result.setLocation(80,500);
            result.setText("Wow! Thats a great score!");
            result.setVisible(true);
           }
         }


    }
}


class SelfCaret extends JFrame implements ActionListener {

    private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JLabel Daily;
    private static JLabel Calendar;
    private static JLabel pic;
    private static JButton body, cal, soul, back;
    Container panel =getContentPane();
    
    SelfCaret() {
        
        setTitle("Self Care");
        setSize(450,640);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        panel.setLayout(null);

        JLabel text = new JLabel("Start taking care of yourself now!");
        text.setFont(new Font("Lucinda Grande", Font.PLAIN, 18));
        text.setBounds(95,100,300, 100);
        panel.add(text);
        
        body =new JButton("Body");   
        body.setBounds(65,300,100, 20);    
        body.addActionListener(this);
        panel.add(body); 
        
        soul =new JButton("Soul");   
        soul.setBounds(175,300,100, 20);    
        soul.addActionListener(this);
        panel.add(soul);
        
        cal =new JButton("Mini Diary");  
        cal.setBounds(285,300,100, 20);    
        cal.addActionListener(this);
        panel.add(cal); 
        
        back =new JButton("Back");  
        back.setBounds(100,400,75, 20);    
        back.addActionListener(this);
        panel.add(back);

        pic = new JLabel(new ImageIcon("SC_mainpage/p3.gif"));
        pic.setBounds(0, 0, 450, 636);
        panel.add(pic);
        setVisible(true);
        } 

        public void actionPerformed(ActionEvent e){

        if (e.getSource() == back) {

            this.dispose();
        }
        if(e.getSource() == cal ){
            this.dispose();
            //new CalendarProgram();
        }
        if(e.getSource() == soul ){
        
            SoulCare obj = new SoulCare();
            obj.setVisible(true);
        }
        if(e.getSource() == body ){
         this.dispose();
         BodyCare b =new BodyCare();
         b.setVisible(true);
        }
}
} 
 

class Habit extends JFrame implements ActionListener
{
    
        JLabel dietlabel, slabel, fitlabel, text, elabel, wlabel;
        JButton back,submit, save;
        JComboBox sleep_tracker, exercise_time;
        JTextArea diet, report, fit;
        JCheckBox f1, f2, f3, f4, f5, f6, f7, f8;
        Container c=getContentPane();
     Habit()
     {    
        setTitle("Habit Tracker");
        setSize(1000,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        
        c.setLayout(null);
        c.setBackground(new Color(144, 190, 171));

        back=new JButton("Back");
        back.setSize(160, 25);
        back.setLocation(90, 420);
        c.add(back);
        back.addActionListener(this);
        
        submit=new JButton("Submit");
        submit.setSize(160, 25);
        submit.setLocation(280, 420);
        c.add(submit);
        submit.addActionListener(this);

        save=new JButton("Save");
        save.setSize(160, 25);
        save.setLocation(764, 420);
        c.add(save);
        save.addActionListener(this);

        
        slabel=new JLabel("Sleep Duration (hours):");
        slabel.setSize(200, 20);
        slabel.setLocation(100, 75);
        c.add(slabel);
        
        elabel=new JLabel("Workout Duration (mins):");
        elabel.setSize(200, 20);
        elabel.setLocation(330, 75);
        c.add(elabel);

        fitlabel=new JLabel("Categorize Today's workout (pick all that apply):");
        fitlabel.setSize(300,20);
        fitlabel.setLocation(100,135);
        c.add(fitlabel);

        dietlabel=new JLabel("Describe Today's Diet:");
        dietlabel.setSize(300, 20);
        dietlabel.setLocation(100, 355);
        c.add(dietlabel);
        
        wlabel=new JLabel("Workout Flow:");
        wlabel.setSize(300, 20);
        wlabel.setLocation(100, 285);
        c.add(wlabel);

        text=new JLabel("");
        text.setSize(450,20);
        text.setLocation(20,455);
        c.add(text);
       
        JCheckBox f1= new JCheckBox("High Intensity Interval Training");
        f1.setSize(250,30);
        f1.setLocation(94,160);
        c.add(f1);
        f1.addActionListener(this);

        JCheckBox f2= new JCheckBox("Stretches and Flexibility Training");
        f2.setSize(250,30);
        f2.setLocation(94,185);
        c.add(f2);

        JCheckBox f3= new JCheckBox("Low and Moderate Impact");
        f3.setSize(250,30);
        f3.setLocation(94,210);
        c.add(f3);

        JCheckBox f4= new JCheckBox("Cardio");
        f4.setSize(250,30);
        f4.setLocation(94,235);
        c.add(f4);

        JCheckBox f5= new JCheckBox("Weights");
        f5.setSize(100,30);
        f5.setLocation(355,157);
        c.add(f5);

        JCheckBox f6= new JCheckBox("Pilates");
        f6.setSize(100,30);
        f6.setLocation(355,183);
        c.add(f6);

        JCheckBox f7= new JCheckBox("Zumba");
        f7.setSize(100,30);
        f7.setLocation(355, 207);
        c.add(f7);

        JCheckBox f8= new JCheckBox("Yoga");
        f8.setSize(100,30);
        f8.setLocation(355,233);
        c.add(f8);

        String hrs[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18", "19","20","21","22","23","24"};
        String mins[] ={"10","20","30","40","50","60","70","80","90","100",">100"};
        
        sleep_tracker=new JComboBox(hrs);
        sleep_tracker.setBounds(96, 103, 70, 20);
        c.add(sleep_tracker);
        
        exercise_time=new JComboBox(mins);
        exercise_time.setBounds(355, 103, 70, 20);
        c.add(exercise_time);

        diet =new JTextArea();
        diet.setSize(180, 50);
        diet.setLocation(257,287);
        c.add(diet);
        
        fit =new JTextArea();
        fit.setSize(180, 50);
        fit.setLocation(257,357);
        c.add(fit);

        report=new JTextArea();
        report.setSize(400,320);
        report.setLocation(515, 85);
        report.setEditable(false);
        c.add(report);
        c.setVisible(true);
        setVisible(true);
    }
    
        public void actionPerformed(ActionEvent e)
        {
            String st= sleep_tracker.getSelectedItem().toString();
            String et= exercise_time.getSelectedItem().toString();
            String dt= diet.getText();
            String wt= fit.getText();
            
            if(e.getSource()==back)
            {
                this.dispose();
                BodyCare bc = new BodyCare();
                bc.setVisible(true);
            }
            //String report_text;
            else if(e.getSource()==submit)
            {
            //System.out.println(sleep_tracker.getSelectedItem().toString());
            
            //report_text = "\n\n******************************DAILY REPORT*******************************\n\n\n   You slept for: " + st+" hrs\n\n   You worked out for: "+et+" mins\n   Your diet plan for the day: "+dt+"\n   Your category and the style of workout for the day: "+wt+" \n\n\n SEE YOU TOMORROW! \n\n\n**********************THANK YOU FOR USING LIFEY********************;
            

            report.setText("\n\n******************************DAILY REPORT*******************************\n\n\n   You slept for: " + st+" hrs\n\n   You worked out for: "+et+" mins\n   Your diet plan for the day: "+dt+"\n   Your category and the style of workout for the day: "+wt+" \n\n\n SEE YOU TOMORROW! \n\n\n**********************THANK YOU FOR USING LIFEY********************");
            }
            
            if(e.getSource()==save)
            {
                text.setForeground(new Color(179,25,0));
                text.setText("Your Daily Report is Saved!");
                save.setVisible(true);
                pcsql hab = new pcsql();
                hab.add_data_health(Example.cutomer_username,st,et,dt,wt);
            }
            
        
        }
}

class Lol extends JFrame implements ActionListener 
{
    JLabel text;
    JButton emoji1,emoji2,emoji3,emoji4,emoji5,emoji6, save, next, back;
    JComboBox day, month, year; 
    Container c=getContentPane();
    Boolean e1,e2,e3,e4,e5;

    Lol()
    {
        setVisible(true);
    
        setTitle("Habit Tracker");
        setSize(620,350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        c.setLayout(null);
        c.setBackground(new Color(232, 245, 223));
        
        text = new JLabel("How Are You Feeling, Today?");
        text.setSize(450,30);
        text.setLocation(125,50);
        text.setFont(new Font("Contrast", Font.BOLD, 25));
        c.add(text);

        back= new JButton("Back");
        back.setSize(120,25);
        back.setLocation(120, 255);
        c.add(back);
        back.addActionListener(this);

        save= new JButton("Save");
        save.setSize(120,25);
        save.setLocation(240, 255);
        c.add(save);
        save.addActionListener(this);

        next= new JButton("Next");
        next.setSize(120,25);
        next.setLocation(360, 255);
        c.add(next);
        next.addActionListener(this);

        emoji1= new JButton();
        emoji1.setSize(75, 75);
        emoji1.setLocation(50, 150);
        c.add(emoji1);
        emoji1.setContentAreaFilled(false);
        emoji1.setBorderPainted(false);
        emoji1.setOpaque(false);
        emoji1.setIcon(new ImageIcon("mood_icons/1.png"));
        emoji1.addActionListener(this);
        e1= true;

        emoji2= new JButton();
        emoji2.setSize(75, 75);
        emoji2.setLocation(160, 153);
        c.add(emoji2);
        emoji2.setContentAreaFilled(false);
        emoji2.setBorderPainted(false);
        emoji2.setOpaque(false);
        emoji2.setIcon(new ImageIcon("mood_icons/2.png"));
        emoji2.addActionListener(this);
        e2= true;
      
        emoji3= new JButton();
        emoji3.setSize(75, 75);
        emoji3.setLocation(270, 153);
        c.add(emoji3);
        emoji3.setContentAreaFilled(false);
        emoji3.setBorderPainted(false);
        emoji3.setOpaque(false);
        emoji3.setIcon(new ImageIcon("mood_icons/3.png"));
        emoji3.addActionListener(this);
        e3= true;

        emoji4= new JButton();
        emoji4.setSize(75, 75);
        emoji4.setLocation(380, 153);
        c.add(emoji4);
        emoji4.setContentAreaFilled(false);
        emoji4.setBorderPainted(false);
        emoji4.setOpaque(false);
        emoji4.setIcon(new ImageIcon("mood_icons/4.png"));
        emoji4.addActionListener(this);
        e4= true;

        emoji5= new JButton();
        emoji5.setSize(75, 75);
        emoji5.setLocation(490, 153);
        c.add(emoji5);
        emoji5.setContentAreaFilled(false);
        emoji5.setBorderPainted(false);
        emoji5.setOpaque(false);
        emoji5.setIcon(new ImageIcon("mood_icons/5.png"));
        emoji5.addActionListener(this);
        e5= true;

        String dd[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18", "19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String mm[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec" };
        String yyyy[]={"2021","2022"};

        day=new JComboBox(dd);
        day.setSize(80, 30);
        day.setLocation(180, 105);
        c.add(day);

        month=new JComboBox(mm);
        month.setSize(85, 30);
        month.setLocation(260, 105);
        c.add(month);
  
        year=new JComboBox(yyyy);
        year.setSize(90, 30);
        year.setLocation(345, 105);
        c.add(year);
        setVisible(true);
    }
    
        
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == back) 
        {
            this.dispose();
            SoulCare obj = new SoulCare();
            obj.setVisible(true);
        }
            
    
        if(e.getSource() == next) 
        {
            this.dispose();
            SelfCaret obj = new SelfCaret();
            obj.setVisible(true);
        }


        if(e.getSource()==emoji1&&e1==true)
        { 
            emoji1.setBackground(new Color(220,220,220));
            emoji1.setOpaque(true);
            e1=false;
            JOptionPane.showMessageDialog(c,"Having a bad day, huh?  It's alright, Go unwind!",null,JOptionPane.PLAIN_MESSAGE);
        } 

        else if(e.getSource()==emoji1&&e1==false)
        { 
            emoji1.setOpaque(false);
            e1=true;
        } 


        if(e.getSource()==emoji2&&e2==true) 
        {
            emoji2.setBackground(new Color(220,220,220));
            emoji2.setOpaque(true);
            e2=false;
            JOptionPane.showMessageDialog(c,"Not a great day, eh?  It's okay, Go unwind!",null,JOptionPane.PLAIN_MESSAGE);
        }
        else if(e.getSource()==emoji2&&e2==false)
        {
            emoji2.setOpaque(false);
            e2=true;
        }


        if(e.getSource()==emoji3&&e3==true) 
        {
            emoji3.setBackground(new Color(220,220,220));
            emoji3.setOpaque(true);
            e3=false;
            JOptionPane.showMessageDialog(c,"Don't know what your feeling? It happens. Take a deep breathe, you'll figure it out! ",null,JOptionPane.PLAIN_MESSAGE);
        }
        else if(e.getSource()==emoji3&&e3==false)
        {
            emoji3.setOpaque(false);
            e3=true;
        }


        if(e.getSource()==emoji4&&e4==true) 
        {
            emoji4.setBackground(new Color(220,220,220));
            emoji4.setOpaque(true);
            e4=false;
            JOptionPane.showMessageDialog(c,"Yay! We're happy you had a nice day!",null,JOptionPane.PLAIN_MESSAGE);
        }
        else if(e.getSource()==emoji4&&e4==false)
        {
            emoji4.setOpaque(false);
            e4=true;
        }


        if(e.getSource()==emoji5&&e5==true) 
        {
            emoji5.setBackground(new Color(220,220,220));
            emoji5.setOpaque(true);
            e5=false;
            JOptionPane.showMessageDialog(c,"Wow! We're happy you had a wonderful day! To more of such days!",null,JOptionPane.PLAIN_MESSAGE);
        }
        else if(e.getSource()==emoji5&&e5==false)
        {
            emoji5.setBackground(new Color(220,220,220));
            emoji5.setOpaque(false);
            e5=true;
        }
        if(e.getSource()==save)
        {
            pcsql mood = new pcsql();
            mood.add_mood_tracker(Example.cutomer_username,!e1,!e2,!e3,!e4,!e5);
        }



        if(e.getSource()==save && e1==true && e2==true && e3==true && e4==true && e5==true) 
        {
            JOptionPane.showMessageDialog(c,"Looks like you haven't selected a mood yet! Please check!",null,JOptionPane.PLAIN_MESSAGE);
        }
        else if(e.getSource()==save && e1==false && e2==true && e3==true && e4==true && e5==true||e.getSource()==save && e1==true && e2==false && e3==true && e4==true && e5==true || e.getSource()==save && e1==true && e2==true && e3==false && e4==true && e5==true || e.getSource()==save && e1==true && e2==true && e3==true && e4==false && e5==true || e.getSource()==save && e1==true && e2==true && e3==true && e4==true && e5==false)
        {
            JOptionPane.showMessageDialog(c,"Today's mood has been noted. See you again Tomorrow!",null,JOptionPane.PLAIN_MESSAGE);
        }

        else if(e.getSource()==save && e1==false && e2==false && e3==true && e4==true && e5==true || e.getSource()==save && e1==false && e2==true && e3==false && e4==true && e5==true || e.getSource()==save && e1==false && e2==true && e3==true && e4==false && e5==true || e.getSource()==save && e1==false && e2==true && e3==true && e4==true && e5==false|| e.getSource()==save && e1==true && e2==false && e3==false && e4==true && e5==true || e.getSource()==save && e1==true && e2==false && e3==true && e4==false && e5==true || e.getSource()==save && e1==true && e2==false && e3==true && e4==true && e5==false || e.getSource()==save && e1==true && e2==true && e3==false && e4==false && e5==true || e.getSource()==save && e1==true && e2==true && e3==false && e4==true && e5==false || e.getSource()==save && e1==true && e2==true && e3==true && e4==false && e5==false) 
        {
            JOptionPane.showMessageDialog(c,"Today's mood has been noted. See you again Tomorrow!",null,JOptionPane.PLAIN_MESSAGE);
        }

        else if(e.getSource()==save && e1==false && e2==false && e3==false && e4==true && e5==true || e.getSource()==save && e1==false && e2==false && e3==true && e4==false && e5==true || e.getSource()==save && e1==false && e2==false && e3==true && e4==true && e5==false || e.getSource()==save && e1==false && e2==true && e3==false && e4==false && e5==true || e.getSource()==save && e1==false && e2==true && e3==false && e4==true && e5==false || e.getSource()==save && e1==false && e2==true && e3==true && e4==false && e5==false || e.getSource()==save && e1==true && e2==false && e3==false && e4==false && e5==true || e.getSource()==save && e1==true && e2==false && e3==true && e4==false && e5==false || e.getSource()==save && e1==true && e2==true && e3==false && e4==false && e5==false) 
        {
            JOptionPane.showMessageDialog(c,"Today's mood has been noted. See you again Tomorrow!",null,JOptionPane.PLAIN_MESSAGE);
        }

        else if(e.getSource()==save && e1==false && e2==false && e3==false && e4==false && e5==false || e.getSource()==save && e1==true && e2==false && e3==false && e4==false && e5==false || e.getSource()==save && e1==false && e2==true && e3==false && e4==false && e5==false || e.getSource()==save && e1==false && e2==false && e3==true && e4==false && e5==false || e.getSource()==save && e1==false && e2==false && e3==false && e4==true && e5==false || e.getSource()==save && e1==false && e2==false && e3==false && e4==false && e5==true) 
        {
            JOptionPane.showMessageDialog(c,"Please check! Looks like you have selected more than 3 moods, are you alright?",null,JOptionPane.PLAIN_MESSAGE);
        }
    }
}







/*public class SelfCare{

	public static void main(String[] args)
    {
	SelfCare SelfCare  = new SelfCare();
	SelfCare.setVisible(true);
	
	}
}*/

