package tests;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day_05JavaFaker {

/*
    TEST DATA : username, password, URL, test environment, city, ssn,...
            -Where do you get your test data?
            -BA-Business Analyst(Writes the acceptance criteria(AC))
            -Test Lead
            -Manual Tester
            -Tech Lead(Team Lead)
            -Developer
            -We can retrieve data from the database
            -We can retrieve data from API
            -Documentation. For example swagger doc can be used for API
           -If we need mock data(fake data), we can use the Java Faker
            -NOTE: Java Faker generates data randomly.
 */

    @Test
    public void javaFakerTest(){
//      1.Create  teh Faker object
     Faker faker  = new Faker();
//      2.Now That we have faker object we can generate the fake data generating username
     String firstName = faker.name().firstName();
        System.out.println(firstName);

//             last name
        String lastName = faker.name().lastName();
        System.out.println(lastName);

//       username
        String username = faker.name().username();
        System.out.println(username);

//    title
        String title = faker.name().title();
        System.out.println(title);

 //     city
        String city= faker.address().city();
        System.out.println(city);

 //      state
        String state = faker.address().state();
        System.out.println(state);

//    full address
        String fullAddress= faker.address().fullAddress();
        System.out.println(fullAddress);
//     cellphone
        String cellPhone= faker.phoneNumber().cellPhone();
        System.out.println(cellPhone);
//     email
        String emailAddress= faker.internet().emailAddress();
        System.out.println(emailAddress);

 //     zipcode
        String zipCode= faker.address().zipCode();
        System.out.println(zipCode);

//      random digit number
       String randomDigits =faker.number().digits(10);
        System.out.println(randomDigits);



    }

}