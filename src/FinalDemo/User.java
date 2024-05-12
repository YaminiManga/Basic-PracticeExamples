package FinalDemo;

public class User {
    public int id;
    public String name;
    public final String collegeName="Sasi Institue of Technology and Engineering";
   public User(int id, String name)//, String collegeName)
   {
       this.id=id;
      this.name=name;
      //this.collegeName=collegeName;//will error out because collegeName we declared as final and we cant change its value

   }

    public final void displayUser()
   {
       System.out.println("Hello User");
   }
}
//Methods and properties, varible names should be camel case
//For class,Interface, Enums or any type pascal case-camelcase+firstletterCAPS
//Snake case- Which we use for any constants or any filename-COLLEGE_NAME

