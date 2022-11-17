public class Main {
    public static void main(String[] args) {
        String firstName = " Ivan";
        String middleName = " Ivanovich";
        String lastName = " Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        /// Задача 2
        System.out.println(" Задача 2 ");
        String FullName1 = fullName.toUpperCase();
        System.out.println("Данный ФИО сотрудника для заполнения отчета - " + FullName1);
    }
}

