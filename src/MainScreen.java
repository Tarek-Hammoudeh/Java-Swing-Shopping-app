import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainScreen implements ActionListener {
    public  void mainScreen() {
        Border mainBorder = BorderFactory.createLineBorder(Color.red, 2);
        JFrame frame = new JFrame();
        frame.setSize(900, 900);
        frame.setResizable(false);
        //frame.pack();
        frame.setTitle("PICIT");
        frame.getContentPane().setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("Maincorner.png");
        frame.setIconImage(icon.getImage());

        //MenuBar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.red);
        JMenu language = new JMenu();
        language.setHorizontalAlignment(JMenu.LEFT);
        language.setVerticalAlignment(JMenu.TOP);
        ImageIcon languageIcon = new ImageIcon("language.png");
        language.setIcon(languageIcon);
        language.setFont(new Font("Cooper black", Font.PLAIN, 20));
        language.setForeground(Color.white);

        JMenu cartFavoriteMenu = new JMenu();
        ImageIcon cartImage = new ImageIcon("cartfavorit.png");
        cartFavoriteMenu.setIcon(cartImage);
        cartFavoriteMenu.setFont(new Font("Cooper black", Font.PLAIN, 20));
        cartFavoriteMenu.setForeground(Color.white);

        JMenuItem cartItem = new JMenuItem("MY CART");
        JMenuItem favoriteItem = new JMenuItem("FAVORITE");
        cartItem.setBackground(Color.red);
        cartItem.setForeground(Color.white);
        cartItem.setFont(new Font("cooper black", Font.PLAIN, 20));
        cartItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cartItem) {
                    frame.dispose();
                    Cart cart = new Cart();
                }
            }
        });
        favoriteItem.setBackground(Color.red);
        favoriteItem.setForeground(Color.white);
        favoriteItem.setFont(new Font("cooper black", Font.PLAIN, 20));
        cartFavoriteMenu.add(cartItem);
        cartFavoriteMenu.add(favoriteItem);
        favoriteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == favoriteItem) {

                    Favorite favorite = new Favorite();
                    frame.dispose();
                }
            }
        });
        ResourceBundle bundle;
        bundle = ResourceBundle.getBundle("Language");

        JLabel mainLabel = new JLabel();
        JMenuItem english = new JMenuItem("ENGLISH");
        JMenuItem dutch = new JMenuItem("NEDERLANDS");
        english.setBackground(Color.red);
        english.setForeground(Color.white);
        english.setFont(new Font("cooper black", Font.PLAIN, 20));
        dutch.setBackground(Color.red);
        dutch.setForeground(Color.white);
        dutch.setFont(new Font("cooper black", Font.PLAIN, 20));
        dutch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ResourceBundle bundle;
                bundle = ResourceBundle.getBundle("Language");
                Locale.setDefault(new Locale("Dutch"));
                MainScreen s= new MainScreen();
                s.mainScreen();
                frame.dispose();
            }
        });

        english.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ResourceBundle bundle;
                bundle = ResourceBundle.getBundle("Language");
                Locale.setDefault(new Locale("English"));
                MainScreen s= new MainScreen();
                s.mainScreen();
                frame.dispose();
            }
        });

        language.add(english);
        language.add(dutch);
        menuBar.add(language);
        menuBar.add(cartFavoriteMenu);


        //Main label

        // mainLabel.setBorder(mainBorder);
        mainLabel.setText(bundle.getString("Menu01"));
        ImageIcon main = new ImageIcon("MainPhoto.png");
        mainLabel.setIcon(main);
        mainLabel.setHorizontalTextPosition(JLabel.CENTER);
        mainLabel.setVerticalTextPosition(JLabel.TOP);
        mainLabel.setHorizontalAlignment(JLabel.CENTER);
        mainLabel.setVerticalAlignment(JLabel.TOP);
        mainLabel.setForeground(Color.red);
        mainLabel.setFont(new Font("Cooper black", Font.PLAIN, 35));
        //FoodLabel
        JLabel foodLabel = new JLabel();
        ImageIcon productsIcon = new ImageIcon("grocerie.png");
        foodLabel.setIcon(productsIcon);
        foodLabel.setBounds(50, 400, 250, 250);
        //Drinks Label
        JLabel drinksLabel = new JLabel();
        ImageIcon cartIcon = new ImageIcon("drinks.png");
        drinksLabel.setIcon(cartIcon);
        drinksLabel.setBounds(370, 360, 168, 300);
        frame.add(drinksLabel);
        //other label
        JLabel otherLabeel = new JLabel();
        ImageIcon favoriteIcon = new ImageIcon("other.png");
        otherLabeel.setIcon(favoriteIcon);
        otherLabeel.setBounds(660, 360, 300, 300);
        //Food Button
        JButton foodButton = new JButton();
        foodButton.setFocusable(false);
        foodButton.setBounds(35, 660, 230, 75);
        foodButton.setText(bundle.getString("Menu02"));
        foodButton.setBackground(Color.red);
        foodButton.setForeground(Color.white);
        foodButton.setFont(new Font("cooper black", Font.PLAIN, 40));
        foodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == foodButton) {
                    frame.dispose();
                    Food food = new Food();
                }
            }
        });

        //DrinksButton
        JButton drinksButton = new JButton();
        drinksButton.setFocusable(false);
        drinksButton.setBounds(300, 660, 280, 75);
        drinksButton.setText(bundle.getString("Menu03"));
        drinksButton.setBackground(Color.red);
        drinksButton.setForeground(Color.white);
        drinksButton.setFont(new Font("Cooper black", Font.PLAIN, 40));
        drinksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == drinksButton) {
                    frame.dispose();
                    Drinks drinks = new Drinks();
                }
            }
        });

        //OtherButton
        JButton otherButton = new JButton();
        otherButton.setFocusable(false);
        otherButton.setBounds(620, 660, 230, 75);
        otherButton.setText(bundle.getString("Menu04"));
        otherButton.setBackground(Color.red);
        otherButton.setForeground(Color.white);
        otherButton.setFont(new Font("Cooper black", Font.PLAIN, 40));
        otherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == otherButton) {
                    frame.dispose();
                    Other other = new Other();
                }

            }
        });
        //add to Frame
        frame.setJMenuBar(menuBar);
        frame.add(otherButton);
        frame.add(drinksButton);
        frame.add(foodButton);
        frame.add(otherLabeel);
        frame.add(foodLabel);
        frame.add(mainLabel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


