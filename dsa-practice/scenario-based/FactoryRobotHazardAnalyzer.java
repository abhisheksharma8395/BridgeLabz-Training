import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Arm Precision (0.0 - 1.0) : ");
        double armPrecision = scanner.nextDouble();
        System.out.println("Enter Worker Density (1 - 20) : ");
        int workerDensity = scanner.nextInt();
        System.out.println("Enter Machinery State (Worn/Faulty/Critical) : ");
        String machineryState = scanner.next();
        try{
            System.out.printf("Robot Hazard Risk Score : %.1f",calculateHazardRisk(armPrecision, workerDensity, machineryState));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static double calculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException {
        if (!(armPrecision >= 0.0 && armPrecision <= 1.0)) {
            throw new RobotSafetyException("Error : Arm precision must be 0.0-1.0");
        } else if (!(workerDensity >= 1 && workerDensity <= 20)) {
            throw new RobotSafetyException("Error : Worker Density must be 1-20");
        } else if (!(machineryState.equals("Worn") || machineryState.equals("Faulty") || machineryState.equals("Critical"))) {
            throw new RobotSafetyException("Error : Unsupported machinery state");
        }
        double machineRiskFactor = 0.0;
        switch (machineryState) {
            case "Worn":
                machineRiskFactor = 1.3;
                break;
            case "Faulty":
                machineRiskFactor = 2.0;
                break;
            case "Critical":
                machineRiskFactor = 3.0;
                break;
        }
        return ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
    }
}

class RobotSafetyException extends Exception {
    public RobotSafetyException(String s) {
        super(s);
    }
}