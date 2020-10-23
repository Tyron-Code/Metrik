import java.awt.*;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

public class DrawObject extends Canvas implements MouseListener {

	private int _x, _y;

    public DrawObject() {
        _x = _y = 0;
        
        setSize(500, 500);
        setBackground(Color.blue);
        addMouseListener(this);
}
    
    public void paint(Graphics g) {
        if (_x == 0 && _y == 0) return;
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2.5F));
        /** Ellipse2D ellipse2D = new Ellipse2D.Float(
                _x, _y,
                50, 50); */

        g2d.drawRect(_x, _y, 50, 50);
    
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		_x = e.getX();
        _y = e.getY();
        paint(getGraphics());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}