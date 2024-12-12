import java.sql.SQLOutput;

public class Student {
    private String name;
    private String surname;
    private String address;
    private int id;

    public Student(String name, String surname, String address, int id){
        this.name=name;
        this.surname=surname;
        this.address=address;
        this.id=id;
    }

    public String toString (){
        return "ID: "+id+", Name: "+name+", Surname: "+surname+", Address: "+address+".";
    }

}

