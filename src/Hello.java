import java.util.*;

public class Hello {
    public static void main(String[] args) {

        //SpeedConverter.toMilesPerHour(-5.6);
        // SpeedConverter.printConversion(1.5);
        //SumOddRange.isOdd(5);

//
//        Contacts contacts = new Contacts("Tushar","99292929292");
//        System.out.println( "name " + contacts.getName()  +" mobile " + contacts.getMobile());
//        Contacts contacts1 = new Contacts("Tusharjdjd","99292929292");
//        System.out.println( "name " + contacts1.getName()  +" mobile " + contacts1.getMobile());
//        if(contacts == contacts1)
//            System.out.println("objects refrences are equal");
//        else {
//            System.out.println("objects refrences are not  equal");equal

//       MySingleton newinstance =  MySingleton.getIntsance();
//       System.out.println("newinstance " + newinstance.toString());
//        MySingleton newinstance1 =  MySingleton.getIntsance();
//        System.out.println("newinstance1 " + newinstance1.toString());

//        Map m = new HashMap();
//        m.put(1,"Tushar");
//        m.put(2,"Ramesh");
//        m.put(3,"Suresh");
//        m.put(4,"John");John

//        Iterator itr = m.entrySet().iterator();
//        while(itr.hasNext())
//        {
//            Map.Entry map = (Map.Entry)itr.next();
//            int key = (int) map.getKey();
//            String values = (String)map.getValue();
//            System.out.println(" key " + key + " value " + values );
//        }
       // m.forEach((k,v) -> System.out.println( "key " + k + " value " + v ));
        //System.out.println("map " + m.get(1));
        //Map sortedEmployee = new TreeMap();
        //Set s = new HashSet();
        Comparator<Employee> sortbyFirstName = (Employee emp1 ,Employee emp2) -> emp1.getFirstName().
                compareTo(emp2.getFirstName());
        Comparator<Employee> sortbyLastName = (Employee emp1 ,Employee emp2) -> emp1.getLastName().
                compareTo(emp2.getLastName());
        Employee e = new Employee("Tushar" ,"Kulkarni");
        Employee e1 = new Employee("Abhishek" ,"Zharma");
        Employee e2 = new Employee("Tejas" ,"Mondla");
        List employeeList = new ArrayList();
        employeeList.add(e);
        employeeList.add(e1);
        employeeList.add(e2);
        Collections.sort(employeeList,sortbyFirstName);
        employeeList.forEach((k) -> System.out.println( "key " + k ));
        System.out.println( "----------------------------");
        Collections.sort(employeeList,sortbyLastName);
        employeeList.forEach((k) -> System.out.println( "key " + k ));


//        sortedEmployee.put(e);
//        sortedEmployee.put(e1);
//        sortedEmployee.put(e2);


      //  employeeList.forEach((k) -> System.out.println( "key " + k ));



    }
}
