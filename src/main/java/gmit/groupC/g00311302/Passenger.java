package gmit.groupC.g00311302;
/*
    Student class
    Padraig Ó Cosgora
    G00311302
    21/02/2020
 */

public class Passenger {
    private String title;
    private String name;
    private int ID;
    private String phoneNumber;
    private int age;

    public Passenger() {
        this.title = "";
        this.name = "";
        this.ID = 0000;
        this.phoneNumber = "";
        this.age = 0000;
    }

    public Passenger(String title, String name, int ID, String phoneNumber, int age) {
        if ((title.toLowerCase().equals("mrs") || title.toLowerCase().equals("mr") || title.toLowerCase().equals("ms"))) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invalid title!");
        }
        if ((name.length() > 2)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name!");
        }
        if ((ID >= 1000000000)) {
            this.ID = ID;
        } else {
            throw new IllegalArgumentException("Invalid ID!");
        }
        if (phoneNumber.length() > 9) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Invalid phoneNumber!");
        }
        if (age >= 16) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age!");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if ((title.toLowerCase().equals("mrs") || title.toLowerCase().equals("mr") || title.toLowerCase().equals("ms"))) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invalid title!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name.length() > 2)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name entry!");
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if ((ID >= 1000000000)) {
            this.ID = ID;
        } else {
            throw new IllegalArgumentException("Invalid ID number!");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 9) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Invalid phone number length!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 16) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Passenger is too young too fly!");
        }
    }
}
