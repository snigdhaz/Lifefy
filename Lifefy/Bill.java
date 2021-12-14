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

class HChart {
        HChart(){
        try
        {
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(
                "jdbc:mysql://localhost:3306/personal_care", "com.mysql.jdbc.Driver",
                "root", "SnigSql@7001");
            String query = "SELECT Date, Health_Score from rate_health where Username = '"+Example.cutomer_username+"';";
        dataset.executeQuery(query);
        JFreeChart chart = ChartFactory.createLineChart("Health Score Chart", "Date", "Health Score",
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
    

}

class AChart {
        AChart(){
        try
        {
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(
                "jdbc:mysql://localhost:3306/personal_care", "com.mysql.jdbc.Driver",
                "root", "SnigSql@7001");
            String query = "SELECT Date, Attitude_Score from rate_attitude where Username = '"+Example.cutomer_username+"';";
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
}

class WChart {
        WChart(){
        try
        {
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(
                "jdbc:mysql://localhost:3306/money_management", "com.mysql.jdbc.Driver",
                "root", "SnigSql@7001");
            String query = "SELECT Paymentdate, Amount from water_bill where Username = '"+Example.cutomer_username+"';";
        dataset.executeQuery(query);
        JFreeChart chart = ChartFactory.createLineChart("Water Bill Chart", "Date", "Amount",dataset, PlotOrientation.VERTICAL, true, true, false);
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

}
