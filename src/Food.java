import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Food implements ActionListener {
    int[] list = new int[6];
    double[] price = {1.69, 1.99, 1.79, 2.3, 1.5, 1.5};
    double total = 0;

    Food() {

        Border mainBorder = BorderFactory.createLineBorder(Color.red, 3);
        JFrame frame = new JFrame();

        frame.setSize(900, 900);
        frame.setResizable(false);
        frame.setTitle("PICIT");
        frame.getContentPane().setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("Maincorner.png");
        frame.setIconImage(icon.getImage());
        //Main label
        JLabel mainLabel = new JLabel();
        mainLabel.setBorder(mainBorder);
        mainLabel.setText("WELCOME IN THE Food LIST ");
        ImageIcon main = new ImageIcon("prpoducts list.png");
        mainLabel.setIcon(main);
//        mainLabel.setBounds(0, 0, 450, 100);
        mainLabel.setHorizontalTextPosition(JLabel.RIGHT);
        mainLabel.setVerticalTextPosition(JLabel.CENTER);
        mainLabel.setHorizontalAlignment(JLabel.LEFT);
        mainLabel.setVerticalAlignment(JLabel.TOP);
        mainLabel.setForeground(Color.red);
        mainLabel.setFont(new Font("Cooper black", Font.PLAIN, 40));
        //Main menu button
        JButton mainMenuButton = new JButton();
        mainMenuButton.setBounds(210, 130, 180, 50);

        mainMenuButton.setText("MAIN MENU");
        mainMenuButton.setFont(new Font("cooper black", Font.PLAIN, 20));
        mainMenuButton.setForeground(Color.white);
        mainMenuButton.setBackground(Color.red);
        mainMenuButton.setFocusable(false);
        mainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == mainMenuButton) {
                    MainScreen s = new MainScreen();
                   s .mainScreen();
                    frame.dispose();
                }

            }
        });
        JButton favoriteListButton = new JButton();
        favoriteListButton.setBounds(405, 130, 180, 50);

        favoriteListButton.setText("FAVORITE");
        favoriteListButton.setFont(new Font("cooper black", Font.PLAIN, 20));
        favoriteListButton.setForeground(Color.white);
        favoriteListButton.setBackground(Color.red);
        favoriteListButton.setFocusable(false);
        favoriteListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if (e.getSource() == favoriteListButton) {

                Favorite favorite = new Favorite();
                if (list[0] > 0) {
                    JLabel banana = new JLabel(" Bananen" + "1 kg (ca. 5 stuks)" + "  " + "??? 1. 69 X " + list[0]);
                    ImageIcon banaIcon = new ImageIcon("banana.png");
                    banana.setIcon(banaIcon);
                    banana.setFont(new Font("cooper black", Font.PLAIN, 25));
                    banana.setForeground(Color.RED);
                    total = total + (price[0] * list[0]);
                    favorite.orderFavorite.add(banana);
                }
                if (list[1] > 0) {
                    JLabel tomato = new JLabel("1 the Best Roma tomatoes" + "6 pieces" + "???1. 99 X" + list[1]);
                    ImageIcon banaIcon = new ImageIcon("tomato.png");
                    tomato.setIcon(banaIcon);
                    tomato.setFont(new Font("cooper black", Font.PLAIN, 25));
                    tomato.setForeground(Color.RED);
                    total = total + (price[0] * list[0]);
                    favorite.orderFavorite.add(tomato);
                }
                if (list[2] > 0) {
                    JLabel mango = new JLabel("   " + "Big mango" + "per piece " + "???1. 79 X" + list[2]);
                    ImageIcon banaIcon = new ImageIcon("mango.png");
                    mango.setIcon(banaIcon);
                    mango.setFont(new Font("cooper black", Font.PLAIN, 25));
                    mango.setForeground(Color.red);
                    total = total + (price[2] * list[2]);
                    favorite.orderFavorite.add(mango);
                }
                if (list[3] > 0) {
                    JLabel strawberry = new JLabel("   " + "The best Strawberry" + "??? 3. 69 X" + list[3]);
                    ImageIcon banaIcon = new ImageIcon("strawberry.png");
                    strawberry.setIcon(banaIcon);
                    strawberry.setFont(new Font("cooper black", Font.PLAIN, 25));
                    strawberry.setForeground(Color.red);
                    total = total + (price[0] * list[0]);
                    favorite.orderFavorite.add(strawberry);
                }

                if (total > 0) {
                    JLabel tot = new JLabel("Total: " + total);
                    tot.setFont(new Font("cooper black", Font.BOLD, 25));
                    tot.setForeground(Color.red);
                    tot.setHorizontalTextPosition(JLabel.CENTER);

                    favorite.orderFavorite.add(tot, BorderLayout.SOUTH);
                }

                frame.dispose();

            }
        });

        JButton cartButton = new JButton();
        cartButton.setBounds(600, 130, 180, 50);

        cartButton.setText("MY CART");
        cartButton.setFont(new

                Font("cooper black", Font.PLAIN, 20));
        cartButton.setForeground(Color.white);
        cartButton.setBackground(Color.red);
        cartButton.setFocusable(false);
        //   ,
        ImageIcon bananaIcon = new ImageIcon("banana.png");
        JLabel bananaLabel = new JLabel();

        bananaLabel.setFont(new

                Font("cooper black", Font.PLAIN, 25));
        bananaLabel.setIcon(bananaIcon);
        bananaLabel.setText("   " +
                " Bananen" +
                "1 kg (ca. 5 stuks)\n" +
                "??? 1. 69");
        bananaLabel.setForeground(Color.red);
        bananaLabel.setBounds(20, 220, 900, 100);
        bananaLabel.setHorizontalAlignment(JLabel.LEFT);
        bananaLabel.setVerticalAlignment(JLabel.TOP);
        bananaLabel.setVerticalTextPosition(JLabel.CENTER);
        bananaLabel.setHorizontalTextPosition(JLabel.RIGHT);

        ImageIcon addIcon = new ImageIcon("addCart.png");
        JButton addButton = new JButton("", addIcon);
        addButton.setBounds(750, 240, 48, 48);
        addButton.setBackground(Color.white);
        addButton.setFocusable(false);

        ImageIcon favIcon = new ImageIcon("addFavorite.png");
        JButton addFavButton = new JButton("", favIcon);
        addFavButton.setBounds(692, 240, 48, 48);
        addFavButton.setBackground(Color.white);
        addFavButton.setFocusable(false);
        addFavButton.addActionListener(new

                                               ActionListener() {
                                                   @Override
                                                   public void actionPerformed(ActionEvent e) {
                                                       list[0]++;
                                                   }
                                               });

        frame.add(addFavButton);
        frame.add(addButton);


        frame.add(bananaLabel);


        ImageIcon tomatoIcon = new ImageIcon("tomato.png");
        JLabel tomatoLabel = new JLabel();

        tomatoLabel.setFont(new

                Font("cooper black", Font.PLAIN, 25));
        tomatoLabel.setIcon(tomatoIcon);
        tomatoLabel.setText("   " +
                "1 the Best Roma tomatoes" + "6 pieces" + "???1. 99");

        tomatoLabel.setForeground(Color.red);
        tomatoLabel.setBounds(20, 320, 900, 100);
        tomatoLabel.setHorizontalAlignment(JLabel.LEFT);
        tomatoLabel.setVerticalAlignment(JLabel.TOP);
        tomatoLabel.setVerticalTextPosition(JLabel.CENTER);
        tomatoLabel.setHorizontalTextPosition(JLabel.RIGHT);
        frame.add(tomatoLabel);

        ImageIcon addIcon1 = new ImageIcon("addCart.png");
        JButton addButton1 = new JButton("", addIcon1);
        addButton1.setBounds(750, 350, 48, 48);
        addButton1.setBackground(Color.white);
        addButton1.setFocusable(false);

        ImageIcon favIcon1 = new ImageIcon("addFavorite.png");
        JButton addFavButton1 = new JButton("", favIcon1);
        addFavButton1.setBounds(692, 350, 48, 48);
        addFavButton1.setBackground(Color.white);
        addFavButton1.setFocusable(false);
        addFavButton1.addActionListener(new

                                                ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        list[1]++;

                                                    }
                                                });

        frame.add(addFavButton1);
        frame.add(addButton1);

        ImageIcon mangoIcon = new ImageIcon("mango.png");
        JLabel mangoLabel = new JLabel();

        mangoLabel.setFont(new

                Font("cooper black", Font.PLAIN, 25));
        mangoLabel.setIcon(mangoIcon);
        mangoLabel.setText("   " + "Big mango" + "per piece " + "???1. 79");
        mangoLabel.setForeground(Color.red);
        mangoLabel.setBounds(20, 420, 900, 100);
        mangoLabel.setHorizontalAlignment(JLabel.LEFT);
        mangoLabel.setVerticalAlignment(JLabel.TOP);
        mangoLabel.setVerticalTextPosition(JLabel.CENTER);
        mangoLabel.setHorizontalTextPosition(JLabel.RIGHT);
        frame.add(mangoLabel);
        ImageIcon addIcon2 = new ImageIcon("addCart.png");
        JButton addButton2 = new JButton("", addIcon2);
        addButton2.setBounds(750, 460, 48, 48);
        addButton2.setBackground(Color.white);
        addButton2.setFocusable(false);

        ImageIcon favIcon2 = new ImageIcon("addFavorite.png");
        JButton addFavButton2 = new JButton("", favIcon2);
        addFavButton2.setBounds(692, 460, 48, 48);
        addFavButton2.setBackground(Color.white);
        addFavButton2.setFocusable(false);
        addFavButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list[2]++;
            }
        });

        frame.add(addFavButton2);
        frame.add(addButton2);


        ImageIcon strawberryIcon = new ImageIcon("strawberry.png");
        JLabel strawberryLabel = new JLabel();

        strawberryLabel.setFont(new

                Font("cooper black", Font.PLAIN, 25));
        strawberryLabel.setIcon(strawberryIcon);
        strawberryLabel.setText("   " +
                "The best Strawberry" +
                "??? 3. 69");
        strawberryLabel.setForeground(Color.red);
        strawberryLabel.setBounds(20, 520, 900, 100);
        strawberryLabel.setHorizontalAlignment(JLabel.LEFT);
        strawberryLabel.setVerticalAlignment(JLabel.TOP);
        strawberryLabel.setVerticalTextPosition(JLabel.CENTER);
        strawberryLabel.setHorizontalTextPosition(JLabel.RIGHT);
        frame.add(strawberryLabel);

        ImageIcon addIcon3 = new ImageIcon("addCart.png");
        JButton addButton3 = new JButton("", addIcon3);
        addButton3.setBounds(750, 560, 48, 48);
        addButton3.setBackground(Color.white);
        addButton3.setFocusable(false);

        ImageIcon favIcon3 = new ImageIcon("addFavorite.png");
        JButton addFavButton3 = new JButton("", favIcon3);
        addFavButton3.setBounds(692, 560, 48, 48);
        addFavButton3.setBackground(Color.white);
        addFavButton3.setFocusable(false);
        addFavButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list[3]++;
            }
        });

        frame.add(addFavButton3);
        frame.add(addButton3);

        ImageIcon broccoliIcon = new ImageIcon("brocoly.png");
        JLabel broccoliLabel = new JLabel();

        broccoliLabel.setFont(new

                Font("cooper black", Font.PLAIN, 25));
        broccoliLabel.setIcon(broccoliIcon);
        broccoliLabel.setText("   " + "Broccoli 1 kg (ca. 2 stuks)" +
                "??? 2.38");
        broccoliLabel.setForeground(Color.red);
        broccoliLabel.setBounds(20, 620, 900, 100);
        broccoliLabel.setHorizontalAlignment(JLabel.LEFT);
        broccoliLabel.setVerticalAlignment(JLabel.TOP);
        broccoliLabel.setVerticalTextPosition(JLabel.CENTER);
        broccoliLabel.setHorizontalTextPosition(JLabel.RIGHT);
        frame.add(broccoliLabel);

        ImageIcon addIcon4 = new ImageIcon("addCart.png");
        JButton addButton4 = new JButton("", addIcon4);
        addButton4.setBounds(750, 660, 48, 48);
        addButton4.setBackground(Color.white);
        addButton4.setFocusable(false);

        ImageIcon favIcon4 = new ImageIcon("addFavorite.png");
        JButton addFavButton4 = new JButton("", favIcon4);
        addFavButton4.setBounds(692, 660, 48, 48);
        addFavButton4.setBackground(Color.white);
        addFavButton4.setFocusable(false);

        frame.add(addFavButton4);
        frame.add(addButton4);

        ImageIcon radishIcon = new ImageIcon("radish.png");
        JLabel radishLabel = new JLabel();

        radishLabel.setFont(new

                Font("cooper black", Font.PLAIN, 25));
        radishLabel.setIcon(radishIcon);
        radishLabel.setText("   " + "The best Radish  per bunch" +
                "???0. 79 ");
        radishLabel.setForeground(Color.red);
        radishLabel.setBounds(20, 720, 900, 100);
        radishLabel.setHorizontalAlignment(JLabel.LEFT);
        radishLabel.setVerticalAlignment(JLabel.TOP);
        radishLabel.setVerticalTextPosition(JLabel.CENTER);
        radishLabel.setHorizontalTextPosition(JLabel.RIGHT);
        frame.add(radishLabel);

        ImageIcon addIcon5 = new ImageIcon("addCart.png");
        JButton addButton5 = new JButton("", addIcon5);
        addButton5.setBounds(750, 760, 48, 48);
        addButton5.setBackground(Color.white);
        addButton5.setFocusable(false);

        ImageIcon favIcon5 = new ImageIcon("addFavorite.png");
        JButton addFavButton5 = new JButton("", favIcon2);
        addFavButton5.setBounds(692, 760, 48, 48);
        addFavButton5.setBackground(Color.white);
        addFavButton5.setFocusable(false);

        frame.add(addFavButton5);
        frame.add(addButton5);


        frame.add(cartButton);
        frame.add(favoriteListButton);
        frame.add(mainMenuButton);
        frame.add(mainLabel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

