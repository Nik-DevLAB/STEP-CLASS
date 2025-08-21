import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static String[][] computeBMIData(double[][] hwData) {
        String[][] results = new String[hwData.length][4];
        for (int i = 0; i < hwData.length; i++) {
            double weight = hwData[i][0];
            double height = hwData[i][1];
            double bmi = calculateBMI(weight, height);
            results[i][0] = String.format("%.2f", height);
            results[i][1] = String.format("%.2f", weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = getBMIStatus(bmi);
        }
        return results;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hwData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) of person " + (i + 1) + ": ");
            hwData[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) of person " + (i + 1) + ": ");
            hwData[i][1] = sc.nextDouble();
        }
        String[][] results = computeBMIData(hwData);
        displayTable(results);
        sc.close();
    }
}
