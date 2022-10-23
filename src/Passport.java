public class Passport {
    private  int number;
    private String name;
    private String sername;
    private int date;
    private String patronymic;

    public Passport(int number, String name, String sername, int date, String patronymic) {
        this.number = number;
        this.name = name;
        this.sername = sername;
        this.date = date;
        this.patronymic = patronymic;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSername() {
        return sername;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDate() {
        return date;
    }

    public String getPatronymic() {
        return patronymic;
    }

}
