
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Other {


    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");


    Other(){
        Border mainBorder = BorderFactory.createLineBorder(Color.red,3);
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
        mainLabel.setText("WELCOME IN THE OTHER LIST ");
        ImageIcon main = new ImageIcon("other.png");
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
                    frame.dispose();
                    MainScreen s = new MainScreen();
                    s.mainScreen();
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
                if (e.getSource() == favoriteListButton) {
                    frame.dispose();
                    Favorite favorite= new Favorite();
                }
            }
        });

        JButton cartButton = new JButton();
        cartButton.setBounds(600, 130, 180, 50);

        cartButton.setText("MY CART");
        cartButton.setFont(new Font("cooper black", Font.PLAIN, 20));
        cartButton.setForeground(Color.white);
        cartButton.setBackground(Color.red);
        cartButton.setFocusable(false);
        cartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cartButton) {
                    frame.dispose();
                    Cart cart = new Cart();
                }
            }
        });


        ImageIcon bananaIcon = new ImageIcon("persil.png");
        JLabel bananaLabel = new JLabel();

        bananaLabel.setFont(new Font("cooper black", Font.BOLD, 20));
        bananaLabel.setIcon(bananaIcon);
        bananaLabel.setText("   "+
                " Bananen" +
                "1 kg (ca. 5 stuks)\n" +
                "€ 1. 69");
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

        frame.add(addFavButton);
        frame.add(addButton);


        frame.add(bananaLabel);


        ImageIcon tomatoIcon = new ImageIcon("glass.png");
        JLabel tomatoLabel = new JLabel();

        tomatoLabel.setFont(new Font("cooper black", Font.BOLD, 20));
        tomatoLabel.setIcon(tomatoIcon);
        tomatoLabel.setText("   "+
                "Multi cleaning spray" + "  750ML"+ "€2. 65");

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

        frame.add(addFavButton1);
        frame.add(addButton1);

        ImageIcon mangoIcon = new ImageIcon("toilet.png");
        JLabel mangoLabel = new JLabel();

        mangoLabel.setFont(new Font("cooper black", Font.BOLD, 20));
        mangoLabel.setIcon(mangoIcon);
        mangoLabel.setText("   "+"Toilet paper " + "16 roll " + "€2. 99");
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

        frame.add(addFavButton2);
        frame.add(addButton2);


        ImageIcon strawberryIcon = new ImageIcon("mr.png");
        JLabel strawberryLabel = new JLabel();

        strawberryLabel.setFont(new Font("cooper black", Font.BOLD, 20));
        strawberryLabel.setIcon(strawberryIcon);
        strawberryLabel.setText("   "+
                "Anti clog 500 ML " +
                "€ 2. 39");
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

        ImageIcon favIcon3= new ImageIcon("addFavorite.png");
        JButton addFavButton3 = new JButton("", favIcon3);
        addFavButton3.setBounds(692, 560, 48, 48);
        addFavButton3.setBackground(Color.white);
        addFavButton3.setFocusable(false);

        frame.add(addFavButton3);
        frame.add(addButton3);

        ImageIcon broccoliIcon = new ImageIcon("dreft.png");
        JLabel broccoliLabel = new JLabel();

        broccoliLabel.setFont(new Font("cooper black", Font.BOLD, 20));
        broccoliLabel.setIcon(broccoliIcon);
        broccoliLabel.setText("   "+"Washing liquid 450 ML" +
                "€ 2.99");
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

        ImageIcon radishIcon = new ImageIcon("tissues.png");
        JLabel radishLabel = new JLabel();

        radishLabel.setFont(new Font("cooper black", Font.BOLD, 20));
        radishLabel.setIcon(radishIcon);
        radishLabel.setText("   "+"The best Cleaning wipes" +"65 piece"+
                "€0. 79 ");
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
}

