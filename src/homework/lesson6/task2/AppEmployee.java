package homework.lesson6.task2;

public class AppEmployee {

	public static void sortDescSalay(Employee[] arrInt) {
		Employee tmp;
		for (int i = 0; i < arrInt.length - 1; i++) {
			for (int j = i + 1; j < arrInt.length; j++) {
				if (arrInt[i].calculatePay() <= arrInt[j].calculatePay()) {
					tmp = arrInt[i];
					arrInt[i] = arrInt[j];
					arrInt[j] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Employee[] arrEmp = { new SalariedEmployee("1258", "Jhon", "3345610578", 1250),
				new SalariedEmployee("987", "Carl", "6557856874", 1500),
				new ContractEmployee("1756", "Julia", "6895743204", 12.50, 168),
				new SalariedEmployee("2105", "Hulio", "6589743210", 1800),
				new ContractEmployee("1755", "Pola", "2013587496", 8.50, 160),
				new ContractEmployee("82", "Anton", "3025498307", 12.00, 168),
				new ContractEmployee("998", "Victor", "4035695573", 23.00, 180) };

		sortDescSalay(arrEmp);
		for (Employee emp: arrEmp) {
			System.out.println(emp.toString());
		}
	}

}
