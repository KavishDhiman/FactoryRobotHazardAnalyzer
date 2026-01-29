import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter Arm Precision (0.0 - 1.0):");
            double armPrecision = scanner.nextDouble();

            System.out.println("Enter Worker Density (1 - 20):");
            int workerDensity = scanner.nextInt();

            scanner.nextLine();
            System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
            String machineryState = scanner.nextLine();

            double hazardRisk = calculateHazardRisk(
                    armPrecision, workerDensity, machineryState
            );

            System.out.println("Robot Hazard Risk Score: " + hazardRisk);

        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculateHazardRisk(
            double armPrecision,
            int workerDensity,
            String machineryState
    ) throws RobotSafetyException {

        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException(
                    "Error: Arm precision must be 0.0-1.0"
            );
        }

        if (workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException(
                    "Error: Worker density must be 1-20"
            );
        }

        if (!machineryState.equals("Worn")
                && !machineryState.equals("Faulty")
                && !machineryState.equals("Critical")) {
            throw new RobotSafetyException(
                    "Error: Unsupported machinery state"
            );
        }

        return ((1.0 - armPrecision) * 15.0) + (workerDensity * 1.0);
    }
}
