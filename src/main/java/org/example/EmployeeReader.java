package org.example;

import java.io.*;


public class EmployeeReader {
    public static void main(String[] args) throws IOException {
//      Read employee data from file.
        try {
            FileReader fileReader = new FileReader("PayDataFile");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("Report.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            String input;
            printWriter.printf("Employee Gross Pay data.\n");

            while ((input = bufferedReader.readLine()) != null) {
                String[] subStrings = input.split("\\|");
                Employee e =
                        new Employee(subStrings[0], subStrings[1], Double.parseDouble(subStrings[2]), Double.parseDouble(subStrings[3]));
                System.out.printf("%s %40s $%.2f\n", e.getEmployeeId(), e.getEmployeeName(), e.getGrossPay());
                printWriter.printf("%s %40s $%.2f\n", e.getEmployeeId(), e.getEmployeeName(), e.getGrossPay());

            }
            printWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
