//
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//
//
//public class LoginTest {
//     public int addition(int x,int y){
//    return x+y;
//    }
//
//    public String helloWorld(){
//    String helloWorld="Hello" + "World";
//    return helloWorld;
//
//   }
//
//    public LoginTest() {
//    }
//
//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    Login login;
//MyConnection connection;
//    @Before
//    public void setUp() {
//       login=new Login();
//       connection=new MyConnection();
//
//    }
//
//    @After
//    public void tearDown() {
//    }
//
//    @Test
//    public void testSomeMethod() {
//        assertEquals("Here is test for addition result:",30,addition(27,3));
//
//    }
//    @Test
//    public void testHelloWorld(){
//    assertEquals("Here is test for Hello World string:","HelloWorld",helloWorld());
//
//    }
//   @Test
//    public void testifConNotNull(){
//    assertNotNull(connection);
//
//    }
//
//    @Test
//    public void testifLoginNotnull(){
//    assertNotNull(login);
//
//    }
//
//}
