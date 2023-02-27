package libraryClasses;

/**
 * 
 *      +--------------------------+
 *      |                          |
 *      |  @author BenjaminFisico! |
 *      |                          |
 *      +--------------------------+
 * 
 *  This class contains all members attributes.
 * 
 **/

public class Member {
       private String file,name,surname,Address,Tel1,Tel2;
       private int Dni,Age;

    // Empty constructor.
    public Member() {
    }
    
    //constructor with all attributes
    public Member(String file,String name, String surname, String Address, String Tel1, String Tel2, int Dni, int Age) {
        this.name = name;
        this.surname = surname;
        this.Address = Address;
        this.Tel1 = Tel1;
        this.Tel2 = Tel2;
        this.Dni = Dni;
        this.Age = Age;
        this.file = file;
    }
    
    // --- Getters & setters ---
    
    public String getFile(){
        return file;
    }
    
    public void setFile(String file){
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getTel1() {
        return Tel1;
    }

    public void setTel1(String Tel1) {
        this.Tel1 = Tel1;
    }

    public String getTel2() {
        return Tel2;
    }

    public void setTel2(String Tel2) {
        this.Tel2 = Tel2;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
}
