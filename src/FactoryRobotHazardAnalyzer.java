import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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

        if (hazardRisk != -1) {
            System.out.println("Robot Hazard Risk Score: " + hazardRisk);
        }
    }

    public static double calculateHazardRisk(
            double armPrecision,
            int workerDensity,
            String machineryState
    ) {

        if (armPrecision < 0.0 || armPrecision > 1.0) {
            System.out.println("Error: Arm precision must be 0.0-1.0");
            return -1;
        }

        if (workerDensity < 1 || workerDensity > 20) {
            System.out.println("Error: Worker density must be 1-20");
            return -1;
        }

        if (!machineryState.equals("Worn")
                && !machineryState.equals("Faulty")
                && !machineryState.equals("Critical")) {
            System.out.println("Error: Unsupported machinery state");
            return -1;
        }

        return ((1.0 - armPrecision) * 15.0) + (workerDensity * 1.0);
    }
}
