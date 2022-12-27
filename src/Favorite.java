import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Favorite implements ActionListener {



    JPanel orderFavorite;

    public Favorite() {
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
        mainLabel.setText("WELCOME IN FAVORITE LIST ");
        ImageIcon main = new ImageIcon("heart.png");
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
        mainMenuButton.setBounds(230, 130, 180, 50);

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
        orderFavorite=new JPanel();
        orderFavorite.setBorder(new LineBorder(Color.red));
        orderFavorite.setBounds(10, 185, 865, 600);
        orderFavorite.setLayout(new GridLayout(7, 0));
        orderFavorite.setBackground(Color.white);
        frame.add(orderFavorite);
        JButton cartButton = new JButton();
        cartButton.setBounds(620, 130, 180, 50);

        cartButton.setText("MY CART");
        cartButton.setFont(new Font("cooper black", Font.PLAIN, 20));
        cartButton.setForeground(Color.white);
        cartButton.setBackground(Color.red);
        cartButton.setFocusable(false);
        cartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cartButton) {

                    Cart cart = new Cart();
                    frame.dispose();
                }
            }
        });
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.red);
        JMenu language = new JMenu();
        language.setHorizontalAlignment(JMenu.LEFT);
        language.setVerticalAlignment(JMenu.TOP);
        ImageIcon languageIcon = new ImageIcon("language.png");
        language.setIcon(languageIcon);
        language.setFont(new Font("Cooper black", Font.PLAIN, 20));
        language.setForeground(Color.white);

//


        frame.add(cartButton);
        frame.add(mainMenuButton);
        frame.add(mainLabel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

