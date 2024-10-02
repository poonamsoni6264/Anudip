package calculator;

class CountryNotValidException extends Exception 
{
    public CountryNotValidException(String message) 
    {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception 
{
    public EmployeeNameInvalidException(String message) 
    {
        super(message);
    }
}

class TaxNotEligibleException extends Exception 
{
    public TaxNotEligibleException(String message) 
    {
        super(message);
    }
}

class TaxCalculator 
{

    public double calculateTax(String empName, boolean isIndian, double empSal) 
        throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        
        // Validate employee name
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }
        
        // Validate country
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }

        // Tax calculation based on salary
        if (empSal > 100000) {
            return empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000) {
            return empSal * 6 / 100;
        } else if (empSal >= 30000 && empSal < 50000) {
            return empSal * 5 / 100;
        } else if (empSal >= 10000 && empSal < 30000) {
            return empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }
    }
}

public class CalculatorSimulator {

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        
        // Test Case 1
        try {
            double tax = calculator.calculateTax("Ron", false, 34000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException e) {
            System.out.println("The employee should be an Indian citizen for calculating tax.");
        } catch (EmployeeNameInvalidException e) {
            System.out.println("The employee name cannot be empty.");
        } catch (TaxNotEligibleException e) {
            System.out.println("The employee does not need to pay tax.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Test Case 2
        try {
            double tax = calculator.calculateTax("Tim", true, 1000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException e) {
            System.out.println("The employee should be an Indian citizen for calculating tax.");
        } catch (EmployeeNameInvalidException e) {
            System.out.println("The employee name cannot be empty.");
        } catch (TaxNotEligibleException e) {
            System.out.println("The employee does not need to pay tax.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Test Case 3
        try {
            double tax = calculator.calculateTax("Jack", true, 55000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException e) {
            System.out.println("The employee should be an Indian citizen for calculating tax.");
        } catch (EmployeeNameInvalidException e) {
            System.out.println("The employee name cannot be empty.");
        } catch (TaxNotEligibleException e) {
            System.out.println("The employee does not need to pay tax.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Test Case 4
        try {
            double tax = calculator.calculateTax("", true, 30000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException e) {
            System.out.println("The employee should be an Indian citizen for calculating tax.");
        } catch (EmployeeNameInvalidException e) {
            System.out.println("The employee name cannot be empty.");
        } catch (TaxNotEligibleException e) {
            System.out.println("The employee does not need to pay tax.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

