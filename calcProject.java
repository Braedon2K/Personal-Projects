import javax.swing.*;  
import javax.swing.border.*;  
import java.awt.*;
import java.awt.event.*;

public class calcProject{

    // Declarations
    static double total = 0, squareTotal = 0;
    static int type = 0;
    static String titleText = "1234567890";

    static JButton clear, square, squareroot, one, two, three, four, five, six, seven,
    eight, nine, zero, zeroes, decimal, add, subtract, multiply, divide, equals;
    static JLabel title;


    // Function that creates frame, all buttons, and then places them on the frame
    public static void creatingButtons(){

        // Name
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        // Title space where calculations happen
        title = new JLabel(titleText, SwingConstants.RIGHT);
        Font heading = new Font("Monospaced", Font.BOLD, 30);
        title.setBorder(new EmptyBorder(0, 0, 0, 10));
        title.setFont(heading);
        title.setPreferredSize(new Dimension(300, 75));
        title.setOpaque(true);
        title.setBackground(Color.LIGHT_GRAY);
        frame.getContentPane().add(title, BorderLayout.PAGE_START);
        
        // Pane where buttons go
        JPanel pane = new JPanel(new FlowLayout());
        pane.setPreferredSize(new Dimension(300, 255));
        pane.setBackground(Color.DARK_GRAY);
        pane.setOpaque(true);
        frame.getContentPane().add(pane, BorderLayout.CENTER);
        

        // Creating all the buttons with their unique text corresponding to their uses
        Font buttons = new Font("Monospaced", Font.BOLD, 20);

        clear = new JButton("CC");
        clear.setPreferredSize(new Dimension(70, 45));
        clear.setBackground(Color.LIGHT_GRAY);
        clear.setFont(buttons);

        square = new JButton("x^2");
        square.setPreferredSize(new Dimension(70, 45));
        square.setBackground(Color.LIGHT_GRAY);
        square.setFont(buttons);

        squareroot = new JButton("√");
        squareroot.setPreferredSize(new Dimension(70, 45));
        squareroot.setBackground(Color.LIGHT_GRAY);
        squareroot.setFont(buttons);

        add = new JButton("+");
        add.setPreferredSize(new Dimension(70, 45));
        add.setBackground(Color.LIGHT_GRAY);
        add.setFont(buttons);

        subtract = new JButton("-");
        subtract.setPreferredSize(new Dimension(70, 45));
        subtract.setBackground(Color.LIGHT_GRAY);
        subtract.setFont(buttons);

        multiply = new JButton("x");
        multiply.setPreferredSize(new Dimension(70, 45));
        multiply.setBackground(Color.LIGHT_GRAY);
        multiply.setFont(buttons);

        divide = new JButton("÷");
        divide.setPreferredSize(new Dimension(70, 45));
        divide.setBackground(Color.LIGHT_GRAY);
        divide.setFont(buttons);

        equals = new JButton("=");
        equals.setPreferredSize(new Dimension(70, 45));
        equals.setBackground(Color.LIGHT_GRAY);
        equals.setFont(buttons);

        decimal = new JButton(".");
        decimal.setPreferredSize(new Dimension(70, 45));
        decimal.setBackground(Color.LIGHT_GRAY);
        decimal.setFont(buttons);

        one = new JButton("1");
        one.setPreferredSize(new Dimension(70, 45));
        one.setBackground(Color.LIGHT_GRAY);
        one.setFont(buttons);

        two = new JButton("2");
        two.setPreferredSize(new Dimension(70, 45));
        two.setBackground(Color.LIGHT_GRAY);
        two.setFont(buttons);

        three = new JButton("3");
        three.setPreferredSize(new Dimension(70, 45));
        three.setBackground(Color.LIGHT_GRAY);
        three.setFont(buttons);

        four = new JButton("4");
        four.setPreferredSize(new Dimension(70, 45));
        four.setBackground(Color.LIGHT_GRAY);
        four.setFont(buttons);

        five = new JButton("5");
        five.setPreferredSize(new Dimension(70, 45));
        five.setBackground(Color.LIGHT_GRAY);
        five.setFont(buttons);

        six = new JButton("6");
        six.setPreferredSize(new Dimension(70, 45));
        six.setBackground(Color.LIGHT_GRAY);
        six.setFont(buttons);

        seven = new JButton("7");
        seven.setPreferredSize(new Dimension(70, 45));
        seven.setBackground(Color.LIGHT_GRAY);
        seven.setFont(buttons);

        eight = new JButton("8");
        eight.setPreferredSize(new Dimension(70, 45));
        eight.setBackground(Color.LIGHT_GRAY);
        eight.setFont(buttons);

        nine = new JButton("9");
        nine.setPreferredSize(new Dimension(70, 45));
        nine.setBackground(Color.LIGHT_GRAY);
        nine.setFont(buttons);

        zero = new JButton("0");
        zero.setPreferredSize(new Dimension(70, 45));
        zero.setBackground(Color.LIGHT_GRAY);
        zero.setFont(buttons);

        zeroes = new JButton("00");
        zeroes.setPreferredSize(new Dimension(70, 45));
        zeroes.setBackground(Color.LIGHT_GRAY);
        zeroes.setFont(buttons);
        

        // Places all buttons in correct order
        pane.add(clear);
        pane.add(square);
        pane.add(squareroot);
        pane.add(divide);
        pane.add(seven);
        pane.add(eight);
        pane.add(nine);
        pane.add(multiply);
        pane.add(four);
        pane.add(five);
        pane.add(six);
        pane.add(subtract);
        pane.add(one);
        pane.add(two);
        pane.add(three);
        pane.add(add);
        pane.add(zero);
        pane.add(zeroes);
        pane.add(decimal);
        pane.add(equals);
        
        // Sets the frame and keeps it visible. Also prevents it from being resized or maximized
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
    
    // Function that changes title to inputted numbers
    public static void updateTitle(String text){
        titleText+=text;
        title.setText(titleText);
    }

    // Function that squares the input
    public static void squareFunction(){
        if(titleText == ""){
            titleText = "0";
        }
        if(squareTotal != 0){
            total = squareTotal;
            total *= total;
            total = Math.round(total * 10000.0) / 10000.0;
            title.setText(Double.toString(total));
            titleText = Double.toString(total);
            total = 0;
            squareTotal = 0;
        }
        else{
        total = Double.parseDouble(titleText);
        total *= total;
        total = Math.round(total * 10000.0) / 10000.0;
        title.setText(Double.toString(total));
        titleText = Double.toString(total);
        total = 0;
        }
    }

    // Function that gives the squareroot of the input
    public static void squareRoot(){
        if(titleText == ""){
            titleText = "0";
        }
        if(squareTotal != 0){
            total = squareTotal;
            total = Math.sqrt(total);
            total = Math.round(total * 10000.0) / 10000.0;
            title.setText(Double.toString(total));
            titleText = Double.toString(total);
            total = 0;
            squareTotal = 0;
        }
        else{
        total = Double.parseDouble(titleText);
        total = Math.sqrt(total);
        total = Math.round(total * 10000.0) / 10000.0;
        title.setText(Double.toString(total));
        titleText = Double.toString(total);
        total = 0;
        }
    }

    // Function used for addition in the calculator (All other methods refer back to addition in some way)
    public static void addition(){
        if(titleText == "" || titleText == "Infinity"){
            titleText = "0";
        }
        if(type == 2){
            subtraction();
            type = 1;
        }
        else if(type == 3){
            multiplication();
            type = 1;
        }
        else if(type == 4){
            division();
            type = 1;
        }
        else{
        total += Double.parseDouble(titleText);
        type = 1;
        title.setText("");
        titleText = "";
        }
    }

    // Function used for subtraction in the calculator
    public static void subtraction(){
        if(titleText == "" || titleText == "Infinity"){
            titleText = "0";
        }
        if(type == 0 || type == 1){
            addition();
            type = 2;
        }
        else if(type == 3){
            multiplication();
            type = 2;
        }
        else if(type == 4){
            division();
            type = 2;
        }
        else{
        total -= Double.parseDouble(titleText);
        type = 2;
        title.setText("");
        titleText = "";
        }
    }

    // Function used for multiplication in the calculator
    public static void multiplication(){
        if(titleText == "" || titleText == "Infinity"){
            titleText = "0";
        }
        if(type == 0 || type == 1){
            addition();
            type = 3;
        }
        else if(type == 2){
            subtraction();
            type = 3;
        }
        else if(type == 4){
            division();
            type = 4;
        }
        else{
        total *= Double.parseDouble(titleText);
        type = 3;
        title.setText("");
        titleText = "";
        }
    }

    // Function used for division in the calculator
    public static void division(){
        if(titleText == "" || titleText == "Infinity"){
            titleText = "0";
        }
        if(type == 0 || type == 1){
            addition();
            type = 4;
        }
        else if(type == 2){
            subtraction();
            type = 4;
        }
        else if(type == 3){
            multiplication();
            type = 4;
        }
        else{
        total /= Double.parseDouble(titleText);
        type = 4;
        title.setText("");
        titleText = "";
        }
    }

    // Function used to give the final answer for given inputs
    public static void returns(){
        if(type == 1){
            if(titleText == ""){
                type = 0;
            }
            else {
                total += Double.parseDouble(titleText);
                total = Math.round(total * 10000.0) / 10000.0;
                title.setText(Double.toString(total));
                titleText = "";
                type = 0;
                squareTotal = total;
            }
        }
        if(type == 2){
            if(titleText == ""){
                type = 0;
            }
            else {
                total -= Double.parseDouble(titleText);
                total = Math.round(total * 10000.0) / 10000.0;
                title.setText(Double.toString(total));
                titleText = "";
                type = 0;
                squareTotal = total;
            }
        }
        if(type == 3){
            if(titleText == ""){
                type = 0;
            }
            else {
                total *= Double.parseDouble(titleText);
                total = Math.round(total * 10000.0) / 10000.0;
                title.setText(Double.toString(total));
                titleText = "";
                type = 0;
                squareTotal = total;
            }
        }
        if(type == 4){
            if(titleText == ""){
                type = 0;
            }
            else {
                total /= Double.parseDouble(titleText);
                total = Math.round(total * 10000.0) / 10000.0;
                title.setText(Double.toString(total));
                titleText = "";
                type = 0;
                squareTotal = total;
            }
        }
    }
    
    public static void main(String[] args) {

        creatingButtons();

        // Condensed all buttons into one listener
        ActionListener listener = (new ActionListener(){
            @Override

            public void actionPerformed(ActionEvent e){
                Object source = e.getSource();

                if(source == clear){
                    title.setText("");
                    titleText = "";
                    total = 0;
                    type = 0;
                    squareTotal = 0;
                }
                else if(source == square){
                    squareFunction();
                }
                else if(source == squareroot){
                    squareRoot();
                }
                else if(source == one){
                    updateTitle("1");
                }
                else if(source == two){
                    updateTitle("2");
                }
                else if(source == three){
                    updateTitle("3");
                }
                else if(source == four){
                    updateTitle("4");
                }
                else if(source == five){
                    updateTitle("5");
                }
                else if(source == six){
                    updateTitle("6");
                }
                else if(source == seven){
                    updateTitle("7");
                }
                else if(source == eight){
                    updateTitle("8");
                }
                else if(source == nine){
                    updateTitle("9");
                }
                else if(source == zero){
                    updateTitle("0");
                }
                else if(source == zeroes){
                    updateTitle("00");
                }
                else if(source == decimal){
                    updateTitle(".");
                }
                else if(source == add){
                    addition();
                }
                else if(source == subtract){
                    subtraction();
                }
                else if(source == multiply){
                    multiplication();
                }
                else if(source == divide){
                    division();
                }
                else if(source == equals){
                    returns();
                }
            }
        });

        clear.addActionListener(listener);
        square.addActionListener(listener);
        squareroot.addActionListener(listener);
        one.addActionListener(listener);
        two.addActionListener(listener);
        three.addActionListener(listener);
        four.addActionListener(listener);
        five.addActionListener(listener);
        six.addActionListener(listener);
        seven.addActionListener(listener);
        eight.addActionListener(listener);
        nine.addActionListener(listener);
        zero.addActionListener(listener);
        zeroes.addActionListener(listener);
        decimal.addActionListener(listener);
        add.addActionListener(listener);
        subtract.addActionListener(listener);
        multiply.addActionListener(listener);
        divide.addActionListener(listener);
        equals.addActionListener(listener);
    }
}