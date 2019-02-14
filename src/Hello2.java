import com.aware.plugin.template.IntentServices.ClusterLocation;
import com.aware.plugin.template.Visualisation.XYLineChart_AWT;
import org.jfree.ui.RefineryUtilities;

public class Hello2 {

    public static void main(String[] args) {

        String abc = "DBSCAN";
        ClusterLocation test = new ClusterLocation(abc, 3, 500, 1, 1, 1);
        test.onHandle();
        System.out.println("Done1");
        XYLineChart_AWT chart = new XYLineChart_AWT("Test", "Cluster analysis");
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
    }
}