class Employee implements Person{

    private String name;
    private String surname;
    private int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public void getInfo() {
        int retirementAge = 65;
        int yearsToRetirement = retirementAge - age;

        if (yearsToRetirement <= 0) {
            System.out.println(name + " " + surname + " is already retired.");
        } else {
            System.out.println(name + " " + surname + ", years until retirement: " + yearsToRetirement);
        }
    }

}
