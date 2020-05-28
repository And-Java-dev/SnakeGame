import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new GameField());
        setSize(320,345);
        setLocation(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }
}
