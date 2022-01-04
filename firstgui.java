import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
public class firstgui { 
    public static void main(String[] args) { 
 
        Adds obj = new Adds(); 
    } 
} 
 
     class Adds extends JFrame implements ActionListener { 
 
    String []  questions ={ 
            "Which company created Java?", 
            "When India won their 1st Cricket world cup?", 
            "What was Java originally called?", 
            "Who is credited for creating Java?" 
 
    }; 
    String[][] options={ 
            {"Sun Microsystems", "Microsoft", "Apple", "Alphabet"}, 
            {"1986", "1983", "1995", "1886"}, 
            {"Apple", "Oak", "Latte", "Coffee"}, 
            {"Bill Gates", "Sundar Pichai", "Mark Zukerberg", "James Gosling"} 
    }; 
    char[] answers={ 
            'A', 
            'B', 
            'B', 
            'D' 
 
    }; 
 
    char answer; 
    int index; 
    int correct_answer=0; 
    int total_questions = questions.length; 
    int result; 
 
    JFrame l1 = new JFrame(); 
    JTextField t1= new JTextField(); 
    JTextArea a1= new JTextArea(); 
    JButton a= new JButton(); 
         JButton b= new JButton(); 
         JButton c= new JButton(); 
         JButton d= new JButton(); 
 
         JLabel label1 = new JLabel(); 
         JLabel label2 = new JLabel(); 
         JLabel label3 = new JLabel(); 
         JLabel label4 = new JLabel(); 
 
 
 
         JTextField num_right= new JTextField(); 
 
 
 
 
        public Adds() { 
            l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            l1.setSize(650, 650); // to set the size 
 
            l1.getContentPane().setBackground(new Color(50,50,50)); 
            l1.setLayout(null); // add more than one lines of text 
            l1.setResizable(false); 
 
 
            t1.setBounds(0,0,650,50); 
            t1.setBackground(new Color(25,25,25)); 
            t1.setForeground(new Color(25,255,0)); 
            t1.setEditable(false); 
            t1.setBorder(BorderFactory.createBevelBorder(1)); 
            t1.setHorizontalAlignment(JTextField.CENTER); 
            t1.setFont(new Font("Ink Free", Font.BOLD, 30)); 
 
            a1.setBounds(0,50,650,50); 
            a1.setBackground(new Color(25,25,25)); 
            a1.setForeground(new Color(25,255,0)); 
            a1.setEditable(false); 
            a1.setLineWrap(true); 
            a1.setWrapStyleWord(true); 
            a1.setFont(new Font("Ink Free", Font.BOLD, 30)); 
//            a1.setHorizontalAlignment(JTextField.CENTER); 
            a.setBounds(0,100,100,100); 
            a.setFont(new Font("MV Boil", Font.BOLD, 30)); 
            a.setFocusable(false); 
            a.addActionListener(this); 
            label1.setBounds(125,100,500,100); 
            label1.setBackground(new Color(50,50,50)); 
            label1.setForeground(new Color(25,255,0)); 
 
            label1.setFont(new Font("MV Boil", Font.BOLD, 25)); 
            a.setText("A"); 
            b.setBounds(0,200,100,100); 
            b.setFont(new Font("MV Boil", Font.BOLD, 30)); 
            b.setFocusable(false); 
            b.setText("B"); 
            label2.setBounds(125,200,500,100); 
            label2.setBackground(new Color(50,50,50)); 
            label2.setForeground(new Color(25,255,0)); 
            label2.setFont(new Font("MV Boil", Font.BOLD, 25)); 
            b.addActionListener(this); 
            c.setBounds(0,300,100,100); 
            c.setFont(new Font("MV Boil", Font.BOLD, 30)); 
            c.setFocusable(false); 
            c.setText("C"); 
            label3.setBounds(125,300,500,100); 
            label3.setBackground(new Color(50,50,50)); 
            label3.setForeground(new Color(25,255,0)); 
            label3.setFont(new Font("MV Boil", Font.BOLD, 25)); 
            c.addActionListener(this); 
            d.setBounds(0,400,100,100); 
            d.setFont(new Font("MV Boil", Font.BOLD, 30)); 
            d.setFocusable(false); 
            d.setText("D"); 
            label4.setBounds(125,400,500,100); 
            label4.setBackground(new Color(50,50,50)); 
            label4.setForeground(new Color(25,255,0)); 
            label4.setFont(new Font("MV Boil", Font.BOLD, 25)); 
            d.addActionListener(this); 
 
 
 
 
 
            num_right.setBounds(225,225,200,100); 
            num_right.setBackground(new Color(25,25,25)); 
            num_right.setForeground(new Color(25,255,0)); 
            num_right.setFont(new Font("Ink Free", Font.BOLD, 30)); 
            num_right.setHorizontalAlignment(JTextField.CENTER); 
            num_right.setEditable(false); 
            l1.add(t1); 
            l1.add(a1); 
            l1.add(a); 
            l1.add(b); 
            l1.add(c); 
            l1.add(d); 
            l1.add(label1); 
            l1.add(label2); 
            l1.add(label3); 
            l1.add(label4); 
 
 
 
 
 
 
 
            l1.setVisible(true); // to show something 
 
            nextQuestion(); 
 
 
        } 
 
 
         public void actionPerformed(ActionEvent e) { 
// 
             a.setEnabled(false); 
             b.setEnabled(false); 
             c.setEnabled(false); 
             d.setEnabled(false); 
 
             if(e.getSource()== a){ 
                 answer='A'; 
                 if(answer== answers[index]){ 
                     correct_answer++; 
                 } 
             } 
 
             if(e.getSource()== b){ 
                 answer='B'; 
                 if(answer== answers[index]){ 
                     correct_answer++; 
                 } 
             } 
 
             if(e.getSource()== c){ 
                 answer='C'; 
                 if(answer== answers[index]){ 
                     correct_answer++; 
                 } 
             } 
 
             if(e.getSource()== d){ 
                 answer='D'; 
                 if(answer== answers[index]){ 
                     correct_answer++; 
                 } 
             } 
             displayAnswer(); 
         } 
         public void nextQuestion() { 
             if (index >= total_questions) { 
                 result(); 
             } 
             else{ 
                 t1.setText("Question" + (index+1)); 
                 a1.setText(questions[index]); 
                 label1.setText(options[index][0]); 
                 label2.setText(options[index][1]); 
                 label3.setText(options[index][2]); 
                 label4.setText(options[index][3]); 
 
 
             } 
         } 
         public void displayAnswer(){ 
 
             a.setEnabled(false); 
             b.setEnabled(false); 
             c.setEnabled(false); 
             d.setEnabled(false); 
 
 
             if(answers[index]!='A'){ 
                 label1.setForeground(new Color(255,0,0)); 
             } 
             if(answers[index]!='B'){ 
                 label2.setForeground(new Color(255,0,0)); 
             } 
             if(answers[index]!='C'){ 
                 label3.setForeground(new Color(255,0,0)); 
             } 
             if(answers[index]!='D'){ 
                 label4.setForeground(new Color(255,0,0)); 
             } 
 
             Timer pause = new Timer(2000, new ActionListener() { 
                 @Override 
                 public void actionPerformed(ActionEvent e) { 
                     label1.setForeground(new Color(25,255,0)); 
                     label2.setForeground(new Color(25,255,0)); 
                     label3.setForeground(new Color(25,255,0)); 
                     label4.setForeground(new Color(25,255,0)); 
//                     b.setForeground(new Color(255,0,0)); 
 
                     answer=' '; 
 
                     a.setEnabled(true); 
                     b.setEnabled(true); 
                     c.setEnabled(true); 
                     d.setEnabled(true); 
                     index++; 
                     nextQuestion(); 
 
                 } 
             }); 
             pause.setRepeats(false); 
             pause.start(); 
 
         } 
              public void result(){ 
 
            a.setEnabled(false); 
            b.setEnabled(false); 
            c.setEnabled(false); 
            d.setEnabled(false); 
            result = correct_answer/total_questions; 
 
            t1.setText("RESULTS!"); 
            a1.setText(""); 
            a.setText(""); 
            label4.setText(""); 
                  label1.setText(""); 
                  label2.setText(""); 
                  label3.setText(""); 
 
                  b.setText(""); 
                  c.setText(""); 
                  d.setText(""); 
 
                  num_right.setText( correct_answer +" / " + total_questions); 
 
                  l1.add(num_right); 
 
 
             } 
 
     } 