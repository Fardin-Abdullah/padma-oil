package padmaOilCompany;

import java.util.ArrayList;

public class Equipment {
    private String equipmentID;
    private String equipmentName;
    private ArrayList<String> calibrationLog;

    public Equipment() {
    }

    public Equipment(String equipmentID, String equipmentName, ArrayList<String> calibrationLog) {
        this.equipmentID = equipmentID;
        this.equipmentName = equipmentName;
        this.calibrationLog = calibrationLog;
    }

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public ArrayList<String> getCalibrationLog() {
        return calibrationLog;
    }

    public void setCalibrationLog(ArrayList<String> calibrationLog) {
        this.calibrationLog = calibrationLog;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipmentID='" + equipmentID + '\'' +
                ", equipmentName='" + equipmentName + '\'' +
                ", calibrationLog=" + calibrationLog +
                '}';
    }
}
