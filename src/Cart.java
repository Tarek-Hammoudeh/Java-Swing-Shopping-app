import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cart implements ActionListener {




    public Cart() {
        Border mainBorder = BorderFactory.createLineBorder(Color.red, 3);
        JFrame frame = new JFrame();

        frame.setSize(900, 900);
        frame.setResizable(false);
        frame.setTitle("PICIT");
        frame.getContentPane().setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("Maincorner.png");
        frame.setIconImage(icon.getImage());


        JPanel orderCart=new JPanel();
        orderCart.setBorder(new LineBorder(Color.red));
        orderCart.setBounds(10, 185, 865, 600);
        orderCart.setLayout(new GridLayout(7, 0));
        orderCart.setBackground(Color.white);
        frame.add(orderCart);
        //Main label
        JLabel mainLabel = new JLabel();
        mainLabel.setBorder(mainBorder);
        mainLabel.setText("WELCOME IN SHOPPING CART ");
        ImageIcon main = new ImageIcon("cart.png");
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
        mainMenuButton.setBounds(230, 140, 180, 50);

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
                  s  .mainScreen();
                }

            }
        });
        JButton favoriteListButton = new JButton();
        favoriteListButton.setBounds(620, 140, 180, 50);

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
                    Favorite favorite = new Favorite();
                }
            }
        });

        JList cartList = new JList();
        cartList.add(mainMenuButton);
        cartList.setLayout(new GridLayout(4, 2));
        cartList.setToolTipText("MY LIST");
        cartList.setVisible(true);
        cartList.setForeground(Color.red);
        cartList.setBorder(new LineBorder(Color.red));
        cartList.setBounds(8, 250, 870, 450);
        frame.add(cartList);
        frame.add(favoriteListButton);
        frame.add(mainMenuButton);
        frame.add(mainLabel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
