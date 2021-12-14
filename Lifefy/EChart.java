import java.sql.*;
import java.io.*;
import org.jfree.ui.*;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import java.awt.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.text.*;

 class EChart {
		EChart(){
		try
		{
			JDBCCategoryDataset dataset = new JDBCCategoryDataset(
				"jdbc:mysql://localhost:3306/money_management", "com.mysql.jdbc.Driver",
				"root", "SnigSql@7001");
			String query = "SELECT Paymentdate, Amount from e_bill where Username = '"+Example.cutomer_username+"';";
		dataset.executeQuery(query);
		JFreeChart chart = ChartFactory.createLineChart("Electricity Bill Chart", "Date", "Amount", dataset, PlotOrientation.VERTICAL, true, true, false);
		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new java.awt.Dimension(1000, 1000));
		ApplicationFrame f = new ApplicationFrame("Chart");
		f.setContentPane(chartPanel);
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //setLocationRelativeTo(null);
		f.pack();
		f.setVisible(true);
	    }
	     catch (Exception ex)
	    {
            ex.printStackTrace(System.err);
	    }
	}

}