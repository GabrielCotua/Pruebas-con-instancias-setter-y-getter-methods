class Main {
  public static void main(String[] args) {

    int gabriel = 128;
     while (gabriel > 0){

         System.out.println(gabriel%10);
         System.out.println(gabriel/10);
         gabriel= gabriel/10;
     }
        Persona P1 = new Persona("Gabriel" ,"Cotua" ,17, "qwerty");
        Persona P2 = new Persona("Alejandro", "Aguilera", 17, "1234");
        Persona P3 = new Persona();
    P3.setNewName("Diego");
    P3.setLastName("Cotua");
    P3.setAge(15);
 /**      P1.getName();
       P1.getLastName();
       P1.toStringAge();
       P1.setNewName("Gabriel");
       P1.getName();
       P1.setAge(17);
       P1.toStringAge();
    P1.setLastName("Cotua");
    P1.getLastName();*/
/**    System.out.println("Name: " + P1.getName());
*    System.out.println("Last nmae: " + P1.getLastName());
*    System.out.println("Is " + P1.getAge() + " years old");
*/
    P1.toStringCredentials();
    System.out.println(" ");
    P2.toStringCredentials();
    System.out.println(" ");
    P3.toStringCredentials();
  }
}
class Persona{
   private String name;
   private String lastName;
   private int age;
  private String password;

  public  Persona(){//crea una instancia de persona con valores predeterminados
    
    name = " ";
    lastName = " ";
    age = 0;
    password = "Password1234";
  }
  public  Persona(String initName, String initLastName,
                      int initAge, String initPassword){//crea una instancia persona
    name = initName;
    lastName = initLastName;
    age = initAge;
    password = initPassword;
  }
  public void setNewName(String NewName){//cambia el nombre de la instancia persona
    name = NewName;
  }
  public void setLastName(String NewLastName){// cambia el apellido de la instancia persona
  lastName = NewLastName;
  }
  public void setAge(int newAge){//cambia la edad de la instancioa persona
    age = newAge;
  }
  public void setPassword(String newPassword){
    password = newPassword;
  }
  public String getName(){//muestra el nombre de la instancia persona
    return name;
  }
  public String getLastName(){//muestra el apellido de la instancion persona
    return lastName;
  }
  public int getAge(){//muestra la edad de la instancia persona
    return age;
  }
  public String getPassword(){//muestra el password de la instancia persona
    return password;
  }
    public void toStringCredentials(){//muestra los datos recolectados por el usuario
    System.out.println("Name: " + getName());
    System.out.println("Last nmae: " + getLastName());
    System.out.println("Is " + getAge() + " years old");
    System.out.println("Password: " + getPassword());
    }
  
}