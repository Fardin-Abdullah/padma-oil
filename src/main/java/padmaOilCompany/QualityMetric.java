package padmaOilCompany;

import java.time.LocalDate;
import java.util.ArrayList;

public class QualityMetric {
    private String metricID;
    private LocalDate Time;
    private ArrayList<String>QualityMatricData;

    public QualityMetric() {
    }

    public QualityMetric(String metricID, LocalDate time, ArrayList<String> qualityMatricData) {
        this.metricID = metricID;
        Time = time;
        QualityMatricData = qualityMatricData;
    }

    public String getMetricID() {
        return metricID;
    }

    public void setMetricID(String metricID) {
        this.metricID = metricID;
    }

    public LocalDate getTime() {
        return Time;
    }

    public void setTime(LocalDate time) {
        Time = time;
    }

    public ArrayList<String> getQualityMatricData() {
        return QualityMatricData;
    }

    public void setQualityMatricData(ArrayList<String> qualityMatricData) {
        QualityMatricData = qualityMatricData;
    }

    @Override
    public String toString() {
        return "QualityMetric{" +
                "metricID='" + metricID + '\'' +
                ", Time=" + Time +
                ", QualityMatricData=" + QualityMatricData +
                '}';
    }
}
