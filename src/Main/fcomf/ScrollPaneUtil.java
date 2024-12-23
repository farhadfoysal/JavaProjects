package Main.fcomf;

import java.awt.Adjustable;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;



public class ScrollPaneUtil {

	public static void scrollToBottom(JScrollPane scrollPane) 
	{
	    final JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
	    AdjustmentListener downScroller = new AdjustmentListener() 
	    {
	        public void adjustmentValueChanged(AdjustmentEvent e) 
	        {
	            Adjustable adjustable = e.getAdjustable();
	            adjustable.setValue(adjustable.getMaximum());
	            verticalBar.removeAdjustmentListener(this);
	        }
	    };
	    verticalBar.addAdjustmentListener(downScroller);
	}
}
