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

 public class AChart extends Lifefy{
		public static void main(String[] args){
		try
		{
			JDBCCategoryDataset dataset = new JDBCCategoryDataset(
				"jdbc:mysql://localhost:3306/personal_care", "com.mysql.jdbc.Driver",
				"root", "aditi12!");
			String query = "SELECT Date, Attitude_Score from rate_attitude where Username = 'Example.customer_username'";
		dataset.executeQuery(query);
		JFreeChart chart = ChartFactory.createLineChart("Attitude Score Chart", "Date", "Attitude Score",
			dataset, PlotOrientation.VERTICAL, true, true, false);
		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new java.awt.Dimension(1000, 1000));
		ApplicationFrame f = new ApplicationFrame("Chart");
		f.setContentPane(chartPanel);
		f.pack();
		f.setVisible(true);
	    }
	     catch (Exception ex)
	    {
            ex.printStackTrace(System.err);
	    }
	}