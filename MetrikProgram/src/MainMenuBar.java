import java.awt.*;

public class MainMenuBar extends MenuBar {
	
	private Menu _menu;

	public MainMenuBar() {
        _menu = new Menu("Hintergrundfarbe-Programm");
        _menu.add(new MenuItem("Farbe: rot"));
        _menu.add(new MenuItem("Farbe: gelb"));
        _menu.add(new MenuItem("Farbe: gr�n"));
        _menu.addActionListener((event) -> System.exit(0));

        add(_menu);
    }
}
