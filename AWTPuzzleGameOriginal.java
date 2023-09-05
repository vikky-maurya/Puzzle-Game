import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AWTPuzzleGameOriginal {
    public static void main(String[] args) {
        Frame f=new Frame("Puzzle");
        Button b1=new Button("15");
        Button b2=new Button("2");
        Button b3=new Button("1");
        Button b4=new Button("12");
        Button b5=new Button("8");
        Button b6=new Button("5");
        Button b7=new Button("6");
        Button b8=new Button("11");
        Button b9=new Button("4");
        Button b10=new Button("9");
        Button b11=new Button("10");
        Button b12=new Button("7");
        Button b13=new Button("3");
        Button b14=new Button("13");
        Button b15=new Button("14");
        Button b16=new Button("");
       
        Font ft = new Font("Arial", Font.BOLD, 20);
        Font ff=new Font("Arial" ,Font.BOLD,40);
        b1.setFont(ff);
        b2.setFont(ff);
        b3.setFont(ff);
        b4.setFont(ff);
        b5.setFont(ff);
        b6.setFont(ff);
        b7.setFont(ff);
        b8.setFont(ff);
        b9.setFont(ff);
        b10.setFont(ff);
        b11.setFont(ff);
        b12.setFont(ff);
        b13.setFont(ff);
        b14.setFont(ff);
        b15.setFont(ff);
        b16.setFont(ff);
       
        b1.setBounds(50,50,100,100);
        b2.setBounds(150,50,100,100);
        b3.setBounds(250,50,100,100);
        b4.setBounds(350,50,100,100);
        b5.setBounds(50,150,100,100);
        b6.setBounds(150,150,100,100);
        b7.setBounds(250,150,100,100);
        b8.setBounds(350,150,100,100);
        b9.setBounds(50,250,100,100);
        b10.setBounds(150,250,100,100);
        b11.setBounds(250,250,100,100);
        b12.setBounds(350,250,100,100);
        b13.setBounds(50,350,100,100);
        b14.setBounds(150,350,100,100);
        b15.setBounds(250,350,100,100);
        b16.setBounds(350,350,100,100);
       

        b1.setBackground(Color.cyan);
        b1.setForeground(Color.BLUE);
        b2.setBackground(Color.cyan);
        b3.setBackground(Color.cyan);
        b4.setBackground(Color.cyan);
        b5.setBackground(Color.cyan);
        b6.setBackground(Color.cyan);
        b7.setBackground(Color.cyan);
        b8.setBackground(Color.cyan);
        b9.setBackground(Color.cyan);
        b10.setBackground(Color.cyan);
        b11.setBackground(Color.cyan);
        b12.setBackground(Color.cyan);
        b13.setBackground(Color.cyan);
        b14.setBackground(Color.cyan);
        b15.setBackground(Color.cyan);
        b16.setBackground(Color.cyan);

        b2.setForeground(Color.BLUE);
        b3.setForeground(Color.BLUE);
        b4.setForeground(Color.BLUE);
        b5.setForeground(Color.BLUE);
        b6.setForeground(Color.BLUE);
        b7.setForeground(Color.BLUE);
        b8.setForeground(Color.BLUE);
        b9.setForeground(Color.BLUE);
        b10.setForeground(Color.BLUE);
        b11.setForeground(Color.BLUE);
        b12.setForeground(Color.BLUE);
        b13.setForeground(Color.BLUE);
        b14.setForeground(Color.BLUE);
        b15.setForeground(Color.BLUE);
        b16.setForeground(Color.BLUE);
       

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(b16);
        

        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b15.getLabel().equals("")) {
                    b15.setLabel(b16.getLabel());
                    b16.setLabel("");
                } else if (b12.getLabel().equals("")) {
                    b12.setLabel(b16.getLabel());
                    b16.setLabel("");
                }
            }
        });

        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b16.getLabel().equals("")) {
                    b16.setLabel(b15.getLabel());
                    b15.setLabel("");
                } else if (b14.getLabel().equals("")) {
                    b14.setLabel(b15.getLabel());
                    b15.setLabel("");
                } else if (b11.getLabel().equals("")) {
                    b11.setLabel(b15.getLabel());
                    b15.setLabel("");
                }
            }
        });
        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b15.getLabel().equals("")) {
                    b15.setLabel(b14.getLabel());
                    b14.setLabel("");
                } else if (b13.getLabel().equals("")) {
                    b13.setLabel(b14.getLabel());
                    b14.setLabel("");
                } else if (b10.getLabel().equals("")) {
                    b10.setLabel(b14.getLabel());
                    b14.setLabel("");
                }
            }
        });
        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b14.getLabel().equals("")) {
                    b14.setLabel(b13.getLabel());
                    b13.setLabel("");
                } else if (b9.getLabel().equals("")) {
                    b9.setLabel(b13.getLabel());
                    b13.setLabel("");
                }
            }
        });
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b16.getLabel().equals("")) {
                    b16.setLabel(b12.getLabel());
                    b12.setLabel("");
                } else if (b11.getLabel().equals("")) {
                    b11.setLabel(b12.getLabel());
                    b12.setLabel("");
                } else if (b8.getLabel().equals("")) {
                    b8.setLabel(b12.getLabel());
                    b12.setLabel("");
                }
            }
        });
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b15.getLabel().equals("")) {
                    b15.setLabel(b11.getLabel());
                    b11.setLabel("");
                } else if (b10.getLabel().equals("")) {
                    b10.setLabel(b11.getLabel());
                    b11.setLabel("");
                } else if (b12.getLabel().equals("")) {
                    b12.setLabel(b11.getLabel());
                    b11.setLabel("");
                }
                else if (b7.getLabel().equals(""))
                {
                    b7.setLabel(b11.getLabel());
                    b11.setLabel("");
                }
            }
        });
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b14.getLabel().equals("")) {
                    b14.setLabel(b10.getLabel());
                    b10.setLabel("");
                } else if (b9.getLabel().equals("")) {
                    b9.setLabel(b10.getLabel());
                    b10.setLabel("");
                } else if (b11.getLabel().equals("")) {
                    b11.setLabel(b10.getLabel());
                    b10.setLabel("");
                }
                else if (b6.getLabel().equals(""))
                {
                    b6.setLabel(b10.getLabel());
                    b10.setLabel("");
                }
            }
        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b10.getLabel().equals("")) {
                    b10.setLabel(b9.getLabel());
                    b9.setLabel("");
                } else if (b13.getLabel().equals("")) {
                    b13.setLabel(b9.getLabel());
                    b9.setLabel("");
                } else if (b5.getLabel().equals("")) {
                    b5.setLabel(b9.getLabel());
                    b9.setLabel("");
                }
            }
        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b12.getLabel().equals("")) {
                    b12.setLabel(b8.getLabel());
                    b8.setLabel("");
                } else if (b7.getLabel().equals("")) {
                    b7.setLabel(b8.getLabel());
                    b8.setLabel("");
                } else if (b4.getLabel().equals("")) {
                    b4.setLabel(b8.getLabel());
                    b8.setLabel("");
                }
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b11.getLabel().equals("")) {
                    b11.setLabel(b7.getLabel());
                    b7.setLabel("");
                } else if (b8.getLabel().equals("")) {
                    b8.setLabel(b7.getLabel());
                    b7.setLabel("");
                } else if (b6.getLabel().equals("")) {
                    b6.setLabel(b7.getLabel());
                    b7.setLabel("");
                }
                else if (b3.getLabel().equals(""))
                {
                    b3.setLabel(b7.getLabel());
                    b7.setLabel("");

                }
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b10.getLabel().equals("")) {
                    b10.setLabel(b6.getLabel());
                    b6.setLabel("");
                } else if (b7.getLabel().equals("")) {
                    b7.setLabel(b6.getLabel());
                    b6.setLabel("");
                } else if (b5.getLabel().equals("")) {
                    b5.setLabel(b6.getLabel());
                    b6.setLabel("");
                }
                else if(b2.getLabel().equals(""))
                {
                    b2.setLabel(b6.getLabel());
                    b6.setLabel("");
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b6.getLabel().equals("")) {
                    b6.setLabel(b5.getLabel());
                    b5.setLabel("");
                } else if (b9.getLabel().equals("")) {
                    b9.setLabel(b5.getLabel());
                    b5.setLabel("");
                } else if (b1.getLabel().equals("")) {
                    b1.setLabel(b5.getLabel());
                    b5.setLabel("");
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b8.getLabel().equals("")) {
                    b8.setLabel(b4.getLabel());
                    b4.setLabel("");
                } else if (b3.getLabel().equals("")) {
                    b3.setLabel(b4.getLabel());
                    b4.setLabel("");
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b7.getLabel().equals("")) {
                    b7.setLabel(b3.getLabel());
                    b3.setLabel("");
                } else if (b2.getLabel().equals("")) {
                    b2.setLabel(b3.getLabel());
                    b3.setLabel("");
                }
                else if(b4.getLabel().equals(""))
                {
                    b4.setLabel(b3.getLabel());
                    b3.setLabel("");
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b6.getLabel().equals("")) {
                    b6.setLabel(b2.getLabel());
                    b2.setLabel("");
                } else if (b3.getLabel().equals("")) {
                    b3.setLabel(b2.getLabel());
                    b2.setLabel("");
                } else if (b1.getLabel().equals("")) {
                    b1.setLabel(b2.getLabel());
                    b2.setLabel("");
                }
            }
        });
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b2.getLabel().equals("")) {
                    b2.setLabel(b1.getLabel());
                    b1.setLabel("");
                } else if (b5.getLabel().equals("")) {
                    b5.setLabel(b1.getLabel());
                    b1.setLabel("");
                }
            }
        });

        




        


    

        



        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
}
