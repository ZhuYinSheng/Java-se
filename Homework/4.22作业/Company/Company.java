class Company {
	int count =0;
	Employee[] employeeList = new Employee[10];

	void add(Employee employee){
		employeeList[count++] = employee;
	}

	void delete(String name){
		for(int i = 0; i < count; i++){
			if(employeeList[i].name.equal(name)){
				for(int j = 0; j < count - 1; j++){
					employeeList[j] = employeeList[j + 1];
				}
				count--;
			}
		}
	}

	void printEmployeeSalary(String name){
		for(i = 0; i < count; i++){
			if(employeeList[i].name.equal(name)){
				System.out.println(name + "的员工工资为："+ employeeList);
			}
		}
	}