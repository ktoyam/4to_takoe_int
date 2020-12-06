package pract24;

public class Person {
    final private String surname;
    private String name;
    private String patronymic;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getShortName(){
        StringBuilder sb = new StringBuilder(surname);
        if(!name.isBlank()){
            sb.append(' ');
            sb.append(name.charAt(0));
            sb.append('.');
            if(!patronymic.isBlank()){
                sb.append(patronymic.charAt(0));
                sb.append('.');
            }
        }
        return sb.toString();
    }

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
}
