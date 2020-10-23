import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainWindow extends Frame implements WindowListener {
	
	public MainWindow() {
        setTitle("Metrik Version 1.0");
        setSize(500,500);

        addWindowListener(this);
        add(new DrawObject());
    }
	
	public void openWindow() {
        setVisible(true);
    }

	@Override
	public void windowOpened(WindowEvent e) {
	
	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose();
        System.exit(0);
	
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}
	
}
